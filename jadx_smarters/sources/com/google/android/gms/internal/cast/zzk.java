package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.r;
import o4.C2325b;
import o4.C2328e;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;
import t4.C2775b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzk {
    private static final C2775b zza = new C2775b("ApplicationAnalytics");
    private final zzf zzb;
    private final zzm zzc;
    private final SharedPreferences zzg;
    private zzl zzh;
    private C2328e zzi;
    private boolean zzj;
    private boolean zzk;
    private final zzh zzd = new zzh(this);
    private final Handler zzf = new zzdy(Looper.getMainLooper());
    private final Runnable zze = new Runnable() { // from class: com.google.android.gms.internal.cast.zzg
        @Override // java.lang.Runnable
        public final void run() {
            zzk.zzg(this.zza);
        }
    };

    public zzk(SharedPreferences sharedPreferences, zzf zzfVar, Bundle bundle, String str) {
        this.zzg = sharedPreferences;
        this.zzb = zzfVar;
        this.zzc = new zzm(bundle, str);
    }

    public static /* synthetic */ void zzg(zzk zzkVar) {
        zzl zzlVar = zzkVar.zzh;
        if (zzlVar != null) {
            zzkVar.zzb.zzd(zzkVar.zzc.zza(zzlVar), 223);
        }
        zzkVar.zzw();
    }

    public static /* bridge */ /* synthetic */ void zzn(zzk zzkVar, int i9) {
        zza.a("log session ended with error = %d", Integer.valueOf(i9));
        zzkVar.zzu();
        zzkVar.zzb.zzd(zzkVar.zzc.zze(zzkVar.zzh, i9), 228);
        zzkVar.zzt();
        if (zzkVar.zzk) {
            return;
        }
        zzkVar.zzh = null;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzk zzkVar, SharedPreferences sharedPreferences, String str) {
        boolean z9 = false;
        if (zzkVar.zzz(str)) {
            zza.a("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            r.m(zzkVar.zzh);
            return;
        }
        zzkVar.zzh = zzl.zzb(sharedPreferences);
        if (zzkVar.zzz(str)) {
            zza.a("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
            r.m(zzkVar.zzh);
            zzl.zza = zzkVar.zzh.zzd + 1;
            return;
        }
        zza.a("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
        zzl zzlVarZza = zzl.zza(zzkVar.zzj);
        zzkVar.zzh = zzlVarZza;
        zzl zzlVar = (zzl) r.m(zzlVarZza);
        C2328e c2328e = zzkVar.zzi;
        if (c2328e != null && c2328e.C()) {
            z9 = true;
        }
        zzlVar.zzj = z9;
        ((zzl) r.m(zzkVar.zzh)).zzb = zzs();
        ((zzl) r.m(zzkVar.zzh)).zzf = str;
    }

    public static /* bridge */ /* synthetic */ void zzr(zzk zzkVar, boolean z9) {
        zza.a("update app visibility to %s", true != z9 ? "foreground" : "background");
        zzkVar.zzj = z9;
        zzl zzlVar = zzkVar.zzh;
        if (zzlVar != null) {
            zzlVar.zzi = z9;
        }
    }

    @Pure
    private static String zzs() {
        return ((C2325b) r.m(C2325b.d())).a().K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzt() {
        this.zzf.removeCallbacks(this.zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNull({"analyticsSession"})
    public final void zzu() {
        if (!zzy()) {
            zza.f("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]);
            zzv();
            return;
        }
        C2328e c2328e = this.zzi;
        CastDevice castDeviceQ = c2328e != null ? c2328e.q() : null;
        if (castDeviceQ != null && !TextUtils.equals(this.zzh.zzc, castDeviceQ.zzc())) {
            zzx(castDeviceQ);
        }
        r.m(this.zzh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNull({"analyticsSession"})
    public final void zzv() {
        zza.a("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        zzl zzlVarZza = zzl.zza(this.zzj);
        this.zzh = zzlVarZza;
        zzl zzlVar = (zzl) r.m(zzlVarZza);
        C2328e c2328e = this.zzi;
        zzlVar.zzj = c2328e != null && c2328e.C();
        ((zzl) r.m(this.zzh)).zzb = zzs();
        C2328e c2328e2 = this.zzi;
        CastDevice castDeviceQ = c2328e2 == null ? null : c2328e2.q();
        if (castDeviceQ != null) {
            zzx(castDeviceQ);
        }
        zzl zzlVar2 = (zzl) r.m(this.zzh);
        C2328e c2328e3 = this.zzi;
        zzlVar2.zzk = c2328e3 != null ? c2328e3.n() : 0;
        r.m(this.zzh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw() {
        ((Handler) r.m(this.zzf)).postDelayed((Runnable) r.m(this.zze), 300000L);
    }

    private final void zzx(CastDevice castDevice) {
        zzl zzlVar = this.zzh;
        if (zzlVar == null) {
            return;
        }
        zzlVar.zzc = castDevice.zzc();
        zzlVar.zzg = castDevice.Q();
        zzlVar.zzh = castDevice.M();
    }

    @EnsuresNonNullIf(expression = {"analyticsSession"}, result = true)
    private final boolean zzy() {
        String str;
        if (this.zzh == null) {
            zza.a("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        String strZzs = zzs();
        if (strZzs == null || (str = this.zzh.zzb) == null || !TextUtils.equals(str, strZzs)) {
            zza.a("The analytics session doesn't match the application ID %s", strZzs);
            return false;
        }
        r.m(this.zzh);
        return true;
    }

    private final boolean zzz(String str) {
        String str2;
        if (!zzy()) {
            return false;
        }
        r.m(this.zzh);
        if (str != null && (str2 = this.zzh.zzf) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        zza.a("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }

    public final zzh zzc() {
        return this.zzd;
    }
}
