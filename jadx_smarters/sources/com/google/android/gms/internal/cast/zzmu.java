package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmu extends zzsh implements zztq {
    private static final zzmu zzb;
    private int zzd;
    private long zzf;
    private long zzg;
    private int zzi;
    private boolean zzj;
    private long zzl;
    private long zzm;
    private String zze = "";
    private zzsp zzh = zzsh.zzz();
    private String zzk = "";

    static {
        zzmu zzmuVar = new zzmu();
        zzb = zzmuVar;
        zzsh.zzG(zzmu.class, zzmuVar);
    }

    private zzmu() {
    }

    public static zzmt zza() {
        return (zzmt) zzb.zzu();
    }

    public static /* synthetic */ void zzd(zzmu zzmuVar, String str) {
        str.getClass();
        zzmuVar.zzd |= 1;
        zzmuVar.zze = str;
    }

    public static /* synthetic */ void zze(zzmu zzmuVar, long j9) {
        zzmuVar.zzd |= 2;
        zzmuVar.zzf = j9;
    }

    public static /* synthetic */ void zzf(zzmu zzmuVar, long j9) {
        zzmuVar.zzd |= 4;
        zzmuVar.zzg = j9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void zzg(zzmu zzmuVar, Iterable iterable) {
        zzsp zzspVar = zzmuVar.zzh;
        if (!zzspVar.zzc()) {
            zzmuVar.zzh = zzsh.zzA(zzspVar);
        }
        List list = zzmuVar.zzh;
        byte[] bArr = zzsq.zzd;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size2);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public static /* synthetic */ void zzh(zzmu zzmuVar, int i9) {
        zzmuVar.zzd |= 8;
        zzmuVar.zzi = i9;
    }

    public static /* synthetic */ void zzi(zzmu zzmuVar, boolean z9) {
        zzmuVar.zzd |= 16;
        zzmuVar.zzj = z9;
    }

    public static /* synthetic */ void zzj(zzmu zzmuVar, String str) {
        str.getClass();
        zzmuVar.zzd |= 32;
        zzmuVar.zzk = str;
    }

    public static /* synthetic */ void zzk(zzmu zzmuVar, long j9) {
        zzmuVar.zzd |= 64;
        zzmuVar.zzl = j9;
    }

    public static /* synthetic */ void zzl(zzmu zzmuVar, long j9) {
        zzmuVar.zzd |= 128;
        zzmuVar.zzm = j9;
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004\u001b\u0005င\u0003\u0006ဇ\u0004\u0007ဈ\u0005\bဂ\u0006\tဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzms.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i10 == 3) {
            return new zzmu();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzmt(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
