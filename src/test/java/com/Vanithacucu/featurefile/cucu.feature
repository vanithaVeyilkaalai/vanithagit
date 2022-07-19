Feature: Adactin Ticket Booking


Scenario Outline:
: Login Functionality
Given User is Launch the Application
When User is Enter the username in "<username>" field
And User is Enter the password in "<password>" field
Then User is Enter the Submit Button
Examples:
    |username|password|
    |admin|admin123|
    |arvind19|12345678|


Scenario: Search Hotel Details
Given User is enter the location

