error id: file:///C:/Users/sensh/Downloads/play-2.4-app-fixed-full/app/controllers/FormController.scala:`<none>`.
file:///C:/Users/sensh/Downloads/play-2.4-app-fixed-full/app/controllers/FormController.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -javax/inject/nonEmptyText.
	 -javax/inject/nonEmptyText#
	 -javax/inject/nonEmptyText().
	 -play/api/mvc/nonEmptyText.
	 -play/api/mvc/nonEmptyText#
	 -play/api/mvc/nonEmptyText().
	 -play/api/data/nonEmptyText.
	 -play/api/data/nonEmptyText#
	 -play/api/data/nonEmptyText().
	 -play/api/data/Forms.nonEmptyText.
	 -play/api/data/Forms.nonEmptyText#
	 -play/api/data/Forms.nonEmptyText().
	 -play/api/i18n/nonEmptyText.
	 -play/api/i18n/nonEmptyText#
	 -play/api/i18n/nonEmptyText().
	 -nonEmptyText.
	 -nonEmptyText#
	 -nonEmptyText().
	 -scala/Predef.nonEmptyText.
	 -scala/Predef.nonEmptyText#
	 -scala/Predef.nonEmptyText().
offset: 360
uri: file:///C:/Users/sensh/Downloads/play-2.4-app-fixed-full/app/controllers/FormController.scala
text:
```scala
package controllers

import javax.inject._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.UserData
import play.api.i18n._

@Singleton
class FormController @Inject() (cc: MessagesControllerComponents)
    extends MessagesAbstractController(cc) {

  val userForm = Form(
    mapping(
      "name" -> nonEmp@@tyText,
      "age" -> number(min = 0)
    )(UserData.apply)(UserData.unapply)
  )

  def showForm = Action { implicit request =>
    Ok(views.html.form(userForm))
  }

  def submitForm = Action { implicit request =>
    userForm.bindFromRequest.fold(
      formWithErrors => BadRequest(views.html.form(formWithErrors)),
      userData => Ok(views.html.result(userData))
    )
  }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.