package kotlinx.coroutines.internal;

import l8.AbstractC2212g;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2160a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f43742a = new Object[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43744c;

    public final void a(Object obj) {
        Object[] objArr = this.f43742a;
        int i9 = this.f43744c;
        objArr[i9] = obj;
        int length = (objArr.length - 1) & (i9 + 1);
        this.f43744c = length;
        if (length == this.f43743b) {
            b();
        }
    }

    public final void b() {
        Object[] objArr = this.f43742a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        AbstractC2212g.f(objArr, objArr2, 0, this.f43743b, 0, 10, null);
        Object[] objArr3 = this.f43742a;
        int length2 = objArr3.length;
        int i9 = this.f43743b;
        AbstractC2212g.f(objArr3, objArr2, length2 - i9, 0, i9, 4, null);
        this.f43742a = objArr2;
        this.f43743b = 0;
        this.f43744c = length;
    }

    public final boolean c() {
        return this.f43743b == this.f43744c;
    }

    public final Object d() {
        int i9 = this.f43743b;
        if (i9 == this.f43744c) {
            return null;
        }
        Object[] objArr = this.f43742a;
        Object obj = objArr[i9];
        objArr[i9] = null;
        this.f43743b = (i9 + 1) & (objArr.length - 1);
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
