$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Finaliza compra de produto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 2,
  "name": "CheckOut de produto",
  "description": "",
  "id": "checkout-de-produto",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 4,
  "name": "Usuário finaliza compra do produto",
  "description": "",
  "id": "checkout-de-produto;usuário-finaliza-compra-do-produto",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 3,
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "que o usuário acesse o site \"http://www.walmart.com.br\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "o usuário pesquisa produto com termo \"tv\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 7,
  "name": "o usuário adiciona o produto no carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 8,
  "name": "o usuário finaliza a compra do produto",
  "keyword": "E "
});
formatter.step({
  "line": 9,
  "name": "a página de login é apresentada",
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.walmart.com.br",
      "offset": 29
    }
  ],
  "location": "IntegrationStep.que_o_usuário_acesse_o_site(String)"
});
formatter.result({
  "duration": 22538596948,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tv",
      "offset": 38
    }
  ],
  "location": "IntegrationStep.o_usuário_pesquisa_produto_com_termo(String)"
});
formatter.result({
  "duration": 2336148665,
  "status": "passed"
});
formatter.match({
  "location": "IntegrationStep1.o_usuário_adiciona_o_produto_no_carrinho()"
});
formatter.result({
  "duration": 13532352255,
  "status": "passed"
});
formatter.match({
  "location": "IntegrationStep2.o_usuário_finaliza_a_compra_do_produto()"
});
formatter.result({
  "duration": 11369513175,
  "status": "passed"
});
formatter.match({
  "location": "IntegrationStep2.a_página_de_login_é_apresentada()"
});
formatter.result({
  "duration": 11149985847,
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 2 seconds waiting for tests.walmart.page.CartPage$1@21325036\nBuild info: version: \u00272.47.1\u0027, revision: \u0027unknown\u0027, time: \u00272015-07-30 11:02:44\u0027\nSystem info: host: \u0027CI-98573-0\u0027, ip: \u0027172.22.34.164\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_51\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d40.0.2, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 31c52484-86d2-4373-beb7-5f22359e236a\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:229)\r\n\tat tests.walmart.page.CartPage.isWindowLogin(CartPage.java:41)\r\n\tat tests.walmart.step.IntegrationStep2.a_página_de_login_é_apresentada(IntegrationStep2.java:24)\r\n\tat ✽.Então a página de login é apresentada(features/Finaliza compra de produto.feature:9)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"class name\",\"selector\":\"wm-sign-in\"}\nCommand duration or timeout: 11.11 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.47.1\u0027, revision: \u0027unknown\u0027, time: \u00272015-07-30 11:02:44\u0027\nSystem info: host: \u0027CI-98573-0\u0027, ip: \u0027172.22.34.164\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_51\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d40.0.2, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 31c52484-86d2-4373-beb7-5f22359e236a\n*** Element info: {Using\u003dclass name, value\u003dwm-sign-in}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:595)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:348)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByClassName(RemoteWebDriver.java:429)\r\n\tat org.openqa.selenium.By$ByClassName.findElement(By.java:388)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:340)\r\n\tat tests.walmart.page.CartPage$1.apply(CartPage.java:44)\r\n\tat tests.walmart.page.CartPage$1.apply(CartPage.java:1)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:209)\r\n\tat tests.walmart.page.CartPage.isWindowLogin(CartPage.java:41)\r\n\tat tests.walmart.step.IntegrationStep2.a_página_de_login_é_apresentada(IntegrationStep2.java:24)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:34)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:30)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:35)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:89)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:40)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:94)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:675)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"class name\",\"selector\":\"wm-sign-in\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.47.1\u0027, revision: \u0027unknown\u0027, time: \u00272015-07-30 11:02:44\u0027\nSystem info: host: \u0027CI-98573-0\u0027, ip: \u0027172.22.34.164\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_51\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/CIN_RP~1/AppData/Local/Temp/anonymous6753411424955856919webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10667)\r\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///C:/Users/CIN_RP~1/AppData/Local/Temp/anonymous6753411424955856919webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:623)\r\n",
  "status": "failed"
});
});