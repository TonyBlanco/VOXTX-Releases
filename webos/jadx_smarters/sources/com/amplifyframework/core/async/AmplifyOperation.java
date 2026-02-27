package com.amplifyframework.core.async;

import com.amplifyframework.core.category.CategoryType;

/* JADX INFO: loaded from: classes.dex */
public abstract class AmplifyOperation<R> {
    private final CategoryType categoryType;
    private final R request;

    public AmplifyOperation(CategoryType categoryType, R r9) {
        this.categoryType = categoryType;
        this.request = r9;
    }

    public final CategoryType getCategoryType() {
        return this.categoryType;
    }

    public R getRequest() {
        return this.request;
    }

    public abstract void start();
}
