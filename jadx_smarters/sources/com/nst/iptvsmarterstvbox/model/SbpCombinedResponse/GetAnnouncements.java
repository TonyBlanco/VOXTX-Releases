package com.nst.iptvsmarterstvbox.model.SbpCombinedResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GetAnnouncements {

    @SerializedName("data")
    @Expose
    private List<AnnouncementsData> data;

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("result")
    @Expose
    private String result;

    @SerializedName("totalrecords")
    @Expose
    private Integer totalrecords;

    public List<AnnouncementsData> getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public String getResult() {
        return this.result;
    }

    public Integer getTotalrecords() {
        return this.totalrecords;
    }

    public void setData(List<AnnouncementsData> list) {
        this.data = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setResult(String str) {
        this.result = str;
    }

    public void setTotalrecords(Integer num) {
        this.totalrecords = num;
    }
}
