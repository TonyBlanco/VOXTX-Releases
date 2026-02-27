package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0256b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0256b c0256b = new DynamiteModule.b.C0256b();
        int iB = aVar.b(context, str);
        c0256b.f26920a = iB;
        int i9 = 1;
        int i10 = 0;
        int iA = iB != 0 ? aVar.a(context, str, false) : aVar.a(context, str, true);
        c0256b.f26921b = iA;
        int i11 = c0256b.f26920a;
        if (i11 == 0) {
            if (iA == 0) {
                i9 = 0;
            }
            c0256b.f26922c = i9;
            return c0256b;
        }
        i10 = i11;
        if (i10 >= iA) {
            i9 = -1;
        }
        c0256b.f26922c = i9;
        return c0256b;
    }
}
