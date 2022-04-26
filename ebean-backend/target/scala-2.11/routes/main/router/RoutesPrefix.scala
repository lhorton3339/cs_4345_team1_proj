
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/laure/Desktop/Lab-2-Ebean/team1_proj/ebean-backend/conf/routes
// @DATE:Mon Apr 25 23:07:54 CDT 2022


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
