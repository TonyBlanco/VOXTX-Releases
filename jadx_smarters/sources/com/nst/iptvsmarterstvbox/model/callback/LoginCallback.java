package com.nst.iptvsmarterstvbox.model.callback;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class LoginCallback {

    @SerializedName("server_info")
    @Expose
    private ServerInfoCallback serverInfo;

    @SerializedName("user_info")
    @Expose
    private UserLoginInfoCallback userLoginInfo;

    public ServerInfoCallback getServerInfo() {
        return this.serverInfo;
    }

    public UserLoginInfoCallback getUserLoginInfo() {
        return this.userLoginInfo;
    }

    public void setServerInfo(ServerInfoCallback serverInfoCallback) {
        this.serverInfo = serverInfoCallback;
    }

    public void setUserInfo(UserLoginInfoCallback userLoginInfoCallback) {
        this.userLoginInfo = userLoginInfoCallback;
    }
}
