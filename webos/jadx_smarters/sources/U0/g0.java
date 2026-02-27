package u0;

import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f51040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f51041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f51042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f51043e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51044a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f51045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f51046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f51047d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f51048e;

        public a() {
            this.f51045b = Build.VERSION.SDK_INT >= 30;
        }

        public g0 a() {
            return new g0(this);
        }

        public a b(boolean z9) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f51045b = z9;
            }
            return this;
        }

        public a c(boolean z9) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f51046c = z9;
            }
            return this;
        }

        public a d(boolean z9) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f51047d = z9;
            }
            return this;
        }
    }

    public g0(a aVar) {
        this.f51039a = aVar.f51044a;
        this.f51040b = aVar.f51045b;
        this.f51041c = aVar.f51046c;
        this.f51042d = aVar.f51047d;
        Bundle bundle = aVar.f51048e;
        this.f51043e = bundle == null ? Bundle.EMPTY : new Bundle(bundle);
    }

    public int a() {
        return this.f51039a;
    }

    public Bundle b() {
        return this.f51043e;
    }

    public boolean c() {
        return this.f51040b;
    }

    public boolean d() {
        return this.f51041c;
    }

    public boolean e() {
        return this.f51042d;
    }
}
