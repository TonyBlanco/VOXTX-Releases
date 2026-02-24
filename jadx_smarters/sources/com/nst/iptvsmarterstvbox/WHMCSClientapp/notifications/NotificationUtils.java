package com.nst.iptvsmarterstvbox.WHMCSClientapp.notifications;

import D.AbstractC0529l;
import Q0.m;
import Q0.u;
import a7.g;
import a7.i;
import a7.j;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.facebook.ads.AdError;
import com.nst.iptvsmarterstvbox.miscelleneious.ApiWorkerCombinedRequest;
import com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.NotificationPanelActivtiy;
import com.nst.iptvsmarterstvbox.view.activity.SplashActivity;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.achartengine.ChartFactory;

/* JADX INFO: loaded from: classes.dex */
public class NotificationUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f28604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f28605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f28606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ConstraintLayout f28607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f28608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CountDownTimer f28609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f28610g = 10000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f28611h = 1000;

    public class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28619a;

        public OnFocusChangeAccountListener(View view) {
            this.f28619a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28619a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28619a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28619a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                b(1.15f);
                c(1.15f);
            } else {
                if (z9) {
                    return;
                }
                b(1.0f);
                c(1.0f);
                a(z9);
            }
        }
    }

    public NotificationUtils(Context context) {
        this.f28604a = context;
    }

    public static boolean i(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        PackageManager packageManager = context.getPackageManager();
        return (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback");
    }

    public Bitmap h(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        } catch (IOException e9) {
            e9.printStackTrace();
            return null;
        }
    }

    public final /* synthetic */ void j(WindowManager windowManager, View view) {
        n(this.f28607d, windowManager, this.f28608e);
    }

    public final /* synthetic */ void k(WindowManager windowManager, String str, String str2, String str3, String str4, View view) {
        Context context;
        Intent intentPutExtra;
        n(this.f28607d, windowManager, this.f28608e);
        if (str.equals("App Ready")) {
            context = this.f28604a;
            intentPutExtra = new Intent(this.f28604a, (Class<?>) SplashActivity.class).setFlags(268435456);
        } else {
            context = this.f28604a;
            intentPutExtra = new Intent(this.f28604a, (Class<?>) NotificationPanelActivtiy.class).setFlags(268435456).putExtra(ChartFactory.TITLE, str).putExtra("body", str2).putExtra("image", str3).putExtra("custombody", str4);
        }
        context.startActivity(intentPutExtra);
    }

    public final /* synthetic */ void l(final String str, final String str2, final String str3, final String str4) {
        try {
            final WindowManager windowManager = (WindowManager) this.f28604a.getSystemService("window");
            WindowManager.LayoutParams layoutParams = Build.VERSION.SDK_INT >= 26 ? new WindowManager.LayoutParams(-2, -2, 2038, 131104, -2) : new WindowManager.LayoutParams(-2, -2, AdError.CACHE_ERROR_CODE, 131104, -2);
            layoutParams.gravity = 8388661;
            layoutParams.x = 0;
            layoutParams.y = 100;
            View viewInflate = LayoutInflater.from(this.f28604a).inflate(g.f12856p3, new LinearLayout(this.f28604a) { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.notifications.NotificationUtils.1
                @Override // android.view.ViewGroup, android.view.View
                public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                    if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                        return super.dispatchKeyEvent(keyEvent);
                    }
                    NotificationUtils notificationUtils = NotificationUtils.this;
                    notificationUtils.n(notificationUtils.f28607d, windowManager, NotificationUtils.this.f28608e);
                    return true;
                }
            });
            this.f28608e = viewInflate;
            this.f28607d = (ConstraintLayout) viewInflate.findViewById(a7.f.Bf);
            TextView textView = (TextView) this.f28608e.findViewById(a7.f.fm);
            TextView textView2 = (TextView) this.f28608e.findViewById(a7.f.ck);
            this.f28605b = (TextView) this.f28608e.findViewById(a7.f.f12422i1);
            this.f28606c = (TextView) this.f28608e.findViewById(a7.f.f12322Y0);
            this.f28605b.setFocusable(true);
            this.f28606c.setFocusable(true);
            textView.setText(str);
            textView2.setText(str2);
            if (str.equals("App Ready")) {
                this.f28605b.setText("Open App");
            }
            TextView textView3 = this.f28605b;
            textView3.setOnFocusChangeListener(new OnFocusChangeAccountListener(textView3));
            TextView textView4 = this.f28606c;
            textView4.setOnFocusChangeListener(new OnFocusChangeAccountListener(textView4));
            this.f28606c.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.notifications.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f28626a.j(windowManager, view);
                }
            });
            this.f28605b.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.notifications.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f28628a.k(windowManager, str, str2, str3, str4, view);
                }
            });
            windowManager.addView(this.f28608e, layoutParams);
            this.f28605b.requestFocus();
            o(this.f28607d, windowManager, this.f28608e);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public void m() {
        try {
            RingtoneManager.getRingtone(this.f28604a, RingtoneManager.getDefaultUri(2)).play();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void n(ConstraintLayout constraintLayout, WindowManager windowManager, View view) {
        try {
            CountDownTimer countDownTimer = this.f28609f;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.f28609f = null;
            }
            if (view != null) {
                windowManager.removeViewImmediate(view);
                windowManager.removeView(view);
            }
        } catch (Exception unused) {
        }
    }

    public final void o(final ConstraintLayout constraintLayout, final WindowManager windowManager, final View view) {
        try {
            this.f28609f = new CountDownTimer(this.f28610g, this.f28611h) { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.notifications.NotificationUtils.2
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    try {
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(constraintLayout, "alpha", 1.0f, 0.0f);
                        objectAnimatorOfFloat.setDuration(500L);
                        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.notifications.NotificationUtils.2.1
                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationCancel(Animator animator) {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                NotificationUtils.this.n(constraintLayout, windowManager, view);
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                NotificationUtils.this.n(constraintLayout, windowManager, view);
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationRepeat(Animator animator) {
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationStart(Animator animator) {
                            }
                        });
                        objectAnimatorOfFloat.start();
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j9) {
                    try {
                        if (NotificationUtils.this.f28609f == null) {
                            cancel();
                        }
                    } catch (Exception unused) {
                    }
                }
            }.start();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void p(Bitmap bitmap, AbstractC0529l.e eVar, int i9, String str, String str2, String str3, PendingIntent pendingIntent, Uri uri) {
        Notification notificationC;
        new AbstractC0529l.b();
        NotificationManager notificationManager = (NotificationManager) this.f28604a.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        AbstractC0529l.e eVar2 = new AbstractC0529l.e(this.f28604a);
        if (Build.VERSION.SDK_INT >= 26) {
            new AbstractC0529l.g().h(str2);
            com.amplifyframework.storage.s3.service.c.a();
            NotificationChannel notificationChannelA = com.amplifyframework.storage.s3.service.b.a("ksjadf87", this.f28604a.getResources().getString(j.f13184Y5), 2);
            notificationC = new Notification.Builder(this.f28604a).setContentTitle(str).setContentText(str2).setAutoCancel(true).setSound(uri).setContentIntent(pendingIntent).setSmallIcon(i.f12942a).setLargeIcon(bitmap).setStyle(new Notification.BigPictureStyle().bigPicture(bitmap)).setChannelId("ksjadf87").build();
            if (notificationManager == null) {
                return;
            } else {
                notificationManager.createNotificationChannel(notificationChannelA);
            }
        } else {
            AbstractC0529l.g gVar = new AbstractC0529l.g();
            gVar.h(str2);
            eVar2.n(str).m(str2).h(true).E(uri).F(gVar).l(pendingIntent).D(i.f12942a);
            notificationC = eVar2.c();
        }
        notificationManager.notify(234231, notificationC);
    }

    public void q(String str, String str2, String str3, Intent intent, String str4, String str5) {
        NotificationUtils notificationUtils;
        AbstractC0529l.e eVar;
        int i9;
        String str6;
        String str7;
        String str8;
        PendingIntent pendingIntent;
        Intent intent2 = intent;
        Log.e("Result<<<>>>", "From:");
        if (str != null && str.length() != 0 && (str.equalsIgnoreCase("8333whmcssmarters156168514") || str.equalsIgnoreCase("This app has been updated in the background."))) {
            u.f(this.f28604a).d("uniqueWorkName6", Q0.d.REPLACE, (m) new m.a(ApiWorkerCombinedRequest.class).b());
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String strValueOf = Build.VERSION.SDK_INT >= 24 ? String.valueOf(Html.fromHtml(str2, 0)) : "";
        Log.e("Result<<<>>>", "From: " + str);
        int i10 = i.f12942a;
        intent2.setFlags(603979776);
        AbstractC0529l.e eVar2 = new AbstractC0529l.e(this.f28604a);
        Uri uri = Uri.parse("android.resource://" + this.f28604a.getPackageName() + "/raw/notification");
        if (TextUtils.isEmpty(str4)) {
            Log.e("jaskirat", "notification else clause");
            if (i(this.f28604a)) {
                r(str, str2, str5, str4);
            } else if (this.f28604a != null) {
                if (str.equals("App Ready")) {
                    intent2 = new Intent(this.f28604a, (Class<?>) SplashActivity.class);
                }
                intent2.putExtra("fromNotification", "fromNotification");
                intent2.setFlags(335544320);
                intent2.setAction("notification_action");
                intent2.putExtra(ChartFactory.TITLE, str);
                intent2.putExtra("body", str2);
                intent2.putExtra("custombody", str5);
                PendingIntent activity = PendingIntent.getActivity(this.f28604a, 0, intent2, 201326592);
                notificationUtils = this;
                eVar = eVar2;
                i9 = i10;
                str6 = str;
                str7 = strValueOf;
                str8 = str3;
                pendingIntent = activity;
                notificationUtils.s(eVar, i9, str6, str7, str8, pendingIntent, uri);
            }
        } else if (str4 != null && str4.length() > 4 && Patterns.WEB_URL.matcher(str4).matches()) {
            intent2.putExtra(ChartFactory.TITLE, str);
            intent2.putExtra("body", str2);
            intent2.putExtra("image", str4);
            intent2.putExtra("custombody", str5);
            PendingIntent activity2 = PendingIntent.getActivity(this.f28604a, 0, intent2, 201326592);
            Bitmap bitmapH = h(str4);
            if (bitmapH == null) {
                intent2.putExtra(ChartFactory.TITLE, str);
                intent2.putExtra("body", str2);
                intent2.putExtra("image", str4);
                intent2.putExtra("custombody", str5);
                if (!i(this.f28604a)) {
                    notificationUtils = this;
                    eVar = eVar2;
                    i9 = i10;
                    str6 = str;
                    str7 = strValueOf;
                    str8 = str3;
                    pendingIntent = activity2;
                    notificationUtils.s(eVar, i9, str6, str7, str8, pendingIntent, uri);
                }
            } else if (!i(this.f28604a)) {
                p(bitmapH, eVar2, i10, str, strValueOf, str3, activity2, uri);
            }
            r(str, str2, str5, str4);
        }
        m();
    }

    public final void r(final String str, final String str2, final String str3, final String str4) {
        if (Build.VERSION.SDK_INT < 23 || !Settings.canDrawOverlays(this.f28604a)) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.notifications.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f28621a.l(str, str2, str4, str3);
            }
        });
    }

    public final void s(AbstractC0529l.e eVar, int i9, String str, String str2, String str3, PendingIntent pendingIntent, Uri uri) {
        NotificationManager notificationManager = (NotificationManager) this.f28604a.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        AbstractC0529l.e eVar2 = new AbstractC0529l.e(this.f28604a);
        if (Build.VERSION.SDK_INT < 26) {
            AbstractC0529l.g gVar = new AbstractC0529l.g();
            gVar.h(str2);
            eVar2.n(str).m(str2).h(true).E(uri).F(gVar).l(pendingIntent).D(i.f12942a);
            notificationManager.notify(234231, eVar2.c());
            return;
        }
        new AbstractC0529l.g().h(str2);
        com.amplifyframework.storage.s3.service.c.a();
        NotificationChannel notificationChannelA = com.amplifyframework.storage.s3.service.b.a("ksjadf87", this.f28604a.getResources().getString(j.f13184Y5), 2);
        Notification notificationBuild = new Notification.Builder(this.f28604a).setContentTitle(str).setContentText(str2).setAutoCancel(true).setSound(uri).setContentIntent(pendingIntent).setSmallIcon(i.f12942a).setChannelId("ksjadf87").build();
        notificationManager.createNotificationChannel(notificationChannelA);
        notificationManager.notify(234231, notificationBuild);
    }
}
