package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0256b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0256b c0256b = new DynamiteModule.b.C0256b();
        int iA = aVar.a(context, str, false);
        c0256b.f26921b = iA;
        c0256b.f26922c = iA != 0 ? 1 : 0;
        return c0256b;
    }
}
