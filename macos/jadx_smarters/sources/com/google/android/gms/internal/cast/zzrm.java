package com.google.android.gms.internal.cast;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzrm implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzrm zzb = new zzrj(zzsq.zzd);
    private static final zzrl zzd;
    private int zzc = 0;

    static {
        int i9 = zzrb.zza;
        zzd = new zzrl(null);
        zza = new zzre();
    }

    public static int zzj(int i9, int i10, int i11) {
        if (((i11 - i10) | i10) >= 0) {
            return i10;
        }
        throw new IndexOutOfBoundsException("End index: " + i10 + " >= " + i11);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZze = this.zzc;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.zzc = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzrd(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzup.zza(this) : zzup.zza(zzf(0, 47)).concat("..."));
    }

    public abstract byte zza(int i9);

    public abstract byte zzb(int i9);

    public abstract int zzd();

    public abstract int zze(int i9, int i10, int i11);

    public abstract zzrm zzf(int i9, int i10);

    public abstract String zzg(Charset charset);

    public abstract void zzh(zzrc zzrcVar) throws IOException;

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzl(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
