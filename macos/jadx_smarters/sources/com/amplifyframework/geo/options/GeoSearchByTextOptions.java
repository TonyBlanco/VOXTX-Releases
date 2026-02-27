package com.amplifyframework.geo.options;

import com.amplifyframework.geo.models.CountryCode;
import com.amplifyframework.geo.models.SearchArea;
import com.amplifyframework.util.Immutable;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GeoSearchByTextOptions {
    private final List<CountryCode> countries;
    private final int maxResults;
    private final SearchArea searchArea;

    public static class Builder {
        private static final int DEFAULT_MAX_RESULTS_LIMIT = 50;
        private SearchArea searchArea;
        private int maxResults = DEFAULT_MAX_RESULTS_LIMIT;
        private List<CountryCode> countries = Collections.singletonList(CountryCode.USA);

        public GeoSearchByTextOptions build() {
            return new GeoSearchByTextOptions(this);
        }

        public Builder countries(List<CountryCode> list) {
            Objects.requireNonNull(list);
            this.countries = list;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Country filter cannot be empty.");
            }
            return this;
        }

        public Builder maxResults(int i9) {
            this.maxResults = i9;
            return this;
        }

        public Builder searchArea(SearchArea searchArea) {
            Objects.requireNonNull(searchArea);
            this.searchArea = searchArea;
            return this;
        }
    }

    public GeoSearchByTextOptions(Builder builder) {
        this.maxResults = builder.maxResults;
        this.searchArea = builder.searchArea;
        this.countries = builder.countries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeoSearchByTextOptions defaults() {
        return builder().build();
    }

    public List<CountryCode> getCountries() {
        return Immutable.of(this.countries);
    }

    public int getMaxResults() {
        return this.maxResults;
    }

    public SearchArea getSearchArea() {
        return this.searchArea;
    }
}
