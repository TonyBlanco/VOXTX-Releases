package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ct implements cy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f22659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f22660b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private dc f22662d;

    public ct(boolean z9) {
        this.f22659a = z9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public /* synthetic */ Map e() {
        return Collections.emptyMap();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final void f(dw dwVar) {
        af.s(dwVar);
        if (this.f22660b.contains(dwVar)) {
            return;
        }
        this.f22660b.add(dwVar);
        this.f22661c++;
    }

    public final void g(int i9) {
        dc dcVar = this.f22662d;
        int i10 = cq.f22640a;
        for (int i11 = 0; i11 < this.f22661c; i11++) {
            ((dw) this.f22660b.get(i11)).a(dcVar, this.f22659a, i9);
        }
    }

    public final void h() {
        dc dcVar = this.f22662d;
        int i9 = cq.f22640a;
        for (int i10 = 0; i10 < this.f22661c; i10++) {
            ((dw) this.f22660b.get(i10)).b(dcVar, this.f22659a);
        }
        this.f22662d = null;
    }

    public final void i(dc dcVar) {
        for (int i9 = 0; i9 < this.f22661c; i9++) {
            ((dw) this.f22660b.get(i9)).c();
        }
    }

    public final void j(dc dcVar) {
        this.f22662d = dcVar;
        for (int i9 = 0; i9 < this.f22661c; i9++) {
            ((dw) this.f22660b.get(i9)).d(dcVar, this.f22659a);
        }
    }
}
