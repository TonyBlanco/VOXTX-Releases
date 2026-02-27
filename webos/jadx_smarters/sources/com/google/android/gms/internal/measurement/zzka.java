package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzka implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzka zzb = new zzjx(zzlj.zzd);
    private static final zzjz zzd;
    private int zzc = 0;

    static {
        int i9 = zzjm.zza;
        zzd = new zzjz(null);
        zza = new zzjs();
    }

    public static int zzj(int i9, int i10, int i11) {
        int i12 = i10 - i9;
        if ((i9 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i9 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i9 + " < 0");
        }
        if (i10 < i9) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i9 + ", " + i10);
        }
        throw new IndexOutOfBoundsException("End index: " + i10 + " >= " + i11);
    }

    public static zzka zzl(byte[] bArr, int i9, int i10) {
        zzj(i9, i9 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i9, bArr2, 0, i10);
        return new zzjx(bArr2);
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
        return new zzjr(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzni.zza(this) : zzni.zza(zzf(0, 47)).concat("..."));
    }

    public abstract byte zza(int i9);

    public abstract byte zzb(int i9);

    public abstract int zzd();

    public abstract int zze(int i9, int i10, int i11);

    public abstract zzka zzf(int i9, int i10);

    public abstract String zzg(Charset charset);

    public abstract void zzh(zzjq zzjqVar) throws IOException;

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzm(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
