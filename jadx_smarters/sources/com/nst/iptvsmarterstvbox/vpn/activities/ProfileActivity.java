package com.nst.iptvsmarterstvbox.vpn.activities;

import D.AbstractC0519b;
import F7.c;
import a7.f;
import a7.g;
import a7.j;
import a7.k;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.IBinder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b7.AbstractC1232b;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.services.s3.internal.Constants;
import com.google.gson.JsonElement;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.VPNCredentialsPojo;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.AdsLastUpdateResponseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.getAnnouncementsFirebaseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.readAnnouncementFirebaseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.FirebaseInterface;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter;
import de.blinkt.openvpn.core.B;
import de.blinkt.openvpn.core.C;
import de.blinkt.openvpn.core.EnumC1722e;
import de.blinkt.openvpn.core.F;
import de.blinkt.openvpn.core.G;
import de.blinkt.openvpn.core.InterfaceC1725h;
import de.blinkt.openvpn.core.OpenVPNStatusService;
import f8.l;
import h8.C1869b;
import j$.util.Objects;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import m7.AbstractC2237a;
import m7.w;
import org.json.JSONException;
import org.json.JSONObject;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileActivity extends androidx.appcompat.app.b implements FirebaseInterface, H7.a, View.OnClickListener {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static C2858a f37895J;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f37897B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public FirebasePresenter f37898C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public List f37899D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public List f37900E;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public HashMap f37903H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayout f37905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f37906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressBar f37907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f37908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RelativeLayout f37909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f37910i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.appcompat.app.a f37911j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f37912k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f37915n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f37916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f37917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f37918q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f37919r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f37920s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public J7.a f37921t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Context f37922u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InterfaceC1725h f37925x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public I7.a f37926y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f37927z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f37913l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f37914m = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f37923v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f37924w = "";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f37896A = null;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f37901F = "";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f37902G = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ServiceConnection f37904I = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ProfileActivity.this.f37925x = InterfaceC1725h.a.A(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ProfileActivity.this.f37925x = null;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", ProfileActivity.this.getPackageName(), null));
                ProfileActivity.this.startActivityForResult(intent, 101);
                Toast.makeText(ProfileActivity.this.f37922u, ProfileActivity.this.f37922u.getResources().getString(j.f13339o2), 1).show();
            } catch (Exception unused) {
            }
            ProfileActivity.this.f37911j.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ProfileActivity.this.f37911j.dismiss();
            ProfileActivity.this.onBackPressed();
        }
    }

    public class d implements c.a {
        public d() {
        }

        @Override // F7.c.a
        public void a(File file) {
            Log.i("main", "file download completed");
            if (file == null || !file.exists()) {
                Toast.makeText(ProfileActivity.this.f37922u, ProfileActivity.this.getResources().getString(j.f13199a2), 0).show();
                w.X();
            } else {
                ProfileActivity profileActivity = ProfileActivity.this;
                new F7.a(profileActivity, file, profileActivity).b("SBP_URL");
            }
            Log.i("main", "file unzip completed");
        }
    }

    public class e extends AsyncTask {
        public e() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Boolean... boolArr) {
            return ProfileActivity.this.F1();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (!bool.booleanValue()) {
                ProfileActivity.this.v1(false);
            } else {
                ProfileActivity.this.v1(true);
                ProfileActivity.this.K1();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (AbstractC2237a.f44496e.booleanValue()) {
                ProfileActivity.this.f37907f.setVisibility(0);
                ProfileActivity.this.f37905d.setVisibility(8);
            }
        }
    }

    private void D1() {
        File file;
        if (Build.VERSION.SDK_INT >= 23) {
            file = new File(this.f37922u.getFilesDir() + "/VPNSBPIPTVSmarters/vpncertificate.zip");
        } else {
            file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNSBPIPTVSmarters/vpncertificate.zip");
        }
        File file2 = new File(String.valueOf(file));
        if (file2.exists()) {
            file2.deleteOnExit();
        }
        new F7.c(String.valueOf(file), this, new d()).execute(this.f37901F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean F1() {
        try {
            this.f37918q = this.f37921t.j();
        } catch (Exception unused) {
        }
        ArrayList arrayList = this.f37918q;
        return (arrayList == null || arrayList.size() <= 0) ? Boolean.FALSE : Boolean.TRUE;
    }

    private void I1() {
        if (Build.VERSION.SDK_INT < 33 || checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return;
        }
        AbstractC0519b.h(this, w.s0(), 1);
    }

    private void M1() {
        w.X();
        N1();
    }

    public final void E1() {
        String str = new SimpleDateFormat("yyyy-MM").format(new Date());
        u1();
        String strO0 = w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + AbstractC1232b.f17695b + "*" + str);
        w.M0(this);
        this.f37898C.j(AbstractC2237a.f44469S0, AbstractC2237a.f44471T0, str, strO0);
    }

    public void G1() {
        try {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 23 && i9 < 33) {
                if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    return;
                }
                AbstractC0519b.h(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 101);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:71|(2:111|72)|(8:73|(3:75|(3:140|77|143)(6:139|78|79|119|80|142)|141)(1:138)|105|83|(2:115|89)(1:90)|91|130|92)|82|105|83|(1:85)(4:86|87|115|89)|91|130|92) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:8|(2:117|13)(1:16)|107|17|(8:18|(3:20|(3:125|22|128)(3:124|23|127)|126)(1:123)|113|25|(1:27)|31|(1:33)|34)|24|113|25|(0)|31|(0)|34) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dd, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0 A[Catch: Exception -> 0x00dc, TRY_LEAVE, TryCatch #4 {Exception -> 0x00dc, blocks: (B:25:0x00aa, B:27:0x00d0), top: B:113:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H1(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.vpn.activities.ProfileActivity.H1(java.lang.String, java.lang.String):void");
    }

    public void J1() {
        startActivity(new Intent(this, (Class<?>) ImportVPNActivity.class));
        finish();
    }

    public void K1() {
        this.f37908g.setLayoutManager(new GridLayoutManager(this, 2));
        if (this.f37926y != null) {
            this.f37926y = null;
        }
        I7.a aVar = new I7.a(this.f37922u, this.f37918q, this);
        this.f37926y = aVar;
        this.f37908g.setAdapter(aVar);
    }

    public final void L1(String str, String str2, String str3, File file) {
        String username;
        String password;
        HashMap map = this.f37903H;
        if (map == null || map.size() <= 0) {
            username = "";
            password = "";
        } else {
            for (String str4 : this.f37903H.keySet()) {
                if (str4.equalsIgnoreCase(str2)) {
                    VPNCredentialsPojo vPNCredentialsPojo = (VPNCredentialsPojo) this.f37903H.get(str4);
                    username = vPNCredentialsPojo.getUsername();
                    password = vPNCredentialsPojo.getPassword();
                    break;
                }
            }
            username = "";
            password = "";
        }
        L7.a aVar = new L7.a();
        if (str3.contains("auth-user-pass")) {
            aVar.l("1");
        } else {
            aVar.l("0");
        }
        aVar.p("0");
        aVar.v(username);
        aVar.u(password);
        aVar.r(str2);
        aVar.m(str);
        aVar.t("0");
        aVar.q(String.valueOf(file));
        aVar.s("sbp");
        this.f37896A.add(aVar);
    }

    public void N1() {
        new e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Boolean[0]);
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
    public void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        if (i9 != 70) {
            if (i9 == 101) {
                try {
                    G1();
                    return;
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return;
                }
            }
            return;
        }
        if (i10 == -1) {
            if (this.f37912k.H(this.f37916o, this.f37915n) != 0) {
                G.J("USER_VPN_PASSWORD", "", j.f12991E7, EnumC1722e.LEVEL_WAITING_FOR_USER_INPUT);
                l lVar = this.f37912k;
                lVar.f40864B = this.f37923v;
                String str = this.f37924w;
                lVar.f40863A = str;
                this.f37915n = str;
                bindService(new Intent(this, (Class<?>) OpenVPNStatusService.class), this.f37904I, 1);
                return;
            }
            boolean z9 = B.a(this).getBoolean("showlogwindow", true);
            if (!this.f37913l && z9) {
                C.u(this, this.f37912k);
            }
            F.f(this.f37912k, getBaseContext());
        } else {
            if (i10 != 0) {
                return;
            }
            G.J("USER_VPN_PERMISSION_CANCELLED", "", j.f13021H7, EnumC1722e.LEVEL_NOTCONNECTED);
            if (Build.VERSION.SDK_INT >= 24) {
                G.n(j.f13038J4);
            }
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == f.f12263R6 || view.getId() == f.f12292U6) {
            J1();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f37922u = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f37922u);
        f37895J = c2858a;
        String strA = c2858a.A();
        this.f37897B = strA;
        setContentView(strA.equals(AbstractC2237a.f44453K0) ? g.f12877t0 : g.f12871s0);
        w.Y(this);
        this.f37905d = (LinearLayout) findViewById(f.f12263R6);
        this.f37906e = (LinearLayout) findViewById(f.f12292U6);
        this.f37907f = (ProgressBar) findViewById(f.Nc);
        this.f37908g = (RecyclerView) findViewById(f.Cd);
        this.f37909h = (RelativeLayout) findViewById(f.Vd);
        this.f37910i = (TextView) findViewById(f.yk);
        I1();
        this.f37898C = new FirebasePresenter(this.f37922u, this);
        this.f37921t = new J7.a(this.f37922u);
        this.f37905d.setOnClickListener(this);
        this.f37906e.setOnClickListener(this);
        this.f37918q = new ArrayList();
        this.f37920s = new ArrayList();
        this.f37919r = new ArrayList();
        this.f37896A = new ArrayList();
        if (AbstractC2237a.f44496e.booleanValue()) {
            this.f37905d.setVisibility(0);
            this.f37906e.setVisibility(0);
        }
        this.f37917p = getIntent().getStringExtra("typeid");
        C1869b c1869b = new C1869b(this.f37922u);
        c1869b.d();
        c1869b.a("com.nst.iptvsmarterstvbox");
        if (AbstractC2237a.f44475V0.booleanValue()) {
            E1();
        }
        this.f37902G = true;
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        if (i9 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0 && iArr[1] == 0) {
                G1();
            } else if (Build.VERSION.SDK_INT < 23 || shouldShowRequestPermissionRationale(strArr[0])) {
                onBackPressed();
            } else {
                a.C0158a c0158a = new a.C0158a(this, k.f13456a);
                View viewInflate = LayoutInflater.from(this).inflate(g.f12738W3, (ViewGroup) null);
                Button button = (Button) viewInflate.findViewById(f.f12361c1);
                Button button2 = (Button) viewInflate.findViewById(f.f12286U0);
                button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
                button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this));
                button.requestFocus();
                button.setOnClickListener(new b());
                button2.setOnClickListener(new c());
                c0158a.setView(viewInflate);
                this.f37911j = c0158a.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f37911j.getWindow();
                Objects.requireNonNull(window);
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f37911j.show();
                this.f37911j.getWindow().setAttributes(layoutParams);
                this.f37911j.setCancelable(false);
                this.f37911j.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.f37902G && AbstractC2237a.f44475V0.booleanValue() && SharepreferenceDBHandler.getVPNLastUpdate(this.f37922u)) {
            E1();
        }
        this.f37902G = false;
        if (AbstractC2237a.f44496e.booleanValue()) {
            N1();
        }
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    public void u1() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f37927z = iNextInt;
        AbstractC1232b.f17695b = String.valueOf(iNextInt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r4 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v1(boolean r4) {
        /*
            r3 = this;
            android.widget.ProgressBar r0 = r3.f37907f
            r1 = 8
            r0.setVisibility(r1)
            java.lang.Boolean r0 = m7.AbstractC2237a.f44496e
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L37
            if (r4 == 0) goto L22
            android.widget.LinearLayout r4 = r3.f37905d
            r4.setVisibility(r1)
        L17:
            androidx.recyclerview.widget.RecyclerView r4 = r3.f37908g
            r4.setVisibility(r2)
            android.widget.RelativeLayout r4 = r3.f37909h
            r4.setVisibility(r2)
            goto L3a
        L22:
            android.widget.LinearLayout r4 = r3.f37905d
            r4.setVisibility(r2)
            android.widget.LinearLayout r4 = r3.f37905d
            r4.requestFocus()
        L2c:
            androidx.recyclerview.widget.RecyclerView r4 = r3.f37908g
            r4.setVisibility(r1)
            android.widget.RelativeLayout r4 = r3.f37909h
            r4.setVisibility(r1)
            goto L3a
        L37:
            if (r4 == 0) goto L2c
            goto L17
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.vpn.activities.ProfileActivity.v1(boolean):void");
    }

    @Override // H7.a
    public void x0(String str) {
        H1(str, ".zip");
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.FirebaseInterface
    public void z(JsonElement jsonElement) {
        try {
            this.f37903H = new HashMap();
            JSONObject jSONObject = new JSONObject(jsonElement.toString());
            jSONObject.getString("result");
            if (jSONObject.getString("vpnstatus").equals("on")) {
                String string = jSONObject.getString("link");
                this.f37901F = string;
                if (!string.isEmpty() && !string.equals("")) {
                    if (jSONObject.has("access")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("access");
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (jSONObject2.get(next) instanceof JSONObject) {
                                String string2 = ((JSONObject) jSONObject2.get(next)).getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME);
                                String string3 = ((JSONObject) jSONObject2.get(next)).getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD);
                                VPNCredentialsPojo vPNCredentialsPojo = new VPNCredentialsPojo();
                                vPNCredentialsPojo.setUsername(string2);
                                vPNCredentialsPojo.setPassword(string3);
                                this.f37903H.put(next, vPNCredentialsPojo);
                            }
                        }
                    }
                    D1();
                    return;
                }
                J7.a aVar = this.f37921t;
                if (aVar != null) {
                    aVar.g();
                    N1();
                }
                SharepreferenceDBHandler.setVPNLastUpdate(false, this.f37922u);
            } else {
                J7.a aVar2 = this.f37921t;
                if (aVar2 != null) {
                    aVar2.g();
                    N1();
                }
            }
            w.X();
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    @Override // H7.a
    public void z0(String str) {
    }
}
