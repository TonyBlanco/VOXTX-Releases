package O5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: O5.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0956u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f6665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A5.f f6666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TaskCompletionSource f6668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f6671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TaskCompletionSource f6672h;

    public C0956u(A5.f fVar) {
        Object obj = new Object();
        this.f6667c = obj;
        this.f6668d = new TaskCompletionSource();
        this.f6669e = false;
        this.f6670f = false;
        this.f6672h = new TaskCompletionSource();
        Context contextL = fVar.l();
        this.f6666b = fVar;
        this.f6665a = AbstractC0945i.s(contextL);
        Boolean boolB = b();
        this.f6671g = boolB == null ? a(contextL) : boolB;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f6668d.trySetResult(null);
                    this.f6669e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e9) {
            L5.f.f().e("Could not read data collection permission from manifest", e9);
            return null;
        }
    }

    public final Boolean a(Context context) {
        Boolean boolG = g(context);
        if (boolG == null) {
            this.f6670f = false;
            return null;
        }
        this.f6670f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolG));
    }

    public final Boolean b() {
        if (!this.f6665a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f6670f = false;
        return Boolean.valueOf(this.f6665a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    public void c(boolean z9) {
        if (!z9) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f6672h.trySetResult(null);
    }

    public synchronized boolean d() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f6671g;
            zBooleanValue = bool != null ? bool.booleanValue() : e();
            f(zBooleanValue);
        } catch (Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }

    public final boolean e() {
        try {
            return this.f6666b.v();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public final void f(boolean z9) {
        L5.f.f().b(String.format("Crashlytics automatic data collection %s by %s.", z9 ? "ENABLED" : "DISABLED", this.f6671g == null ? "global Firebase setting" : this.f6670f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    public Task h() {
        Task task;
        synchronized (this.f6667c) {
            task = this.f6668d.getTask();
        }
        return task;
    }

    public Task i(Executor executor) {
        return W.o(executor, this.f6672h.getTask(), h());
    }
}
