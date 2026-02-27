package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzah {

    @NotNull
    public static final zzag zza = new zzag(null);

    @Nullable
    private static zzkj zzb;

    @NotNull
    private final String zzc;

    @NotNull
    private final zzs zzd;

    @NotNull
    private final zzku zze;
    private final long zzf;

    public zzah(@NotNull zzaf zzafVar, @NotNull String str, @NotNull zzs zzsVar) {
        this.zzc = str;
        this.zzd = zzsVar;
        zzku zzkuVarZzi = zzkx.zzi();
        this.zze = zzkuVarZzi;
        this.zzf = System.currentTimeMillis();
        zzkuVarZzi.zzq(zzafVar.zza());
        zzkuVarZzi.zze(zzafVar.zzb());
        zzkuVarZzi.zzs(zzafVar.zzc());
        zzkuVarZzi.zzv(zzafVar.zzd());
        zzkuVarZzi.zzu(zzka.zzc(zzka.zzb(System.currentTimeMillis())));
    }

    private static final zzkj zzd(Context context) {
        int i9;
        PackageInfo packageInfo;
        int i10;
        String strValueOf = "unknown";
        String strValueOf2 = (Build.VERSION.SDK_INT < 33 ? (i10 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getInt("com.google.android.gms.version", -1)) != -1 : (i10 = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)).metaData.getInt("com.google.android.gms.version", -1)) != -1) ? String.valueOf(i10) : "unknown";
        try {
            i9 = Build.VERSION.SDK_INT;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (i9 >= 33) {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        } else {
            if (i9 < 28) {
                strValueOf = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                zzki zzkiVarZzf = zzkj.zzf();
                zzkiVarZzf.zzd(Build.VERSION.SDK_INT);
                zzkiVarZzf.zzq(strValueOf2);
                zzkiVarZzf.zzs("18.1.2");
                zzkiVarZzf.zzp(Build.MODEL);
                zzkiVarZzf.zzr(Build.MANUFACTURER);
                zzkiVarZzf.zze(strValueOf);
                return (zzkj) zzkiVarZzf.zzj();
            }
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        }
        strValueOf = String.valueOf(packageInfo.getLongVersionCode());
        zzki zzkiVarZzf2 = zzkj.zzf();
        zzkiVarZzf2.zzd(Build.VERSION.SDK_INT);
        zzkiVarZzf2.zzq(strValueOf2);
        zzkiVarZzf2.zzs("18.1.2");
        zzkiVarZzf2.zzp(Build.MODEL);
        zzkiVarZzf2.zzr(Build.MANUFACTURER);
        zzkiVarZzf2.zze(strValueOf);
        return (zzkj) zzkiVarZzf2.zzj();
    }

    public final long zza() {
        return this.zzf;
    }

    @NotNull
    public final zzku zzb() {
        return this.zze;
    }

    @NotNull
    public final zzkx zzc(@NotNull int i9, @Nullable zzkm zzkmVar, @NotNull Context context) {
        zzku zzkuVar = this.zze;
        zzkuVar.zzp(System.currentTimeMillis() - this.zzf);
        zzkuVar.zzw(i9);
        if (zzkmVar != null) {
            this.zze.zzr(zzkmVar);
        }
        if (zzb == null) {
            zzb = zzd(context);
        }
        zzku zzkuVar2 = this.zze;
        zzli zzliVarZzf = zzlj.zzf();
        zzliVarZzf.zzq(this.zzc);
        zzkj zzkjVarZzd = zzb;
        if (zzkjVarZzd == null) {
            zzkjVarZzd = zzd(context);
        }
        zzliVarZzf.zzd(zzkjVarZzd);
        zzliVarZzf.zzp(Locale.getDefault().getISO3Language());
        zzliVarZzf.zze(Locale.getDefault().getISO3Country());
        zzkuVar2.zzt((zzlj) zzliVarZzf.zzj());
        return (zzkx) this.zze.zzj();
    }
}
