package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes3.dex */
final class c extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f27836b;

    public /* synthetic */ c(String str, Long l9, b bVar) {
        this.f27835a = str;
        this.f27836b = l9;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f27836b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f27835a.equals(integrityTokenRequest.nonce())) {
                Long l9 = this.f27836b;
                Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
                if (l9 != null ? l9.equals(lCloudProjectNumber) : lCloudProjectNumber == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f27835a.hashCode() ^ 1000003;
        Long l9 = this.f27836b;
        return (iHashCode * 1000003) ^ (l9 == null ? 0 : l9.hashCode());
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f27835a;
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.f27835a + ", cloudProjectNumber=" + this.f27836b + "}";
    }
}
