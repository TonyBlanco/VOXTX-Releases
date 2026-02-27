package com.nst.iptvsmarterstvbox.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public class BillingLoginClientPojo {

    @SerializedName("devices")
    @Expose
    private List<BillingDevicesPojo> devices = null;

    @SerializedName(Name.MARK)
    @Expose
    private Integer id;

    public List<BillingDevicesPojo> getDevices() {
        return this.devices;
    }

    public Integer getId() {
        return this.id;
    }

    public void setDevices(List<BillingDevicesPojo> list) {
        this.devices = list;
    }

    public void setId(Integer num) {
        this.id = num;
    }
}
