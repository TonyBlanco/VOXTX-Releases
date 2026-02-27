package com.amplifyframework.storage.operation;

import com.amplifyframework.core.async.AmplifyOperation;
import com.amplifyframework.core.async.Cancelable;
import com.amplifyframework.core.async.Resumable;
import com.amplifyframework.core.category.CategoryType;

/* JADX INFO: loaded from: classes.dex */
public abstract class StorageUploadOperation<R> extends AmplifyOperation<R> implements Resumable, Cancelable {
    public StorageUploadOperation(R r9) {
        super(CategoryType.STORAGE, r9);
    }
}
