package B3;

import O2.C0936z0;
import O2.InterfaceC0901n;
import android.os.Bundle;
import android.os.Parcelable;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.AbstractC1687d;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements InterfaceC0901n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f578g = d4.k0.A0(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f579h = d4.k0.A0(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final InterfaceC0901n.a f580i = new InterfaceC0901n.a() { // from class: B3.f0
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return g0.e(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f581a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0936z0[] f584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f585f;

    public g0(String str, C0936z0... c0936z0Arr) {
        AbstractC1684a.a(c0936z0Arr.length > 0);
        this.f582c = str;
        this.f584e = c0936z0Arr;
        this.f581a = c0936z0Arr.length;
        int iK = d4.F.k(c0936z0Arr[0].f6467m);
        this.f583d = iK == -1 ? d4.F.k(c0936z0Arr[0].f6466l) : iK;
        j();
    }

    public g0(C0936z0... c0936z0Arr) {
        this("", c0936z0Arr);
    }

    public static /* synthetic */ g0 e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f578g);
        return new g0(bundle.getString(f579h, ""), (C0936z0[]) (parcelableArrayList == null ? AbstractC2743y.z() : AbstractC1687d.d(C0936z0.f6446u0, parcelableArrayList)).toArray(new C0936z0[0]));
    }

    public static void f(String str, String str2, String str3, int i9) {
        AbstractC1681B.e("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i9 + ")"));
    }

    public static String g(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public static int i(int i9) {
        return i9 | Http2.INITIAL_MAX_FRAME_SIZE;
    }

    public g0 b(String str) {
        return new g0(str, this.f584e);
    }

    public C0936z0 c(int i9) {
        return this.f584e[i9];
    }

    public int d(C0936z0 c0936z0) {
        int i9 = 0;
        while (true) {
            C0936z0[] c0936z0Arr = this.f584e;
            if (i9 >= c0936z0Arr.length) {
                return -1;
            }
            if (c0936z0 == c0936z0Arr[i9]) {
                return i9;
            }
            i9++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f582c.equals(g0Var.f582c) && Arrays.equals(this.f584e, g0Var.f584e);
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f584e.length);
        for (C0936z0 c0936z0 : this.f584e) {
            arrayList.add(c0936z0.j(true));
        }
        bundle.putParcelableArrayList(f578g, arrayList);
        bundle.putString(f579h, this.f582c);
        return bundle;
    }

    public int hashCode() {
        if (this.f585f == 0) {
            this.f585f = ((527 + this.f582c.hashCode()) * 31) + Arrays.hashCode(this.f584e);
        }
        return this.f585f;
    }

    public final void j() {
        String strG = g(this.f584e[0].f6458d);
        int i9 = i(this.f584e[0].f6460f);
        int i10 = 1;
        while (true) {
            C0936z0[] c0936z0Arr = this.f584e;
            if (i10 >= c0936z0Arr.length) {
                return;
            }
            if (!strG.equals(g(c0936z0Arr[i10].f6458d))) {
                C0936z0[] c0936z0Arr2 = this.f584e;
                f("languages", c0936z0Arr2[0].f6458d, c0936z0Arr2[i10].f6458d, i10);
                return;
            } else {
                if (i9 != i(this.f584e[i10].f6460f)) {
                    f("role flags", Integer.toBinaryString(this.f584e[0].f6460f), Integer.toBinaryString(this.f584e[i10].f6460f), i10);
                    return;
                }
                i10++;
            }
        }
    }
}
