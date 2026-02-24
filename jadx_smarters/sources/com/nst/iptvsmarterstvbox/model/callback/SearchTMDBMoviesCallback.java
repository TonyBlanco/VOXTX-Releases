package com.nst.iptvsmarterstvbox.model.callback;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.nst.iptvsmarterstvbox.model.pojo.SearchTMDBMoviesResultPojo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SearchTMDBMoviesCallback {

    @SerializedName("page")
    @Expose
    private Integer page;

    @SerializedName("results")
    @Expose
    private List<SearchTMDBMoviesResultPojo> results = null;

    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;

    @SerializedName("total_results")
    @Expose
    private Integer totalResults;

    public Integer getPage() {
        return this.page;
    }

    public List<SearchTMDBMoviesResultPojo> getResults() {
        return this.results;
    }

    public Integer getTotalPages() {
        return this.totalPages;
    }

    public Integer getTotalResults() {
        return this.totalResults;
    }

    public void setPage(Integer num) {
        this.page = num;
    }

    public void setResults(List<SearchTMDBMoviesResultPojo> list) {
        this.results = list;
    }

    public void setTotalPages(Integer num) {
        this.totalPages = num;
    }

    public void setTotalResults(Integer num) {
        this.totalResults = num;
    }
}
