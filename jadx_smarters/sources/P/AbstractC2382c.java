package p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: p.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2382c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICustomTabsService f46168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f46169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f46170c;

    /* JADX INFO: renamed from: p.c$a */
    public class a extends ICustomTabsCallback.Stub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Handler f46171a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C2381b f46172c;

        /* JADX INFO: renamed from: p.c$a$a, reason: collision with other inner class name */
        public class RunnableC0408a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f46174a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f46175c;

            public RunnableC0408a(int i9, Bundle bundle) {
                this.f46174a = i9;
                this.f46175c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f46172c.onNavigationEvent(this.f46174a, this.f46175c);
            }
        }

        /* JADX INFO: renamed from: p.c$a$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f46177a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f46178c;

            public b(String str, Bundle bundle) {
                this.f46177a = str;
                this.f46178c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f46172c.extraCallback(this.f46177a, this.f46178c);
            }
        }

        /* JADX INFO: renamed from: p.c$a$c, reason: collision with other inner class name */
        public class RunnableC0409c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f46180a;

            public RunnableC0409c(Bundle bundle) {
                this.f46180a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f46172c.onMessageChannelReady(this.f46180a);
            }
        }

        /* JADX INFO: renamed from: p.c$a$d */
        public class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f46182a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f46183c;

            public d(String str, Bundle bundle) {
                this.f46182a = str;
                this.f46183c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f46172c.onPostMessage(this.f46182a, this.f46183c);
            }
        }

        /* JADX INFO: renamed from: p.c$a$e */
        public class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f46185a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Uri f46186c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f46187d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Bundle f46188e;

            public e(int i9, Uri uri, boolean z9, Bundle bundle) {
                this.f46185a = i9;
                this.f46186c = uri;
                this.f46187d = z9;
                this.f46188e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f46172c.onRelationshipValidationResult(this.f46185a, this.f46186c, this.f46187d, this.f46188e);
            }
        }

        public a(C2381b c2381b) {
            this.f46172c = c2381b;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(String str, Bundle bundle) {
            if (this.f46172c == null) {
                return;
            }
            this.f46171a.post(new b(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            C2381b c2381b = this.f46172c;
            if (c2381b == null) {
                return null;
            }
            return c2381b.extraCallbackWithResult(str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) {
            if (this.f46172c == null) {
                return;
            }
            this.f46171a.post(new RunnableC0409c(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i9, Bundle bundle) {
            if (this.f46172c == null) {
                return;
            }
            this.f46171a.post(new RunnableC0408a(i9, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) {
            if (this.f46172c == null) {
                return;
            }
            this.f46171a.post(new d(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i9, Uri uri, boolean z9, Bundle bundle) {
            if (this.f46172c == null) {
                return;
            }
            this.f46171a.post(new e(i9, uri, z9, bundle));
        }
    }

    public AbstractC2382c(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
        this.f46168a = iCustomTabsService;
        this.f46169b = componentName;
        this.f46170c = context;
    }

    public static boolean a(Context context, String str, AbstractServiceConnectionC2384e abstractServiceConnectionC2384e) {
        abstractServiceConnectionC2384e.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC2384e, 33);
    }

    public static String c(Context context, List list) {
        return d(context, list, false);
    }

    public static String d(Context context, List list, boolean z9) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z9 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public final ICustomTabsCallback.Stub b(C2381b c2381b) {
        return new a(c2381b);
    }

    public C2385f e(C2381b c2381b) {
        return f(c2381b, null);
    }

    public final C2385f f(C2381b c2381b, PendingIntent pendingIntent) {
        boolean zNewSession;
        ICustomTabsCallback.Stub stubB = b(c2381b);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zNewSession = this.f46168a.newSessionWithExtras(stubB, bundle);
            } else {
                zNewSession = this.f46168a.newSession(stubB);
            }
            if (zNewSession) {
                return new C2385f(this.f46168a, stubB, this.f46169b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean g(long j9) {
        try {
            return this.f46168a.warmup(j9);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
