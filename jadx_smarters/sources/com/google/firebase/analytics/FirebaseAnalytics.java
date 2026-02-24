package com.google.firebase.analytics;

import B5.a;
import M4.InterfaceC0830u3;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k6.g;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f27870b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzef f27871a;

    public FirebaseAnalytics(zzef zzefVar) {
        r.m(zzefVar);
        this.f27871a = zzefVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f27870b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f27870b == null) {
                        f27870b = new FirebaseAnalytics(zzef.zzg(context, null, null, null, null));
                    }
                } finally {
                }
            }
        }
        return f27870b;
    }

    @Keep
    public static InterfaceC0830u3 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzef zzefVarZzg = zzef.zzg(context, null, null, null, bundle);
        if (zzefVarZzg == null) {
            return null;
        }
        return new a(zzefVarZzg);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(g.p().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e9) {
            throw new IllegalStateException(e9);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f27871a.zzH(activity, str, str2);
    }
}
