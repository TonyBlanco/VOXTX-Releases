package com.amplifyframework.api.graphql;

import O.c;

/* JADX INFO: loaded from: classes.dex */
public final class GraphQLPathSegment {
    private final Object value;

    public GraphQLPathSegment(int i9) {
        this.value = Integer.valueOf(i9);
    }

    public GraphQLPathSegment(String str) {
        this.value = str;
    }

    public boolean equals(Object obj) {
        Object objValueOf;
        Object objValueOf2;
        if (this == obj) {
            return true;
        }
        if (obj != null && GraphQLPathSegment.class == obj.getClass()) {
            GraphQLPathSegment graphQLPathSegment = (GraphQLPathSegment) obj;
            if (isString() && graphQLPathSegment.isString()) {
                objValueOf = getAsString();
                objValueOf2 = graphQLPathSegment.getAsString();
            } else if (isInteger() && graphQLPathSegment.isInteger()) {
                objValueOf = Integer.valueOf(getAsInt());
                objValueOf2 = Integer.valueOf(graphQLPathSegment.getAsInt());
            }
            return c.a(objValueOf, objValueOf2);
        }
        return false;
    }

    public int getAsInt() {
        if (isInteger()) {
            return ((Integer) this.value).intValue();
        }
        throw new ClassCastException("Not an int: " + this.value.getClass().getSimpleName());
    }

    public String getAsString() {
        if (isString()) {
            return (String) this.value;
        }
        throw new ClassCastException("Not a String: " + this.value.getClass().getSimpleName());
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public boolean isInteger() {
        return this.value instanceof Integer;
    }

    public boolean isString() {
        return this.value instanceof String;
    }

    public String toString() {
        return "GraphQLPathSegment{value='" + this.value + "'}";
    }
}
