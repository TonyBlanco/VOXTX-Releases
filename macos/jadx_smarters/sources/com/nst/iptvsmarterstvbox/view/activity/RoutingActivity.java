package com.nst.iptvsmarterstvbox.view.activity;

import D.AbstractC0519b;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import b.C1192b;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import g7.C1839a;
import j$.util.Objects;
import java.util.Map;
import m7.AbstractC2237a;
import m7.w;
import org.apache.http.HttpHost;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class RoutingActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static C2858a f31531P;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TextView f31532A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ImageView f31533B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public RelativeLayout f31534C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ImageView f31535D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f31536E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ImageView f31537F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Dialog f31539H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f31540I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public RelativeLayout f31541J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public RelativeLayout f31542K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public RelativeLayout f31543L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public TextView f31544M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public androidx.appcompat.app.a f31545N;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelativeLayout f31547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f31548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f31549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f31550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RelativeLayout f31551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f31552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f31553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f31554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RelativeLayout f31555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f31556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f31557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f31558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RelativeLayout f31559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f31560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f31561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ImageView f31562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RelativeLayout f31563t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f31564u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f31565v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ImageView f31566w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f31567x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RelativeLayout f31568y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f31569z;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Context f31538G = this;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final androidx.activity.result.c f31546O = registerForActivityResult(new C1192b(), new androidx.activity.result.b() { // from class: p7.p0
        @Override // androidx.activity.result.b
        public final void a(Object obj) {
            this.f46663a.K1((Map) obj);
        }
    });

    public class a implements TextView.OnEditorActionListener {
        public a() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
            if (i9 != 6) {
                return false;
            }
            ((InputMethodManager) textView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
            return true;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://www.iptvsmarters.com/terms-and-conditions/"));
                RoutingActivity.this.startActivity(intent);
            } catch (Exception unused) {
                Toast.makeText(RoutingActivity.this.getApplicationContext(), "Your Device Not Supported !!", 1).show();
            }
        }
    }

    public class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            RoutingActivity.this.f31541J.setVisibility(0);
            RoutingActivity.this.f31542K.setVisibility(0);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        @SuppressLint({"ApplySharedPref"})
        public void onClick(View view) {
            RoutingActivity.this.getSharedPreferences("Accept_clicked", 0).edit().putString("Accept_clicked", "true").apply();
            RoutingActivity.this.f31539H.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        @SuppressLint({"ApplySharedPref"})
        public void onClick(View view) {
            RoutingActivity.this.finishAffinity();
        }
    }

    public class f implements DialogInterface.OnDismissListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class g implements C1839a.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f31576a;

        public g(String[] strArr) {
            this.f31576a = strArr;
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", RoutingActivity.this.getPackageName(), null));
                RoutingActivity.this.startActivityForResult(intent, 101);
                Toast.makeText(RoutingActivity.this.f31538G, RoutingActivity.this.f31538G.getResources().getString(a7.j.f13339o2), 1).show();
            } catch (Exception unused) {
            }
            RoutingActivity.this.f31545N.dismiss();
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RoutingActivity.this.f31545N.dismiss();
        }
    }

    public class j implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ EditText f31580a;

        public j(EditText editText) {
            this.f31580a = editText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context applicationContext;
            Resources resources;
            int i9;
            Intent intent;
            String strTrim = this.f31580a.getText().toString().trim();
            String strSubstring = strTrim.substring(strTrim.lastIndexOf("/") + 1);
            if (TextUtils.isEmpty(strTrim)) {
                applicationContext = RoutingActivity.this.getApplicationContext();
                resources = RoutingActivity.this.getResources();
                i9 = a7.j.f13362q5;
            } else if (!strTrim.contains(ClientConstants.DOMAIN_SCHEME) && (!strTrim.contains(HttpHost.DEFAULT_SCHEME_NAME) || !strTrim.contains("//") || !strTrim.contains(InstructionFileId.DOT) || !strTrim.contains("/") || !strTrim.contains(":") || !strSubstring.contains(InstructionFileId.DOT))) {
                applicationContext = RoutingActivity.this.getApplicationContext();
                resources = RoutingActivity.this.getResources();
                i9 = a7.j.f13332n5;
            } else {
                if (!strTrim.endsWith(".com") && (strTrim.startsWith(ClientConstants.DOMAIN_SCHEME) || strTrim.startsWith(HttpHost.DEFAULT_SCHEME_NAME))) {
                    if (RoutingActivity.this.f31538G != null) {
                        C2858a unused = RoutingActivity.f31531P = new C2858a(RoutingActivity.this.f31538G);
                        if (RoutingActivity.f31531P.x() == 3) {
                            RoutingActivity.f31531P.U(RoutingActivity.this.f31538G.getResources().getString(a7.j.f13349p2));
                            intent = new Intent(RoutingActivity.this.f31538G, (Class<?>) HoneyPlayer.class);
                        } else {
                            intent = new Intent(RoutingActivity.this.f31538G, (Class<?>) HoneyPlayer.class);
                        }
                        intent.putExtra("type", "loadurl");
                        intent.putExtra("VIDEO_NUM", 0);
                        intent.putExtra("VIDEO_PATH", strTrim);
                        RoutingActivity.this.f31538G.startActivity(intent);
                        return;
                    }
                    return;
                }
                applicationContext = RoutingActivity.this.getApplicationContext();
                resources = RoutingActivity.this.getResources();
                i9 = a7.j.f13207b0;
            }
            Toast.makeText(applicationContext, resources.getString(i9), 1).show();
        }
    }

    public class k implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31582a;

        public k(View view) {
            this.f31582a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31582a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31582a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31582a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            RelativeLayout relativeLayout;
            int i9;
            ImageView imageView;
            int i10;
            RelativeLayout relativeLayout2;
            ImageView imageView2;
            int i11;
            if (!z9) {
                if (z9) {
                    return;
                }
                float f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                View view2 = this.f31582a;
                if (view2 == null || view2.getTag() == null || !this.f31582a.getTag().equals("rl_login_with_m3u")) {
                    View view3 = this.f31582a;
                    if (view3 == null || view3.getTag() == null || !this.f31582a.getTag().equals("rl_login_with_xtream_codes_api")) {
                        View view4 = this.f31582a;
                        if (view4 == null || view4.getTag() == null || !this.f31582a.getTag().equals("rl_play_onestream")) {
                            View view5 = this.f31582a;
                            if (view5 == null || view5.getTag() == null || !this.f31582a.getTag().equals("rl_login_with_stalker")) {
                                View view6 = this.f31582a;
                                if (view6 == null || view6.getTag() == null || !this.f31582a.getTag().equals("rl_play_from_device")) {
                                    View view7 = this.f31582a;
                                    if (view7 == null || view7.getTag() == null || !this.f31582a.getTag().equals("rl_play_single_stream")) {
                                        View view8 = this.f31582a;
                                        if (view8 != null && view8.getTag() != null && this.f31582a.getTag().equals("rl_list_users")) {
                                            RoutingActivity.this.f31563t.setBackgroundResource(a7.e.f11980Z0);
                                            RoutingActivity routingActivity = RoutingActivity.this;
                                            routingActivity.f31565v.setTextColor(routingActivity.f31538G.getResources().getColor(a7.c.f11855f));
                                            imageView2 = RoutingActivity.this.f31566w;
                                            i11 = a7.e.f12076x1;
                                            imageView2.setImageResource(i11);
                                            return;
                                        }
                                        View view9 = this.f31582a;
                                        if (view9 == null || view9.getTag() == null || !this.f31582a.getTag().equals("rl_accept")) {
                                            View view10 = this.f31582a;
                                            if (view10 == null || view10.getTag() == null || !this.f31582a.getTag().equals("rl_cancel")) {
                                                View view11 = this.f31582a;
                                                if (view11 == null || view11.getTag() == null || !this.f31582a.getTag().equals("rl_play")) {
                                                    return;
                                                }
                                                RoutingActivity.this.f31543L.setBackgroundResource(a7.e.f11996d1);
                                                RoutingActivity.this.f31544M.setTextColor(RoutingActivity.this.f31538G.getResources().getColor(a7.c.f11855f));
                                                return;
                                            }
                                            relativeLayout2 = RoutingActivity.this.f31542K;
                                        } else {
                                            relativeLayout2 = RoutingActivity.this.f31541J;
                                        }
                                        relativeLayout2.setBackgroundResource(a7.e.f12038o);
                                        return;
                                    }
                                    RoutingActivity.this.f31559p.setBackgroundResource(a7.e.f11913G);
                                    RoutingActivity routingActivity2 = RoutingActivity.this;
                                    routingActivity2.f31561r.setTextColor(routingActivity2.f31538G.getResources().getColor(a7.c.f11855f));
                                    imageView2 = RoutingActivity.this.f31562s;
                                } else {
                                    RoutingActivity.this.f31555l.setBackgroundResource(a7.e.f11913G);
                                    RoutingActivity routingActivity3 = RoutingActivity.this;
                                    routingActivity3.f31557n.setTextColor(routingActivity3.f31538G.getResources().getColor(a7.c.f11855f));
                                    imageView2 = RoutingActivity.this.f31558o;
                                }
                            } else {
                                RoutingActivity.this.f31568y.setBackgroundResource(a7.e.f11913G);
                                RoutingActivity routingActivity4 = RoutingActivity.this;
                                routingActivity4.f31532A.setTextColor(routingActivity4.f31538G.getResources().getColor(a7.c.f11855f));
                                imageView2 = RoutingActivity.this.f31533B;
                            }
                        } else {
                            RoutingActivity.this.f31534C.setBackgroundResource(a7.e.f11913G);
                            RoutingActivity routingActivity5 = RoutingActivity.this;
                            routingActivity5.f31536E.setTextColor(routingActivity5.f31538G.getResources().getColor(a7.c.f11855f));
                            imageView2 = RoutingActivity.this.f31537F;
                        }
                    } else {
                        RoutingActivity.this.f31551h.setBackgroundResource(a7.e.f11913G);
                        RoutingActivity routingActivity6 = RoutingActivity.this;
                        routingActivity6.f31553j.setTextColor(routingActivity6.f31538G.getResources().getColor(a7.c.f11855f));
                        imageView2 = RoutingActivity.this.f31554k;
                    }
                } else {
                    RoutingActivity.this.f31547d.setBackgroundResource(a7.e.f11913G);
                    RoutingActivity routingActivity7 = RoutingActivity.this;
                    routingActivity7.f31549f.setTextColor(routingActivity7.f31538G.getResources().getColor(a7.c.f11855f));
                    imageView2 = RoutingActivity.this.f31550g;
                }
                i11 = a7.e.f12030m;
                imageView2.setImageResource(i11);
                return;
            }
            try {
                View view12 = this.f31582a;
                if (view12 == null || view12.getTag() == null || !this.f31582a.getTag().equals("rl_login_with_m3u")) {
                    View view13 = this.f31582a;
                    if (view13 == null || view13.getTag() == null || !this.f31582a.getTag().equals("rl_login_with_xtream_codes_api")) {
                        View view14 = this.f31582a;
                        if (view14 == null || view14.getTag() == null || !this.f31582a.getTag().equals("rl_play_onestream")) {
                            View view15 = this.f31582a;
                            if (view15 == null || view15.getTag() == null || !this.f31582a.getTag().equals("rl_login_with_stalker")) {
                                View view16 = this.f31582a;
                                if (view16 == null || view16.getTag() == null || !this.f31582a.getTag().equals("rl_play_from_device")) {
                                    View view17 = this.f31582a;
                                    if (view17 == null || view17.getTag() == null || !this.f31582a.getTag().equals("rl_play_single_stream")) {
                                        View view18 = this.f31582a;
                                        if (view18 == null || view18.getTag() == null || !this.f31582a.getTag().equals("rl_list_users")) {
                                            View view19 = this.f31582a;
                                            if (view19 == null || view19.getTag() == null || !this.f31582a.getTag().equals("rl_accept")) {
                                                View view20 = this.f31582a;
                                                if (view20 == null || view20.getTag() == null || !this.f31582a.getTag().equals("rl_cancel")) {
                                                    View view21 = this.f31582a;
                                                    if (view21 == null || view21.getTag() == null || !this.f31582a.getTag().equals("rl_play")) {
                                                        return;
                                                    }
                                                    RoutingActivity.this.f31543L.setBackgroundResource(a7.e.f11992c1);
                                                    RoutingActivity.this.f31544M.setTextColor(RoutingActivity.this.f31538G.getResources().getColor(a7.c.f11849G));
                                                    return;
                                                }
                                                relativeLayout = RoutingActivity.this.f31542K;
                                                i9 = a7.e.f11909F;
                                            } else {
                                                relativeLayout = RoutingActivity.this.f31541J;
                                                i9 = a7.e.f11909F;
                                            }
                                            relativeLayout.setBackgroundResource(i9);
                                            return;
                                        }
                                        RoutingActivity.this.f31563t.setBackgroundResource(a7.e.f11977Y0);
                                        RoutingActivity routingActivity8 = RoutingActivity.this;
                                        routingActivity8.f31565v.setTextColor(routingActivity8.f31538G.getResources().getColor(a7.c.f11849G));
                                        imageView = RoutingActivity.this.f31566w;
                                        i10 = a7.e.f11948O2;
                                    } else {
                                        RoutingActivity.this.f31559p.setBackgroundResource(a7.e.f11909F);
                                        RoutingActivity routingActivity9 = RoutingActivity.this;
                                        routingActivity9.f31561r.setTextColor(routingActivity9.f31538G.getResources().getColor(a7.c.f11849G));
                                        imageView = RoutingActivity.this.f31562s;
                                        i10 = a7.e.f11948O2;
                                    }
                                } else {
                                    RoutingActivity.this.f31555l.setBackgroundResource(a7.e.f11909F);
                                    RoutingActivity routingActivity10 = RoutingActivity.this;
                                    routingActivity10.f31557n.setTextColor(routingActivity10.f31538G.getResources().getColor(a7.c.f11849G));
                                    imageView = RoutingActivity.this.f31558o;
                                    i10 = a7.e.f11948O2;
                                }
                            } else {
                                RoutingActivity.this.f31568y.setBackgroundResource(a7.e.f11909F);
                                RoutingActivity routingActivity11 = RoutingActivity.this;
                                routingActivity11.f31532A.setTextColor(routingActivity11.f31538G.getResources().getColor(a7.c.f11849G));
                                imageView = RoutingActivity.this.f31533B;
                                i10 = a7.e.f11948O2;
                            }
                        } else {
                            RoutingActivity.this.f31534C.setBackgroundResource(a7.e.f11909F);
                            RoutingActivity routingActivity12 = RoutingActivity.this;
                            routingActivity12.f31536E.setTextColor(routingActivity12.f31538G.getResources().getColor(a7.c.f11849G));
                            imageView = RoutingActivity.this.f31537F;
                            i10 = a7.e.f11948O2;
                        }
                    } else {
                        RoutingActivity.this.f31551h.setBackgroundResource(a7.e.f11909F);
                        RoutingActivity routingActivity13 = RoutingActivity.this;
                        routingActivity13.f31553j.setTextColor(routingActivity13.f31538G.getResources().getColor(a7.c.f11849G));
                        imageView = RoutingActivity.this.f31554k;
                        i10 = a7.e.f11948O2;
                    }
                } else {
                    RoutingActivity.this.f31547d.setBackgroundResource(a7.e.f11909F);
                    RoutingActivity routingActivity14 = RoutingActivity.this;
                    routingActivity14.f31549f.setTextColor(routingActivity14.f31538G.getResources().getColor(a7.c.f11849G));
                    imageView = RoutingActivity.this.f31550g;
                    i10 = a7.e.f11948O2;
                }
                imageView.setImageResource(i10);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public static class l implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31584a;

        public l(View view) {
            this.f31584a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31584a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31584a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31584a, "scaleY", f9);
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

    public static void N1(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
            } else {
                O1(context);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
            O1(context);
        }
    }

    public static void O1(Context context) {
        try {
            Intent intent = new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS");
            if (intent.resolveActivity(context.getPackageManager()) == null) {
                throw new UnsupportedOperationException("Unable to open general application settings.");
            }
            context.startActivity(intent);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void G1() {
        Dialog dialog;
        int i9;
        this.f31539H = new Dialog(this, a7.k.f13463h);
        if (f31531P.A().equals(AbstractC2237a.f44453K0)) {
            dialog = this.f31539H;
            i9 = a7.g.f12812i1;
        } else {
            dialog = this.f31539H;
            i9 = a7.g.f12806h1;
        }
        dialog.setContentView(i9);
        this.f31539H.setCancelable(false);
        Window window = this.f31539H.getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                window.setDecorFitsSystemWindows(false);
                WindowInsetsController insetsController = window.getInsetsController();
                if (insetsController != null) {
                    insetsController.setSystemBarsBehavior(2);
                    insetsController.hide(WindowInsets.Type.navigationBars());
                }
            } else {
                window.getDecorView().setSystemUiVisibility(1792);
            }
            window.setLayout(-1, -1);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            window.setAttributes(attributes);
            this.f31539H.setCanceledOnTouchOutside(false);
            this.f31541J = (RelativeLayout) this.f31539H.findViewById(a7.f.Md);
            this.f31542K = (RelativeLayout) this.f31539H.findViewById(a7.f.Zd);
            RelativeLayout relativeLayout = this.f31541J;
            relativeLayout.setOnFocusChangeListener(new k(relativeLayout));
            RelativeLayout relativeLayout2 = this.f31542K;
            relativeLayout2.setOnFocusChangeListener(new k(relativeLayout2));
            WebView webView = (WebView) this.f31539H.findViewById(a7.f.Vm);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("file:///android_asset/terms.html");
            webView.setWebViewClient(new c());
            this.f31541J.setOnClickListener(new d());
            this.f31542K.setOnClickListener(new e());
            this.f31539H.setOnDismissListener(new f());
            this.f31539H.show();
        }
    }

    public void H1() {
        ((ConstraintLayout) findViewById(a7.f.cb)).setSystemUiVisibility(4871);
    }

    public void I1() {
        RelativeLayout relativeLayout = this.f31547d;
        relativeLayout.setOnFocusChangeListener(new k(relativeLayout));
        RelativeLayout relativeLayout2 = this.f31534C;
        relativeLayout2.setOnFocusChangeListener(new k(relativeLayout2));
        RelativeLayout relativeLayout3 = this.f31551h;
        relativeLayout3.setOnFocusChangeListener(new k(relativeLayout3));
        RelativeLayout relativeLayout4 = this.f31555l;
        relativeLayout4.setOnFocusChangeListener(new k(relativeLayout4));
        RelativeLayout relativeLayout5 = this.f31559p;
        relativeLayout5.setOnFocusChangeListener(new k(relativeLayout5));
        RelativeLayout relativeLayout6 = this.f31563t;
        relativeLayout6.setOnFocusChangeListener(new k(relativeLayout6));
        RelativeLayout relativeLayout7 = this.f31568y;
        relativeLayout7.setOnFocusChangeListener(new k(relativeLayout7));
    }

    public boolean J1() {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 23) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        if (i9 >= 33) {
            try {
                if (E.b.checkSelfPermission(this, "android.permission.READ_MEDIA_VIDEO") == 0 && E.b.checkSelfPermission(this, "android.permission.READ_MEDIA_AUDIO") == 0) {
                    return true;
                }
                this.f31546O.a(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"});
            } catch (Exception unused) {
            }
            return false;
        }
        if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        Log.v("TAG", "Permission is revoked");
        AbstractC0519b.h(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 101);
        return false;
    }

    public final /* synthetic */ void K1(Map map) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        String str;
        boolean z9 = false;
        if (map != null) {
            try {
                zBooleanValue = (map.get("android.permission.READ_MEDIA_VIDEO") == null || !(map.get("android.permission.READ_MEDIA_VIDEO") instanceof Boolean)) ? false : ((Boolean) map.get("android.permission.READ_MEDIA_VIDEO")).booleanValue();
                try {
                    if (map.get("android.permission.READ_MEDIA_AUDIO") == null || !(map.get("android.permission.READ_MEDIA_AUDIO") instanceof Boolean)) {
                        z9 = zBooleanValue;
                        zBooleanValue2 = false;
                        zBooleanValue = z9;
                        z9 = zBooleanValue2;
                    } else {
                        zBooleanValue2 = ((Boolean) map.get("android.permission.READ_MEDIA_AUDIO")).booleanValue();
                        z9 = zBooleanValue;
                        zBooleanValue = z9;
                        z9 = zBooleanValue2;
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                zBooleanValue = false;
            }
        } else {
            zBooleanValue2 = false;
            zBooleanValue = z9;
            z9 = zBooleanValue2;
        }
        if (zBooleanValue && z9) {
            RelativeLayout relativeLayout = this.f31555l;
            if (relativeLayout != null) {
                relativeLayout.performClick();
                return;
            }
            return;
        }
        if (!shouldShowRequestPermissionRationale("android.permission.READ_MEDIA_VIDEO") || !shouldShowRequestPermissionRationale("android.permission.READ_MEDIA_AUDIO")) {
            if (!shouldShowRequestPermissionRationale("android.permission.READ_MEDIA_VIDEO")) {
                str = shouldShowRequestPermissionRationale("android.permission.READ_MEDIA_AUDIO") ? "Photos and Videos" : "Music and Audio \n Photos and Videos";
            }
            Q1(str);
            return;
        }
        Q1("Music and Audio");
    }

    public final /* synthetic */ void L1(View view) {
        try {
            N1(this.f31538G);
            this.f31545N.dismiss();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final /* synthetic */ void M1(View view) {
        this.f31545N.dismiss();
    }

    public void P1() {
        C1839a c1839a = new C1839a(this.f31538G, new g(new String[]{""}));
        if (Build.VERSION.SDK_INT >= 30) {
            c1839a.x("");
        } else {
            c1839a.w("");
        }
    }

    public final void Q1(String str) {
        a.C0158a c0158a = new a.C0158a(this.f31538G, a7.k.f13456a);
        View viewInflate = LayoutInflater.from(this.f31538G).inflate(a7.g.f12879t2, (ViewGroup) null);
        Button button = (Button) viewInflate.findViewById(a7.f.f12422i1);
        Button button2 = (Button) viewInflate.findViewById(a7.f.f12382e1);
        if (!new C2858a(this.f31538G).A().equalsIgnoreCase(AbstractC2237a.f44453K0)) {
            button2.setFocusable(false);
            button2.setFocusableInTouchMode(false);
            button.setFocusable(false);
            button.setFocusableInTouchMode(false);
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: p7.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46665a.L1(view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: p7.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46667a.M1(view);
            }
        });
        button.setOnFocusChangeListener(new l(button));
        button2.setOnFocusChangeListener(new l(button2));
        c0158a.setView(viewInflate);
        this.f31545N = c0158a.create();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        androidx.appcompat.app.a aVar = this.f31545N;
        if (aVar != null && aVar.getWindow() != null) {
            layoutParams.copyFrom(this.f31545N.getWindow().getAttributes());
            layoutParams.width = -2;
            layoutParams.height = -2;
            this.f31545N.show();
            this.f31545N.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.f31545N.getWindow().setAttributes(layoutParams);
            this.f31545N.setCancelable(true);
        }
        button.requestFocus();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0007. Please report as an issue. */
    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        if (i9 != 101) {
            switch (i9) {
            }
        } else {
            J1();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f31540I + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finishAffinity();
            finish();
        } else {
            try {
                Toast.makeText(getBaseContext(), getResources().getString(a7.j.f12999F5), 0).show();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        this.f31540I = System.currentTimeMillis();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent;
        int id = view.getId();
        if (id == a7.f.Ye) {
            try {
                if (f31531P.A().equals(AbstractC2237a.f44453K0)) {
                    if (!J1()) {
                        return;
                    } else {
                        P1();
                    }
                } else {
                    if (!J1()) {
                        return;
                    }
                    Intent intent2 = new Intent(this, (Class<?>) Local_media_Activity.class);
                    overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                    startActivity(intent2);
                    finish();
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (id == a7.f.Ce) {
            SharepreferenceDBHandler.setCurrentAPPType("m3u", this.f31538G);
            intent = new Intent(this, (Class<?>) LoginM3uActivity.class);
        } else if (id == a7.f.Ee) {
            SharepreferenceDBHandler.setCurrentAPPType("api", this.f31538G);
            intent = new Intent(this, (Class<?>) LoginActivity.class);
        } else {
            if (id == a7.f.De) {
                Toast.makeText(getApplicationContext(), "Coming Soon", 0).show();
                return;
            }
            if (id != a7.f.Ze) {
                if (id == a7.f.af) {
                    single_stream_click(view);
                    return;
                } else {
                    if (id == a7.f.Ae) {
                        on_click_list(view);
                        return;
                    }
                    return;
                }
            }
            SharepreferenceDBHandler.setCurrentAPPType("onestream_api", this.f31538G);
            intent = new Intent(this, (Class<?>) LoginActivityOneStream.class);
        }
        startActivity(intent);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f31538G = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f31538G);
        f31531P = c2858a;
        String strA = c2858a.A();
        setContentView(AbstractC2237a.f44526o.booleanValue() ? strA.equals(AbstractC2237a.f44453K0) ? a7.g.f12609B0 : a7.g.f12603A0 : strA.equals(AbstractC2237a.f44453K0) ? a7.g.f12615C0 : a7.g.f12913z0);
        this.f31547d = (RelativeLayout) findViewById(a7.f.Ce);
        this.f31548e = (ImageView) findViewById(a7.f.f12548u5);
        this.f31549f = (TextView) findViewById(a7.f.Uj);
        this.f31550g = (ImageView) findViewById(a7.f.f12558v5);
        this.f31551h = (RelativeLayout) findViewById(a7.f.Ee);
        this.f31552i = (ImageView) findViewById(a7.f.f12588y5);
        this.f31553j = (TextView) findViewById(a7.f.Wj);
        this.f31554k = (ImageView) findViewById(a7.f.f12598z5);
        this.f31555l = (RelativeLayout) findViewById(a7.f.Ye);
        this.f31556m = (ImageView) findViewById(a7.f.f12182J5);
        this.f31557n = (TextView) findViewById(a7.f.Qk);
        this.f31558o = (ImageView) findViewById(a7.f.f12192K5);
        this.f31559p = (RelativeLayout) findViewById(a7.f.af);
        this.f31560q = (ImageView) findViewById(a7.f.f12232O5);
        this.f31561r = (TextView) findViewById(a7.f.Sk);
        this.f31562s = (ImageView) findViewById(a7.f.f12242P5);
        this.f31563t = (RelativeLayout) findViewById(a7.f.Ae);
        this.f31564u = (ImageView) findViewById(a7.f.f12508q5);
        this.f31565v = (TextView) findViewById(a7.f.Sj);
        this.f31566w = (ImageView) findViewById(a7.f.f12518r5);
        this.f31567x = (TextView) findViewById(a7.f.Qj);
        this.f31568y = (RelativeLayout) findViewById(a7.f.De);
        this.f31569z = (ImageView) findViewById(a7.f.f12568w5);
        this.f31532A = (TextView) findViewById(a7.f.Vj);
        this.f31533B = (ImageView) findViewById(a7.f.f12578x5);
        this.f31534C = (RelativeLayout) findViewById(a7.f.Ze);
        this.f31535D = (ImageView) findViewById(a7.f.f12212M5);
        this.f31536E = (TextView) findViewById(a7.f.Rk);
        this.f31537F = (ImageView) findViewById(a7.f.f12222N5);
        this.f31555l.setOnClickListener(this);
        this.f31547d.setOnClickListener(this);
        this.f31551h.setOnClickListener(this);
        this.f31568y.setOnClickListener(this);
        this.f31534C.setOnClickListener(this);
        this.f31559p.setOnClickListener(this);
        this.f31563t.setOnClickListener(this);
        if (!AbstractC2237a.f44526o.booleanValue()) {
            if (AbstractC2237a.f44538t.booleanValue() && AbstractC2237a.f44529p.booleanValue() && AbstractC2237a.f44534r.booleanValue()) {
                this.f31547d.setVisibility(0);
            } else if (AbstractC2237a.f44538t.booleanValue() && AbstractC2237a.f44529p.booleanValue()) {
                this.f31547d.setVisibility(8);
            } else {
                if (AbstractC2237a.f44538t.booleanValue() && AbstractC2237a.f44534r.booleanValue()) {
                    this.f31547d.setVisibility(0);
                } else if (AbstractC2237a.f44529p.booleanValue() && AbstractC2237a.f44534r.booleanValue()) {
                    this.f31547d.setVisibility(0);
                    this.f31551h.setVisibility(8);
                    this.f31534C.setVisibility(0);
                } else if (AbstractC2237a.f44538t.booleanValue()) {
                    this.f31547d.setVisibility(8);
                }
                this.f31551h.setVisibility(0);
                this.f31534C.setVisibility(8);
            }
            this.f31551h.setVisibility(0);
            this.f31534C.setVisibility(0);
        } else if (!getSharedPreferences("Accept_clicked", 0).getString("Accept_clicked", "true").equals("true")) {
            G1();
        }
        this.f31565v.setSelected(true);
        H1();
        I1();
        try {
            this.f31567x.setOnClickListener(new b());
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i9, strArr, iArr);
        if (i9 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0) {
                I1();
            } else if (Build.VERSION.SDK_INT < 23 || shouldShowRequestPermissionRationale(strArr[0])) {
                Toast.makeText(this, this.f31538G.getResources().getString(a7.j.f13316m), 0).show();
            } else {
                a.C0158a c0158a = new a.C0158a(this, a7.k.f13456a);
                View viewInflate = LayoutInflater.from(this).inflate(a7.g.f12744X3, (ViewGroup) null);
                Button button = (Button) viewInflate.findViewById(a7.f.f12361c1);
                Button button2 = (Button) viewInflate.findViewById(a7.f.f12286U0);
                button.setOnFocusChangeListener(new l(button));
                button2.setOnFocusChangeListener(new l(button2));
                button.requestFocus();
                button.setOnClickListener(new h());
                button2.setOnClickListener(new i());
                c0158a.setView(viewInflate);
                this.f31545N = c0158a.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f31545N.getWindow();
                Objects.requireNonNull(window);
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -2;
                layoutParams.height = -2;
                this.f31545N.show();
                this.f31545N.getWindow().setAttributes(layoutParams);
                this.f31545N.setCancelable(false);
                this.f31545N.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.z0(this.f31538G);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        H1();
    }

    public void on_click_list(View view) {
        startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
    }

    public void single_stream_click(View view) {
        try {
            View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(f31531P.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12613B4 : a7.g.f12607A4, (ViewGroup) null);
            PopupWindow popupWindow = new PopupWindow(viewInflate, -1, -1, true);
            popupWindow.showAtLocation(viewInflate, 16, 0, 0);
            popupWindow.setTouchable(true);
            popupWindow.setFocusable(true);
            EditText editText = (EditText) viewInflate.findViewById(a7.f.f12404g3);
            this.f31543L = (RelativeLayout) viewInflate.findViewById(a7.f.Xe);
            this.f31544M = (TextView) viewInflate.findViewById(a7.f.Pk);
            RelativeLayout relativeLayout = this.f31543L;
            relativeLayout.setOnFocusChangeListener(new k(relativeLayout));
            TextView textView = this.f31544M;
            textView.setOnFocusChangeListener(new k(textView));
            this.f31543L.setOnClickListener(new j(editText));
            editText.setOnEditorActionListener(new a());
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }
}
