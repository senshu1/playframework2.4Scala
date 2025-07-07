
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>

<head>
    <title>"""),_display_(/*7.13*/title),format.raw/*7.18*/("""</title>
    <meta charset="utf-8">
</head>

<body>
    """),_display_(/*12.6*/content),format.raw/*12.13*/("""
"""),format.raw/*13.1*/("""</body>

</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Jul 07 23:08:40 JST 2025
                  SOURCE: C:/Users/sensh/Downloads/play-2.4-app-fixed-full/app/views/main.scala.html
                  HASH: f296b605049b0d74442270e8602019ea02f0821e
                  MATRIX: 530->1|655->31|685->35|758->82|783->87|871->149|899->156|928->158
                  LINES: 20->1|25->1|27->3|31->7|31->7|36->12|36->12|37->13
                  -- GENERATED --
              */
          