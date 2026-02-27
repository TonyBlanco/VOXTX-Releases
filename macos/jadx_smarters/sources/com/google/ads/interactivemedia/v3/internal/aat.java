package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class aat extends aba {
    public static final Parcelable.Creator<aat> CREATOR = new aaq(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f18691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final aba[] f18692e;

    public aat(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i9 = cq.f22640a;
        this.f18688a = string;
        this.f18689b = parcel.readByte() != 0;
        this.f18690c = parcel.readByte() != 0;
        this.f18691d = (String[]) cq.G(parcel.createStringArray());
        int i10 = parcel.readInt();
        this.f18692e = new aba[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18692e[i11] = (aba) parcel.readParcelable(aba.class.getClassLoader());
        }
    }

    public aat(String str, boolean z9, boolean z10, String[] strArr, aba[] abaVarArr) {
        super("CTOC");
        this.f18688a = str;
        this.f18689b = z9;
        this.f18690c = z10;
        this.f18691d = strArr;
        this.f18692e = abaVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aat.class == obj.getClass()) {
            aat aatVar = (aat) obj;
            if (this.f18689b == aatVar.f18689b && this.f18690c == aatVar.f18690c && cq.V(this.f18688a, aatVar.f18688a) && Arrays.equals(this.f18691d, aatVar.f18691d) && Arrays.equals(this.f18692e, aatVar.f18692e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = ((((this.f18689b ? 1 : 0) + 527) * 31) + (this.f18690c ? 1 : 0)) * 31;
        String str = this.f18688a;
        return i9 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f18688a);
        parcel.writeByte(this.f18689b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f18690c ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f18691d);
        parcel.writeInt(this.f18692e.length);
        for (aba abaVar : this.f18692e) {
            parcel.writeParcelable(abaVar, 0);
        }
    }
}
