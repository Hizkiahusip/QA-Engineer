*** SETTINGS ***
Library    SeleniumLibrary

*** Test Cases ***
FungsiLogin
    Log    Register

SecondSeleniumTest
    Open Browser     https://www.tiket.com/
    Set Selenium Implicit Wait    5
    Sleep    5
    Click Element    xpath=/html/body/div[2]/div/div[2]/div[3]/div[1]/div[3]/div/div[2]/a[4]
    Click Element    xpath=/html/body/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div[1]/div[3]/div/div/input
    # Input Text       id=username
    Sleep    6
    Close Browser
    Log    Test Completed
        