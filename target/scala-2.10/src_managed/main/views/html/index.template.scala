
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(email: String, vfile: String, dataset: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 


Seq[Any](format.raw/*1.49*/("""


"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main("Index")/*6.15*/ {_display_(Seq[Any](format.raw/*6.17*/("""


<ol class="breadcrumb">
	<li><a href="/estimator/tutorial">Tutorial</a></li>
	<li class="active">Collect Data</li>
	<li><a href="/estimator/1">Input preference</a></li>
	<li><a href="/estimator/2">Workflow Summary</a></li>
	<li><a href="/estimator/3">Recommendation</a></li>
</ol>

<div class="jumbotron">
<div class="row">

	<div class="col-lg-6">
		<img src="/assets/images/NASA_logo.png">
	</div>
	<div class="col-lg-6">
	<h1>We are ready to help you</h1>
	<p>We have collected your workflow and datasets. Based on those
		files, we can help you decide which virtual machine option is best for
		you to use at Amazon EC2.</p>
	<p>
		<a class="btn btn-lg btn-default"
						href="/estimator/tutorial" role="button">Getting Started &raquo;</a>
	</p>
	"""),_display_(Seq[Any](/*32.3*/if(!session.get("username"))/*32.31*/{_display_(Seq[Any](format.raw/*32.32*/("""
		<p>Nasa Provides 200 AWS accounts with $150 credit each. First come first serve for contest participants.
		Remaining slots: 150.
		If you would like to get a credited account please register here.</p>
		<p>
		<a class="btn btn-primary"
						href="estimator/register" role="button">Register &raquo;</a>
	</p>
	""")))})),format.raw/*40.3*/("""
	</div>
</div>
</div>

<form method="POST" action="/estimator/1" enctype="multipart/form-data">


	<fieldset>
		<legend>Estimator</legend>

		<div class="clearfix" id="name_field">
			<label for="name">Scripting file</label>
			<div class="row">
				<div class="input col-lg-2">

					<input type="file" id="name" name="file" value=""""),_display_(Seq[Any](/*56.55*/vfile)),format.raw/*56.60*/("""" placeholder="/Downloads/Workflowfiles"> <span
						class="help-inline"></span> <span class="help-block">Required</span>
				</div>
				<div class="upload col-lg-2">
					
				</div>
			</div>
		</div>
		<div class="clearfix" id="title_field">
			<label for="title">Dataset</label>
			<div class="row">
				<div class="input col-lg-2">
	 
					<input type="text" id="title" name="title" value=""""),_display_(Seq[Any](/*69.57*/dataset)),format.raw/*69.64*/("""" placeholder="/Downloads/Datasets"> <span
						class="help-inline"></span> <span class="help-block">Required</span>
				</div>
			
				<div class="upload col-lg-2">
					<input type="button" class="btn" id="upload-dataset" name="upload-dataset" value="upload">
				</div>
			</div>
		</div>
		<div class="clearfix  " id="email_field">
			<label for="email">Email</label>
			<div class="input">

				<input type="text" id="email" name="email" value=""""),_display_(Seq[Any](/*82.56*/email)),format.raw/*82.61*/(""""> <span
					class="help-inline"></span> <span class="help-block">Required</span>
			</div>
		</div>

		<div class="clearfix  " id="organization_field">
			<label for="organization">Organization</label>
			<div class="input">

				<input type="text" id="organization" name="organization" value="">

				<span class="help-inline"></span> <span class="help-block"></span>
			</div>
		</div>

		<div class="clearfix  " id="description_field">
			<label for="description">Description</label>
			<div class="input">

				<textarea id="description" name="description" cols="65" rows="7"></textarea>

				<span class="help-inline"></span> <span class="help-block"></span>
			</div>
		</div>

	</fieldset>


	<div class="actions">
		<input type="submit" class="btn btn-primary"
			value="Get Recommendation"> <a href="/estimator" class="btn">Thanks,
			I know what to use</a>
	</div>


</form>
""")))})),format.raw/*118.2*/("""
"""))}
    }
    
    def render(email:String,vfile:String,dataset:String): play.api.templates.HtmlFormat.Appendable = apply(email,vfile,dataset)
    
    def f:((String,String,String) => play.api.templates.HtmlFormat.Appendable) = (email,vfile,dataset) => apply(email,vfile,dataset)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 09 22:24:43 EST 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/index.scala.html
                    HASH: 8fc18c9e801eecc8c9049e72b3b0bdfb32353c3e
                    MATRIX: 788->1|946->48|975->69|1011->71|1032->84|1071->86|1862->842|1899->870|1938->871|2284->1186|2655->1521|2682->1526|3115->1923|3144->1930|3632->2382|3659->2387|4579->3275
                    LINES: 26->1|30->1|33->5|34->6|34->6|34->6|60->32|60->32|60->32|68->40|84->56|84->56|97->69|97->69|110->82|110->82|146->118
                    -- GENERATED --
                */
            