package q7;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.MediaInfo;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.ExternalPlayerDataBase;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity;
import com.nst.iptvsmarterstvbox.view.activity.ViewDetailsActivity;
import com.nst.iptvsmarterstvbox.view.activity.ViewDetailsTMDBActivity;
import com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories;
import i7.AbstractC1902a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import k.U;
import m7.AbstractC2237a;
import n4.C2281m;
import o4.C2325b;
import o4.C2328e;
import w7.AbstractC2941e;
import w7.C2937a;
import w7.C2939c;
import w7.C2940d;
import x4.C2957a;

/* JADX INFO: loaded from: classes4.dex */
public class i0 extends RecyclerView.g {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static String f48421G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static String f48422H;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f48423A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public VodActivityNewFlowSubCategories f48424B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f48425C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f48426D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C2328e f48427E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f48428F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f48429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f48430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f48431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f48432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f48433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f48434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DatabaseHandler f48435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LiveStreamDBHandler f48436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f48437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RecentWatchDBHandler f48438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SimpleDateFormat f48439n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SharedPreferences f48440o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SharedPreferences.Editor f48441p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SharedPreferences f48442q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SharedPreferences.Editor f48443r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f48444s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f48445t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Boolean f48446u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Date f48447v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Handler f48448w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f48449x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public DateFormat f48450y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Boolean f48451z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48452a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f48453c;

        /* JADX INFO: renamed from: q7.i0$a$a, reason: collision with other inner class name */
        public class RunnableC0422a implements Runnable {
            public RunnableC0422a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    r2 = this;
                    q7.i0$a r0 = q7.i0.a.this
                    java.lang.String r0 = r0.f48452a
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L16
                    q7.i0$a r0 = q7.i0.a.this
                    q7.i0 r0 = q7.i0.this
                    java.util.List r1 = q7.i0.l0(r0)
                L12:
                    q7.i0.n0(r0, r1)
                    goto L3b
                L16:
                    q7.i0$a r0 = q7.i0.a.this
                    q7.i0 r0 = q7.i0.this
                    java.util.List r0 = q7.i0.A0(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L32
                    q7.i0$a r0 = q7.i0.a.this
                    q7.i0 r0 = q7.i0.this
                    java.util.List r0 = q7.i0.A0(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L3b
                L32:
                    q7.i0$a r0 = q7.i0.a.this
                    q7.i0 r0 = q7.i0.this
                    java.util.List r1 = q7.i0.A0(r0)
                    goto L12
                L3b:
                    q7.i0$a r0 = q7.i0.a.this
                    q7.i0 r0 = q7.i0.this
                    java.util.List r0 = q7.i0.m0(r0)
                    int r0 = r0.size()
                    if (r0 != 0) goto L51
                    q7.i0$a r0 = q7.i0.a.this
                    android.widget.TextView r0 = r0.f48453c
                    r1 = 0
                    r0.setVisibility(r1)
                L51:
                    q7.i0$a r0 = q7.i0.a.this
                    q7.i0 r0 = q7.i0.this
                    int r1 = r0.f48445t
                    r0.f48444s = r1
                    r0.w()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.i0.a.RunnableC0422a.run():void");
            }
        }

        public a(String str, TextView textView) {
            this.f48452a = str;
            this.f48453c = textView;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:2:0x0000, B:4:0x001c, B:5:0x0025, B:7:0x002d, B:21:0x0094, B:8:0x003d, B:10:0x0049, B:13:0x005a, B:14:0x0064, B:16:0x006a, B:18:0x0076, B:20:0x008a, B:12:0x0051), top: B:24:0x0000 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r4 = this;
                q7.i0 r0 = q7.i0.this     // Catch: java.lang.Exception -> La4
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> La4
                r1.<init>()     // Catch: java.lang.Exception -> La4
                q7.i0.B0(r0, r1)     // Catch: java.lang.Exception -> La4
                q7.i0 r0 = q7.i0.this     // Catch: java.lang.Exception -> La4
                java.lang.String r1 = r4.f48452a     // Catch: java.lang.Exception -> La4
                int r1 = r1.length()     // Catch: java.lang.Exception -> La4
                r0.f48445t = r1     // Catch: java.lang.Exception -> La4
                q7.i0 r0 = q7.i0.this     // Catch: java.lang.Exception -> La4
                java.util.List r0 = q7.i0.A0(r0)     // Catch: java.lang.Exception -> La4
                if (r0 == 0) goto L25
                q7.i0 r0 = q7.i0.this     // Catch: java.lang.Exception -> La4
                java.util.List r0 = q7.i0.A0(r0)     // Catch: java.lang.Exception -> La4
                r0.clear()     // Catch: java.lang.Exception -> La4
            L25:
                java.lang.String r0 = r4.f48452a     // Catch: java.lang.Exception -> La4
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> La4
                if (r0 == 0) goto L3d
                q7.i0 r0 = q7.i0.this     // Catch: java.lang.Exception -> La4
                java.util.List r0 = q7.i0.A0(r0)     // Catch: java.lang.Exception -> La4
                q7.i0 r1 = q7.i0.this     // Catch: java.lang.Exception -> La4
                java.util.List r1 = q7.i0.l0(r1)     // Catch: java.lang.Exception -> La4
                r0.addAll(r1)     // Catch: java.lang.Exception -> La4
                goto L94
            L3d:
                q7.i0 r0 = q7.i0.this     // Catch: java.lang.Exception -> La4
                java.util.List r0 = q7.i0.m0(r0)     // Catch: java.lang.Exception -> La4
                int r0 = r0.size()     // Catch: java.lang.Exception -> La4
                if (r0 == 0) goto L51
                q7.i0 r0 = q7.i0.this     // Catch: java.lang.Exception -> La4
                int r1 = r0.f48444s     // Catch: java.lang.Exception -> La4
                int r0 = r0.f48445t     // Catch: java.lang.Exception -> La4
                if (r1 <= r0) goto L5a
            L51:
                q7.i0 r0 = q7.i0.this     // Catch: java.lang.Exception -> La4
                java.util.List r1 = q7.i0.l0(r0)     // Catch: java.lang.Exception -> La4
                q7.i0.n0(r0, r1)     // Catch: java.lang.Exception -> La4
            L5a:
                q7.i0 r0 = q7.i0.this     // Catch: java.lang.Exception -> La4
                java.util.List r0 = q7.i0.m0(r0)     // Catch: java.lang.Exception -> La4
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> La4
            L64:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> La4
                if (r1 == 0) goto L94
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> La4
                com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel r1 = (com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel) r1     // Catch: java.lang.Exception -> La4
                java.lang.String r2 = r1.getName()     // Catch: java.lang.Exception -> La4
                if (r2 == 0) goto L64
                java.lang.String r2 = r1.getName()     // Catch: java.lang.Exception -> La4
                java.lang.String r2 = r2.toLowerCase()     // Catch: java.lang.Exception -> La4
                java.lang.String r3 = r4.f48452a     // Catch: java.lang.Exception -> La4
                java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Exception -> La4
                boolean r2 = r2.contains(r3)     // Catch: java.lang.Exception -> La4
                if (r2 == 0) goto L64
                q7.i0 r2 = q7.i0.this     // Catch: java.lang.Exception -> La4
                java.util.List r2 = q7.i0.A0(r2)     // Catch: java.lang.Exception -> La4
                r2.add(r1)     // Catch: java.lang.Exception -> La4
                goto L64
            L94:
                q7.i0 r0 = q7.i0.this     // Catch: java.lang.Exception -> La4
                android.content.Context r0 = q7.i0.k0(r0)     // Catch: java.lang.Exception -> La4
                android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Exception -> La4
                q7.i0$a$a r1 = new q7.i0$a$a     // Catch: java.lang.Exception -> La4
                r1.<init>()     // Catch: java.lang.Exception -> La4
                r0.runOnUiThread(r1)     // Catch: java.lang.Exception -> La4
            La4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.i0.a.run():void");
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48456a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48458d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48459e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48460f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48461g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48462h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48463i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48464j;

        public b(int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f48456a = i9;
            this.f48457c = str;
            this.f48458d = str2;
            this.f48459e = str3;
            this.f48460f = str4;
            this.f48461g = str5;
            this.f48462h = str6;
            this.f48463i = str7;
            this.f48464j = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i0.this.R0(this.f48456a, this.f48457c, this.f48458d, this.f48459e, this.f48460f, this.f48461g, this.f48462h, this.f48463i, this.f48464j);
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48466a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48470f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48471g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48472h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48473i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48474j;

        public c(int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f48466a = i9;
            this.f48467c = str;
            this.f48468d = str2;
            this.f48469e = str3;
            this.f48470f = str4;
            this.f48471g = str5;
            this.f48472h = str6;
            this.f48473i = str7;
            this.f48474j = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i0.this.R0(this.f48466a, this.f48467c, this.f48468d, this.f48469e, this.f48470f, this.f48471g, this.f48472h, this.f48473i, this.f48474j);
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48476a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48478d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48479e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48480f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48481g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48482h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48483i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48484j;

        public d(int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f48476a = i9;
            this.f48477c = str;
            this.f48478d = str2;
            this.f48479e = str3;
            this.f48480f = str4;
            this.f48481g = str5;
            this.f48482h = str6;
            this.f48483i = str7;
            this.f48484j = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i0.this.R0(this.f48476a, this.f48477c, this.f48478d, this.f48479e, this.f48480f, this.f48481g, this.f48482h, this.f48483i, this.f48484j);
        }
    }

    public class e implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f48486a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48489e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48490f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48491g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48492h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48493i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48494j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f48495k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f48496l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f48497m;

        public e(k kVar, int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.f48486a = kVar;
            this.f48487c = i9;
            this.f48488d = str;
            this.f48489e = str2;
            this.f48490f = str3;
            this.f48491g = str4;
            this.f48492h = str5;
            this.f48493i = str6;
            this.f48494j = str7;
            this.f48495k = str8;
            this.f48496l = str9;
            this.f48497m = str10;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(i0.this.f48429d).equals("m3u")) {
                i0.this.Q0(this.f48486a, this.f48487c, this.f48488d, this.f48489e, this.f48490f, this.f48491g, this.f48492h, this.f48493i, this.f48494j, this.f48495k);
                return true;
            }
            i0.this.O0(this.f48486a, this.f48487c, this.f48488d, this.f48489e, this.f48490f, this.f48491g, this.f48492h, this.f48493i, this.f48494j, this.f48496l, this.f48497m);
            return true;
        }
    }

    public class f implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f48499a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48503f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48504g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48505h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48506i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48507j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f48508k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f48509l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f48510m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f48511n;

        public f(k kVar, int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, String str9, String str10) {
            this.f48499a = kVar;
            this.f48500c = i9;
            this.f48501d = str;
            this.f48502e = str2;
            this.f48503f = str3;
            this.f48504g = str4;
            this.f48505h = str5;
            this.f48506i = str6;
            this.f48507j = str7;
            this.f48508k = str8;
            this.f48509l = i10;
            this.f48510m = str9;
            this.f48511n = str10;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(i0.this.f48429d).equals("m3u")) {
                i0.this.Q0(this.f48499a, this.f48500c, this.f48501d, this.f48502e, this.f48503f, this.f48504g, this.f48505h, this.f48506i, this.f48507j, this.f48508k);
                return true;
            }
            i0.this.O0(this.f48499a, this.f48509l, this.f48501d, this.f48502e, this.f48503f, this.f48504g, this.f48505h, this.f48506i, this.f48507j, this.f48510m, this.f48511n);
            return true;
        }
    }

    public class g implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f48513a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48515d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48517f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48518g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48519h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48520i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48521j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f48522k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f48523l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f48524m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f48525n;

        public g(k kVar, int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, String str9, String str10) {
            this.f48513a = kVar;
            this.f48514c = i9;
            this.f48515d = str;
            this.f48516e = str2;
            this.f48517f = str3;
            this.f48518g = str4;
            this.f48519h = str5;
            this.f48520i = str6;
            this.f48521j = str7;
            this.f48522k = str8;
            this.f48523l = i10;
            this.f48524m = str9;
            this.f48525n = str10;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(i0.this.f48429d).equals("m3u")) {
                i0.this.Q0(this.f48513a, this.f48514c, this.f48515d, this.f48516e, this.f48517f, this.f48518g, this.f48519h, this.f48520i, this.f48521j, this.f48522k);
                return true;
            }
            i0.this.O0(this.f48513a, this.f48523l, this.f48515d, this.f48516e, this.f48517f, this.f48518g, this.f48519h, this.f48520i, this.f48521j, this.f48524m, this.f48525n);
            return true;
        }
    }

    public class h implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f48527a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48531f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48532g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48533h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48534i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48535j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f48536k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f48537l;

        public h(k kVar, int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.f48527a = kVar;
            this.f48528c = i9;
            this.f48529d = str;
            this.f48530e = str2;
            this.f48531f = str3;
            this.f48532g = str4;
            this.f48533h = str5;
            this.f48534i = str6;
            this.f48535j = str7;
            this.f48536k = str8;
            this.f48537l = str9;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i0.this.O0(this.f48527a, this.f48528c, this.f48529d, this.f48530e, this.f48531f, this.f48532g, this.f48533h, this.f48534i, this.f48535j, this.f48536k, this.f48537l);
        }
    }

    public class i implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f48540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48542d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48543e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48544f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48545g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48546h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48547i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ k f48548j;

        public i(String str, int i9, String str2, String str3, String str4, String str5, String str6, String str7, String str8, k kVar) {
            this.f48539a = str;
            this.f48540b = i9;
            this.f48541c = str2;
            this.f48542d = str3;
            this.f48543e = str4;
            this.f48544f = str5;
            this.f48545g = str6;
            this.f48546h = str7;
            this.f48547i = str8;
            this.f48548j = kVar;
        }

        private void a() {
            FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
            favouriteM3UModel.setUrl(this.f48539a);
            favouriteM3UModel.setUserID(SharepreferenceDBHandler.getUserID(i0.this.f48429d));
            favouriteM3UModel.setName(this.f48541c);
            favouriteM3UModel.setCategoryID(this.f48545g);
            i0.this.f48436k.addToFavourite(favouriteM3UModel);
            this.f48548j.f48568y.setVisibility(0);
        }

        private void b() {
            m7.w.w0(i0.this.f48429d, this.f48542d, this.f48540b, this.f48543e, this.f48544f, this.f48546h, this.f48541c, this.f48539a, 0, "", "", "");
        }

        private void c() {
            i0 i0Var = i0.this;
            i0Var.f48436k.deleteFavourite(this.f48539a, SharepreferenceDBHandler.getUserID(i0Var.f48429d));
            this.f48548j.f48568y.setVisibility(4);
        }

        private void d(int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            if (i0.this.f48429d == null) {
                Log.e("Null hai context", ">>>>>>>>>>>True its Null");
                return;
            }
            Intent intent = new Intent(i0.this.f48429d, (Class<?>) ViewDetailsTMDBActivity.class);
            intent.putExtra(AbstractC2237a.f44464Q, String.valueOf(i9));
            intent.putExtra("movie", str);
            intent.putExtra("movie_icon", str7);
            intent.putExtra("selectedPlayer", str2);
            intent.putExtra("streamType", str3);
            intent.putExtra("containerExtension", str4);
            intent.putExtra("categoryID", str5);
            intent.putExtra("num", str6);
            intent.putExtra("videoURL", str8);
            i0.this.f48429d.startActivity(intent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            r2 = new android.content.Intent(r12.f48549k.f48429d, (java.lang.Class<?>) com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity.class);
            r2.putExtra("url", r12.f48539a);
            r2.putExtra("app_name", ((com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass) r12.f48549k.f48423A.get(r1)).getAppname());
            r2.putExtra("packagename", ((com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass) r12.f48549k.f48423A.get(r1)).getPackagename());
            r12.f48549k.f48429d.startActivity(r2);
         */
        @Override // k.U.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onMenuItemClick(android.view.MenuItem r13) {
            /*
                Method dump skipped, instruction units count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.i0.i.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    public class j implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f48551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48555f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48556g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48557h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48558i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48559j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ k f48560k;

        public j(String str, int i9, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, k kVar) {
            this.f48550a = str;
            this.f48551b = i9;
            this.f48552c = str2;
            this.f48553d = str3;
            this.f48554e = str4;
            this.f48555f = str5;
            this.f48556g = str6;
            this.f48557h = str7;
            this.f48558i = str8;
            this.f48559j = str9;
            this.f48560k = kVar;
        }

        private void a() {
            FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
            favouriteDBModel.setCategoryID(this.f48556g);
            favouriteDBModel.setStreamID(this.f48551b);
            favouriteDBModel.setStreamIDOneStream(this.f48559j);
            favouriteDBModel.setName(this.f48553d);
            favouriteDBModel.setNum(this.f48557h);
            favouriteDBModel.setUserID(SharepreferenceDBHandler.getUserID(i0.this.f48429d));
            i0.this.f48435j.addToFavourite(favouriteDBModel, "vod");
            this.f48560k.f48568y.setVisibility(0);
        }

        private void b() {
            m7.w.w0(i0.this.f48429d, this.f48554e, this.f48551b, this.f48555f, this.f48552c, this.f48557h, this.f48553d, "", 0, "", "", "");
        }

        private void c() {
            i0 i0Var = i0.this;
            i0Var.f48435j.deleteFavourite(this.f48551b, this.f48556g, "vod", this.f48553d, SharepreferenceDBHandler.getUserID(i0Var.f48429d), this.f48559j);
            this.f48560k.f48568y.setVisibility(4);
        }

        public final void d(int i9, String str, String str2, String str3, String str4, String str5, String str6) {
            if (i0.this.f48429d != null) {
                Intent intent = new Intent(i0.this.f48429d, (Class<?>) ViewDetailsActivity.class);
                intent.putExtra(AbstractC2237a.f44464Q, String.valueOf(i9));
                intent.putExtra("movie", str);
                intent.putExtra("selectedPlayer", str2);
                intent.putExtra("streamType", str3);
                intent.putExtra("containerExtension", str4);
                intent.putExtra("categoryID", str5);
                intent.putExtra("num", str6);
                i0.this.f48429d.startActivity(intent);
            }
        }

        @Override // k.U.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (i0.this.f48446u.booleanValue() && i0.this.f48423A != null && i0.this.f48423A.size() > 0) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < i0.this.f48423A.size()) {
                            if (menuItem.getItemId() == i9) {
                                String str = this.f48550a;
                                String strU = m7.w.U(i0.this.f48429d, this.f48551b, this.f48552c, "movie");
                                if (SharepreferenceDBHandler.getCurrentAPPType(i0.this.f48429d).equals("onestream_api")) {
                                    Intent intent = new Intent(i0.this.f48429d, (Class<?>) PlayExternalPlayerActivity.class);
                                    intent.putExtra("url", str);
                                    intent.putExtra("app_name", ((ExternalPlayerModelClass) i0.this.f48423A.get(i9)).getAppname());
                                    intent.putExtra("packagename", ((ExternalPlayerModelClass) i0.this.f48423A.get(i9)).getPackagename());
                                    i0.this.f48429d.startActivity(intent);
                                } else {
                                    Intent intent2 = new Intent(i0.this.f48429d, (Class<?>) PlayExternalPlayerActivity.class);
                                    intent2.putExtra("url", strU);
                                    intent2.putExtra("app_name", ((ExternalPlayerModelClass) i0.this.f48423A.get(i9)).getAppname());
                                    intent2.putExtra("packagename", ((ExternalPlayerModelClass) i0.this.f48423A.get(i9)).getPackagename());
                                    i0.this.f48429d.startActivity(intent2);
                                }
                            } else {
                                i9++;
                            }
                        }
                    }
                }
                break;
            } catch (Exception unused) {
            }
            int itemId = menuItem.getItemId();
            if (itemId == a7.f.Hb) {
                if (i0.this.f48446u.booleanValue()) {
                    b();
                }
            } else if (itemId == a7.f.Bb) {
                a();
            } else if (itemId == a7.f.Lb) {
                c();
            } else if (itemId == a7.f.nb) {
                d(this.f48551b, this.f48553d, this.f48554e, this.f48555f, this.f48552c, this.f48556g, this.f48557h);
            } else if (itemId == a7.f.Eb) {
                if ((i0.this.f48424B != null || !i0.this.f48426D) && i0.this.f48424B != null) {
                    i0.this.f48424B.J1(this.f48551b, this.f48553d, i0.this.f48429d, i0.this.f48438m);
                }
            } else if (itemId == a7.f.zc && i0.this.f48446u.booleanValue()) {
                C2281m c2281m = new C2281m(1);
                String str2 = this.f48553d;
                if (str2 != null && !str2.isEmpty()) {
                    c2281m.M("com.google.android.gms.cast.metadata.TITLE", this.f48553d);
                }
                String str3 = this.f48558i;
                if (str3 != null && !str3.isEmpty()) {
                    c2281m.c(new C2957a(Uri.parse(this.f48558i)));
                }
                AbstractC1902a.d(new MediaInfo.a(m7.w.U(i0.this.f48429d, this.f48551b, this.f48552c, "movie")).e(1).b("videos/mp4").d(c2281m).a(), i0.this.f48427E, i0.this.f48429d);
            }
            return false;
        }
    }

    public static class k extends RecyclerView.D {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public ImageView f48562A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f48563t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public RelativeLayout f48564u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ImageView f48565v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public CardView f48566w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public TextView f48567x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public ImageView f48568y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public LinearLayout f48569z;

        public k(View view) {
            super(view);
            this.f48563t = (TextView) view.findViewById(a7.f.Fl);
            this.f48564u = (RelativeLayout) view.findViewById(a7.f.Ge);
            this.f48565v = (ImageView) view.findViewById(a7.f.f12102B5);
            this.f48566w = (CardView) view.findViewById(a7.f.f12178J1);
            this.f48567x = (TextView) view.findViewById(a7.f.Ul);
            this.f48568y = (ImageView) view.findViewById(a7.f.f12406g5);
            this.f48569z = (LinearLayout) view.findViewById(a7.f.f12235O8);
            this.f48562A = (ImageView) view.findViewById(a7.f.f12318X5);
            J(false);
        }
    }

    public class l implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f48570a;

        public l(View view) {
            this.f48570a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48570a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48570a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48570a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            int i9;
            if (z9) {
                f9 = z9 ? 1.1f : 1.0f;
                Log.e("id is", "" + this.f48570a.getTag());
                if (this.f48570a.getTag() != null && this.f48570a.getTag().equals("1")) {
                    b(f9);
                    view2 = this.f48570a;
                    i9 = a7.e.f12010h;
                } else if (this.f48570a.getTag() == null || !this.f48570a.getTag().equals("2")) {
                    b(f9);
                    return;
                } else {
                    b(f9);
                    view2 = this.f48570a;
                    i9 = a7.e.f12024k1;
                }
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(z9);
                if ((this.f48570a.getTag() == null || !this.f48570a.getTag().equals("1")) && (this.f48570a.getTag() == null || !this.f48570a.getTag().equals("2"))) {
                    b(f9);
                    c(f9);
                    return;
                } else {
                    b(f9);
                    c(f9);
                    view2 = this.f48570a;
                    i9 = a7.e.f12038o;
                }
            }
            view2.setBackgroundResource(i9);
        }
    }

    public i0(List list, Context context, boolean z9) {
        String str;
        String str2;
        this.f48446u = Boolean.TRUE;
        Boolean bool = Boolean.FALSE;
        this.f48451z = bool;
        this.f48425C = "";
        this.f48426D = true;
        this.f48428F = 0;
        this.f48430e = list;
        this.f48429d = context;
        this.f48433h = m7.w.S0(C2937a.a());
        f48422H = context.getApplicationContext().getPackageName();
        this.f48432g = new ArrayList();
        f48421G = K0(context);
        this.f48437l = m7.w.S0(C2940d.d());
        this.f48432g.addAll(list);
        Locale locale = Locale.US;
        this.f48439n = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f48434i = list;
        this.f48450y = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f48435j = new DatabaseHandler(context);
        this.f48436k = new LiveStreamDBHandler(context);
        this.f48447v = new Date();
        this.f48438m = new RecentWatchDBHandler(context);
        SimpleDateFormat simpleDateFormat = this.f48439n;
        if (F0(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(context))), this.f48450y.format(this.f48447v)) >= C2939c.p() && (str = this.f48433h) != null && this.f48437l != null && (!f48421G.equals(str) || (this.f48433h != null && (str2 = this.f48437l) != null && !f48422H.equals(str2)))) {
            this.f48446u = bool;
        }
        this.f48448w = new Handler();
        this.f48426D = z9;
    }

    public i0(List list, Context context, boolean z9, VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
        String str;
        String str2;
        this.f48446u = Boolean.TRUE;
        Boolean bool = Boolean.FALSE;
        this.f48451z = bool;
        this.f48425C = "";
        this.f48426D = true;
        this.f48428F = 0;
        this.f48430e = list;
        this.f48429d = context;
        this.f48433h = m7.w.S0(C2937a.a());
        ArrayList arrayList = new ArrayList();
        this.f48432g = arrayList;
        arrayList.addAll(list);
        f48422H = context.getApplicationContext().getPackageName();
        this.f48434i = list;
        f48421G = K0(context);
        this.f48435j = new DatabaseHandler(context);
        this.f48436k = new LiveStreamDBHandler(context);
        this.f48437l = m7.w.S0(C2940d.d());
        Locale locale = Locale.US;
        this.f48439n = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f48438m = new RecentWatchDBHandler(context);
        this.f48450y = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f48448w = new Handler();
        this.f48447v = new Date();
        this.f48426D = z9;
        SimpleDateFormat simpleDateFormat = this.f48439n;
        if (F0(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(context))), this.f48450y.format(this.f48447v)) >= C2939c.p() && (str = this.f48433h) != null && this.f48437l != null && (!f48421G.equals(str) || (this.f48433h != null && (str2 = this.f48437l) != null && !f48422H.equals(str2)))) {
            this.f48446u = bool;
        }
        this.f48424B = vodActivityNewFlowSubCategories;
    }

    public static long F0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    public static String K0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0(int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (this.f48429d == null) {
            Log.e("Null hai context", ">>>>>>>>>>>True its Null");
            return;
        }
        Intent intent = (AbstractC2237a.f44540u.booleanValue() && SharepreferenceDBHandler.getCurrentAPPType(this.f48429d).equals("m3u")) ? new Intent(this.f48429d, (Class<?>) ViewDetailsTMDBActivity.class) : new Intent(this.f48429d, (Class<?>) ViewDetailsActivity.class);
        intent.putExtra(AbstractC2237a.f44464Q, String.valueOf(i9));
        intent.putExtra("movie", str);
        intent.putExtra("movie_icon", str7);
        intent.putExtra("selectedPlayer", str2);
        intent.putExtra("streamType", str3);
        intent.putExtra("containerExtension", str4);
        intent.putExtra("categoryID", str5);
        intent.putExtra("num", str6);
        intent.putExtra("videoURL", str8);
        this.f48429d.startActivity(intent);
    }

    public void J0(String str, TextView textView) {
        new Thread(new a(str, textView)).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0182  */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(q7.i0.k r30, int r31) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.i0.E(q7.i0$k, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public k L(ViewGroup viewGroup, int i9) {
        LayoutInflater layoutInflaterFrom;
        int i10;
        SharedPreferences sharedPreferences = this.f48429d.getSharedPreferences("showhidemoviename", 0);
        this.f48440o = sharedPreferences;
        this.f48428F = sharedPreferences.getInt("vod", 1);
        this.f48441p = this.f48440o.edit();
        SharedPreferences sharedPreferences2 = this.f48429d.getSharedPreferences("listgridview", 0);
        this.f48442q = sharedPreferences2;
        this.f48443r = sharedPreferences2.edit();
        int i11 = this.f48442q.getInt("vod", 0);
        AbstractC2237a.f44458N = i11;
        if (i11 == 1) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12733V4;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12911y4;
        }
        return new k(layoutInflaterFrom.inflate(i10, viewGroup, false));
    }

    public final void O0(k kVar, int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Menu menuB;
        int i10;
        Context context = this.f48429d;
        if (context != null) {
            k.U u9 = new k.U(context, kVar.f48567x);
            u9.d(a7.h.f12925h);
            ArrayList<FavouriteDBModel> arrayListCheckFavourite = this.f48435j.checkFavourite(i9, str, "vod", SharepreferenceDBHandler.getUserID(this.f48429d), str8);
            if (arrayListCheckFavourite == null || arrayListCheckFavourite.size() <= 0) {
                menuB = u9.b();
                i10 = 3;
            } else {
                menuB = u9.b();
                i10 = 4;
            }
            menuB.getItem(i10).setVisible(true);
            if (this.f48426D) {
                u9.b().getItem(5).setVisible(false);
            } else {
                u9.b().getItem(5).setVisible(true);
            }
            try {
                C2328e c2328eC = C2325b.e(this.f48429d).c().c();
                this.f48427E = c2328eC;
                if (c2328eC == null || !c2328eC.c()) {
                    u9.b().getItem(7).setVisible(false);
                } else {
                    u9.b().getItem(7).setVisible(true);
                }
            } catch (Exception e9) {
                Log.e("sdng", "" + e9);
            }
            try {
                if (this.f48446u.booleanValue()) {
                    this.f48423A = new ArrayList();
                    ArrayList<ExternalPlayerModelClass> externalPlayer = new ExternalPlayerDataBase(this.f48429d).getExternalPlayer();
                    this.f48423A = externalPlayer;
                    if (externalPlayer != null && externalPlayer.size() > 0) {
                        for (int i11 = 0; i11 < this.f48423A.size(); i11++) {
                            u9.b().add(0, i11, i11, ((ExternalPlayerModelClass) this.f48423A.get(i11)).getAppname());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            u9.f(new j(str9, i9, str5, str2, str3, str4, str, str6, str7, str8, kVar));
            u9.g();
        }
    }

    public final void Q0(k kVar, int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Menu menuB;
        int i10;
        Context context = this.f48429d;
        if (context != null) {
            k.U u9 = new k.U(context, kVar.f48567x);
            u9.d(a7.h.f12925h);
            ArrayList<FavouriteM3UModel> arrayListCheckFavourite = this.f48436k.checkFavourite(str8, SharepreferenceDBHandler.getUserID(this.f48429d));
            if (arrayListCheckFavourite == null || arrayListCheckFavourite.size() <= 0) {
                menuB = u9.b();
                i10 = 3;
            } else {
                menuB = u9.b();
                i10 = 4;
            }
            menuB.getItem(i10).setVisible(true);
            if (this.f48426D) {
                u9.b().getItem(5).setVisible(false);
            } else {
                u9.b().getItem(5).setVisible(true);
            }
            try {
                C2328e c2328eC = C2325b.e(this.f48429d).c().c();
                this.f48427E = c2328eC;
                if (c2328eC == null || !c2328eC.c()) {
                    u9.b().getItem(7).setVisible(false);
                } else {
                    u9.b().getItem(7).setVisible(true);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            this.f48423A = new ArrayList();
            ArrayList<ExternalPlayerModelClass> externalPlayer = new ExternalPlayerDataBase(this.f48429d).getExternalPlayer();
            this.f48423A = externalPlayer;
            if (externalPlayer != null && externalPlayer.size() > 0) {
                for (int i11 = 0; i11 < this.f48423A.size(); i11++) {
                    u9.b().add(0, i11, i11, ((ExternalPlayerModelClass) this.f48423A.get(i11)).getAppname());
                }
            }
            u9.f(new i(str8, i9, str2, str3, str4, str5, str, str6, str7, kVar));
            u9.g();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f48430e.size();
    }
}
