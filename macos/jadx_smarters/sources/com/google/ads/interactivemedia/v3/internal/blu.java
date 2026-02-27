package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class blu extends bkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bkm f21675a = new blw(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f21676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bkl f21677c;

    public blu(bjt bjtVar, bkl bklVar, Class cls) {
        this.f21677c = new bmp(bjtVar, bklVar, cls);
        this.f21676b = cls;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final Object read(boh bohVar) throws IOException {
        if (bohVar.r() == 9) {
            bohVar.m();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        bohVar.i();
        while (bohVar.p()) {
            arrayList.add(this.f21677c.read(bohVar));
        }
        bohVar.k();
        int size = arrayList.size();
        if (!this.f21676b.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f21676b, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f21676b, size);
        for (int i9 = 0; i9 < size; i9++) {
            Array.set(objNewInstance, i9, arrayList.get(i9));
        }
        return objNewInstance;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final void write(boj bojVar, Object obj) throws IOException {
        if (obj == null) {
            bojVar.g();
            return;
        }
        bojVar.b();
        int length = Array.getLength(obj);
        for (int i9 = 0; i9 < length; i9++) {
            this.f21677c.write(bojVar, Array.get(obj, i9));
        }
        bojVar.d();
    }
}
