package g1;

import android.app.Activity;
import android.content.Context;
import g1.C1814h;

/* JADX INFO: renamed from: g1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1809c {

    /* JADX INFO: renamed from: g1.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile C1814h f41168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f41169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile InterfaceC1816j f41170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f41171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f41172e;

        public /* synthetic */ a(Context context, X x9) {
            this.f41169b = context;
        }

        public AbstractC1809c a() {
            if (this.f41169b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f41170c == null) {
                if (this.f41171d || this.f41172e) {
                    return new C1810d(null, this.f41169b, null, null);
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.f41168a == null || !this.f41168a.a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return this.f41170c != null ? new C1810d(null, this.f41168a, this.f41169b, this.f41170c, null, null, null) : new C1810d(null, this.f41168a, this.f41169b, null, null, null);
        }

        public a b() {
            C1814h.a aVarC = C1814h.c();
            aVarC.b();
            c(aVarC.a());
            return this;
        }

        public a c(C1814h c1814h) {
            this.f41168a = c1814h;
            return this;
        }

        public a d(InterfaceC1816j interfaceC1816j) {
            this.f41170c = interfaceC1816j;
            return this;
        }
    }

    public static a e(Context context) {
        return new a(context, null);
    }

    public abstract void a(C1807a c1807a, InterfaceC1808b interfaceC1808b);

    public abstract void b();

    public abstract boolean c();

    public abstract com.android.billingclient.api.a d(Activity activity, C1812f c1812f);

    public abstract void f(String str, InterfaceC1815i interfaceC1815i);

    public abstract void g(C1817k c1817k, InterfaceC1818l interfaceC1818l);

    public abstract void h(InterfaceC1811e interfaceC1811e);
}
