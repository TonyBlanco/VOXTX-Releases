package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f22596d;

    public /* synthetic */ bw(nn nnVar, no noVar, int i9, int i10) {
        this.f22596d = i10;
        this.f22595c = nnVar;
        this.f22594b = noVar;
        this.f22593a = i9;
    }

    public /* synthetic */ bw(CopyOnWriteArraySet copyOnWriteArraySet, int i9, bx bxVar, int i10) {
        this.f22596d = i10;
        this.f22594b = copyOnWriteArraySet;
        this.f22593a = i9;
        this.f22595c = bxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.ads.interactivemedia.v3.internal.no, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.ads.interactivemedia.v3.internal.bx, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f22596d != 0) {
            Object obj = this.f22595c;
            ?? r12 = this.f22594b;
            int i9 = this.f22593a;
            r12.ap();
            nn nnVar = (nn) obj;
            r12.am(nnVar.f23895a, nnVar.f23896b, i9);
            return;
        }
        Object obj2 = this.f22594b;
        int i10 = this.f22593a;
        ?? r22 = this.f22595c;
        Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
        while (it.hasNext()) {
            ((bz) it.next()).a(i10, r22);
        }
    }
}
