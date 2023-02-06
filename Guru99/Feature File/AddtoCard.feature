Feature: Add item to card and verify

	Scenario: Add item to card
	
    Given I open the "https://www.macys.com/" E-commence website
    And navigate to the Men module to Sub module of New Arrival
    When click the any particular item
    And click the color and size to add to bag
    And click the remove item from the card
    Then click the cart button to check the item is present