package com.amplifyframework.storage.operation;

import com.amplifyframework.core.async.AmplifyOperation;
import com.amplifyframework.core.category.CategoryType;

/* JADX INFO: loaded from: classes.dex */
public abstract class StorageRemoveOperation<R> extends AmplifyOperation<R> {
    public StorageRemoveOperation(R r9) {
        super(CategoryType.STORAGE, r9);
    }
}
