package com.nst.iptvsmarterstvbox.model.pojo;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class StalkerTokenPojo {

    @SerializedName(ClientConstants.DOMAIN_PATH_TOKEN_ENDPOINT)
    @Expose
    private String token;

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
