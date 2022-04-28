
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

object bootLayout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href=""""),_display_(/*7.39*/routes/*7.45*/.Assets.at("stylesheets/boot4.6.css")),format.raw/*7.82*/("""">
        <link rel="stylesheet" href=""""),_display_(/*8.39*/routes/*8.45*/.Assets.at("stylesheets/background.css")),format.raw/*8.85*/("""">
    </head>
    <body>
        <main role="main">
            <div class="container">
                <div class="jumbotron">
                    <h1 class="display-4">"""),_display_(/*14.44*/title),format.raw/*14.49*/("""</h1>
                    <p class="lead">Welcome to Linked Pages</p>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <img src=""""),_display_(/*19.36*/routes/*19.42*/.Assets.at("images/school_logo.png")),format.raw/*19.78*/("""" class="rounded">
                    </div>
                    <div class="col-md-6">
                        """),_display_(/*22.26*/content),format.raw/*22.33*/("""
                    """),format.raw/*23.21*/("""</div>
                </div>
            </div>
        </main>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-28T11:09:51.946
                  SOURCE: C:/Users/kiots/Documents/software/Frontend/app/views/bootLayout.scala.html
                  HASH: 5dc1dba704a0e3d2348e6a4ee3148bd555657137
                  MATRIX: 958->1|1083->31|1111->33|1340->236|1354->242|1411->279|1479->321|1493->327|1553->367|1758->545|1784->550|2021->760|2036->766|2093->802|2237->919|2265->926|2315->948
                  LINES: 28->1|33->1|34->2|39->7|39->7|39->7|40->8|40->8|40->8|46->14|46->14|51->19|51->19|51->19|54->22|54->22|55->23
                  -- GENERATED --
              */
          