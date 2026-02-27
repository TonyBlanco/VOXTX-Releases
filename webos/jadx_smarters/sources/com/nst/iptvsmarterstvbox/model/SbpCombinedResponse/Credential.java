package com.nst.iptvsmarterstvbox.model.SbpCombinedResponse;

import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class Credential {

    @SerializedName(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD)
    @Expose
    private String password;

    @SerializedName(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME)
    @Expose
    private String username;

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
