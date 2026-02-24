package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzma extends zzsh implements zztq {
    private static final zzsn zzb = new zzly();
    private static final zzma zzd;
    private int zze;
    private zzmg zzf;
    private zzob zzg;
    private zzsp zzh = zzsh.zzz();
    private zzsm zzi = zzsh.zzx();

    static {
        zzma zzmaVar = new zzma();
        zzd = zzmaVar;
        zzsh.zzG(zzma.class, zzmaVar);
    }

    private zzma() {
    }

    public static zzlz zza() {
        return (zzlz) zzd.zzu();
    }

    public static /* synthetic */ void zzd(zzma zzmaVar, zzmg zzmgVar) {
        zzmgVar.getClass();
        zzmaVar.zzf = zzmgVar;
        zzmaVar.zze |= 1;
    }

    public static /* synthetic */ void zze(zzma zzmaVar, Iterable iterable) {
        zzsm zzsmVar = zzmaVar.zzi;
        if (!zzsmVar.zzc()) {
            int size = zzsmVar.size();
            zzmaVar.zzi = zzsmVar.zzg(size == 0 ? 10 : size + size);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzmaVar.zzi.zzh(((zzln) it.next()).zza());
        }
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001e", new Object[]{"zze", "zzf", "zzg", "zzh", zznx.class, "zzi", zzln.zzb()});
        }
        if (i10 == 3) {
            return new zzma();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzlz(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzd;
    }
}
