package H5;

import G5.AbstractC0553u;
import G5.AbstractC0558z;
import G5.C0555w;
import G5.InterfaceC0554v;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzafn;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: H5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0611b extends AbstractC0553u {
    public static final Parcelable.Creator<C0611b> CREATOR = new C0614e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zzafn f2651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0 f2652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f2653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f2654i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f2655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f2656k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f2657l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f2658m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0613d f2659n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2660o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public G5.f0 f2661p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0634z f2662q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f2663r;

    public C0611b(A5.f fVar, List list) {
        com.google.android.gms.common.internal.r.m(fVar);
        this.f2653h = fVar.o();
        this.f2654i = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f2657l = "2";
        O(list);
    }

    public C0611b(zzafn zzafnVar, f0 f0Var, String str, String str2, List list, List list2, String str3, Boolean bool, C0613d c0613d, boolean z9, G5.f0 f0Var2, C0634z c0634z, List list3) {
        this.f2651f = zzafnVar;
        this.f2652g = f0Var;
        this.f2653h = str;
        this.f2654i = str2;
        this.f2655j = list;
        this.f2656k = list2;
        this.f2657l = str3;
        this.f2658m = bool;
        this.f2659n = c0613d;
        this.f2660o = z9;
        this.f2661p = f0Var2;
        this.f2662q = c0634z;
        this.f2663r = list3;
    }

    @Override // G5.AbstractC0553u
    public InterfaceC0554v H() {
        return this.f2659n;
    }

    @Override // G5.AbstractC0553u
    public /* synthetic */ AbstractC0558z I() {
        return new C0615f(this);
    }

    @Override // G5.AbstractC0553u
    public List J() {
        return this.f2655j;
    }

    @Override // G5.AbstractC0553u
    public String K() {
        Map map;
        zzafn zzafnVar = this.f2651f;
        if (zzafnVar == null || zzafnVar.zzc() == null || (map = (Map) AbstractC0630v.a(this.f2651f.zzc()).a().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // G5.AbstractC0553u
    public String L() {
        return this.f2652g.K();
    }

    @Override // G5.AbstractC0553u
    public boolean M() {
        C0555w c0555wA;
        Boolean bool = this.f2658m;
        if (bool == null || bool.booleanValue()) {
            zzafn zzafnVar = this.f2651f;
            String strB = "";
            if (zzafnVar != null && (c0555wA = AbstractC0630v.a(zzafnVar.zzc())) != null) {
                strB = c0555wA.b();
            }
            boolean z9 = true;
            if (J().size() > 1 || (strB != null && strB.equals("custom"))) {
                z9 = false;
            }
            this.f2658m = Boolean.valueOf(z9);
        }
        return this.f2658m.booleanValue();
    }

    @Override // G5.AbstractC0553u
    public final A5.f N() {
        return A5.f.n(this.f2653h);
    }

    @Override // G5.AbstractC0553u
    public final synchronized AbstractC0553u O(List list) {
        try {
            com.google.android.gms.common.internal.r.m(list);
            this.f2655j = new ArrayList(list.size());
            this.f2656k = new ArrayList(list.size());
            for (int i9 = 0; i9 < list.size(); i9++) {
                G5.O o9 = (G5.O) list.get(i9);
                if (o9.g().equals("firebase")) {
                    this.f2652g = (f0) o9;
                } else {
                    this.f2656k.add(o9.g());
                }
                this.f2655j.add((f0) o9);
            }
            if (this.f2652g == null) {
                this.f2652g = (f0) this.f2655j.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // G5.AbstractC0553u
    public final void P(zzafn zzafnVar) {
        this.f2651f = (zzafn) com.google.android.gms.common.internal.r.m(zzafnVar);
    }

    @Override // G5.AbstractC0553u
    public final /* synthetic */ AbstractC0553u Q() {
        this.f2658m = Boolean.FALSE;
        return this;
    }

    @Override // G5.AbstractC0553u
    public final void R(List list) {
        this.f2662q = C0634z.c(list);
    }

    @Override // G5.AbstractC0553u
    public final zzafn S() {
        return this.f2651f;
    }

    @Override // G5.AbstractC0553u
    public final List T() {
        return this.f2656k;
    }

    public final C0611b U(String str) {
        this.f2657l = str;
        return this;
    }

    public final void V(G5.f0 f0Var) {
        this.f2661p = f0Var;
    }

    public final void W(C0613d c0613d) {
        this.f2659n = c0613d;
    }

    public final void X(boolean z9) {
        this.f2660o = z9;
    }

    public final void Y(List list) {
        com.google.android.gms.common.internal.r.m(list);
        this.f2663r = list;
    }

    public final G5.f0 Z() {
        return this.f2661p;
    }

    public final List a0() {
        return this.f2655j;
    }

    public final boolean b0() {
        return this.f2660o;
    }

    @Override // G5.O
    public String g() {
        return this.f2652g.g();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.r(parcel, 1, S(), i9, false);
        y4.c.r(parcel, 2, this.f2652g, i9, false);
        y4.c.t(parcel, 3, this.f2653h, false);
        y4.c.t(parcel, 4, this.f2654i, false);
        y4.c.x(parcel, 5, this.f2655j, false);
        y4.c.v(parcel, 6, T(), false);
        y4.c.t(parcel, 7, this.f2657l, false);
        y4.c.d(parcel, 8, Boolean.valueOf(M()), false);
        y4.c.r(parcel, 9, H(), i9, false);
        y4.c.c(parcel, 10, this.f2660o);
        y4.c.r(parcel, 11, this.f2661p, i9, false);
        y4.c.r(parcel, 12, this.f2662q, i9, false);
        y4.c.x(parcel, 13, this.f2663r, false);
        y4.c.b(parcel, iA);
    }

    @Override // G5.AbstractC0553u
    public final String zzd() {
        return S().zzc();
    }

    @Override // G5.AbstractC0553u
    public final String zze() {
        return this.f2651f.zzf();
    }

    public final List zzh() {
        C0634z c0634z = this.f2662q;
        return c0634z != null ? c0634z.H() : new ArrayList();
    }
}
