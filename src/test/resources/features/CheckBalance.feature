#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@validateBankAccountBalanceAndOptForExtraServices
Feature: User should be able to check the balance linked to their bank account

Background:
	Given User navigates to the bank website

  @positiveScenario @checkBalance
  Scenario: User should be able to check the balance amount successfully
    And User enters valid "User_123" and "Test@123" with ID as "1"
    When User clicks on Login
    And Navigate to Bank Summary Section
    Then User should be able to see the bank balance linked with the account

  @positiveScenario @optExtraServices
  Scenario Outline: User should be able to opt for extra services provided by the bank
    And User enters valid "<UserName>" and "<Password>" with ID as "<ID>"
    When User clicks on Login
    Then User should be able to select the extra services for "<ID>"
      | PersonalizedServices  | AccountRelatedServices |
      | LifeInsuranceCoverage | Demat                  |
      | WishList              | PPF                    |

    Examples: 
      | UserName | Password | ID |
      | User_123 | Test@123 |  1 |
      | User_567 | Test@456 |  2 |
