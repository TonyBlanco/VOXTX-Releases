package kotlin.jvm.internal;

import C8.g;
import C8.i;
import C8.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n extends r implements C8.g {
    public n(Object obj, Class cls, String str, String str2, int i9) {
        super(obj, cls, str, str2, i9);
    }

    @Override // kotlin.jvm.internal.AbstractC2156c
    public C8.b computeReflected() {
        return C.d(this);
    }

    @Override // C8.j
    public Object getDelegate() {
        return ((C8.g) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ i.a getGetter() {
        mo24getGetter();
        return null;
    }

    @Override // C8.j
    /* JADX INFO: renamed from: getGetter, reason: collision with other method in class */
    public j.a mo24getGetter() {
        ((C8.g) getReflected()).mo24getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ C8.f getSetter() {
        mo25getSetter();
        return null;
    }

    @Override // C8.g
    /* JADX INFO: renamed from: getSetter, reason: collision with other method in class */
    public g.a mo25getSetter() {
        ((C8.g) getReflected()).mo25getSetter();
        return null;
    }

    @Override // w8.a
    public Object invoke() {
        return get();
    }
}
