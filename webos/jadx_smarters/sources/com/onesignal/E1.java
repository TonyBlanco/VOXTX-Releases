package com.onesignal;

import android.content.Context;
import androidx.work.a;
import com.onesignal.F1;

/* JADX INFO: loaded from: classes4.dex */
public final class E1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E1 f38196a = new E1();

    public static final synchronized Q0.u a(Context context) {
        Q0.u uVarF;
        kotlin.jvm.internal.l.e(context, "context");
        try {
            uVarF = Q0.u.f(context);
            kotlin.jvm.internal.l.d(uVarF, "{\n            WorkManage…stance(context)\n        }");
        } catch (IllegalStateException e9) {
            F1.b(F1.v.ERROR, "OSWorkManagerHelper.getInstance failed, attempting to initialize: ", e9);
            f38196a.b(context);
            uVarF = Q0.u.f(context);
            kotlin.jvm.internal.l.d(uVarF, "{\n            /*\n       …stance(context)\n        }");
        }
        return uVarF;
    }

    public final void b(Context context) {
        try {
            context.getApplicationContext();
            androidx.work.a aVarA = new a.b().a();
            kotlin.jvm.internal.l.d(aVarA, "(context.applicationCont…uration.Builder().build()");
            Q0.u.g(context, aVarA);
        } catch (IllegalStateException e9) {
            F1.b(F1.v.ERROR, "OSWorkManagerHelper initializing WorkManager failed: ", e9);
        }
    }
}
