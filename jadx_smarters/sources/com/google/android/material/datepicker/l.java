package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Comparable, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f27347a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f27352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f27353h;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return l.c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i9) {
            return new l[i9];
        }
    }

    public l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarD = v.d(calendar);
        this.f27347a = calendarD;
        this.f27348c = calendarD.get(2);
        this.f27349d = calendarD.get(1);
        this.f27350e = calendarD.getMaximum(7);
        this.f27351f = calendarD.getActualMaximum(5);
        this.f27352g = calendarD.getTimeInMillis();
    }

    public static l c(int i9, int i10) {
        Calendar calendarK = v.k();
        calendarK.set(1, i9);
        calendarK.set(2, i10);
        return new l(calendarK);
    }

    public static l d(long j9) {
        Calendar calendarK = v.k();
        calendarK.setTimeInMillis(j9);
        return new l(calendarK);
    }

    public static l h() {
        return new l(v.i());
    }

    public l A(int i9) {
        Calendar calendarD = v.d(this.f27347a);
        calendarD.add(2, i9);
        return new l(calendarD);
    }

    public int C(l lVar) {
        if (this.f27347a instanceof GregorianCalendar) {
            return ((lVar.f27349d - this.f27349d) * 12) + (lVar.f27348c - this.f27348c);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(l lVar) {
        return this.f27347a.compareTo(lVar.f27347a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f27348c == lVar.f27348c && this.f27349d == lVar.f27349d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f27348c), Integer.valueOf(this.f27349d)});
    }

    public int r() {
        int firstDayOfWeek = this.f27347a.get(7) - this.f27347a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f27350e : firstDayOfWeek;
    }

    public long t(int i9) {
        Calendar calendarD = v.d(this.f27347a);
        calendarD.set(5, i9);
        return calendarD.getTimeInMillis();
    }

    public int v(long j9) {
        Calendar calendarD = v.d(this.f27347a);
        calendarD.setTimeInMillis(j9);
        return calendarD.get(5);
    }

    public String w() {
        if (this.f27353h == null) {
            this.f27353h = f.c(this.f27347a.getTimeInMillis());
        }
        return this.f27353h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f27349d);
        parcel.writeInt(this.f27348c);
    }

    public long x() {
        return this.f27347a.getTimeInMillis();
    }
}
