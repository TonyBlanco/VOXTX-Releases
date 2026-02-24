package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0256b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0256b c0256b = new DynamiteModule.b.C0256b();
        int iB = aVar.b(context, str);
        c0256b.f26920a = iB;
        if (iB != 0) {
            c0256b.f26922c = -1;
        } else {
            int iA = aVar.a(context, str, true);
            c0256b.f26921b = iA;
            if (iA != 0) {
                c0256b.f26922c = 1;
            }
        }
        return c0256b;
    }
}
