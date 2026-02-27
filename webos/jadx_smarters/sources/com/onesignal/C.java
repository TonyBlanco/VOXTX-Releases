package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import org.apache.http.protocol.HTTP;
import w4.C2920h;

/* JADX INFO: loaded from: classes4.dex */
public abstract class C {

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.onesignal.C$a$a, reason: collision with other inner class name */
        public class DialogInterfaceOnClickListenerC0298a implements DialogInterface.OnClickListener {
            public DialogInterfaceOnClickListenerC0298a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i9) {
                R1.j(R1.f38511a, "GT_DO_NOT_SHOW_MISSING_GPS", true);
            }
        }

        public class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Activity f38172a;

            public b(Activity activity) {
                this.f38172a = activity;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i9) {
                C.a(this.f38172a);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity activityP = F1.P();
            if (activityP == null) {
                return;
            }
            String strK = OSUtils.k(activityP, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
            String strK2 = OSUtils.k(activityP, "onesignal_gms_missing_alert_button_update", "Update");
            String strK3 = OSUtils.k(activityP, "onesignal_gms_missing_alert_button_skip", "Skip");
            new AlertDialog.Builder(activityP).setMessage(strK).setPositiveButton(strK2, new b(activityP)).setNegativeButton(strK3, new DialogInterfaceOnClickListenerC0298a()).setNeutralButton(OSUtils.k(activityP, "onesignal_gms_missing_alert_button_close", HTTP.CONN_CLOSE), (DialogInterface.OnClickListener) null).create().show();
        }
    }

    public static void a(Activity activity) {
        try {
            C2920h c2920hQ = C2920h.q();
            PendingIntent pendingIntentE = c2920hQ.e(activity, c2920hQ.i(F1.f38270b), 9000);
            if (pendingIntentE != null) {
                pendingIntentE.send();
            }
        } catch (PendingIntent.CanceledException e9) {
            e9.printStackTrace();
        }
    }

    public static boolean c() {
        A a9 = X1.f38626a.a(F1.f38270b, "com.google.android.gms", 128);
        if (!a9.b() || a9.a() == null) {
            return false;
        }
        return !((String) a9.a().applicationInfo.loadLabel(F1.f38270b.getPackageManager())).equals("Market");
    }

    public static void d() {
        if (OSUtils.B() && c() && !F1.W() && !R1.b(R1.f38511a, "GT_DO_NOT_SHOW_MISSING_GPS", false)) {
            OSUtils.S(new a());
        }
    }
}
