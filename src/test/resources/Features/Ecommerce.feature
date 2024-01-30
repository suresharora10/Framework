Feature: Ecommerce website test cases

  Scenario: Login to Amazon
    Given user logins to url ""
    When enters email id ""
    And clicks continue
    And enters paswword ""
    And clicks sign in
    Then user is on Amazon web page