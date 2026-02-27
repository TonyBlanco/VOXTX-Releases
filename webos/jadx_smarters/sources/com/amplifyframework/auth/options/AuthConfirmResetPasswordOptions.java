package com.amplifyframework.auth.options;

/* JADX INFO: loaded from: classes.dex */
public abstract class AuthConfirmResetPasswordOptions {

    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthConfirmResetPasswordOptions build();

        public abstract T getThis();
    }

    public static final class DefaultAuthConfirmResetPasswordOptions extends AuthConfirmResetPasswordOptions {
        private DefaultAuthConfirmResetPasswordOptions() {
        }

        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthConfirmResetPasswordOptions;
        }

        public int hashCode() {
            return DefaultAuthConfirmResetPasswordOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthConfirmResetPasswordOptions.class.getSimpleName();
        }
    }

    public static DefaultAuthConfirmResetPasswordOptions defaults() {
        return new DefaultAuthConfirmResetPasswordOptions();
    }
}
