
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/sensh/Downloads/play-2.4-app-fixed-full/conf/routes
// @DATE:Mon Jul 07 23:08:39 JST 2025


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
