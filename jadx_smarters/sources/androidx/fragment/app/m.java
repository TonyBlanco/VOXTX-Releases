package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import androidx.fragment.app.w;
import androidx.fragment.app.x;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.M;
import b.AbstractC1191a;
import com.amazonaws.services.s3.internal.Constants;
import d.AbstractC1617D;
import e0.AbstractC1728b;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import s.C2696b;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static boolean f15043O = false;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static boolean f15044P = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public androidx.activity.result.c f15045A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public androidx.activity.result.c f15046B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f15048D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f15049E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f15050F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f15051G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f15052H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ArrayList f15053I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ArrayList f15054J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ArrayList f15055K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ArrayList f15056L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public androidx.fragment.app.p f15057M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15060b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f15062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f15063e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OnBackPressedDispatcher f15065g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f15070l;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.fragment.app.j f15076r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public androidx.fragment.app.g f15077s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Fragment f15078t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Fragment f15079u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public androidx.activity.result.c f15084z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15059a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f15061c = new v();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.fragment.app.k f15064f = new androidx.fragment.app.k(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.activity.h f15066h = new c(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f15067i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f15068j = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f15069k = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Map f15071m = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x.g f15072n = new d();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.fragment.app.l f15073o = new androidx.fragment.app.l(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f15074p = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15075q = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.fragment.app.i f15080v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public androidx.fragment.app.i f15081w = new e();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public D f15082x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public D f15083y = new f();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayDeque f15047C = new ArrayDeque();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Runnable f15058N = new g();

    public class a implements androidx.activity.result.b {
        public a() {
        }

        @Override // androidx.activity.result.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            C0173m c0173m = (C0173m) m.this.f15047C.pollFirst();
            if (c0173m == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = c0173m.f15099a;
            int i9 = c0173m.f15100c;
            Fragment fragmentI = m.this.f15061c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i9, aVar.c(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public class b implements androidx.activity.result.b {
        public b() {
        }

        @Override // androidx.activity.result.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map) {
            StringBuilder sb;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                iArr[i9] = ((Boolean) arrayList.get(i9)).booleanValue() ? 0 : -1;
            }
            C0173m c0173m = (C0173m) m.this.f15047C.pollFirst();
            if (c0173m == null) {
                sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
            } else {
                String str = c0173m.f15099a;
                int i10 = c0173m.f15100c;
                Fragment fragmentI = m.this.f15061c.i(str);
                if (fragmentI != null) {
                    fragmentI.onRequestPermissionsResult(i10, strArr, iArr);
                    return;
                } else {
                    sb = new StringBuilder();
                    sb.append("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    public class c extends androidx.activity.h {
        public c(boolean z9) {
            super(z9);
        }

        @Override // androidx.activity.h
        public void b() {
            m.this.B0();
        }
    }

    public class d implements x.g {
        public d() {
        }

        @Override // androidx.fragment.app.x.g
        public void a(Fragment fragment, L.e eVar) {
            m.this.f(fragment, eVar);
        }

        @Override // androidx.fragment.app.x.g
        public void b(Fragment fragment, L.e eVar) {
            if (eVar.c()) {
                return;
            }
            m.this.e1(fragment, eVar);
        }
    }

    public class e extends androidx.fragment.app.i {
        public e() {
        }

        @Override // androidx.fragment.app.i
        public Fragment a(ClassLoader classLoader, String str) {
            return m.this.t0().b(m.this.t0().f(), str, null);
        }
    }

    public class f implements D {
        public f() {
        }

        @Override // androidx.fragment.app.D
        public C a(ViewGroup viewGroup) {
            return new C1143c(viewGroup);
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.a0(true);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f15092a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f15093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Fragment f15094d;

        public h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f15092a = viewGroup;
            this.f15093c = view;
            this.f15094d = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f15092a.endViewTransition(this.f15093c);
            animator.removeListener(this);
            Fragment fragment = this.f15094d;
            View view = fragment.mView;
            if (view == null || !fragment.mHidden) {
                return;
            }
            view.setVisibility(8);
        }
    }

    public class i implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f15096a;

        public i(Fragment fragment) {
            this.f15096a = fragment;
        }

        @Override // androidx.fragment.app.q
        public void a(m mVar, Fragment fragment) {
            this.f15096a.onAttachFragment(fragment);
        }
    }

    public class j implements androidx.activity.result.b {
        public j() {
        }

        @Override // androidx.activity.result.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            C0173m c0173m = (C0173m) m.this.f15047C.pollFirst();
            if (c0173m == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = c0173m.f15099a;
            int i9 = c0173m.f15100c;
            Fragment fragmentI = m.this.f15061c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i9, aVar.c(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    public static class k extends AbstractC1191a {
        @Override // b.AbstractC1191a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, androidx.activity.result.e eVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentA = eVar.a();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentA.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    eVar = new e.b(eVar.e()).b(null).c(eVar.d(), eVar.c()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
            if (m.F0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // b.AbstractC1191a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.activity.result.a c(int i9, Intent intent) {
            return new androidx.activity.result.a(i9, intent);
        }
    }

    public static abstract class l {
        public void a(m mVar, Fragment fragment, Bundle bundle) {
        }

        public void b(m mVar, Fragment fragment, Context context) {
        }

        public void c(m mVar, Fragment fragment, Bundle bundle) {
        }

        public void d(m mVar, Fragment fragment) {
        }

        public void e(m mVar, Fragment fragment) {
        }

        public void f(m mVar, Fragment fragment) {
        }

        public void g(m mVar, Fragment fragment, Context context) {
        }

        public void h(m mVar, Fragment fragment, Bundle bundle) {
        }

        public void i(m mVar, Fragment fragment) {
        }

        public void j(m mVar, Fragment fragment, Bundle bundle) {
        }

        public void k(m mVar, Fragment fragment) {
        }

        public void l(m mVar, Fragment fragment) {
        }

        public void m(m mVar, Fragment fragment, View view, Bundle bundle) {
        }

        public void n(m mVar, Fragment fragment) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.m$m, reason: collision with other inner class name */
    public static class C0173m implements Parcelable {
        public static final Parcelable.Creator<C0173m> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f15099a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15100c;

        /* JADX INFO: renamed from: androidx.fragment.app.m$m$a */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0173m createFromParcel(Parcel parcel) {
                return new C0173m(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0173m[] newArray(int i9) {
                return new C0173m[i9];
            }
        }

        public C0173m(Parcel parcel) {
            this.f15099a = parcel.readString();
            this.f15100c = parcel.readInt();
        }

        public C0173m(String str, int i9) {
            this.f15099a = str;
            this.f15100c = i9;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            parcel.writeString(this.f15099a);
            parcel.writeInt(this.f15100c);
        }
    }

    public interface n {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    public class o implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f15102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f15103c;

        public o(String str, int i9, int i10) {
            this.f15101a = str;
            this.f15102b = i9;
            this.f15103c = i10;
        }

        @Override // androidx.fragment.app.m.n
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = m.this.f15079u;
            if (fragment == null || this.f15102b >= 0 || this.f15101a != null || !fragment.getChildFragmentManager().Y0()) {
                return m.this.a1(arrayList, arrayList2, this.f15101a, this.f15102b, this.f15103c);
            }
            return false;
        }
    }

    public static class p implements Fragment.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f15105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C1141a f15106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15107c;

        public p(C1141a c1141a, boolean z9) {
            this.f15105a = z9;
            this.f15106b = c1141a;
        }

        @Override // androidx.fragment.app.Fragment.l
        public void a() {
            this.f15107c++;
        }

        @Override // androidx.fragment.app.Fragment.l
        public void b() {
            int i9 = this.f15107c - 1;
            this.f15107c = i9;
            if (i9 != 0) {
                return;
            }
            this.f15106b.f14943t.n1();
        }

        public void c() {
            C1141a c1141a = this.f15106b;
            c1141a.f14943t.t(c1141a, this.f15105a, false, false);
        }

        public void d() {
            boolean z9 = this.f15107c > 0;
            for (Fragment fragment : this.f15106b.f14943t.s0()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z9 && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            C1141a c1141a = this.f15106b;
            c1141a.f14943t.t(c1141a, this.f15105a, !z9, true);
        }

        public boolean e() {
            return this.f15107c == 0;
        }
    }

    public static boolean F0(int i9) {
        return f15043O || Log.isLoggable("FragmentManager", i9);
    }

    public static void c0(ArrayList arrayList, ArrayList arrayList2, int i9, int i10) {
        while (i9 < i10) {
            C1141a c1141a = (C1141a) arrayList.get(i9);
            if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                c1141a.x(-1);
                c1141a.C(i9 == i10 + (-1));
            } else {
                c1141a.x(1);
                c1141a.B();
            }
            i9++;
        }
    }

    public static int k1(int i9) {
        if (i9 == 4097) {
            return 8194;
        }
        if (i9 != 4099) {
            return i9 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    public static Fragment z0(View view) {
        Object tag = view.getTag(AbstractC1728b.f40133a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public void A(Configuration configuration) {
        for (Fragment fragment : this.f15061c.n()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public M A0(Fragment fragment) {
        return this.f15057M.h(fragment);
    }

    public boolean B(MenuItem menuItem) {
        if (this.f15075q < 1) {
            return false;
        }
        for (Fragment fragment : this.f15061c.n()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void B0() {
        a0(true);
        if (this.f15066h.c()) {
            Y0();
        } else {
            this.f15065g.f();
        }
    }

    public void C() {
        this.f15049E = false;
        this.f15050F = false;
        this.f15057M.k(false);
        S(1);
    }

    public void C0(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        r1(fragment);
    }

    public boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.f15075q < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z9 = false;
        for (Fragment fragment : this.f15061c.n()) {
            if (fragment != null && H0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z9 = true;
            }
        }
        if (this.f15063e != null) {
            for (int i9 = 0; i9 < this.f15063e.size(); i9++) {
                Fragment fragment2 = (Fragment) this.f15063e.get(i9);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f15063e = arrayList;
        return z9;
    }

    public void D0(Fragment fragment) {
        if (fragment.mAdded && G0(fragment)) {
            this.f15048D = true;
        }
    }

    public void E() {
        this.f15051G = true;
        a0(true);
        X();
        S(-1);
        this.f15076r = null;
        this.f15077s = null;
        this.f15078t = null;
        if (this.f15065g != null) {
            this.f15066h.d();
            this.f15065g = null;
        }
        androidx.activity.result.c cVar = this.f15084z;
        if (cVar != null) {
            cVar.c();
            this.f15045A.c();
            this.f15046B.c();
        }
    }

    public boolean E0() {
        return this.f15051G;
    }

    public void F() {
        S(1);
    }

    public void G() {
        for (Fragment fragment : this.f15061c.n()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public final boolean G0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.o();
    }

    public void H(boolean z9) {
        for (Fragment fragment : this.f15061c.n()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z9);
            }
        }
    }

    public boolean H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public void I(Fragment fragment) {
        Iterator it = this.f15074p.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a(this, fragment);
        }
    }

    public boolean I0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        m mVar = fragment.mFragmentManager;
        return fragment.equals(mVar.x0()) && I0(mVar.f15078t);
    }

    public boolean J(MenuItem menuItem) {
        if (this.f15075q < 1) {
            return false;
        }
        for (Fragment fragment : this.f15061c.n()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean J0(int i9) {
        return this.f15075q >= i9;
    }

    public void K(Menu menu) {
        if (this.f15075q < 1) {
            return;
        }
        for (Fragment fragment : this.f15061c.n()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public boolean K0() {
        return this.f15049E || this.f15050F;
    }

    public final void L(Fragment fragment) {
        if (fragment == null || !fragment.equals(f0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public void L0(Fragment fragment, String[] strArr, int i9) {
        if (this.f15046B == null) {
            this.f15076r.k(fragment, strArr, i9);
            return;
        }
        this.f15047C.addLast(new C0173m(fragment.mWho, i9));
        this.f15046B.a(strArr);
    }

    public void M() {
        S(5);
    }

    public void M0(Fragment fragment, Intent intent, int i9, Bundle bundle) {
        if (this.f15084z == null) {
            this.f15076r.n(fragment, intent, i9, bundle);
            return;
        }
        this.f15047C.addLast(new C0173m(fragment.mWho, i9));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f15084z.a(intent);
    }

    public void N(boolean z9) {
        for (Fragment fragment : this.f15061c.n()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z9);
            }
        }
    }

    public void N0(Fragment fragment, IntentSender intentSender, int i9, Intent intent, int i10, int i11, int i12, Bundle bundle) {
        Intent intent2;
        if (this.f15045A == null) {
            this.f15076r.o(fragment, intentSender, i9, intent, i10, i11, i12, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (F0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        androidx.activity.result.e eVarA = new e.b(intentSender).b(intent2).c(i11, i10).a();
        this.f15047C.addLast(new C0173m(fragment.mWho, i9));
        if (F0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.f15045A.a(eVarA);
    }

    public boolean O(Menu menu) {
        boolean z9 = false;
        if (this.f15075q < 1) {
            return false;
        }
        for (Fragment fragment : this.f15061c.n()) {
            if (fragment != null && H0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z9 = true;
            }
        }
        return z9;
    }

    public final void O0(C2696b c2696b) {
        int size = c2696b.size();
        for (int i9 = 0; i9 < size; i9++) {
            Fragment fragment = (Fragment) c2696b.h(i9);
            if (!fragment.mAdded) {
                View viewRequireView = fragment.requireView();
                fragment.mPostponedAlpha = viewRequireView.getAlpha();
                viewRequireView.setAlpha(0.0f);
            }
        }
    }

    public void P() {
        w1();
        L(this.f15079u);
    }

    public void P0(Fragment fragment) {
        if (!this.f15061c.c(fragment.mWho)) {
            if (F0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f15075q + "since it is not added to " + this);
                return;
            }
            return;
        }
        R0(fragment);
        View view = fragment.mView;
        if (view != null && fragment.mIsNewlyAdded && fragment.mContainer != null) {
            float f9 = fragment.mPostponedAlpha;
            if (f9 > 0.0f) {
                view.setAlpha(f9);
            }
            fragment.mPostponedAlpha = 0.0f;
            fragment.mIsNewlyAdded = false;
            f.d dVarC = androidx.fragment.app.f.c(this.f15076r.f(), fragment, true, fragment.getPopDirection());
            if (dVarC != null) {
                Animation animation = dVarC.f15022a;
                if (animation != null) {
                    fragment.mView.startAnimation(animation);
                } else {
                    dVarC.f15023b.setTarget(fragment.mView);
                    dVarC.f15023b.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            u(fragment);
        }
    }

    public void Q() {
        this.f15049E = false;
        this.f15050F = false;
        this.f15057M.k(false);
        S(7);
    }

    public void Q0(int i9, boolean z9) {
        androidx.fragment.app.j jVar;
        if (this.f15076r == null && i9 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z9 || i9 != this.f15075q) {
            this.f15075q = i9;
            if (f15044P) {
                this.f15061c.r();
            } else {
                Iterator it = this.f15061c.n().iterator();
                while (it.hasNext()) {
                    P0((Fragment) it.next());
                }
                for (t tVar : this.f15061c.k()) {
                    Fragment fragmentK = tVar.k();
                    if (!fragmentK.mIsNewlyAdded) {
                        P0(fragmentK);
                    }
                    if (fragmentK.mRemoving && !fragmentK.isInBackStack()) {
                        this.f15061c.q(tVar);
                    }
                }
            }
            t1();
            if (this.f15048D && (jVar = this.f15076r) != null && this.f15075q == 7) {
                jVar.p();
                this.f15048D = false;
            }
        }
    }

    public void R() {
        this.f15049E = false;
        this.f15050F = false;
        this.f15057M.k(false);
        S(5);
    }

    public void R0(Fragment fragment) {
        S0(fragment, this.f15075q);
    }

    public final void S(int i9) {
        try {
            this.f15060b = true;
            this.f15061c.d(i9);
            Q0(i9, false);
            if (f15044P) {
                Iterator it = r().iterator();
                while (it.hasNext()) {
                    ((C) it.next()).j();
                }
            }
            this.f15060b = false;
            a0(true);
        } catch (Throwable th) {
            this.f15060b = false;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.S0(androidx.fragment.app.Fragment, int):void");
    }

    public void T() {
        this.f15050F = true;
        this.f15057M.k(true);
        S(4);
    }

    public void T0() {
        if (this.f15076r == null) {
            return;
        }
        this.f15049E = false;
        this.f15050F = false;
        this.f15057M.k(false);
        for (Fragment fragment : this.f15061c.n()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void U() {
        S(2);
    }

    public void U0(FragmentContainerView fragmentContainerView) {
        View view;
        for (t tVar : this.f15061c.k()) {
            Fragment fragmentK = tVar.k();
            if (fragmentK.mContainerId == fragmentContainerView.getId() && (view = fragmentK.mView) != null && view.getParent() == null) {
                fragmentK.mContainer = fragmentContainerView;
                tVar.b();
            }
        }
    }

    public final void V() {
        if (this.f15052H) {
            this.f15052H = false;
            t1();
        }
    }

    public void V0(t tVar) {
        Fragment fragmentK = tVar.k();
        if (fragmentK.mDeferStart) {
            if (this.f15060b) {
                this.f15052H = true;
                return;
            }
            fragmentK.mDeferStart = false;
            if (f15044P) {
                tVar.m();
            } else {
                R0(fragmentK);
            }
        }
    }

    public void W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f15061c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f15063e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i9 = 0; i9 < size2; i9++) {
                Fragment fragment = (Fragment) this.f15063e.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList arrayList2 = this.f15062d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i10 = 0; i10 < size; i10++) {
                C1141a c1141a = (C1141a) this.f15062d.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(c1141a.toString());
                c1141a.z(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f15067i.get());
        synchronized (this.f15059a) {
            try {
                int size3 = this.f15059a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i11 = 0; i11 < size3; i11++) {
                        n nVar = (n) this.f15059a.get(i11);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i11);
                        printWriter.print(": ");
                        printWriter.println(nVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f15076r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f15077s);
        if (this.f15078t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f15078t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f15075q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f15049E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f15050F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f15051G);
        if (this.f15048D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f15048D);
        }
    }

    public void W0(int i9, int i10) {
        if (i9 >= 0) {
            Y(new o(null, i9, i10), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i9);
    }

    public final void X() {
        if (f15044P) {
            Iterator it = r().iterator();
            while (it.hasNext()) {
                ((C) it.next()).j();
            }
        } else {
            if (this.f15071m.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.f15071m.keySet()) {
                n(fragment);
                R0(fragment);
            }
        }
    }

    public void X0(String str, int i9) {
        Y(new o(str, -1, i9), false);
    }

    public void Y(n nVar, boolean z9) {
        if (!z9) {
            if (this.f15076r == null) {
                if (!this.f15051G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            p();
        }
        synchronized (this.f15059a) {
            try {
                if (this.f15076r == null) {
                    if (!z9) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f15059a.add(nVar);
                    n1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean Y0() {
        return Z0(null, -1, 0);
    }

    public final void Z(boolean z9) {
        if (this.f15060b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f15076r == null) {
            if (!this.f15051G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f15076r.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z9) {
            p();
        }
        if (this.f15053I == null) {
            this.f15053I = new ArrayList();
            this.f15054J = new ArrayList();
        }
        this.f15060b = true;
        try {
            e0(null, null);
        } finally {
            this.f15060b = false;
        }
    }

    public final boolean Z0(String str, int i9, int i10) {
        a0(false);
        Z(true);
        Fragment fragment = this.f15079u;
        if (fragment != null && i9 < 0 && str == null && fragment.getChildFragmentManager().Y0()) {
            return true;
        }
        boolean zA1 = a1(this.f15053I, this.f15054J, str, i9, i10);
        if (zA1) {
            this.f15060b = true;
            try {
                g1(this.f15053I, this.f15054J);
            } finally {
                q();
            }
        }
        w1();
        V();
        this.f15061c.b();
        return zA1;
    }

    public boolean a0(boolean z9) {
        Z(z9);
        boolean z10 = false;
        while (k0(this.f15053I, this.f15054J)) {
            z10 = true;
            this.f15060b = true;
            try {
                g1(this.f15053I, this.f15054J);
            } finally {
                q();
            }
        }
        w1();
        V();
        this.f15061c.b();
        return z10;
    }

    public boolean a1(ArrayList arrayList, ArrayList arrayList2, String str, int i9, int i10) {
        int i11;
        ArrayList arrayList3 = this.f15062d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i9 < 0 && (i10 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f15062d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i9 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C1141a c1141a = (C1141a) this.f15062d.get(size2);
                    if ((str != null && str.equals(c1141a.E())) || (i9 >= 0 && i9 == c1141a.f14945v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i10 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C1141a c1141a2 = (C1141a) this.f15062d.get(size2);
                        if (str == null || !str.equals(c1141a2.E())) {
                            if (i9 < 0 || i9 != c1141a2.f14945v) {
                                break;
                            }
                        }
                    }
                }
                i11 = size2;
            } else {
                i11 = -1;
            }
            if (i11 == this.f15062d.size() - 1) {
                return false;
            }
            for (int size3 = this.f15062d.size() - 1; size3 > i11; size3--) {
                arrayList.add(this.f15062d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void b0(n nVar, boolean z9) {
        if (z9 && (this.f15076r == null || this.f15051G)) {
            return;
        }
        Z(z9);
        if (nVar.a(this.f15053I, this.f15054J)) {
            this.f15060b = true;
            try {
                g1(this.f15053I, this.f15054J);
            } finally {
                q();
            }
        }
        w1();
        V();
        this.f15061c.b();
    }

    public final int b1(ArrayList arrayList, ArrayList arrayList2, int i9, int i10, C2696b c2696b) {
        int i11 = i10;
        for (int i12 = i10 - 1; i12 >= i9; i12--) {
            C1141a c1141a = (C1141a) arrayList.get(i12);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i12)).booleanValue();
            if (c1141a.I() && !c1141a.G(arrayList, i12 + 1, i10)) {
                if (this.f15056L == null) {
                    this.f15056L = new ArrayList();
                }
                p pVar = new p(c1141a, zBooleanValue);
                this.f15056L.add(pVar);
                c1141a.K(pVar);
                if (zBooleanValue) {
                    c1141a.B();
                } else {
                    c1141a.C(false);
                }
                i11--;
                if (i12 != i11) {
                    arrayList.remove(i12);
                    arrayList.add(i11, c1141a);
                }
                d(c2696b);
            }
        }
        return i11;
    }

    public void c1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            u1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    public final void d(C2696b c2696b) {
        int i9 = this.f15075q;
        if (i9 < 1) {
            return;
        }
        int iMin = Math.min(i9, 5);
        for (Fragment fragment : this.f15061c.n()) {
            if (fragment.mState < iMin) {
                S0(fragment, iMin);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    c2696b.add(fragment);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    public final void d0(ArrayList arrayList, ArrayList arrayList2, int i9, int i10) {
        ?? r12;
        boolean z9;
        int i11;
        int i12;
        ArrayList arrayList3;
        int i13;
        int iB1;
        ArrayList arrayList4;
        int i14;
        boolean z10;
        boolean z11 = ((C1141a) arrayList.get(i9)).f15177r;
        ArrayList arrayList5 = this.f15055K;
        if (arrayList5 == null) {
            this.f15055K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        this.f15055K.addAll(this.f15061c.n());
        Fragment fragmentX0 = x0();
        boolean z12 = false;
        for (int i15 = i9; i15 < i10; i15++) {
            C1141a c1141a = (C1141a) arrayList.get(i15);
            fragmentX0 = !((Boolean) arrayList2.get(i15)).booleanValue() ? c1141a.D(this.f15055K, fragmentX0) : c1141a.L(this.f15055K, fragmentX0);
            z12 = z12 || c1141a.f15168i;
        }
        this.f15055K.clear();
        if (z11 || this.f15075q < 1) {
            r12 = 1;
        } else if (f15044P) {
            for (int i16 = i9; i16 < i10; i16++) {
                Iterator it = ((C1141a) arrayList.get(i16)).f15162c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((w.a) it.next()).f15180b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f15061c.p(v(fragment));
                    }
                }
            }
            r12 = 1;
        } else {
            r12 = 1;
            x.B(this.f15076r.f(), this.f15077s, arrayList, arrayList2, i9, i10, false, this.f15072n);
        }
        c0(arrayList, arrayList2, i9, i10);
        if (f15044P) {
            boolean zBooleanValue = ((Boolean) arrayList2.get(i10 - 1)).booleanValue();
            for (int i17 = i9; i17 < i10; i17++) {
                C1141a c1141a2 = (C1141a) arrayList.get(i17);
                if (zBooleanValue) {
                    for (int size = c1141a2.f15162c.size() - r12; size >= 0; size--) {
                        Fragment fragment2 = ((w.a) c1141a2.f15162c.get(size)).f15180b;
                        if (fragment2 != null) {
                            v(fragment2).m();
                        }
                    }
                } else {
                    Iterator it2 = c1141a2.f15162c.iterator();
                    while (it2.hasNext()) {
                        Fragment fragment3 = ((w.a) it2.next()).f15180b;
                        if (fragment3 != null) {
                            v(fragment3).m();
                        }
                    }
                }
            }
            Q0(this.f15075q, r12);
            for (C c9 : s(arrayList, i9, i10)) {
                c9.r(zBooleanValue);
                c9.p();
                c9.g();
            }
            i14 = i10;
            arrayList4 = arrayList2;
        } else {
            if (z11) {
                C2696b c2696b = new C2696b();
                d(c2696b);
                i13 = 1;
                z9 = z11;
                i11 = i10;
                i12 = i9;
                arrayList3 = arrayList2;
                iB1 = b1(arrayList, arrayList2, i9, i10, c2696b);
                O0(c2696b);
            } else {
                z9 = z11;
                i11 = i10;
                i12 = i9;
                arrayList3 = arrayList2;
                i13 = 1;
                iB1 = i11;
            }
            if (iB1 == i12 || !z9) {
                arrayList4 = arrayList3;
                i14 = i11;
            } else {
                if (this.f15075q >= i13) {
                    arrayList4 = arrayList3;
                    int i18 = iB1;
                    i14 = i11;
                    z10 = true;
                    x.B(this.f15076r.f(), this.f15077s, arrayList, arrayList2, i9, i18, true, this.f15072n);
                } else {
                    arrayList4 = arrayList3;
                    i14 = i11;
                    z10 = true;
                }
                Q0(this.f15075q, z10);
            }
        }
        for (int i19 = i9; i19 < i14; i19++) {
            C1141a c1141a3 = (C1141a) arrayList.get(i19);
            if (((Boolean) arrayList4.get(i19)).booleanValue() && c1141a3.f14945v >= 0) {
                c1141a3.f14945v = -1;
            }
            c1141a3.J();
        }
        if (z12) {
            i1();
        }
    }

    public void d1(l lVar, boolean z9) {
        this.f15073o.o(lVar, z9);
    }

    public void e(C1141a c1141a) {
        if (this.f15062d == null) {
            this.f15062d = new ArrayList();
        }
        this.f15062d.add(c1141a);
    }

    public final void e0(ArrayList arrayList, ArrayList arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList arrayList3 = this.f15056L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i9 = 0;
        while (i9 < size) {
            p pVar = (p) this.f15056L.get(i9);
            if (arrayList == null || pVar.f15105a || (iIndexOf2 = arrayList.indexOf(pVar.f15106b)) == -1 || arrayList2 == null || !((Boolean) arrayList2.get(iIndexOf2)).booleanValue()) {
                if (pVar.e() || (arrayList != null && pVar.f15106b.G(arrayList, 0, arrayList.size()))) {
                    this.f15056L.remove(i9);
                    i9--;
                    size--;
                    if (arrayList == null || pVar.f15105a || (iIndexOf = arrayList.indexOf(pVar.f15106b)) == -1 || arrayList2 == null || !((Boolean) arrayList2.get(iIndexOf)).booleanValue()) {
                        pVar.d();
                    }
                }
                i9++;
            } else {
                this.f15056L.remove(i9);
                i9--;
                size--;
            }
            pVar.c();
            i9++;
        }
    }

    public void e1(Fragment fragment, L.e eVar) {
        HashSet hashSet = (HashSet) this.f15071m.get(fragment);
        if (hashSet != null && hashSet.remove(eVar) && hashSet.isEmpty()) {
            this.f15071m.remove(fragment);
            if (fragment.mState < 5) {
                w(fragment);
                R0(fragment);
            }
        }
    }

    public void f(Fragment fragment, L.e eVar) {
        if (this.f15071m.get(fragment) == null) {
            this.f15071m.put(fragment, new HashSet());
        }
        ((HashSet) this.f15071m.get(fragment)).add(eVar);
    }

    public Fragment f0(String str) {
        return this.f15061c.f(str);
    }

    public void f1(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z9 = !fragment.isInBackStack();
        if (!fragment.mDetached || z9) {
            this.f15061c.s(fragment);
            if (G0(fragment)) {
                this.f15048D = true;
            }
            fragment.mRemoving = true;
            r1(fragment);
        }
    }

    public t g(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        t tVarV = v(fragment);
        fragment.mFragmentManager = this;
        this.f15061c.p(tVarV);
        if (!fragment.mDetached) {
            this.f15061c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (G0(fragment)) {
                this.f15048D = true;
            }
        }
        return tVarV;
    }

    public Fragment g0(int i9) {
        return this.f15061c.g(i9);
    }

    public final void g1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        e0(arrayList, arrayList2);
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            if (!((C1141a) arrayList.get(i9)).f15177r) {
                if (i10 != i9) {
                    d0(arrayList, arrayList2, i10, i9);
                }
                i10 = i9 + 1;
                if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                    while (i10 < size && ((Boolean) arrayList2.get(i10)).booleanValue() && !((C1141a) arrayList.get(i10)).f15177r) {
                        i10++;
                    }
                }
                d0(arrayList, arrayList2, i9, i10);
                i9 = i10 - 1;
            }
            i9++;
        }
        if (i10 != size) {
            d0(arrayList, arrayList2, i10, size);
        }
    }

    public void h(q qVar) {
        this.f15074p.add(qVar);
    }

    public Fragment h0(String str) {
        return this.f15061c.h(str);
    }

    public void h1(Fragment fragment) {
        this.f15057M.j(fragment);
    }

    public void i(Fragment fragment) {
        this.f15057M.b(fragment);
    }

    public Fragment i0(String str) {
        return this.f15061c.i(str);
    }

    public final void i1() {
        ArrayList arrayList = this.f15070l;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        AbstractC1617D.a(this.f15070l.get(0));
        throw null;
    }

    public int j() {
        return this.f15067i.getAndIncrement();
    }

    public final void j0() {
        if (f15044P) {
            Iterator it = r().iterator();
            while (it.hasNext()) {
                ((C) it.next()).k();
            }
        } else if (this.f15056L != null) {
            while (!this.f15056L.isEmpty()) {
                ((p) this.f15056L.remove(0)).d();
            }
        }
    }

    public void j1(Parcelable parcelable) {
        t tVar;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.o oVar = (androidx.fragment.app.o) parcelable;
        if (oVar.f15108a == null) {
            return;
        }
        this.f15061c.t();
        for (s sVar : oVar.f15108a) {
            if (sVar != null) {
                Fragment fragmentD = this.f15057M.d(sVar.f15130c);
                if (fragmentD != null) {
                    if (F0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentD);
                    }
                    tVar = new t(this.f15073o, this.f15061c, fragmentD, sVar);
                } else {
                    tVar = new t(this.f15073o, this.f15061c, this.f15076r.f().getClassLoader(), q0(), sVar);
                }
                Fragment fragmentK = tVar.k();
                fragmentK.mFragmentManager = this;
                if (F0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentK.mWho + "): " + fragmentK);
                }
                tVar.o(this.f15076r.f().getClassLoader());
                this.f15061c.p(tVar);
                tVar.u(this.f15075q);
            }
        }
        for (Fragment fragment : this.f15057M.g()) {
            if (!this.f15061c.c(fragment.mWho)) {
                if (F0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + oVar.f15108a);
                }
                this.f15057M.j(fragment);
                fragment.mFragmentManager = this;
                t tVar2 = new t(this.f15073o, this.f15061c, fragment);
                tVar2.u(1);
                tVar2.m();
                fragment.mRemoving = true;
                tVar2.m();
            }
        }
        this.f15061c.u(oVar.f15109c);
        if (oVar.f15110d != null) {
            this.f15062d = new ArrayList(oVar.f15110d.length);
            int i9 = 0;
            while (true) {
                C1142b[] c1142bArr = oVar.f15110d;
                if (i9 >= c1142bArr.length) {
                    break;
                }
                C1141a c1141aA = c1142bArr[i9].a(this);
                if (F0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i9 + " (index " + c1141aA.f14945v + "): " + c1141aA);
                    PrintWriter printWriter = new PrintWriter(new B("FragmentManager"));
                    c1141aA.A("  ", printWriter, false);
                    printWriter.close();
                }
                this.f15062d.add(c1141aA);
                i9++;
            }
        } else {
            this.f15062d = null;
        }
        this.f15067i.set(oVar.f15111e);
        String str = oVar.f15112f;
        if (str != null) {
            Fragment fragmentF0 = f0(str);
            this.f15079u = fragmentF0;
            L(fragmentF0);
        }
        ArrayList arrayList = oVar.f15113g;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Bundle bundle = (Bundle) oVar.f15114h.get(i10);
                bundle.setClassLoader(this.f15076r.f().getClassLoader());
                this.f15068j.put(arrayList.get(i10), bundle);
            }
        }
        this.f15047C = new ArrayDeque(oVar.f15115i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(androidx.fragment.app.j r3, androidx.fragment.app.g r4, androidx.fragment.app.Fragment r5) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.k(androidx.fragment.app.j, androidx.fragment.app.g, androidx.fragment.app.Fragment):void");
    }

    public final boolean k0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f15059a) {
            try {
                if (this.f15059a.isEmpty()) {
                    return false;
                }
                int size = this.f15059a.size();
                boolean zA = false;
                for (int i9 = 0; i9 < size; i9++) {
                    zA |= ((n) this.f15059a.get(i9)).a(arrayList, arrayList2);
                }
                this.f15059a.clear();
                this.f15076r.g().removeCallbacks(this.f15058N);
                return zA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f15061c.a(fragment);
            if (F0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (G0(fragment)) {
                this.f15048D = true;
            }
        }
    }

    public int l0() {
        ArrayList arrayList = this.f15062d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public Parcelable l1() {
        int size;
        j0();
        X();
        a0(true);
        this.f15049E = true;
        this.f15057M.k(true);
        ArrayList arrayListV = this.f15061c.v();
        C1142b[] c1142bArr = null;
        if (arrayListV.isEmpty()) {
            if (F0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList arrayListW = this.f15061c.w();
        ArrayList arrayList = this.f15062d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            c1142bArr = new C1142b[size];
            for (int i9 = 0; i9 < size; i9++) {
                c1142bArr[i9] = new C1142b((C1141a) this.f15062d.get(i9));
                if (F0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i9 + ": " + this.f15062d.get(i9));
                }
            }
        }
        androidx.fragment.app.o oVar = new androidx.fragment.app.o();
        oVar.f15108a = arrayListV;
        oVar.f15109c = arrayListW;
        oVar.f15110d = c1142bArr;
        oVar.f15111e = this.f15067i.get();
        Fragment fragment = this.f15079u;
        if (fragment != null) {
            oVar.f15112f = fragment.mWho;
        }
        oVar.f15113g.addAll(this.f15068j.keySet());
        oVar.f15114h.addAll(this.f15068j.values());
        oVar.f15115i = new ArrayList(this.f15047C);
        return oVar;
    }

    public w m() {
        return new C1141a(this);
    }

    public final androidx.fragment.app.p m0(Fragment fragment) {
        return this.f15057M.e(fragment);
    }

    public Fragment.m m1(Fragment fragment) {
        t tVarM = this.f15061c.m(fragment.mWho);
        if (tVarM == null || !tVarM.k().equals(fragment)) {
            u1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return tVarM.r();
    }

    public final void n(Fragment fragment) {
        HashSet hashSet = (HashSet) this.f15071m.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((L.e) it.next()).a();
            }
            hashSet.clear();
            w(fragment);
            this.f15071m.remove(fragment);
        }
    }

    public androidx.fragment.app.g n0() {
        return this.f15077s;
    }

    public void n1() {
        synchronized (this.f15059a) {
            try {
                ArrayList arrayList = this.f15056L;
                boolean z9 = (arrayList == null || arrayList.isEmpty()) ? false : true;
                boolean z10 = this.f15059a.size() == 1;
                if (z9 || z10) {
                    this.f15076r.g().removeCallbacks(this.f15058N);
                    this.f15076r.g().post(this.f15058N);
                    w1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean o() {
        boolean zG0 = false;
        for (Fragment fragment : this.f15061c.l()) {
            if (fragment != null) {
                zG0 = G0(fragment);
            }
            if (zG0) {
                return true;
            }
        }
        return false;
    }

    public Fragment o0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentF0 = f0(string);
        if (fragmentF0 == null) {
            u1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentF0;
    }

    public void o1(Fragment fragment, boolean z9) {
        ViewGroup viewGroupP0 = p0(fragment);
        if (viewGroupP0 == null || !(viewGroupP0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupP0).setDrawDisappearingViewsLast(!z9);
    }

    public final void p() {
        if (K0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final ViewGroup p0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f15077s.d()) {
            View viewC = this.f15077s.c(fragment.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    public void p1(Fragment fragment, AbstractC1180j.c cVar) {
        if (fragment.equals(f0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void q() {
        this.f15060b = false;
        this.f15054J.clear();
        this.f15053I.clear();
    }

    public androidx.fragment.app.i q0() {
        androidx.fragment.app.i iVar = this.f15080v;
        if (iVar != null) {
            return iVar;
        }
        Fragment fragment = this.f15078t;
        return fragment != null ? fragment.mFragmentManager.q0() : this.f15081w;
    }

    public void q1(Fragment fragment) {
        if (fragment == null || (fragment.equals(f0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f15079u;
            this.f15079u = fragment;
            L(fragment2);
            L(this.f15079u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final Set r() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f15061c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((t) it.next()).k().mContainer;
            if (viewGroup != null) {
                hashSet.add(C.o(viewGroup, y0()));
            }
        }
        return hashSet;
    }

    public v r0() {
        return this.f15061c;
    }

    public final void r1(Fragment fragment) {
        ViewGroup viewGroupP0 = p0(fragment);
        if (viewGroupP0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupP0.getTag(AbstractC1728b.f40135c) == null) {
            viewGroupP0.setTag(AbstractC1728b.f40135c, fragment);
        }
        ((Fragment) viewGroupP0.getTag(AbstractC1728b.f40135c)).setPopDirection(fragment.getPopDirection());
    }

    public final Set s(ArrayList arrayList, int i9, int i10) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i9 < i10) {
            Iterator it = ((C1141a) arrayList.get(i9)).f15162c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((w.a) it.next()).f15180b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(C.n(viewGroup, this));
                }
            }
            i9++;
        }
        return hashSet;
    }

    public List s0() {
        return this.f15061c.n();
    }

    public void s1(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public void t(C1141a c1141a, boolean z9, boolean z10, boolean z11) {
        if (z9) {
            c1141a.C(z11);
        } else {
            c1141a.B();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c1141a);
        arrayList2.add(Boolean.valueOf(z9));
        if (z10 && this.f15075q >= 1) {
            x.B(this.f15076r.f(), this.f15077s, arrayList, arrayList2, 0, 1, true, this.f15072n);
        }
        if (z11) {
            Q0(this.f15075q, true);
        }
        for (Fragment fragment : this.f15061c.l()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && c1141a.F(fragment.mContainerId)) {
                float f9 = fragment.mPostponedAlpha;
                if (f9 > 0.0f) {
                    fragment.mView.setAlpha(f9);
                }
                if (z11) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    public androidx.fragment.app.j t0() {
        return this.f15076r;
    }

    public final void t1() {
        Iterator it = this.f15061c.k().iterator();
        while (it.hasNext()) {
            V0((t) it.next());
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f15078t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.f15078t;
        } else {
            androidx.fragment.app.j jVar = this.f15076r;
            if (jVar == null) {
                sb.append(Constants.NULL_VERSION_ID);
                sb.append("}}");
                return sb.toString();
            }
            sb.append(jVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.f15076r;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public final void u(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            f.d dVarC = androidx.fragment.app.f.c(this.f15076r.f(), fragment, !fragment.mHidden, fragment.getPopDirection());
            if (dVarC == null || (animator = dVarC.f15023b) == null) {
                if (dVarC != null) {
                    fragment.mView.startAnimation(dVarC.f15022a);
                    dVarC.f15022a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = fragment.mContainer;
                    View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    dVarC.f15023b.addListener(new h(viewGroup, view, fragment));
                }
                dVarC.f15023b.start();
            }
        }
        D0(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    public LayoutInflater.Factory2 u0() {
        return this.f15064f;
    }

    public final void u1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new B("FragmentManager"));
        androidx.fragment.app.j jVar = this.f15076r;
        try {
            if (jVar != null) {
                jVar.h("  ", null, printWriter, new String[0]);
            } else {
                W("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e9) {
            Log.e("FragmentManager", "Failed dumping state", e9);
            throw runtimeException;
        }
    }

    public t v(Fragment fragment) {
        t tVarM = this.f15061c.m(fragment.mWho);
        if (tVarM != null) {
            return tVarM;
        }
        t tVar = new t(this.f15073o, this.f15061c, fragment);
        tVar.o(this.f15076r.f().getClassLoader());
        tVar.u(this.f15075q);
        return tVar;
    }

    public androidx.fragment.app.l v0() {
        return this.f15073o;
    }

    public void v1(l lVar) {
        this.f15073o.p(lVar);
    }

    public final void w(Fragment fragment) {
        fragment.performDestroyView();
        this.f15073o.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.o(null);
        fragment.mInLayout = false;
    }

    public Fragment w0() {
        return this.f15078t;
    }

    public final void w1() {
        synchronized (this.f15059a) {
            try {
                if (this.f15059a.isEmpty()) {
                    this.f15066h.f(l0() > 0 && I0(this.f15078t));
                } else {
                    this.f15066h.f(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (F0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f15061c.s(fragment);
            if (G0(fragment)) {
                this.f15048D = true;
            }
            r1(fragment);
        }
    }

    public Fragment x0() {
        return this.f15079u;
    }

    public void y() {
        this.f15049E = false;
        this.f15050F = false;
        this.f15057M.k(false);
        S(4);
    }

    public D y0() {
        D d9 = this.f15082x;
        if (d9 != null) {
            return d9;
        }
        Fragment fragment = this.f15078t;
        return fragment != null ? fragment.mFragmentManager.y0() : this.f15083y;
    }

    public void z() {
        this.f15049E = false;
        this.f15050F = false;
        this.f15057M.k(false);
        S(0);
    }
}
