package com.amazonaws.mobile.client;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public class SignInUIOptions {
    private final Builder builder;

    public static class Builder {
        private Integer backgroundColor;
        private String browserPackage;
        private boolean canCancel;
        private HostedUIOptions hostedUIOptions;
        private Integer logo;
        private Class<? extends Activity> nextActivityClass;

        public Builder backgroundColor(Integer num) {
            this.backgroundColor = num;
            return this;
        }

        public Builder browserPackage(String str) {
            this.browserPackage = str;
            return this;
        }

        public SignInUIOptions build() {
            return new SignInUIOptions(this);
        }

        public Builder canCancel(boolean z9) {
            this.canCancel = z9;
            return this;
        }

        public Builder hostedUIOptions(HostedUIOptions hostedUIOptions) {
            this.hostedUIOptions = hostedUIOptions;
            return this;
        }

        public Builder logo(Integer num) {
            this.logo = num;
            return this;
        }

        public Builder nextActivity(Class<? extends Activity> cls) {
            this.nextActivityClass = cls;
            return this;
        }
    }

    public SignInUIOptions(Builder builder) {
        this.builder = builder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean canCancel() {
        return this.builder.canCancel;
    }

    public Integer getBackgroundColor() {
        return this.builder.backgroundColor;
    }

    public String getBrowserPackage() {
        return this.builder.browserPackage;
    }

    public HostedUIOptions getHostedUIOptions() {
        return this.builder.hostedUIOptions;
    }

    public Integer getLogo() {
        return this.builder.logo;
    }

    public Class<? extends Activity> nextActivity() {
        return this.builder.nextActivityClass;
    }
}
