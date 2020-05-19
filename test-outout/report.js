$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("freeCRM.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validate Free CRM HomePage Test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-homepage-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on loginPage",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user logs into app",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "home page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate correct user name",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on home link",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_the_browser()"
});
formatter.result({
  "duration": 7100142914,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_loginPage()"
});
formatter.result({
  "duration": 166076583,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_email_and_password()"
});
formatter.result({
  "duration": 1045540797,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.home_page_is_displayed()"
});
formatter.result({
  "duration": 5493624,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_home_page_title()"
});
formatter.result({
  "duration": 1018541925,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.click_on_home_link()"
});
formatter.result({
  "duration": 934331882,
  "status": "passed"
});
});