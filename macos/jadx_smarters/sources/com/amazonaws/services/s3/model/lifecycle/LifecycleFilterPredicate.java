package com.amazonaws.services.s3.model.lifecycle;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class LifecycleFilterPredicate implements Serializable {
    public abstract void accept(LifecyclePredicateVisitor lifecyclePredicateVisitor);
}
