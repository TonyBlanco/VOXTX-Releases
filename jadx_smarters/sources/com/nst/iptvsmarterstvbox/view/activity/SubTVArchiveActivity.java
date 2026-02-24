package com.nst.iptvsmarterstvbox.view.activity;

import a7.h;
import a7.j;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.nst.iptvsmarterstvbox.model.callback.LiveStreamsEpgCallback;
import com.nst.iptvsmarterstvbox.model.callback.LoginCallback;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.EpgListingPojo;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import j1.AbstractC2074a;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import m1.C2219a;
import m7.AbstractC2237a;
import m7.w;
import n7.k;
import p1.InterfaceC2389c;
import q7.b0;

/* JADX INFO: loaded from: classes4.dex */
public class SubTVArchiveActivity extends androidx.appcompat.app.b implements z7.f, z7.e, View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public k f32625A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Thread f32626B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public List f32627C = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f32628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TabLayout f32629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewPager f32630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ProgressBar f32631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AppBarLayout f32632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f32633i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RelativeLayout f32634j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f32635k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f32636l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f32637m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f32638n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f32639o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SharedPreferences f32640p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SharedPreferences f32641q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f32642r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f32643s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f32644t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f32645u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f32646v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f32647w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f32648x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LiveStreamDBHandler f32649y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Context f32650z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(SubTVArchiveActivity.this.f32650z);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SubTVArchiveActivity.this.onBackPressed();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(SubTVArchiveActivity.this.f32650z);
                String strA = w.A(string);
                TextView textView = SubTVArchiveActivity.this.f32637m;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = SubTVArchiveActivity.this.f32636l;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class d implements InterfaceC2389c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f32654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f32655b;

        public d(ArrayList arrayList, ArrayList arrayList2) {
            this.f32654a = arrayList;
            this.f32655b = arrayList2;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(33:236|19|20|226|24|25|210|29|30|212|34|35|(3:258|39|40)|(3:244|44|45)|228|49|50|218|54|55|(3:250|59|60)|232|64|65|220|69|70|(5:248|74|(18:242|76|204|77|78|208|79|80|81|230|88|89|234|90|91|92|238|99)(1:107)|108|109)|(2:252|110)|(2:254|111)|240|120|124) */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x0218, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x0219, code lost:
        
            r0.printStackTrace();
            r0 = "";
         */
        /* JADX WARN: Removed duplicated region for block: B:142:0x02c5 A[PHI: r7
          0x02c5: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v1 java.lang.String), (r7v8 java.lang.String) binds: [B:5:0x001a, B:8:0x002b, B:262:0x02c5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:145:0x02cf A[Catch: Exception -> 0x02c2, TryCatch #29 {Exception -> 0x02c2, blocks: (B:3:0x000c, B:6:0x001c, B:143:0x02c7, B:145:0x02cf, B:147:0x02d3, B:149:0x02d9, B:151:0x02f7, B:152:0x0309, B:154:0x0314, B:161:0x032c, B:163:0x0336, B:165:0x033c, B:168:0x0346, B:169:0x0348, B:160:0x0328, B:170:0x034d, B:184:0x03be, B:171:0x0397, B:173:0x039d, B:174:0x03a0, B:176:0x03a6, B:177:0x03a9, B:179:0x03af, B:181:0x03b5, B:183:0x03bb, B:198:0x03e9, B:185:0x03c4, B:187:0x03c8, B:188:0x03cb, B:190:0x03d1, B:191:0x03d4, B:193:0x03da, B:195:0x03e0, B:197:0x03e6, B:139:0x02ba), top: B:260:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:185:0x03c4 A[Catch: Exception -> 0x02c2, TryCatch #29 {Exception -> 0x02c2, blocks: (B:3:0x000c, B:6:0x001c, B:143:0x02c7, B:145:0x02cf, B:147:0x02d3, B:149:0x02d9, B:151:0x02f7, B:152:0x0309, B:154:0x0314, B:161:0x032c, B:163:0x0336, B:165:0x033c, B:168:0x0346, B:169:0x0348, B:160:0x0328, B:170:0x034d, B:184:0x03be, B:171:0x0397, B:173:0x039d, B:174:0x03a0, B:176:0x03a6, B:177:0x03a9, B:179:0x03af, B:181:0x03b5, B:183:0x03bb, B:198:0x03e9, B:185:0x03c4, B:187:0x03c8, B:188:0x03cb, B:190:0x03d1, B:191:0x03d4, B:193:0x03da, B:195:0x03e0, B:197:0x03e6, B:139:0x02ba), top: B:260:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:224:0x0277 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:264:0x029e A[SYNTHETIC] */
        @Override // p1.InterfaceC2389c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(org.json.JSONObject r41) throws org.json.JSONException {
            /*
                Method dump skipped, instruction units count: 1011
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SubTVArchiveActivity.d.a(org.json.JSONObject):void");
        }

        @Override // p1.InterfaceC2389c
        public void b(C2219a c2219a) {
            Log.e("EPG", String.valueOf(c2219a));
            Toast.makeText(SubTVArchiveActivity.this.getApplicationContext(), SubTVArchiveActivity.this.getResources().getString(j.f12976D2), 0).show();
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(SubTVArchiveActivity.this.f32650z);
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    SubTVArchiveActivity.this.z1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public static long B1(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    private void D1() {
        this.f32628d = (Toolbar) findViewById(a7.f.kh);
        this.f32629e = (TabLayout) findViewById(a7.f.ig);
        this.f32630f = (ViewPager) findViewById(a7.f.Om);
        this.f32631g = (ProgressBar) findViewById(a7.f.ec);
        this.f32632h = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f32633i = (TextView) findViewById(a7.f.wk);
        this.f32634j = (RelativeLayout) findViewById(a7.f.wf);
        this.f32635k = (TextView) findViewById(a7.f.Pi);
        this.f32636l = (TextView) findViewById(a7.f.f12129E2);
        this.f32637m = (TextView) findViewById(a7.f.gh);
        this.f32638n = (ImageView) findViewById(a7.f.Xa);
        this.f32639o = (ImageView) findViewById(a7.f.f12141F4);
    }

    private void E1() {
        int i9;
        this.f32629e.setVisibility(8);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f32641q = sharedPreferences;
        String string = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String string2 = this.f32641q.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        this.f32642r = getIntent().getStringExtra("OPENED_STREAM_ID");
        String stringExtra = getIntent().getStringExtra("OPENED_NUM");
        String stringExtra2 = getIntent().getStringExtra("OPENED_CHANNEL_ID");
        String stringExtra3 = getIntent().getStringExtra("OPENED_NAME");
        String stringExtra4 = getIntent().getStringExtra("OPENED_STREAM_ICON");
        String stringExtra5 = getIntent().getStringExtra("OPENED_ARCHIVE_DURATION");
        this.f32649y = new LiveStreamDBHandler(this.f32650z);
        if (stringExtra2 != null) {
            stringExtra2.equals("");
        }
        this.f32625A = new k(this, this.f32650z);
        try {
            i9 = Integer.parseInt(this.f32642r);
        } catch (NumberFormatException unused) {
            i9 = -1;
        }
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f32650z).equals("onestream_api")) {
            A1();
        } else {
            this.f32625A.b(string, string2, i9, stringExtra2, this.f32642r, stringExtra, stringExtra3, stringExtra4, stringExtra5, this.f32648x);
        }
    }

    private void x1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    public final void A1() {
        String oneStreamToken = SharepreferenceDBHandler.getOneStreamToken(this.f32650z);
        AbstractC2074a.a(this.f32650z.getSharedPreferences("loginPrefsserverurl", 0).getString(AbstractC2237a.f44454L, "") + "play/b2c/v1/epg/" + this.f32642r + "?token=" + oneStreamToken).s(k1.e.MEDIUM).q().o(new d(new ArrayList(), new ArrayList()));
    }

    public void C1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    @Override // z7.e
    public void N(LiveStreamsEpgCallback liveStreamsEpgCallback, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        if (liveStreamsEpgCallback == null || liveStreamsEpgCallback.getEpgListingPojos() == null || liveStreamsEpgCallback.getEpgListingPojos().size() <= 0) {
            ViewPager viewPager = this.f32630f;
            if (viewPager != null) {
                viewPager.setVisibility(8);
            }
            TabLayout tabLayout = this.f32629e;
            if (tabLayout != null) {
                tabLayout.setVisibility(8);
            }
            RelativeLayout relativeLayout = this.f32634j;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            TextView textView = this.f32633i;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (EpgListingPojo epgListingPojo : liveStreamsEpgCallback.getEpgListingPojos()) {
                if (epgListingPojo.getHasArchive().intValue() == 1) {
                    arrayList.add(epgListingPojo);
                    XMLTVProgrammePojo xMLTVProgrammePojo = new XMLTVProgrammePojo();
                    xMLTVProgrammePojo.setTitle(epgListingPojo.getTitle());
                    xMLTVProgrammePojo.setStart(epgListingPojo.getStart());
                    xMLTVProgrammePojo.setStop(epgListingPojo.getEnd());
                    xMLTVProgrammePojo.setDesc(epgListingPojo.getDescription());
                    xMLTVProgrammePojo.setChannel(epgListingPojo.getChannelId());
                    xMLTVProgrammePojo.setStartTimeStamp(epgListingPojo.getStartTimestamp());
                    xMLTVProgrammePojo.setEndTimeStamp(epgListingPojo.getStopTimestamp());
                    arrayList2.add(xMLTVProgrammePojo);
                }
            }
            if (this.f32649y != null) {
                int size = arrayList2.size();
                if (size != 0) {
                    String str9 = new SimpleDateFormat("dd-MMM-yyyy", Locale.US).format(new Date());
                    ArrayList arrayList3 = new ArrayList();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                    int i9 = 0;
                    for (int i10 = 0; i10 < size; i10++) {
                        try {
                            str8 = new SimpleDateFormat("dd MMM yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(((XMLTVProgrammePojo) arrayList2.get(i10)).getStart().split("\\s+")[0]));
                        } catch (ParseException e9) {
                            e9.printStackTrace();
                            str8 = "";
                        }
                        if (B1(simpleDateFormat, str8, str9) >= 0 && !arrayList3.contains(str8)) {
                            arrayList3.add(i9, str8);
                            if (str9.equals(str8)) {
                                break;
                            } else {
                                i9++;
                            }
                        }
                    }
                    this.f32630f.setAdapter(new b0(arrayList3, arrayList2, str2, str3, str4, str5, str, str6, str7, getSupportFragmentManager(), this));
                    this.f32629e.setVisibility(0);
                    this.f32629e.setupWithViewPager(this.f32630f);
                    this.f32630f.setCurrentItem(i9 - 1);
                } else {
                    ViewPager viewPager2 = this.f32630f;
                    if (viewPager2 != null) {
                        viewPager2.setVisibility(8);
                    }
                    TabLayout tabLayout2 = this.f32629e;
                    if (tabLayout2 != null) {
                        tabLayout2.setVisibility(8);
                    }
                    RelativeLayout relativeLayout2 = this.f32634j;
                    if (relativeLayout2 != null) {
                        relativeLayout2.setVisibility(0);
                    }
                    TextView textView2 = this.f32633i;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                }
                b();
            }
        }
        b();
    }

    @Override // z7.b
    public void a() {
        ProgressBar progressBar = this.f32631g;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    @Override // z7.b
    public void b() {
        ProgressBar progressBar = this.f32631g;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // z7.f
    public void c(String str) {
    }

    @Override // z7.b
    public void d(String str) {
    }

    @Override // z7.f
    public void e(String str) {
    }

    @Override // z7.f
    public void h0(ArrayList arrayList, String str) {
    }

    @Override // z7.f
    public void m(LoginCallback loginCallback, String str) {
        if (loginCallback == null || loginCallback.getUserLoginInfo().getAuth().intValue() != 1) {
            return;
        }
        String status = loginCallback.getUserLoginInfo().getStatus();
        if (status.equals("Active")) {
            return;
        }
        w.P0(this.f32650z, "Your Account is " + status);
        Context context = this.f32650z;
        if (context != null) {
            w.n0(context);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f32650z = this;
        C1();
        super.onCreate(bundle);
        setContentView(a7.g.f12774c1);
        D1();
        x1();
        r1((Toolbar) findViewById(a7.f.kh));
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        E1();
        Thread thread = this.f32626B;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new g());
            this.f32626B = thread2;
            thread2.start();
        }
        this.f32638n.setOnClickListener(new a());
        this.f32639o.setOnClickListener(new b());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f32628d.x(h.f12927j);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f32628d.getChildCount(); i9++) {
            if (this.f32628d.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f32628d.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == a7.f.Mb) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == a7.f.f12380e && (context = this.f32650z) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(j.f13250f3)).f(getResources().getString(j.f13240e3)).j(getResources().getString(j.f13132S8), new f()).g(getResources().getString(j.f13231d4), new e()).n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f32626B;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f32626B.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        C1();
        super.onResume();
        Thread thread = this.f32626B;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new g());
            this.f32626B = thread2;
            thread2.start();
        }
        w.m(this.f32650z);
        w.z0(this.f32650z);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f32640p = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f32640p.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    @Override // androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.clear();
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        C1();
    }

    @Override // z7.f
    public void w0(ArrayList arrayList, String str) {
    }

    @Override // z7.f
    public void y(LoginCallback loginCallback, String str, ArrayList arrayList) {
    }

    public final long y1(String str, String str2) {
        long time;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        try {
            time = simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime();
        } catch (ParseException e9) {
            e9.printStackTrace();
            time = -1;
        }
        return (time / 1000) / 60;
    }

    public void z1() {
        runOnUiThread(new c());
    }
}
