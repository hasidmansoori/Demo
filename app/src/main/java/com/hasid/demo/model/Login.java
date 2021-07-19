package com.hasid.demo.model;

public class Login {
    private String textLogin;
    private String textHost;
    private String mobileNumber;
    private String requestOTP;
    private String enterOTP;
    private String verifyOTP;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getRequestOTP() {
        return requestOTP;
    }

    public void setRequestOTP(String requestOTP) {
        this.requestOTP = requestOTP;
    }

    public String getEnterOTP() {
        return enterOTP;
    }

    public void setEnterOTP(String enterOTP) {
        this.enterOTP = enterOTP;
    }

    public String getVerifyOTP() {
        return verifyOTP;
    }

    public void setVerifyOTP(String verifyOTP) {
        this.verifyOTP = verifyOTP;
    }

    public String getTextLogin() {
        return textLogin;
    }

    public void setTextLogin(String textLogin) {
        this.textLogin = textLogin;
    }

    public String getTextHost() {
        return textHost;
    }

    public void setTextHost(String textHost) {
        this.textHost = textHost;
    }


}
