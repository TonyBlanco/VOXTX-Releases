package com.nst.iptvsmarterstvbox.miscelleneious;

import a7.f;
import a7.g;
import a7.j;
import a7.k;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.a;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.SBPAnnouncementsActivity;
import com.nst.iptvsmarterstvbox.view.activity.LoginActivity;
import com.nst.iptvsmarterstvbox.view.activity.LoginActivityOneStream;
import com.nst.iptvsmarterstvbox.view.activity.LoginM3uActivity;
import com.nst.iptvsmarterstvbox.view.activity.MultiUserActivity;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.RoutingActivity;
import m7.AbstractC2237a;
import m7.w;
import u7.C2858a;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Activity f28672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f28673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static androidx.appcompat.app.a f28674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b f28675d;

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.miscelleneious.a$a, reason: collision with other inner class name */
    public class C0271a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (a.f28672a == activity) {
                Activity unused = a.f28672a = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Activity unused = a.f28672a = activity;
            if (a.f28675d != null) {
                a.f28675d.a(a.f28672a);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public interface b {
        void a(Activity activity);
    }

    public static class c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28676a;

        public c(View view) {
            this.f28676a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28676a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28676a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28676a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            if (z9) {
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
            }
        }
    }

    public static boolean c() {
        Activity activity = f28672a;
        if (activity != null) {
            return (activity instanceof LoginActivity) || (activity instanceof LoginM3uActivity) || (activity instanceof LoginActivityOneStream) || (activity instanceof MultiUserActivity) || (activity instanceof RoutingActivity) || AbstractC2237a.f44531p1;
        }
        return false;
    }

    public static void d() {
        Activity activity = f28672a;
        if (activity == null || !(activity instanceof NewDashboardActivity)) {
            return;
        }
        ((NewDashboardActivity) activity).V2(true, true);
    }

    public static /* synthetic */ void h(Activity activity, View view) {
        try {
            k(f28674c, activity);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static /* synthetic */ void i(Activity activity, View view) {
        SharepreferenceDBHandler.setRateUsCount(0, activity);
        if (activity instanceof NewDashboardActivity) {
            ((NewDashboardActivity) activity).U2();
        }
        f28674c.dismiss();
    }

    public static void j(Context context, Application application, b bVar) {
        f28675d = bVar;
        f28673b = context;
        application.registerActivityLifecycleCallbacks(new C0271a());
    }

    public static void k(androidx.appcompat.app.a aVar, Activity activity) {
        aVar.dismiss();
        activity.finishAffinity();
        Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(activity.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(335544320);
            activity.startActivity(launchIntentForPackage);
            Process.killProcess(Process.myPid());
        }
    }

    public static void l() {
        Activity activity = f28672a;
        if (activity != null) {
            if (activity instanceof NewDashboardActivity) {
                ((NewDashboardActivity) activity).W2();
            } else if (activity instanceof SBPAnnouncementsActivity) {
                ((SBPAnnouncementsActivity) activity).x1();
            }
        }
    }

    public static void m(final Activity activity, String str) {
        if (activity != null) {
            boolean z9 = activity instanceof NewDashboardActivity;
            boolean z10 = z9 ? !((NewDashboardActivity) activity).u2() : true;
            androidx.appcompat.app.a aVar = f28674c;
            if (aVar != null) {
                aVar.dismiss();
                f28674c = null;
            }
            if (!z10) {
                if (z9) {
                    ((NewDashboardActivity) activity).T2(true, str);
                    return;
                }
                return;
            }
            a.C0158a c0158a = new a.C0158a(activity, k.f13456a);
            View viewInflate = LayoutInflater.from(activity).inflate(g.f12665K2, (ViewGroup) null);
            Button button = (Button) viewInflate.findViewById(f.f12483o1);
            Button button2 = (Button) viewInflate.findViewById(f.f12382e1);
            if (!new C2858a(activity).A().equalsIgnoreCase(AbstractC2237a.f44453K0)) {
                button2.setFocusable(false);
                button2.setFocusableInTouchMode(false);
                button.setFocusable(false);
                button.setFocusableInTouchMode(false);
            }
            TextView textView = (TextView) viewInflate.findViewById(f.gm);
            if (str != null && str.length() > 0) {
                textView.setText(str.equalsIgnoreCase("firebase") ? j.f13273h6 : j.f13283i6);
            }
            button.setOnClickListener(new View.OnClickListener() { // from class: g7.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.nst.iptvsmarterstvbox.miscelleneious.a.h(activity, view);
                }
            });
            button2.setOnClickListener(new View.OnClickListener() { // from class: g7.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.nst.iptvsmarterstvbox.miscelleneious.a.i(activity, view);
                }
            });
            button.setOnFocusChangeListener(new c(button));
            button2.setOnFocusChangeListener(new c(button2));
            c0158a.setView(viewInflate);
            f28674c = c0158a.create();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(f28674c.getWindow().getAttributes());
            layoutParams.width = -2;
            layoutParams.height = -2;
            f28674c.show();
            f28674c.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            f28674c.getWindow().setAttributes(layoutParams);
            f28674c.setCancelable(false);
            if (activity.getCurrentFocus() != null) {
                activity.getCurrentFocus().clearFocus();
            }
            button.requestFocus();
        }
    }

    public static void n(String str) {
        if (c()) {
            return;
        }
        m(f28672a, str);
    }

    public static void o() {
        Activity activity = f28672a;
        if (activity != null) {
            w.z0(activity);
        }
    }

    public static void p() {
        Activity activity = f28672a;
        if (activity == null || !(activity instanceof NewDashboardActivity)) {
            return;
        }
        ((NewDashboardActivity) activity).X2();
    }
}
