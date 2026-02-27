package com.nst.iptvsmarterstvbox.model.callback;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.nst.iptvsmarterstvbox.model.pojo.TMDBCastsPojo;
import com.nst.iptvsmarterstvbox.model.pojo.TMDBCrewPojo;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public class TMDBCastsCallback {

    @SerializedName("cast")
    @Expose
    private List<TMDBCastsPojo> cast = null;

    @SerializedName("crew")
    @Expose
    private List<TMDBCrewPojo> crew = null;

    @SerializedName(Name.MARK)
    @Expose
    private Integer id;

    public List<TMDBCastsPojo> getCast() {
        return this.cast;
    }

    public List<TMDBCrewPojo> getCrew() {
        return this.crew;
    }

    public Integer getId() {
        return this.id;
    }

    public void setCast(List<TMDBCastsPojo> list) {
        this.cast = list;
    }

    public void setCrew(List<TMDBCrewPojo> list) {
        this.crew = list;
    }

    public void setId(Integer num) {
        this.id = num;
    }
}
