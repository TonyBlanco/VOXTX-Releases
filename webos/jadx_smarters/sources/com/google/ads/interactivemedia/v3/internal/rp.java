package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rp implements rv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f24435c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ rp f24434b = new rp(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ rp f24433a = new rp(0);

    private /* synthetic */ rp(int i9) {
        this.f24435c = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rv
    public final int a(Object obj) {
        rh rhVar = (rh) obj;
        if (this.f24435c == 0) {
            int i9 = rw.f24441a;
            return rhVar.f24365a.startsWith("OMX.google") ? 1 : 0;
        }
        int i10 = rw.f24441a;
        String str = rhVar.f24365a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (cq.f22640a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
