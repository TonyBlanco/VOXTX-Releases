package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bmf extends bkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bkl f21699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bkl f21700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final blk f21701c;

    public bmf(bjt bjtVar, Type type, bkl bklVar, Type type2, bkl bklVar2, blk blkVar) {
        this.f21699a = new bmp(bjtVar, bklVar, type);
        this.f21700b = new bmp(bjtVar, bklVar2, type2);
        this.f21701c = blkVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        int iR = bohVar.r();
        if (iR == 9) {
            bohVar.m();
            return null;
        }
        Map map = (Map) this.f21701c.a();
        if (iR == 1) {
            bohVar.i();
            while (bohVar.p()) {
                bohVar.i();
                Object obj = this.f21699a.read(bohVar);
                if (map.put(obj, this.f21700b.read(bohVar)) != null) {
                    throw new bkf("duplicate key: ".concat(String.valueOf(obj)));
                }
                bohVar.k();
            }
            bohVar.k();
        } else {
            bohVar.j();
            while (bohVar.p()) {
                bla.f21641a.a(bohVar);
                Object obj2 = this.f21699a.read(bohVar);
                if (map.put(obj2, this.f21700b.read(bohVar)) != null) {
                    throw new bkf("duplicate key: ".concat(String.valueOf(obj2)));
                }
            }
            bohVar.l();
        }
        return map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            bojVar.g();
            return;
        }
        bojVar.c();
        for (Map.Entry entry : map.entrySet()) {
            bojVar.f(String.valueOf(entry.getKey()));
            this.f21700b.write(bojVar, entry.getValue());
        }
        bojVar.e();
    }
}
