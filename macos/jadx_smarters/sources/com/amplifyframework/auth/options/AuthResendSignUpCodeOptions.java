package com.amplifyframework.auth.options;

/* JADX INFO: loaded from: classes.dex */
public abstract class AuthResendSignUpCodeOptions {

    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthResendSignUpCodeOptions build();

        public abstract T getThis();
    }

    public static final class DefaultAuthResendSignUpCodeOptions extends AuthResendSignUpCodeOptions {
        private DefaultAuthResendSignUpCodeOptions() {
        }

        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthResendSignUpCodeOptions;
        }

        public int hashCode() {
            return DefaultAuthResendSignUpCodeOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthResendSignUpCodeOptions.class.getSimpleName();
        }
    }

    public static DefaultAuthResendSignUpCodeOptions defaults() {
        return new DefaultAuthResendSignUpCodeOptions();
    }
}
