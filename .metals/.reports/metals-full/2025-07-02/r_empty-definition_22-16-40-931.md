error id: file:///C:/Users/sensh/Downloads/play-2.4-app-fixed-full/app/controllers/Application.scala:`<none>`.
file:///C:/Users/sensh/Downloads/play-2.4-app-fixed-full/app/controllers/Application.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -play/api/mvc/views.
	 -views.
	 -scala/Predef.views.
offset: 119
uri: file:///C:/Users/sensh/Downloads/play-2.4-app-fixed-full/app/controllers/Application.scala
text:
```scala
package controllers

import play.api.mvc._

object Application extends Controller {
  def index = Action {
    Ok(views@@.html.main())
  }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.