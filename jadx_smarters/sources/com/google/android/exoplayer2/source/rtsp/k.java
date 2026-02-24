package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.a;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements a.InterfaceC0243a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25741a;

    public k(long j9) {
        this.f25741a = j9;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a.InterfaceC0243a
    public a a(int i9) {
        j jVar = new j(this.f25741a);
        jVar.a(K3.i.a(i9 * 2));
        return jVar;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a.InterfaceC0243a
    public /* synthetic */ a.InterfaceC0243a b() {
        return K3.b.a(this);
    }
}
