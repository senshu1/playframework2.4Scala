
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object result_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class result extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[controllers.FormController.UserData,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userData: controllers.FormController.UserData):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.49*/("""

"""),_display_(/*3.2*/main("送信結果")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
"""),format.raw/*4.1*/("""<h1>送信結果</h1>
<p>名前："""),_display_(/*5.8*/userData/*5.16*/.name),format.raw/*5.21*/("""</p>
<p>年齢："""),_display_(/*6.8*/userData/*6.16*/.age),format.raw/*6.20*/(""" """),format.raw/*6.21*/("""歳</p>
""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(userData:controllers.FormController.UserData): play.twirl.api.HtmlFormat.Appendable = apply(userData)

  def f:((controllers.FormController.UserData) => play.twirl.api.HtmlFormat.Appendable) = (userData) => apply(userData)

  def ref: this.type = this

}


}

/**/
object result extends result_Scope0.result
              /*
                  -- GENERATED --
                  DATE: Mon Jul 07 23:08:40 JST 2025
                  SOURCE: C:/Users/sensh/Downloads/play-2.4-app-fixed-full/app/views/result.scala.html
                  HASH: bf8ae11d439facf0f577407800bdc50720328ab1
                  MATRIX: 558->1|700->48|730->53|750->65|789->67|817->69|864->91|880->99|905->104|943->117|959->125|983->129|1011->130|1048->138
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|29->5|29->5|29->5|30->6|30->6|30->6|30->6|31->7
                  -- GENERATED --
              */
          