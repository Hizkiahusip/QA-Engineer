package com.payroll.odr.config;

import com.payroll.odr.dto.UserDataDto;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;

import java.util.Map;

public class UmaPrincipalExtractor implements PrincipalExtractor {

    @Override
    public Object extractPrincipal(Map<String, Object> map) {
        UserDataDto user = new UserDataDto();

        user.setId(Long.parseLong(map.get("id").toString()));
        user.setRole(map.get("role"));
        user.setUsername(map.get("username").toString());
        user.setEmail(map.get("email").toString());
        user.setEmployeeNo(map.get("employeeNo") == null ? null : map.get("employeeNo").toString());

        return user;
    }
}
