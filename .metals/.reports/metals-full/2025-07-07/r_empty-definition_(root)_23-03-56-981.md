file:///C:/Users/sensh/Downloads/play-2.4-app-fixed-full/app/controllers/FormController.scala
empty definition using pc, found symbol in pc: 
semanticdb not found
empty definition using fallback
non-local guesses:

offset: 228
uri: file:///C:/Users/sensh/Downloads/play-2.4-app-fixed-full/app/controllers/FormController.scala
text:
```scala
package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

object FormController extends Controller {

  // フォーム定義
  case class UserData(name: String, age: Int)
@@
  val userForm = Form(
    mapping(
      "name" -> nonEmptyText,
      "age" -> number(min = 0, max = 120)
    )(UserData.apply)(UserData.unapply)
  )

  def showForm = Action { implicit request =>
    Ok(views.html.form(userForm))
  }

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

```


#### Short summary: 

empty definition using pc, found symbol in pc: 