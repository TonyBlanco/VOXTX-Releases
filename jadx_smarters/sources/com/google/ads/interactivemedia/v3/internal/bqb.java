package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class bqb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final bqb f22027a = new bqb(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f22028b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f22029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile bqb f22030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f22031e;

    public bqb() {
        this.f22031e = new HashMap();
    }

    public bqb(byte[] bArr) {
        this.f22031e = Collections.emptyMap();
    }

    public static bqb a() {
        return f22027a;
    }

    public static bqb b() {
        bqb bqbVar = f22030d;
        if (bqbVar != null) {
            return bqbVar;
        }
        synchronized (bqb.class) {
            try {
                bqb bqbVar2 = f22030d;
                if (bqbVar2 != null) {
                    return bqbVar2;
                }
                bqb bqbVarB = bqi.b(bqb.class);
                f22030d = bqbVarB;
                return bqbVarB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public bpz c(brs brsVar, int i9) {
        return (bpz) this.f22031e.get(new bqa(brsVar, i9));
    }
}
