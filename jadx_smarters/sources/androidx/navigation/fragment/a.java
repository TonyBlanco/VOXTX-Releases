package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.w;
import androidx.navigation.k;
import androidx.navigation.p;
import androidx.navigation.s;
import com.amazonaws.services.s3.internal.Constants;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class a extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f16346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayDeque f16348d = new ArrayDeque();

    /* JADX INFO: renamed from: androidx.navigation.fragment.a$a, reason: collision with other inner class name */
    public static class C0188a extends k {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f16349k;

        public C0188a(s sVar) {
            super(sVar);
        }

        public final C0188a A(String str) {
            this.f16349k = str;
            return this;
        }

        @Override // androidx.navigation.k
        public void p(Context context, AttributeSet attributeSet) {
            super.p(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, c.f16359i);
            String string = typedArrayObtainAttributes.getString(c.f16360j);
            if (string != null) {
                A(string);
            }
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.navigation.k
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f16349k;
            if (str == null) {
                str = Constants.NULL_VERSION_ID;
            }
            sb.append(str);
            return sb.toString();
        }

        public final String z() {
            String str = this.f16349k;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Fragment class was not set");
        }
    }

    public a(Context context, m mVar, int i9) {
        this.f16345a = context;
        this.f16346b = mVar;
        this.f16347c = i9;
    }

    @Override // androidx.navigation.s
    public void c(Bundle bundle) {
        int[] intArray;
        if (bundle == null || (intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds")) == null) {
            return;
        }
        this.f16348d.clear();
        for (int i9 : intArray) {
            this.f16348d.add(Integer.valueOf(i9));
        }
    }

    @Override // androidx.navigation.s
    public Bundle d() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.f16348d.size()];
        Iterator it = this.f16348d.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            iArr[i9] = ((Integer) it.next()).intValue();
            i9++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    @Override // androidx.navigation.s
    public boolean e() {
        if (this.f16348d.isEmpty()) {
            return false;
        }
        if (this.f16346b.K0()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        this.f16346b.X0(g(this.f16348d.size(), ((Integer) this.f16348d.peekLast()).intValue()), 1);
        this.f16348d.removeLast();
        return true;
    }

    @Override // androidx.navigation.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0188a a() {
        return new C0188a(this);
    }

    public final String g(int i9, int i10) {
        return i9 + "-" + i10;
    }

    public Fragment h(Context context, m mVar, String str, Bundle bundle) {
        return mVar.q0().a(context.getClassLoader(), str);
    }

    @Override // androidx.navigation.s
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public k b(C0188a c0188a, Bundle bundle, p pVar, s.a aVar) {
        if (this.f16346b.K0()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String strZ = c0188a.z();
        boolean z9 = false;
        if (strZ.charAt(0) == '.') {
            strZ = this.f16345a.getPackageName() + strZ;
        }
        Fragment fragmentH = h(this.f16345a, this.f16346b, strZ, bundle);
        fragmentH.setArguments(bundle);
        w wVarM = this.f16346b.m();
        int iA = pVar != null ? pVar.a() : -1;
        int iB = pVar != null ? pVar.b() : -1;
        int iC = pVar != null ? pVar.c() : -1;
        int iD = pVar != null ? pVar.d() : -1;
        if (iA != -1 || iB != -1 || iC != -1 || iD != -1) {
            if (iA == -1) {
                iA = 0;
            }
            if (iB == -1) {
                iB = 0;
            }
            if (iC == -1) {
                iC = 0;
            }
            if (iD == -1) {
                iD = 0;
            }
            wVarM.t(iA, iB, iC, iD);
        }
        wVarM.q(this.f16347c, fragmentH);
        wVarM.v(fragmentH);
        int i9 = c0188a.i();
        boolean zIsEmpty = this.f16348d.isEmpty();
        boolean z10 = pVar != null && !zIsEmpty && pVar.g() && ((Integer) this.f16348d.peekLast()).intValue() == i9;
        if (zIsEmpty) {
            z9 = true;
        } else if (!z10) {
            wVarM.g(g(this.f16348d.size() + 1, i9));
            z9 = true;
        } else if (this.f16348d.size() > 1) {
            this.f16346b.X0(g(this.f16348d.size(), ((Integer) this.f16348d.peekLast()).intValue()), 1);
            wVarM.g(g(this.f16348d.size(), i9));
        }
        wVarM.w(true);
        wVarM.i();
        if (!z9) {
            return null;
        }
        this.f16348d.add(Integer.valueOf(i9));
        return c0188a;
    }
}
