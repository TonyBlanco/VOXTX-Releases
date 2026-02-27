package androidx.lifecycle;

import F0.c;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.J;
import m0.AbstractC2215a;
import m0.C2217c;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2215a.b f15836a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2215a.b f15837b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC2215a.b f15838c = new a();

    public static final class a implements AbstractC2215a.b {
    }

    public static final class b implements AbstractC2215a.b {
    }

    public static final class c implements AbstractC2215a.b {
    }

    public static final class d extends kotlin.jvm.internal.m implements w8.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f15839a = new d();

        public d() {
            super(1);
        }

        @Override // w8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(AbstractC2215a initializer) {
            kotlin.jvm.internal.l.e(initializer, "$this$initializer");
            return new E();
        }
    }

    public static final B a(F0.e eVar, N n9, String str, Bundle bundle) {
        D d9 = d(eVar);
        E e9 = e(n9);
        B b9 = (B) e9.b().get(str);
        if (b9 != null) {
            return b9;
        }
        B bA = B.f15829f.a(d9.b(str), bundle);
        e9.b().put(str, bA);
        return bA;
    }

    public static final B b(AbstractC2215a abstractC2215a) {
        kotlin.jvm.internal.l.e(abstractC2215a, "<this>");
        F0.e eVar = (F0.e) abstractC2215a.a(f15836a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        N n9 = (N) abstractC2215a.a(f15837b);
        if (n9 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC2215a.a(f15838c);
        String str = (String) abstractC2215a.a(J.c.f15873c);
        if (str != null) {
            return a(eVar, n9, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    public static final void c(F0.e eVar) {
        kotlin.jvm.internal.l.e(eVar, "<this>");
        AbstractC1180j.c cVarB = eVar.getLifecycle().b();
        kotlin.jvm.internal.l.d(cVarB, "lifecycle.currentState");
        if (cVarB != AbstractC1180j.c.INITIALIZED && cVarB != AbstractC1180j.c.CREATED) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (eVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            D d9 = new D(eVar.getSavedStateRegistry(), (N) eVar);
            eVar.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", d9);
            eVar.getLifecycle().a(new SavedStateHandleAttacher(d9));
        }
    }

    public static final D d(F0.e eVar) {
        kotlin.jvm.internal.l.e(eVar, "<this>");
        c.InterfaceC0023c interfaceC0023cC = eVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        D d9 = interfaceC0023cC instanceof D ? (D) interfaceC0023cC : null;
        if (d9 != null) {
            return d9;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final E e(N n9) {
        kotlin.jvm.internal.l.e(n9, "<this>");
        C2217c c2217c = new C2217c();
        c2217c.a(kotlin.jvm.internal.C.b(E.class), d.f15839a);
        return (E) new J(n9, c2217c.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", E.class);
    }
}
