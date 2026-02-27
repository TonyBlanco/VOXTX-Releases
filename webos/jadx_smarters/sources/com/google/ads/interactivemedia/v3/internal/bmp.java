package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes3.dex */
final class bmp<T> extends bkl<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bjt f21738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bkl f21739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f21740c;

    public bmp(bjt bjtVar, bkl bklVar, Type type) {
        this.f21738a = bjtVar;
        this.f21739b = bklVar;
        this.f21740c = type;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final T read(boh bohVar) throws IOException {
        return (T) this.f21739b.read(bohVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final void write(boj bojVar, T t9) throws IOException {
        bkl bklVarA = this.f21739b;
        Type type = this.f21740c;
        Type type2 = (t9 == null || !(type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) ? type : t9.getClass();
        if (type2 != type) {
            bklVarA = this.f21738a.a(bof.b(type2));
            if (bklVarA instanceof bmj) {
                bkl bklVar = this.f21739b;
                if (!(bklVar instanceof bmj)) {
                    bklVarA = bklVar;
                }
            }
        }
        bklVarA.write(bojVar, t9);
    }
}
