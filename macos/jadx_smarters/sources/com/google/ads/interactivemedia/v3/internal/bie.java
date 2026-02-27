package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class bie extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21485a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final bie f21486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f21487e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bqt f21488f = bqn.aF();

    static {
        bie bieVar = new bie();
        f21486d = bieVar;
        bqn.aL(bie.class, bieVar);
    }

    private bie() {
    }

    public static bie b() {
        return f21486d;
    }

    public final List c() {
        return this.f21488f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21486d, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"e", "f", bhu.class});
        }
        if (i10 == 3) {
            return new bie();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (float[]) bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f21486d;
    }
}
