*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***
NotifEmail 
    Open browser    https://mail.protonmail.com/
    Set Selenium Implicit Wait    5 
    Input Text    name=username    raviolidonotsteal1890@protonmail.com
    Input Password    name=password     Ravioli1!
    Click Element    xpath=//*[@id="login_btn"]
    Input Text    name=mailbox-password    AARR
    Click Element    xpath=//*[@id="unlock_btn"]
    Click Element    xpath=/html/body/div[2]/header/div/ul/li[3]/a/span 
    Click Element    xpath=/html/body/div[2]/div[2]/div/div/div[1]/section[2]/form/div[2]/div[2]/button
    Input Text    id=loginPassword    Ravioli1!
    Click Element    xpath=/html/body/div[1]/form/div[2]/button[2]

    Click Element    xpath=/html/body/div[2]/div[2]/div/div/div[1]/section[2]/form/div[2]/div[2]/button
    
    Log    Test completed