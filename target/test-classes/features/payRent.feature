Feature: Tp Validate the pay Rent page in the No Broker Application

  Scenario: to validate the pay rent button
    Given user needs to be on home page
    When user click on pay rent button
    Then it navigates to pay rent page

  Scenario: to validate the drop down of payment type
    Given user needs to be on pay rent page
    When user clicks on payment type drop down
    And user select on payment type
    Then value should be selected.

  Scenario Outline: to validate the user details on pay rent page
    Given user needs to be on pay rent page
    When user enter the username
    And user enter the phone number
    And user enter "<Email>"
    And click on check box
    And click on get started button
    And click on verify button
    Then it need to be logged in

    Examples: 
      | Email           |
      | dummy@gmail.com |

  Scenario: to validate whether profile data is updating or not.
    Given user needs to be on profile page.
    When user hovers and click on user profile
    And update username
    And click on save profile
    Then verify whether the pop up about updation is successful or not
