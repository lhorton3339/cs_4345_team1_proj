// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/kiots/Documents/software/Frontend/conf/routes
// @DATE:Thu Apr 28 10:18:49 CDT 2022


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
