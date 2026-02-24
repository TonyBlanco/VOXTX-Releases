package com.google.android.gms.internal.location;

import J4.InterfaceC0647f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Locale;
import y4.AbstractC2985a;
import y4.c;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzbe extends AbstractC2985a implements InterfaceC0647f {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();
    private final String zza;
    private final long zzb;
    private final short zzc;
    private final double zzd;
    private final double zze;
    private final float zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;

    public zzbe(String str, int i9, short s9, double d9, double d10, float f9, long j9, int i10, int i11) {
        if (str == null || str.length() > 100) {
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "requestId is null or too long: ".concat(strValueOf) : new String("requestId is null or too long: "));
        }
        if (f9 <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f9);
            throw new IllegalArgumentException(sb.toString());
        }
        if (d9 > 90.0d || d9 < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d9);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d10 > 180.0d || d10 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d10);
            throw new IllegalArgumentException(sb3.toString());
        }
        int i12 = i9 & 7;
        if (i12 == 0) {
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i9);
            throw new IllegalArgumentException(sb4.toString());
        }
        this.zzc = s9;
        this.zza = str;
        this.zzd = d9;
        this.zze = d10;
        this.zzf = f9;
        this.zzb = j9;
        this.zzg = i12;
        this.zzh = i10;
        this.zzi = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.zzf == zzbeVar.zzf && this.zzd == zzbeVar.zzd && this.zze == zzbeVar.zze && this.zzc == zzbeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final String getRequestId() {
        return this.zza;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.zzd);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((((((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.zzf)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        Locale locale = Locale.US;
        short s9 = this.zzc;
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s9 != -1 ? s9 != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID", this.zza.replaceAll("\\p{C}", "?"), Integer.valueOf(this.zzg), Double.valueOf(this.zzd), Double.valueOf(this.zze), Float.valueOf(this.zzf), Integer.valueOf(this.zzh / 1000), Integer.valueOf(this.zzi), Long.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = c.a(parcel);
        c.t(parcel, 1, this.zza, false);
        c.o(parcel, 2, this.zzb);
        c.s(parcel, 3, this.zzc);
        c.g(parcel, 4, this.zzd);
        c.g(parcel, 5, this.zze);
        c.i(parcel, 6, this.zzf);
        c.l(parcel, 7, this.zzg);
        c.l(parcel, 8, this.zzh);
        c.l(parcel, 9, this.zzi);
        c.b(parcel, iA);
    }
}
