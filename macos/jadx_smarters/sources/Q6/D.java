package q6;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h6.j;
import j6.InterfaceC2102b;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import v4.C2879c;

/* JADX INFO: loaded from: classes3.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A5.f f46949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f46950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2879c f46951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2102b f46952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2102b f46953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k6.h f46954f;

    public D(A5.f fVar, I i9, InterfaceC2102b interfaceC2102b, InterfaceC2102b interfaceC2102b2, k6.h hVar) {
        this(fVar, i9, new C2879c(fVar.l()), interfaceC2102b, interfaceC2102b2, hVar);
    }

    public D(A5.f fVar, I i9, C2879c c2879c, InterfaceC2102b interfaceC2102b, InterfaceC2102b interfaceC2102b2, k6.h hVar) {
        this.f46949a = fVar;
        this.f46950b = i9;
        this.f46951c = c2879c;
        this.f46952d = interfaceC2102b;
        this.f46953e = interfaceC2102b2;
        this.f46954f = hVar;
    }

    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean f(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    public final Task b(Task task) {
        return task.continueWith(new Executor() { // from class: q6.C
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new Continuation() { // from class: q6.B
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return this.f46947a.g(task2);
            }
        });
    }

    public final String c() {
        try {
            return a(MessageDigest.getInstance(MessageDigestAlgorithms.SHA_1).digest(this.f46949a.o().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public Task d() {
        return b(i(I.c(this.f46949a), "*", new Bundle()));
    }

    public final String e(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        String string4 = bundle.toString();
        Log.w("FirebaseMessaging", "Unexpected response: ".concat(string4), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public /* synthetic */ String g(Task task) {
        return e((Bundle) task.getResult(IOException.class));
    }

    public final void h(String str, String str2, Bundle bundle) {
        j.a aVarB;
        bundle.putString(ClientConstants.DOMAIN_QUERY_PARAM_SCOPES, str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f46949a.p().c());
        bundle.putString("gmsv", Integer.toString(this.f46950b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f46950b.a());
        bundle.putString("app_ver_name", this.f46950b.b());
        bundle.putString("firebase-app-name-hash", c());
        try {
            String strB = ((k6.m) Tasks.await(this.f46954f.a(false))).b();
            if (TextUtils.isEmpty(strB)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strB);
            }
        } catch (InterruptedException e9) {
            e = e9;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) Tasks.await(this.f46954f.getId()));
        bundle.putString("cliv", "fcm-23.0.0");
        h6.j jVar = (h6.j) this.f46953e.get();
        s6.i iVar = (s6.i) this.f46952d.get();
        if (jVar == null || iVar == null || (aVarB = jVar.b("fire-iid")) == j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarB.getCode()));
        bundle.putString("Firebase-Client", iVar.a());
    }

    public final Task i(String str, String str2, Bundle bundle) {
        try {
            h(str, str2, bundle);
            return this.f46951c.a(bundle);
        } catch (InterruptedException | ExecutionException e9) {
            return Tasks.forException(e9);
        }
    }

    public Task j(String str, String str2) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str2);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        String strValueOf2 = String.valueOf(str2);
        return b(i(str, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle));
    }

    public Task k(String str, String str2) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str2);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String strValueOf2 = String.valueOf(str2);
        return b(i(str, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle));
    }
}
