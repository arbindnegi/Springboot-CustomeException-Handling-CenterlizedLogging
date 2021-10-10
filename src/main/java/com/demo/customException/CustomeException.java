/**
 * 
 */
package com.demo.customException;

/**
 * @author Arbind Negi 10-Oct-2021
 *
 */
public class CustomeException {

    private String errorMsg;
    private String errorCode;
    
    public CustomeException (String errorMsg, String errorCode) {
	this.errorMsg = errorMsg;
	this.errorCode = errorCode;
    }
    
    public CustomeException () {

    }

    /**
     * @return the errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * @param errorMsg the errorMsg to set
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     * @return the errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * @param errorCode the errorCode to set
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    
}
