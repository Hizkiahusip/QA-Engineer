*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***
SearchMail 
    Open browser    https://mail.protonmail.com/
     Set Selenium Implicit Wait    5 
    Input Text    name=username    raviolidonotsteal1890@protonmail.com
    Input Password    name=password     Ravioli1!
    Click Element    xpath=//*[@id="login_btn"]
    Input Text    name=mailbox-password    AARR
    Click Element    xpath=//*[@id="unlock_btn"]
    Click Element    xpath=/html/body/div[2]/header/div/form/div/button[2]
    Input Text    id=search_keywords    Produk
    Click Element    xpath=/html/body/div[2]/header/div/form/div[2]/div/div/div[4]/button
    Log    Test Completed