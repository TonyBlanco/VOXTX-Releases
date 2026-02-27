package com.nst.iptvsmarterstvbox.model.callback;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.nst.iptvsmarterstvbox.model.pojo.VPNServerPojo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class VPNServersCallback {

    @SerializedName("sc")
    @Expose
    private String sc;

    @SerializedName("servers")
    @Expose
    private List<VPNServerPojo> servers = null;

    @SerializedName("status")
    @Expose
    private Boolean status;

    public String getSc() {
        return this.sc;
    }

    public List<VPNServerPojo> getServers() {
        return this.servers;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setSc(String str) {
        this.sc = str;
    }

    public void setServers(List<VPNServerPojo> list) {
        this.servers = list;
    }

    public void setStatus(Boolean bool) {
        this.status = bool;
    }
}
