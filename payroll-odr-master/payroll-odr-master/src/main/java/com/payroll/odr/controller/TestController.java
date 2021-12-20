package com.payroll.odr.controller;

import com.payroll.odr.dto.PayrollParamDto;
import com.payroll.odr.dto.UserDataDto;
import com.payroll.odr.dto.response.ResponseBaseDTO;

import com.payroll.odr.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(path = "/test")
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Autowired
    PrincipalExtractor extractor;

    @GetMapping("check")
    public ResponseEntity testApi(
            @RequestHeader(name = "PAYROLL-PARAM", required = false, defaultValue = "companyId=0&year=0&month=0") String payrollParam
    ) {
        PayrollParamDto payroll = StringUtil.parseHeaderPayroll(payrollParam);

        LOGGER.error("update header payroll annotation: " + payrollParam);

        return new ResponseEntity(new ResponseBaseDTO<>(true, "200", "Success", payrollParam), HttpStatus.OK);
    }

    @GetMapping("remote")
    public Object getRemote() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDataDto userSession = (UserDataDto) auth.getPrincipal();

        return userSession;
    }

    @GetMapping("check-session")
    public ResponseEntity checkSession() {
        try {
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            String username = auth.getPrincipal().toString();

            return new ResponseEntity(new ResponseBaseDTO<>(true, "200", "Success", username), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(new ResponseBaseDTO<>(false, "500", e.getMessage(), null), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
