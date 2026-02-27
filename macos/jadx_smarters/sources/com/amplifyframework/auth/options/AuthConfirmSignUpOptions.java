package com.amplifyframework.auth.options;

/* JADX INFO: loaded from: classes.dex */
public abstract class AuthConfirmSignUpOptions {

    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthConfirmSignUpOptions build();

        public abstract T getThis();
    }

    public static final class DefaultAuthConfirmSignUpOptions extends AuthConfirmSignUpOptions {
        private DefaultAuthConfirmSignUpOptions() {
        }

        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthConfirmSignUpOptions;
        }

        public int hashCode() {
            return DefaultAuthConfirmSignUpOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthConfirmSignUpOptions.class.getSimpleName();
        }
    }

    public static DefaultAuthConfirmSignUpOptions defaults() {
        return new DefaultAuthConfirmSignUpOptions();
    }
}
