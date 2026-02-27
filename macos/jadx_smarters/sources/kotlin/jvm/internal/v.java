package kotlin.jvm.internal;

import C8.l;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v extends x implements C8.l {
    public v(Class cls, String str, String str2, int i9) {
        super(AbstractC2156c.NO_RECEIVER, cls, str, str2, i9);
    }

    @Override // kotlin.jvm.internal.AbstractC2156c
    public C8.b computeReflected() {
        return C.g(this);
    }

    @Override // C8.l
    public l.a getGetter() {
        ((C8.l) getReflected()).getGetter();
        return null;
    }

    @Override // w8.p
    public Object invoke(Object obj, Object obj2) {
        return g(obj, obj2);
    }
}
