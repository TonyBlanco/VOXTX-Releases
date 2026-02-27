package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import h4.C1858a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class amx extends anb {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private C1858a.C0341a f20297w;

    public amx(Context context) {
        super(context);
    }

    public static amx j(Context context) {
        anb.v(context, true);
        return new amx(context);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anb, com.google.ads.interactivemedia.v3.internal.amw
    public final agl c(Context context, View view, Activity activity) {
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anb, com.google.ads.interactivemedia.v3.internal.amw
    public final agl i(Context context, View view, Activity activity) {
        return null;
    }

    public final String m(String str, String str2) {
        byte[] bArrE = amc.e(str, str2);
        return bArrE != null ? com.google.ads.interactivemedia.v3.impl.data.aq.a(bArrE, true) : Integer.toString(7);
    }

    public final void o(C1858a.C0341a c0341a) {
        this.f20297w = c0341a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anb
    public final List p(anw anwVar, Context context, agl aglVar, afm afmVar) {
        ArrayList arrayList = new ArrayList();
        if (anwVar.j() == null) {
            return arrayList;
        }
        arrayList.add(new aoo(anwVar, aglVar, anwVar.a(), null, null, null));
        return arrayList;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anb
    public final void r(anw anwVar, Context context, agl aglVar, afm afmVar) {
        if (!anwVar.f20362b) {
            anb.w(p(anwVar, context, aglVar, afmVar));
            return;
        }
        C1858a.C0341a c0341a = this.f20297w;
        if (c0341a != null) {
            String strA = c0341a.a();
            if (!TextUtils.isEmpty(strA)) {
                aglVar.ab(aoa.d(strA));
                aglVar.aL(aft.f19505f);
                aglVar.aa(this.f20297w.b());
            }
            this.f20297w = null;
        }
    }
}
