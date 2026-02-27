package com.onesignal;

import android.content.Context;
import com.onesignal.F1;
import com.onesignal.Y1;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a2 implements Y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f38658d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f38659e = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y1.a f38660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f38661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38662c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38663a;

        public a(String str) {
            this.f38663a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i9 = 0;
            while (i9 < a2.f38658d && !a2.this.e(this.f38663a, i9)) {
                i9++;
                OSUtils.V(a2.f38659e * i9);
            }
        }
    }

    public static int j(Throwable th) {
        String strL = OSUtils.l(th);
        if (!(th instanceof IOException)) {
            return -12;
        }
        if ("SERVICE_NOT_AVAILABLE".equals(strL)) {
            return -9;
        }
        return "AUTHENTICATION_FAILED".equals(strL) ? -29 : -11;
    }

    @Override // com.onesignal.Y1
    public void a(Context context, String str, Y1.a aVar) {
        this.f38660a = aVar;
        if (i(str, aVar)) {
            h(str);
        }
    }

    public final boolean e(String str, int i9) {
        try {
            String strG = g(str);
            F1.a(F1.v.INFO, "Device registered, push token = " + strG);
            this.f38660a.a(strG, 1);
            return true;
        } catch (IOException e9) {
            int iJ = j(e9);
            String strL = OSUtils.l(e9);
            if (!"SERVICE_NOT_AVAILABLE".equals(strL) && !"AUTHENTICATION_FAILED".equals(strL)) {
                Exception exc = new Exception(e9);
                F1.b(F1.v.ERROR, "Error Getting " + f() + " Token", exc);
                if (!this.f38662c) {
                    this.f38660a.a(null, iJ);
                }
                return true;
            }
            Exception exc2 = new Exception(e9);
            if (i9 >= f38658d - 1) {
                F1.b(F1.v.ERROR, "Retry count of " + f38658d + " exceed! Could not get a " + f() + " Token.", exc2);
                return false;
            }
            F1.b(F1.v.INFO, "'Google Play services' returned " + strL + " error. Current retry count: " + i9, exc2);
            if (i9 != 2) {
                return false;
            }
            this.f38660a.a(null, iJ);
            this.f38662c = true;
            return true;
        } catch (Throwable th) {
            Exception exc3 = new Exception(th);
            int iJ2 = j(th);
            F1.b(F1.v.ERROR, "Unknown error getting " + f() + " Token", exc3);
            this.f38660a.a(null, iJ2);
            return true;
        }
    }

    public abstract String f();

    public abstract String g(String str);

    public final void h(String str) {
        try {
            if (OSUtils.D()) {
                k(str);
            } else {
                C.d();
                F1.a(F1.v.ERROR, "'Google Play services' app not installed or disabled on the device.");
                this.f38660a.a(null, -7);
            }
        } catch (Throwable th) {
            F1.b(F1.v.ERROR, "Could not register with " + f() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
            this.f38660a.a(null, -8);
        }
    }

    public final boolean i(String str, Y1.a aVar) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (Throwable unused) {
            F1.a(F1.v.ERROR, "Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.");
            aVar.a(null, -6);
            return false;
        }
    }

    public final synchronized void k(String str) {
        Thread thread = this.f38661b;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new a(str));
            this.f38661b = thread2;
            thread2.start();
        }
    }
}
