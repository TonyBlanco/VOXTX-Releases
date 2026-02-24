package com.amplifyframework.api.graphql;

import O.c;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.util.Immutable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GraphQLResponse<R> {
    private final R data;
    private final List<Error> errors;

    public static final class Error {
        private final Map<String, Object> extensions;
        private final List<GraphQLLocation> locations;
        private final String message;
        private final List<GraphQLPathSegment> path;

        public Error(String str, List<GraphQLLocation> list, List<GraphQLPathSegment> list2, Map<String, Object> map) {
            Objects.requireNonNull(str);
            this.message = str;
            this.locations = list;
            this.path = list2;
            this.extensions = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Error.class != obj.getClass()) {
                return false;
            }
            Error error = (Error) obj;
            return c.a(this.message, error.message) && c.a(this.locations, error.locations) && c.a(this.path, error.path) && c.a(this.extensions, error.extensions);
        }

        public Map<String, Object> getExtensions() {
            return Immutable.of(this.extensions);
        }

        public List<GraphQLLocation> getLocations() {
            return Immutable.of(this.locations);
        }

        public String getMessage() {
            return this.message;
        }

        public List<GraphQLPathSegment> getPath() {
            return Immutable.of(this.path);
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            List<GraphQLLocation> list = this.locations;
            int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
            List<GraphQLPathSegment> list2 = this.path;
            int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
            Map<String, Object> map = this.extensions;
            return iHashCode3 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "GraphQLResponse.Error{message='" + this.message + "', locations='" + this.locations + "', path='" + this.path + "', extensions='" + this.extensions + "'}";
        }
    }

    public interface Factory {
        <R> GraphQLResponse<R> buildResponse(GraphQLRequest<R> graphQLRequest, String str) throws ApiException;
    }

    public GraphQLResponse(R r9, List<Error> list) {
        this.data = r9;
        ArrayList arrayList = new ArrayList();
        this.errors = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GraphQLResponse.class != obj.getClass()) {
            return false;
        }
        GraphQLResponse graphQLResponse = (GraphQLResponse) obj;
        if (c.a(this.data, graphQLResponse.data)) {
            return c.a(this.errors, graphQLResponse.errors);
        }
        return false;
    }

    public R getData() {
        return this.data;
    }

    public List<Error> getErrors() {
        return this.errors;
    }

    public boolean hasData() {
        return this.data != null;
    }

    public boolean hasErrors() {
        return this.errors.size() > 0;
    }

    public int hashCode() {
        R r9 = this.data;
        int iHashCode = (r9 != null ? r9.hashCode() : 0) * 31;
        List<Error> list = this.errors;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "GraphQLResponse{data='" + this.data + "', errors='" + this.errors + "'}";
    }
}
