package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
final class m implements IntegrityManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f27846a;

    public m(t tVar) {
        this.f27846a = tVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f27846a.b(integrityTokenRequest);
    }
}
