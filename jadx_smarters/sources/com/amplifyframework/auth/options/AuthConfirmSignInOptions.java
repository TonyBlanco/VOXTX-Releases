package com.amplifyframework.auth.options;

/* JADX INFO: loaded from: classes.dex */
public abstract class AuthConfirmSignInOptions {

    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthConfirmSignInOptions build();

        public abstract T getThis();
    }

    public static final class DefaultAuthConfirmSignInOptions extends AuthConfirmSignInOptions {
        private DefaultAuthConfirmSignInOptions() {
        }

        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthConfirmSignInOptions;
        }

        public int hashCode() {
            return DefaultAuthConfirmSignInOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthConfirmSignInOptions.class.getSimpleName();
        }
    }

    public static DefaultAuthConfirmSignInOptions defaults() {
        return new DefaultAuthConfirmSignInOptions();
    }
}
