Feature: Account creation

@test
  Scenario: Create the account and search the product
    Given the user is in homepage
    When the user creates the account
    Then validate the label as personal info
    And search the product Dress and validate the product Blouses > Blouse
