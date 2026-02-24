package com.amplifyframework.core.model.query.predicate;

/* JADX INFO: loaded from: classes.dex */
public interface QueryPredicate extends Evaluable<Object> {
    QueryPredicate and(QueryPredicate queryPredicate);

    QueryPredicate or(QueryPredicate queryPredicate);
}
