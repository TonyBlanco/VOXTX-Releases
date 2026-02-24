package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class bmj<T> extends bkl<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final blk f21709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f21710b;

    public bmj(blk blkVar, Map map) {
        this.f21709a = blkVar;
        this.f21710b = map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final T read(boh bohVar) throws IOException {
        if (bohVar.r() == 9) {
            bohVar.m();
            return null;
        }
        T t9 = (T) this.f21709a.a();
        try {
            bohVar.j();
            while (bohVar.p()) {
                bmk bmkVar = (bmk) this.f21710b.get(bohVar.g());
                if (bmkVar == null || !bmkVar.f21713c) {
                    bohVar.o();
                } else {
                    bmkVar.a(bohVar, t9);
                }
            }
            bohVar.l();
            return t9;
        } catch (IllegalAccessException e9) {
            throw blo.e(e9);
        } catch (IllegalStateException e10) {
            throw new bkf(e10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final void write(boj bojVar, T t9) throws IOException {
        if (t9 == null) {
            bojVar.g();
            return;
        }
        bojVar.c();
        try {
            Iterator it = this.f21710b.values().iterator();
            while (it.hasNext()) {
                ((bmk) it.next()).b(bojVar, t9);
            }
            bojVar.e();
        } catch (IllegalAccessException e9) {
            throw blo.e(e9);
        }
    }
}
