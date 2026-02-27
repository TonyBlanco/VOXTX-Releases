package com.amazonaws.mobile.client;

/* JADX INFO: loaded from: classes.dex */
public class SignOutOptions {
    private final Builder builder;

    public static class Builder {
        private String browserPackage;
        private boolean invalidateTokens;
        private boolean signOutGlobally;

        public Builder browserPackage(String str) {
            this.browserPackage = str;
            return this;
        }

        public SignOutOptions build() {
            return new SignOutOptions(this);
        }

        public Builder invalidateTokens(boolean z9) {
            this.invalidateTokens = z9;
            return this;
        }

        public Builder signOutGlobally(boolean z9) {
            this.signOutGlobally = z9;
            return this;
        }
    }

    public SignOutOptions(Builder builder) {
        this.builder = builder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getBrowserPackage() {
        return this.builder.browserPackage;
    }

    public boolean isInvalidateTokens() {
        return this.builder.invalidateTokens;
    }

    public boolean isSignOutGlobally() {
        return this.builder.signOutGlobally;
    }
}
