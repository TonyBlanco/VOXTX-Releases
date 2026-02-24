package com.amplifyframework.core.model.query.predicate;

/* JADX INFO: loaded from: classes.dex */
final class MatchAllQueryPredicate implements QueryPredicate {
    private MatchAllQueryPredicate() {
    }

    public static MatchAllQueryPredicate instance() {
        return new MatchAllQueryPredicate();
    }

    @Override // com.amplifyframework.core.model.query.predicate.QueryPredicate
    public QueryPredicate and(QueryPredicate queryPredicate) {
        return queryPredicate;
    }

    public boolean equals(Object obj) {
        return obj instanceof MatchAllQueryPredicate;
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(Object obj) {
        return true;
    }

    public int hashCode() {
        return MatchAllQueryPredicate.class.hashCode();
    }

    @Override // com.amplifyframework.core.model.query.predicate.QueryPredicate
    public QueryPredicate or(QueryPredicate queryPredicate) {
        return this;
    }

    public String toString() {
        return MatchAllQueryPredicate.class.getSimpleName();
    }
}
