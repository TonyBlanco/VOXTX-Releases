package com.nst.iptvsmarterstvbox.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public class TMDBTVShowsCreatedByPojo {

    @SerializedName("credit_id")
    @Expose
    private String creditId;

    @SerializedName("gender")
    @Expose
    private Integer gender;

    @SerializedName(Name.MARK)
    @Expose
    private Integer id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("profile_path")
    @Expose
    private Object profilePath;

    public String getCreditId() {
        return this.creditId;
    }

    public Integer getGender() {
        return this.gender;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Object getProfilePath() {
        return this.profilePath;
    }

    public void setCreditId(String str) {
        this.creditId = str;
    }

    public void setGender(Integer num) {
        this.gender = num;
    }

    public void setId(Integer num) {
        this.id = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setProfilePath(Object obj) {
        this.profilePath = obj;
    }
}
