package com.amplifyframework.predictions.operation;

import com.amplifyframework.core.async.AmplifyOperation;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.predictions.models.IdentifyAction;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class IdentifyOperation<R> extends AmplifyOperation<R> {
    private final IdentifyAction identifyAction;

    public IdentifyOperation(IdentifyAction identifyAction, R r9) {
        super(CategoryType.PREDICTIONS, r9);
        Objects.requireNonNull(identifyAction);
        this.identifyAction = identifyAction;
    }

    public IdentifyAction getIdentifyAction() {
        return this.identifyAction;
    }
}
