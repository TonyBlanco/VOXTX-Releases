package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1178h;
import androidx.mediarouter.app.a;
import androidx.mediarouter.app.b;
import m0.AbstractC2215a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzz extends b {
    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1179i
    public /* bridge */ /* synthetic */ AbstractC2215a getDefaultViewModelCreationExtras() {
        return AbstractC1178h.a(this);
    }

    @Override // androidx.mediarouter.app.b
    public final a onCreateChooserDialog(Context context, Bundle bundle) {
        zzy zzyVar = new zzy(context, 0);
        zzyVar.zze();
        return zzyVar;
    }
}
