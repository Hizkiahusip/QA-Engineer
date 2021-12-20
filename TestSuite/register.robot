*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***
register 
    Open browser    https://mail.protonmail.com/
    Set Selenium Implicit Wait    5 
    Click Element    xpath=/html/body/div[2]/header/ul/li[3]/a
    
   
   
    Log    Test Completed