package com.amplifyframework.geo.options;

/* JADX INFO: loaded from: classes.dex */
public class GeoSearchByCoordinatesOptions {
    private final int maxResults;

    public static class Builder {
        private static final int DEFAULT_MAX_RESULTS_LIMIT = 50;
        private int maxResults = DEFAULT_MAX_RESULTS_LIMIT;

        public GeoSearchByCoordinatesOptions build() {
            return new GeoSearchByCoordinatesOptions(this);
        }

        public Builder maxResults(int i9) {
            this.maxResults = i9;
            return this;
        }
    }

    public GeoSearchByCoordinatesOptions(Builder builder) {
        this.maxResults = builder.maxResults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeoSearchByCoordinatesOptions defaults() {
        return builder().build();
    }

    public int getMaxResults() {
        return this.maxResults;
    }
}
