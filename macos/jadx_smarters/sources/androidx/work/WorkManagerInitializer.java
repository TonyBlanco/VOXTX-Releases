package androidx.work;

import Q0.k;
import Q0.u;
import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements I0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f17261a = k.f("WrkMgrInitializer");

    @Override // I0.b
    public List a() {
        return Collections.emptyList();
    }

    @Override // I0.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public u b(Context context) {
        k.c().a(f17261a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        u.g(context, new a.b().a());
        return u.f(context);
    }
}
