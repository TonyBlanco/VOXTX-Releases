package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public final class asl extends AbstractC2985a {
    public static final Parcelable.Creator<asl> CREATOR = new asm(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private agc f20631b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f20632c;

    public asl(int i9, byte[] bArr) {
        this.f20630a = i9;
        this.f20632c = bArr;
        b();
    }

    private final void b() {
        agc agcVar = this.f20631b;
        if (agcVar != null || this.f20632c == null) {
            if (agcVar == null || this.f20632c != null) {
                if (agcVar != null && this.f20632c != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (agcVar != null || this.f20632c != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    public final agc a() {
        if (this.f20631b == null) {
            try {
                this.f20631b = agc.c(this.f20632c, bqb.a());
                this.f20632c = null;
            } catch (bqw | NullPointerException e9) {
                throw new IllegalStateException(e9);
            }
        }
        b();
        return this.f20631b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, this.f20630a);
        byte[] bArrAv = this.f20632c;
        if (bArrAv == null) {
            bArrAv = this.f20631b.av();
        }
        y4.c.f(parcel, 2, bArrAv, false);
        y4.c.b(parcel, iA);
    }
}
