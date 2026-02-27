package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.onesignal.C1530a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class PermissionsActivity extends Activity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f38437d = "com.onesignal.PermissionsActivity";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f38438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f38439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f38440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static C1530a.b f38441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f38442i = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38443a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38444c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int[] f38445a;

        public a(int[] iArr) {
            this.f38445a = iArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = this.f38445a;
            boolean z9 = false;
            if (iArr.length > 0 && iArr[0] == 0) {
                z9 = true;
            }
            c cVar = (c) PermissionsActivity.f38442i.get(PermissionsActivity.this.f38443a);
            if (cVar == null) {
                throw new RuntimeException("Missing handler for permissionRequestType: " + PermissionsActivity.this.f38443a);
            }
            if (z9) {
                cVar.a();
            } else {
                cVar.b(PermissionsActivity.this.h());
            }
        }
    }

    public class b extends C1530a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f38448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Class f38449c;

        public b(String str, String str2, Class cls) {
            this.f38447a = str;
            this.f38448b = str2;
            this.f38449c = cls;
        }

        @Override // com.onesignal.C1530a.b
        public void a(Activity activity) {
            if (activity.getClass().equals(PermissionsActivity.class)) {
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) PermissionsActivity.class);
            intent.setFlags(131072);
            intent.putExtra("INTENT_EXTRA_PERMISSION_TYPE", this.f38447a).putExtra("INTENT_EXTRA_ANDROID_PERMISSION_STRING", this.f38448b).putExtra("INTENT_EXTRA_CALLBACK_CLASS", this.f38449c.getName());
            activity.startActivity(intent);
            activity.overridePendingTransition(d2.f38709a, d2.f38710b);
        }
    }

    public interface c {
        void a();

        void b(boolean z9);
    }

    public static void e(String str, c cVar) {
        f38442i.put(str, cVar);
    }

    public static void i(boolean z9, String str, String str2, Class cls) {
        if (f38438e) {
            return;
        }
        f38439f = z9;
        f38441h = new b(str, str2, cls);
        C1530a c1530aB = C1533b.b();
        if (c1530aB != null) {
            c1530aB.c(f38437d, f38441h);
        }
    }

    public final void d(Bundle bundle) {
        if (Build.VERSION.SDK_INT < 23) {
            finish();
            overridePendingTransition(d2.f38709a, d2.f38710b);
            return;
        }
        g(bundle);
        this.f38443a = bundle.getString("INTENT_EXTRA_PERMISSION_TYPE");
        String string = bundle.getString("INTENT_EXTRA_ANDROID_PERMISSION_STRING");
        this.f38444c = string;
        f(string);
    }

    public final void f(String str) {
        if (f38438e) {
            return;
        }
        f38438e = true;
        f38440g = true ^ AbstractC1545f.b(this, str);
        AbstractC1545f.a(this, new String[]{str}, 2);
    }

    public final void g(Bundle bundle) {
        String string = bundle.getString("INTENT_EXTRA_CALLBACK_CLASS");
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Could not find callback class for PermissionActivity: " + string);
        }
    }

    public final boolean h() {
        return f38439f && f38440g && !AbstractC1545f.b(this, this.f38444c);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        F1.K0(this);
        d(getIntent().getExtras());
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d(intent.getExtras());
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        f38438e = false;
        if (i9 == 2) {
            new Handler().postDelayed(new a(iArr), 500L);
        }
        C1530a c1530aB = C1533b.b();
        if (c1530aB != null) {
            c1530aB.r(f38437d);
        }
        finish();
        overridePendingTransition(d2.f38709a, d2.f38710b);
    }
}
