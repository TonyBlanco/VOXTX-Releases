package p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import java.util.List;

/* JADX INFO: renamed from: p.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2385f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46202a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICustomTabsService f46203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ICustomTabsCallback f46204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComponentName f46205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PendingIntent f46206e;

    public C2385f(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName, PendingIntent pendingIntent) {
        this.f46203b = iCustomTabsService;
        this.f46204c = iCustomTabsCallback;
        this.f46205d = componentName;
        this.f46206e = pendingIntent;
    }

    public final void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f46206e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    public final Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    public IBinder c() {
        return this.f46204c.asBinder();
    }

    public ComponentName d() {
        return this.f46205d;
    }

    public PendingIntent e() {
        return this.f46206e;
    }

    public boolean f(Uri uri, Bundle bundle, List list) {
        try {
            return this.f46203b.mayLaunchUrl(this.f46204c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
