package com.google.android.gms.internal.appset;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.InterfaceC1361f;
import com.google.android.gms.common.api.internal.InterfaceC1377n;
import com.google.android.gms.common.internal.C1406e;

/* JADX INFO: loaded from: classes3.dex */
final class zzn extends a.AbstractC0252a {
    @Override // com.google.android.gms.common.api.a.AbstractC0252a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, C1406e c1406e, Object obj, InterfaceC1361f interfaceC1361f, InterfaceC1377n interfaceC1377n) {
        return new zzd(context, looper, c1406e, interfaceC1361f, interfaceC1377n);
    }
}
