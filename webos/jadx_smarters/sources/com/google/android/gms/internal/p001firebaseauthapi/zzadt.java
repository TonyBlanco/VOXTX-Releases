package com.google.android.gms.internal.p001firebaseauthapi;

import C4.h;
import G5.H;
import android.app.Activity;
import java.util.Map;
import java.util.concurrent.Executor;
import s.C2695a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadt {
    private static final Map<String, zzadv> zza = new C2695a();

    public static H zza(String str, H h9, zzacx zzacxVar) {
        zza(str, zzacxVar);
        return new zzads(h9, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzacx zzacxVar) {
        zza.put(str, new zzadv(zzacxVar, h.c().a()));
    }

    public static boolean zza(String str, H h9, Activity activity, Executor executor) {
        Map<String, zzadv> map = zza;
        if (!map.containsKey(str)) {
            zza(str, null);
            return false;
        }
        zzadv zzadvVar = map.get(str);
        if (h.c().a() - zzadvVar.zzb >= 120000) {
            zza(str, null);
            return false;
        }
        zzacx zzacxVar = zzadvVar.zza;
        if (zzacxVar == null) {
            return true;
        }
        zzacxVar.zza(h9, activity, executor, str);
        return true;
    }
}
