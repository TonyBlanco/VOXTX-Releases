package G5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.p001firebaseauthapi.zzag;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;

/* JADX INFO: loaded from: classes3.dex */
public class f0 extends E {
    public static final Parcelable.Creator<f0> CREATOR = new e0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzagt f2227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f2228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f2229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f2230l;

    public f0(String str, String str2, String str3, zzagt zzagtVar, String str4, String str5, String str6) {
        this.f2224f = zzag.zzb(str);
        this.f2225g = str2;
        this.f2226h = str3;
        this.f2227i = zzagtVar;
        this.f2228j = str4;
        this.f2229k = str5;
        this.f2230l = str6;
    }

    public static f0 N(zzagt zzagtVar) {
        com.google.android.gms.common.internal.r.n(zzagtVar, "Must specify a non-null webSignInCredential");
        return new f0(null, null, null, zzagtVar, null, null, null);
    }

    public static f0 O(String str, String str2, String str3, String str4, String str5) {
        com.google.android.gms.common.internal.r.h(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new f0(str, str2, str3, null, str4, str5, null);
    }

    public static zzagt P(f0 f0Var, String str) {
        com.google.android.gms.common.internal.r.m(f0Var);
        zzagt zzagtVar = f0Var.f2227i;
        return zzagtVar != null ? zzagtVar : new zzagt(f0Var.L(), f0Var.K(), f0Var.H(), null, f0Var.M(), null, str, f0Var.f2228j, f0Var.f2230l);
    }

    @Override // G5.AbstractC0540g
    public String H() {
        return this.f2224f;
    }

    @Override // G5.AbstractC0540g
    public String I() {
        return this.f2224f;
    }

    @Override // G5.AbstractC0540g
    public final AbstractC0540g J() {
        return new f0(this.f2224f, this.f2225g, this.f2226h, this.f2227i, this.f2228j, this.f2229k, this.f2230l);
    }

    @Override // G5.E
    public String K() {
        return this.f2226h;
    }

    @Override // G5.E
    public String L() {
        return this.f2225g;
    }

    @Override // G5.E
    public String M() {
        return this.f2229k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, H(), false);
        y4.c.t(parcel, 2, L(), false);
        y4.c.t(parcel, 3, K(), false);
        y4.c.r(parcel, 4, this.f2227i, i9, false);
        y4.c.t(parcel, 5, this.f2228j, false);
        y4.c.t(parcel, 6, M(), false);
        y4.c.t(parcel, 7, this.f2230l, false);
        y4.c.b(parcel, iA);
    }
}
