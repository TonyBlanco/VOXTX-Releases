package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.r;
import java.util.Iterator;
import t4.C2775b;
import u0.C2812L;

/* JADX INFO: loaded from: classes3.dex */
public final class zzas extends C2812L.a {
    private static final C2775b zza = new C2775b("MediaRouterCallback");
    private final zzan zzb;

    public zzas(zzan zzanVar) {
        this.zzb = (zzan) r.m(zzanVar);
    }

    @Override // u0.C2812L.a
    public final void onRouteAdded(C2812L c2812l, C2812L.h hVar) {
        try {
            this.zzb.zzf(hVar.k(), hVar.i());
        } catch (RemoteException e9) {
            zza.b(e9, "Unable to call %s on %s.", "onRouteAdded", zzan.class.getSimpleName());
        }
    }

    @Override // u0.C2812L.a
    public final void onRouteChanged(C2812L c2812l, C2812L.h hVar) {
        try {
            this.zzb.zzg(hVar.k(), hVar.i());
        } catch (RemoteException e9) {
            zza.b(e9, "Unable to call %s on %s.", "onRouteChanged", zzan.class.getSimpleName());
        }
    }

    @Override // u0.C2812L.a
    public final void onRouteRemoved(C2812L c2812l, C2812L.h hVar) {
        try {
            this.zzb.zzh(hVar.k(), hVar.i());
        } catch (RemoteException e9) {
            zza.b(e9, "Unable to call %s on %s.", "onRouteRemoved", zzan.class.getSimpleName());
        }
    }

    @Override // u0.C2812L.a
    public final void onRouteSelected(C2812L c2812l, C2812L.h hVar, int i9) {
        CastDevice castDeviceK;
        CastDevice castDeviceK2;
        zza.e("onRouteSelected with reason = %d, routeId = %s", Integer.valueOf(i9), hVar.k());
        if (hVar.o() != 1) {
            return;
        }
        try {
            String strK = hVar.k();
            String strK2 = hVar.k();
            if (strK2 != null && strK2.endsWith("-groupRoute") && (castDeviceK = CastDevice.K(hVar.i())) != null) {
                String strH = castDeviceK.H();
                Iterator it = c2812l.m().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C2812L.h hVar2 = (C2812L.h) it.next();
                    String strK3 = hVar2.k();
                    if (strK3 != null && !strK3.endsWith("-groupRoute") && (castDeviceK2 = CastDevice.K(hVar2.i())) != null && TextUtils.equals(castDeviceK2.H(), strH)) {
                        zza.a("routeId is changed from %s to %s", strK2, hVar2.k());
                        strK2 = hVar2.k();
                        break;
                    }
                }
            }
            if (this.zzb.zze() >= 220400000) {
                this.zzb.zzj(strK2, strK, hVar.i());
            } else {
                this.zzb.zzi(strK2, hVar.i());
            }
        } catch (RemoteException e9) {
            zza.b(e9, "Unable to call %s on %s.", "onRouteSelected", zzan.class.getSimpleName());
        }
    }

    @Override // u0.C2812L.a
    public final void onRouteUnselected(C2812L c2812l, C2812L.h hVar, int i9) {
        C2775b c2775b = zza;
        c2775b.e("onRouteUnselected with reason = %d, routeId = %s", Integer.valueOf(i9), hVar.k());
        if (hVar.o() != 1) {
            c2775b.a("skip route unselection for non-cast route", new Object[0]);
            return;
        }
        try {
            this.zzb.zzk(hVar.k(), hVar.i(), i9);
        } catch (RemoteException e9) {
            zza.b(e9, "Unable to call %s on %s.", "onRouteUnselected", zzan.class.getSimpleName());
        }
    }
}
