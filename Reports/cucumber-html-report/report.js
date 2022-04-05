$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Feature/ClientLogin.feature");
formatter.feature({
  "name": "Given client able to login gwm4",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User able to create model portfolio with valid details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@portfoliomanagement"
    }
  ]
});
formatter.step({
  "name": "user Open browser and Enter GWM URL",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter valid \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\" and click login",
  "keyword": "Then "
});
formatter.step({
  "name": "click portfolio dropdown",
  "keyword": "Then "
});
formatter.step({
  "name": "Click portfolio management",
  "keyword": "Then "
});
formatter.step({
  "name": "click create model portfolio",
  "keyword": "And "
});
formatter.step({
  "name": "enter Details \"\u003cmodelname\u003e\" , \"\u003cportfoliosize\u003e\" and \"\u003ccorridor\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click Save model portfolio",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "modelname",
        "portfoliosize",
        "corridor"
      ]
    },
    {
      "cells": [
        "qaclient001",
        "Test1234",
        "Phillip",
        "70",
        "100"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User able to create model portfolio with valid details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@portfoliomanagement"
    }
  ]
});
formatter.step({
  "name": "user Open browser and Enter GWM URL",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginOrder_Steps.user_Open_browser_and_Enter_GWM_URL()"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Failed to instantiate class StepDefination.LoginOrder_Steps\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:47)\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.getInstance(DefaultJavaObjectFactory.java:33)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:49)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:44)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:41)\r\n\t... 33 more\r\nCaused by: java.io.FileNotFoundException: \\GWMWEB\\config.properties (The system cannot find the path specified)\r\n\tat java.io.FileInputStream.open0(Native Method)\r\n\tat java.io.FileInputStream.open(Unknown Source)\r\n\tat java.io.FileInputStream.\u003cinit\u003e(Unknown Source)\r\n\tat java.io.FileInputStream.\u003cinit\u003e(Unknown Source)\r\n\tat com.Utilities.BrowserSetUp.\u003cinit\u003e(BrowserSetUp.java:25)\r\n\tat StepDefination.LoginOrder_Steps.\u003cinit\u003e(LoginOrder_Steps.java:19)\r\n\t... 38 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enter valid \"qaclient001\" and \"Test1234\" and click login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginOrder_Steps.user_enter_valid_and_and_click_login(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click portfolio dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "PersonalParticulars_Steps.click_portfolio_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click portfolio management",
  "keyword": "Then "
});
formatter.match({
  "location": "Portfoliomgmt_Steps.click_portfolio_management()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click create model portfolio",
  "keyword": "And "
});
formatter.match({
  "location": "Portfoliomgmt_Steps.click_create_model_portfolio()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter Details \"Phillip\" , \"70\" and \"100\"",
  "keyword": "And "
});
formatter.match({
  "location": "Portfoliomgmt_Steps.enter_Details_and(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click Save model portfolio",
  "keyword": "Then "
});
formatter.match({
  "location": "Portfoliomgmt_Steps.click_Save_model_portfolio()"
});
formatter.result({
  "status": "skipped"
});
});