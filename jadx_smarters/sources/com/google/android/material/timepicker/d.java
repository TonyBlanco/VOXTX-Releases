package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f27800a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f27801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27806h;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i9) {
            return new d[i9];
        }
    }

    public d(int i9, int i10, int i11, int i12) {
        this.f27803e = i9;
        this.f27804f = i10;
        this.f27805g = i11;
        this.f27802d = i12;
        this.f27806h = d(i9);
        this.f27800a = new b(59);
        this.f27801c = new b(i12 == 1 ? 24 : 12);
    }

    public d(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return c(resources, charSequence, "%02d");
    }

    public static String c(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    public static int d(int i9) {
        return i9 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f27803e == dVar.f27803e && this.f27804f == dVar.f27804f && this.f27802d == dVar.f27802d && this.f27805g == dVar.f27805g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f27802d), Integer.valueOf(this.f27803e), Integer.valueOf(this.f27804f), Integer.valueOf(this.f27805g)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f27803e);
        parcel.writeInt(this.f27804f);
        parcel.writeInt(this.f27805g);
        parcel.writeInt(this.f27802d);
    }
}
