package controllers;
import com.fasterxml.jackson.databind.JsonNode;
import models.Author;
import models.Paper;
import models.User;
import play.libs.Json;
import play.mvc.*;

import java.util.ArrayList;
import java.util.List;


public class PaperController extends Controller{


    public Result getByTitle(String title){
//        JsonNode req = request().body().asJson();
//        String title = req.get("title").asText();
        try {
            Paper paper = Paper.getByTitle(title); // ( match where username and password both match )
            if(paper!=null){
                JsonNode jsonResult = Json.toJson(paper);
                return ok(jsonResult);
            }else{
                return ok("false");
            }
        }
        catch (Exception e) {
            return ok("false");
        }
    }

    public Result getByYear(String year){
        try {
            List<Paper> paperlist = Paper.getByYear(year); // ( match where username and password both match )
            if(paperlist!=null){
                JsonNode jsonResult = Json.toJson(paperlist);
                return ok(jsonResult);
            }else{
                return ok("false");
            }
        }
        catch (Exception e) {
            return ok("false");
        }
    }

    public Result getByAuthorName(String name){
        System.out.println("controller:" + name);
        try {
            List<Author> authorlist = Author.getByName(name); // ( match where username and password both match )
            List<Paper> paperlist = new ArrayList<>();
            if(authorlist!=null){
                for(Author a : authorlist){
                    paperlist.addAll(a.getPapers());
                }
                JsonNode jsonResult = Json.toJson(paperlist);
                return ok(jsonResult);
            }else{
                return ok("false");
            }
        }
        catch (Exception e) {
            return ok("false");
        }
    }


}
