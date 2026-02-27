package H3;

import O2.C0936z0;
import P2.v0;
import android.net.Uri;
import android.text.TextUtils;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d4.AbstractC1684a;
import d4.F;
import d4.Z;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k3.C2143f;
import l3.C2182g;
import n3.C2249b;
import n3.C2252e;
import n3.C2255h;
import n3.C2257j;
import n3.H;
import q3.C2540a;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f2421d = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2423c;

    public d() {
        this(0, true);
    }

    public d(int i9, boolean z9) {
        this.f2422b = i9;
        this.f2423c = z9;
    }

    public static void b(int i9, List list) {
        if (w5.f.h(f2421d, i9) == -1 || list.contains(Integer.valueOf(i9))) {
            return;
        }
        list.add(Integer.valueOf(i9));
    }

    public static C2182g e(Z z9, C0936z0 c0936z0, List list) {
        int i9 = g(c0936z0) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new C2182g(i9, z9, null, list);
    }

    public static H f(int i9, boolean z9, C0936z0 c0936z0, List list, Z z10) {
        int i10 = i9 | 16;
        if (list != null) {
            i10 = i9 | 48;
        } else {
            list = z9 ? Collections.singletonList(new C0936z0.b().g0("application/cea-608").G()) : Collections.emptyList();
        }
        String str = c0936z0.f6464j;
        if (!TextUtils.isEmpty(str)) {
            if (!F.b(str, "audio/mp4a-latm")) {
                i10 |= 2;
            }
            if (!F.b(str, "video/avc")) {
                i10 |= 4;
            }
        }
        return new H(2, z10, new C2257j(i10, list));
    }

    public static boolean g(C0936z0 c0936z0) {
        C2540a c2540a = c0936z0.f6465k;
        if (c2540a == null) {
            return false;
        }
        for (int i9 = 0; i9 < c2540a.f(); i9++) {
            if (c2540a.e(i9) instanceof r) {
                return !((r) r2).f2588d.isEmpty();
            }
        }
        return false;
    }

    public static boolean h(InterfaceC1672i interfaceC1672i, InterfaceC1673j interfaceC1673j) {
        try {
            boolean zH = interfaceC1672i.h(interfaceC1673j);
            interfaceC1673j.f();
            return zH;
        } catch (EOFException unused) {
            interfaceC1673j.f();
            return false;
        } catch (Throwable th) {
            interfaceC1673j.f();
            throw th;
        }
    }

    @Override // H3.h
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b a(Uri uri, C0936z0 c0936z0, List list, Z z9, Map map, InterfaceC1673j interfaceC1673j, v0 v0Var) {
        int iA = d4.r.a(c0936z0.f6467m);
        int iB = d4.r.b(map);
        int iC = d4.r.c(uri);
        int[] iArr = f2421d;
        ArrayList arrayList = new ArrayList(iArr.length);
        b(iA, arrayList);
        b(iB, arrayList);
        b(iC, arrayList);
        for (int i9 : iArr) {
            b(i9, arrayList);
        }
        interfaceC1673j.f();
        InterfaceC1672i interfaceC1672i = null;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            int iIntValue = ((Integer) arrayList.get(i10)).intValue();
            InterfaceC1672i interfaceC1672i2 = (InterfaceC1672i) AbstractC1684a.e(d(iIntValue, c0936z0, list, z9));
            if (h(interfaceC1672i2, interfaceC1673j)) {
                return new b(interfaceC1672i2, c0936z0, z9);
            }
            if (interfaceC1672i == null && (iIntValue == iA || iIntValue == iB || iIntValue == iC || iIntValue == 11)) {
                interfaceC1672i = interfaceC1672i2;
            }
        }
        return new b((InterfaceC1672i) AbstractC1684a.e(interfaceC1672i), c0936z0, z9);
    }

    public final InterfaceC1672i d(int i9, C0936z0 c0936z0, List list, Z z9) {
        if (i9 == 0) {
            return new C2249b();
        }
        if (i9 == 1) {
            return new C2252e();
        }
        if (i9 == 2) {
            return new C2255h();
        }
        if (i9 == 7) {
            return new C2143f(0, 0L);
        }
        if (i9 == 8) {
            return e(z9, c0936z0, list);
        }
        if (i9 == 11) {
            return f(this.f2422b, this.f2423c, c0936z0, list, z9);
        }
        if (i9 != 13) {
            return null;
        }
        return new u(c0936z0.f6458d, z9);
    }
}
