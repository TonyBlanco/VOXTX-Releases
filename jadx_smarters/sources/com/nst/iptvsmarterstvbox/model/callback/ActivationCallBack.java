package com.nst.iptvsmarterstvbox.model.callback;

import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class ActivationCallBack {

    @SerializedName("logindetails")
    @Expose
    private Logindetails logindetails;

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("result")
    @Expose
    private String result;

    public class Logindetails {

        @SerializedName(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD)
        @Expose
        private String password;

        @SerializedName(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME)
        @Expose
        private String username;

        public Logindetails() {
        }

        public String getPassword() {
            return this.password;
        }

        public String getUsername() {
            return this.username;
        }

        public void setPassword(String str) {
            this.password = str;
        }

        public void setUsername(String str) {
            this.username = str;
        }
    }

    public Logindetails getLogindetails() {
        return this.logindetails;
    }

    public String getMessage() {
        return this.message;
    }

    public String getResult() {
        return this.result;
    }

    public void setLogindetails(Logindetails logindetails) {
        this.logindetails = logindetails;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setResult(String str) {
        this.result = str;
    }
}
