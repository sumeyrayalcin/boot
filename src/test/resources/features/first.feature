@wip
Feature:About Functionality


  Background: User should access eaapp web page
    Given user is on the eaapp web page
    Then  user should see title is eaapp

  Scenario:Verify that the user login with valid credentials
    Given The user clicks on the login and lands on the login page
    When  The user enters valid credentials into  the field
    Then  The user clicks on login button
    And   The user lands on dashboard
    And   The user clicks on employee list on the dashboard
    When  The user clicks create new button
    Then  The user writes the all information about new employee into provided fields.
    And   The user clicks create button
    Then  The user should see new employee on the employee list page
    And  The user selects the new employee clicks delete button.
    Then Verify that the new employee deleted from the employee list








