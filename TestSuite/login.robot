*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***
Login 
    Open browser    https://mail.protonmail.com/
    Set Selenium Implicit Wait    5 
    Input Text    name=username    raviolidonotsteal1890@protonmail.com
    Input Password    name=password     Ravioli1!
    Click Element    xpath=//*[@id="login_btn"]
    Input Text    name=mailbox-password    AARR
    Click Element    xpath=//*[@id="unlock_btn"]
    
    
    Log    Test completed