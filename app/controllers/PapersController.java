package controllers;

import models.Paper;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import views.html.*;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

public class PapersController extends Controller{
    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;

    @Inject
    public PapersController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result index(){
        return ok(views.html.bootMain.render("note: only input one search query"));
    }

    public CompletionStage<Result> searchHandler() {
        Form<Paper> searchForm = formFactory.form(Paper.class).bindFromRequest();

        if (searchForm.hasErrors()) {
            return (CompletionStage<Result>) badRequest(views.html.bootMain.render("invalid search..."));  // send parameter like register so that user could know
        }
        return searchForm.get().checkAuthorized().thenApplyAsync((WSResponse response) ->{
            if(response.getStatus() == 200 && response.asJson() != null && response.asJson().asBoolean()){
                System.out.println(response.asJson());
                session("title", searchForm.get().getTitle());
                session("author", searchForm.get().getAuthor());
                return ok("here is ur data...");
            }else{
                System.out.println("response null");
                String message = "invalid input";
                return badRequest(views.html.main.render(message));
            }
        }, ec.current());
    }

}
