package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0259a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f27252a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f27253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f27254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f27255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27257g;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    public class C0259a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((l) parcel.readParcelable(l.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i9) {
            return new a[i9];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f27258e = v.a(l.c(1900, 0).f27352g);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f27259f = v.a(l.c(AdError.BROKEN_MEDIA_ERROR_CODE, 11).f27352g);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f27260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f27261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f27262c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f27263d;

        public b(a aVar) {
            this.f27260a = f27258e;
            this.f27261b = f27259f;
            this.f27263d = g.a(Long.MIN_VALUE);
            this.f27260a = aVar.f27252a.f27352g;
            this.f27261b = aVar.f27253c.f27352g;
            this.f27262c = Long.valueOf(aVar.f27255e.f27352g);
            this.f27263d = aVar.f27254d;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f27263d);
            l lVarD = l.d(this.f27260a);
            l lVarD2 = l.d(this.f27261b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l9 = this.f27262c;
            return new a(lVarD, lVarD2, cVar, l9 == null ? null : l.d(l9.longValue()), null);
        }

        public b b(long j9) {
            this.f27262c = Long.valueOf(j9);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean b(long j9);
    }

    public a(l lVar, l lVar2, c cVar, l lVar3) {
        this.f27252a = lVar;
        this.f27253c = lVar2;
        this.f27255e = lVar3;
        this.f27254d = cVar;
        if (lVar3 != null && lVar.compareTo(lVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (lVar3 != null && lVar3.compareTo(lVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f27257g = lVar.C(lVar2) + 1;
        this.f27256f = (lVar2.f27349d - lVar.f27349d) + 1;
    }

    public /* synthetic */ a(l lVar, l lVar2, c cVar, l lVar3, C0259a c0259a) {
        this(lVar, lVar2, cVar, lVar3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f27252a.equals(aVar.f27252a) && this.f27253c.equals(aVar.f27253c) && O.c.a(this.f27255e, aVar.f27255e) && this.f27254d.equals(aVar.f27254d);
    }

    public c f() {
        return this.f27254d;
    }

    public l g() {
        return this.f27253c;
    }

    public int h() {
        return this.f27257g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f27252a, this.f27253c, this.f27255e, this.f27254d});
    }

    public l k() {
        return this.f27255e;
    }

    public l m() {
        return this.f27252a;
    }

    public int r() {
        return this.f27256f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeParcelable(this.f27252a, 0);
        parcel.writeParcelable(this.f27253c, 0);
        parcel.writeParcelable(this.f27255e, 0);
        parcel.writeParcelable(this.f27254d, 0);
    }
}
