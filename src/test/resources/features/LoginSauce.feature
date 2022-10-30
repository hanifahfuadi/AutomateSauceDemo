@Login
  Feature: Login
    As a user I want to login to sauce demo

  Scenario: Normal Login
    Given User open the web page
    When User input "standard_user" as userName and "secret_sauce" as password


    Scenario Outline: Invalid Login
      Given User open the web page
      When User input "<userName>" as userName and "<password>" as password
      Then User will see "<errorText>" on login page
      Examples:
        | userName      |  | password     | errorText                                                                 |
        | asd           |  | secret_sauce | Epic sadface: Username and password do not match any user in this service |
        | standard_user |  | 123          | Epic sadface: Username and password do not match any user in this service |
        | asd           |  | asd          | Epic sadface: Username and password do not match any user in this service |
        |               |  |              | Epic sadface: Username is required                                        |
        | asd           |  |              | Epic sadface: Password is required                                        |
        |               |  | asd          | Epic sadface: Username is required                                        |
