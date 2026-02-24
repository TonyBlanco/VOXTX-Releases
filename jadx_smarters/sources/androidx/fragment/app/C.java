package androidx.fragment.app;

import L.e;
import P.L;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import e0.AbstractC1728b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f14875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14876b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14877c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14878d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14879e = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f14880a;

        public a(d dVar) {
            this.f14880a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C.this.f14876b.contains(this.f14880a)) {
                this.f14880a.e().applyState(this.f14880a.f().mView);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f14882a;

        public b(d dVar) {
            this.f14882a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C.this.f14876b.remove(this.f14882a);
            C.this.f14877c.remove(this.f14882a);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f14885b;

        static {
            int[] iArr = new int[e.b.values().length];
            f14885b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14885b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14885b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f14884a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14884a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14884a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14884a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class d extends e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final t f14886h;

        public d(e.c cVar, e.b bVar, t tVar, L.e eVar) {
            super(cVar, bVar, tVar.k(), eVar);
            this.f14886h = tVar;
        }

        @Override // androidx.fragment.app.C.e
        public void c() {
            super.c();
            this.f14886h.m();
        }

        @Override // androidx.fragment.app.C.e
        public void l() {
            if (g() == e.b.ADDING) {
                Fragment fragmentK = this.f14886h.k();
                View viewFindFocus = fragmentK.mView.findFocus();
                if (viewFindFocus != null) {
                    fragmentK.setFocusedView(viewFindFocus);
                    if (m.F0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentK);
                    }
                }
                View viewRequireView = f().requireView();
                if (viewRequireView.getParent() == null) {
                    this.f14886h.b();
                    viewRequireView.setAlpha(0.0f);
                }
                if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                    viewRequireView.setVisibility(4);
                }
                viewRequireView.setAlpha(fragmentK.getPostOnViewCreatedAlpha());
            }
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f14887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f14888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Fragment f14889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f14890d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final HashSet f14891e = new HashSet();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f14892f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f14893g = false;

        public class a implements e.b {
            public a() {
            }

            @Override // L.e.b
            public void a() {
                e.this.b();
            }
        }

        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c from(int i9) {
                if (i9 == 0) {
                    return VISIBLE;
                }
                if (i9 == 4) {
                    return INVISIBLE;
                }
                if (i9 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i9);
            }

            public static c from(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : from(view.getVisibility());
            }

            public void applyState(View view) {
                int i9;
                int i10 = c.f14884a[ordinal()];
                if (i10 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (m.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (m.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i9 = 0;
                } else {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return;
                        }
                        if (m.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    if (m.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i9 = 8;
                }
                view.setVisibility(i9);
            }
        }

        public e(c cVar, b bVar, Fragment fragment, L.e eVar) {
            this.f14887a = cVar;
            this.f14888b = bVar;
            this.f14889c = fragment;
            eVar.d(new a());
        }

        public final void a(Runnable runnable) {
            this.f14890d.add(runnable);
        }

        public final void b() {
            if (h()) {
                return;
            }
            this.f14892f = true;
            if (this.f14891e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f14891e).iterator();
            while (it.hasNext()) {
                ((L.e) it.next()).a();
            }
        }

        public void c() {
            if (this.f14893g) {
                return;
            }
            if (m.F0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f14893g = true;
            Iterator it = this.f14890d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void d(L.e eVar) {
            if (this.f14891e.remove(eVar) && this.f14891e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f14887a;
        }

        public final Fragment f() {
            return this.f14889c;
        }

        public b g() {
            return this.f14888b;
        }

        public final boolean h() {
            return this.f14892f;
        }

        public final boolean i() {
            return this.f14893g;
        }

        public final void j(L.e eVar) {
            l();
            this.f14891e.add(eVar);
        }

        public final void k(c cVar, b bVar) {
            b bVar2;
            int i9 = c.f14885b[bVar.ordinal()];
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 == 3 && this.f14887a != c.REMOVED) {
                        if (m.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f14889c + " mFinalState = " + this.f14887a + " -> " + cVar + ". ");
                        }
                        this.f14887a = cVar;
                        return;
                    }
                    return;
                }
                if (m.F0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f14889c + " mFinalState = " + this.f14887a + " -> REMOVED. mLifecycleImpact  = " + this.f14888b + " to REMOVING.");
                }
                this.f14887a = c.REMOVED;
                bVar2 = b.REMOVING;
            } else {
                if (this.f14887a != c.REMOVED) {
                    return;
                }
                if (m.F0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f14889c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f14888b + " to ADDING.");
                }
                this.f14887a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.f14888b = bVar2;
        }

        public abstract void l();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f14887a + "} {mLifecycleImpact = " + this.f14888b + "} {mFragment = " + this.f14889c + "}";
        }
    }

    public C(ViewGroup viewGroup) {
        this.f14875a = viewGroup;
    }

    public static C n(ViewGroup viewGroup, m mVar) {
        return o(viewGroup, mVar.y0());
    }

    public static C o(ViewGroup viewGroup, D d9) {
        Object tag = viewGroup.getTag(AbstractC1728b.f40134b);
        if (tag instanceof C) {
            return (C) tag;
        }
        C cA = d9.a(viewGroup);
        viewGroup.setTag(AbstractC1728b.f40134b, cA);
        return cA;
    }

    public final void a(e.c cVar, e.b bVar, t tVar) {
        synchronized (this.f14876b) {
            try {
                L.e eVar = new L.e();
                e eVarH = h(tVar.k());
                if (eVarH != null) {
                    eVarH.k(cVar, bVar);
                    return;
                }
                d dVar = new d(cVar, bVar, tVar, eVar);
                this.f14876b.add(dVar);
                dVar.a(new a(dVar));
                dVar.a(new b(dVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(e.c cVar, t tVar) {
        if (m.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + tVar.k());
        }
        a(cVar, e.b.ADDING, tVar);
    }

    public void c(t tVar) {
        if (m.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + tVar.k());
        }
        a(e.c.GONE, e.b.NONE, tVar);
    }

    public void d(t tVar) {
        if (m.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + tVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, tVar);
    }

    public void e(t tVar) {
        if (m.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + tVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, tVar);
    }

    public abstract void f(List list, boolean z9);

    public void g() {
        if (this.f14879e) {
            return;
        }
        if (!L.V(this.f14875a)) {
            j();
            this.f14878d = false;
            return;
        }
        synchronized (this.f14876b) {
            try {
                if (!this.f14876b.isEmpty()) {
                    ArrayList<e> arrayList = new ArrayList(this.f14877c);
                    this.f14877c.clear();
                    for (e eVar : arrayList) {
                        if (m.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.f14877c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.f14876b);
                    this.f14876b.clear();
                    this.f14877c.addAll(arrayList2);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).l();
                    }
                    f(arrayList2, this.f14878d);
                    this.f14878d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final e h(Fragment fragment) {
        for (e eVar : this.f14876b) {
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    public final e i(Fragment fragment) {
        for (e eVar : this.f14877c) {
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    public void j() {
        boolean zV = L.V(this.f14875a);
        synchronized (this.f14876b) {
            try {
                q();
                Iterator it = this.f14876b.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).l();
                }
                for (e eVar : new ArrayList(this.f14877c)) {
                    if (m.F0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        sb.append(zV ? "" : "Container " + this.f14875a + " is not attached to window. ");
                        sb.append("Cancelling running operation ");
                        sb.append(eVar);
                        Log.v("FragmentManager", sb.toString());
                    }
                    eVar.b();
                }
                for (e eVar2 : new ArrayList(this.f14876b)) {
                    if (m.F0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        sb2.append(zV ? "" : "Container " + this.f14875a + " is not attached to window. ");
                        sb2.append("Cancelling pending operation ");
                        sb2.append(eVar2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    eVar2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k() {
        if (this.f14879e) {
            this.f14879e = false;
            g();
        }
    }

    public e.b l(t tVar) {
        e eVarH = h(tVar.k());
        e.b bVarG = eVarH != null ? eVarH.g() : null;
        e eVarI = i(tVar.k());
        return (eVarI == null || !(bVarG == null || bVarG == e.b.NONE)) ? bVarG : eVarI.g();
    }

    public ViewGroup m() {
        return this.f14875a;
    }

    public void p() {
        synchronized (this.f14876b) {
            try {
                q();
                this.f14879e = false;
                int size = this.f14876b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    e eVar = (e) this.f14876b.get(size);
                    e.c cVarFrom = e.c.from(eVar.f().mView);
                    e.c cVarE = eVar.e();
                    e.c cVar = e.c.VISIBLE;
                    if (cVarE == cVar && cVarFrom != cVar) {
                        this.f14879e = eVar.f().isPostponed();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        for (e eVar : this.f14876b) {
            if (eVar.g() == e.b.ADDING) {
                eVar.k(e.c.from(eVar.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    public void r(boolean z9) {
        this.f14878d = z9;
    }
}
