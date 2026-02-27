package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bhw extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bhw f21428a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bqt f21430e = bqn.aF();

    static {
        bhw bhwVar = new bhw();
        f21428a = bhwVar;
        bqn.aL(bhw.class, bhwVar);
    }

    private bhw() {
    }

    public static bhw d(byte[] bArr, bqb bqbVar) throws bqw {
        return (bhw) bqn.aD(f21428a, bArr, bqbVar);
    }

    public final int a() {
        return this.f21430e.size();
    }

    public final int b() {
        return this.f21429d;
    }

    public final List e() {
        return this.f21430e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21428a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"d", "e", bhv.class});
        }
        if (i10 == 3) {
            return new bhw();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (char[]) (null == true ? 1 : 0), (byte[]) (null == true ? 1 : 0), (byte[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f21428a;
    }
}
