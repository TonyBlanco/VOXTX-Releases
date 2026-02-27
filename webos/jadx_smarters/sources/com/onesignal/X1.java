package com.onesignal;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes4.dex */
public abstract class X1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38626a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final A a(Context appContext, String packageName, int i9) {
            kotlin.jvm.internal.l.e(appContext, "appContext");
            kotlin.jvm.internal.l.e(packageName, "packageName");
            try {
                return new A(true, appContext.getPackageManager().getPackageInfo(packageName, i9));
            } catch (PackageManager.NameNotFoundException unused) {
                return new A(true, null);
            } catch (RuntimeException e9) {
                if (AbstractC1554i.a(e9.getCause())) {
                    return new A(false, null);
                }
                throw e9;
            }
        }
    }
}
