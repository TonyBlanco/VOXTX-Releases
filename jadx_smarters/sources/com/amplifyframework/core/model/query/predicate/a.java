package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.predicate.QueryPredicateGroup;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static QueryPredicate a(QueryPredicate queryPredicate) {
        return new QueryPredicateGroup(QueryPredicateGroup.Type.NOT, Collections.singletonList(queryPredicate));
    }
}
