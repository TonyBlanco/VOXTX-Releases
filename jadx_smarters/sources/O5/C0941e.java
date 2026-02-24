package O5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: O5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0941e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f6562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6563b;

    public C0941e(Float f9, boolean z9) {
        this.f6563b = z9;
        this.f6562a = f9;
    }

    public static C0941e a(Context context) {
        boolean zE = false;
        Float fD = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zE = e(intentRegisterReceiver);
                fD = d(intentRegisterReceiver);
            }
        } catch (IllegalStateException e9) {
            L5.f.f().e("An error occurred getting battery state.", e9);
        }
        return new C0941e(fD, zE);
    }

    public static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    public static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f6562a;
    }

    public int c() {
        Float f9;
        if (!this.f6563b || (f9 = this.f6562a) == null) {
            return 1;
        }
        return ((double) f9.floatValue()) < 0.99d ? 2 : 3;
    }
}
