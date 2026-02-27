package q7;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.ExternalPlayerDataBase;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import com.nst.iptvsmarterstvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U;
import com.nst.iptvsmarterstvbox.view.activity.SeriesDetailM3UActivity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import k.U;
import m7.AbstractC2237a;
import w7.AbstractC2941e;
import w7.C2937a;
import w7.C2939c;
import w7.C2940d;

/* JADX INFO: loaded from: classes4.dex */
public class W extends RecyclerView.g {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static String f47608C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static String f47609D;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f47610A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LiveStreamDBHandler f47611B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f47612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f47613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f47614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f47615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f47616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f47617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DatabaseHandler f47618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f47619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RecentWatchDBHandler f47620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SimpleDateFormat f47621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SharedPreferences f47622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f47623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f47624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Boolean f47625q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Date f47626r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Handler f47627s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f47628t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public DateFormat f47629u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f47630v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f47631w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f47632x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SeriesActivityNewFlowSubCategoriesM3U f47633y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f47634z;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f47635a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f47638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47640g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f47641h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f47642i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f47643j;

        public a(int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f47635a = i9;
            this.f47636c = str;
            this.f47637d = str2;
            this.f47638e = str3;
            this.f47639f = str4;
            this.f47640g = str5;
            this.f47641h = str6;
            this.f47642i = str7;
            this.f47643j = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            W.this.O0(this.f47635a, this.f47636c, this.f47637d, this.f47638e, this.f47639f, this.f47640g, this.f47641h, this.f47642i, this.f47643j);
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f47645a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47647d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f47648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47649f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47650g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f47651h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f47652i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f47653j;

        public b(int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f47645a = i9;
            this.f47646c = str;
            this.f47647d = str2;
            this.f47648e = str3;
            this.f47649f = str4;
            this.f47650g = str5;
            this.f47651h = str6;
            this.f47652i = str7;
            this.f47653j = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            W.this.O0(this.f47645a, this.f47646c, this.f47647d, this.f47648e, this.f47649f, this.f47650g, this.f47651h, this.f47652i, this.f47653j);
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f47655a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f47658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47659f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47660g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f47661h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f47662i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f47663j;

        public c(int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f47655a = i9;
            this.f47656c = str;
            this.f47657d = str2;
            this.f47658e = str3;
            this.f47659f = str4;
            this.f47660g = str5;
            this.f47661h = str6;
            this.f47662i = str7;
            this.f47663j = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            W.this.O0(this.f47655a, this.f47656c, this.f47657d, this.f47658e, this.f47659f, this.f47660g, this.f47661h, this.f47662i, this.f47663j);
        }
    }

    public class d implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f47665a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f47666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47667d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f47668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47669f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47670g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f47671h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f47672i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f47673j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f47674k;

        public d(j jVar, int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f47665a = jVar;
            this.f47666c = i9;
            this.f47667d = str;
            this.f47668e = str2;
            this.f47669f = str3;
            this.f47670g = str4;
            this.f47671h = str5;
            this.f47672i = str6;
            this.f47673j = str7;
            this.f47674k = str8;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            W.this.N0(this.f47665a, this.f47666c, this.f47667d, this.f47668e, this.f47669f, this.f47670g, this.f47671h, this.f47672i, this.f47673j, this.f47674k);
            return true;
        }
    }

    public class e implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f47676a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f47677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f47679e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47680f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47681g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f47682h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f47683i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f47684j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f47685k;

        public e(j jVar, int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f47676a = jVar;
            this.f47677c = i9;
            this.f47678d = str;
            this.f47679e = str2;
            this.f47680f = str3;
            this.f47681g = str4;
            this.f47682h = str5;
            this.f47683i = str6;
            this.f47684j = str7;
            this.f47685k = str8;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            W.this.N0(this.f47676a, this.f47677c, this.f47678d, this.f47679e, this.f47680f, this.f47681g, this.f47682h, this.f47683i, this.f47684j, this.f47685k);
            return true;
        }
    }

    public class f implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f47687a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f47688c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47689d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f47690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47691f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47692g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f47693h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f47694i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f47695j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f47696k;

        public f(j jVar, int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f47687a = jVar;
            this.f47688c = i9;
            this.f47689d = str;
            this.f47690e = str2;
            this.f47691f = str3;
            this.f47692g = str4;
            this.f47693h = str5;
            this.f47694i = str6;
            this.f47695j = str7;
            this.f47696k = str8;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            W.this.N0(this.f47687a, this.f47688c, this.f47689d, this.f47690e, this.f47691f, this.f47692g, this.f47693h, this.f47694i, this.f47695j, this.f47696k);
            return true;
        }
    }

    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f47698a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f47699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47700d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f47701e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47702f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47703g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f47704h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f47705i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f47706j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f47707k;

        public g(j jVar, int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f47698a = jVar;
            this.f47699c = i9;
            this.f47700d = str;
            this.f47701e = str2;
            this.f47702f = str3;
            this.f47703g = str4;
            this.f47704h = str5;
            this.f47705i = str6;
            this.f47706j = str7;
            this.f47707k = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            W.this.N0(this.f47698a, this.f47699c, this.f47700d, this.f47701e, this.f47702f, this.f47703g, this.f47704h, this.f47705i, this.f47706j, this.f47707k);
        }
    }

    public class h implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f47710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f47713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47714f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47715g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f47716h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f47717i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ j f47718j;

        public h(String str, int i9, String str2, String str3, String str4, String str5, String str6, String str7, String str8, j jVar) {
            this.f47709a = str;
            this.f47710b = i9;
            this.f47711c = str2;
            this.f47712d = str3;
            this.f47713e = str4;
            this.f47714f = str5;
            this.f47715g = str6;
            this.f47716h = str7;
            this.f47717i = str8;
            this.f47718j = jVar;
        }

        private void a() {
            FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
            favouriteM3UModel.setUrl(this.f47709a);
            favouriteM3UModel.setUserID(SharepreferenceDBHandler.getUserID(W.this.f47612d));
            favouriteM3UModel.setName(this.f47711c);
            favouriteM3UModel.setCategoryID(this.f47715g);
            W.this.f47611B.addToFavourite(favouriteM3UModel);
            this.f47718j.f47730y.setVisibility(0);
        }

        private void c() {
            W w9 = W.this;
            w9.f47611B.deleteFavourite(this.f47709a, SharepreferenceDBHandler.getUserID(w9.f47612d));
            this.f47718j.f47730y.setVisibility(4);
        }

        public final void b() {
            m7.w.w0(W.this.f47612d, this.f47712d, this.f47710b, this.f47713e, this.f47714f, this.f47716h, this.f47711c, this.f47709a, 0, "", "", "");
        }

        public final void d(int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            if (W.this.f47612d == null) {
                Log.e("Null hai context", ">>>>>>>>>>>True its Null");
                return;
            }
            Intent intent = new Intent(W.this.f47612d, (Class<?>) SeriesDetailM3UActivity.class);
            intent.putExtra("series_num", str6);
            intent.putExtra("episode_name", str);
            intent.putExtra("series_name", W.this.f47630v);
            intent.putExtra("series_icon", str7);
            intent.putExtra("episode_url", str8);
            intent.putExtra("series_categoryId", str5);
            W.this.f47612d.startActivity(intent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            r2 = new android.content.Intent(r12.f47719k.f47612d, (java.lang.Class<?>) com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity.class);
            r2.putExtra("url", r12.f47709a);
            r2.putExtra("app_name", ((com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass) r12.f47719k.f47632x.get(r1)).getAppname());
            r2.putExtra("packagename", ((com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass) r12.f47719k.f47632x.get(r1)).getPackagename());
            r12.f47719k.f47612d.startActivity(r2);
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
            throw new UnsupportedOperationException("Method not decompiled: q7.W.h.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47720a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f47721c;

        public class a implements Runnable {
            public a() {
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
                    q7.W$i r0 = q7.W.i.this
                    java.lang.String r0 = r0.f47720a
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L16
                    q7.W$i r0 = q7.W.i.this
                    q7.W r0 = q7.W.this
                    java.util.List r1 = q7.W.A0(r0)
                L12:
                    q7.W.m0(r0, r1)
                    goto L3b
                L16:
                    q7.W$i r0 = q7.W.i.this
                    q7.W r0 = q7.W.this
                    java.util.List r0 = q7.W.x0(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L32
                    q7.W$i r0 = q7.W.i.this
                    q7.W r0 = q7.W.this
                    java.util.List r0 = q7.W.x0(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L3b
                L32:
                    q7.W$i r0 = q7.W.i.this
                    q7.W r0 = q7.W.this
                    java.util.List r1 = q7.W.x0(r0)
                    goto L12
                L3b:
                    q7.W$i r0 = q7.W.i.this
                    q7.W r0 = q7.W.this
                    java.util.List r0 = q7.W.l0(r0)
                    int r0 = r0.size()
                    if (r0 != 0) goto L51
                    q7.W$i r0 = q7.W.i.this
                    android.widget.TextView r0 = r0.f47721c
                    r1 = 0
                    r0.setVisibility(r1)
                L51:
                    q7.W$i r0 = q7.W.i.this
                    q7.W r0 = q7.W.this
                    int r1 = r0.f47624p
                    r0.f47623o = r1
                    r0.w()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.W.i.a.run():void");
            }
        }

        public i(String str, TextView textView) {
            this.f47720a = str;
            this.f47721c = textView;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r4 = this;
                q7.W r0 = q7.W.this
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                q7.W.z0(r0, r1)
                q7.W r0 = q7.W.this
                java.lang.String r1 = r4.f47720a
                int r1 = r1.length()
                r0.f47624p = r1
                q7.W r0 = q7.W.this
                java.util.List r0 = q7.W.x0(r0)
                if (r0 == 0) goto L25
                q7.W r0 = q7.W.this
                java.util.List r0 = q7.W.x0(r0)
                r0.clear()
            L25:
                java.lang.String r0 = r4.f47720a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L3d
                q7.W r0 = q7.W.this
                java.util.List r0 = q7.W.x0(r0)
                q7.W r1 = q7.W.this
                java.util.List r1 = q7.W.A0(r1)
                r0.addAll(r1)
                goto L94
            L3d:
                q7.W r0 = q7.W.this
                java.util.List r0 = q7.W.l0(r0)
                int r0 = r0.size()
                if (r0 == 0) goto L51
                q7.W r0 = q7.W.this
                int r1 = r0.f47623o
                int r0 = r0.f47624p
                if (r1 <= r0) goto L5a
            L51:
                q7.W r0 = q7.W.this
                java.util.List r1 = q7.W.A0(r0)
                q7.W.m0(r0, r1)
            L5a:
                q7.W r0 = q7.W.this
                java.util.List r0 = q7.W.l0(r0)
                java.util.Iterator r0 = r0.iterator()
            L64:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L94
                java.lang.Object r1 = r0.next()
                com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel r1 = (com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel) r1
                java.lang.String r2 = r1.getName()
                if (r2 == 0) goto L64
                java.lang.String r2 = r1.getName()
                java.lang.String r2 = r2.toLowerCase()
                java.lang.String r3 = r4.f47720a
                java.lang.String r3 = r3.toLowerCase()
                boolean r2 = r2.contains(r3)
                if (r2 == 0) goto L64
                q7.W r2 = q7.W.this
                java.util.List r2 = q7.W.x0(r2)
                r2.add(r1)
                goto L64
            L94:
                q7.W r0 = q7.W.this
                android.content.Context r0 = q7.W.q0(r0)
                android.app.Activity r0 = (android.app.Activity) r0
                q7.W$i$a r1 = new q7.W$i$a
                r1.<init>()
                r0.runOnUiThread(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.W.i.run():void");
        }
    }

    public static class j extends RecyclerView.D {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public ImageView f47724A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f47725t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public RelativeLayout f47726u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ImageView f47727v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public CardView f47728w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public TextView f47729x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public ImageView f47730y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public LinearLayout f47731z;

        public j(View view) {
            super(view);
            this.f47725t = (TextView) view.findViewById(a7.f.lk);
            this.f47726u = (RelativeLayout) view.findViewById(a7.f.Ge);
            this.f47727v = (ImageView) view.findViewById(a7.f.f12102B5);
            this.f47728w = (CardView) view.findViewById(a7.f.f12178J1);
            this.f47729x = (TextView) view.findViewById(a7.f.Ul);
            this.f47730y = (ImageView) view.findViewById(a7.f.f12406g5);
            this.f47731z = (LinearLayout) view.findViewById(a7.f.f12235O8);
            this.f47724A = (ImageView) view.findViewById(a7.f.f12318X5);
            J(false);
        }
    }

    public class k implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f47732a;

        public k(View view) {
            this.f47732a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47732a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47732a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47732a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                b(z9 ? 1.1f : 1.0f);
                Log.e("id is", "" + this.f47732a.getTag());
                return;
            }
            if (z9) {
                return;
            }
            float f9 = z9 ? 1.09f : 1.0f;
            b(f9);
            c(f9);
            a(z9);
        }
    }

    public W(List list, Context context, boolean z9, SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U, String str) {
        String str2;
        String str3;
        this.f47625q = Boolean.TRUE;
        Boolean bool = Boolean.FALSE;
        this.f47631w = bool;
        this.f47634z = "";
        this.f47610A = true;
        this.f47613e = list;
        this.f47630v = str;
        this.f47612d = context;
        this.f47616h = m7.w.S0(C2937a.a());
        ArrayList arrayList = new ArrayList();
        this.f47615g = arrayList;
        arrayList.addAll(list);
        f47609D = context.getApplicationContext().getPackageName();
        this.f47617i = list;
        f47608C = J0(context);
        this.f47618j = new DatabaseHandler(context);
        this.f47619k = m7.w.S0(C2940d.d());
        Locale locale = Locale.US;
        this.f47621m = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f47620l = new RecentWatchDBHandler(context);
        this.f47629u = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f47627s = new Handler();
        this.f47626r = new Date();
        this.f47610A = z9;
        SimpleDateFormat simpleDateFormat = this.f47621m;
        if (B0(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(context))), this.f47629u.format(this.f47626r)) >= C2939c.p() && (str2 = this.f47616h) != null && this.f47619k != null && (!f47608C.equals(str2) || (this.f47616h != null && (str3 = this.f47619k) != null && !f47609D.equals(str3)))) {
            this.f47625q = bool;
        }
        this.f47633y = seriesActivityNewFlowSubCategoriesM3U;
        this.f47611B = new LiveStreamDBHandler(context);
    }

    public W(List list, Context context, boolean z9, String str) {
        String str2;
        String str3;
        this.f47625q = Boolean.TRUE;
        Boolean bool = Boolean.FALSE;
        this.f47631w = bool;
        this.f47634z = "";
        this.f47610A = true;
        this.f47613e = list;
        this.f47630v = str;
        this.f47612d = context;
        this.f47616h = m7.w.S0(C2937a.a());
        f47609D = context.getApplicationContext().getPackageName();
        this.f47615g = new ArrayList();
        f47608C = J0(context);
        this.f47619k = m7.w.S0(C2940d.d());
        this.f47615g.addAll(list);
        Locale locale = Locale.US;
        this.f47621m = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f47617i = list;
        this.f47629u = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f47618j = new DatabaseHandler(context);
        this.f47626r = new Date();
        this.f47620l = new RecentWatchDBHandler(context);
        SimpleDateFormat simpleDateFormat = this.f47621m;
        if (B0(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(context))), this.f47629u.format(this.f47626r)) >= C2939c.p() && (str2 = this.f47616h) != null && this.f47619k != null && (!f47608C.equals(str2) || (this.f47616h != null && (str3 = this.f47619k) != null && !f47609D.equals(str3)))) {
            this.f47625q = bool;
        }
        this.f47627s = new Handler();
        this.f47610A = z9;
        this.f47611B = new LiveStreamDBHandler(context);
    }

    public static long B0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    public static String J0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    public void F0(String str, TextView textView) {
        new Thread(new i(str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public void E(j jVar, int i9) {
        int i10;
        Context context = this.f47612d;
        if (context != null) {
            this.f47628t = i9;
            SharedPreferences sharedPreferences = context.getSharedPreferences("selectedPlayer", 0);
            this.f47614f = sharedPreferences;
            String string = sharedPreferences.getString("selectedPlayer", "");
            if (i9 == 0 && jVar.f47726u != null && !this.f47631w.booleanValue()) {
                this.f47631w = Boolean.TRUE;
                jVar.f47726u.requestFocus();
            }
            if (((LiveStreamsDBModel) this.f47613e.get(i9)).getStreamId() != null) {
                try {
                    i10 = Integer.parseInt(((LiveStreamsDBModel) this.f47613e.get(i9)).getStreamId());
                } catch (NumberFormatException unused) {
                    i10 = 0;
                }
            } else {
                i10 = 0;
            }
            String categoryId = ((LiveStreamsDBModel) this.f47613e.get(i9)).getCategoryId();
            String contaiinerExtension = ((LiveStreamsDBModel) this.f47613e.get(i9)).getContaiinerExtension();
            String streamType = ((LiveStreamsDBModel) this.f47613e.get(i9)).getStreamType();
            String num = ((LiveStreamsDBModel) this.f47613e.get(i9)).getNum();
            jVar.f47725t.setText(((LiveStreamsDBModel) this.f47613e.get(i9)).getName());
            String streamIcon = ((LiveStreamsDBModel) this.f47613e.get(i9)).getStreamIcon();
            String name = ((LiveStreamsDBModel) this.f47613e.get(i9)).getName();
            String url = ((LiveStreamsDBModel) this.f47613e.get(i9)).getUrl();
            if (!this.f47610A) {
                jVar.f47724A.setVisibility(0);
            }
            jVar.f47727v.setImageDrawable(null);
            if (streamIcon == null || streamIcon.equals("")) {
                jVar.f47727v.setImageDrawable(this.f47612d.getResources().getDrawable(a7.e.f12040o1, null));
            } else {
                com.squareup.picasso.t.q(this.f47612d).l(((LiveStreamsDBModel) this.f47613e.get(i9)).getStreamIcon()).d(a7.e.f12040o1).j(a7.e.f12040o1).g(jVar.f47727v);
            }
            if (this.f47611B.checkFavourite(url, SharepreferenceDBHandler.getUserID(this.f47612d)).size() > 0) {
                jVar.f47730y.setVisibility(0);
            } else {
                jVar.f47730y.setVisibility(4);
            }
            int i11 = i10;
            jVar.f47728w.setOnClickListener(new a(i11, name, string, streamType, contaiinerExtension, categoryId, num, streamIcon, url));
            jVar.f47727v.setOnClickListener(new b(i11, name, string, streamType, contaiinerExtension, categoryId, num, streamIcon, url));
            jVar.f47726u.setOnClickListener(new c(i11, name, string, streamType, contaiinerExtension, categoryId, num, streamIcon, url));
            RelativeLayout relativeLayout = jVar.f47726u;
            relativeLayout.setOnFocusChangeListener(new k(relativeLayout));
            int i12 = i10;
            jVar.f47726u.setOnLongClickListener(new d(jVar, i12, categoryId, name, string, streamType, contaiinerExtension, num, url, streamIcon));
            jVar.f47727v.setOnLongClickListener(new e(jVar, i12, categoryId, name, string, streamType, contaiinerExtension, num, url, streamIcon));
            jVar.f47728w.setOnLongClickListener(new f(jVar, i12, categoryId, name, string, streamType, contaiinerExtension, num, url, streamIcon));
            jVar.f47731z.setOnClickListener(new g(jVar, i12, categoryId, name, string, streamType, contaiinerExtension, num, url, streamIcon));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public j L(ViewGroup viewGroup, int i9) {
        LayoutInflater layoutInflaterFrom;
        int i10;
        SharedPreferences sharedPreferences = this.f47612d.getSharedPreferences("listgridview", 0);
        this.f47622n = sharedPreferences;
        int i11 = sharedPreferences.getInt("series", 0);
        AbstractC2237a.f44460O = i11;
        if (i11 == 1) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12733V4;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12727U4;
        }
        return new j(layoutInflaterFrom.inflate(i10, viewGroup, false));
    }

    public final void N0(j jVar, int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Menu menuB;
        int i10;
        Context context = this.f47612d;
        if (context != null) {
            k.U u9 = new k.U(context, jVar.f47729x);
            u9.d(a7.h.f12921d);
            ArrayList<FavouriteM3UModel> arrayListCheckFavourite = this.f47611B.checkFavourite(str7, SharepreferenceDBHandler.getUserID(this.f47612d));
            if (arrayListCheckFavourite == null || arrayListCheckFavourite.size() <= 0) {
                menuB = u9.b();
                i10 = 3;
            } else {
                menuB = u9.b();
                i10 = 4;
            }
            menuB.getItem(i10).setVisible(true);
            if (this.f47610A) {
                u9.b().getItem(5).setVisible(false);
            } else {
                u9.b().getItem(5).setVisible(true);
            }
            try {
                if (this.f47625q.booleanValue()) {
                    this.f47632x = new ArrayList();
                    ArrayList<ExternalPlayerModelClass> externalPlayer = new ExternalPlayerDataBase(this.f47612d).getExternalPlayer();
                    this.f47632x = externalPlayer;
                    if (externalPlayer != null && externalPlayer.size() > 0) {
                        for (int i11 = 0; i11 < this.f47632x.size(); i11++) {
                            u9.b().add(0, i11, i11, ((ExternalPlayerModelClass) this.f47632x.get(i11)).getAppname());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            u9.f(new h(str7, i9, str2, str3, str4, str5, str, str6, str8, jVar));
            u9.g();
        }
    }

    public final void O0(int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (this.f47612d == null) {
            Log.e("Null hai context", ">>>>>>>>>>>True its Null");
            return;
        }
        Intent intent = new Intent(this.f47612d, (Class<?>) SeriesDetailM3UActivity.class);
        intent.putExtra("series_num", str6);
        intent.putExtra("episode_name", str);
        intent.putExtra("series_name", this.f47630v);
        intent.putExtra("series_icon", str7);
        intent.putExtra("episode_url", str8);
        intent.putExtra("series_categoryId", str5);
        this.f47612d.startActivity(intent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f47613e.size();
    }
}
