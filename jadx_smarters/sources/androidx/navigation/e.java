package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1178h;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.InterfaceC1179i;
import androidx.lifecycle.InterfaceC1186p;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import java.util.UUID;
import m0.AbstractC2215a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC1186p, N, InterfaceC1179i, F0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16319a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f16320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f16321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.q f16322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F0.d f16323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UUID f16324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AbstractC1180j.c f16325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AbstractC1180j.c f16326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f16327j;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16328a;

        static {
            int[] iArr = new int[AbstractC1180j.b.values().length];
            f16328a = iArr;
            try {
                iArr[AbstractC1180j.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16328a[AbstractC1180j.b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16328a[AbstractC1180j.b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16328a[AbstractC1180j.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16328a[AbstractC1180j.b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16328a[AbstractC1180j.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16328a[AbstractC1180j.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public e(Context context, k kVar, Bundle bundle, InterfaceC1186p interfaceC1186p, g gVar) {
        this(context, kVar, bundle, interfaceC1186p, gVar, UUID.randomUUID(), null);
    }

    public e(Context context, k kVar, Bundle bundle, InterfaceC1186p interfaceC1186p, g gVar, UUID uuid, Bundle bundle2) {
        this.f16322e = new androidx.lifecycle.q(this);
        F0.d dVarA = F0.d.a(this);
        this.f16323f = dVarA;
        this.f16325h = AbstractC1180j.c.CREATED;
        this.f16326i = AbstractC1180j.c.RESUMED;
        this.f16319a = context;
        this.f16324g = uuid;
        this.f16320c = kVar;
        this.f16321d = bundle;
        this.f16327j = gVar;
        dVarA.d(bundle2);
        if (interfaceC1186p != null) {
            this.f16325h = interfaceC1186p.getLifecycle().b();
        }
    }

    public static AbstractC1180j.c d(AbstractC1180j.b bVar) {
        switch (a.f16328a[bVar.ordinal()]) {
            case 1:
            case 2:
                return AbstractC1180j.c.CREATED;
            case 3:
            case 4:
                return AbstractC1180j.c.STARTED;
            case 5:
                return AbstractC1180j.c.RESUMED;
            case 6:
                return AbstractC1180j.c.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + bVar);
        }
    }

    public Bundle a() {
        return this.f16321d;
    }

    public k b() {
        return this.f16320c;
    }

    public AbstractC1180j.c c() {
        return this.f16326i;
    }

    public void e(AbstractC1180j.b bVar) {
        this.f16325h = d(bVar);
        i();
    }

    public void f(Bundle bundle) {
        this.f16321d = bundle;
    }

    public void g(Bundle bundle) {
        this.f16323f.e(bundle);
    }

    @Override // androidx.lifecycle.InterfaceC1179i
    public /* synthetic */ AbstractC2215a getDefaultViewModelCreationExtras() {
        return AbstractC1178h.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC1186p
    public AbstractC1180j getLifecycle() {
        return this.f16322e;
    }

    @Override // F0.e
    public F0.c getSavedStateRegistry() {
        return this.f16323f.b();
    }

    @Override // androidx.lifecycle.N
    public M getViewModelStore() {
        g gVar = this.f16327j;
        if (gVar != null) {
            return gVar.d(this.f16324g);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public void h(AbstractC1180j.c cVar) {
        this.f16326i = cVar;
        i();
    }

    public void i() {
        androidx.lifecycle.q qVar;
        AbstractC1180j.c cVar;
        if (this.f16325h.ordinal() < this.f16326i.ordinal()) {
            qVar = this.f16322e;
            cVar = this.f16325h;
        } else {
            qVar = this.f16322e;
            cVar = this.f16326i;
        }
        qVar.o(cVar);
    }
}
