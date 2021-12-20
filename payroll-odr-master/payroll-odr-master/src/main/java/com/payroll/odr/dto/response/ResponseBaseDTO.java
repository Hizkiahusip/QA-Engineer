package com.payroll.odr.dto.response;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResponseBaseDTO<Any> {

    private Boolean status = true;
    private String code = "200";
    private String message = "Success";
    private Any data;

    public ResponseBaseDTO(Boolean status, String code, String message, Any data) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseBaseDTO() {
    }
}