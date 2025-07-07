package controllers

import play.api.mvc._
import play.twirl.api.Html

object Application extends Controller {
  def index = Action {
    Ok(views.html.main("トップページ") {
      Html("<p>こんにちは！</p>")
    })
  }
}
