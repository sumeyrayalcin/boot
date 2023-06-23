@wip 
Feature: Google search functionality
  Agile story: As a user, when I am on the google search page
  I should be able to search CDER


 Background: User should access Google
    Given user is on the google search page
    Then user should see title is Google


   Scenario: Given user search "cder group" on google
     When user write cder group search bar
     Then user should see cder on the page
     And user navigates to Cder Website
     And user sees cder "Home - CDER Group" on tab
     And user clicks careers
     Then user sees "Quality Assurance Tester"








