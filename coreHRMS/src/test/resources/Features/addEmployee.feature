Feature: Add employee functionality

@Smoke
  Scenario: Verify Add employee functionality
    Given log in to the application
    And wait for five seconds to allow the page to load
    Then verify Welcome selenium
    When move the mouse to the PIM
    And click on the Add Employee button
    Given wait for five seconds to allow the page to load
    When switch to the iframe
    And enter the first name "Sai" into the first name field
    And enter the last name "P" into the last name field
    And click the Save button to add the new employee
    And click the Back button to return to the previous page
    Then verify that the employee name displayed matches Sai P
  
   @Smoke
    Scenario: Verify Add employee functionality
    Given log in to the application
    And wait for five seconds to allow the page to load
    Then verify Welcome selenium
    When move the mouse to the PIM
    And click on the Add Employee button
    Given wait for five seconds to allow the page to load
    When switch to the iframe
    And enter the first name "Sai" into the first name field
    And enter the last name "P" into the last name field
    And click the Save button to add the new employee
    And click the Back button to return to the previous page
    Then verify that the employee name displayed matches Sai P
    
