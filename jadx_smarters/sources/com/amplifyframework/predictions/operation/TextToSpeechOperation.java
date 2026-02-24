package com.amplifyframework.predictions.operation;

import com.amplifyframework.core.async.AmplifyOperation;
import com.amplifyframework.core.category.CategoryType;

/* JADX INFO: loaded from: classes.dex */
public abstract class TextToSpeechOperation<R> extends AmplifyOperation<R> {
    public TextToSpeechOperation(R r9) {
        super(CategoryType.PREDICTIONS, r9);
    }
}
