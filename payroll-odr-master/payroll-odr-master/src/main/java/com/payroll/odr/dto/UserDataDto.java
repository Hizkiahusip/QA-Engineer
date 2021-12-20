package com.payroll.odr.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDataDto {

    private Long id;

    private Object role;

    private String username;

    private String email;

    private String mobile;

    private String employeeNo;

}
