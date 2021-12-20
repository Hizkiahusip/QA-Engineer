*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***
ReplyMail 
    Open browser    https://mail.protonmail.com/
     Set Selenium Implicit Wait    5 
    Input Text    name=username    raviolidonotsteal1890@protonmail.com
    Input Password    name=password     Ravioli1!
    Click Element    xpath=//*[@id="login_btn"]
    Input Text    name=mailbox-password    AARR
    Click Element    xpath=//*[@id="unlock_btn"]
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/section/div[1]/div[2]/div[1]/h4/span[2]
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[2]/element-view/div/section/div/article/div[2]/div[1]/div[3]/div/nav/a[1]/i
    Log    Test Completed