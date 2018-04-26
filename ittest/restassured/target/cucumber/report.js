$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/PingService.feature");
formatter.feature({
  "name": "Test ping service",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User gets chameleon session then gets client session by calling ping service",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "chameleon session",
  "keyword": "Given "
});
formatter.match({
  "location": "PingServiceStepDefinitions.java:33"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls ping service",
  "keyword": "When "
});
formatter.match({
  "location": "PingServiceStepDefinitions.java:41"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the status code is 200",
  "keyword": "Then "
});
formatter.match({
  "location": "PingServiceStepDefinitions.java:46"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "client session is returned",
  "keyword": "And "
});
formatter.match({
  "location": "PingServiceStepDefinitions.java:50"
});
formatter.result({
  "status": "passed"
});
});