package com.nst.iptvsmarterstvbox.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BillingUpdateDevicesPojo {

    @SerializedName("devices")
    @Expose
    private List<BillingUpdateDevicePojo> devices = null;

    public List<BillingUpdateDevicePojo> getDevices() {
        return this.devices;
    }

    public void setDevices(List<BillingUpdateDevicePojo> list) {
        this.devices = list;
    }
}
