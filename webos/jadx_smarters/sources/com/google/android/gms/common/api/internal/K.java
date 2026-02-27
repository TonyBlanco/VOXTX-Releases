package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC1404c;
import java.util.ArrayList;
import java.util.Map;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class K extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f26490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T f26491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(T t9, Map map) {
        super(t9, null);
        this.f26491d = t9;
        this.f26490c = map;
    }

    @Override // com.google.android.gms.common.api.internal.S
    public final void a() {
        com.google.android.gms.common.internal.L l9 = new com.google.android.gms.common.internal.L(this.f26491d.f26518d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (a.f fVar : this.f26490c.keySet()) {
            if (!fVar.requiresGooglePlayServices() || ((H) this.f26490c.get(fVar)).f26476c) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int i9 = 0;
        int iB = -1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i9 < size) {
                iB = l9.b(this.f26491d.f26517c, (a.f) arrayList.get(i9));
                i9++;
                if (iB != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i9 < size2) {
                iB = l9.b(this.f26491d.f26517c, (a.f) arrayList2.get(i9));
                i9++;
                if (iB == 0) {
                    break;
                }
            }
        }
        if (iB != 0) {
            C2914b c2914b = new C2914b(iB, null);
            T t9 = this.f26491d;
            t9.f26515a.l(new I(this, t9, c2914b));
            return;
        }
        T t10 = this.f26491d;
        if (t10.f26527m && t10.f26525k != null) {
            t10.f26525k.c();
        }
        for (a.f fVar2 : this.f26490c.keySet()) {
            AbstractC1404c.InterfaceC0255c interfaceC0255c = (AbstractC1404c.InterfaceC0255c) this.f26490c.get(fVar2);
            if (!fVar2.requiresGooglePlayServices() || l9.b(this.f26491d.f26517c, fVar2) == 0) {
                fVar2.connect(interfaceC0255c);
            } else {
                T t11 = this.f26491d;
                t11.f26515a.l(new J(this, t11, interfaceC0255c));
            }
        }
    }
}
