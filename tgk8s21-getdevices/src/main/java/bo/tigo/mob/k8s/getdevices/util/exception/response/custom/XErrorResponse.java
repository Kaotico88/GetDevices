/** ************************************************************************
 * Copyright (C) 2022 Mob Army S.R.L. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 * Written by Mob Army <info@wwtelecommunications.com>, 2022
 * for Mob Army S.R.L. use only.
 * *************************************************************************
 */
package bo.tigo.mob.k8s.getdevices.util.exception.response.custom;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * XErrorResponse is used to customize the body of the error response.
 *
 * @author Elio Arias
 * @since 1.0
 * @version LastRevision-2021-07-31
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class XErrorResponse {

    @JsonIgnore
    private HttpStatus httpStatus;

    @JsonIgnore
    private Date date;

    @JsonIgnore
    @JsonProperty("status")
    private Integer statusCode;

    @JsonIgnore
    @JsonProperty("error")
    private String statusName;

    @JsonIgnore
    private Integer code;

    @JsonIgnore
    private String message;

    @JsonIgnore
    private List<String> details;

    // ----------- Custom Exception: Start -----------

    // ----------- Custom Exception: End -----------

    public XErrorResponse(HttpStatus httpStatus) {
        this(httpStatus, httpStatus.value(), httpStatus.name(), null, null, new ArrayList<String>());
    }

    public XErrorResponse(HttpStatus httpStatus, List<String> details) {
        this(httpStatus, httpStatus.value(), httpStatus.name(), null, null, details);
    }

    public XErrorResponse(HttpStatus httpStatus, String message) {
        this(httpStatus, httpStatus.value(), httpStatus.name(), null, message, new ArrayList<String>());
    }

    public XErrorResponse(HttpStatus httpStatus, String message, List<String> details) {
        this(httpStatus, httpStatus.value(), httpStatus.name(), null, message, details);
    }

    public XErrorResponse(HttpStatus httpStatus, Integer code) {
        this(httpStatus, httpStatus.value(), httpStatus.name(), code, null, new ArrayList<String>());
    }

    public XErrorResponse(HttpStatus httpStatus, Integer code, String message) {
        this(httpStatus, httpStatus.value(), httpStatus.name(), code, message, new ArrayList<String>());
    }

    public XErrorResponse(HttpStatus httpStatus, Integer statusCode, String statusName, Integer code, String message) {
        this(httpStatus, statusCode, statusName, code, message, new ArrayList<String>());
    }

    public XErrorResponse(CustomRuntimeException cre) {
        this(cre.getHttpStatus(), cre.getStatusCode(), cre.getStatusName(), cre.getCode(), cre.getMessage(),
                new ArrayList<String>());
    }

    public XErrorResponse(HttpStatus httpStatus, Integer statusCode, String statusName, Integer code, String message,
            List<String> details) {
        this.httpStatus = httpStatus;
        this.date = new Date();
        this.statusCode = statusCode;
        this.statusName = statusName;
        this.code = code;
        this.message = message;
        this.details = details;
        // ----------- Custom Exception: Start -----------

        // ----------- Custom Exception: End -----------
    }

    // Getters & Setters
    // ----------- Custom Exception: Start -----------

    // ----------- Custom Exception: End -----------

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

	@Override
	public String toString() {
		return "XErrorResponse [httpStatus=" + httpStatus + ", date=" + date + ", statusCode=" + statusCode
				+ ", statusName=" + statusName + ", code=" + code + ", message=" + message + ", details=" + details
				+ "]";
	}
    
    

}
