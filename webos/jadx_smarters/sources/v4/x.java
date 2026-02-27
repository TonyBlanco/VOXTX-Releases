package v4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f51383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51385c = 0;

    public x(Context context) {
        this.f51383a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfoE;
        if (this.f51384b == 0) {
            try {
                packageInfoE = E4.e.a(this.f51383a).e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e9) {
                String strValueOf = String.valueOf(e9);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
                sb.append("Failed to find package ");
                sb.append(strValueOf);
                Log.w("Metadata", sb.toString());
                packageInfoE = null;
            }
            if (packageInfoE != null) {
                this.f51384b = packageInfoE.versionCode;
            }
        }
        return this.f51384b;
    }

    public final synchronized int b() {
        int i9 = this.f51385c;
        if (i9 != 0) {
            return i9;
        }
        PackageManager packageManager = this.f51383a.getPackageManager();
        if (E4.e.a(this.f51383a).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i10 = 1;
        if (!C4.m.i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f51385c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f51385c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (C4.m.i()) {
            this.f51385c = 2;
            i10 = 2;
        } else {
            this.f51385c = 1;
        }
        return i10;
    }
}
