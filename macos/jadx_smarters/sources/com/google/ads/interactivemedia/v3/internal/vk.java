package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
public final class vk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f24846a;

    public vk() {
        this.f24846a = bn.f21741a;
    }

    private vk(bjj bjjVar) {
        this.f24846a = bjjVar;
    }

    public vk(byte[] bArr) {
        this.f24846a = new SparseArray();
    }

    public static vk e(byte[] bArr) {
        return new vk(bjj.b(bArr));
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.ads.interactivemedia.v3.internal.bn, java.lang.Object] */
    public final vl a(bf bfVar, int[] iArr, wq wqVar, avo avoVar) {
        return new vl(bfVar, iArr, wqVar, avoVar, this.f24846a);
    }

    public final co b(int i9) {
        co coVar = (co) ((SparseArray) this.f24846a).get(i9);
        if (coVar != null) {
            return coVar;
        }
        co coVar2 = new co(9223372036854775806L);
        ((SparseArray) this.f24846a).put(i9, coVar2);
        return coVar2;
    }

    public final void c() {
        ((SparseArray) this.f24846a).clear();
    }

    public final int d() {
        return ((bjj) this.f24846a).a();
    }
}
