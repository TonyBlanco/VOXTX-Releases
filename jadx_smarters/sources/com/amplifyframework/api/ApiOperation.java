package com.amplifyframework.api;

import com.amplifyframework.core.async.AmplifyOperation;
import com.amplifyframework.core.async.Cancelable;
import com.amplifyframework.core.category.CategoryType;

/* JADX INFO: loaded from: classes.dex */
public abstract class ApiOperation<R> extends AmplifyOperation<R> implements Cancelable {
    public ApiOperation(R r9) {
        super(CategoryType.API, r9);
    }
}
