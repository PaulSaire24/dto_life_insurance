package com.bbva.rbvd.dto.lifeinsrc.bo;

import java.util.List;

public class ErrorResponseBO extends CommonFieldsBO {

    private String code;
    private String message;
    private List<String> details;

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public List<String> getDetails() { return details; }
    public void setDetails(List<String> details) { this.details = details; }


}
