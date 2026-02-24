package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class apg extends apj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final View f20460h;

    public apg(anw anwVar, agl aglVar, int i9, View view, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "JgNevmfyr8lZxnvZfq3r729JgtxbLk039SjEVr1jMI7eztR3nd0tOgO6sMz+FJz+", "ylslQbtrjnaBQeIQLiG5TQpHgACRff6HBxNL0ysPa0Q=", aglVar, i9, 57, null, null, null);
        this.f20460h = view;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f20460h != null) {
            Boolean bool = (Boolean) aqo.f20551z.f();
            Boolean bool2 = (Boolean) aqo.f20525B.f();
            aob aobVar = new aob((String) this.f20471d.invoke(null, this.f20460h, this.f20468a.b().getResources().getDisplayMetrics(), bool, bool2));
            agl aglVarG = agb.g();
            aglVarG.l(aobVar.f20401a.longValue());
            aglVarG.n(aobVar.f20402b.longValue());
            aglVarG.o(aobVar.f20403c.longValue());
            if (bool2.booleanValue()) {
                aglVarG.m(aobVar.f20405e.longValue());
            }
            if (bool.booleanValue()) {
                aglVarG.k(aobVar.f20404d.longValue());
            }
            this.f20474g.aI((agb) aglVarG.aY());
        }
    }
}
