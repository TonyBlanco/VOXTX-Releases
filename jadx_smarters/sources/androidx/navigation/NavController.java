package androidx.navigation;

import D.P;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.InterfaceC1184n;
import androidx.lifecycle.InterfaceC1185o;
import androidx.lifecycle.InterfaceC1186p;
import androidx.lifecycle.M;
import androidx.navigation.k;
import androidx.navigation.p;
import androidx.navigation.s;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class NavController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f16288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f16289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f16290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f16291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Parcelable[] f16292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16293g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC1186p f16295i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f16296j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Deque f16294h = new ArrayDeque();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t f16297k = new t();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f16298l = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC1185o f16299m = new InterfaceC1184n() { // from class: androidx.navigation.NavController.1
        @Override // androidx.lifecycle.InterfaceC1184n
        public void b(InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar) {
            NavController navController = NavController.this;
            if (navController.f16290d != null) {
                Iterator it = navController.f16294h.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).e(bVar);
                }
            }
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.activity.h f16300n = new a(false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16301o = true;

    public class a extends androidx.activity.h {
        public a(boolean z9) {
            super(z9);
        }

        @Override // androidx.activity.h
        public void b() {
            NavController.this.u();
        }
    }

    public interface b {
        void a(NavController navController, k kVar, Bundle bundle);
    }

    public NavController(Context context) {
        this.f16287a = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            if (context instanceof Activity) {
                this.f16288b = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        t tVar = this.f16297k;
        tVar.a(new m(tVar));
        this.f16297k.a(new androidx.navigation.a(this.f16287a));
    }

    public void A(int i9) {
        B(i9, null);
    }

    public void B(int i9, Bundle bundle) {
        C(k().c(i9), bundle);
    }

    public void C(l lVar, Bundle bundle) {
        l lVar2 = this.f16290d;
        if (lVar2 != null) {
            w(lVar2.i(), true);
        }
        this.f16290d = lVar;
        t(bundle);
    }

    public void D(InterfaceC1186p interfaceC1186p) {
        if (interfaceC1186p == this.f16295i) {
            return;
        }
        this.f16295i = interfaceC1186p;
        interfaceC1186p.getLifecycle().a(this.f16299m);
    }

    public void E(OnBackPressedDispatcher onBackPressedDispatcher) {
        if (this.f16295i == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
        }
        this.f16300n.d();
        onBackPressedDispatcher.b(this.f16295i, this.f16300n);
    }

    public void F(M m9) {
        if (this.f16296j == g.c(m9)) {
            return;
        }
        if (!this.f16294h.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.f16296j = g.c(m9);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G() {
        /*
            r3 = this;
            androidx.activity.h r0 = r3.f16300n
            boolean r1 = r3.f16301o
            if (r1 == 0) goto Le
            int r1 = r3.i()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.f(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.G():void");
    }

    public void a(b bVar) {
        if (!this.f16294h.isEmpty()) {
            e eVar = (e) this.f16294h.peekLast();
            bVar.a(this, eVar.b(), eVar.a());
        }
        this.f16298l.add(bVar);
    }

    public final boolean b() {
        k kVarN;
        while (!this.f16294h.isEmpty() && (((e) this.f16294h.peekLast()).b() instanceof l) && w(((e) this.f16294h.peekLast()).b().i(), true)) {
        }
        if (this.f16294h.isEmpty()) {
            return false;
        }
        k kVarB = ((e) this.f16294h.peekLast()).b();
        if (kVarB instanceof androidx.navigation.b) {
            Iterator itDescendingIterator = this.f16294h.descendingIterator();
            while (itDescendingIterator.hasNext()) {
                kVarN = ((e) itDescendingIterator.next()).b();
                if (!(kVarN instanceof l) && !(kVarN instanceof androidx.navigation.b)) {
                    break;
                }
            }
            kVarN = null;
        } else {
            kVarN = null;
        }
        HashMap map = new HashMap();
        Iterator itDescendingIterator2 = this.f16294h.descendingIterator();
        while (itDescendingIterator2.hasNext()) {
            e eVar = (e) itDescendingIterator2.next();
            AbstractC1180j.c cVarC = eVar.c();
            k kVarB2 = eVar.b();
            if (kVarB != null && kVarB2.i() == kVarB.i()) {
                AbstractC1180j.c cVar = AbstractC1180j.c.RESUMED;
                if (cVarC != cVar) {
                    map.put(eVar, cVar);
                }
                kVarB = kVarB.n();
            } else if (kVarN == null || kVarB2.i() != kVarN.i()) {
                eVar.h(AbstractC1180j.c.CREATED);
            } else {
                if (cVarC == AbstractC1180j.c.RESUMED) {
                    eVar.h(AbstractC1180j.c.STARTED);
                } else {
                    AbstractC1180j.c cVar2 = AbstractC1180j.c.STARTED;
                    if (cVarC != cVar2) {
                        map.put(eVar, cVar2);
                    }
                }
                kVarN = kVarN.n();
            }
        }
        for (e eVar2 : this.f16294h) {
            AbstractC1180j.c cVar3 = (AbstractC1180j.c) map.get(eVar2);
            if (cVar3 != null) {
                eVar2.h(cVar3);
            } else {
                eVar2.i();
            }
        }
        e eVar3 = (e) this.f16294h.peekLast();
        Iterator it = this.f16298l.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, eVar3.b(), eVar3.a());
        }
        return true;
    }

    public void c(boolean z9) {
        this.f16301o = z9;
        G();
    }

    public k d(int i9) {
        l lVar = this.f16290d;
        if (lVar == null) {
            return null;
        }
        if (lVar.i() == i9) {
            return this.f16290d;
        }
        l lVarB = this.f16294h.isEmpty() ? this.f16290d : ((e) this.f16294h.getLast()).b();
        return (lVarB instanceof l ? lVarB : lVarB.n()).A(i9);
    }

    public final String e(int[] iArr) {
        l lVar;
        l lVar2 = this.f16290d;
        int i9 = 0;
        while (true) {
            k kVarA = null;
            if (i9 >= iArr.length) {
                return null;
            }
            int i10 = iArr[i9];
            if (i9 != 0) {
                kVarA = lVar2.A(i10);
            } else if (this.f16290d.i() == i10) {
                kVarA = this.f16290d;
            }
            if (kVarA == null) {
                return k.h(this.f16287a, i10);
            }
            if (i9 != iArr.length - 1) {
                while (true) {
                    lVar = (l) kVarA;
                    if (!(lVar.A(lVar.E()) instanceof l)) {
                        break;
                    }
                    kVarA = lVar.A(lVar.E());
                }
                lVar2 = lVar;
            }
            i9++;
        }
    }

    public Context f() {
        return this.f16287a;
    }

    public e g() {
        if (this.f16294h.isEmpty()) {
            return null;
        }
        return (e) this.f16294h.getLast();
    }

    public k h() {
        e eVarG = g();
        if (eVarG != null) {
            return eVarG.b();
        }
        return null;
    }

    public final int i() {
        Iterator it = this.f16294h.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            if (!(((e) it.next()).b() instanceof l)) {
                i9++;
            }
        }
        return i9;
    }

    public l j() {
        l lVar = this.f16290d;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public o k() {
        if (this.f16289c == null) {
            this.f16289c = new o(this.f16287a, this.f16297k);
        }
        return this.f16289c;
    }

    public t l() {
        return this.f16297k;
    }

    public boolean m(Intent intent) {
        k.a aVarO;
        l lVar;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        Bundle bundle = new Bundle();
        Bundle bundle2 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if ((intArray == null || intArray.length == 0) && intent.getData() != null && (aVarO = this.f16290d.o(new j(intent))) != null) {
            k kVarB = aVarO.b();
            int[] iArrD = kVarB.d();
            bundle.putAll(kVarB.c(aVarO.h()));
            intArray = iArrD;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String strE = e(intArray);
        if (strE != null) {
            Log.i("NavController", "Could not find destination " + strE + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int flags = intent.getFlags();
        int i9 = 268435456 & flags;
        if (i9 != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            P.e(this.f16287a).b(intent).n();
            Activity activity = this.f16288b;
            if (activity != null) {
                activity.finish();
                this.f16288b.overridePendingTransition(0, 0);
            }
            return true;
        }
        if (i9 != 0) {
            if (!this.f16294h.isEmpty()) {
                w(this.f16290d.i(), true);
            }
            int i10 = 0;
            while (i10 < intArray.length) {
                int i11 = i10 + 1;
                int i12 = intArray[i10];
                k kVarD = d(i12);
                if (kVarD == null) {
                    throw new IllegalStateException("Deep Linking failed: destination " + k.h(this.f16287a, i12) + " cannot be found from the current destination " + h());
                }
                r(kVarD, bundle, new p.a().b(0).c(0).a(), null);
                i10 = i11;
            }
            return true;
        }
        l lVar2 = this.f16290d;
        int i13 = 0;
        while (i13 < intArray.length) {
            int i14 = intArray[i13];
            k kVarA = i13 == 0 ? this.f16290d : lVar2.A(i14);
            if (kVarA == null) {
                throw new IllegalStateException("Deep Linking failed: destination " + k.h(this.f16287a, i14) + " cannot be found in graph " + lVar2);
            }
            if (i13 != intArray.length - 1) {
                while (true) {
                    lVar = (l) kVarA;
                    if (!(lVar.A(lVar.E()) instanceof l)) {
                        break;
                    }
                    kVarA = lVar.A(lVar.E());
                }
                lVar2 = lVar;
            } else {
                r(kVarA, kVarA.c(bundle), new p.a().g(this.f16290d.i(), true).b(0).c(0).a(), null);
            }
            i13++;
        }
        this.f16293g = true;
        return true;
    }

    public void n(int i9) {
        o(i9, null);
    }

    public void o(int i9, Bundle bundle) {
        p(i9, bundle, null);
    }

    public void p(int i9, Bundle bundle, p pVar) {
        q(i9, bundle, pVar, null);
    }

    public void q(int i9, Bundle bundle, p pVar, s.a aVar) {
        int iB;
        k kVarB = this.f16294h.isEmpty() ? this.f16290d : ((e) this.f16294h.getLast()).b();
        if (kVarB == null) {
            throw new IllegalStateException("no current navigation node");
        }
        c cVarE = kVarB.e(i9);
        Bundle bundle2 = null;
        if (cVarE != null) {
            if (pVar == null) {
                pVar = cVarE.c();
            }
            iB = cVarE.b();
            Bundle bundleA = cVarE.a();
            if (bundleA != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundleA);
            }
        } else {
            iB = i9;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (iB == 0 && pVar != null && pVar.e() != -1) {
            v(pVar.e(), pVar.f());
            return;
        }
        if (iB == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        k kVarD = d(iB);
        if (kVarD != null) {
            r(kVarD, bundle2, pVar, aVar);
            return;
        }
        String strH = k.h(this.f16287a, iB);
        if (cVarE == null) {
            throw new IllegalArgumentException("Navigation action/destination " + strH + " cannot be found from the current destination " + kVarB);
        }
        throw new IllegalArgumentException("Navigation destination " + strH + " referenced from action " + k.h(this.f16287a, i9) + " cannot be found from the current destination " + kVarB);
    }

    public final void r(k kVar, Bundle bundle, p pVar, s.a aVar) {
        boolean z9 = false;
        boolean zW = (pVar == null || pVar.e() == -1) ? false : w(pVar.e(), pVar.f());
        s sVarE = this.f16297k.e(kVar.l());
        Bundle bundleC = kVar.c(bundle);
        k kVarB = sVarE.b(kVar, bundleC, pVar, aVar);
        if (kVarB != null) {
            if (!(kVarB instanceof androidx.navigation.b)) {
                while (!this.f16294h.isEmpty() && (((e) this.f16294h.peekLast()).b() instanceof androidx.navigation.b) && w(((e) this.f16294h.peekLast()).b().i(), true)) {
                }
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            if (kVar instanceof l) {
                k kVar2 = kVarB;
                while (true) {
                    l lVarN = kVar2.n();
                    if (lVarN != null) {
                        arrayDeque.addFirst(new e(this.f16287a, lVarN, bundleC, this.f16295i, this.f16296j));
                        if (!this.f16294h.isEmpty() && ((e) this.f16294h.getLast()).b() == lVarN) {
                            w(lVarN.i(), true);
                        }
                    }
                    if (lVarN == null || lVarN == kVar) {
                        break;
                    } else {
                        kVar2 = lVarN;
                    }
                }
            }
            k kVarB2 = arrayDeque.isEmpty() ? kVarB : ((e) arrayDeque.getFirst()).b();
            while (kVarB2 != null && d(kVarB2.i()) == null) {
                kVarB2 = kVarB2.n();
                if (kVarB2 != null) {
                    arrayDeque.addFirst(new e(this.f16287a, kVarB2, bundleC, this.f16295i, this.f16296j));
                }
            }
            k kVarB3 = arrayDeque.isEmpty() ? kVarB : ((e) arrayDeque.getLast()).b();
            while (!this.f16294h.isEmpty() && (((e) this.f16294h.getLast()).b() instanceof l) && ((l) ((e) this.f16294h.getLast()).b()).B(kVarB3.i(), false) == null && w(((e) this.f16294h.getLast()).b().i(), true)) {
            }
            this.f16294h.addAll(arrayDeque);
            if (this.f16294h.isEmpty() || ((e) this.f16294h.getFirst()).b() != this.f16290d) {
                this.f16294h.addFirst(new e(this.f16287a, this.f16290d, bundleC, this.f16295i, this.f16296j));
            }
            this.f16294h.add(new e(this.f16287a, kVarB, kVarB.c(bundleC), this.f16295i, this.f16296j));
        } else if (pVar != null && pVar.g()) {
            e eVar = (e) this.f16294h.peekLast();
            if (eVar != null) {
                eVar.f(bundleC);
            }
            z9 = true;
        }
        G();
        if (zW || kVarB != null || z9) {
            b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.navigation.k] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.navigation.k] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.navigation.k, androidx.navigation.l] */
    public boolean s() {
        int i9;
        if (i() != 1) {
            return u();
        }
        ?? H9 = h();
        do {
            i9 = H9.i();
            H9 = H9.n();
            if (H9 == 0) {
                return false;
            }
        } while (H9.E() == i9);
        Bundle bundle = new Bundle();
        Activity activity = this.f16288b;
        if (activity != null && activity.getIntent() != null && this.f16288b.getIntent().getData() != null) {
            bundle.putParcelable("android-support-nav:controller:deepLinkIntent", this.f16288b.getIntent());
            k.a aVarO = this.f16290d.o(new j(this.f16288b.getIntent()));
            if (aVarO != null) {
                bundle.putAll(aVarO.b().c(aVarO.h()));
            }
        }
        new i(this).d(H9.i()).c(bundle).a().n();
        Activity activity2 = this.f16288b;
        if (activity2 != null) {
            activity2.finish();
        }
        return true;
    }

    public final void t(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f16291e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            for (String str : stringArrayList) {
                s sVarE = this.f16297k.e(str);
                Bundle bundle3 = this.f16291e.getBundle(str);
                if (bundle3 != null) {
                    sVarE.c(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f16292f;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                f fVar = (f) parcelable;
                k kVarD = d(fVar.c());
                if (kVarD == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + k.h(this.f16287a, fVar.c()) + " cannot be found from the current destination " + h());
                }
                Bundle bundleA = fVar.a();
                if (bundleA != null) {
                    bundleA.setClassLoader(this.f16287a.getClassLoader());
                }
                this.f16294h.add(new e(this.f16287a, kVarD, bundleA, this.f16295i, this.f16296j, fVar.e(), fVar.d()));
            }
            G();
            this.f16292f = null;
        }
        if (this.f16290d == null || !this.f16294h.isEmpty()) {
            b();
        } else if (this.f16293g || (activity = this.f16288b) == null || !m(activity.getIntent())) {
            r(this.f16290d, bundle, null, null);
        }
    }

    public boolean u() {
        if (this.f16294h.isEmpty()) {
            return false;
        }
        return v(h().i(), true);
    }

    public boolean v(int i9, boolean z9) {
        return w(i9, z9) && b();
    }

    public boolean w(int i9, boolean z9) {
        boolean z10 = false;
        if (this.f16294h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator itDescendingIterator = this.f16294h.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            k kVarB = ((e) itDescendingIterator.next()).b();
            s sVarE = this.f16297k.e(kVarB.l());
            if (z9 || kVarB.i() != i9) {
                arrayList.add(sVarE);
            }
            if (kVarB.i() == i9) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && ((s) it.next()).e()) {
                    e eVar = (e) this.f16294h.removeLast();
                    if (eVar.getLifecycle().b().isAtLeast(AbstractC1180j.c.CREATED)) {
                        eVar.h(AbstractC1180j.c.DESTROYED);
                    }
                    g gVar = this.f16296j;
                    if (gVar != null) {
                        gVar.b(eVar.f16324g);
                    }
                    z10 = true;
                }
                G();
                return z10;
            }
        }
        Log.i("NavController", "Ignoring popBackStack to destination " + k.h(this.f16287a, i9) + " as it was not found on the current back stack");
        return false;
    }

    public void x(b bVar) {
        this.f16298l.remove(bVar);
    }

    public void y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f16287a.getClassLoader());
        this.f16291e = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f16292f = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.f16293g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public Bundle z() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.f16297k.f().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleD = ((s) entry.getValue()).d();
            if (bundleD != null) {
                arrayList.add(str);
                bundle2.putBundle(str, bundleD);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        if (!this.f16294h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f16294h.size()];
            Iterator it = this.f16294h.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                parcelableArr[i9] = new f((e) it.next());
                i9++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (this.f16293g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f16293g);
        }
        return bundle;
    }
}
