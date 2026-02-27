package com.amplifyframework.core.model.query.predicate;

import O.c;
import com.amplifyframework.core.model.query.predicate.QueryOperator;
import java.lang.Comparable;

/* JADX INFO: loaded from: classes.dex */
public final class BetweenQueryOperator<T extends Comparable<T>> extends QueryOperator<T> {
    private final T end;
    private final T start;

    public BetweenQueryOperator(T t9, T t10) {
        super(QueryOperator.Type.BETWEEN);
        this.start = t9;
        this.end = t10;
    }

    public T end() {
        return this.end;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BetweenQueryOperator.class != obj.getClass()) {
            return false;
        }
        BetweenQueryOperator betweenQueryOperator = (BetweenQueryOperator) obj;
        return c.a(type(), betweenQueryOperator.type()) && c.a(start(), betweenQueryOperator.start()) && c.a(end(), betweenQueryOperator.end());
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(T t9) {
        return t9.compareTo(this.start) >= 0 && t9.compareTo(this.end) <= 0;
    }

    public int hashCode() {
        return c.b(type(), start(), end());
    }

    public T start() {
        return this.start;
    }

    public String toString() {
        return "BetweenQueryOperator { type: " + type() + ", start: " + this.start + ", end: " + this.end + " }";
    }
}
