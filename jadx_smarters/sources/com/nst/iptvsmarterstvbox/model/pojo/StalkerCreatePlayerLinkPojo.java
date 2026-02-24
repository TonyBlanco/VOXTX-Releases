package com.nst.iptvsmarterstvbox.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public class StalkerCreatePlayerLinkPojo {

    @SerializedName("cmd")
    @Expose
    private String cmd;

    @SerializedName("error")
    @Expose
    private String error;

    @SerializedName(Name.MARK)
    @Expose
    private String id;

    @SerializedName("load")
    @Expose
    private String load;

    @SerializedName("subtitles")
    @Expose
    private List<Object> subtitles = null;

    public String getCmd() {
        return this.cmd;
    }

    public String getError() {
        return this.error;
    }

    public String getId() {
        return this.id;
    }

    public String getLoad() {
        return this.load;
    }

    public List<Object> getSubtitles() {
        return this.subtitles;
    }

    public void setCmd(String str) {
        this.cmd = str;
    }

    public void setError(String str) {
        this.error = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLoad(String str) {
        this.load = str;
    }

    public void setSubtitles(List<Object> list) {
        this.subtitles = list;
    }
}
