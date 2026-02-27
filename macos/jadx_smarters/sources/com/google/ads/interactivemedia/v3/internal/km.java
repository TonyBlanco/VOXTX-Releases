package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class km implements jm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ kn f23509a;

    public /* synthetic */ km(kn knVar) {
        this.f23509a = knVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jm
    public final void a(Exception exc) {
        cd.c("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.f23509a.f23511c.b(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jm
    public final void b() {
        kn knVar = this.f23509a;
        if (knVar.f23520l != null) {
            knVar.f23520l.b();
        }
    }
}
