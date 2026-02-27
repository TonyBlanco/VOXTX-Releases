package com.amplifyframework.auth.options;

/* JADX INFO: loaded from: classes.dex */
public abstract class AuthSignInOptions {

    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthSignInOptions build();

        public abstract T getThis();
    }

    public static final class DefaultAuthSignInOptions extends AuthSignInOptions {
        private DefaultAuthSignInOptions() {
        }

        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthSignInOptions;
        }

        public int hashCode() {
            return DefaultAuthSignInOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthSignInOptions.class.getSimpleName();
        }
    }

    public static DefaultAuthSignInOptions defaults() {
        return new DefaultAuthSignInOptions();
    }
}
