package com.nst.iptvsmarterstvbox.model.callback;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.nst.iptvsmarterstvbox.model.pojo.TMDBTrailerPojo;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public class TMDBTrailerCallback {

    @SerializedName(Name.MARK)
    @Expose
    private Integer id;

    @SerializedName("results")
    @Expose
    private List<TMDBTrailerPojo> results = null;

    public Integer getId() {
        return this.id;
    }

    public List<TMDBTrailerPojo> getResults() {
        return this.results;
    }

    public void setId(Integer num) {
        this.id = num;
    }

    public void setResults(List<TMDBTrailerPojo> list) {
        this.results = list;
    }
}
