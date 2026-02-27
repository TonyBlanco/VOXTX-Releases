package com.nst.iptvsmarterstvbox.view.activity;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.options.StorageDownloadFileOptions;
import com.amplifyframework.storage.result.StorageDownloadFileResult;
import com.amplifyframework.storage.result.StorageListResult;
import com.amplifyframework.storage.result.StorageRemoveResult;
import com.amplifyframework.storage.result.StorageTransferProgress;
import com.amplifyframework.storage.result.StorageUploadFileResult;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SeriesRecentWatchDatabase;
import com.nst.iptvsmarterstvbox.view.activity.BackupAndRestoreActivity;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import m7.AbstractC2237a;
import m7.w;
import org.json.JSONObject;
import p7.C2469f;
import p7.C2471g;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class BackupAndRestoreActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Handler f29166A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f29168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppBarLayout f29169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f29170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f29171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f29172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f29173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f29174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f29175k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2858a f29176l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PopupWindow f29178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f29179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Button f29180p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RecentWatchDBHandler f29181q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SeriesRecentWatchDatabase f29182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LiveStreamDBHandler f29183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public DatabaseHandler f29184t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SharedPreferences f29185u;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Thread f29177m = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f29186v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f29187w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f29188x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f29189y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f29190z = "";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f29167B = false;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                BackupAndRestoreActivity backupAndRestoreActivity = BackupAndRestoreActivity.this;
                backupAndRestoreActivity.new i((Activity) backupAndRestoreActivity.f29175k).show();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(BackupAndRestoreActivity.this.f29175k);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(BackupAndRestoreActivity.this.f29175k);
                String strA = w.A(string);
                TextView textView = BackupAndRestoreActivity.this.f29173i;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = BackupAndRestoreActivity.this.f29172h;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BackupAndRestoreActivity.this.f29178n.dismiss();
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f29195a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ BackupAndRestoreActivity f29196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String[] f29197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ EditText f29198e;

        public e(String str, BackupAndRestoreActivity backupAndRestoreActivity, String[] strArr, EditText editText) {
            this.f29195a = str;
            this.f29196c = backupAndRestoreActivity;
            this.f29197d = strArr;
            this.f29198e = editText;
        }

        public static /* synthetic */ void g(StorageTransferProgress storageTransferProgress) {
            Log.i("MyAmplifyApp", "Fraction completed: " + storageTransferProgress.getFractionCompleted());
        }

        public final void d(StorageDownloadFileResult storageDownloadFileResult) {
            BackupAndRestoreActivity.this.new l().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, storageDownloadFileResult.getFile().getParent());
        }

        public final void e(StorageException storageException) {
            BackupAndRestoreActivity.this.f29189y = "405";
            w.X();
            try {
                BackupAndRestoreActivity.this.f29166A.obtainMessage(1, BackupAndRestoreActivity.this.f29189y).sendToTarget();
            } catch (Exception unused) {
            }
        }

        public final boolean f() {
            this.f29197d[0] = String.valueOf(this.f29198e.getText());
            String[] strArr = this.f29197d;
            if (strArr != null && strArr[0].equals("")) {
                Toast.makeText(this.f29196c, BackupAndRestoreActivity.this.getResources().getString(a7.j.f12965C1), 1).show();
                return false;
            }
            BackupAndRestoreActivity.this.f29190z = this.f29197d[0];
            return true;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (f()) {
                BackupAndRestoreActivity.this.f29178n.dismiss();
                if (this.f29195a.equals("backup")) {
                    BackupAndRestoreActivity.this.new k().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                    return;
                }
                if (this.f29195a.equals("download")) {
                    Log.e("honey", "download backup started");
                    w.M0(this.f29196c);
                    String string = BackupAndRestoreActivity.this.f29185u.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                    String string2 = BackupAndRestoreActivity.this.f29185u.getString("serverUrl", "");
                    String strO0 = w.o0(string + "-" + string2);
                    String strO02 = w.o0(string + "-" + string2 + "-" + BackupAndRestoreActivity.this.f29190z + "*NB!@#12ZKWd");
                    try {
                        Amplify.Storage.downloadFile(strO0 + "/" + strO02 + ".zip", new File(BackupAndRestoreActivity.this.getApplicationContext().getFilesDir().getParent() + "/download.zip"), StorageDownloadFileOptions.defaultInstance(), new Consumer() { // from class: p7.h
                            @Override // com.amplifyframework.core.Consumer
                            public final void accept(Object obj) {
                                BackupAndRestoreActivity.e.g((StorageTransferProgress) obj);
                            }
                        }, new Consumer() { // from class: p7.i
                            @Override // com.amplifyframework.core.Consumer
                            public final void accept(Object obj) {
                                this.f46652a.d((StorageDownloadFileResult) obj);
                            }
                        }, new Consumer() { // from class: p7.j
                            @Override // com.amplifyframework.core.Consumer
                            public final void accept(Object obj) {
                                this.f46654a.e((StorageException) obj);
                            }
                        });
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BackupAndRestoreActivity.this.f29178n.dismiss();
        }
    }

    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f29201a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ EditText f29202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f29203d;

        public g(String[] strArr, EditText editText, Activity activity) {
            this.f29201a = strArr;
            this.f29202c = editText;
            this.f29203d = activity;
        }

        public final boolean a() {
            this.f29201a[0] = String.valueOf(this.f29202c.getText());
            String[] strArr = this.f29201a;
            if (strArr != null && strArr[0].equals("")) {
                Toast.makeText(this.f29203d, BackupAndRestoreActivity.this.getResources().getString(a7.j.f12965C1), 1).show();
                return false;
            }
            BackupAndRestoreActivity.this.f29190z = this.f29201a[0];
            return true;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a()) {
                BackupAndRestoreActivity.this.f29178n.dismiss();
                BackupAndRestoreActivity.this.f29167B = true;
                BackupAndRestoreActivity.this.new k().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            }
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    BackupAndRestoreActivity.this.T1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class i extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f29206a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f29207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f29208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f29209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ImageView f29210f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f29211g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public LinearLayout f29212h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f29214a;

            public a(View view) {
                this.f29214a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f29214a;
                    if (view2 == null || view2.getTag() == null || !this.f29214a.getTag().equals("1")) {
                        View view3 = this.f29214a;
                        if (view3 == null || view3.getTag() == null || !this.f29214a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = i.this.f29212h;
                        }
                    } else {
                        linearLayout = i.this.f29211g;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f29214a;
                    if (view4 == null || view4.getTag() == null || !this.f29214a.getTag().equals("1")) {
                        View view5 = this.f29214a;
                        if (view5 == null || view5.getTag() == null || !this.f29214a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = i.this.f29212h;
                        }
                    } else {
                        linearLayout = i.this.f29211g;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public i(Activity activity) {
            super(activity);
            this.f29206a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (view.getId() == a7.f.f12422i1) {
                    dismiss();
                } else {
                    if (view.getId() != a7.f.f12341a1) {
                        return;
                    }
                    dismiss();
                    BackupAndRestoreActivity backupAndRestoreActivity = BackupAndRestoreActivity.this;
                    backupAndRestoreActivity.Z1((BackupAndRestoreActivity) backupAndRestoreActivity.f29175k);
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            TextView textView;
            StringBuilder sb;
            Resources resources;
            int i9;
            String string;
            ImageView imageView;
            int i10;
            super.onCreate(bundle);
            setContentView(BackupAndRestoreActivity.this.f29176l.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12843n2 : a7.g.f12837m2);
            this.f29207c = (TextView) findViewById(a7.f.f12422i1);
            this.f29208d = (TextView) findViewById(a7.f.f12341a1);
            this.f29211g = (LinearLayout) findViewById(a7.f.f12480n8);
            this.f29212h = (LinearLayout) findViewById(a7.f.f9);
            this.f29209e = (TextView) findViewById(a7.f.fm);
            this.f29210f = (ImageView) findViewById(a7.f.f12487o5);
            if (BackupAndRestoreActivity.this.f29189y != null && BackupAndRestoreActivity.this.f29189y.equals("uploaded")) {
                this.f29211g.setVisibility(8);
                this.f29209e.setText(BackupAndRestoreActivity.this.getResources().getString(a7.j.f13123S));
                imageView = this.f29210f;
                i10 = a7.e.f12007g0;
            } else {
                if (BackupAndRestoreActivity.this.f29189y != null && BackupAndRestoreActivity.this.f29189y.equals("downloaded")) {
                    try {
                        Log.e("honey", "restart your application");
                        this.f29211g.setVisibility(8);
                        this.f29209e.setText(BackupAndRestoreActivity.this.getResources().getString(a7.j.f13093P));
                        this.f29210f.setImageResource(a7.e.f12007g0);
                    } catch (Exception unused) {
                    }
                    this.f29207c.setOnClickListener(this);
                    this.f29208d.setOnClickListener(this);
                    TextView textView2 = this.f29207c;
                    textView2.setOnFocusChangeListener(new a(textView2));
                    TextView textView3 = this.f29208d;
                    textView3.setOnFocusChangeListener(new a(textView3));
                }
                if (BackupAndRestoreActivity.this.f29189y == null || !BackupAndRestoreActivity.this.f29189y.equals("error3")) {
                    if (BackupAndRestoreActivity.this.f29189y == null || !BackupAndRestoreActivity.this.f29189y.equals("405")) {
                        this.f29211g.setVisibility(8);
                        textView = this.f29209e;
                        sb = new StringBuilder();
                        resources = BackupAndRestoreActivity.this.getResources();
                        i9 = a7.j.f13153V1;
                    } else {
                        this.f29211g.setVisibility(8);
                        textView = this.f29209e;
                        sb = new StringBuilder();
                        resources = BackupAndRestoreActivity.this.getResources();
                        i9 = a7.j.f13113R;
                    }
                    sb.append(resources.getString(i9));
                    sb.append(" ");
                    sb.append(BackupAndRestoreActivity.this.f29189y);
                    string = sb.toString();
                } else {
                    this.f29211g.setVisibility(0);
                    textView = this.f29209e;
                    string = BackupAndRestoreActivity.this.getResources().getString(a7.j.f13103Q);
                }
                textView.setText(string);
                imageView = this.f29210f;
                i10 = a7.e.f11944N2;
            }
            imageView.setImageResource(i10);
            this.f29207c.setOnClickListener(this);
            this.f29208d.setOnClickListener(this);
            TextView textView22 = this.f29207c;
            textView22.setOnFocusChangeListener(new a(textView22));
            TextView textView32 = this.f29208d;
            textView32.setOnFocusChangeListener(new a(textView32));
        }
    }

    public static class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f29216a;

        public j(View view) {
            this.f29216a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29216a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29216a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            View view3;
            View view4;
            View view5;
            int i9;
            View view6;
            View view7;
            if (z9) {
                f9 = z9 ? 1.05f : 1.0f;
                View view8 = this.f29216a;
                if ((view8 == null || view8.getTag() == null || !this.f29216a.getTag().equals("1")) && ((view6 = this.f29216a) == null || view6.getTag() == null || !this.f29216a.getTag().equals("8"))) {
                    View view9 = this.f29216a;
                    if ((view9 == null || view9.getTag() == null || !this.f29216a.getTag().equals("2")) && ((view7 = this.f29216a) == null || view7.getTag() == null || !this.f29216a.getTag().equals("9"))) {
                        return;
                    }
                    a(f9);
                    b(f9);
                    view5 = this.f29216a;
                    i9 = a7.e.f12024k1;
                } else {
                    a(f9);
                    b(f9);
                    view5 = this.f29216a;
                    i9 = a7.e.f12042p;
                }
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(f9);
                b(f9);
                View view10 = this.f29216a;
                if ((view10 == null || view10.getTag() == null || !this.f29216a.getTag().equals("1")) && (((view2 = this.f29216a) == null || view2.getTag() == null || !this.f29216a.getTag().equals("8")) && (((view3 = this.f29216a) == null || view3.getTag() == null || !this.f29216a.getTag().equals("2")) && ((view4 = this.f29216a) == null || view4.getTag() == null || !this.f29216a.getTag().equals("9"))))) {
                    return;
                }
                view5 = this.f29216a;
                i9 = a7.e.f12038o;
            }
            view5.setBackgroundResource(i9);
        }
    }

    public class k extends AsyncTask {
        public k() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(BackupAndRestoreActivity.this.a2());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                BackupAndRestoreActivity.this.e2();
            } else {
                w.X();
                Toast.makeText(BackupAndRestoreActivity.this.f29175k, "Error while uploading backup.", 0).show();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            w.N0(BackupAndRestoreActivity.this.f29175k);
        }
    }

    public class l extends AsyncTask {
        public l() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return BackupAndRestoreActivity.this.b2(strArr[0]);
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            try {
                File file = new File(BackupAndRestoreActivity.this.getFilesDir().getParent() + "/file.json");
                if (file.exists()) {
                    w.t(file);
                }
            } catch (Exception unused) {
            }
            Log.e("honey", "download backup done");
            BackupAndRestoreActivity.this.f29189y = "downloaded";
            w.X();
            try {
                BackupAndRestoreActivity.this.f29166A.obtainMessage(1, BackupAndRestoreActivity.this.f29189y).sendToTarget();
            } catch (Exception unused2) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    private void P1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void U1() {
        Button button = this.f29170f;
        if (button != null) {
            button.setOnFocusChangeListener(new j(button));
            this.f29170f.requestFocus();
            this.f29170f.requestFocusFromTouch();
        }
        Button button2 = this.f29171g;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new j(button2));
        }
    }

    private void W1() {
        this.f29184t = new DatabaseHandler(this.f29175k);
        this.f29183s = new LiveStreamDBHandler(this.f29175k);
        this.f29181q = new RecentWatchDBHandler(this.f29175k);
        this.f29182r = new SeriesRecentWatchDatabase(this.f29175k);
        this.f29185u = getSharedPreferences("loginPrefs", 0);
    }

    public final void O1(StorageException storageException) {
        this.f29189y = "401";
        w.X();
        try {
            this.f29166A.obtainMessage(1, this.f29189y).sendToTarget();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q1(com.amplifyframework.storage.result.StorageListResult r12) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.BackupAndRestoreActivity.Q1(com.amplifyframework.storage.result.StorageListResult):void");
    }

    public final void R1(StorageException storageException) {
        try {
            File file = new File(getFilesDir().getParent() + "/backup_database.zip");
            if (file.exists()) {
                w.t(file);
            }
        } catch (Exception unused) {
        }
        try {
            File file2 = new File(getFilesDir().getParent() + "/file.json");
            if (file2.exists()) {
                w.t(file2);
            }
        } catch (Exception unused2) {
        }
        Log.e("honey", "backup error");
        this.f29189y = "404";
        w.X();
        try {
            this.f29166A.obtainMessage(1, this.f29189y).sendToTarget();
        } catch (Exception unused3) {
        }
    }

    /* JADX INFO: renamed from: S1, reason: merged with bridge method [inline-methods] */
    public final void X1(StorageRemoveResult storageRemoveResult, String str) {
        File file = new File(getFilesDir().getParent() + "/backup_database.zip");
        if (file.exists()) {
            Amplify.Storage.uploadFile(this.f29188x + "/" + str, file, new C2469f(this), new C2471g(this));
        }
    }

    public void T1() {
        runOnUiThread(new c());
    }

    public String V1(String str) {
        String[] strArrSplit = str.split("/");
        return strArrSplit.length == 0 ? "" : strArrSplit[strArrSplit.length - 1];
    }

    public final void Y1(BackupAndRestoreActivity backupAndRestoreActivity, String str) {
        try {
            View viewInflate = ((LayoutInflater) backupAndRestoreActivity.getSystemService("layout_inflater")).inflate(this.f29176l.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12697P4 : a7.g.f12691O4, (RelativeLayout) backupAndRestoreActivity.findViewById(a7.f.Ve));
            PopupWindow popupWindow = new PopupWindow(backupAndRestoreActivity);
            this.f29178n = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f29178n.setWidth(-1);
            this.f29178n.setHeight(-1);
            this.f29178n.setFocusable(true);
            this.f29178n.showAtLocation(viewInflate, 17, 0, 0);
            this.f29179o = (Button) viewInflate.findViewById(a7.f.f12167I0);
            TextView textView = (TextView) viewInflate.findViewById(a7.f.Nk);
            if (str.equals("backup")) {
                ((TextView) viewInflate.findViewById(a7.f.Jh)).setText(getResources().getString(a7.j.f13167W6));
                textView.setVisibility(0);
                textView.setText(getResources().getString(a7.j.f13133T));
            } else if (str.equals("download")) {
                ((TextView) viewInflate.findViewById(a7.f.Jh)).setText(getResources().getString(a7.j.f13161W0));
                textView.setVisibility(8);
            }
            this.f29180p = (Button) viewInflate.findViewById(a7.f.f12482o0);
            Button button = this.f29179o;
            if (button != null) {
                button.setOnFocusChangeListener(new j(button));
            }
            Button button2 = this.f29180p;
            if (button2 != null) {
                button2.setOnFocusChangeListener(new j(button2));
            }
            EditText editText = (EditText) viewInflate.findViewById(a7.f.f12444k3);
            if (backupAndRestoreActivity.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText.setGravity(21);
            }
            this.f29180p.setOnClickListener(new d());
            this.f29179o.setOnClickListener(new e(str, backupAndRestoreActivity, new String[1], editText));
        } catch (NullPointerException | Exception unused) {
        }
    }

    public final void Z1(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(this.f29176l.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12697P4 : a7.g.f12691O4, (RelativeLayout) activity.findViewById(a7.f.Ve));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f29178n = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f29178n.setWidth(-1);
            this.f29178n.setHeight(-1);
            this.f29178n.setFocusable(true);
            this.f29178n.showAtLocation(viewInflate, 17, 0, 0);
            EditText editText = (EditText) viewInflate.findViewById(a7.f.f12444k3);
            TextView textView = (TextView) viewInflate.findViewById(a7.f.Nk);
            textView.setText(getResources().getString(a7.j.f13345o8));
            textView.setTextColor(getResources().getColor(a7.c.f11874y));
            editText.setHint(getResources().getString(a7.j.f12955B1));
            this.f29179o = (Button) viewInflate.findViewById(a7.f.f12167I0);
            this.f29180p = (Button) viewInflate.findViewById(a7.f.f12482o0);
            Button button = this.f29179o;
            if (button != null) {
                button.setOnFocusChangeListener(new j(button));
            }
            Button button2 = this.f29180p;
            if (button2 != null) {
                button2.setOnFocusChangeListener(new j(button2));
            }
            if (activity.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText.setGravity(21);
            }
            this.f29180p.setOnClickListener(new f());
            this.f29179o.setOnClickListener(new g(new String[1], editText, activity));
        } catch (NullPointerException | Exception unused) {
        }
    }

    public final boolean a2() {
        boolean z9;
        boolean z10;
        Log.e("honey", "backup started");
        this.f29189y = "";
        try {
            ArrayList<FavouriteDBModel> allFavouritesIDString = this.f29184t.getAllFavouritesIDString();
            ArrayList<FavouriteDBModel> allLiveWatchedIDString = this.f29183s.getAllLiveWatchedIDString();
            ArrayList<LiveStreamsDBModel> allVodContiueWatchingforBackup = this.f29181q.getAllVodContiueWatchingforBackup();
            ArrayList<GetEpisdoeDetailsCallback> allSeriesContiueWatchingforBackup = this.f29182r.getAllSeriesContiueWatchingforBackup();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("favourites_live", "");
            } catch (Exception unused) {
            }
            try {
                jSONObject.put("favourites_movies", "");
            } catch (Exception unused2) {
            }
            try {
                jSONObject.put("favourites_series", "");
            } catch (Exception unused3) {
            }
            try {
                jSONObject.put("channels_history", "");
            } catch (Exception unused4) {
            }
            try {
                jSONObject.put("movies_continue_watching", "");
            } catch (Exception unused5) {
            }
            try {
                jSONObject.put("series_continue_watching", "");
            } catch (Exception unused6) {
            }
            try {
                jSONObject.put("getRecentlyAddedLimit", String.valueOf(this.f29176l.y()));
            } catch (Exception unused7) {
            }
            try {
                jSONObject.put("getAutoClearCache", String.valueOf(this.f29176l.c()));
            } catch (Exception unused8) {
            }
            try {
                jSONObject.put("getShowEPGInChannelsList", String.valueOf(this.f29176l.B()));
            } catch (Exception unused9) {
            }
            try {
                jSONObject.put("getAutoplayChannelInLive", String.valueOf(this.f29176l.i()));
            } catch (Exception unused10) {
            }
            try {
                jSONObject.put("getRecentlyWatchedLimitLive", String.valueOf(this.f29176l.z()));
            } catch (Exception unused11) {
            }
            try {
                jSONObject.put("getAutoPlayEpisode", this.f29176l.d());
            } catch (Exception unused12) {
            }
            try {
                jSONObject.put("getAutoStartOnBoot", String.valueOf(this.f29176l.f().booleanValue()));
            } catch (Exception unused13) {
            }
            try {
                jSONObject.put("getfullEPG", String.valueOf(this.f29176l.H().booleanValue()));
            } catch (Exception unused14) {
            }
            try {
                jSONObject.put("getActiveSubtitle", String.valueOf(this.f29176l.b().booleanValue()));
            } catch (Exception unused15) {
            }
            try {
                jSONObject.put("getAutoPlayNextEpisode", String.valueOf(this.f29176l.e().booleanValue()));
            } catch (Exception unused16) {
            }
            if (allFavouritesIDString != null && allFavouritesIDString.size() > 0) {
                for (int i9 = 0; i9 < allFavouritesIDString.size(); i9++) {
                    if (allFavouritesIDString.get(i9).getType() != null && allFavouritesIDString.get(i9).getType().equals("live")) {
                        try {
                            jSONObject.put("favourites_live", allFavouritesIDString.get(i9).getCommaSeparatedStreamIDs());
                        } catch (Exception unused17) {
                        }
                    } else if (allFavouritesIDString.get(i9).getType() != null && allFavouritesIDString.get(i9).getType().equals("vod")) {
                        jSONObject.put("favourites_movies", allFavouritesIDString.get(i9).getCommaSeparatedStreamIDs());
                    } else if (allFavouritesIDString.get(i9).getType() != null && allFavouritesIDString.get(i9).getType().equals("series")) {
                        jSONObject.put("favourites_series", allFavouritesIDString.get(i9).getCommaSeparatedStreamIDs());
                    }
                }
            }
            if (allLiveWatchedIDString != null && allLiveWatchedIDString.size() > 0) {
                for (int i10 = 0; i10 < allLiveWatchedIDString.size(); i10++) {
                    if (allLiveWatchedIDString.get(i10).getType() != null && allLiveWatchedIDString.get(i10).getType().equals("api")) {
                        try {
                            jSONObject.put("channels_history", allLiveWatchedIDString.get(i10).getCommaSeparatedStreamIDs());
                        } catch (Exception unused18) {
                        }
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            if (allVodContiueWatchingforBackup == null || allVodContiueWatchingforBackup.size() <= 0) {
                z9 = false;
            } else {
                int i11 = 0;
                z9 = false;
                while (i11 < allVodContiueWatchingforBackup.size()) {
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("stream_id", allVodContiueWatchingforBackup.get(i11).getStreamId());
                    } catch (Exception unused19) {
                    }
                    try {
                        jSONObject3.put("movie_elapsed_time", allVodContiueWatchingforBackup.get(i11).getMovieElapsedTime());
                    } catch (Exception unused20) {
                    }
                    try {
                        jSONObject3.put("movie_duration", allVodContiueWatchingforBackup.get(i11).getMovieDuraton());
                    } catch (Exception unused21) {
                    }
                    try {
                        jSONObject3.put("is_watched", allVodContiueWatchingforBackup.get(i11).getIsRecentlyWatched());
                    } catch (Exception unused22) {
                    }
                    try {
                        jSONObject2.put(String.valueOf(i11), jSONObject3);
                    } catch (Exception unused23) {
                    }
                    i11++;
                    z9 = true;
                }
            }
            if (z9) {
                try {
                    jSONObject.put("movies_continue_watching", jSONObject2);
                } catch (Exception unused24) {
                }
            }
            JSONObject jSONObject4 = new JSONObject();
            if (allSeriesContiueWatchingforBackup == null || allSeriesContiueWatchingforBackup.size() <= 0) {
                z10 = false;
            } else {
                z10 = false;
                for (int i12 = 0; i12 < allSeriesContiueWatchingforBackup.size(); i12++) {
                    JSONObject jSONObject5 = new JSONObject();
                    try {
                        jSONObject5.put("episode_id", allSeriesContiueWatchingforBackup.get(i12).getId());
                        jSONObject5.put("episode_name", allSeriesContiueWatchingforBackup.get(i12).getTitle());
                        jSONObject5.put("container_extension", allSeriesContiueWatchingforBackup.get(i12).getContainerExtension());
                        jSONObject5.put("added", allSeriesContiueWatchingforBackup.get(i12).getAdded());
                        jSONObject5.put("elapsed_time", allSeriesContiueWatchingforBackup.get(i12).getElapsed_time());
                        jSONObject5.put("image", allSeriesContiueWatchingforBackup.get(i12).getMovieImage());
                        jSONObject5.put("series_main_image", allSeriesContiueWatchingforBackup.get(i12).getMainSeriesImg());
                        jSONObject5.put("is_recent_watched", allSeriesContiueWatchingforBackup.get(i12).getIsRecentlyWatched());
                        jSONObject5.put("season_num", allSeriesContiueWatchingforBackup.get(i12).getSeasonNumber());
                        jSONObject5.put("episode_num", allSeriesContiueWatchingforBackup.get(i12).getEpisodeNumber());
                        jSONObject5.put("episode_duration_sec", allSeriesContiueWatchingforBackup.get(i12).getDurationSec());
                        jSONObject5.put("series_id", allSeriesContiueWatchingforBackup.get(i12).getSeriesId());
                        try {
                            jSONObject4.put(String.valueOf(i12), jSONObject5);
                        } catch (Exception unused25) {
                        }
                        z10 = true;
                    } catch (Exception unused26) {
                    }
                }
            }
            if (z10) {
                try {
                    jSONObject.put("series_continue_watching", jSONObject4);
                } catch (Exception unused27) {
                }
            }
            try {
                File file = new File(getFilesDir().getParent() + "/file.json");
                if (file.exists()) {
                    w.t(file);
                }
            } catch (Exception unused28) {
            }
            try {
                FileWriter fileWriter = new FileWriter(new File(getFilesDir().getParent(), "file.json"));
                fileWriter.write(jSONObject.toString());
                fileWriter.close();
            } catch (Exception unused29) {
            }
            try {
                File file2 = new File(getFilesDir().getParent() + "/backup_database.zip");
                if (file2.exists()) {
                    w.t(file2);
                }
            } catch (Exception unused30) {
            }
            String str = this.f29175k.getApplicationInfo().dataDir;
            StringBuilder sb = new StringBuilder();
            sb.append(getFilesDir().getParent());
            sb.append("/backup_database.zip");
            return g2(str, sb.toString());
        } catch (Exception unused31) {
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:0|2|(3:415|3|(1:5))|(42:417|6|359|7|(1:9)|10|366|11|(2:13|(1:(1:21))(1:17))|365|404|22|(2:24|(1:(1:32))(1:28))|358|33|(2:35|(1:(1:43))(1:39))|390|44|(1:46)|378|47|(1:49)|384|50|(3:52|(1:(1:61))(1:56)|57)|407|63|(3:65|(1:(1:74))(1:69)|70)|342|76|(3:78|(1:(1:87))(1:82)|83)|402|89|(3:91|(1:(1:101))(1:95)|96)|103|(1:(1:125)(1:124))(1:117)|126|(1:128)|129|(1:134)(1:133)|135|(1:141)(1:140))|(1:(21:(1:157)|158|(1:160)|161|(1:170)|171|(1:173)|368|174|(5:178|(2:180|425)(2:181|424)|182|176|175)|423|183|(2:185|(3:187|(3:191|(4:194|(7:370|196|409|197|400|198|427)(1:428)|199|192)|426)|(1:203)))|204|(1:206)|207|(7:208|209|(4:421|211|(2:213|431)(2:214|430)|215)(1:429)|341|310|313|314)|216|(5:218|219|419|220|(4:222|(3:226|(4:229|(2:230|(1:(2:437|302)(56:405|235|372|238|348|241|242|411|243|394|247|248|386|249|382|253|254|374|255|352|259|260|344|261|396|265|266|388|267|361|271|272|376|273|354|277|278|346|279|398|283|284|392|285|363|289|290|380|291|356|295|296|350|297|301|434))(3:435|303|433))|304|227)|432)|305|(3:307|413|308)(1:310))(1:311))(0)|313|314)(1:153))(1:148)|149|158|(0)|161|(4:164|166|168|170)|171|(0)|368|174|(2:176|175)|423|183|(0)|204|(0)|207|(8:208|209|(0)(0)|341|310|313|314|215)|216|(0)(0)|313|314) */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02cc A[Catch: Exception -> 0x0806, TryCatch #38 {Exception -> 0x0806, blocks: (B:6:0x0047, B:105:0x021e, B:108:0x0226, B:126:0x0262, B:128:0x0266, B:129:0x0271, B:131:0x0275, B:133:0x027b, B:135:0x0283, B:138:0x0289, B:140:0x028f, B:143:0x0299, B:146:0x02a1, B:148:0x02a7, B:149:0x02ac, B:158:0x02c8, B:160:0x02cc, B:161:0x02cf, B:164:0x02d5, B:166:0x02db, B:168:0x02e3, B:170:0x02e9, B:171:0x02ee, B:173:0x02f2, B:204:0x0419, B:206:0x041d, B:207:0x0420, B:208:0x0439, B:151:0x02b2, B:153:0x02b8, B:155:0x02bd, B:157:0x02c3, B:112:0x022f, B:115:0x0237, B:119:0x0240, B:122:0x0248, B:124:0x024e), top: B:417:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f2 A[Catch: Exception -> 0x0806, TRY_LEAVE, TryCatch #38 {Exception -> 0x0806, blocks: (B:6:0x0047, B:105:0x021e, B:108:0x0226, B:126:0x0262, B:128:0x0266, B:129:0x0271, B:131:0x0275, B:133:0x027b, B:135:0x0283, B:138:0x0289, B:140:0x028f, B:143:0x0299, B:146:0x02a1, B:148:0x02a7, B:149:0x02ac, B:158:0x02c8, B:160:0x02cc, B:161:0x02cf, B:164:0x02d5, B:166:0x02db, B:168:0x02e3, B:170:0x02e9, B:171:0x02ee, B:173:0x02f2, B:204:0x0419, B:206:0x041d, B:207:0x0420, B:208:0x0439, B:151:0x02b2, B:153:0x02b8, B:155:0x02bd, B:157:0x02c3, B:112:0x022f, B:115:0x0237, B:119:0x0240, B:122:0x0248, B:124:0x024e), top: B:417:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0322 A[Catch: Exception -> 0x0419, TRY_ENTER, TryCatch #13 {Exception -> 0x0419, blocks: (B:174:0x02fd, B:175:0x0316, B:178:0x0322, B:180:0x0335, B:183:0x039a, B:185:0x03a0, B:187:0x03af, B:189:0x03b5, B:192:0x03bc, B:194:0x03c2, B:201:0x040e, B:203:0x0414), top: B:368:0x02fd }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03a0 A[Catch: Exception -> 0x0419, TryCatch #13 {Exception -> 0x0419, blocks: (B:174:0x02fd, B:175:0x0316, B:178:0x0322, B:180:0x0335, B:183:0x039a, B:185:0x03a0, B:187:0x03af, B:189:0x03b5, B:192:0x03bc, B:194:0x03c2, B:201:0x040e, B:203:0x0414), top: B:368:0x02fd }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x041d A[Catch: Exception -> 0x0806, TryCatch #38 {Exception -> 0x0806, blocks: (B:6:0x0047, B:105:0x021e, B:108:0x0226, B:126:0x0262, B:128:0x0266, B:129:0x0271, B:131:0x0275, B:133:0x027b, B:135:0x0283, B:138:0x0289, B:140:0x028f, B:143:0x0299, B:146:0x02a1, B:148:0x02a7, B:149:0x02ac, B:158:0x02c8, B:160:0x02cc, B:161:0x02cf, B:164:0x02d5, B:166:0x02db, B:168:0x02e3, B:170:0x02e9, B:171:0x02ee, B:173:0x02f2, B:204:0x0419, B:206:0x041d, B:207:0x0420, B:208:0x0439, B:151:0x02b2, B:153:0x02b8, B:155:0x02bd, B:157:0x02c3, B:112:0x022f, B:115:0x0237, B:119:0x0240, B:122:0x0248, B:124:0x024e), top: B:417:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x059f A[Catch: Exception -> 0x0801, TRY_LEAVE, TryCatch #40 {Exception -> 0x0801, blocks: (B:211:0x045d, B:213:0x0476, B:216:0x058f, B:218:0x059f, B:224:0x05c3, B:226:0x05c9, B:227:0x05d1, B:229:0x05d7, B:230:0x05f0, B:233:0x05f8, B:301:0x06f8, B:302:0x0779, B:305:0x07f2), top: B:421:0x045d }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x045d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x058f A[EDGE_INSN: B:429:0x058f->B:216:0x058f BREAK  A[LOOP:2: B:208:0x0439->B:215:0x0582], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean b2(java.lang.String r35) {
        /*
            Method dump skipped, instruction units count: 2058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.BackupAndRestoreActivity.b2(java.lang.String):java.lang.Boolean");
    }

    public final void c2(StorageException storageException) {
        try {
            File file = new File(getFilesDir().getParent() + "/backup_database.zip");
            if (file.exists()) {
                w.t(file);
            }
        } catch (Exception unused) {
        }
        try {
            File file2 = new File(getFilesDir().getParent() + "/file.json");
            if (file2.exists()) {
                w.t(file2);
            }
        } catch (Exception unused2) {
        }
        Log.e("honey", "backup error");
        this.f29189y = "403";
        w.X();
        try {
            this.f29166A.obtainMessage(1, this.f29189y).sendToTarget();
        } catch (Exception unused3) {
        }
    }

    public final boolean d2(String str, String str2) {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str + str2)));
            byte[] bArr = new byte[1024];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return true;
                }
                String name = nextEntry.getName();
                if (name.contains("/com.nst.iptvsmarterstvbox/")) {
                    name = name.replaceAll("/com.nst.iptvsmarterstvbox/", "");
                }
                if (nextEntry.isDirectory()) {
                    new File(str + name).mkdirs();
                } else {
                    FileOutputStream fileOutputStream = new FileOutputStream(str + name);
                    while (true) {
                        int i9 = zipInputStream.read(bArr);
                        if (i9 == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i9);
                    }
                    fileOutputStream.close();
                    zipInputStream.closeEntry();
                }
            }
        } catch (IOException e9) {
            e9.printStackTrace();
            return false;
        }
    }

    public final void e2() {
        try {
            this.f29186v = this.f29185u.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
            this.f29187w = this.f29185u.getString("serverUrl", "");
            String strO0 = w.o0(this.f29186v + "-" + this.f29187w);
            this.f29188x = strO0;
            Amplify.Storage.list(strO0, new Consumer() { // from class: p7.b
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    this.f46631a.Q1((StorageListResult) obj);
                }
            }, new Consumer() { // from class: p7.c
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    this.f46634a.O1((StorageException) obj);
                }
            });
        } catch (Exception e9) {
            Log.e("Exception", "Upload failed", e9);
            try {
                File file = new File(getFilesDir().getParent() + "/backup_database.zip");
                if (file.exists()) {
                    w.t(file);
                }
            } catch (Exception unused) {
            }
            try {
                File file2 = new File(getFilesDir().getParent() + "/file.json");
                if (file2.exists()) {
                    w.t(file2);
                }
            } catch (Exception unused2) {
            }
            this.f29189y = "402";
            w.X();
            try {
                this.f29166A.obtainMessage(1, this.f29189y).sendToTarget();
            } catch (Exception unused3) {
            }
        }
    }

    public final void f2(StorageUploadFileResult storageUploadFileResult) {
        try {
            File file = new File(getFilesDir().getParent() + "/backup_database.zip");
            if (file.exists()) {
                w.t(file);
            }
        } catch (Exception unused) {
        }
        try {
            File file2 = new File(getFilesDir().getParent() + "/file.json");
            if (file2.exists()) {
                w.t(file2);
            }
        } catch (Exception unused2) {
        }
        Log.e("honey", "backup finished");
        this.f29189y = "uploaded";
        w.X();
        try {
            this.f29166A.obtainMessage(1, this.f29189y).sendToTarget();
        } catch (Exception unused3) {
        }
    }

    public boolean g2(String str, String str2) {
        File file = new File(str);
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(str2)));
            if (!file.isDirectory()) {
                byte[] bArr = new byte[2048];
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str), 2048);
                ZipEntry zipEntry = new ZipEntry(V1(str));
                zipEntry.setTime(file.lastModified());
                zipOutputStream.putNextEntry(zipEntry);
                while (true) {
                    int i9 = bufferedInputStream.read(bArr, 0, 2048);
                    if (i9 == -1) {
                        break;
                    }
                    zipOutputStream.write(bArr, 0, i9);
                }
            } else {
                h2(zipOutputStream, file, file.getParent().length());
            }
            zipOutputStream.close();
            return true;
        } catch (Exception e9) {
            e9.printStackTrace();
            return false;
        }
    }

    public final void h2(ZipOutputStream zipOutputStream, File file, int i9) {
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory() && file2.getName().equals("shared_prefs")) {
                if (file2.isDirectory()) {
                    h2(zipOutputStream, file2, i9);
                }
            } else if (!file2.isDirectory() && !file2.getName().equals("backup_database.zip") && (file2.getName().equals("Accept_clicked.xml") || file2.getName().equals("allowedFormat.xml") || file2.getName().equals("automation_channels.xml") || file2.getName().equals("automation_epg.xml") || file2.getName().equals("cacheClearCount.xml") || file2.getName().equals("epgchannelupdate.xml") || file2.getName().equals("pref.using_infbuf.xml") || file2.getName().equals("pref.using_media_codec.xml") || file2.getName().equals("pref.using_opengl.xml") || file2.getName().equals("pref.using_opensl_es.xml") || file2.getName().equals("pref.using_buffer_size") || file2.getName().equals("timeFormat.xml") || file2.getName().equals("showPopup.xml") || file2.getName().equals("file.json"))) {
                try {
                    byte[] bArr = new byte[2048];
                    String path = file2.getPath();
                    String strSubstring = path.substring(i9);
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path), 2048);
                    ZipEntry zipEntry = new ZipEntry(strSubstring);
                    zipEntry.setTime(file2.lastModified());
                    zipOutputStream.putNextEntry(zipEntry);
                    while (true) {
                        int i10 = bufferedInputStream.read(bArr, 0, 2048);
                        if (i10 == -1) {
                            break;
                        } else {
                            zipOutputStream.write(bArr, 0, i10);
                        }
                    }
                    bufferedInputStream.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        if (view.getId() == a7.f.Bj) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            return;
        }
        if (view.getId() == a7.f.f12421i0) {
            str = "backup";
        } else if (view.getId() != a7.f.f12593z0) {
            return;
        } else {
            str = "download";
        }
        Y1(this, str);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f29175k = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f29175k);
        this.f29176l = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12840n : a7.g.f12834m);
        this.f29168d = (Toolbar) findViewById(a7.f.kh);
        this.f29169e = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f29170f = (Button) findViewById(a7.f.f12421i0);
        this.f29171g = (Button) findViewById(a7.f.f12593z0);
        this.f29170f.setOnClickListener(this);
        this.f29171g.setOnClickListener(this);
        this.f29172h = (TextView) findViewById(a7.f.f12129E2);
        this.f29173i = (TextView) findViewById(a7.f.gh);
        this.f29174j = (ImageView) findViewById(a7.f.Xa);
        W1();
        U1();
        try {
            this.f29166A = new a(Looper.getMainLooper());
        } catch (Exception unused) {
        }
        P1();
        r1((Toolbar) findViewById(a7.f.kh));
        getWindow().setFlags(1024, 1024);
        Thread thread = this.f29177m;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new h());
            this.f29177m = thread2;
            thread2.start();
        }
        this.f29174j.setOnClickListener(new b());
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f29177m;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f29177m.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f29177m;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new h());
            this.f29177m = thread2;
            thread2.start();
        }
        w.m(this.f29175k);
        w.z0(this.f29175k);
    }

    public void onViewClicked(View view) {
        view.getId();
    }
}
