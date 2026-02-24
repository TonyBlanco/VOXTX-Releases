package com.nst.iptvsmarterstvbox.view.activity;

import D.AbstractC0519b;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import b7.AbstractC1232b;
import b7.InterfaceC1233c;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import com.nst.iptvsmarterstvbox.miscelleneious.StopProcessingTasksService;
import com.nst.iptvsmarterstvbox.model.callback.LoginCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetAdCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetAllChannelsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetGenresCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetSeriesCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetVODByCatCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetVodCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerLiveFavIdsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerProfilesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerSetLiveFavCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerTokenCallback;
import com.nst.iptvsmarterstvbox.model.database.ImportStatusModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.SplashActivity;
import j1.AbstractC2074a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import m1.C2219a;
import m7.AbstractC2237a;
import m7.w;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.http.client.methods.HttpHead;
import org.json.JSONObject;
import p1.InterfaceC2389c;
import q7.C2635t;
import q7.Z;
import q7.m0;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class SplashActivity extends androidx.appcompat.app.b implements z7.f, InterfaceC1233c, z7.g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public SharedPreferences.Editor f32513A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public SharedPreferences.Editor f32514B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public SharedPreferences.Editor f32515C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public SharedPreferences f32516D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public SharedPreferences f32517E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public SharedPreferences f32518F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public SharedPreferences f32519G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public SharedPreferences f32520H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public SharedPreferences.Editor f32521I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public SharedPreferences.Editor f32522J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public SharedPreferences.Editor f32523K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public SharedPreferences.Editor f32524L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public SharedPreferences.Editor f32525M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public SharedPreferences f32526N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public SharedPreferences.Editor f32527O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public LiveStreamDBHandler f32528P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public SharedPreferences f32529Q;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public String f32531S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public String f32532T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public String f32533U;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public n7.d f32535W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public InputStream f32536X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public String f32538Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences f32539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f32540e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public LinearLayout f32541e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f32542f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public n7.e f32543f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MultiUserDBHandler f32544g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public String f32545g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f32547h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f32549i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f32550j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f32551j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f32552k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public VideoView f32554m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C2858a f32555n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f32556o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f32557p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f32558q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f32559r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f32560s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f32561t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f32565x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SharedPreferences f32566y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SharedPreferences f32567z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f32546h = Boolean.FALSE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f32548i = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f32553l = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f32562u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f32563v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f32564w = -1;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ArrayList f32530R = new ArrayList();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f32534V = 1500;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final A7.a f32537Y = new A7.a();

    public class a implements InterfaceC2389c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f32568a;

        public a(String str) {
            this.f32568a = str;
        }

        @Override // p1.InterfaceC2389c
        public void a(JSONObject jSONObject) {
            try {
                String string = jSONObject.getString("auth_token");
                if (string.isEmpty()) {
                    SplashActivity.this.startActivity(new Intent(SplashActivity.this.f32542f, (Class<?>) MultiUserActivity.class));
                    SplashActivity.this.finish();
                    Toast.makeText(SplashActivity.this.getApplicationContext(), SplashActivity.this.getResources().getString(a7.j.f13182Y3), 0).show();
                } else {
                    SharepreferenceDBHandler.setFirebaseOneStreamNode(this.f32568a, SplashActivity.this.f32542f);
                    SharepreferenceDBHandler.setOneStreamToken(string, SplashActivity.this.f32542f);
                    SplashActivity.this.m2(this.f32568a);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }

        @Override // p1.InterfaceC2389c
        public void b(C2219a c2219a) {
            SplashActivity.this.startActivity(new Intent(SplashActivity.this.f32542f, (Class<?>) MultiUserActivity.class));
            SplashActivity.this.finish();
            Toast.makeText(SplashActivity.this.getApplicationContext(), SplashActivity.this.getResources().getString(a7.j.f13182Y3), 0).show();
        }
    }

    public class b implements InterfaceC2389c {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Class, java.lang.Class<com.nst.iptvsmarterstvbox.view.activity.MultiUserActivity>] */
        /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r12v3 */
        /* JADX WARN: Type inference failed for: r12v4 */
        /* JADX WARN: Type inference failed for: r2v13, types: [android.content.SharedPreferences$Editor] */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Class] */
        @Override // p1.InterfaceC2389c
        public void a(JSONObject jSONObject) {
            Intent intent;
            SplashActivity splashActivity;
            ?? r32 = "status";
            ?? string = MultiUserActivity.class;
            if (jSONObject == null) {
                SplashActivity.this.startActivity(new Intent(SplashActivity.this.f32542f, (Class<?>) string));
                SplashActivity.this.finish();
                Toast.makeText(SplashActivity.this.getApplicationContext(), SplashActivity.this.getResources().getString(a7.j.f13182Y3), 0).show();
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject(String.valueOf(jSONObject)).getJSONObject("user_info");
                    if (jSONObject2 != null) {
                        SplashActivity.this.f32549i0 = jSONObject2.getString("auth");
                        String str = SplashActivity.this.f32549i0;
                        if (str != null && Integer.valueOf(str).intValue() != 0) {
                            SplashActivity.this.f32551j0 = jSONObject2.getString("status");
                            String str2 = SplashActivity.this.f32551j0;
                            if (str2 != null && str2.equals("Active")) {
                                SplashActivity.this.b();
                                JSONObject jSONObject3 = new JSONObject(String.valueOf(jSONObject));
                                JSONObject jSONObject4 = jSONObject3.getJSONObject("user_info");
                                String string2 = jSONObject4.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME);
                                jSONObject4.getString("message");
                                String string3 = jSONObject4.getString("expire_at");
                                try {
                                    string = jSONObject4.getString("active_connections");
                                    String string4 = jSONObject4.getString("created_at");
                                    String string5 = jSONObject4.getString("max_connections");
                                    jSONObject4.getJSONArray("allowed_output_formats");
                                    String string6 = jSONObject3.getJSONObject("server_info").getString("time_now");
                                    try {
                                        if (SplashActivity.this.f32551j0.equals("Active")) {
                                            SplashActivity.this.f32542f.getSharedPreferences("loginPrefsserverurl", 0).getString(AbstractC2237a.f44454L, "").toLowerCase();
                                            ?? Edit = SplashActivity.this.getSharedPreferences("loginPrefs", 0).edit();
                                            Edit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, string2);
                                            Edit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, SplashActivity.this.f32561t);
                                            Edit.putString("auth", SplashActivity.this.f32549i0);
                                            Edit.putString("status", SplashActivity.this.f32551j0);
                                            Edit.putString("expDate", string3);
                                            Edit.putString("activeCons", string);
                                            Edit.putString("createdAt", string4);
                                            Edit.putString("maxConnections", string5);
                                            Edit.putString("serverTimeZone", string6);
                                            Edit.apply();
                                            SplashActivity splashActivity2 = SplashActivity.this;
                                            splashActivity2.f32516D = splashActivity2.f32542f.getSharedPreferences("allowedFormat", 0);
                                            SplashActivity splashActivity3 = SplashActivity.this;
                                            splashActivity3.f32517E = splashActivity3.f32542f.getSharedPreferences("timeFormat", 0);
                                            SplashActivity splashActivity4 = SplashActivity.this;
                                            splashActivity4.f32518F = splashActivity4.f32542f.getSharedPreferences("epgchannelupdate", 0);
                                            SplashActivity splashActivity5 = SplashActivity.this;
                                            splashActivity5.f32519G = splashActivity5.f32542f.getSharedPreferences("automation_channels", 0);
                                            SplashActivity splashActivity6 = SplashActivity.this;
                                            splashActivity6.f32520H = splashActivity6.f32542f.getSharedPreferences("automation_epg", 0);
                                            SplashActivity splashActivity7 = SplashActivity.this;
                                            splashActivity7.f32523K = splashActivity7.f32516D.edit();
                                            SplashActivity splashActivity8 = SplashActivity.this;
                                            splashActivity8.f32521I = splashActivity8.f32517E.edit();
                                            SplashActivity splashActivity9 = SplashActivity.this;
                                            splashActivity9.f32522J = splashActivity9.f32518F.edit();
                                            SplashActivity splashActivity10 = SplashActivity.this;
                                            splashActivity10.f32524L = splashActivity10.f32519G.edit();
                                            SplashActivity splashActivity11 = SplashActivity.this;
                                            splashActivity11.f32525M = splashActivity11.f32520H.edit();
                                            SplashActivity splashActivity12 = SplashActivity.this;
                                            splashActivity12.f32526N = splashActivity12.f32542f.getSharedPreferences("auto_start", 0);
                                            SplashActivity splashActivity13 = SplashActivity.this;
                                            splashActivity13.f32527O = splashActivity13.f32526N.edit();
                                            if (SplashActivity.this.f32527O != null) {
                                                SplashActivity.this.f32527O.putBoolean("full_epg", true);
                                                SplashActivity.this.f32527O.apply();
                                            }
                                            if (SplashActivity.this.f32519G.getString("automation_channels", "").equals("")) {
                                                SplashActivity.this.f32524L.putString("automation_channels", "checked");
                                                SplashActivity.this.f32524L.apply();
                                            }
                                            if (SplashActivity.this.f32520H.getString("automation_epg", "").equals("")) {
                                                SplashActivity.this.f32525M.putString("automation_epg", "checked");
                                                SplashActivity.this.f32525M.apply();
                                            }
                                            AbstractC2237a.f44491c0 = Boolean.FALSE;
                                            if (SplashActivity.this.f32516D.getString("allowedFormat", "").equals("")) {
                                                SplashActivity.this.f32523K.putString("allowedFormat", "ts");
                                                SplashActivity.this.f32523K.apply();
                                            }
                                            if (SplashActivity.this.f32517E.getString("timeFormat", AbstractC2237a.f44441E0).equals("")) {
                                                SplashActivity.this.f32521I.putString("timeFormat", AbstractC2237a.f44441E0);
                                                SplashActivity.this.f32521I.apply();
                                            }
                                            if (SplashActivity.this.f32518F.getString("epgchannelupdate", "").equals("")) {
                                                SplashActivity.this.f32522J.putString("epgchannelupdate", "all");
                                                SplashActivity.this.f32522J.apply();
                                            }
                                            ImportStatusModel importStatusModel = SplashActivity.this.f32528P.getdateDBStatus("onestream_api");
                                            if (importStatusModel != null) {
                                                if ((importStatusModel.getStatus() != null && importStatusModel.getStatus().equals("0")) || (importStatusModel.getStatus() != null && importStatusModel.getStatus().equals("2"))) {
                                                    intent = new Intent(SplashActivity.this.getApplicationContext(), (Class<?>) ImportOneStreamActivity.class);
                                                    splashActivity = SplashActivity.this;
                                                } else if (importStatusModel.getStatus() != null && importStatusModel.getStatus().equals("1")) {
                                                    long jC = c(new SimpleDateFormat("dd/MM/yyyy", Locale.US), importStatusModel.getDate(), w.q());
                                                    if (!SplashActivity.this.l2() || jC < SplashActivity.this.f32555n.g()) {
                                                        intent = new Intent(SplashActivity.this.getApplicationContext(), (Class<?>) NewDashboardActivity.class);
                                                        splashActivity = SplashActivity.this;
                                                    } else {
                                                        intent = new Intent(SplashActivity.this.getApplicationContext(), (Class<?>) ImportOneStreamActivity.class);
                                                        splashActivity = SplashActivity.this;
                                                    }
                                                } else if (importStatusModel.getStatus() == null || !importStatusModel.getStatus().equals("3")) {
                                                    ?? r33 = string;
                                                    SplashActivity.this.startActivity(new Intent(SplashActivity.this.f32542f, (Class<?>) r33));
                                                    SplashActivity.this.finish();
                                                    r32 = r33;
                                                } else {
                                                    intent = new Intent(SplashActivity.this.getApplicationContext(), (Class<?>) ImportOneStreamActivity.class);
                                                    splashActivity = SplashActivity.this;
                                                }
                                                splashActivity.startActivity(intent);
                                            }
                                        } else {
                                            ?? r34 = string;
                                            SplashActivity.this.startActivity(new Intent(SplashActivity.this.f32542f, (Class<?>) r34));
                                            SplashActivity.this.finish();
                                            Toast.makeText(SplashActivity.this.getApplicationContext(), SplashActivity.this.getResources().getString(a7.j.f13016H2) + SplashActivity.this.f32551j0, 0).show();
                                            r32 = r34;
                                        }
                                    } catch (Exception unused) {
                                        SplashActivity.this.startActivity(new Intent(SplashActivity.this.f32542f, (Class<?>) r32));
                                        SplashActivity.this.finish();
                                        Toast.makeText(SplashActivity.this.getApplicationContext(), SplashActivity.this.getResources().getString(a7.j.f13182Y3), 0).show();
                                        return;
                                    }
                                } catch (Exception unused2) {
                                    r32 = string;
                                }
                            }
                        }
                    }
                    SplashActivity.this.startActivity(new Intent(SplashActivity.this.f32542f, (Class<?>) string));
                    SplashActivity.this.finish();
                    Toast.makeText(SplashActivity.this.getApplicationContext(), SplashActivity.this.getResources().getString(a7.j.f13182Y3), 0).show();
                } catch (Exception unused3) {
                    r32 = string;
                }
            }
        }

        @Override // p1.InterfaceC2389c
        public void b(C2219a c2219a) {
            SplashActivity.this.startActivity(new Intent(SplashActivity.this.f32542f, (Class<?>) MultiUserActivity.class));
            SplashActivity.this.finish();
            Toast.makeText(SplashActivity.this.getApplicationContext(), SplashActivity.this.getResources().getString(a7.j.f13182Y3), 0).show();
        }

        public long c(SimpleDateFormat simpleDateFormat, String str, String str2) {
            try {
                return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
            } catch (Exception e9) {
                e9.printStackTrace();
                return 0L;
            }
        }
    }

    public class c implements MediaPlayer.OnCompletionListener {
        public c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            SplashActivity.this.f32534V = 0;
            SplashActivity.this.p2();
        }
    }

    public class d implements MediaPlayer.OnPreparedListener {
        public d() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            SplashActivity splashActivity = SplashActivity.this;
            splashActivity.f32554m.seekTo(splashActivity.f32553l);
            SplashActivity splashActivity2 = SplashActivity.this;
            int i9 = splashActivity2.f32553l;
            VideoView videoView = splashActivity2.f32554m;
            if (i9 == 0) {
                videoView.start();
            } else {
                videoView.pause();
                SplashActivity.this.p2();
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SplashActivity.this.q2();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SplashActivity.this.q2();
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SplashActivity.this.q2();
        }
    }

    public class h implements MyApplication.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f32576a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h hVar = h.this;
                if (hVar.f32576a.equalsIgnoreCase(SharepreferenceDBHandler.getClientSecurityUrl(SplashActivity.this.f32542f))) {
                    SplashActivity.this.w2();
                } else {
                    SplashActivity.this.y1();
                }
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SplashActivity.this.w2();
            }
        }

        public h(String str) {
            this.f32576a = str;
        }

        @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
        public void a(String str) {
        }

        @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
        public void b(String str) {
            MyApplication.p().D("SP" + str, SplashActivity.this.f32542f);
            SplashActivity.this.runOnUiThread(new b());
        }

        @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
        public void onSuccess() {
            SplashActivity.this.runOnUiThread(new a());
        }
    }

    public class i extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f32580a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f32581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f32582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f32583e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f32584f;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f32586a;

            public a(View view) {
                this.f32586a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f32586a;
                    if (view2 == null || view2.getTag() == null || !this.f32586a.getTag().equals("1")) {
                        View view3 = this.f32586a;
                        if (view3 == null || view3.getTag() == null || !this.f32586a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = i.this.f32584f;
                        }
                    } else {
                        linearLayout = i.this.f32583e;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f32586a;
                    if (view4 == null || view4.getTag() == null || !this.f32586a.getTag().equals("1")) {
                        View view5 = this.f32586a;
                        if (view5 == null || view5.getTag() == null || !this.f32586a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = i.this.f32584f;
                        }
                    } else {
                        linearLayout = i.this.f32583e;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public i(Activity activity) {
            super(activity);
            this.f32580a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (view.getId() == a7.f.f12524s1) {
                    dismiss();
                    SplashActivity.this.new k().execute(new Void[0]);
                } else {
                    if (view.getId() != a7.f.f12313X0) {
                        return;
                    }
                    dismiss();
                    SplashActivity.this.finishAffinity();
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(SplashActivity.this.f32555n.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12819j2 : a7.g.f12813i2);
            Log.d("DeviceTypeRuntimeCheck", ((UiModeManager) SplashActivity.this.getSystemService("uimode")).getCurrentModeType() == 4 ? "Running on a TV Device" : "Running on a non-TV Device");
            this.f32581c = (TextView) findViewById(a7.f.f12524s1);
            this.f32582d = (TextView) findViewById(a7.f.f12313X0);
            this.f32583e = (LinearLayout) findViewById(a7.f.Ia);
            this.f32584f = (LinearLayout) findViewById(a7.f.V8);
            this.f32581c.setOnClickListener(this);
            this.f32582d.setOnClickListener(this);
            TextView textView = this.f32581c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f32582d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class j extends AsyncTask {
        public j() {
        }

        public /* synthetic */ j(SplashActivity splashActivity, c cVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                URL url = new URL(strArr[0]);
                SplashActivity.this.r2();
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters");
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(SplashActivity.this.f32542f.getFilesDir() + "/data_temp.txt");
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(SplashActivity.this.f32542f.getFilesDir() + "/data_temp.txt").toString())));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (!(((!line.contains("http://") || line.contains("tvg-logo")) && (!line.contains("https://") || line.contains("tvg-logo"))) ? "" : line).equals("")) {
                        sb.append(line);
                        break;
                    }
                }
                bufferedWriter.write(sb.toString());
                bufferedWriter.flush();
                bufferedWriter.close();
                return Boolean.TRUE;
            } catch (Exception e10) {
                Log.d("Google", "DownloadFileFromUrl " + e10.getMessage());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            try {
                if (!bool.booleanValue()) {
                    Context context = SplashActivity.this.f32542f;
                    w.P0(context, context.getResources().getString(a7.j.f13269h2));
                    SplashActivity.this.startActivity(AbstractC2237a.f44536s.booleanValue() ? new Intent(SplashActivity.this, (Class<?>) MultiUserActivity.class) : new Intent(SplashActivity.this, (Class<?>) RoutingActivity.class));
                    SplashActivity.this.overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                    SplashActivity.this.finish();
                    return;
                }
                SplashActivity.this.new n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, SplashActivity.this.f32542f.getFilesDir() + "/data_temp.txt");
            } catch (Exception unused) {
                Context context2 = SplashActivity.this.f32542f;
                w.P0(context2, context2.getResources().getString(a7.j.f13269h2));
                SplashActivity.this.startActivity(AbstractC2237a.f44536s.booleanValue() ? new Intent(SplashActivity.this, (Class<?>) MultiUserActivity.class) : new Intent(SplashActivity.this, (Class<?>) RoutingActivity.class));
                SplashActivity.this.overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                SplashActivity.this.finish();
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(String... strArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class k extends AsyncTask {
        public k() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://www.google.com").openConnection();
                httpURLConnection.setRequestMethod(HttpHead.METHOD_NAME);
                httpURLConnection.setReadTimeout(1500);
                httpURLConnection.setConnectTimeout(1500);
                return Boolean.valueOf(httpURLConnection.getResponseCode() == 200);
            } catch (Exception e9) {
                Log.e("LOG_TAG", e9.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                SplashActivity.this.y1();
                return;
            }
            SplashActivity splashActivity = SplashActivity.this;
            i iVar = splashActivity.new i((Activity) splashActivity.f32542f);
            iVar.setCancelable(false);
            iVar.show();
        }
    }

    public class l extends AsyncTask {
        public l() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://www.google.com").openConnection();
                httpURLConnection.setRequestMethod(HttpHead.METHOD_NAME);
                httpURLConnection.setReadTimeout(1500);
                httpURLConnection.setConnectTimeout(1500);
                return Boolean.valueOf(httpURLConnection.getResponseCode() == 200);
            } catch (Exception e9) {
                Log.e("LOG_TAG", e9.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                new m(SplashActivity.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, SplashActivity.this.f32533U);
                return;
            }
            SplashActivity splashActivity = SplashActivity.this;
            i iVar = splashActivity.new i((Activity) splashActivity.f32542f);
            iVar.setCancelable(false);
            iVar.show();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class m extends AsyncTask {
        public m() {
        }

        public /* synthetic */ m(SplashActivity splashActivity, c cVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                return Boolean.valueOf(responseCode == 200 || responseCode == 405 || responseCode == 404);
            } catch (Exception e9) {
                Log.e("Google", e9.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                new j(SplashActivity.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, SplashActivity.this.f32533U);
                return;
            }
            Context context = SplashActivity.this.f32542f;
            w.P0(context, context.getResources().getString(a7.j.f13269h2));
            SplashActivity.this.startActivity(AbstractC2237a.f44536s.booleanValue() ? new Intent(SplashActivity.this, (Class<?>) MultiUserActivity.class) : new Intent(SplashActivity.this, (Class<?>) RoutingActivity.class));
            SplashActivity.this.overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            SplashActivity.this.finish();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public class n extends AsyncTask {
        public n() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                SplashActivity.this.f32536X = new FileInputStream(new File(strArr[0]));
                SplashActivity splashActivity = SplashActivity.this;
                return splashActivity.f32537Y.c(splashActivity.f32536X, SplashActivity.this.f32542f);
            } catch (Exception unused) {
                return "";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (str.equals("")) {
                    Context context = SplashActivity.this.f32542f;
                    Toast.makeText(context, context.getResources().getString(a7.j.f13205a8), 1).show();
                    SplashActivity.this.startActivity(new Intent(SplashActivity.this, (Class<?>) MultiUserActivity.class));
                    SplashActivity.this.overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                    SplashActivity.this.finish();
                } else {
                    SplashActivity.this.f32538Z = str;
                    SplashActivity.this.h2();
                }
            } catch (Exception unused) {
                Context context2 = SplashActivity.this.f32542f;
                Toast.makeText(context2, context2.getResources().getString(a7.j.f13269h2), 0).show();
                SplashActivity.this.startActivity(AbstractC2237a.f44536s.booleanValue() ? new Intent(SplashActivity.this, (Class<?>) MultiUserActivity.class) : new Intent(SplashActivity.this, (Class<?>) RoutingActivity.class));
                SplashActivity.this.overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                SplashActivity.this.finish();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    private void A2(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() < 1) {
            if (arrayList == null || arrayList.size() != 0) {
                return;
            }
            startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
            finish();
            b();
            Toast.makeText(this, this.f32542f.getResources().getString(a7.j.f12976D2), 0).show();
            return;
        }
        try {
            String strTrim = ((String) arrayList.get(0)).trim();
            this.f32547h0 = strTrim;
            if (!strTrim.startsWith("http://") && !this.f32547h0.startsWith("https://")) {
                this.f32547h0 = "http://" + this.f32547h0;
            }
            if (!this.f32547h0.endsWith("/")) {
                this.f32547h0 += "/";
            }
            this.f32513A.putString(AbstractC2237a.f44454L, this.f32547h0);
            this.f32513A.apply();
            arrayList.remove(0);
            x1(arrayList);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h2() {
        Activity activity;
        try {
            if (this.f32528P.getImportTableCount("m3u") == 0) {
                ArrayList<ImportStatusModel> arrayList = new ArrayList<>();
                ImportStatusModel importStatusModel = new ImportStatusModel();
                importStatusModel.setType("all");
                importStatusModel.setStatus("0");
                importStatusModel.setDate("");
                arrayList.add(0, importStatusModel);
                this.f32528P.importDataStatusArrayList(arrayList, "m3u");
            }
            ImportStatusModel importStatusModel2 = this.f32528P.getdateDBStatus("all");
            if (importStatusModel2 != null) {
                if ((importStatusModel2.getStatus() == null || !importStatusModel2.getStatus().equals("0")) && (importStatusModel2.getStatus() == null || !importStatusModel2.getStatus().equals("2"))) {
                    if (importStatusModel2.getStatus() != null && importStatusModel2.getStatus().equals("1")) {
                        long jC = w.C(new SimpleDateFormat("dd/MM/yyyy", Locale.US), importStatusModel2.getDate(), w.q());
                        if (!l2() || jC < this.f32555n.g()) {
                            this.f32542f.startActivity(new Intent(this.f32542f, (Class<?>) NewDashboardActivity.class));
                            activity = (Activity) this.f32542f;
                        } else {
                            this.f32542f.startActivity(new Intent(this.f32542f, (Class<?>) ImportM3uActivity.class));
                            activity = (Activity) this.f32542f;
                        }
                    } else {
                        if (importStatusModel2.getStatus() == null || !importStatusModel2.getStatus().equals("3")) {
                            return;
                        }
                        this.f32542f.startActivity(new Intent(this.f32542f, (Class<?>) ImportM3uActivity.class));
                        activity = (Activity) this.f32542f;
                    }
                } else {
                    if (this.f32542f == null) {
                        return;
                    }
                    this.f32542f.startActivity(new Intent(this.f32542f, (Class<?>) ImportM3uActivity.class));
                    activity = (Activity) this.f32542f;
                }
                activity.finish();
            }
        } catch (Exception unused) {
            Context context = this.f32542f;
            Toast.makeText(context, context.getResources().getString(a7.j.f13269h2), 0).show();
            startActivity(AbstractC2237a.f44536s.booleanValue() ? new Intent(this, (Class<?>) MultiUserActivity.class) : new Intent(this, (Class<?>) RoutingActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            finish();
        }
    }

    private static String j2(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean z9 = true;
        for (char c9 : charArray) {
            if (z9 && Character.isLetter(c9)) {
                sb.append(Character.toUpperCase(c9));
                z9 = false;
            } else {
                if (Character.isWhitespace(c9)) {
                    z9 = true;
                }
                sb.append(c9);
            }
        }
        return sb.toString();
    }

    private void k2() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    public static String n2() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return j2(str2);
        }
        return j2(str) + " " + str2;
    }

    public static /* synthetic */ void s2(Task task) {
        if (task.isSuccessful()) {
            return;
        }
        Log.e("TAG", task.toString());
    }

    public static String t2(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b9 : bArrDigest) {
                String hexString = Integer.toHexString(b9 & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e9) {
            e9.printStackTrace();
            return "";
        }
    }

    private void x1(ArrayList arrayList) {
        SharepreferenceDBHandler.setCurrentAPPType("onestream_api", this.f32542f);
        String string = this.f32542f.getSharedPreferences("loginPrefsserverurl", 0).getString(AbstractC2237a.f44454L, "");
        this.f32547h0 = string;
        this.f32547h0 = string.toLowerCase();
        Log.e("URl from Back", ">>>>>>>>" + this.f32547h0);
        if (!this.f32547h0.startsWith("http://") && !this.f32547h0.startsWith("https://")) {
            this.f32547h0 = "http://" + this.f32547h0;
        }
        if (this.f32547h0.endsWith("/")) {
            return;
        }
        this.f32547h0 += "/";
    }

    private void x2(String str) {
        if (str != null && !str.equals("") && !str.isEmpty()) {
            this.f32530R = new ArrayList(Arrays.asList(str.split(",")));
        }
        ArrayList arrayList = this.f32530R;
        if (arrayList == null || arrayList.size() < 1) {
            ArrayList arrayList2 = this.f32530R;
            if (arrayList2 == null || arrayList2.size() != 0) {
                return;
            }
            Toast.makeText(this, this.f32542f.getResources().getString(a7.j.f13312l5), 0).show();
            return;
        }
        try {
            this.f32513A.putString(AbstractC2237a.f44454L, ((String) this.f32530R.get(0)).trim());
            this.f32513A.commit();
            this.f32530R.remove(0);
            this.f32535W.h(this.f32560s, this.f32561t, this.f32530R);
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    public void B2() {
        this.f32554m.setVisibility(8);
        this.f32552k.setVisibility(0);
        this.f32550j.setVisibility(0);
    }

    public void C2() {
        this.f32554m.setVisibility(0);
        this.f32552k.setVisibility(8);
        this.f32550j.setVisibility(8);
    }

    @Override // z7.g
    public void F(StalkerGetSeriesCategoriesCallback stalkerGetSeriesCategoriesCallback) {
    }

    @Override // z7.g
    public void G(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, Z.E e9, int i9) {
    }

    @Override // z7.g
    public void G0(StalkerTokenCallback stalkerTokenCallback) {
        if (stalkerTokenCallback == null || stalkerTokenCallback.getJs() == null || stalkerTokenCallback.getJs().getToken() == null) {
            w.P0(this.f32542f, "Error Code 100: Something went wrong!");
            b();
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            finish();
            return;
        }
        String token = stalkerTokenCallback.getJs().getToken();
        SharepreferenceDBHandler.setStalkerToken(token, this.f32542f);
        n7.e eVar = this.f32543f0;
        if (eVar == null) {
            w.P0(this.f32542f, "Error Code 101: Invalid Details");
            b();
        } else {
            try {
                eVar.q(this.f32545g0, token);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    @Override // z7.g
    public void H(String str) {
    }

    @Override // z7.g
    public void I(m0.x xVar, int i9) {
    }

    @Override // z7.g
    public void M(StalkerGetAdCallback stalkerGetAdCallback, int i9) {
    }

    @Override // z7.g
    public void O(Z.E e9, int i9) {
    }

    @Override // z7.g
    public void P0(String str) {
    }

    @Override // z7.g
    public void U(StalkerLiveFavIdsCallback stalkerLiveFavIdsCallback) {
    }

    @Override // z7.g
    public void V(StalkerProfilesCallback stalkerProfilesCallback) {
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        finish();
        if (stalkerProfilesCallback == null || stalkerProfilesCallback.getJs() == null || stalkerProfilesCallback.getJs().getId() == null || stalkerProfilesCallback.getJs().getPassword().equals("")) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = getSharedPreferences("loginPrefs", 0).edit();
            editorEdit.putString("serverTimeZone", stalkerProfilesCallback.getJs().getDefaultTimezone());
            editorEdit.apply();
        } catch (Exception unused) {
        }
    }

    @Override // z7.g
    public void V0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, m0.x xVar, int i9) {
    }

    @Override // z7.b
    public void b() {
    }

    @Override // b7.InterfaceC1233c
    public void b0(int i9) {
        if (this.f32542f != null) {
            if (!AbstractC2237a.f44477W0.booleanValue()) {
                w2();
            } else {
                MyApplication.p().G(this.f32542f, new h(SharepreferenceDBHandler.getClientSecurityUrl(this.f32542f)));
            }
        }
    }

    @Override // z7.f
    public void c(String str) {
        startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        finish();
    }

    @Override // z7.b
    public void d(String str) {
    }

    @Override // z7.g
    public void d0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, C2635t.o oVar, String str, String str2) {
    }

    @Override // z7.f
    public void e(String str) {
    }

    @Override // z7.g
    public void e0(String str) {
    }

    @Override // z7.g
    public void f0(StalkerGetGenresCallback stalkerGetGenresCallback) {
    }

    @Override // z7.f
    public void h0(ArrayList arrayList, String str) {
        if (arrayList == null || arrayList.size() <= 0) {
            startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
            finish();
            w.P0(this.f32542f, "Your Account is invalid or has expired !");
            return;
        }
        try {
            this.f32513A.putString(AbstractC2237a.f44454L, ((String) arrayList.get(0)).trim());
            this.f32513A.apply();
            arrayList.remove(0);
            this.f32535W.h(this.f32560s, this.f32561t, arrayList);
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.g
    public void i(StalkerGetAllChannelsCallback stalkerGetAllChannelsCallback) {
    }

    public void i2() {
        try {
            this.f32558q = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.g
    public void j(StalkerGetVodCategoriesCallback stalkerGetVodCategoriesCallback) {
    }

    public boolean l2() {
        return this.f32542f.getSharedPreferences("automation_channels", 0).getString("automation_channels", "").equals("checked");
    }

    @Override // z7.f
    public void m(LoginCallback loginCallback, String str) {
        int i9;
        String string;
        Class cls;
        int i10;
        if (this.f32542f != null) {
            if (loginCallback == null || loginCallback.getUserLoginInfo() == null) {
                startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                finish();
                d(getResources().getString(a7.j.f12996F2));
                return;
            }
            if (loginCallback.getUserLoginInfo().getAuth().intValue() == 1) {
                String status = loginCallback.getUserLoginInfo().getStatus();
                if (status.equals("Active")) {
                    String username = loginCallback.getUserLoginInfo().getUsername();
                    String password = loginCallback.getUserLoginInfo().getPassword();
                    String port = loginCallback.getServerInfo().getPort();
                    String url = loginCallback.getServerInfo().getUrl();
                    String expDate = loginCallback.getUserLoginInfo().getExpDate();
                    String isTrial = loginCallback.getUserLoginInfo().getIsTrial();
                    String activeCons = loginCallback.getUserLoginInfo().getActiveCons();
                    String createdAt = loginCallback.getUserLoginInfo().getCreatedAt();
                    String maxConnections = loginCallback.getUserLoginInfo().getMaxConnections();
                    List<String> allowedOutputFormats = loginCallback.getUserLoginInfo().getAllowedOutputFormats();
                    String serverProtocal = loginCallback.getServerInfo().getServerProtocal();
                    String httpsPort = loginCallback.getServerInfo().getHttpsPort();
                    String rtmpPort = loginCallback.getServerInfo().getRtmpPort();
                    String timezone = loginCallback.getServerInfo().getTimezone();
                    if (allowedOutputFormats.size() != 0) {
                        cls = NewDashboardActivity.class;
                        i10 = 0;
                        allowedOutputFormats.get(0);
                    } else {
                        cls = NewDashboardActivity.class;
                        i10 = 0;
                    }
                    this.f32542f.getSharedPreferences("loginPrefsserverurl", i10).getString(AbstractC2237a.f44454L, "").toLowerCase();
                    SharedPreferences.Editor editorEdit = getSharedPreferences("loginPrefs", 0).edit();
                    editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, username);
                    editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, password);
                    editorEdit.putString("serverPort", port);
                    editorEdit.putString("serverUrl", url);
                    editorEdit.putString("expDate", expDate);
                    editorEdit.putString("isTrial", isTrial);
                    editorEdit.putString("activeCons", activeCons);
                    editorEdit.putString("createdAt", createdAt);
                    editorEdit.putString("maxConnections", maxConnections);
                    editorEdit.putString(AbstractC2237a.f44454L, url + ":" + port);
                    editorEdit.putString("serverProtocol", serverProtocal);
                    editorEdit.putString("serverPortHttps", httpsPort);
                    editorEdit.putString("serverPortRtmp", rtmpPort);
                    editorEdit.putString("serverTimeZone", timezone);
                    editorEdit.apply();
                    this.f32516D = this.f32542f.getSharedPreferences("allowedFormat", 0);
                    this.f32517E = this.f32542f.getSharedPreferences("timeFormat", 0);
                    this.f32518F = this.f32542f.getSharedPreferences("epgchannelupdate", 0);
                    this.f32519G = this.f32542f.getSharedPreferences("automation_channels", 0);
                    this.f32520H = this.f32542f.getSharedPreferences("automation_epg", 0);
                    this.f32523K = this.f32516D.edit();
                    this.f32521I = this.f32517E.edit();
                    this.f32522J = this.f32518F.edit();
                    this.f32524L = this.f32519G.edit();
                    this.f32525M = this.f32520H.edit();
                    SharedPreferences sharedPreferences = this.f32542f.getSharedPreferences("auto_start", 0);
                    this.f32526N = sharedPreferences;
                    SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    this.f32527O = editorEdit2;
                    if (editorEdit2 != null) {
                        editorEdit2.putBoolean("full_epg", true);
                        this.f32527O.apply();
                    }
                    if (this.f32519G.getString("automation_channels", "").equals("")) {
                        this.f32524L.putString("automation_channels", "checked");
                        this.f32524L.apply();
                    }
                    if (this.f32520H.getString("automation_epg", "").equals("")) {
                        this.f32525M.putString("automation_epg", "checked");
                        this.f32525M.apply();
                    }
                    AbstractC2237a.f44491c0 = Boolean.FALSE;
                    if (this.f32516D.getString("allowedFormat", "").equals("")) {
                        this.f32523K.putString("allowedFormat", "ts");
                        this.f32523K.apply();
                    }
                    if (this.f32517E.getString("timeFormat", AbstractC2237a.f44441E0).equals("")) {
                        this.f32521I.putString("timeFormat", AbstractC2237a.f44441E0);
                        this.f32521I.apply();
                    }
                    if (this.f32518F.getString("epgchannelupdate", "").equals("")) {
                        this.f32522J.putString("epgchannelupdate", "all");
                        this.f32522J.apply();
                    }
                    startActivity(new Intent(this, (Class<?>) cls));
                    finish();
                    return;
                }
                startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                finish();
                string = getResources().getString(a7.j.f13016H2) + status;
                i9 = 0;
            } else {
                i9 = 0;
                startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                finish();
                string = getResources().getString(a7.j.f12976D2);
            }
            Toast.makeText(this, string, i9).show();
        }
    }

    public final void m2(String str) {
        String oneStreamToken = SharepreferenceDBHandler.getOneStreamToken(this.f32542f);
        SharepreferenceDBHandler.setCurrentAPPType("onestream_api", this.f32542f);
        AbstractC2237a.f44482Z = str;
        AbstractC2074a.a(str + "play/b2c/v1/user-info?token=" + oneStreamToken).t("test").s(k1.e.MEDIUM).q().o(new b());
    }

    @Override // z7.g
    public void o0(String str) {
    }

    public void o2() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f32542f = this;
        super.onCreate(bundle);
        try {
            startService(new Intent(getBaseContext(), (Class<?>) StopProcessingTasksService.class));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        o2();
        AbstractC2237a.f44517l = Boolean.TRUE;
        setContentView(a7.g.f12753Z0);
        if (!AbstractC2237a.f44526o.booleanValue()) {
            i2();
            v1();
            n2();
            w1();
        }
        Log.d("DeviceTypeRuntimeCheck", ((UiModeManager) getSystemService("uimode")).getCurrentModeType() == 4 ? "Running on a TV Device" : "Running on a non-TV Device");
        this.f32543f0 = new n7.e(this, this.f32542f);
        this.f32555n = new C2858a(this.f32542f);
        b7.g.f17718c = new b7.g(this);
        this.f32554m = (VideoView) findViewById(a7.f.Hm);
        this.f32541e0 = (LinearLayout) findViewById(a7.f.qa);
        if (AbstractC2237a.f44526o.booleanValue()) {
            this.f32541e0.setVisibility(0);
        } else {
            this.f32541e0.setVisibility(8);
        }
        ((RelativeLayout) findViewById(a7.f.cb)).setSystemUiVisibility(4871);
        this.f32550j = (ImageView) findViewById(a7.f.f12376d6);
        this.f32552k = (ImageView) findViewById(a7.f.f12092A5);
        this.f32528P = new LiveStreamDBHandler(this.f32542f);
        SharedPreferences sharedPreferences = getSharedPreferences("sharedPreference", 0);
        this.f32529Q = sharedPreferences;
        this.f32515C = sharedPreferences.edit();
        this.f32539d = getSharedPreferences("loginPrefs", 0);
        SharedPreferences sharedPreferences2 = getSharedPreferences("sharedprefremberme", 0);
        this.f32566y = sharedPreferences2;
        this.f32565x = Boolean.valueOf(sharedPreferences2.getBoolean("savelogin", true));
        SharedPreferences sharedPreferences3 = getSharedPreferences("loginPrefsserverurl", 0);
        this.f32567z = sharedPreferences3;
        this.f32513A = sharedPreferences3.edit();
        this.f32540e = getSharedPreferences("selected_language", 0);
        this.f32514B = this.f32566y.edit();
        String string = this.f32540e.getString("selected_language", "");
        if (!string.equals("")) {
            w.J0(this.f32542f, string);
        }
        this.f32535W = new n7.d(this, this.f32542f);
        this.f32544g = new MultiUserDBHandler(this.f32542f);
        if (SharepreferenceDBHandler.getisAutoPlayVideos(this.f32542f)) {
            SharepreferenceDBHandler.setisAutoPlayVideos(true, this.f32542f);
        }
        FirebaseMessaging.f().y("all").addOnCompleteListener(new OnCompleteListener() { // from class: p7.k1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                SplashActivity.s2(task);
            }
        });
        if (AbstractC2237a.f44444G.booleanValue()) {
            try {
                C2();
            } catch (Exception unused) {
                B2();
                this.f32534V = 1500;
                p2();
            }
            this.f32554m.setOnCompletionListener(new c());
            this.f32554m.setOnPreparedListener(new d());
        } else {
            B2();
            this.f32534V = 1500;
            p2();
        }
        k2();
        b7.f.g(this, "Kb4ca3fc171069dfdbfe5e0beaf2b8282");
        b7.f.f(this, "Kb4ca3fc171069dfdbfe5e0beaf2b8282");
        b7.f.h(this, "NB!@#12ZKWd");
        this.f32540e = getSharedPreferences("selected_language", 0);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        String string = this.f32540e.getString("selected_language", "");
        if (string.equals("")) {
            return;
        }
        w.J0(this.f32542f, string);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        o2();
    }

    public void p2() {
        Handler handler;
        Runnable gVar;
        if (AbstractC2237a.f44526o.booleanValue()) {
            this.f32545g0 = SharepreferenceDBHandler.getLoggedInMacAddress(this.f32542f);
            if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32542f).equals("stalker_api") || this.f32545g0.equals("")) {
                handler = new Handler();
                gVar = new e();
                handler.postDelayed(gVar, this.f32534V);
                return;
            }
            q2();
        }
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f32542f).equals("m3u")) {
            SharedPreferences sharedPreferences = this.f32539d;
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("serverUrl", "");
                this.f32533U = string;
                if (string == null || string.equals("")) {
                    handler = new Handler();
                    gVar = new f();
                    handler.postDelayed(gVar, this.f32534V);
                    return;
                }
                q2();
            }
            return;
        }
        SharedPreferences sharedPreferences2 = this.f32539d;
        if (sharedPreferences2 != null) {
            String string2 = sharedPreferences2.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
            String string3 = this.f32539d.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
            if (string2 == null || string3 == null || string2.equals("") || string3.equals("") || AbstractC2237a.f44523n.booleanValue()) {
                handler = new Handler();
                gVar = new g();
                handler.postDelayed(gVar, this.f32534V);
                return;
            }
        }
        q2();
    }

    @Override // z7.g
    public void q(StalkerGetVODByCatCallback stalkerGetVODByCatCallback) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x02af, code lost:
    
        if (m7.AbstractC2237a.f44536s.booleanValue() != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03ca, code lost:
    
        if (com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.getCurrentAPPType(r15.f32542f).equals("onestream_api") != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03cc, code lost:
    
        v2(true, false, false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03d7, code lost:
    
        v2(false, false, false, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03ec, code lost:
    
        if (com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.getCurrentAPPType(r15.f32542f).equals("onestream_api") != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q2() {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SplashActivity.q2():void");
    }

    public boolean r2() {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 23) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        if (i9 >= 33) {
            return true;
        }
        if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        Log.v("TAG", "Permission is revoked");
        AbstractC0519b.h(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c3, code lost:
    
        if (com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.getCurrentAPPType(r9.f32542f).equals("onestream_api") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0217, code lost:
    
        if (com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.getCurrentAPPType(r9.f32542f).equals("onestream_api") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x022d, code lost:
    
        if (com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.getCurrentAPPType(r9.f32542f).equals("onestream_api") != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x025f, code lost:
    
        if (com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.getCurrentAPPType(r9.f32542f).equals("onestream_api") != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0261, code lost:
    
        r4 = false;
        r5 = false;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0265, code lost:
    
        r4 = false;
        r5 = true;
     */
    @Override // b7.InterfaceC1233c
    /* JADX INFO: renamed from: u2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K0(java.lang.String r10, int r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SplashActivity.K0(java.lang.String, int, boolean):void");
    }

    @Override // z7.g
    public void v0(String str) {
    }

    public void v1() {
        this.f32557p = Build.VERSION.RELEASE + " " + Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
    }

    public final void v2(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = z9 ? new Intent(this, (Class<?>) LoginActivityOneStream.class) : z10 ? new Intent(this, (Class<?>) NewDashboardActivity.class) : z11 ? new Intent(this, (Class<?>) MultiUserActivity.class) : z12 ? new Intent(this, (Class<?>) RoutingActivity.class) : z13 ? new Intent(this, (Class<?>) LoginActivity.class) : null;
        if (intent != null) {
            startActivity(intent);
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            finish();
        }
    }

    @Override // z7.f
    public void w0(ArrayList arrayList, String str) {
        if (arrayList == null || arrayList.size() <= 0) {
            startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
            finish();
            w.P0(this.f32542f, "Your Account is invalid or has expired !");
            return;
        }
        try {
            this.f32513A.putString(AbstractC2237a.f44454L, ((String) arrayList.get(0)).trim());
            this.f32513A.apply();
            arrayList.remove(0);
            this.f32535W.h(this.f32560s, this.f32561t, arrayList);
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    public void w1() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f32559r = iNextInt;
        AbstractC1232b.f17695b = String.valueOf(iNextInt);
    }

    public void w2() {
        try {
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f32542f).equals("m3u")) {
                String str = this.f32532T;
                if (str == null || !str.equals(TransferTable.COLUMN_FILE)) {
                    String str2 = this.f32532T;
                    if (str2 != null && str2.equals("url")) {
                        new n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f32542f.getFilesDir() + "/data_temp.txt");
                    }
                } else {
                    new n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f32533U);
                }
            } else if (SharepreferenceDBHandler.getCurrentAPPType(this.f32542f).equals("onestream_api")) {
                try {
                    m7.h hVar = new m7.h(this.f32542f, this);
                    hVar.s("", this.f32560s, this.f32561t, "", false, true);
                    hVar.v();
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            } else {
                this.f32535W.g(this.f32560s, this.f32561t);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // z7.f
    public void y(LoginCallback loginCallback, String str, ArrayList arrayList) {
        Intent intent;
        try {
            if (loginCallback.getUserLoginInfo() == null || loginCallback.getServerInfo() == null) {
                if (arrayList == null || arrayList.size() <= 0) {
                    intent = new Intent(this, (Class<?>) MultiUserActivity.class);
                    startActivity(intent);
                    finish();
                    w.P0(this.f32542f, "Your Account is invalid or has expired !");
                    return;
                }
                this.f32513A.putString(AbstractC2237a.f44454L, ((String) arrayList.get(0)).trim());
                this.f32513A.apply();
                arrayList.remove(0);
                this.f32535W.h(this.f32560s, this.f32561t, arrayList);
                return;
            }
            if (loginCallback.getUserLoginInfo() == null) {
                if (arrayList == null || arrayList.size() <= 0) {
                    intent = new Intent(this, (Class<?>) MultiUserActivity.class);
                    startActivity(intent);
                    finish();
                    w.P0(this.f32542f, "Your Account is invalid or has expired !");
                    return;
                }
                this.f32513A.putString(AbstractC2237a.f44454L, ((String) arrayList.get(0)).trim());
                this.f32513A.apply();
                arrayList.remove(0);
                this.f32535W.h(this.f32560s, this.f32561t, arrayList);
                return;
            }
            if (loginCallback.getUserLoginInfo().getAuth().intValue() != 1) {
                if (arrayList == null || arrayList.size() <= 0) {
                    intent = new Intent(this, (Class<?>) MultiUserActivity.class);
                    startActivity(intent);
                    finish();
                    w.P0(this.f32542f, "Your Account is invalid or has expired !");
                    return;
                }
                this.f32513A.putString(AbstractC2237a.f44454L, ((String) arrayList.get(0)).trim());
                this.f32513A.apply();
                arrayList.remove(0);
                this.f32535W.h(this.f32560s, this.f32561t, arrayList);
                return;
            }
            if (!loginCallback.getUserLoginInfo().getStatus().equals("Active")) {
                if (arrayList == null || arrayList.size() <= 0) {
                    intent = new Intent(this, (Class<?>) MultiUserActivity.class);
                    startActivity(intent);
                    finish();
                    w.P0(this.f32542f, "Your Account is invalid or has expired !");
                    return;
                }
                this.f32513A.putString(AbstractC2237a.f44454L, ((String) arrayList.get(0)).trim());
                this.f32513A.apply();
                arrayList.remove(0);
                this.f32535W.h(this.f32560s, this.f32561t, arrayList);
                return;
            }
            String username = loginCallback.getUserLoginInfo().getUsername();
            String password = loginCallback.getUserLoginInfo().getPassword();
            String port = loginCallback.getServerInfo().getPort();
            String url = loginCallback.getServerInfo().getUrl();
            String expDate = loginCallback.getUserLoginInfo().getExpDate();
            String isTrial = loginCallback.getUserLoginInfo().getIsTrial();
            String activeCons = loginCallback.getUserLoginInfo().getActiveCons();
            String createdAt = loginCallback.getUserLoginInfo().getCreatedAt();
            String maxConnections = loginCallback.getUserLoginInfo().getMaxConnections();
            List<String> allowedOutputFormats = loginCallback.getUserLoginInfo().getAllowedOutputFormats();
            String serverProtocal = loginCallback.getServerInfo().getServerProtocal();
            String httpsPort = loginCallback.getServerInfo().getHttpsPort();
            String rtmpPort = loginCallback.getServerInfo().getRtmpPort();
            String timezone = loginCallback.getServerInfo().getTimezone();
            if (allowedOutputFormats.size() != 0) {
                allowedOutputFormats.get(0);
            }
            this.f32542f.getSharedPreferences("loginPrefsserverurl", 0).getString(AbstractC2237a.f44454L, "").toLowerCase();
            SharedPreferences.Editor editorEdit = getSharedPreferences("loginPrefs", 0).edit();
            editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, username);
            editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, password);
            editorEdit.putString("serverPort", port);
            editorEdit.putString("serverUrl", url);
            editorEdit.putString("expDate", expDate);
            editorEdit.putString("isTrial", isTrial);
            editorEdit.putString("activeCons", activeCons);
            editorEdit.putString("createdAt", createdAt);
            editorEdit.putString("maxConnections", maxConnections);
            editorEdit.putString(AbstractC2237a.f44454L, url + ":" + port);
            editorEdit.putString("serverProtocol", serverProtocal);
            editorEdit.putString("serverPortHttps", httpsPort);
            editorEdit.putString("serverPortRtmp", rtmpPort);
            editorEdit.putString("serverTimeZone", timezone);
            editorEdit.apply();
            this.f32516D = this.f32542f.getSharedPreferences("allowedFormat", 0);
            this.f32517E = this.f32542f.getSharedPreferences("timeFormat", 0);
            this.f32518F = this.f32542f.getSharedPreferences("epgchannelupdate", 0);
            this.f32519G = this.f32542f.getSharedPreferences("automation_channels", 0);
            this.f32520H = this.f32542f.getSharedPreferences("automation_epg", 0);
            this.f32523K = this.f32516D.edit();
            this.f32521I = this.f32517E.edit();
            this.f32522J = this.f32518F.edit();
            this.f32524L = this.f32519G.edit();
            this.f32525M = this.f32520H.edit();
            SharedPreferences sharedPreferences = this.f32542f.getSharedPreferences("auto_start", 0);
            this.f32526N = sharedPreferences;
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            this.f32527O = editorEdit2;
            if (editorEdit2 != null) {
                editorEdit2.putBoolean("full_epg", true);
                this.f32527O.apply();
            }
            if (this.f32519G.getString("automation_channels", "").equals("")) {
                this.f32524L.putString("automation_channels", "checked");
                this.f32524L.apply();
            }
            if (this.f32520H.getString("automation_epg", "").equals("")) {
                this.f32525M.putString("automation_epg", "checked");
                this.f32525M.apply();
            }
            AbstractC2237a.f44491c0 = Boolean.FALSE;
            if (this.f32516D.getString("allowedFormat", "").equals("")) {
                this.f32523K.putString("allowedFormat", "ts");
                this.f32523K.apply();
            }
            if (this.f32517E.getString("timeFormat", AbstractC2237a.f44441E0).equals("")) {
                this.f32521I.putString("timeFormat", AbstractC2237a.f44441E0);
                this.f32521I.apply();
            }
            if (this.f32518F.getString("epgchannelupdate", "").equals("")) {
                this.f32522J.putString("epgchannelupdate", "all");
                this.f32522J.apply();
            }
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.g
    public void y0(String str) {
    }

    public void y1() {
        StringBuilder sb;
        List list;
        b7.e eVarA;
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f32542f).equals("m3u")) {
            sb = new StringBuilder();
            sb.append(b7.f.c(this));
            sb.append("*");
            sb.append(b7.f.d(this));
            sb.append("-");
            sb.append("playlist");
        } else {
            sb = new StringBuilder();
            sb.append(b7.f.c(this));
            sb.append("*");
            sb.append(b7.f.d(this));
            sb.append("-");
            sb.append(this.f32560s);
        }
        sb.append("-");
        sb.append(AbstractC1232b.f17695b);
        sb.append("-");
        sb.append(this.f32558q);
        sb.append("-unknown-");
        sb.append(n2());
        sb.append("-");
        sb.append(this.f32557p);
        this.f32556o = t2(sb.toString());
        ArrayList arrayList = new ArrayList();
        b7.g.f17717b = arrayList;
        arrayList.add(b7.g.a("m", "gu"));
        b7.g.f17717b.add(b7.g.a("k", b7.f.c(this)));
        b7.g.f17717b.add(b7.g.a("sc", this.f32556o));
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f32542f).equals("m3u")) {
            list = b7.g.f17717b;
            eVarA = b7.g.a("u", "playlist");
        } else {
            list = b7.g.f17717b;
            eVarA = b7.g.a("u", this.f32560s);
        }
        list.add(eVarA);
        b7.g.f17717b.add(b7.g.a("pw", "no_password"));
        b7.g.f17717b.add(b7.g.a("r", AbstractC1232b.f17695b));
        b7.g.f17717b.add(b7.g.a("av", this.f32558q));
        b7.g.f17717b.add(b7.g.a("dt", "unknown"));
        b7.g.f17717b.add(b7.g.a("d", n2()));
        b7.g.f17717b.add(b7.g.a("do", this.f32557p));
        b7.g.f17718c.b(this);
    }

    public final void y2(String str) {
        ArrayList arrayList;
        if (!AbstractC2237a.f44526o.booleanValue()) {
            if (str != null && !str.isEmpty()) {
                arrayList = new ArrayList(Arrays.asList(str.split(",")));
            }
            A2(this.f32530R);
        }
        arrayList = new ArrayList();
        arrayList.add(str);
        this.f32530R = arrayList;
        A2(this.f32530R);
    }

    public final void z2(String str) {
        AbstractC2237a.f44482Z = str;
        AbstractC2074a.b(str + "play/b2c/v1/auth").s(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f32560s).s(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, this.f32561t).w("test").t("Content-Type", "FormUrlEncoded").v(k1.e.MEDIUM).u().o(new a(str));
    }
}
