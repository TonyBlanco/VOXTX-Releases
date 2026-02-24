package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class anc extends anb {
    public anc(Context context, String str, boolean z9) {
        super(context, str, z9);
    }

    public static anc j(String str, Context context, boolean z9) {
        anb.v(context, z9);
        return new anc(context, str, z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anb
    public final List p(anw anwVar, Context context, agl aglVar, afm afmVar) {
        if (anwVar.j() == null || !((anb) this).f20317t) {
            return super.p(anwVar, context, aglVar, afmVar);
        }
        int iA = anwVar.a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.p(anwVar, context, aglVar, afmVar));
        arrayList.add(new aoo(anwVar, aglVar, iA, null, null, null));
        return arrayList;
    }
}
