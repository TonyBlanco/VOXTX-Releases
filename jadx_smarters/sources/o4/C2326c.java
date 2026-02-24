package o4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.cast.zzeq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n4.C2276i;
import p4.C2426a;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: o4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2326c extends AbstractC2985a {
    public static final Parcelable.Creator<C2326c> CREATOR = new f0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f45840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f45841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f45842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2276i f45843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f45844j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C2426a f45845k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f45846l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final double f45847m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f45848n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f45849o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f45850p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f45851q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f45852r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f45853s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f45854t;

    /* JADX INFO: renamed from: o4.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f45855a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f45857c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f45856b = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C2276i f45858d = new C2276i();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f45859e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public zzeq f45860f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f45861g = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double f45862h = 0.05000000074505806d;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f45863i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List f45864j = new ArrayList();

        public C2326c a() {
            zzeq zzeqVar = this.f45860f;
            return new C2326c(this.f45855a, this.f45856b, this.f45857c, this.f45858d, this.f45859e, (C2426a) (zzeqVar != null ? zzeqVar.zza() : new C2426a.C0411a().a()), this.f45861g, this.f45862h, false, false, this.f45863i, this.f45864j, true, 0, false);
        }

        public a b(C2426a c2426a) {
            this.f45860f = zzeq.zzb(c2426a);
            return this;
        }

        public a c(String str) {
            this.f45855a = str;
            return this;
        }
    }

    public C2326c(String str, List list, boolean z9, C2276i c2276i, boolean z10, C2426a c2426a, boolean z11, double d9, boolean z12, boolean z13, boolean z14, List list2, boolean z15, int i9, boolean z16) {
        this.f45840f = true == TextUtils.isEmpty(str) ? "" : str;
        int size = list == null ? 0 : list.size();
        ArrayList arrayList = new ArrayList(size);
        this.f45841g = arrayList;
        if (size > 0) {
            arrayList.addAll(list);
        }
        this.f45842h = z9;
        this.f45843i = c2276i == null ? new C2276i() : c2276i;
        this.f45844j = z10;
        this.f45845k = c2426a;
        this.f45846l = z11;
        this.f45847m = d9;
        this.f45848n = z12;
        this.f45849o = z13;
        this.f45850p = z14;
        this.f45851q = list2;
        this.f45852r = z15;
        this.f45853s = i9;
        this.f45854t = z16;
    }

    public C2426a H() {
        return this.f45845k;
    }

    public boolean I() {
        return this.f45846l;
    }

    public C2276i J() {
        return this.f45843i;
    }

    public String K() {
        return this.f45840f;
    }

    public boolean L() {
        return this.f45844j;
    }

    public boolean M() {
        return this.f45842h;
    }

    public List N() {
        return Collections.unmodifiableList(this.f45841g);
    }

    public double O() {
        return this.f45847m;
    }

    public final List P() {
        return Collections.unmodifiableList(this.f45851q);
    }

    public final boolean Q() {
        return this.f45849o;
    }

    public final boolean R() {
        return this.f45853s == 1;
    }

    public final boolean S() {
        return this.f45850p;
    }

    public final boolean T() {
        return this.f45852r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 2, K(), false);
        y4.c.v(parcel, 3, N(), false);
        y4.c.c(parcel, 4, M());
        y4.c.r(parcel, 5, J(), i9, false);
        y4.c.c(parcel, 6, L());
        y4.c.r(parcel, 7, H(), i9, false);
        y4.c.c(parcel, 8, I());
        y4.c.g(parcel, 9, O());
        y4.c.c(parcel, 10, this.f45848n);
        y4.c.c(parcel, 11, this.f45849o);
        y4.c.c(parcel, 12, this.f45850p);
        y4.c.v(parcel, 13, Collections.unmodifiableList(this.f45851q), false);
        y4.c.c(parcel, 14, this.f45852r);
        y4.c.l(parcel, 15, this.f45853s);
        y4.c.c(parcel, 16, this.f45854t);
        y4.c.b(parcel, iA);
    }

    public final boolean zzg() {
        return this.f45854t;
    }
}
