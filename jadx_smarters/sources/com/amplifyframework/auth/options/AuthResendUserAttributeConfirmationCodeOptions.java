package com.amplifyframework.auth.options;

/* JADX INFO: loaded from: classes.dex */
public abstract class AuthResendUserAttributeConfirmationCodeOptions {

    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthResendUserAttributeConfirmationCodeOptions build();

        public abstract T getThis();
    }

    public static final class DefaultAuthResendUserAttributeConfirmationCodeOptions extends AuthResendUserAttributeConfirmationCodeOptions {
        private DefaultAuthResendUserAttributeConfirmationCodeOptions() {
        }

        public boolean equals(Object obj) {
            return obj instanceof DefaultAuthResendUserAttributeConfirmationCodeOptions;
        }

        public int hashCode() {
            return DefaultAuthResendUserAttributeConfirmationCodeOptions.class.hashCode();
        }

        public String toString() {
            return DefaultAuthResendUserAttributeConfirmationCodeOptions.class.getSimpleName();
        }
    }

    public static DefaultAuthResendUserAttributeConfirmationCodeOptions defaults() {
        return new DefaultAuthResendUserAttributeConfirmationCodeOptions();
    }
}
