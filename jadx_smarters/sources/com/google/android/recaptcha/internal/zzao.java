package com.google.android.recaptcha.internal;

import G8.AbstractC0579k;
import G8.L;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import kotlin.jvm.internal.g;
import l8.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzao implements zzaj {

    @NotNull
    public static final zzak zza = new zzak(null);

    @Nullable
    private static Timer zzb;

    @NotNull
    private final zzap zzc;

    @NotNull
    private final L zzd;

    @NotNull
    private final zzad zze;

    public /* synthetic */ zzao(Context context, zzap zzapVar, L l9, int i9, g gVar) {
        L lZza = zzp.zza();
        this.zzc = zzapVar;
        this.zzd = lZza;
        zzad zzadVar = zzad.zzb;
        zzadVar = zzadVar == null ? new zzad(context, null) : zzadVar;
        zzad.zzb = zzadVar;
        this.zze = zzadVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        for (List list : s.P(this.zze.zzd(), 20, 20, true)) {
            zzkz zzkzVarZzf = zzla.zzf();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzkzVarZzf.zzd(zzkx.zzG(zzeb.zzg().zzj(((zzae) it.next()).zzc())));
            }
            if (this.zzc.zza(((zzla) zzkzVarZzf.zzj()).zzd())) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    this.zze.zzf((zzae) it2.next());
                }
            }
        }
    }

    private final void zzh() {
        if (zzb == null) {
            Timer timer = new Timer();
            zzb = timer;
            timer.schedule(new zzal(this), 120000L, 120000L);
        }
    }

    public final void zzf(@NotNull zzkx zzkxVar) {
        AbstractC0579k.d(this.zzd, null, null, new zzan(zzkxVar, this, null), 3, null);
        zzh();
    }
}
