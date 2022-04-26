
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/laure/Desktop/Lab-2-Ebean/team1_proj/ebean-backend/conf/routes
// @DATE:Mon Apr 25 22:56:07 CDT 2022

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  UserController_1: controllers.UserController,
  // @LINE:16
  PaperController_2: controllers.PaperController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    UserController_1: controllers.UserController,
    // @LINE:16
    PaperController_2: controllers.PaperController
  ) = this(errorHandler, HomeController_0, UserController_1, PaperController_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, UserController_1, PaperController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.authenticate()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.UserController.registerNew()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getPaperByTitle""", """controllers.PaperController.getByTitle(title:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getPaperByYear""", """controllers.PaperController.getByYear(year:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getPaperByAuthorName""", """controllers.PaperController.getByAuthorName(name:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_authenticate1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_authenticate1_invoker = createInvoker(
    UserController_1.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "authenticate",
      Nil,
      "POST",
      """Login""",
      this.prefix + """login"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_registerNew2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_UserController_registerNew2_invoker = createInvoker(
    UserController_1.registerNew(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "registerNew",
      Nil,
      "POST",
      """ Add User  {"name":name, "password":password}""",
      this.prefix + """signup"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_PaperController_getByTitle3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getPaperByTitle")))
  )
  private[this] lazy val controllers_PaperController_getByTitle3_invoker = createInvoker(
    PaperController_2.getByTitle(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "getByTitle",
      Seq(classOf[String]),
      "GET",
      """ get papers by title""",
      this.prefix + """getPaperByTitle"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_PaperController_getByYear4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getPaperByYear")))
  )
  private[this] lazy val controllers_PaperController_getByYear4_invoker = createInvoker(
    PaperController_2.getByYear(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "getByYear",
      Seq(classOf[String]),
      "GET",
      """ get papers by year""",
      this.prefix + """getPaperByYear"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_PaperController_getByAuthorName5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getPaperByAuthorName")))
  )
  private[this] lazy val controllers_PaperController_getByAuthorName5_invoker = createInvoker(
    PaperController_2.getByAuthorName(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "getByAuthorName",
      Seq(classOf[String]),
      "GET",
      """ get by Author Name""",
      this.prefix + """getPaperByAuthorName"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_UserController_authenticate1_route(params) =>
      call { 
        controllers_UserController_authenticate1_invoker.call(UserController_1.authenticate())
      }
  
    // @LINE:13
    case controllers_UserController_registerNew2_route(params) =>
      call { 
        controllers_UserController_registerNew2_invoker.call(UserController_1.registerNew())
      }
  
    // @LINE:16
    case controllers_PaperController_getByTitle3_route(params) =>
      call(params.fromQuery[String]("title", None)) { (title) =>
        controllers_PaperController_getByTitle3_invoker.call(PaperController_2.getByTitle(title))
      }
  
    // @LINE:19
    case controllers_PaperController_getByYear4_route(params) =>
      call(params.fromQuery[String]("year", None)) { (year) =>
        controllers_PaperController_getByYear4_invoker.call(PaperController_2.getByYear(year))
      }
  
    // @LINE:22
    case controllers_PaperController_getByAuthorName5_route(params) =>
      call(params.fromQuery[String]("name", None)) { (name) =>
        controllers_PaperController_getByAuthorName5_invoker.call(PaperController_2.getByAuthorName(name))
      }
  }
}
