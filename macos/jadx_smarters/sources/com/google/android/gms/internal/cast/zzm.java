package com.google.android.gms.internal.cast;

import android.os.Bundle;
import java.math.BigInteger;
import java.util.Map;
import t4.C2775b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzm {
    private static final C2775b zza = new C2775b("ApplicationAnalyticsUtils");
    private static final String zzb = "21.3.0";
    private final String zzc;
    private final Map zzd;
    private final Map zze;

    public zzm(Bundle bundle, String str) {
        this.zzc = str;
        this.zzd = zzag.zza(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.zze = zzag.zza(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    private final zzmp zzh(zzl zzlVar) {
        long jLongValue;
        zzmp zzmpVarZzc = zzmq.zzc();
        zzmpVarZzc.zzl(zzlVar.zzd);
        int i9 = zzlVar.zze;
        zzlVar.zze = i9 + 1;
        zzmpVarZzc.zzi(i9);
        String str = zzlVar.zzc;
        if (str != null) {
            zzmpVarZzc.zzj(str);
        }
        String str2 = zzlVar.zzh;
        if (str2 != null) {
            zzmpVarZzc.zzh(str2);
        }
        zzmf zzmfVarZza = zzmg.zza();
        zzmfVarZza.zzb(zzb);
        zzmfVarZza.zza(this.zzc);
        zzmpVarZzc.zzb((zzmg) zzmfVarZza.zzp());
        zzmh zzmhVarZza = zzmi.zza();
        if (zzlVar.zzb != null) {
            zznb zznbVarZza = zznc.zza();
            zznbVarZza.zza(zzlVar.zzb);
            zzmhVarZza.zza((zznc) zznbVarZza.zzp());
        }
        zzmhVarZza.zzf(false);
        String str3 = zzlVar.zzf;
        if (str3 != null) {
            try {
                String strReplace = str3.replace("-", "");
                jLongValue = new BigInteger(strReplace.substring(0, Math.min(16, strReplace.length())), 16).longValue();
            } catch (NumberFormatException e9) {
                zza.g(e9, "receiverSessionId %s is not valid for hash", str3);
                jLongValue = 0;
            }
            zzmhVarZza.zzh(jLongValue);
        }
        zzmhVarZza.zzb(zzlVar.zzg);
        zzmhVarZza.zzd(zzlVar.zzi);
        zzmhVarZza.zze(zzlVar.zzj);
        zzmpVarZzc.zzd(zzmhVarZza);
        return zzmpVarZzc;
    }

    private static void zzi(zzmp zzmpVar, boolean z9) {
        zzmh zzmhVarZzc = zzmi.zzc(zzmpVar.zza());
        zzmhVarZzc.zzf(z9);
        zzmpVar.zzd(zzmhVarZzc);
    }

    public final zzmq zza(zzl zzlVar) {
        return (zzmq) zzh(zzlVar).zzp();
    }

    public final zzmq zzb(zzl zzlVar, boolean z9) {
        zzmp zzmpVarZzh = zzh(zzlVar);
        zzi(zzmpVarZzh, z9);
        return (zzmq) zzmpVarZzh.zzp();
    }

    public final zzmq zzc(zzl zzlVar) {
        zzmp zzmpVarZzh = zzh(zzlVar);
        zzmh zzmhVarZzc = zzmi.zzc(zzmpVarZzh.zza());
        zzmhVarZzc.zzg(10);
        zzmpVarZzh.zze((zzmi) zzmhVarZzc.zzp());
        zzi(zzmpVarZzh, true);
        return (zzmq) zzmpVarZzh.zzp();
    }

    public final zzmq zzd(zzl zzlVar) {
        zzmp zzmpVarZzh = zzh(zzlVar);
        if (zzlVar.zzk == 1) {
            zzmh zzmhVarZzc = zzmi.zzc(zzmpVarZzh.zza());
            zzmhVarZzc.zzg(17);
            zzmpVarZzh.zze((zzmi) zzmhVarZzc.zzp());
        }
        return (zzmq) zzmpVarZzh.zzp();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @org.checkerframework.dataflow.qual.Pure
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.cast.zzmq zze(com.google.android.gms.internal.cast.zzl r4, int r5) {
        /*
            r3 = this;
            com.google.android.gms.internal.cast.zzmp r4 = r3.zzh(r4)
            com.google.android.gms.internal.cast.zzmi r0 = r4.zza()
            com.google.android.gms.internal.cast.zzmh r0 = com.google.android.gms.internal.cast.zzmi.zzc(r0)
            java.util.Map r1 = r3.zze
            if (r1 == 0) goto L2e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L1b
            goto L2e
        L1b:
            java.util.Map r1 = r3.zze
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r1 = com.google.android.gms.common.internal.r.m(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L30
        L2e:
            int r1 = r5 + 10000
        L30:
            r0.zzg(r1)
            java.util.Map r1 = r3.zzd
            if (r1 == 0) goto L55
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L42
            goto L55
        L42:
            java.util.Map r5 = r3.zzd
            java.lang.Object r5 = r5.get(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r5 = com.google.android.gms.common.internal.r.m(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L57
        L55:
            int r5 = r5 + 10000
        L57:
            r0.zzc(r5)
            com.google.android.gms.internal.cast.zzsh r5 = r0.zzp()
            com.google.android.gms.internal.cast.zzmi r5 = (com.google.android.gms.internal.cast.zzmi) r5
            r4.zze(r5)
            com.google.android.gms.internal.cast.zzsh r4 = r4.zzp()
            com.google.android.gms.internal.cast.zzmq r4 = (com.google.android.gms.internal.cast.zzmq) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzm.zze(com.google.android.gms.internal.cast.zzl, int):com.google.android.gms.internal.cast.zzmq");
    }

    public final zzmq zzf(zzl zzlVar, int i9, int i10) {
        zzmp zzmpVarZzh = zzh(zzlVar);
        zzmh zzmhVarZzc = zzmi.zzc(zzmpVarZzh.zza());
        zzmhVarZzc.zzj(i9);
        zzmhVarZzc.zzi(i10);
        zzmpVarZzh.zze((zzmi) zzmhVarZzc.zzp());
        return (zzmq) zzmpVarZzh.zzp();
    }

    public final zzmq zzg(zzl zzlVar, int i9) {
        zzmp zzmpVarZzh = zzh(zzlVar);
        zzmh zzmhVarZzc = zzmi.zzc(zzmpVarZzh.zza());
        zzmhVarZzc.zzj(i9);
        zzmpVarZzh.zze((zzmi) zzmhVarZzc.zzp());
        return (zzmq) zzmpVarZzh.zzp();
    }
}
