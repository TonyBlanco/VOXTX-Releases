package com.nst.iptvsmarterstvbox.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public class BillingClearDevicesPojo {

    @SerializedName("devicename")
    @Expose
    private String devicename;

    @SerializedName(Name.MARK)
    @Expose
    private Integer id;

    @SerializedName("mac")
    @Expose
    private String mac;

    public String getDevicename() {
        return this.devicename;
    }

    public Integer getId() {
        return this.id;
    }

    public String getMac() {
        return this.mac;
    }

    public void setDevicename(String str) {
        this.devicename = str;
    }

    public void setId(Integer num) {
        this.id = num;
    }

    public void setMac(String str) {
        this.mac = str;
    }
}
