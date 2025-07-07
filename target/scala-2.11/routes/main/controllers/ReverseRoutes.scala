
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/sensh/Downloads/play-2.4-app-fixed-full/conf/routes
// @DATE:Mon Jul 07 23:08:39 JST 2025

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseFormController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def showForm(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "form")
    }
  
    // @LINE:2
    def submitForm(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "form")
    }
  
  }


}