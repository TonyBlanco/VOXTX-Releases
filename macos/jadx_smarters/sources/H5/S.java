package H5;

import android.content.Context;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes3.dex */
public final class S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S f2637c = new S();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f2638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f2639b;

    public S() {
        this(A.g(), r.a());
    }

    public S(A a9, r rVar) {
        this.f2638a = a9;
        this.f2639b = rVar;
    }

    public static S c() {
        return f2637c;
    }

    public final void a(Context context) {
        this.f2638a.a(context);
    }

    public final void b(FirebaseAuth firebaseAuth) {
        this.f2638a.f(firebaseAuth);
    }
}
