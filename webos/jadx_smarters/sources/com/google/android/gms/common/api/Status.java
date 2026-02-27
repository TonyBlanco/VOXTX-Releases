package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import w4.C2914b;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class Status extends AbstractC2985a implements h, ReflectedParcelable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f26445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PendingIntent f26446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2914b f26447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Status f26436j = new Status(-1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Status f26437k = new Status(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Status f26438l = new Status(14);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Status f26439m = new Status(8);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Status f26440n = new Status(15);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Status f26441o = new Status(16);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Status f26443q = new Status(17);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f26442p = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new q();

    public Status(int i9) {
        this(i9, (String) null);
    }

    public Status(int i9, String str) {
        this(i9, str, (PendingIntent) null);
    }

    public Status(int i9, String str, PendingIntent pendingIntent) {
        this(i9, str, pendingIntent, null);
    }

    public Status(int i9, String str, PendingIntent pendingIntent, C2914b c2914b) {
        this.f26444f = i9;
        this.f26445g = str;
        this.f26446h = pendingIntent;
        this.f26447i = c2914b;
    }

    public Status(C2914b c2914b, String str) {
        this(c2914b, str, 17);
    }

    public Status(C2914b c2914b, String str, int i9) {
        this(i9, str, c2914b.J(), c2914b);
    }

    public C2914b H() {
        return this.f26447i;
    }

    public int I() {
        return this.f26444f;
    }

    public String J() {
        return this.f26445g;
    }

    public boolean K() {
        return this.f26446h != null;
    }

    public boolean L() {
        return this.f26444f <= 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f26444f == status.f26444f && AbstractC1418q.b(this.f26445g, status.f26445g) && AbstractC1418q.b(this.f26446h, status.f26446h) && AbstractC1418q.b(this.f26447i, status.f26447i);
    }

    @Override // com.google.android.gms.common.api.h
    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return AbstractC1418q.c(Integer.valueOf(this.f26444f), this.f26445g, this.f26446h, this.f26447i);
    }

    public String toString() {
        AbstractC1418q.a aVarD = AbstractC1418q.d(this);
        aVarD.a("statusCode", zza());
        aVarD.a("resolution", this.f26446h);
        return aVarD.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, I());
        y4.c.t(parcel, 2, J(), false);
        y4.c.r(parcel, 3, this.f26446h, i9, false);
        y4.c.r(parcel, 4, H(), i9, false);
        y4.c.b(parcel, iA);
    }

    public final String zza() {
        String str = this.f26445g;
        return str != null ? str : c.a(this.f26444f);
    }
}
