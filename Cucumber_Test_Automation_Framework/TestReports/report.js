$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2End_Test.feature");
formatter.feature({
  "line": 1,
  "name": "End to End Functional Test",
  "description": "Product search and purchase from amazon.com\r\nUser wants to search for Product and purchase from amazon.com\r\nValidation criteria : User should be logged in to check out the product",
  "id": "end-to-end-functional-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Product Search and add to shopping cart",
  "description": "",
  "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "he submit username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "he search for \"\u003cproduct\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Add product to shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User clicks on shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Cliks on proceed to check out",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User should be asked to login before checkout",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart;",
  "rows": [
    {
      "cells": [
        "product"
      ],
      "line": 16,
      "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart;;1"
    },
    {
      "cells": [
        "hp laptop"
      ],
      "line": 17,
      "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Product Search and add to shopping cart",
  "description": "",
  "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "he submit username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "he search for \"hp laptop\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Add product to shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User clicks on shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Cliks on proceed to check out",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User should be asked to login before checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.userIsOnHomePage()"
});
formatter.result({
  "duration": 7964924100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.he_submit_username_and_password()"
});
formatter.result({
  "duration": 10070003100,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027_36HLxm col col-3-5\u0027]//form//input[@type\u003d\u0027text\u0027]\"}\n  (Session info: chrome\u003d88.0.4324.150)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027LAPTOP-IKS9SD1L\u0027, ip: \u0027192.168.194.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.150, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\Sharayu\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:57818}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d39c1db8eb35044da13e5cde65c2cf39\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027_36HLxm col col-3-5\u0027]//form//input[@type\u003d\u0027text\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:472)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\r\n\tat pageobjects.LoginPage.enterEmail(LoginPage.java:32)\r\n\tat pageobjects.LoginPage.loginToCheckOut(LoginPage.java:43)\r\n\tat stepdefinition.Steps.he_submit_username_and_password(Steps.java:74)\r\n\tat ✽.When he submit username and password(End2End_Test.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "hp laptop",
      "offset": 15
    }
  ],
  "location": "Steps.heSearchFor(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.chooseToBuyTheFirstItem()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.addsProductToShoppingCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.userClicksOnShoppingCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.userClicksOnProceedCheckOut()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.enterPersonalDetailsOnLoginPage()"
});
formatter.result({
  "status": "skipped"
});
});