*** SETTINGS ***
Library    SeleniumLibrary

*** Test Cases ***
FungsiLogin
    Log    CheckOrder

SecondSeleniumTest
    Open Browser     https://www.tiket.com/
    Set Selenium Implicit Wait    5
    Sleep    5
    Click Element    xpath=/html/body/div[2]/div/div[2]/div[3]/div[1]/div[3]/div/div[2]/a[3]
    Click Element    xpath=/html/body/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div[1]/div[6]/div/div/ul/li[3]/div
    Click Element    xpath=/html/body/div[2]/div/div[2]/div[3]/div[1]/div[3]/div/div[2]/a[2]
    Sleep    6
    Close Browser
    Log    Test Completed
        