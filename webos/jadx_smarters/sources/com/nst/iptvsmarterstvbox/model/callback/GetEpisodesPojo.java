package com.nst.iptvsmarterstvbox.model.callback;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GetEpisodesPojo {

    @SerializedName("1")
    @Expose
    public List<GetEpisdoeDetailsCallback> episodeDetailList = null;

    public List<GetEpisdoeDetailsCallback> getEpisodeDetailList() {
        return this.episodeDetailList;
    }

    public void setEpisodeDetailList(List<GetEpisdoeDetailsCallback> list) {
        this.episodeDetailList = list;
    }
}
