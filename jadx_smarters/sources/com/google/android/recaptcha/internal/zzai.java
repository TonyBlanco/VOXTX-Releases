package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzai {

    @NotNull
    public static final zzai zza = new zzai();

    @NotNull
    private static final HashMap zzb = new HashMap();

    private zzai() {
    }

    public static final void zza(@NotNull zzaf zzafVar, @Nullable Long l9, int i9) {
        zzah zzahVar = (zzah) zzb.get(zzafVar);
        if (zzahVar != null) {
            zzkf zzkfVarZzf = zzkg.zzf();
            zzkfVarZzf.zze(i9);
            if (l9 != null) {
                zzkfVarZzf.zzd(zzjy.zza(l9.longValue() - zzahVar.zza()));
            }
            zzahVar.zzb().zzd((zzkg) zzkfVarZzf.zzj());
        }
    }

    public static final void zzb(@NotNull zzaf zzafVar, @NotNull String str, @NotNull zzs zzsVar) {
        zzb.put(zzafVar, new zzah(zzafVar, str, zzsVar));
    }

    public static final void zzc(@NotNull zzaf zzafVar, @NotNull Context context, @NotNull zzr zzrVar) {
        zze(zzafVar, 3, null, context, zzrVar);
    }

    public static final void zzd(@NotNull zzaf zzafVar, @NotNull String str, int i9, @NotNull Context context, @NotNull zzr zzrVar, @Nullable String str2) {
        zzkl zzklVarZzg = zzkm.zzg();
        zzklVarZzg.zzp(str);
        zzklVarZzg.zzd(i9);
        if (str2 != null) {
            zzklVarZzg.zze(str2);
        }
        zze(zzafVar, 4, (zzkm) zzklVarZzg.zzj(), context, zzrVar);
    }

    private static final void zze(zzaf zzafVar, int i9, zzkm zzkmVar, Context context, zzr zzrVar) {
        zzl zzlVar;
        HashMap map = zzb;
        zzah zzahVar = (zzah) map.get(zzafVar);
        if (zzahVar != null) {
            zzkx zzkxVarZzc = zzahVar.zzc(i9, zzkmVar, context);
            zzj zzjVar = zzj.zza;
            zzkw zzkwVarZza = zzafVar.zza();
            long jZzf = zzkxVarZzc.zzf() * 1000;
            zzkw zzkwVar = zzkw.UNKNOWN;
            int iOrdinal = zzkwVarZza.ordinal();
            if (iOrdinal != 14) {
                switch (iOrdinal) {
                    case 1:
                        zzlVar = zzl.zzd;
                        break;
                    case 2:
                        zzlVar = zzl.zze;
                        break;
                    case 3:
                        zzlVar = zzl.zzf;
                        break;
                    case 4:
                        zzlVar = zzl.zzg;
                        break;
                    case 5:
                        zzlVar = zzl.zzh;
                        break;
                    case 6:
                        zzlVar = zzl.zzi;
                        break;
                    case 7:
                        zzlVar = zzl.zzj;
                        break;
                    default:
                        zzlVar = zzl.zzb;
                        break;
                }
            } else {
                zzlVar = zzl.zzk;
            }
            zzj.zza(zzlVar.zza(), jZzf);
            new zzao(context, new zzaq(zzrVar.zzc()), null, 4, null).zzf(zzkxVarZzc);
        }
    }
}
