$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/ticket_booking.feature");
formatter.feature({
  "line": 1,
  "name": "To test the ticket book functionality on newtours application",
  "description": "",
  "id": "to-test-the-ticket-book-functionality-on-newtours-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3209889,
  "status": "passed"
});
formatter.before({
  "duration": 6586432318,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "To test the complete end to end functionality of ticket booking on newtours application",
  "description": "",
  "id": "to-test-the-ticket-book-functionality-on-newtours-application;to-test-the-complete-end-to-end-functionality-of-ticket-booking-on-newtours-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the user has logged in the the application successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "he select the flight details on the flight finder page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "he selects the departure and return flight on select flight page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "he enters all the mandatory details on the book a flight page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "he must be able to get a successful message at the end",
  "keyword": "Then "
});
formatter.match({
  "location": "TicketBookingSteps.the_user_has_logged_in_the_the_application_successfully()"
});
formatter.result({
  "duration": 5188085036,
  "status": "passed"
});
formatter.match({
  "location": "TicketBookingSteps.he_select_the_flight_details_on_the_flight_finder_page()"
});
formatter.result({
  "duration": 1064505092,
  "status": "passed"
});
formatter.match({
  "location": "TicketBookingSteps.he_selects_the_departure_and_return_flight_on_select_flight_page()"
});
formatter.result({
  "duration": 1168308397,
  "status": "passed"
});
formatter.match({
  "location": "TicketBookingSteps.he_enters_all_the_mandatory_details_on_the_book_a_flight_page()"
});
formatter.result({
  "duration": 22083,
  "status": "passed"
});
formatter.match({
  "location": "TicketBookingSteps.he_must_be_able_to_get_a_successful_message_at_the_end()"
});
formatter.result({
  "duration": 22806,
  "status": "passed"
});
formatter.after({
  "duration": 172825,
  "error_message": "java.lang.NullPointerException\n\tat com.NewtoursApplication.LoginTestSteps.closeBrowser(LoginTestSteps.java:33)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:583)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:989)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\n\tat org.testng.TestRunner.run(TestRunner.java:505)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\n\tat org.testng.TestNG.run(TestNG.java:1017)\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\n",
  "status": "failed"
});
formatter.after({
  "duration": 93214473,
  "status": "passed"
});
});