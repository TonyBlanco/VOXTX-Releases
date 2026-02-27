package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes3.dex */
final class f extends IntegrityTokenResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27838a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenResponse) {
            return this.f27838a.equals(((IntegrityTokenResponse) obj).token());
        }
        return false;
    }

    public final int hashCode() {
        return this.f27838a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "IntegrityTokenResponse{token=" + this.f27838a + "}";
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f27838a;
    }
}
