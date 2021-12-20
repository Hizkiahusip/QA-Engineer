package com.payroll.odr.util;

import com.payroll.odr.dto.PayrollParamDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringUtil.class);

    public static PayrollParamDto parseHeaderPayroll(String header) {
        try {
            if (header.length() > 0) {
                String[] params = header.split("&");
                if (params.length == 3) {
                    PayrollParamDto param = new PayrollParamDto();

                    String[] companyIds = params[0].split("=");
                    if (companyIds.length == 2) {
                        param.setCompanyId(Integer.parseInt(companyIds[1]));
                    } else {
                        return null;
                    }

                    String[] years = params[1].split("=");
                    if (years.length == 2) {
                        param.setYear(Integer.parseInt(years[1]));
                    } else {
                        return null;
                    }

                    String[] months = params[2].split("=");
                    if (months.length == 2) {
                        param.setMonth(Integer.parseInt(months[1]));
                    } else {
                        return null;
                    }

                    return param;
                }
            }
        } catch (Exception e) {
            LOGGER.error("StringUtil - parseHeaderPayroll", e);
        }

        return null;
    }

}
