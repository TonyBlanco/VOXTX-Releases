package M4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class f5 extends AbstractC2985a {
    public static final Parcelable.Creator<f5> CREATOR = new g5();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f4681A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f4682B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final String f4683C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f4684D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final long f4685E;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f4689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f4690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f4691k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f4692l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f4693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f4694n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f4695o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f4696p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f4697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f4698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4699s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f4700t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f4701u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f4702v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Boolean f4703w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f4704x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List f4705y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f4706z;

    public f5(String str, String str2, String str3, long j9, String str4, long j10, long j11, String str5, boolean z9, boolean z10, String str6, long j12, long j13, int i9, boolean z11, boolean z12, String str7, Boolean bool, long j14, List list, String str8, String str9, String str10, String str11, boolean z13, long j15) {
        com.google.android.gms.common.internal.r.g(str);
        this.f4686f = str;
        this.f4687g = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f4688h = str3;
        this.f4695o = j9;
        this.f4689i = str4;
        this.f4690j = j10;
        this.f4691k = j11;
        this.f4692l = str5;
        this.f4693m = z9;
        this.f4694n = z10;
        this.f4696p = str6;
        this.f4697q = 0L;
        this.f4698r = j13;
        this.f4699s = i9;
        this.f4700t = z11;
        this.f4701u = z12;
        this.f4702v = str7;
        this.f4703w = bool;
        this.f4704x = j14;
        this.f4705y = list;
        this.f4706z = null;
        this.f4681A = str9;
        this.f4682B = str10;
        this.f4683C = str11;
        this.f4684D = z13;
        this.f4685E = j15;
    }

    public f5(String str, String str2, String str3, String str4, long j9, long j10, String str5, boolean z9, boolean z10, long j11, String str6, long j12, long j13, int i9, boolean z11, boolean z12, String str7, Boolean bool, long j14, List list, String str8, String str9, String str10, String str11, boolean z13, long j15) {
        this.f4686f = str;
        this.f4687g = str2;
        this.f4688h = str3;
        this.f4695o = j11;
        this.f4689i = str4;
        this.f4690j = j9;
        this.f4691k = j10;
        this.f4692l = str5;
        this.f4693m = z9;
        this.f4694n = z10;
        this.f4696p = str6;
        this.f4697q = j12;
        this.f4698r = j13;
        this.f4699s = i9;
        this.f4700t = z11;
        this.f4701u = z12;
        this.f4702v = str7;
        this.f4703w = bool;
        this.f4704x = j14;
        this.f4705y = list;
        this.f4706z = str8;
        this.f4681A = str9;
        this.f4682B = str10;
        this.f4683C = str11;
        this.f4684D = z13;
        this.f4685E = j15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 2, this.f4686f, false);
        y4.c.t(parcel, 3, this.f4687g, false);
        y4.c.t(parcel, 4, this.f4688h, false);
        y4.c.t(parcel, 5, this.f4689i, false);
        y4.c.o(parcel, 6, this.f4690j);
        y4.c.o(parcel, 7, this.f4691k);
        y4.c.t(parcel, 8, this.f4692l, false);
        y4.c.c(parcel, 9, this.f4693m);
        y4.c.c(parcel, 10, this.f4694n);
        y4.c.o(parcel, 11, this.f4695o);
        y4.c.t(parcel, 12, this.f4696p, false);
        y4.c.o(parcel, 13, this.f4697q);
        y4.c.o(parcel, 14, this.f4698r);
        y4.c.l(parcel, 15, this.f4699s);
        y4.c.c(parcel, 16, this.f4700t);
        y4.c.c(parcel, 18, this.f4701u);
        y4.c.t(parcel, 19, this.f4702v, false);
        y4.c.d(parcel, 21, this.f4703w, false);
        y4.c.o(parcel, 22, this.f4704x);
        y4.c.v(parcel, 23, this.f4705y, false);
        y4.c.t(parcel, 24, this.f4706z, false);
        y4.c.t(parcel, 25, this.f4681A, false);
        y4.c.t(parcel, 26, this.f4682B, false);
        y4.c.t(parcel, 27, this.f4683C, false);
        y4.c.c(parcel, 28, this.f4684D);
        y4.c.o(parcel, 29, this.f4685E);
        y4.c.b(parcel, iA);
    }
}
