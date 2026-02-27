package com.google.firebase.auth.internal;

import A5.f;
import C4.a;
import C4.h;
import C4.j;
import H5.A;
import H5.AbstractC0622m;
import H5.P;
import H5.S;
import H5.W;
import H5.Y;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractActivityC1145e;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001firebaseauthapi.zzaci;
import com.google.android.gms.internal.p001firebaseauthapi.zzacj;
import com.google.android.gms.internal.p001firebaseauthapi.zzack;
import com.google.android.gms.internal.p001firebaseauthapi.zzacw;
import com.google.android.gms.internal.p001firebaseauthapi.zzaed;
import com.google.android.gms.internal.p001firebaseauthapi.zzb;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import d.AbstractC1617D;
import j6.InterfaceC2102b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import p.C2383d;
import p0.C2386a;

/* JADX INFO: loaded from: classes3.dex */
public class RecaptchaActivity extends AbstractActivityC1145e implements zzack {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f27915c = "RecaptchaActivity";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f27916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final S f27917e = S.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27918a = false;

    private final Uri.Builder h1(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String string = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        f fVarN = f.n(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(fVarN);
        W.b().d(getApplicationContext(), str, string, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String strB = Y.a(getApplicationContext(), fVarN.q()).b();
        if (TextUtils.isEmpty(strB)) {
            Log.e(f27915c, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            i1(AbstractC0622m.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", !TextUtils.isEmpty(firebaseAuth.e()) ? firebaseAuth.e() : zzacw.zza()).appendQueryParameter("eventId", string).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strB);
        return builder;
    }

    private final void i1(Status status) {
        f27916d = 0L;
        this.f27918a = false;
        Intent intent = new Intent();
        P.b(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        k1(intent);
        f27917e.a(this);
        finish();
    }

    private final boolean k1(Intent intent) {
        return C2386a.b(this).d(intent);
    }

    private final void l1() {
        f27916d = 0L;
        this.f27918a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        k1(intent);
        f27917e.a(this);
        finish();
    }

    public final /* synthetic */ void j1(String str, Task task) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e(f27915c, "Device cannot resolve intent for: android.intent.action.VIEW");
            zzacj.zzb(this, str);
            return;
        }
        List<ResolveInfo> listQueryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            C2383d c2383dA = new C2383d.a().a();
            c2383dA.f46190a.addFlags(1073741824);
            c2383dA.f46190a.addFlags(268435456);
            c2383dA.a(this, (Uri) task.getResult());
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
        intent.putExtra("com.android.browser.application_id", str);
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        startActivity(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e(f27915c, "Could not do operation - unknown action: " + action);
            l1();
            return;
        }
        long jA = h.c().a();
        if (jA - f27916d < 30000) {
            Log.e(f27915c, "Could not start operation - already in progress");
            return;
        }
        f27916d = jA;
        if (bundle != null) {
            this.f27918a = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f27918a) {
                l1();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = j.b(a.a(this, packageName)).toLowerCase(Locale.US);
                f fVarN = f.n(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(fVarN);
                if (zzaed.zza(fVarN)) {
                    zza(h1(Uri.parse(zzaed.zza(fVarN.p().b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.B());
                } else {
                    new zzaci(packageName, lowerCase, intent, fVarN, this).executeOnExecutor(firebaseAuth.D(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e9) {
                Log.e(f27915c, "Could not get package signature: " + packageName + " " + String.valueOf(e9));
                zzacj.zzb(this, packageName);
            }
            this.f27918a = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            i1(P.a(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            l1();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        String strG = W.b().g(getApplicationContext(), getPackageName(), intent2.getStringExtra("eventId"));
        if (TextUtils.isEmpty(strG)) {
            Log.e(f27915c, "Failed to find registration for this event - failing to prevent session injection.");
            i1(AbstractC0622m.a("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = Y.a(getApplicationContext(), f.n(strG).q()).c(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        f27916d = 0L;
        this.f27918a = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (k1(intent3)) {
            f27917e.a(this);
        } else {
            A.d(getApplicationContext(), queryParameter, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f27918a);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzack
    public final Context zza() {
        return getApplicationContext();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzack
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return h1(new Uri.Builder().scheme(ClientConstants.DOMAIN_SCHEME).appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzack
    public final String zza(String str) {
        return zzaed.zzb(str);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzack
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zzb.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            zzack.zza.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzack
    public final void zza(Uri uri, final String str, InterfaceC2102b interfaceC2102b) {
        AbstractC1617D.a(interfaceC2102b.get());
        Tasks.forResult(uri).addOnCompleteListener(new OnCompleteListener() { // from class: H5.B
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f2609a.j1(str, task);
            }
        });
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzack
    public final void zza(String str, Status status) {
        if (status == null) {
            l1();
        } else {
            i1(status);
        }
    }
}
