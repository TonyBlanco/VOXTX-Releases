package G5;

import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: G5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0537d extends AbstractC2985a {
    public static final Parcelable.Creator<C0537d> CREATOR = new c0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f2210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f2212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f2213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f2214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2215n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f2216o;

    public C0537d(String str, String str2, String str3, String str4, boolean z9, String str5, boolean z10, String str6, int i9, String str7) {
        this.f2207f = str;
        this.f2208g = str2;
        this.f2209h = str3;
        this.f2210i = str4;
        this.f2211j = z9;
        this.f2212k = str5;
        this.f2213l = z10;
        this.f2214m = str6;
        this.f2215n = i9;
        this.f2216o = str7;
    }

    public boolean H() {
        return this.f2213l;
    }

    public boolean I() {
        return this.f2211j;
    }

    public String J() {
        return this.f2212k;
    }

    public String K() {
        return this.f2210i;
    }

    public String L() {
        return this.f2208g;
    }

    public String M() {
        return this.f2207f;
    }

    public final int N() {
        return this.f2215n;
    }

    public final void O(int i9) {
        this.f2215n = i9;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, M(), false);
        y4.c.t(parcel, 2, L(), false);
        y4.c.t(parcel, 3, this.f2209h, false);
        y4.c.t(parcel, 4, K(), false);
        y4.c.c(parcel, 5, I());
        y4.c.t(parcel, 6, J(), false);
        y4.c.c(parcel, 7, H());
        y4.c.t(parcel, 8, this.f2214m, false);
        y4.c.l(parcel, 9, this.f2215n);
        y4.c.t(parcel, 10, this.f2216o, false);
        y4.c.b(parcel, iA);
    }

    public final String zzc() {
        return this.f2216o;
    }

    public final String zzd() {
        return this.f2209h;
    }

    public final String zze() {
        return this.f2214m;
    }
}
