package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.QuerySortBy;
import com.amplifyframework.core.model.query.QuerySortOrder;

/* JADX INFO: loaded from: classes.dex */
public final class QueryField {
    private final String fieldName;
    private final String modelName;

    private QueryField(String str, String str2) {
        this.modelName = str;
        this.fieldName = str2;
    }

    public static QueryField field(String str) {
        return field(null, str);
    }

    public static QueryField field(String str, String str2) {
        return new QueryField(str, str2);
    }

    public QuerySortBy ascending() {
        return new QuerySortBy(this.modelName, this.fieldName, QuerySortOrder.ASCENDING);
    }

    public QueryPredicateOperation<String> beginsWith(String str) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new BeginsWithQueryOperator(str));
    }

    public <T extends Comparable<T>> QueryPredicateOperation<T> between(T t9, T t10) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new BetweenQueryOperator(t9, t10));
    }

    public QueryPredicateOperation<String> contains(String str) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new ContainsQueryOperator(str));
    }

    public QuerySortBy descending() {
        return new QuerySortBy(this.modelName, this.fieldName, QuerySortOrder.DESCENDING);
    }

    public QueryPredicateOperation<Object> eq(Object obj) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new EqualQueryOperator(obj));
    }

    public <T extends Comparable<T>> QueryPredicateOperation<T> ge(T t9) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new GreaterOrEqualQueryOperator(t9));
    }

    public <T extends Comparable<T>> QueryPredicateOperation<T> gt(T t9) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new GreaterThanQueryOperator(t9));
    }

    public <T extends Comparable<T>> QueryPredicateOperation<T> le(T t9) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new LessOrEqualQueryOperator(t9));
    }

    public <T extends Comparable<T>> QueryPredicateOperation<T> lt(T t9) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new LessThanQueryOperator(t9));
    }

    public QueryPredicateOperation<Object> ne(Object obj) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new NotEqualQueryOperator(obj));
    }

    public QueryPredicateOperation<String> notContains(String str) {
        return new QueryPredicateOperation<>(this.modelName, this.fieldName, new NotContainsQueryOperator(str));
    }
}
