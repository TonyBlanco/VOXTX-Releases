package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes3.dex */
final class d extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27837a;

    @Override // com.google.android.play.core.integrity.w
    public final w a(String str) {
        this.f27837a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.w
    public final IntegrityTokenResponse b() {
        String str = this.f27837a;
        if (str != null) {
            return new f(str, null);
        }
        throw new IllegalStateException("Missing required properties: token");
    }
}
