
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

object bootMain extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),_display_(/*2.2*/bootLayout("Linked Papers")/*2.29*/{_display_(Seq[Any](format.raw/*2.30*/("""

    """),format.raw/*4.5*/("""<h5>Search Engine</h5>
    <p>"""),_display_(/*5.9*/message),format.raw/*5.16*/("""</p>

    <form action="routes.PapersController.searchHandler()" method="GET">
        <div class="row">
            <div class="input-field col-md-5">
                <label for="title">Title</label>
                <input id="title" name="title" type="text">
            </div>
            <div class="input-field col-md-5 offset-2">
                <label for="author">Author</label>
                <input id="author" name="author" type="text">
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <label for="chemistry">Chemistry</label>
                <input id="chemistry" name="chemistry" type="checkbox">
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <label for="biology">Biology</label>
                <input id="biology" name="biology" type="checkbox">
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <label for="physics">Physics</label>
                <input id="physics" name="physics" type="checkbox">
            </div>
        </div>
        <div class="row">
            <a type="button" href="bootResults.scala.html" class="btn btn-info m-3">Submit</a>
        </div>
    </form>
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
                  DATE: 2022-04-28T11:54:29.629
                  SOURCE: C:/Users/kiots/Documents/software/Frontend/app/views/bootMain.scala.html
                  HASH: e92a5db6a60e273181cda1c8d4757648b65e2c91
                  MATRIX: 951->1|1063->18|1091->21|1126->48|1164->49|1198->57|1255->89|1282->96
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|37->5|37->5
                  -- GENERATED --
              */
          