package com.amplifyframework.core.model;

import O.c;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ModelIndex {
    private final List<String> indexFieldNames;
    private final String indexName;

    public static final class Builder {
        private List<String> indexFieldNames;
        private String indexName;

        public ModelIndex build() {
            return new ModelIndex(this.indexName, this.indexFieldNames);
        }

        public Builder indexFieldNames(List<String> list) {
            this.indexFieldNames = list;
            return this;
        }

        public Builder indexName(String str) {
            this.indexName = str;
            return this;
        }
    }

    private ModelIndex(String str, List<String> list) {
        this.indexName = str;
        this.indexFieldNames = list;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelIndex.class != obj.getClass()) {
            return false;
        }
        ModelIndex modelIndex = (ModelIndex) obj;
        if (c.a(this.indexName, modelIndex.indexName)) {
            return c.a(this.indexFieldNames, modelIndex.indexFieldNames);
        }
        return false;
    }

    public List<String> getIndexFieldNames() {
        return this.indexFieldNames;
    }

    public String getIndexName() {
        return this.indexName;
    }

    public int hashCode() {
        String str = this.indexName;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.indexFieldNames;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ModelIndex{indexName='" + this.indexName + "', indexFieldNames=" + this.indexFieldNames + '}';
    }
}
