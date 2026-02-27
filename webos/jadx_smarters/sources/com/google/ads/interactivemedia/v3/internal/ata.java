package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Hide;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public final class ata {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    final atd f20675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    final boolean f20676b;

    private ata(atd atdVar) {
        this.f20675a = atdVar;
        this.f20676b = atdVar != null;
    }

    public static ata b() {
        atc atcVar = new atc(null);
        Log.d("GASS", "Clearcut logging disabled");
        return new ata(atcVar);
    }

    public static ata c(Context context, String str) {
        try {
            try {
                try {
                    atd atdVarB = atc.b(DynamiteModule.e(context, DynamiteModule.f26902b, "com.google.android.gms.ads.dynamite").d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger"));
                    atdVarB.i(arp.c(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new ata(atdVarB);
                } catch (Exception e9) {
                    throw new asi(e9);
                }
            } catch (RemoteException | asi | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new ata(new atc(null));
            }
        } catch (Exception e10) {
            throw new asi(e10);
        }
    }

    public final asz a(byte[] bArr) {
        return new asz(this, bArr);
    }
}
