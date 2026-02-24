package androidx.lifecycle;

import F0.c;
import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class D implements c.InterfaceC0023c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F0.c f15841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f15843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k8.f f15844d;

    public static final class a extends kotlin.jvm.internal.m implements w8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ N f15845a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(N n9) {
            super(0);
            this.f15845a = n9;
        }

        @Override // w8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke() {
            return C.e(this.f15845a);
        }
    }

    public D(F0.c savedStateRegistry, N viewModelStoreOwner) {
        kotlin.jvm.internal.l.e(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.l.e(viewModelStoreOwner, "viewModelStoreOwner");
        this.f15841a = savedStateRegistry;
        this.f15844d = k8.g.a(new a(viewModelStoreOwner));
    }

    @Override // F0.c.InterfaceC0023c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f15843c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().b().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((B) entry.getValue()).d().a();
            if (!kotlin.jvm.internal.l.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f15842b = false;
        return bundle;
    }

    public final Bundle b(String key) {
        kotlin.jvm.internal.l.e(key, "key");
        d();
        Bundle bundle = this.f15843c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f15843c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f15843c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f15843c = null;
        }
        return bundle2;
    }

    public final E c() {
        return (E) this.f15844d.getValue();
    }

    public final void d() {
        if (this.f15842b) {
            return;
        }
        this.f15843c = this.f15841a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        this.f15842b = true;
        c();
    }
}
