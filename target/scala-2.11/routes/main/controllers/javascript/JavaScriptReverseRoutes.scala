
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/sensh/Downloads/play-2.4-app-fixed-full/conf/routes
// @DATE:Mon Jul 07 23:08:39 JST 2025

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:1
  class ReverseFormController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def showForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FormController.showForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "form"})
        }
      """
    )
  
    // @LINE:2
    def submitForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FormController.submitForm",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "form"})
        }
      """
    )
  
  }


}