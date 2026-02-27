package com.amazonaws.mobile.client;

/* JADX INFO: loaded from: classes.dex */
public enum IdentityProvider {
    AMAZON("www.amazon.com"),
    FACEBOOK("graph.facebook.com"),
    GOOGLE("accounts.google.com"),
    TWITTER("api.twitter.com"),
    DEVELOPER("TryRoom");

    private final String key;

    IdentityProvider(String str) {
        this.key = str;
    }

    public boolean equals(String str) {
        return this.key.equals(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.key;
    }
}
