package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IntegrityTokenRequest {

    public static abstract class Builder {
        public abstract IntegrityTokenRequest build();

        public abstract Builder setCloudProjectNumber(long j9);

        public abstract Builder setNonce(String str);
    }

    public static Builder builder() {
        return new a();
    }

    public abstract Long cloudProjectNumber();

    public abstract String nonce();
}
