package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f27839a;

    private h() {
    }

    public /* synthetic */ h(g gVar) {
    }

    public final h a(Context context) {
        context.getClass();
        this.f27839a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.k
    public final j b() {
        Context context = this.f27839a;
        if (context != null) {
            return new j(context, null);
        }
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }
}
