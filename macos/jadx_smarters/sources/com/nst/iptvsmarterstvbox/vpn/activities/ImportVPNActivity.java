package com.nst.iptvsmarterstvbox.vpn.activities;

import F7.c;
import F7.e;
import a7.g;
import a7.j;
import a7.k;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.gson.JsonElement;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.AdsLastUpdateResponseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.getAnnouncementsFirebaseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.readAnnouncementFirebaseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.FirebaseInterface;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import m7.AbstractC2237a;
import m7.w;
import org.apache.http.HttpStatus;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class ImportVPNActivity extends androidx.appcompat.app.b implements H7.a, FirebaseInterface, View.OnClickListener {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static C2858a f37859F;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f37862C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Uri f37863D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public FirebasePresenter f37864E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f37865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f37866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f37867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f37868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f37869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RadioButton f37870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RadioButton f37871j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f37872k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f37873l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinearLayout f37874m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f37875n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f37876o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Context f37877p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.appcompat.app.a f37878q;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f37886y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f37887z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f37879r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f37880s = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f37881t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f37882u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f37883v = 1024;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f37884w = "url";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f37885x = "";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f37860A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Thread f37861B = null;

    public class a implements c.a {
        public a() {
        }

        @Override // F7.c.a
        public void a(File file) {
            Log.i("main", "file download completed");
            if (file == null || !file.exists()) {
                Toast.makeText(ImportVPNActivity.this.f37877p, ImportVPNActivity.this.getResources().getString(j.f13199a2), 0).show();
                w.X();
            } else {
                ImportVPNActivity importVPNActivity = ImportVPNActivity.this;
                new F7.a(importVPNActivity, file, importVPNActivity).b("IMPORT_URL");
            }
            Log.i("main", "file unzip completed");
        }
    }

    public class b implements e.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f37889a;

        public b(String[] strArr) {
            this.f37889a = strArr;
        }

        @Override // F7.e.g
        public void a(String str) {
            this.f37889a[0] = str;
            if (!str.endsWith(".zip") && !str.endsWith(".ovpn")) {
                ImportVPNActivity.this.f37876o.setVisibility(8);
                ImportVPNActivity.this.f37875n.setVisibility(0);
                ImportVPNActivity importVPNActivity = ImportVPNActivity.this;
                importVPNActivity.f37875n.setText(importVPNActivity.getResources().getString(j.f13259g2));
                return;
            }
            ImportVPNActivity.this.f37876o.setVisibility(0);
            ImportVPNActivity.this.f37876o.setText(str);
            ImportVPNActivity.this.f37885x = str;
            if (!ImportVPNActivity.this.f37862C.equals(AbstractC2237a.f44453K0) && Build.VERSION.SDK_INT >= 23) {
                ImportVPNActivity.this.H1(str);
            } else {
                ImportVPNActivity.this.I1(str);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(ImportVPNActivity.this.f37877p);
                String strA = w.A(string);
                TextView textView = ImportVPNActivity.this.f37869h;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = ImportVPNActivity.this.f37868g;
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
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", ImportVPNActivity.this.getPackageName(), null));
                ImportVPNActivity.this.startActivityForResult(intent, 101);
                Toast.makeText(ImportVPNActivity.this.f37877p, ImportVPNActivity.this.f37877p.getResources().getString(j.f13339o2), 1).show();
            } catch (Exception unused) {
            }
            ImportVPNActivity.this.f37878q.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImportVPNActivity.this.f37878q.dismiss();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    ImportVPNActivity.this.z1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[Catch: Exception -> 0x0038, TryCatch #2 {Exception -> 0x0038, blocks: (B:6:0x000a, B:9:0x0019, B:11:0x0025, B:22:0x005f, B:24:0x006e, B:26:0x0076, B:28:0x007a, B:30:0x0080, B:32:0x0088, B:34:0x0095, B:37:0x00b4, B:39:0x00cf, B:41:0x00d7, B:42:0x00da, B:43:0x00f4, B:54:0x013f, B:57:0x0146, B:58:0x0149, B:59:0x014a, B:62:0x016e, B:68:0x018c, B:65:0x0175, B:66:0x0178, B:16:0x003b, B:18:0x0041, B:20:0x004d, B:67:0x0179, B:61:0x0150), top: B:76:0x000a, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void D1(android.content.Intent r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.vpn.activities.ImportVPNActivity.D1(android.content.Intent):void");
    }

    public final void A1() {
        String str = this.f37884w;
        if (str != null && str.equalsIgnoreCase("url")) {
            B1();
            return;
        }
        try {
            if (!this.f37862C.equals(AbstractC2237a.f44453K0) && Build.VERSION.SDK_INT >= 23) {
                Intent intent = new Intent();
                intent.setType("application/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                startActivityForResult(Intent.createChooser(intent, "Select File"), HttpStatus.SC_CREATED);
            } else {
                y1();
            }
        } catch (Exception unused) {
        }
    }

    public final void B1() {
        File file;
        w.M0(this);
        if (!this.f37862C.equals(AbstractC2237a.f44453K0) && Build.VERSION.SDK_INT >= 23) {
            file = new File(this.f37877p.getFilesDir() + "/VPNIPTVSmarters/vpncertificate.zip");
        } else {
            file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNIPTVSmarters/vpncertificate.zip");
        }
        File file2 = new File(String.valueOf(file));
        if (file2.exists()) {
            file2.deleteOnExit();
        }
        new F7.c(String.valueOf(file), this, new a()).execute(this.f37880s);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:8|(2:123|13)(1:16)|(2:125|17)|(9:18|(3:20|(3:131|22|134)(3:130|23|133)|132)(1:129)|117|25|(1:27)|31|(1:33)|34|(1:39)(1:40))|24|117|25|(0)|31|(0)|34|(1:36)(2:37|39)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dc, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf A[Catch: Exception -> 0x00db, TRY_LEAVE, TryCatch #2 {Exception -> 0x00db, blocks: (B:25:0x00ab, B:27:0x00cf), top: B:117:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C1(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.vpn.activities.ImportVPNActivity.C1(java.lang.String, java.lang.String):void");
    }

    public final void E1(String str, String str2, String str3, File file) {
        L7.a aVar = new L7.a();
        if (str3.contains("auth-user-pass")) {
            aVar.l("1");
        } else {
            aVar.l("0");
        }
        aVar.p("0");
        aVar.v("");
        aVar.u("");
        aVar.r(str2);
        aVar.m(str);
        aVar.t("0");
        aVar.q(String.valueOf(file));
        aVar.s("");
        this.f37860A.add(aVar);
    }

    public final void F1() {
        w.X();
        startActivity(new Intent(this, (Class<?>) ProfileActivity.class));
        finish();
    }

    public final void G1() {
        String str = this.f37884w;
        if (str == null || !str.equalsIgnoreCase("url")) {
            String str2 = this.f37885x;
            if (str2 == null || !str2.trim().isEmpty()) {
                if (!this.f37862C.equals(AbstractC2237a.f44453K0) && Build.VERSION.SDK_INT >= 23) {
                    H1(this.f37885x);
                    return;
                } else {
                    I1(this.f37885x);
                    return;
                }
            }
        } else {
            String string = this.f37865d.getText().toString();
            this.f37880s = string;
            if (string == null || !string.isEmpty()) {
                A1();
                return;
            }
        }
        Toast.makeText(this.f37877p, getResources().getString(j.f13039J5), 0).show();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H1(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.vpn.activities.ImportVPNActivity.H1(java.lang.String):void");
    }

    public void I1(String str) {
        w.N0(this.f37877p);
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNIPTVSmarters");
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(str);
        if (file2.exists() && str.contains(".zip")) {
            new F7.b(this, file2, this).b();
        } else if (str.contains(".ovpn")) {
            C1(str, ".ovpn");
        } else {
            Toast.makeText(this.f37877p, getResources().getString(j.f13180Y1), 0).show();
            w.X();
        }
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.FirebaseInterface
    public void Q0(getAnnouncementsFirebaseCallback getannouncementsfirebasecallback) {
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.FirebaseInterface
    public void h(AdsLastUpdateResponseCallback adsLastUpdateResponseCallback) {
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.FirebaseInterface
    public void k0(readAnnouncementFirebaseCallback readannouncementfirebasecallback) {
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) throws Throwable {
        super.onActivityResult(i9, i10, intent);
        if (i9 == 201) {
            D1(intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == a7.f.f12247Q0) {
            onBackPressed();
        } else if (id == a7.f.f12371d1) {
            G1();
        } else if (id == a7.f.f12431j0) {
            A1();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f37877p = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f37877p);
        f37859F = c2858a;
        String strA = c2858a.A();
        this.f37862C = strA;
        setContentView(strA.equals(AbstractC2237a.f44453K0) ? g.f12686O : g.f12680N);
        this.f37865d = (EditText) findViewById(a7.f.f12333Z2);
        this.f37866e = (Button) findViewById(a7.f.f12371d1);
        this.f37867f = (Button) findViewById(a7.f.f12247Q0);
        this.f37868g = (TextView) findViewById(a7.f.f12129E2);
        this.f37869h = (TextView) findViewById(a7.f.gh);
        this.f37870i = (RadioButton) findViewById(a7.f.kd);
        this.f37871j = (RadioButton) findViewById(a7.f.wd);
        this.f37872k = (LinearLayout) findViewById(a7.f.Wd);
        this.f37873l = (Button) findViewById(a7.f.f12431j0);
        this.f37874m = (LinearLayout) findViewById(a7.f.Ba);
        this.f37875n = (TextView) findViewById(a7.f.Nh);
        this.f37876o = (TextView) findViewById(a7.f.pj);
        this.f37867f.setOnClickListener(this);
        this.f37866e.setOnClickListener(this);
        this.f37873l.setOnClickListener(this);
        this.f37864E = new FirebasePresenter(this.f37877p, this);
        Thread thread = this.f37861B;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new f());
            this.f37861B = thread2;
            thread2.start();
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.f37881t = intent.getStringExtra("typeid");
        }
        Button button = this.f37866e;
        button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
        Button button2 = this.f37867f;
        button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this));
        Button button3 = this.f37873l;
        button3.setOnFocusChangeListener(new w.k((View) button3, (Activity) this));
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f37861B;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f37861B.interrupt();
        } catch (Exception unused) {
        }
    }

    public void onRadioButtonClicked(View view) {
        View view2;
        boolean zIsChecked = ((RadioButton) view).isChecked();
        if (view.getId() == a7.f.kd) {
            if (!zIsChecked) {
                return;
            }
            this.f37884w = TransferTable.COLUMN_FILE;
            this.f37874m.setVisibility(8);
            this.f37872k.setVisibility(0);
            this.f37875n.setVisibility(8);
            view2 = this.f37876o;
        } else {
            if (view.getId() != a7.f.wd || !zIsChecked) {
                return;
            }
            this.f37884w = "url";
            this.f37874m.setVisibility(0);
            view2 = this.f37872k;
        }
        view2.setVisibility(8);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        if (i9 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0 && iArr[1] == 0) {
                A1();
            } else if (Build.VERSION.SDK_INT >= 23 && !shouldShowRequestPermissionRationale(strArr[0])) {
                a.C0158a c0158a = new a.C0158a(this, k.f13456a);
                View viewInflate = LayoutInflater.from(this).inflate(g.f12738W3, (ViewGroup) null);
                Button button = (Button) viewInflate.findViewById(a7.f.f12361c1);
                Button button2 = (Button) viewInflate.findViewById(a7.f.f12286U0);
                button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
                button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this));
                button.setOnClickListener(new d());
                button2.setOnClickListener(new e());
                c0158a.setView(viewInflate);
                this.f37878q = c0158a.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f37878q.getWindow();
                Objects.requireNonNull(window);
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f37878q.show();
                this.f37878q.getWindow().setAttributes(layoutParams);
                this.f37878q.setCancelable(false);
                this.f37878q.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.z0(this.f37877p);
        Thread thread = this.f37861B;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new f());
            this.f37861B = thread2;
            thread2.start();
        }
    }

    @Override // H7.a
    public void x0(String str) {
        C1(str, ".zip");
    }

    public void y1() {
        F7.e eVar = new F7.e(this.f37877p, new b(new String[]{""}));
        if (Build.VERSION.SDK_INT >= 30) {
            eVar.v("");
        } else {
            eVar.u("");
        }
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.FirebaseInterface
    public void z(JsonElement jsonElement) {
    }

    @Override // H7.a
    public void z0(String str) {
        w.X();
        Toast.makeText(this.f37877p, "" + str, 0).show();
    }

    public void z1() {
        runOnUiThread(new c());
    }
}
