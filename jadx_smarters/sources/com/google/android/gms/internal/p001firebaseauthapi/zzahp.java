package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzahp implements Serializable, Iterable<Byte> {
    public static final zzahp zza = new zzahz(zzajf.zzb);
    private static final zzahs zzb = new zzahy();
    private static final Comparator<zzahp> zzc = new zzahr();
    private int zzd = 0;

    public static /* synthetic */ int zza(byte b9) {
        return b9 & 255;
    }

    public static int zza(int i9, int i10, int i11) {
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

    public static zzahp zza(String str) {
        return new zzahz(str.getBytes(zzajf.zza));
    }

    public static zzahp zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzahp zza(byte[] bArr, int i9, int i10) {
        zza(i9, i9 + i10, bArr.length);
        return new zzahz(zzb.zza(bArr, i9, i10));
    }

    public static zzahp zzb(byte[] bArr) {
        return new zzahz(bArr);
    }

    public static zzahu zzc(int i9) {
        return new zzahu(i9);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzb = this.zzd;
        if (iZzb == 0) {
            int iZzb2 = zzb();
            iZzb = zzb(iZzb2, 0, iZzb2);
            if (iZzb == 0) {
                iZzb = 1;
            }
            this.zzd = iZzb;
        }
        return iZzb;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzaho(this);
    }

    public final String toString() {
        String strZza;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer numValueOf = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            strZza = zzalw.zza(this);
        } else {
            strZza = zzalw.zza(zza(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, numValueOf, strZza);
    }

    public abstract byte zza(int i9);

    public final int zza() {
        return this.zzd;
    }

    public abstract zzahp zza(int i9, int i10);

    public abstract String zza(Charset charset);

    public abstract void zza(zzahm zzahmVar) throws IOException;

    public abstract void zza(byte[] bArr, int i9, int i10, int i11);

    public abstract byte zzb(int i9);

    public abstract int zzb();

    public abstract int zzb(int i9, int i10, int i11);

    public abstract zzaia zzc();

    public final String zzd() {
        return zzb() == 0 ? "" : zza(zzajf.zza);
    }

    public final boolean zze() {
        return zzb() == 0;
    }

    public abstract boolean zzf();

    public final byte[] zzg() {
        int iZzb = zzb();
        if (iZzb == 0) {
            return zzajf.zzb;
        }
        byte[] bArr = new byte[iZzb];
        zza(bArr, 0, 0, iZzb);
        return bArr;
    }
}
