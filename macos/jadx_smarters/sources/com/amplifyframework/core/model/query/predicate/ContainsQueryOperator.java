package com.amplifyframework.core.model.query.predicate;

import O.c;
import com.amplifyframework.core.model.query.predicate.QueryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class ContainsQueryOperator extends QueryOperator<String> {
    private final String value;

    public ContainsQueryOperator(String str) {
        super(QueryOperator.Type.CONTAINS);
        this.value = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ContainsQueryOperator.class != obj.getClass()) {
            return false;
        }
        ContainsQueryOperator containsQueryOperator = (ContainsQueryOperator) obj;
        return c.a(type(), containsQueryOperator.type()) && c.a(value(), containsQueryOperator.value());
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(String str) {
        return str.contains(this.value);
    }

    public int hashCode() {
        return c.b(type(), value());
    }

    public String toString() {
        return "ContainsQueryOperator { type: " + type() + ", value: " + value() + " }";
    }

    public Object value() {
        return this.value;
    }
}
