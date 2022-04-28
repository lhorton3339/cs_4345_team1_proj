
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),_display_(/*2.2*/layout("Linked Papers")/*2.25*/{_display_(Seq[Any](format.raw/*2.26*/("""
    """),format.raw/*3.5*/("""<h1 class="focused" style="font-size: 24px;
        color: #3F51B5">
        <strong>Search Input</strong>
    </h1>
    <div class="card-panel">
        <form action="routes.PapersController.searchHandler()" method="GET">
            <div class="row">
                <div class="input-field col s12">
                    <input id="title" name="title" type="text">
                    <label for="title">Title</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s12">
                    <input id="author" name="author" type="text">
                    <label for="author">Author</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s12">
                    <input id="subject" name="subject" type="checkbox">
                    <label for="subject">Subject</label>
                </div>
            </div>
            <div class="row">
                <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
            </div>
        </form>
    </div>
""")))}))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-28T09:53:13.079
                  SOURCE: C:/Users/kiots/Documents/software/Frontend/app/views/main.scala.html
                  HASH: fc9ad95d58e75490581bd068eb3535b42de23c25
                  MATRIX: 947->1|1059->18|1087->21|1118->44|1156->45|1188->51
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3
                  -- GENERATED --
              */
          