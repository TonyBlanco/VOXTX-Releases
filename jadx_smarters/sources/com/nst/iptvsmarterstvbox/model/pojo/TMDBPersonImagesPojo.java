package com.nst.iptvsmarterstvbox.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TMDBPersonImagesPojo {

    @SerializedName("profiles")
    @Expose
    private List<TMDBPersonProfilePojo> profiles = null;

    public List<TMDBPersonProfilePojo> getProfiles() {
        return this.profiles;
    }

    public void setProfiles(List<TMDBPersonProfilePojo> list) {
        this.profiles = list;
    }
}
