package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

object FormController extends Controller {

  // フォーム用データクラス
  case class UserData(name: String, age: Int)

  // バリデーション付きフォーム
  val userForm = Form(
    mapping(
      "name" -> nonEmptyText,
      "age" -> number(min = 0, max = 120)
    )(UserData.apply)(UserData.unapply)
  )

  // フォーム表示
  def showForm = Action { implicit request =>
    Ok(views.html.form(userForm))
  }

  // フォーム送信後の処理
  def submitForm = Action { implicit request =>
    userForm.bindFromRequest.fold(
      formWithErrors => {
        BadRequest(views.html.form(formWithErrors))
      },
      userData => {
        Ok(views.html.result(userData))
      }
    )
  }
}
