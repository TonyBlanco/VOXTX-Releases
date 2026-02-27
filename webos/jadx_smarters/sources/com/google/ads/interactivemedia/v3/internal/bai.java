package com.google.ads.interactivemedia.v3.internal;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public final class bai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f20991a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private baj f20993c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentMap f20992b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bfx f20994d = bfx.f21226a;

    public /* synthetic */ bai(Class cls) {
        this.f20991a = cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e(java.lang.Object r12, com.google.ads.interactivemedia.v3.internal.bhv r13, boolean r14) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bai.e(java.lang.Object, com.google.ads.interactivemedia.v3.internal.bhv, boolean):void");
    }

    public final bal a() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.f20992b;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        bal balVar = new bal(concurrentMap, this.f20993c, this.f20994d, this.f20991a);
        this.f20992b = null;
        return balVar;
    }

    public final void b(Object obj, bhv bhvVar) throws GeneralSecurityException {
        e(obj, bhvVar, true);
    }

    public final void c(Object obj, bhv bhvVar) throws GeneralSecurityException {
        e(obj, bhvVar, false);
    }

    public final void d(bfx bfxVar) {
        if (this.f20992b == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.f20994d = bfxVar;
    }
}
