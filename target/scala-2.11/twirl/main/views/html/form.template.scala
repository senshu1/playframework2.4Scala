
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object form_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class form extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[controllers.FormController.UserData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[controllers.FormController.UserData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""

"""),_display_(/*3.2*/main("フォーム入力")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
"""),format.raw/*4.1*/("""<h1>ユーザーフォーム</h1>

"""),_display_(/*6.2*/if(userForm.hasErrors)/*6.24*/ {_display_(Seq[Any](format.raw/*6.26*/("""
"""),format.raw/*7.1*/("""<p style="color: red;">エラーがあります。すべての項目を正しく入力してください。</p>
""")))}),format.raw/*8.2*/("""

"""),format.raw/*10.1*/("""<form action=""""),_display_(/*10.16*/routes/*10.22*/.FormController.submitForm()),format.raw/*10.50*/("""" method="POST">
    <p>
        名前: <input type="text" name="name" value=""""),_display_(/*12.52*/userForm(" name")/*12.69*/.value.getOrElse("")),format.raw/*12.89*/("""">
        """),_display_(/*13.10*/userForm("name")/*13.26*/.error.map/*13.36*/ { err =>_display_(Seq[Any](format.raw/*13.45*/(""" """),format.raw/*13.46*/("""<span style="color:red">"""),_display_(/*13.71*/err/*13.74*/.message),format.raw/*13.82*/("""</span> """)))}),format.raw/*13.91*/("""
    """),format.raw/*14.5*/("""</p>
    <p>
        年齢: <input type="number" name="age" value=""""),_display_(/*16.53*/userForm(" age")/*16.69*/.value.getOrElse("")),format.raw/*16.89*/("""">
        """),_display_(/*17.10*/userForm("age")/*17.25*/.error.map/*17.35*/ { err =>_display_(Seq[Any](format.raw/*17.44*/(""" """),format.raw/*17.45*/("""<span style="color:red">"""),_display_(/*17.70*/err/*17.73*/.message),format.raw/*17.81*/("""</span> """)))}),format.raw/*17.90*/("""
    """),format.raw/*18.5*/("""</p>
    <p><input type="submit" value="送信"></p>
</form>
""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(userForm:Form[controllers.FormController.UserData]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[controllers.FormController.UserData]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


}

/**/
object form extends form_Scope0.form
              /*
                  -- GENERATED --
                  DATE: Mon Jul 07 23:08:40 JST 2025
                  SOURCE: C:/Users/sensh/Downloads/play-2.4-app-fixed-full/app/views/form.scala.html
                  HASH: 0d6379d8033589f447a08435c3f10f5c0e2b6519
                  MATRIX: 560->1|708->54|738->59|760->73|799->75|827->77|874->99|904->121|943->123|971->125|1058->183|1089->187|1131->202|1146->208|1195->236|1300->314|1326->331|1367->351|1407->364|1432->380|1451->390|1498->399|1527->400|1579->425|1591->428|1620->436|1660->445|1693->451|1787->518|1812->534|1853->554|1893->567|1917->582|1936->592|1983->601|2012->602|2064->627|2076->630|2105->638|2145->647|2178->653|2269->714
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|30->6|30->6|30->6|31->7|32->8|34->10|34->10|34->10|34->10|36->12|36->12|36->12|37->13|37->13|37->13|37->13|37->13|37->13|37->13|37->13|37->13|38->14|40->16|40->16|40->16|41->17|41->17|41->17|41->17|41->17|41->17|41->17|41->17|41->17|42->18|45->21
                  -- GENERATED --
              */
          