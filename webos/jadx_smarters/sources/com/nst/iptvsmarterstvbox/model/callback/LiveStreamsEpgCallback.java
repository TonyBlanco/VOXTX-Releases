package com.nst.iptvsmarterstvbox.model.callback;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.nst.iptvsmarterstvbox.model.pojo.EpgListingPojo;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LiveStreamsEpgCallback implements Serializable {

    @SerializedName("epg_listings")
    @Expose
    private List<EpgListingPojo> epgListingPojos = null;

    public List<EpgListingPojo> getEpgListingPojos() {
        return this.epgListingPojos;
    }

    public void setEpgListingPojos(List<EpgListingPojo> list) {
        this.epgListingPojos = list;
    }
}
