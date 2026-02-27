package w4;

import D.AbstractC0529l;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.AbstractActivityC1145e;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC1384q0;
import com.google.android.gms.common.api.internal.C1385r0;
import com.google.android.gms.common.api.internal.InterfaceC1369j;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import m4.AbstractC2227a;
import m4.AbstractC2228b;

/* JADX INFO: renamed from: w4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2920h extends C2921i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f51660c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f51658e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2920h f51659f = new C2920h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f51657d = C2921i.f51661a;

    public static C2920h q() {
        return f51659f;
    }

    public final boolean A(Context context, C2914b c2914b, int i9) {
        PendingIntent pendingIntentP;
        if (E4.b.a(context) || (pendingIntentP = p(context, c2914b)) == null) {
            return false;
        }
        x(context, c2914b.H(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentP, i9, true), zap.zaa | 134217728));
        return true;
    }

    @Override // w4.C2921i
    public Intent d(Context context, int i9, String str) {
        return super.d(context, i9, str);
    }

    @Override // w4.C2921i
    public PendingIntent e(Context context, int i9, int i10) {
        return super.e(context, i9, i10);
    }

    @Override // w4.C2921i
    public final String g(int i9) {
        return super.g(i9);
    }

    @Override // w4.C2921i
    public int i(Context context) {
        return super.i(context);
    }

    @Override // w4.C2921i
    public int j(Context context, int i9) {
        return super.j(context, i9);
    }

    @Override // w4.C2921i
    public final boolean m(int i9) {
        return super.m(i9);
    }

    public Dialog o(Activity activity, int i9, int i10, DialogInterface.OnCancelListener onCancelListener) {
        return t(activity, i9, com.google.android.gms.common.internal.G.b(activity, d(activity, i9, "d"), i10), onCancelListener, null);
    }

    public PendingIntent p(Context context, C2914b c2914b) {
        return c2914b.K() ? c2914b.J() : e(context, c2914b.H(), 0);
    }

    public boolean r(Activity activity, int i9, int i10, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogO = o(activity, i9, i10, onCancelListener);
        if (dialogO == null) {
            return false;
        }
        w(activity, dialogO, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void s(Context context, int i9) {
        x(context, i9, null, f(context, i9, 0, "n"));
    }

    public final Dialog t(Context context, int i9, com.google.android.gms.common.internal.G g9, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i9 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.D.c(context, i9));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = com.google.android.gms.common.internal.D.b(context, i9);
        DialogInterface.OnClickListener onClickListener2 = g9;
        if (strB != null) {
            if (g9 == null) {
                onClickListener2 = onClickListener;
            }
            builder.setPositiveButton(strB, onClickListener2);
        }
        String strF = com.google.android.gms.common.internal.D.f(context, i9);
        if (strF != null) {
            builder.setTitle(strF);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i9)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog u(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.D.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        w(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final C1385r0 v(Context context, AbstractC1384q0 abstractC1384q0) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C1385r0 c1385r0 = new C1385r0(abstractC1384q0);
        zao.zaa(context, c1385r0, intentFilter);
        c1385r0.a(context);
        if (l(context, "com.google.android.gms")) {
            return c1385r0;
        }
        abstractC1384q0.a();
        c1385r0.b();
        return null;
    }

    public final void w(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC1145e) {
                C2928p.A(dialog, onCancelListener).show(((AbstractActivityC1145e) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC2915c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void x(Context context, int i9, String str, PendingIntent pendingIntent) {
        int i10;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i9), null), new IllegalArgumentException());
        if (i9 == 18) {
            y(context);
            return;
        }
        if (pendingIntent == null) {
            if (i9 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = com.google.android.gms.common.internal.D.e(context, i9);
        String strD = com.google.android.gms.common.internal.D.d(context, i9);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) com.google.android.gms.common.internal.r.m(context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION));
        AbstractC0529l.e eVarF = new AbstractC0529l.e(context).w(true).h(true).n(strE).F(new AbstractC0529l.c().h(strD));
        if (C4.i.c(context)) {
            com.google.android.gms.common.internal.r.p(C4.m.e());
            eVarF.D(context.getApplicationInfo().icon).A(2);
            if (C4.i.d(context)) {
                eVarF.a(AbstractC2227a.f44388a, resources.getString(AbstractC2228b.f44403o), pendingIntent);
            } else {
                eVarF.l(pendingIntent);
            }
        } else {
            eVarF.D(R.drawable.stat_sys_warning).G(resources.getString(AbstractC2228b.f44396h)).J(System.currentTimeMillis()).l(pendingIntent).m(strD);
        }
        if (C4.m.i()) {
            com.google.android.gms.common.internal.r.p(C4.m.i());
            synchronized (f51658e) {
                str2 = this.f51660c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(AbstractC2228b.f44395g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(com.amplifyframework.storage.s3.service.b.a("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            eVarF.i(str2);
        }
        Notification notificationC = eVarF.c();
        if (i9 == 1 || i9 == 2 || i9 == 3) {
            AbstractC2925m.f51667b.set(false);
            i10 = 10436;
        } else {
            i10 = 39789;
        }
        notificationManager.notify(i10, notificationC);
    }

    public final void y(Context context) {
        new r(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean z(Activity activity, InterfaceC1369j interfaceC1369j, int i9, int i10, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogT = t(activity, i9, com.google.android.gms.common.internal.G.c(interfaceC1369j, d(activity, i9, "d"), 2), onCancelListener, null);
        if (dialogT == null) {
            return false;
        }
        w(activity, dialogT, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}
