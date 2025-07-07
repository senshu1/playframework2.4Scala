
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/sensh/Downloads/play-2.4-app-fixed-full/conf/routes
// @DATE:Mon Jul 07 23:08:39 JST 2025

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """form""", """controllers.FormController.showForm"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """form""", """controllers.FormController.submitForm"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_FormController_showForm0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("form")))
  )
  private[this] lazy val controllers_FormController_showForm0_invoker = createInvoker(
    controllers.FormController.showForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "showForm",
      Nil,
      "GET",
      """""",
      this.prefix + """form"""
    )
  )

  // @LINE:2
  private[this] lazy val controllers_FormController_submitForm1_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("form")))
  )
  private[this] lazy val controllers_FormController_submitForm1_invoker = createInvoker(
    controllers.FormController.submitForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "submitForm",
      Nil,
      "POST",
      """""",
      this.prefix + """form"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_FormController_showForm0_route(params) =>
      call { 
        controllers_FormController_showForm0_invoker.call(controllers.FormController.showForm)
      }
  
    // @LINE:2
    case controllers_FormController_submitForm1_route(params) =>
      call { 
        controllers_FormController_submitForm1_invoker.call(controllers.FormController.submitForm)
      }
  }
}