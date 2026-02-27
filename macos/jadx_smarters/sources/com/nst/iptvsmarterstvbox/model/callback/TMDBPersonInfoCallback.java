package com.nst.iptvsmarterstvbox.model.callback;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.nst.iptvsmarterstvbox.model.pojo.TMDBPersonImagesPojo;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public class TMDBPersonInfoCallback {

    @SerializedName("adult")
    @Expose
    private Boolean adult;

    @SerializedName("also_known_as")
    @Expose
    private List<String> alsoKnownAs = null;

    @SerializedName("biography")
    @Expose
    private String biography;

    @SerializedName("birthday")
    @Expose
    private String birthday;

    @SerializedName("deathday")
    @Expose
    private String deathday;

    @SerializedName("gender")
    @Expose
    private Integer gender;

    @SerializedName("homepage")
    @Expose
    private Object homepage;

    @SerializedName(Name.MARK)
    @Expose
    private Integer id;

    @SerializedName("images")
    @Expose
    private TMDBPersonImagesPojo images;

    @SerializedName("imdb_id")
    @Expose
    private String imdbId;

    @SerializedName("known_for_department")
    @Expose
    private String knownForDepartment;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("place_of_birth")
    @Expose
    private String placeOfBirth;

    @SerializedName("popularity")
    @Expose
    private Double popularity;

    @SerializedName("profile_path")
    @Expose
    private String profilePath;

    public Boolean getAdult() {
        return this.adult;
    }

    public List<String> getAlsoKnownAs() {
        return this.alsoKnownAs;
    }

    public String getBiography() {
        return this.biography;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getDeathday() {
        return this.deathday;
    }

    public Integer getGender() {
        return this.gender;
    }

    public Object getHomepage() {
        return this.homepage;
    }

    public Integer getId() {
        return this.id;
    }

    public TMDBPersonImagesPojo getImages() {
        return this.images;
    }

    public String getImdbId() {
        return this.imdbId;
    }

    public String getKnownForDepartment() {
        return this.knownForDepartment;
    }

    public String getName() {
        return this.name;
    }

    public String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public Double getPopularity() {
        return this.popularity;
    }

    public String getProfilePath() {
        return this.profilePath;
    }

    public void setAdult(Boolean bool) {
        this.adult = bool;
    }

    public void setAlsoKnownAs(List<String> list) {
        this.alsoKnownAs = list;
    }

    public void setBiography(String str) {
        this.biography = str;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public void setDeathday(String str) {
        this.deathday = str;
    }

    public void setGender(Integer num) {
        this.gender = num;
    }

    public void setHomepage(Object obj) {
        this.homepage = obj;
    }

    public void setId(Integer num) {
        this.id = num;
    }

    public void setImages(TMDBPersonImagesPojo tMDBPersonImagesPojo) {
        this.images = tMDBPersonImagesPojo;
    }

    public void setImdbId(String str) {
        this.imdbId = str;
    }

    public void setKnownForDepartment(String str) {
        this.knownForDepartment = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPlaceOfBirth(String str) {
        this.placeOfBirth = str;
    }

    public void setPopularity(Double d9) {
        this.popularity = d9;
    }

    public void setProfilePath(String str) {
        this.profilePath = str;
    }
}
