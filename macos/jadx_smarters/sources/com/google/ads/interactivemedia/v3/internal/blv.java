package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class blv extends bkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bkl f21678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final blk f21679b;

    public blv(bjt bjtVar, Type type, bkl bklVar, blk blkVar) {
        this.f21678a = new bmp(bjtVar, bklVar, type);
        this.f21679b = blkVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        if (bohVar.r() == 9) {
            bohVar.m();
            return null;
        }
        Collection collection = (Collection) this.f21679b.a();
        bohVar.i();
        while (bohVar.p()) {
            collection.add(this.f21678a.read(bohVar));
        }
        bohVar.k();
        return collection;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        Collection collection = (Collection) obj;
        if (collection == null) {
            bojVar.g();
            return;
        }
        bojVar.b();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f21678a.write(bojVar, it.next());
        }
        bojVar.d();
    }
}
