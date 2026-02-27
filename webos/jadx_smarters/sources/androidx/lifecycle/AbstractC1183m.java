package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1183m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicBoolean f15935a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.m$a */
    public static class a extends AbstractC1175e {
        @Override // androidx.lifecycle.AbstractC1175e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            z.g(activity);
        }

        @Override // androidx.lifecycle.AbstractC1175e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // androidx.lifecycle.AbstractC1175e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public static void a(Context context) {
        if (f15935a.getAndSet(true)) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new a());
    }
}
