package com.amplifyframework.api.graphql;

/* JADX INFO: loaded from: classes.dex */
public final class GraphQLLocation {
    private int column;
    private int line;

    public GraphQLLocation(int i9, int i10) {
        this.line = i9;
        this.column = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GraphQLLocation.class != obj.getClass()) {
            return false;
        }
        GraphQLLocation graphQLLocation = (GraphQLLocation) obj;
        return this.line == graphQLLocation.line && this.column == graphQLLocation.column;
    }

    public int getColumn() {
        return this.column;
    }

    public int getLine() {
        return this.line;
    }

    public int hashCode() {
        return (this.line * 31) + this.column;
    }

    public String toString() {
        return "GraphQLLocation{line='" + this.line + "', column='" + this.column + "'}";
    }
}
