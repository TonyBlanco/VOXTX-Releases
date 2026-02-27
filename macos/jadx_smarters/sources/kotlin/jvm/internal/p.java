package kotlin.jvm.internal;

import C8.k;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p extends r implements C8.h {
    public p(Object obj, Class cls, String str, String str2, int i9) {
        super(obj, cls, str, str2, i9);
    }

    @Override // kotlin.jvm.internal.AbstractC2156c
    public C8.b computeReflected() {
        return C.e(this);
    }

    @Override // C8.k
    public k.a getGetter() {
        ((C8.h) getReflected()).getGetter();
        return null;
    }

    @Override // w8.l
    public Object invoke(Object obj) {
        return get(obj);
    }
}
