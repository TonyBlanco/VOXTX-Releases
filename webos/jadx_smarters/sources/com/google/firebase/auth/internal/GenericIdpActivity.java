package com.google.firebase.auth.internal;

import A5.f;
import C4.a;
import C4.h;
import C4.j;
import H5.A;
import H5.AbstractC0622m;
import H5.P;
import H5.S;
import H5.V;
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
import com.amazonaws.mobile.client.internal.oauth2.OAuth2Constants;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001firebaseauthapi.zzaci;
import com.google.android.gms.internal.p001firebaseauthapi.zzacj;
import com.google.android.gms.internal.p001firebaseauthapi.zzack;
import com.google.android.gms.internal.p001firebaseauthapi.zzaed;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;
import com.google.android.gms.internal.p001firebaseauthapi.zzb;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import d.AbstractC1617D;
import j6.InterfaceC2102b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p.C2383d;
import p0.C2386a;
import y4.e;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public class GenericIdpActivity extends AbstractActivityC1145e implements zzack {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f27912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final S f27913d = S.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27914a = false;

    public static String i1(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(str, string);
                }
            }
        } catch (JSONException unused) {
            Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
        }
        return jSONObject.toString();
    }

    public final Uri.Builder h1(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String strJoin = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        String strI1 = i1(intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS"));
        String string = UUID.randomUUID().toString();
        String strZza = zzacj.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String str3 = strJoin;
        W.b().e(getApplicationContext(), str, string, strZza, action, stringExtra2, stringExtra3, stringExtra4);
        String strB = Y.a(getApplicationContext(), f.n(stringExtra4).q()).b();
        if (TextUtils.isEmpty(strB)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            j1(AbstractC0622m.a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (strZza == null) {
            return null;
        }
        builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", strZza).appendQueryParameter("eventId", string).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strB);
        if (!TextUtils.isEmpty(str3)) {
            builder.appendQueryParameter(OAuth2Constants.SCOPES, str3);
        }
        if (!TextUtils.isEmpty(strI1)) {
            builder.appendQueryParameter("customParameters", strI1);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }

    public final void j1(Status status) {
        f27912c = 0L;
        this.f27914a = false;
        Intent intent = new Intent();
        P.b(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (k1(intent)) {
            f27913d.a(this);
        } else {
            A.b(getApplicationContext(), status);
        }
        finish();
    }

    public final boolean k1(Intent intent) {
        return C2386a.b(this).d(intent);
    }

    public final void l1() {
        f27912c = 0L;
        this.f27914a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (k1(intent)) {
            f27913d.a(this);
        } else {
            A.b(this, AbstractC0622m.a("WEB_CONTEXT_CANCELED"));
        }
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
            l1();
            return;
        }
        long jA = h.c().a();
        if (jA - f27912c < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f27912c = jA;
        if (bundle != null) {
            this.f27914a = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
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
            if (this.f27914a) {
                l1();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = j.b(a.a(this, packageName)).toLowerCase(Locale.US);
                f fVarN = f.n(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(fVarN);
                if (zzaed.zza(fVarN)) {
                    zza(h1(Uri.parse(zzaed.zza(fVarN.p().b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.B());
                } else {
                    new zzaci(packageName, lowerCase, getIntent(), fVarN, this).executeOnExecutor(firebaseAuth.D(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e9) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e9));
                zzacj.zzb(this, packageName);
            }
            this.f27914a = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            j1(P.a(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            l1();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        V vA = W.b().a(this, packageName2, stringExtra2);
        if (vA == null) {
            l1();
        }
        if (booleanExtra) {
            stringExtra = Y.a(getApplicationContext(), f.n(vA.a()).q()).c(stringExtra);
        }
        zzagt zzagtVar = new zzagt(vA, stringExtra);
        String strE = vA.e();
        String strB = vA.b();
        zzagtVar.zzb(strE);
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(strB) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(strB) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(strB)) {
            Log.e("GenericIdpActivity", "unsupported operation: " + strB);
            l1();
            return;
        }
        f27912c = 0L;
        this.f27914a = false;
        Intent intent2 = new Intent();
        e.d(zzagtVar, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", strB);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (k1(intent2)) {
            f27913d.a(this);
        } else {
            A.c(getApplicationContext(), zzagtVar, strB, strE);
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f27914a);
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
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzack
    public final void zza(Uri uri, final String str, InterfaceC2102b interfaceC2102b) {
        AbstractC1617D.a(interfaceC2102b.get());
        Tasks.forResult(uri).addOnCompleteListener(new OnCompleteListener() { // from class: H5.u
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                GenericIdpActivity genericIdpActivity = this.f2715a;
                String str2 = str;
                if (genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
                    Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    zzacj.zzb(genericIdpActivity, str2);
                    return;
                }
                List<ResolveInfo> listQueryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
                    C2383d c2383dA = new C2383d.a().a();
                    Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
                    c2383dA.a(genericIdpActivity, (Uri) task.getResult());
                } else {
                    Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                    intent.putExtra("com.android.browser.application_id", str2);
                    Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                    intent.addFlags(1073741824);
                    intent.addFlags(268435456);
                    genericIdpActivity.startActivity(intent);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzack
    public final void zza(String str, Status status) {
        if (status == null) {
            l1();
        } else {
            j1(status);
        }
    }
}
