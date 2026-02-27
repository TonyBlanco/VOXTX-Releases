package com.onesignal;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.onesignal.C1530a;
import com.onesignal.F;
import com.onesignal.F1;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes4.dex */
public class v2 extends C1530a.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f38909k = "com.onesignal.v2";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f38910l = C1.b(24);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static v2 f38911m = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D1 f38913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F f38914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Activity f38915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public D0 f38916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public A0 f38917f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38912a = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f38918g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f38919h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f38920i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f38921j = false;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38922a;

        static {
            int[] iArr = new int[m.values().length];
            f38922a = iArr;
            try {
                iArr[m.TOP_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38922a[m.BOTTOM_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class b {
        public b() {
        }
    }

    public class c implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f38924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ D0 f38925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ A0 f38926c;

        public c(Activity activity, D0 d02, A0 a02) {
            this.f38924a = activity;
            this.f38925b = d02;
            this.f38926c = a02;
        }

        @Override // com.onesignal.v2.l
        public void a() {
            v2.f38911m = null;
            v2.B(this.f38924a, this.f38925b, this.f38926c);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D0 f38927a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ A0 f38928c;

        public d(D0 d02, A0 a02) {
            this.f38927a = d02;
            this.f38928c = a02;
        }

        @Override // java.lang.Runnable
        public void run() {
            v2.I(this.f38927a, this.f38928c);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f38930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38931d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ A0 f38932e;

        public e(Activity activity, String str, A0 a02) {
            this.f38930c = activity;
            this.f38931d = str;
            this.f38932e = a02;
        }

        @Override // java.lang.Runnable
        public void run() throws Exception {
            try {
                v2.this.H(this.f38930c, this.f38931d, this.f38932e.g());
            } catch (Exception e9) {
                if (e9.getMessage() == null || !e9.getMessage().contains("No WebView installed")) {
                    throw e9;
                }
                F1.b(F1.v.ERROR, "Error setting up WebView: ", e9);
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArrC = C1.c(v2.this.f38915d);
            v2.this.f38913b.evaluateJavascript(String.format("setSafeAreaInsets(%s)", String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", Integer.valueOf(iArrC[0]), Integer.valueOf(iArrC[1]), Integer.valueOf(iArrC[2]), Integer.valueOf(iArrC[3]))), null);
        }
    }

    public class g implements Runnable {

        public class a implements ValueCallback {
            public a() {
            }

            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
                try {
                    v2 v2Var = v2.this;
                    v2.this.J(Integer.valueOf(v2Var.C(v2Var.f38915d, new JSONObject(str))));
                } catch (JSONException e9) {
                    e9.printStackTrace();
                }
            }
        }

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v2 v2Var = v2.this;
            v2Var.G(v2Var.f38915d);
            if (v2.this.f38917f.g()) {
                v2.this.K();
            }
            v2.this.f38913b.evaluateJavascript("getPageMetaData()", new a());
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f38936a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f38937c;

        public h(Activity activity, String str) {
            this.f38936a = activity;
            this.f38937c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            v2.this.G(this.f38936a);
            v2.this.f38913b.loadData(this.f38937c, "text/html; charset=utf-8", "base64");
        }
    }

    public class i implements F.j {
        public i() {
        }

        @Override // com.onesignal.F.j
        public void a() {
            F1.b0().d0(v2.this.f38916e);
        }

        @Override // com.onesignal.F.j
        public void b() {
            F1.b0().X(v2.this.f38916e);
            v2.this.D();
        }

        @Override // com.onesignal.F.j
        public void c() {
            F1.b0().e0(v2.this.f38916e);
        }
    }

    public class j implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f38940a;

        public j(l lVar) {
            this.f38940a = lVar;
        }

        @Override // com.onesignal.v2.l
        public void a() {
            v2.this.f38920i = false;
            v2.this.F(null);
            l lVar = this.f38940a;
            if (lVar != null) {
                lVar.a();
            }
        }
    }

    public class k {
        public k() {
        }

        public final m a(JSONObject jSONObject) {
            m mVar = m.FULL_SCREEN;
            try {
                return (!jSONObject.has("displayLocation") || jSONObject.get("displayLocation").equals("")) ? mVar : m.valueOf(jSONObject.optString("displayLocation", "FULL_SCREEN").toUpperCase());
            } catch (JSONException e9) {
                e9.printStackTrace();
                return mVar;
            }
        }

        public final boolean b(JSONObject jSONObject) {
            try {
                return jSONObject.getBoolean("dragToDismissDisabled");
            } catch (JSONException unused) {
                return false;
            }
        }

        public final int c(JSONObject jSONObject) {
            try {
                v2 v2Var = v2.this;
                return v2Var.C(v2Var.f38915d, jSONObject.getJSONObject("pageMetaData"));
            } catch (JSONException unused) {
                return -1;
            }
        }

        public final void d(JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            String strOptString = jSONObject2.optString(Name.MARK, null);
            v2.this.f38921j = jSONObject2.getBoolean("close");
            if (v2.this.f38916e.f38193k) {
                F1.b0().a0(v2.this.f38916e, jSONObject2);
            } else if (strOptString != null) {
                F1.b0().Z(v2.this.f38916e, jSONObject2);
            }
            if (v2.this.f38921j) {
                v2.this.w(null);
            }
        }

        public final void e(JSONObject jSONObject) {
            F1.b0().g0(v2.this.f38916e, jSONObject);
        }

        public final void f(JSONObject jSONObject) {
            m mVarA = a(jSONObject);
            int iC = mVarA == m.FULL_SCREEN ? -1 : c(jSONObject);
            boolean zB = b(jSONObject);
            v2.this.f38917f.i(mVarA);
            v2.this.f38917f.j(iC);
            v2.this.v(zB);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void postMessage(java.lang.String r5) {
            /*
                r4 = this;
                com.onesignal.F1$v r0 = com.onesignal.F1.v.DEBUG     // Catch: org.json.JSONException -> L35
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L35
                r1.<init>()     // Catch: org.json.JSONException -> L35
                java.lang.String r2 = "OSJavaScriptInterface:postMessage: "
                r1.append(r2)     // Catch: org.json.JSONException -> L35
                r1.append(r5)     // Catch: org.json.JSONException -> L35
                java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> L35
                com.onesignal.F1.c1(r0, r1)     // Catch: org.json.JSONException -> L35
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L35
                r0.<init>(r5)     // Catch: org.json.JSONException -> L35
                java.lang.String r5 = "type"
                java.lang.String r5 = r0.getString(r5)     // Catch: org.json.JSONException -> L35
                int r1 = r5.hashCode()     // Catch: org.json.JSONException -> L35
                r2 = 3
                r3 = 1
                switch(r1) {
                    case -1484226720: goto L4b;
                    case -934437708: goto L41;
                    case 42998156: goto L37;
                    case 1851145598: goto L2b;
                    default: goto L2a;
                }     // Catch: org.json.JSONException -> L35
            L2a:
                goto L55
            L2b:
                java.lang.String r1 = "action_taken"
                boolean r5 = r5.equals(r1)     // Catch: org.json.JSONException -> L35
                if (r5 == 0) goto L55
                r5 = 1
                goto L56
            L35:
                r5 = move-exception
                goto L75
            L37:
                java.lang.String r1 = "rendering_complete"
                boolean r5 = r5.equals(r1)     // Catch: org.json.JSONException -> L35
                if (r5 == 0) goto L55
                r5 = 0
                goto L56
            L41:
                java.lang.String r1 = "resize"
                boolean r5 = r5.equals(r1)     // Catch: org.json.JSONException -> L35
                if (r5 == 0) goto L55
                r5 = 2
                goto L56
            L4b:
                java.lang.String r1 = "page_change"
                boolean r5 = r5.equals(r1)     // Catch: org.json.JSONException -> L35
                if (r5 == 0) goto L55
                r5 = 3
                goto L56
            L55:
                r5 = -1
            L56:
                if (r5 == 0) goto L71
                if (r5 == r3) goto L61
                if (r5 == r2) goto L5d
                goto L78
            L5d:
                r4.e(r0)     // Catch: org.json.JSONException -> L35
                goto L78
            L61:
                com.onesignal.v2 r5 = com.onesignal.v2.this     // Catch: org.json.JSONException -> L35
                com.onesignal.F r5 = com.onesignal.v2.k(r5)     // Catch: org.json.JSONException -> L35
                boolean r5 = r5.O()     // Catch: org.json.JSONException -> L35
                if (r5 != 0) goto L78
                r4.d(r0)     // Catch: org.json.JSONException -> L35
                goto L78
            L71:
                r4.f(r0)     // Catch: org.json.JSONException -> L35
                goto L78
            L75:
                r5.printStackTrace()
            L78:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.v2.k.postMessage(java.lang.String):void");
        }
    }

    public interface l {
        void a();
    }

    public enum m {
        TOP_BANNER,
        BOTTOM_BANNER,
        CENTER_MODAL,
        FULL_SCREEN;

        public boolean isBanner() {
            int i9 = a.f38922a[ordinal()];
            return i9 == 1 || i9 == 2;
        }
    }

    public v2(D0 d02, Activity activity, A0 a02) {
        this.f38916e = d02;
        this.f38915d = activity;
        this.f38917f = a02;
    }

    public static void B(Activity activity, D0 d02, A0 a02) {
        if (a02.g()) {
            E(a02, activity);
        }
        try {
            String strEncodeToString = Base64.encodeToString(a02.a().getBytes("UTF-8"), 2);
            v2 v2Var = new v2(d02, activity, a02);
            f38911m = v2Var;
            OSUtils.S(v2Var.new e(activity, strEncodeToString, a02));
        } catch (UnsupportedEncodingException e9) {
            F1.b(F1.v.ERROR, "Catch on initInAppMessage: ", e9);
            e9.printStackTrace();
        }
    }

    public static void E(A0 a02, Activity activity) {
        String strA = a02.a();
        int[] iArrC = C1.c(activity);
        a02.h(strA + String.format("\n\n<script>\n    setSafeAreaInsets(%s);\n</script>", String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", Integer.valueOf(iArrC[0]), Integer.valueOf(iArrC[1]), Integer.valueOf(iArrC[2]), Integer.valueOf(iArrC[3]))));
    }

    public static void I(D0 d02, A0 a02) {
        Activity activityP = F1.P();
        F1.c1(F1.v.DEBUG, "in app message showMessageContent on currentActivity: " + activityP);
        if (activityP == null) {
            Looper.prepare();
            new Handler().postDelayed(new d(d02, a02), 200L);
            return;
        }
        v2 v2Var = f38911m;
        if (v2Var == null || !d02.f38193k) {
            B(activityP, d02, a02);
        } else {
            v2Var.w(new c(activityP, d02, a02));
        }
    }

    public static void x() {
        F1.c1(F1.v.DEBUG, "WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + f38911m);
        v2 v2Var = f38911m;
        if (v2Var != null) {
            v2Var.w(null);
        }
    }

    public static void y() {
        if (F1.A(F1.v.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    public final int A(Activity activity) {
        return C1.f(activity) - (this.f38917f.g() ? 0 : f38910l * 2);
    }

    public final int C(Activity activity, JSONObject jSONObject) {
        try {
            int iB = C1.b(jSONObject.getJSONObject("rect").getInt("height"));
            F1.v vVar = F1.v.DEBUG;
            F1.c1(vVar, "getPageHeightData:pxHeight: " + iB);
            int iA = A(activity);
            if (iB <= iA) {
                return iB;
            }
            F1.a(vVar, "getPageHeightData:pxHeight is over screen max: " + iA);
            return iA;
        } catch (JSONException e9) {
            F1.b(F1.v.ERROR, "pageRectToViewHeight could not get page height", e9);
            return -1;
        }
    }

    public final void D() {
        C1530a c1530aB = C1533b.b();
        if (c1530aB != null) {
            c1530aB.r(f38909k + this.f38916e.f38963a);
        }
    }

    public final void F(F f9) {
        synchronized (this.f38912a) {
            this.f38914c = f9;
        }
    }

    public final void G(Activity activity) {
        this.f38913b.layout(0, 0, z(activity), A(activity));
    }

    public final void H(Activity activity, String str, boolean z9) {
        y();
        D1 d12 = new D1(activity);
        this.f38913b = d12;
        d12.setOverScrollMode(2);
        this.f38913b.setVerticalScrollBarEnabled(false);
        this.f38913b.setHorizontalScrollBarEnabled(false);
        this.f38913b.getSettings().setJavaScriptEnabled(true);
        this.f38913b.addJavascriptInterface(new k(), "OSAndroid");
        if (z9) {
            this.f38913b.setSystemUiVisibility(3074);
            if (Build.VERSION.SDK_INT >= 30) {
                this.f38913b.setFitsSystemWindows(false);
            }
        }
        t(this.f38913b);
        C1.a(activity, new h(activity, str));
    }

    public final void J(Integer num) {
        synchronized (this.f38912a) {
            try {
                if (this.f38914c == null) {
                    F1.a(F1.v.WARN, "No messageView found to update a with a new height.");
                    return;
                }
                F1.a(F1.v.DEBUG, "In app message, showing first one with height: " + num);
                this.f38914c.U(this.f38913b);
                if (num != null) {
                    this.f38919h = num;
                    this.f38914c.Z(num.intValue());
                }
                this.f38914c.X(this.f38915d);
                this.f38914c.B();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void K() {
        OSUtils.S(new f());
    }

    @Override // com.onesignal.C1530a.b
    public void a(Activity activity) {
        Integer num;
        String str = this.f38918g;
        this.f38915d = activity;
        this.f38918g = activity.getLocalClassName();
        F1.a(F1.v.DEBUG, "In app message activity available currentActivityName: " + this.f38918g + " lastActivityName: " + str);
        if (str == null) {
            num = null;
        } else if (str.equals(this.f38918g)) {
            u();
            return;
        } else {
            if (this.f38921j) {
                return;
            }
            F f9 = this.f38914c;
            if (f9 != null) {
                f9.P();
            }
            num = this.f38919h;
        }
        J(num);
    }

    @Override // com.onesignal.C1530a.b
    public void b(Activity activity) {
        F1.a(F1.v.DEBUG, "In app message activity stopped, cleaning views, currentActivityName: " + this.f38918g + "\nactivity: " + this.f38915d + "\nmessageView: " + this.f38914c);
        if (this.f38914c == null || !activity.getLocalClassName().equals(this.f38918g)) {
            return;
        }
        this.f38914c.P();
    }

    public final void t(WebView webView) {
    }

    public final void u() {
        F f9 = this.f38914c;
        if (f9 == null) {
            return;
        }
        if (f9.M() == m.FULL_SCREEN && !this.f38917f.g()) {
            J(null);
        } else {
            F1.a(F1.v.DEBUG, "In app message new activity, calculate height and show ");
            C1.a(this.f38915d, new g());
        }
    }

    public final void v(boolean z9) {
        this.f38919h = Integer.valueOf(this.f38917f.d());
        F(new F(this.f38913b, this.f38917f, z9));
        this.f38914c.R(new i());
        C1530a c1530aB = C1533b.b();
        if (c1530aB != null) {
            c1530aB.c(f38909k + this.f38916e.f38963a, this);
        }
    }

    public void w(l lVar) {
        F f9 = this.f38914c;
        if (f9 == null || this.f38920i) {
            if (lVar != null) {
                lVar.a();
            }
        } else {
            if (this.f38916e != null && f9 != null) {
                F1.b0().e0(this.f38916e);
            }
            this.f38914c.K(new j(lVar));
            this.f38920i = true;
        }
    }

    public final int z(Activity activity) {
        if (this.f38917f.g()) {
            return C1.e(activity);
        }
        return C1.j(activity) - (f38910l * 2);
    }
}
