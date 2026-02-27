package com.amplifyframework.auth.result;

import O.c;
import com.amplifyframework.auth.AuthException;

/* JADX INFO: loaded from: classes.dex */
public final class AuthSessionResult<T> {
    private final AuthException error;
    private final Type type;
    private final T value;

    public enum Type {
        SUCCESS,
        FAILURE
    }

    private AuthSessionResult(T t9, AuthException authException, Type type) {
        this.value = t9;
        this.error = authException;
        this.type = type;
    }

    public static <T> AuthSessionResult<T> failure(AuthException authException) {
        return new AuthSessionResult<>(null, authException, Type.FAILURE);
    }

    public static <T> AuthSessionResult<T> success(T t9) {
        return new AuthSessionResult<>(t9, null, Type.SUCCESS);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AuthSessionResult)) {
            return false;
        }
        AuthSessionResult authSessionResult = (AuthSessionResult) obj;
        return c.a(getValue(), authSessionResult.getValue()) && c.a(getError(), authSessionResult.getError()) && c.a(getType(), authSessionResult.getType());
    }

    public AuthException getError() {
        return this.error;
    }

    public Type getType() {
        return this.type;
    }

    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        return c.b(getValue(), getError(), getType());
    }

    public String toString() {
        return "AuthSessionResult{value=" + getValue() + ", error=" + getError() + ", type=" + getType() + '}';
    }
}
