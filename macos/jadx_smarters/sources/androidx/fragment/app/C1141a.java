package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.w;
import androidx.lifecycle.AbstractC1180j;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1141a extends w implements m.n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m f14943t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14944u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14945v;

    public C1141a(m mVar) {
        super(mVar.q0(), mVar.t0() != null ? mVar.t0().f().getClassLoader() : null);
        this.f14945v = -1;
        this.f14943t = mVar;
    }

    public static boolean H(w.a aVar) {
        Fragment fragment = aVar.f15180b;
        return (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) ? false : true;
    }

    public void A(String str, PrintWriter printWriter, boolean z9) {
        String str2;
        if (z9) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f15170k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f14945v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f14944u);
            if (this.f15167h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f15167h));
            }
            if (this.f15163d != 0 || this.f15164e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f15163d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f15164e));
            }
            if (this.f15165f != 0 || this.f15166g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f15165f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f15166g));
            }
            if (this.f15171l != 0 || this.f15172m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f15171l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f15172m);
            }
            if (this.f15173n != 0 || this.f15174o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f15173n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f15174o);
            }
        }
        if (this.f15162c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f15162c.size();
        for (int i9 = 0; i9 < size; i9++) {
            w.a aVar = (w.a) this.f15162c.get(i9);
            switch (aVar.f15179a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f15179a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i9);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f15180b);
            if (z9) {
                if (aVar.f15181c != 0 || aVar.f15182d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f15181c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f15182d));
                }
                if (aVar.f15183e != 0 || aVar.f15184f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f15183e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f15184f));
                }
            }
        }
    }

    public void B() {
        int size = this.f15162c.size();
        for (int i9 = 0; i9 < size; i9++) {
            w.a aVar = (w.a) this.f15162c.get(i9);
            Fragment fragment = aVar.f15180b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f15167h);
                fragment.setSharedElementNames(this.f15175p, this.f15176q);
            }
            switch (aVar.f15179a) {
                case 1:
                    fragment.setAnimations(aVar.f15181c, aVar.f15182d, aVar.f15183e, aVar.f15184f);
                    this.f14943t.o1(fragment, false);
                    this.f14943t.g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f15179a);
                case 3:
                    fragment.setAnimations(aVar.f15181c, aVar.f15182d, aVar.f15183e, aVar.f15184f);
                    this.f14943t.f1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f15181c, aVar.f15182d, aVar.f15183e, aVar.f15184f);
                    this.f14943t.C0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f15181c, aVar.f15182d, aVar.f15183e, aVar.f15184f);
                    this.f14943t.o1(fragment, false);
                    this.f14943t.s1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f15181c, aVar.f15182d, aVar.f15183e, aVar.f15184f);
                    this.f14943t.x(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f15181c, aVar.f15182d, aVar.f15183e, aVar.f15184f);
                    this.f14943t.o1(fragment, false);
                    this.f14943t.l(fragment);
                    break;
                case 8:
                    this.f14943t.q1(fragment);
                    break;
                case 9:
                    this.f14943t.q1(null);
                    break;
                case 10:
                    this.f14943t.p1(fragment, aVar.f15186h);
                    break;
            }
            if (!this.f15177r && aVar.f15179a != 1 && fragment != null && !m.f15044P) {
                this.f14943t.P0(fragment);
            }
        }
        if (this.f15177r || m.f15044P) {
            return;
        }
        m mVar = this.f14943t;
        mVar.Q0(mVar.f15075q, true);
    }

    public void C(boolean z9) {
        for (int size = this.f15162c.size() - 1; size >= 0; size--) {
            w.a aVar = (w.a) this.f15162c.get(size);
            Fragment fragment = aVar.f15180b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(m.k1(this.f15167h));
                fragment.setSharedElementNames(this.f15176q, this.f15175p);
            }
            switch (aVar.f15179a) {
                case 1:
                    fragment.setAnimations(aVar.f15181c, aVar.f15182d, aVar.f15183e, aVar.f15184f);
                    this.f14943t.o1(fragment, true);
                    this.f14943t.f1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f15179a);
                case 3:
                    fragment.setAnimations(aVar.f15181c, aVar.f15182d, aVar.f15183e, aVar.f15184f);
                    this.f14943t.g(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f15181c, aVar.f15182d, aVar.f15183e, aVar.f15184f);
                    this.f14943t.s1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f15181c, aVar.f15182d, aVar.f15183e, aVar.f15184f);
                    this.f14943t.o1(fragment, true);
                    this.f14943t.C0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f15181c, aVar.f15182d, aVar.f15183e, aVar.f15184f);
                    this.f14943t.l(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f15181c, aVar.f15182d, aVar.f15183e, aVar.f15184f);
                    this.f14943t.o1(fragment, true);
                    this.f14943t.x(fragment);
                    break;
                case 8:
                    this.f14943t.q1(null);
                    break;
                case 9:
                    this.f14943t.q1(fragment);
                    break;
                case 10:
                    this.f14943t.p1(fragment, aVar.f15185g);
                    break;
            }
            if (!this.f15177r && aVar.f15179a != 3 && fragment != null && !m.f15044P) {
                this.f14943t.P0(fragment);
            }
        }
        if (this.f15177r || !z9 || m.f15044P) {
            return;
        }
        m mVar = this.f14943t;
        mVar.Q0(mVar.f15075q, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.fragment.app.Fragment D(java.util.ArrayList r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList r5 = r0.f15162c
            int r5 = r5.size()
            if (r4 >= r5) goto Lba
            java.util.ArrayList r5 = r0.f15162c
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.w$a r5 = (androidx.fragment.app.w.a) r5
            int r6 = r5.f15179a
            r7 = 1
            if (r6 == r7) goto Lb2
            r8 = 2
            r9 = 0
            r10 = 3
            r11 = 9
            if (r6 == r8) goto L58
            if (r6 == r10) goto L41
            r8 = 6
            if (r6 == r8) goto L41
            r8 = 7
            if (r6 == r8) goto Lb2
            r8 = 8
            if (r6 == r8) goto L31
            goto Lb7
        L31:
            java.util.ArrayList r6 = r0.f15162c
            androidx.fragment.app.w$a r8 = new androidx.fragment.app.w$a
            r8.<init>(r11, r3)
            r6.add(r4, r8)
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f15180b
            goto Lb7
        L41:
            androidx.fragment.app.Fragment r6 = r5.f15180b
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f15180b
            if (r5 != r3) goto Lb7
            java.util.ArrayList r3 = r0.f15162c
            androidx.fragment.app.w$a r6 = new androidx.fragment.app.w$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lb7
        L58:
            androidx.fragment.app.Fragment r6 = r5.f15180b
            int r8 = r6.mContainerId
            int r12 = r17.size()
            int r12 = r12 - r7
            r13 = 0
        L62:
            if (r12 < 0) goto La2
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.mContainerId
            if (r15 != r8) goto L9f
            if (r14 != r6) goto L72
            r13 = 1
            goto L9f
        L72:
            if (r14 != r3) goto L81
            java.util.ArrayList r3 = r0.f15162c
            androidx.fragment.app.w$a r15 = new androidx.fragment.app.w$a
            r15.<init>(r11, r14)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L81:
            androidx.fragment.app.w$a r15 = new androidx.fragment.app.w$a
            r15.<init>(r10, r14)
            int r2 = r5.f15181c
            r15.f15181c = r2
            int r2 = r5.f15183e
            r15.f15183e = r2
            int r2 = r5.f15182d
            r15.f15182d = r2
            int r2 = r5.f15184f
            r15.f15184f = r2
            java.util.ArrayList r2 = r0.f15162c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        L9f:
            int r12 = r12 + (-1)
            goto L62
        La2:
            if (r13 == 0) goto Lac
            java.util.ArrayList r2 = r0.f15162c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lb7
        Lac:
            r5.f15179a = r7
            r1.add(r6)
            goto Lb7
        Lb2:
            androidx.fragment.app.Fragment r2 = r5.f15180b
            r1.add(r2)
        Lb7:
            int r4 = r4 + r7
            goto L7
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1141a.D(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public String E() {
        return this.f15170k;
    }

    public boolean F(int i9) {
        int size = this.f15162c.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment fragment = ((w.a) this.f15162c.get(i10)).f15180b;
            int i11 = fragment != null ? fragment.mContainerId : 0;
            if (i11 != 0 && i11 == i9) {
                return true;
            }
        }
        return false;
    }

    public boolean G(ArrayList arrayList, int i9, int i10) {
        if (i10 == i9) {
            return false;
        }
        int size = this.f15162c.size();
        int i11 = -1;
        for (int i12 = 0; i12 < size; i12++) {
            Fragment fragment = ((w.a) this.f15162c.get(i12)).f15180b;
            int i13 = fragment != null ? fragment.mContainerId : 0;
            if (i13 != 0 && i13 != i11) {
                for (int i14 = i9; i14 < i10; i14++) {
                    C1141a c1141a = (C1141a) arrayList.get(i14);
                    int size2 = c1141a.f15162c.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        Fragment fragment2 = ((w.a) c1141a.f15162c.get(i15)).f15180b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i13) {
                            return true;
                        }
                    }
                }
                i11 = i13;
            }
        }
        return false;
    }

    public boolean I() {
        for (int i9 = 0; i9 < this.f15162c.size(); i9++) {
            if (H((w.a) this.f15162c.get(i9))) {
                return true;
            }
        }
        return false;
    }

    public void J() {
        if (this.f15178s != null) {
            for (int i9 = 0; i9 < this.f15178s.size(); i9++) {
                ((Runnable) this.f15178s.get(i9)).run();
            }
            this.f15178s = null;
        }
    }

    public void K(Fragment.l lVar) {
        for (int i9 = 0; i9 < this.f15162c.size(); i9++) {
            w.a aVar = (w.a) this.f15162c.get(i9);
            if (H(aVar)) {
                aVar.f15180b.setOnStartEnterTransitionListener(lVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.fragment.app.Fragment L(java.util.ArrayList r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f15162c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList r2 = r5.f15162c
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.w$a r2 = (androidx.fragment.app.w.a) r2
            int r3 = r2.f15179a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.j$c r3 = r2.f15185g
            r2.f15186h = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f15180b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f15180b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f15180b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1141a.L(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    @Override // androidx.fragment.app.m.n
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (m.F0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f15168i) {
            return true;
        }
        this.f14943t.e(this);
        return true;
    }

    @Override // androidx.fragment.app.w
    public int i() {
        return y(false);
    }

    @Override // androidx.fragment.app.w
    public int j() {
        return y(true);
    }

    @Override // androidx.fragment.app.w
    public void k() {
        n();
        this.f14943t.b0(this, false);
    }

    @Override // androidx.fragment.app.w
    public void l() {
        n();
        this.f14943t.b0(this, true);
    }

    @Override // androidx.fragment.app.w
    public w m(Fragment fragment) {
        m mVar = fragment.mFragmentManager;
        if (mVar == null || mVar == this.f14943t) {
            return super.m(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.w
    public void o(int i9, Fragment fragment, String str, int i10) {
        super.o(i9, fragment, str, i10);
        fragment.mFragmentManager = this.f14943t;
    }

    @Override // androidx.fragment.app.w
    public w p(Fragment fragment) {
        m mVar = fragment.mFragmentManager;
        if (mVar == null || mVar == this.f14943t) {
            return super.p(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f14945v >= 0) {
            sb.append(" #");
            sb.append(this.f14945v);
        }
        if (this.f15170k != null) {
            sb.append(" ");
            sb.append(this.f15170k);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.w
    public w u(Fragment fragment, AbstractC1180j.c cVar) {
        if (fragment.mFragmentManager != this.f14943t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f14943t);
        }
        if (cVar == AbstractC1180j.c.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
        }
        if (cVar != AbstractC1180j.c.DESTROYED) {
            return super.u(fragment, cVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.w
    public w v(Fragment fragment) {
        m mVar;
        if (fragment == null || (mVar = fragment.mFragmentManager) == null || mVar == this.f14943t) {
            return super.v(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void x(int i9) {
        if (this.f15168i) {
            if (m.F0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i9);
            }
            int size = this.f15162c.size();
            for (int i10 = 0; i10 < size; i10++) {
                w.a aVar = (w.a) this.f15162c.get(i10);
                Fragment fragment = aVar.f15180b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i9;
                    if (m.F0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f15180b + " to " + aVar.f15180b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public int y(boolean z9) {
        if (this.f14944u) {
            throw new IllegalStateException("commit already called");
        }
        if (m.F0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new B("FragmentManager"));
            z("  ", printWriter);
            printWriter.close();
        }
        this.f14944u = true;
        this.f14945v = this.f15168i ? this.f14943t.j() : -1;
        this.f14943t.Y(this, z9);
        return this.f14945v;
    }

    public void z(String str, PrintWriter printWriter) {
        A(str, printWriter, true);
    }
}
