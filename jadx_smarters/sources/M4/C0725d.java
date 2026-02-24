package M4;

import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: M4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0725d extends AbstractC2985a {
    public static final Parcelable.Creator<C0725d> CREATOR = new C0731e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f4637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public V4 f4639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f4640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f4642k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0832v f4643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4644m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0832v f4645n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f4646o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0832v f4647p;

    public C0725d(C0725d c0725d) {
        com.google.android.gms.common.internal.r.m(c0725d);
        this.f4637f = c0725d.f4637f;
        this.f4638g = c0725d.f4638g;
        this.f4639h = c0725d.f4639h;
        this.f4640i = c0725d.f4640i;
        this.f4641j = c0725d.f4641j;
        this.f4642k = c0725d.f4642k;
        this.f4643l = c0725d.f4643l;
        this.f4644m = c0725d.f4644m;
        this.f4645n = c0725d.f4645n;
        this.f4646o = c0725d.f4646o;
        this.f4647p = c0725d.f4647p;
    }

    public C0725d(String str, String str2, V4 v42, long j9, boolean z9, String str3, C0832v c0832v, long j10, C0832v c0832v2, long j11, C0832v c0832v3) {
        this.f4637f = str;
        this.f4638g = str2;
        this.f4639h = v42;
        this.f4640i = j9;
        this.f4641j = z9;
        this.f4642k = str3;
        this.f4643l = c0832v;
        this.f4644m = j10;
        this.f4645n = c0832v2;
        this.f4646o = j11;
        this.f4647p = c0832v3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 2, this.f4637f, false);
        y4.c.t(parcel, 3, this.f4638g, false);
        y4.c.r(parcel, 4, this.f4639h, i9, false);
        y4.c.o(parcel, 5, this.f4640i);
        y4.c.c(parcel, 6, this.f4641j);
        y4.c.t(parcel, 7, this.f4642k, false);
        y4.c.r(parcel, 8, this.f4643l, i9, false);
        y4.c.o(parcel, 9, this.f4644m);
        y4.c.r(parcel, 10, this.f4645n, i9, false);
        y4.c.o(parcel, 11, this.f4646o);
        y4.c.r(parcel, 12, this.f4647p, i9, false);
        y4.c.b(parcel, iA);
    }
}
