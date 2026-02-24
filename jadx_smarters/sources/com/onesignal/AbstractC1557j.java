package com.onesignal;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* JADX INFO: renamed from: com.onesignal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1557j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38736a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ApplicationInfo f38737b;

    /* JADX INFO: renamed from: com.onesignal.j$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final ApplicationInfo a(Context context) {
            kotlin.jvm.internal.l.e(context, "context");
            if (AbstractC1557j.f38737b != null) {
                return AbstractC1557j.f38737b;
            }
            try {
                AbstractC1557j.f38737b = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                return AbstractC1557j.f38737b;
            } catch (RuntimeException e9) {
                if (AbstractC1554i.a(e9.getCause())) {
                    return null;
                }
                throw e9;
            }
        }
    }
}
