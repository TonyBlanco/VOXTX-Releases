package H5;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;
import com.google.android.gms.internal.p001firebaseauthapi.zzap;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public final class A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzap f2604d = zzap.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final A f2605e = new A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Task f2606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Task f2607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2608c = 0;

    public static void b(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.I());
        editorEdit.putString("statusMessage", status.J());
        editorEdit.putLong("timestamp", C4.h.c().a());
        editorEdit.commit();
    }

    public static void c(Context context, zzagt zzagtVar, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("verifyAssertionRequest", y4.e.e(zzagtVar));
        editorEdit.putString("operation", str);
        editorEdit.putString("tenantId", str2);
        editorEdit.putLong("timestamp", C4.h.c().a());
        editorEdit.commit();
    }

    public static void d(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("recaptchaToken", str);
        editorEdit.putString("operation", str2);
        editorEdit.putLong("timestamp", C4.h.c().a());
        editorEdit.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        zzap zzapVar = f2604d;
        int size = zzapVar.size();
        int i9 = 0;
        while (i9 < size) {
            E e9 = zzapVar.get(i9);
            i9++;
            editorEdit.remove((String) e9);
        }
        editorEdit.commit();
    }

    public static A g() {
        return f2605e;
    }

    public final void a(Context context) {
        com.google.android.gms.common.internal.r.m(context);
        e(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f2606a = null;
        this.f2608c = 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.google.firebase.auth.FirebaseAuth r12) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.A.f(com.google.firebase.auth.FirebaseAuth):void");
    }
}
