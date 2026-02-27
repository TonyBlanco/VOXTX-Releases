package com.google.android.gms.internal.location;

import J4.Y;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import com.google.android.gms.common.internal.C1405d;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.List;
import y4.AbstractC2985a;
import y4.c;

/* JADX INFO: loaded from: classes3.dex */
public final class zzj extends AbstractC2985a {
    final Y zzc;
    final List<C1405d> zzd;
    final String zze;

    @VisibleForTesting
    static final List<C1405d> zza = Collections.emptyList();
    static final Y zzb = new Y();
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    public zzj(Y y9, List<C1405d> list, String str) {
        this.zzc = y9;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return AbstractC1418q.b(this.zzc, zzjVar.zzc) && AbstractC1418q.b(this.zzd, zzjVar.zzd) && AbstractC1418q.b(this.zze, zzjVar.zze);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(this.zzd);
        String str = this.zze;
        int length = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 77 + strValueOf2.length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(strValueOf);
        sb.append(", clients=");
        sb.append(strValueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = c.a(parcel);
        c.r(parcel, 1, this.zzc, i9, false);
        c.x(parcel, 2, this.zzd, false);
        c.t(parcel, 3, this.zze, false);
        c.b(parcel, iA);
    }
}
