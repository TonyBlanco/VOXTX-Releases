package com.amplifyframework.core.model.query;

/* JADX INFO: loaded from: classes.dex */
public final class Page {
    public static final int DEFAULT_LIMIT = 100;

    private Page() {
    }

    public static QueryPaginationInput firstPage() {
        return startingAt(0);
    }

    public static QueryPaginationInput firstResult() {
        return startingAt(0).withLimit(1);
    }

    public static QueryPaginationInput startingAt(int i9) {
        return new QueryPaginationInput(i9, 100);
    }
}
