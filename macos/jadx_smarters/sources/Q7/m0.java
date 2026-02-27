package q7;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton;
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
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.ViewDetailsActivity;
import com.nst.iptvsmarterstvbox.view.activity.ViewDetailsTMDBActivity;
import com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity;
import com.squareup.picasso.InterfaceC1611e;
import i7.AbstractC1902a;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import k.U;
import m7.AbstractC2237a;
import o4.C2325b;
import o4.C2328e;
import q7.C2635t;
import q7.Z;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class m0 extends RecyclerView.g implements Filterable, z7.g {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public RecentWatchDBHandler f48712B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public LiveStreamDBHandler f48713C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public n7.e f48714D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public x f48715E;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f48728i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DatabaseHandler f48730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Animation f48731l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f48732m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f48733n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v f48734o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f48735p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f48738s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SharedPreferences f48739t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C2328e f48740u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f48729j = Boolean.FALSE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f48736q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f48737r = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f48741v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f48742w = "0";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f48743x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f48744y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f48745z = "";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f48711A = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f48716F = "";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f48717G = false;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f48718H = "";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f48719I = "";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f48720J = "";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f48721K = false;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f48722L = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f48723d = VodAllCategoriesSingleton.getInstance().getvodList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f48724e = VodAllCategoriesSingleton.getInstance().getvodList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f48725f = VodAllCategoriesSingleton.getInstance().getContinueWatchingList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f48726g = VodAllCategoriesSingleton.getInstance().getVodFavList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f48727h = VodAllCategoriesSingleton.getInstance().getContinueWatchingList();

    public class a implements InterfaceC1611e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f48746a;

        /* JADX INFO: renamed from: q7.m0$a$a, reason: collision with other inner class name */
        public class C0423a implements InterfaceC1611e {
            public C0423a() {
            }

            @Override // com.squareup.picasso.InterfaceC1611e
            public void a() {
            }

            @Override // com.squareup.picasso.InterfaceC1611e
            public void onSuccess() {
            }
        }

        public a(t tVar) {
            this.f48746a = tVar;
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
            com.squareup.picasso.t.q(m0.this.f48728i).l(String.valueOf(m0.this.f48728i.getResources().getDrawable(a7.e.f11895B1))).e().a().h(this.f48746a.f48909w, new C0423a());
            this.f48746a.f48906t.setVisibility(0);
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    public class b implements InterfaceC1611e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f48749a;

        public class a implements InterfaceC1611e {
            public a() {
            }

            @Override // com.squareup.picasso.InterfaceC1611e
            public void a() {
            }

            @Override // com.squareup.picasso.InterfaceC1611e
            public void onSuccess() {
            }
        }

        public b(x xVar) {
            this.f48749a = xVar;
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
            com.squareup.picasso.t.q(m0.this.f48728i).l(String.valueOf(m0.this.f48728i.getResources().getDrawable(a7.e.f11895B1))).e().a().h(this.f48749a.f48921v, new a());
            this.f48749a.f48919t.setVisibility(0);
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    public class c implements InterfaceC1611e {
        public c() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    public class d implements InterfaceC1611e {
        public d() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48754a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48756d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48758f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48759g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48760h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48761i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48762j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f48763k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f48764l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f48765m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f48766n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f48767o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f48768p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f48769q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f48770r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f48771s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f48772t;

        public e(int i9, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
            this.f48754a = i9;
            this.f48755c = i10;
            this.f48756d = str;
            this.f48757e = str2;
            this.f48758f = str3;
            this.f48759g = str4;
            this.f48760h = str5;
            this.f48761i = str6;
            this.f48762j = str7;
            this.f48763k = str8;
            this.f48764l = str9;
            this.f48765m = str10;
            this.f48766n = str11;
            this.f48767o = str12;
            this.f48768p = str13;
            this.f48769q = str14;
            this.f48770r = str15;
            this.f48771s = str16;
            this.f48772t = str17;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int fav;
            try {
                fav = ((LiveStreamsDBModel) m0.this.f48724e.get(this.f48754a)).getFav();
            } catch (Exception e9) {
                e9.printStackTrace();
                fav = 0;
            }
            m0.this.r1(this.f48755c, this.f48756d, this.f48757e, this.f48758f, this.f48759g, this.f48760h, this.f48761i, this.f48762j, this.f48763k, this.f48754a, this.f48764l, this.f48765m, this.f48766n, this.f48767o, this.f48768p, this.f48769q, this.f48770r, this.f48771s, fav, this.f48772t);
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48774a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48778f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48779g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48780h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48781i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48782j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f48783k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f48784l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f48785m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f48786n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f48787o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f48788p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f48789q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f48790r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f48791s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f48792t;

        public f(int i9, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
            this.f48774a = i9;
            this.f48775c = i10;
            this.f48776d = str;
            this.f48777e = str2;
            this.f48778f = str3;
            this.f48779g = str4;
            this.f48780h = str5;
            this.f48781i = str6;
            this.f48782j = str7;
            this.f48783k = str8;
            this.f48784l = str9;
            this.f48785m = str10;
            this.f48786n = str11;
            this.f48787o = str12;
            this.f48788p = str13;
            this.f48789q = str14;
            this.f48790r = str15;
            this.f48791s = str16;
            this.f48792t = str17;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i9;
            int fav = 0;
            try {
                if (m0.this.f48724e != null && m0.this.f48724e.size() > 0 && m0.this.f48724e.get(this.f48774a) != null) {
                    fav = ((LiveStreamsDBModel) m0.this.f48724e.get(this.f48774a)).getFav();
                }
                i9 = fav;
            } catch (Exception e9) {
                e9.printStackTrace();
                i9 = 0;
            }
            m0.this.r1(this.f48775c, this.f48776d, this.f48777e, this.f48778f, this.f48779g, this.f48780h, this.f48781i, this.f48782j, this.f48783k, this.f48774a, this.f48784l, this.f48785m, this.f48786n, this.f48787o, this.f48788p, this.f48789q, this.f48790r, this.f48791s, i9, this.f48792t);
        }
    }

    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48794a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48795c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48796d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48797e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48798f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48799g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48800h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48801i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48802j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f48803k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f48804l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f48805m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f48806n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f48807o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f48808p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f48809q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f48810r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f48811s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f48812t;

        public g(int i9, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
            this.f48794a = i9;
            this.f48795c = i10;
            this.f48796d = str;
            this.f48797e = str2;
            this.f48798f = str3;
            this.f48799g = str4;
            this.f48800h = str5;
            this.f48801i = str6;
            this.f48802j = str7;
            this.f48803k = str8;
            this.f48804l = str9;
            this.f48805m = str10;
            this.f48806n = str11;
            this.f48807o = str12;
            this.f48808p = str13;
            this.f48809q = str14;
            this.f48810r = str15;
            this.f48811s = str16;
            this.f48812t = str17;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int fav;
            try {
                fav = ((LiveStreamsDBModel) m0.this.f48724e.get(this.f48794a)).getFav();
            } catch (Exception e9) {
                e9.printStackTrace();
                fav = 0;
            }
            m0.this.r1(this.f48795c, this.f48796d, this.f48797e, this.f48798f, this.f48799g, this.f48800h, this.f48801i, this.f48802j, this.f48803k, this.f48794a, this.f48804l, this.f48805m, this.f48806n, this.f48807o, this.f48808p, this.f48809q, this.f48810r, this.f48811s, fav, this.f48812t);
        }
    }

    public class h implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48814a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x f48816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f48817e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48818f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48819g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f48820h;

        public h(int i9, String str, x xVar, int i10, String str2, String str3, int i11) {
            this.f48814a = i9;
            this.f48815c = str;
            this.f48816d = xVar;
            this.f48817e = i10;
            this.f48818f = str2;
            this.f48819g = str3;
            this.f48820h = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(m0.this.f48728i).equals("m3u")) {
                ArrayList<FavouriteM3UModel> arrayListCheckFavourite = m0.this.f48713C.checkFavourite(this.f48815c, SharepreferenceDBHandler.getUserID(m0.this.f48728i));
                m0 m0Var = m0.this;
                m0Var.g1(arrayListCheckFavourite, this.f48816d, this.f48814a, m0Var.f48724e);
                return true;
            }
            if (!SharepreferenceDBHandler.getCurrentAPPType(m0.this.f48728i).equals("stalker_api")) {
                ArrayList<FavouriteDBModel> arrayListCheckFavourite2 = m0.this.f48730k.checkFavourite(this.f48817e, this.f48819g, "vod", SharepreferenceDBHandler.getUserID(m0.this.f48728i), this.f48818f);
                m0 m0Var2 = m0.this;
                m0Var2.f1(arrayListCheckFavourite2, this.f48816d, this.f48814a, m0Var2.f48724e, m0.this.f48727h, this.f48820h, this.f48816d.f48920u);
                return true;
            }
            m7.w.N0(m0.this.f48728i);
            try {
                if (this.f48816d.f48924y.getVisibility() == 0) {
                    m0.this.l1(this.f48817e, this.f48816d, this.f48814a);
                } else {
                    m0.this.c1(this.f48817e, this.f48816d, this.f48814a);
                }
                return true;
            } catch (Exception e9) {
                e9.printStackTrace();
                return true;
            }
        }
    }

    public class i implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48822a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x f48824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f48825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48827g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f48828h;

        public i(int i9, String str, x xVar, int i10, String str2, String str3, int i11) {
            this.f48822a = i9;
            this.f48823c = str;
            this.f48824d = xVar;
            this.f48825e = i10;
            this.f48826f = str2;
            this.f48827g = str3;
            this.f48828h = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(m0.this.f48728i).equals("m3u")) {
                ArrayList<FavouriteM3UModel> arrayListCheckFavourite = m0.this.f48713C.checkFavourite(this.f48823c, SharepreferenceDBHandler.getUserID(m0.this.f48728i));
                m0 m0Var = m0.this;
                m0Var.g1(arrayListCheckFavourite, this.f48824d, this.f48822a, m0Var.f48724e);
                return true;
            }
            if (!SharepreferenceDBHandler.getCurrentAPPType(m0.this.f48728i).equals("stalker_api")) {
                ArrayList<FavouriteDBModel> arrayListCheckFavourite2 = m0.this.f48730k.checkFavourite(this.f48825e, this.f48827g, "vod", SharepreferenceDBHandler.getUserID(m0.this.f48728i), this.f48826f);
                m0 m0Var2 = m0.this;
                m0Var2.f1(arrayListCheckFavourite2, this.f48824d, this.f48822a, m0Var2.f48724e, m0.this.f48727h, this.f48828h, this.f48824d.f48920u);
                return true;
            }
            m7.w.N0(m0.this.f48728i);
            try {
                if (this.f48824d.f48924y.getVisibility() == 0) {
                    m0.this.l1(this.f48825e, this.f48824d, this.f48822a);
                } else {
                    m0.this.c1(this.f48825e, this.f48824d, this.f48822a);
                }
                return true;
            } catch (Exception e9) {
                e9.printStackTrace();
                return true;
            }
        }
    }

    public class j implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48830a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x f48832d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f48833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48834f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48835g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f48836h;

        public j(int i9, String str, x xVar, int i10, String str2, String str3, int i11) {
            this.f48830a = i9;
            this.f48831c = str;
            this.f48832d = xVar;
            this.f48833e = i10;
            this.f48834f = str2;
            this.f48835g = str3;
            this.f48836h = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(m0.this.f48728i).equals("m3u")) {
                ArrayList<FavouriteM3UModel> arrayListCheckFavourite = m0.this.f48713C.checkFavourite(this.f48831c, SharepreferenceDBHandler.getUserID(m0.this.f48728i));
                m0 m0Var = m0.this;
                m0Var.g1(arrayListCheckFavourite, this.f48832d, this.f48830a, m0Var.f48724e);
                return true;
            }
            if (!SharepreferenceDBHandler.getCurrentAPPType(m0.this.f48728i).equals("stalker_api")) {
                ArrayList<FavouriteDBModel> arrayListCheckFavourite2 = m0.this.f48730k.checkFavourite(this.f48833e, this.f48835g, "vod", SharepreferenceDBHandler.getUserID(m0.this.f48728i), this.f48834f);
                m0 m0Var2 = m0.this;
                m0Var2.f1(arrayListCheckFavourite2, this.f48832d, this.f48830a, m0Var2.f48724e, m0.this.f48727h, this.f48836h, this.f48832d.f48920u);
                return true;
            }
            m7.w.N0(m0.this.f48728i);
            try {
                if (this.f48832d.f48924y.getVisibility() == 0) {
                    m0.this.l1(this.f48833e, this.f48832d, this.f48830a);
                } else {
                    m0.this.c1(this.f48833e, this.f48832d, this.f48830a);
                }
                return true;
            } catch (Exception e9) {
                e9.printStackTrace();
                return true;
            }
        }
    }

    public class k implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.D f48838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f48839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f48840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f48841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f48842e;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m0.this.w();
            }
        }

        public class b extends Dialog implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Activity f48845a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public TextView f48846c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public TextView f48847d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public TextView f48848e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public LinearLayout f48849f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public LinearLayout f48850g;

            public class a implements Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (m0.this.f48728i instanceof VodAllDataSingleActivity) {
                        ((VodAllDataSingleActivity) m0.this.f48728i).v2();
                    }
                }
            }

            /* JADX INFO: renamed from: q7.m0$k$b$b, reason: collision with other inner class name */
            public class ViewOnFocusChangeListenerC0424b implements View.OnFocusChangeListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public View f48853a;

                public ViewOnFocusChangeListenerC0424b(View view) {
                    this.f48853a = view;
                }

                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view, boolean z9) {
                    LinearLayout linearLayout;
                    int i9;
                    if (z9) {
                        View view2 = this.f48853a;
                        if (view2 == null || view2.getTag() == null || !this.f48853a.getTag().equals("1")) {
                            View view3 = this.f48853a;
                            if (view3 == null || view3.getTag() == null || !this.f48853a.getTag().equals("2")) {
                                return;
                            } else {
                                linearLayout = b.this.f48850g;
                            }
                        } else {
                            linearLayout = b.this.f48849f;
                        }
                        i9 = a7.e.f12042p;
                    } else {
                        View view4 = this.f48853a;
                        if (view4 == null || view4.getTag() == null || !this.f48853a.getTag().equals("1")) {
                            View view5 = this.f48853a;
                            if (view5 == null || view5.getTag() == null || !this.f48853a.getTag().equals("2")) {
                                return;
                            } else {
                                linearLayout = b.this.f48850g;
                            }
                        } else {
                            linearLayout = b.this.f48849f;
                        }
                        i9 = a7.e.f12038o;
                    }
                    linearLayout.setBackgroundResource(i9);
                }
            }

            public b(Activity activity) {
                super(activity);
                this.f48845a = activity;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RecentWatchDBHandler recentWatchDBHandler;
                String streamId;
                if (view.getId() == a7.f.f12544u1) {
                    try {
                        if (SharepreferenceDBHandler.getCurrentAPPType(m0.this.f48728i).equals("onestream_api")) {
                            recentWatchDBHandler = m0.this.f48712B;
                            k kVar = k.this;
                            streamId = ((LiveStreamsDBModel) kVar.f48841d.get(kVar.f48839b)).getStreamIdOneStream();
                        } else {
                            recentWatchDBHandler = m0.this.f48712B;
                            k kVar2 = k.this;
                            streamId = ((LiveStreamsDBModel) kVar2.f48841d.get(kVar2.f48839b)).getStreamId();
                        }
                        recentWatchDBHandler.updateAllRecordsRecentWatchDB(streamId);
                        if (m0.this.f48728i instanceof VodAllDataSingleActivity) {
                            ((VodAllDataSingleActivity) m0.this.f48728i).A2();
                        }
                        new Handler().postDelayed(new a(), 100L);
                    } catch (Exception unused) {
                    }
                } else if (view.getId() == a7.f.f12412h1) {
                    dismiss();
                }
                dismiss();
            }

            @Override // android.app.Dialog
            public void onCreate(Bundle bundle) {
                super.onCreate(bundle);
                setContentView(new C2858a(m0.this.f48728i).A().equals(AbstractC2237a.f44453K0) ? a7.g.f12742X1 : a7.g.f12736W1);
                this.f48846c = (TextView) findViewById(a7.f.f12544u1);
                this.f48847d = (TextView) findViewById(a7.f.f12412h1);
                this.f48849f = (LinearLayout) findViewById(a7.f.V8);
                this.f48850g = (LinearLayout) findViewById(a7.f.Ia);
                TextView textView = (TextView) findViewById(a7.f.um);
                this.f48848e = textView;
                textView.setText(m0.this.f48728i.getResources().getString(a7.j.Z8));
                this.f48846c.setOnClickListener(this);
                this.f48847d.setOnClickListener(this);
                TextView textView2 = this.f48846c;
                textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0424b(textView2));
                TextView textView3 = this.f48847d;
                textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0424b(textView3));
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m0.this.w();
            }
        }

        public k(RecyclerView.D d9, int i9, ArrayList arrayList, ArrayList arrayList2, int i10) {
            this.f48838a = d9;
            this.f48839b = i9;
            this.f48840c = arrayList;
            this.f48841d = arrayList2;
            this.f48842e = i10;
        }

        @Override // k.U.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (menuItem.getItemId() == a7.f.Bb) {
                m0.this.d1(this.f48838a, this.f48839b, this.f48840c, this.f48841d, this.f48842e);
                new Handler().postDelayed(new a(), 300L);
                if (!(m0.this.f48728i instanceof VodAllDataSingleActivity)) {
                    return true;
                }
                ((VodAllDataSingleActivity) m0.this.f48728i).v2();
                return true;
            }
            if (menuItem.getItemId() != a7.f.Lb) {
                if (menuItem.getItemId() != a7.f.jb) {
                    return false;
                }
                new b((VodAllDataSingleActivity) m0.this.f48728i).show();
                return false;
            }
            m0.this.m1(this.f48838a, this.f48839b, this.f48840c, this.f48841d, this.f48842e);
            new Handler().postDelayed(new c(), 300L);
            if (!(m0.this.f48728i instanceof VodAllDataSingleActivity)) {
                return false;
            }
            ((VodAllDataSingleActivity) m0.this.f48728i).v2();
            return false;
        }
    }

    public class l implements InterfaceC1611e {
        public l() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    public class m implements InterfaceC1611e {
        public m() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    public class n implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48858a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48860d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48862f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48863g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48864h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48865i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48866j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f48867k;

        public n(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i9) {
            this.f48858a = str;
            this.f48859c = str2;
            this.f48860d = str3;
            this.f48861e = str4;
            this.f48862f = str5;
            this.f48863g = str6;
            this.f48864h = str7;
            this.f48865i = str8;
            this.f48866j = str9;
            this.f48867k = i9;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m0.this.f48744y = String.valueOf(this.f48858a);
            m0.this.f48719I = this.f48859c;
            m0.this.f48720J = this.f48860d;
            m0.this.f48741v = this.f48861e;
            m0.this.f48745z = this.f48862f;
            m0.this.f48736q = this.f48863g;
            m0.this.f48742w = this.f48864h;
            m0.this.f48743x = this.f48865i;
            m0.this.f48711A = m7.w.r0(this.f48866j);
            AbstractC2237a.f44518l0 = this.f48867k;
            m0.this.j1();
        }
    }

    public class o implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48869a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48870c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48871d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48872e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48873f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48874g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48875h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48876i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48877j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f48878k;

        public o(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i9) {
            this.f48869a = str;
            this.f48870c = str2;
            this.f48871d = str3;
            this.f48872e = str4;
            this.f48873f = str5;
            this.f48874g = str6;
            this.f48875h = str7;
            this.f48876i = str8;
            this.f48877j = str9;
            this.f48878k = i9;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m0.this.f48744y = String.valueOf(this.f48869a);
            m0.this.f48719I = this.f48870c;
            m0.this.f48720J = this.f48871d;
            m0.this.f48741v = this.f48872e;
            m0.this.f48745z = this.f48873f;
            m0.this.f48736q = this.f48874g;
            m0.this.f48742w = this.f48875h;
            m0.this.f48743x = this.f48876i;
            m0.this.f48711A = m7.w.r0(this.f48877j);
            AbstractC2237a.f44518l0 = this.f48878k;
            m0.this.j1();
        }
    }

    public class p implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48880a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48882d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48884f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48885g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48886h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48887i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48888j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f48889k;

        public p(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i9) {
            this.f48880a = str;
            this.f48881c = str2;
            this.f48882d = str3;
            this.f48883e = str4;
            this.f48884f = str5;
            this.f48885g = str6;
            this.f48886h = str7;
            this.f48887i = str8;
            this.f48888j = str9;
            this.f48889k = i9;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m0.this.f48744y = String.valueOf(this.f48880a);
            m0.this.f48719I = this.f48881c;
            m0.this.f48720J = this.f48882d;
            m0.this.f48741v = this.f48883e;
            m0.this.f48745z = this.f48884f;
            m0.this.f48736q = this.f48885g;
            m0.this.f48742w = this.f48886h;
            m0.this.f48743x = this.f48887i;
            m0.this.f48711A = m7.w.r0(this.f48888j);
            AbstractC2237a.f44518l0 = this.f48889k;
            m0.this.j1();
        }
    }

    public class q implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f48891a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f48893d;

        public q(t tVar, int i9, int i10) {
            this.f48891a = tVar;
            this.f48892c = i9;
            this.f48893d = i10;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            try {
                m0 m0Var = m0.this;
                m0Var.k1(this.f48891a, this.f48892c, m0Var.f48724e, m0.this.f48727h, this.f48893d);
                return true;
            } catch (InterruptedException e9) {
                throw new RuntimeException(e9);
            }
        }
    }

    public class r implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f48895a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f48897d;

        public r(t tVar, int i9, int i10) {
            this.f48895a = tVar;
            this.f48896c = i9;
            this.f48897d = i10;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            try {
                m0 m0Var = m0.this;
                m0Var.k1(this.f48895a, this.f48896c, m0Var.f48724e, m0.this.f48727h, this.f48897d);
                return true;
            } catch (InterruptedException e9) {
                throw new RuntimeException(e9);
            }
        }
    }

    public class s implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f48899a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48900c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f48901d;

        public s(t tVar, int i9, int i10) {
            this.f48899a = tVar;
            this.f48900c = i9;
            this.f48901d = i10;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            try {
                m0 m0Var = m0.this;
                m0Var.k1(this.f48899a, this.f48900c, m0Var.f48724e, m0.this.f48727h, this.f48901d);
                return true;
            } catch (InterruptedException e9) {
                throw new RuntimeException(e9);
            }
        }
    }

    public static class t extends RecyclerView.D {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public ProgressBar f48903A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public CardView f48904B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public TextView f48905C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f48906t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f48907u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public RelativeLayout f48908v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ImageView f48909w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public CardView f48910x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public ImageView f48911y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public LinearLayout f48912z;

        public t(View view) {
            super(view);
            this.f48906t = (TextView) view.findViewById(a7.f.Fl);
            this.f48907u = (TextView) view.findViewById(a7.f.wl);
            this.f48908v = (RelativeLayout) view.findViewById(a7.f.Ge);
            this.f48909w = (ImageView) view.findViewById(a7.f.f12102B5);
            this.f48910x = (CardView) view.findViewById(a7.f.f12178J1);
            this.f48911y = (ImageView) view.findViewById(a7.f.f12406g5);
            this.f48912z = (LinearLayout) view.findViewById(a7.f.l9);
            this.f48903A = (ProgressBar) view.findViewById(a7.f.pc);
            this.f48904B = (CardView) view.findViewById(a7.f.f12109C2);
            this.f48905C = (TextView) view.findViewById(a7.f.jl);
        }
    }

    public class u extends Filter {
        public u() {
        }

        public /* synthetic */ u(m0 m0Var, a aVar) {
            this();
        }

        public final String a(String str) {
            return Pattern.compile("\\p{InCombiningDiacriticalMarks}+").matcher(Normalizer.normalize(str, Normalizer.Form.NFD)).replaceAll("");
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String strA = a(charSequence.toString().toLowerCase());
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = m0.this.f48723d;
            if (arrayList == null) {
                filterResults.values = null;
                filterResults.count = 0;
                return filterResults;
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i9 = 0; i9 < size; i9++) {
                LiveStreamsDBModel liveStreamsDBModel = (LiveStreamsDBModel) arrayList.get(i9);
                if (liveStreamsDBModel.getLiveStreamNameFilter().contains(strA)) {
                    arrayList2.add(liveStreamsDBModel);
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                m0.this.f48724e = (ArrayList) filterResults.values;
                if (m0.this.f48724e != null) {
                    m0.this.w();
                    if (m0.this.f48724e == null || m0.this.f48724e.size() != 0) {
                        ((VodAllDataSingleActivity) m0.this.f48728i).L2();
                        ((VodAllDataSingleActivity) m0.this.f48728i).f2();
                    } else {
                        ((VodAllDataSingleActivity) m0.this.f48728i).j2();
                        ((VodAllDataSingleActivity) m0.this.f48728i).H2(m0.this.f48728i.getResources().getString(a7.j.f13381s4));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public class v extends Filter {
        public v() {
        }

        public /* synthetic */ v(m0 m0Var, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = m0.this.f48725f;
            if (arrayList == null) {
                filterResults.values = null;
                filterResults.count = 0;
                return filterResults;
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i9 = 0; i9 < size; i9++) {
                LiveStreamsDBModel liveStreamsDBModel = (LiveStreamsDBModel) arrayList.get(i9);
                if (liveStreamsDBModel.getName().toLowerCase().contains(lowerCase) || liveStreamsDBModel.getName().contains(lowerCase)) {
                    arrayList2.add(liveStreamsDBModel);
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                m0.this.f48727h = (ArrayList) filterResults.values;
                if (m0.this.f48727h != null) {
                    m0.this.w();
                    if (m0.this.f48727h.size() == 0) {
                        ((VodAllDataSingleActivity) m0.this.f48728i).j2();
                        ((VodAllDataSingleActivity) m0.this.f48728i).H2(m0.this.f48728i.getResources().getString(a7.j.f13381s4));
                    } else {
                        ((VodAllDataSingleActivity) m0.this.f48728i).L2();
                        ((VodAllDataSingleActivity) m0.this.f48728i).f2();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public class w implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48915a;

        public w(int i9) {
            this.f48915a = i9;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            int i9;
            m0 m0Var = m0.this;
            if (z9) {
                if (m0Var.f48728i instanceof VodAllDataSingleActivity) {
                    ((VodAllDataSingleActivity) m0.this.f48728i).D2(this.f48915a);
                }
                m0Var = m0.this;
                i9 = this.f48915a;
            } else {
                i9 = -1;
            }
            m0Var.f48738s = i9;
        }
    }

    public static class x extends RecyclerView.D {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public TextView f48917A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public LinearLayout f48918B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f48919t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public RelativeLayout f48920u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ImageView f48921v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public CardView f48922w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public TextView f48923x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public ImageView f48924y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public CardView f48925z;

        public x(View view) {
            super(view);
            this.f48919t = (TextView) view.findViewById(a7.f.Fl);
            this.f48920u = (RelativeLayout) view.findViewById(a7.f.Ge);
            this.f48921v = (ImageView) view.findViewById(a7.f.f12102B5);
            this.f48922w = (CardView) view.findViewById(a7.f.f12178J1);
            this.f48923x = (TextView) view.findViewById(a7.f.Ul);
            this.f48924y = (ImageView) view.findViewById(a7.f.f12406g5);
            this.f48925z = (CardView) view.findViewById(a7.f.f12109C2);
            this.f48917A = (TextView) view.findViewById(a7.f.jl);
            this.f48918B = (LinearLayout) view.findViewById(a7.f.f12235O8);
        }
    }

    public m0(Context context, String str, int i9) {
        this.f48732m = "";
        a aVar = null;
        this.f48733n = new u(this, aVar);
        this.f48734o = new v(this, aVar);
        this.f48735p = "mobile";
        this.f48738s = -1;
        this.f48728i = context;
        this.f48730k = new DatabaseHandler(context);
        this.f48713C = new LiveStreamDBHandler(context);
        this.f48712B = new RecentWatchDBHandler(context);
        this.f48731l = AnimationUtils.loadAnimation(context, a7.b.f11823a);
        this.f48732m = str;
        this.f48738s = i9;
        this.f48714D = new n7.e(this, context);
        if (new C2858a(context).A().equals(AbstractC2237a.f44453K0)) {
            this.f48735p = "tv";
        } else {
            this.f48735p = "mobile";
        }
        if (this.f48735p.equals("mobile")) {
            try {
                this.f48740u = C2325b.e(context).c().c();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d1(RecyclerView.D d9, int i9, ArrayList arrayList, List list, int i10) {
        ImageView imageView;
        if (i10 == 1) {
            t tVar = (t) d9;
            FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
            favouriteDBModel.setCategoryID(((LiveStreamsDBModel) list.get(i9)).getCategoryId());
            favouriteDBModel.setStreamID(m7.w.r0(((LiveStreamsDBModel) list.get(i9)).getStreamId()));
            favouriteDBModel.setStreamIDOneStream(((LiveStreamsDBModel) list.get(i9)).getStreamId());
            favouriteDBModel.setName(((LiveStreamsDBModel) list.get(i9)).getName());
            favouriteDBModel.setNum(((LiveStreamsDBModel) list.get(i9)).getNum());
            favouriteDBModel.setUserID(SharepreferenceDBHandler.getUserID(this.f48728i));
            this.f48730k.addToFavourite(favouriteDBModel, "vod");
            tVar.f48911y.startAnimation(this.f48731l);
            imageView = tVar.f48911y;
        } else {
            x xVar = (x) d9;
            FavouriteDBModel favouriteDBModel2 = new FavouriteDBModel();
            favouriteDBModel2.setCategoryID(((LiveStreamsDBModel) arrayList.get(i9)).getCategoryId());
            favouriteDBModel2.setStreamID(m7.w.r0(((LiveStreamsDBModel) arrayList.get(i9)).getStreamId()));
            favouriteDBModel2.setStreamIDOneStream(((LiveStreamsDBModel) arrayList.get(i9)).getStreamId());
            favouriteDBModel2.setName(((LiveStreamsDBModel) arrayList.get(i9)).getName());
            favouriteDBModel2.setNum(((LiveStreamsDBModel) arrayList.get(i9)).getNum());
            favouriteDBModel2.setUserID(SharepreferenceDBHandler.getUserID(this.f48728i));
            this.f48730k.addToFavourite(favouriteDBModel2, "vod");
            xVar.f48924y.startAnimation(this.f48731l);
            imageView = xVar.f48924y;
        }
        imageView.setVisibility(0);
    }

    private void e1(RecyclerView.D d9, int i9, ArrayList arrayList) {
        x xVar = (x) d9;
        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
        favouriteM3UModel.setUrl(((LiveStreamsDBModel) arrayList.get(i9)).getUrl());
        favouriteM3UModel.setUserID(SharepreferenceDBHandler.getUserID(this.f48728i));
        favouriteM3UModel.setName(((LiveStreamsDBModel) arrayList.get(i9)).getName());
        favouriteM3UModel.setCategoryID(((LiveStreamsDBModel) arrayList.get(i9)).getCategoryId());
        this.f48713C.addToFavourite(favouriteM3UModel);
        xVar.f48924y.startAnimation(this.f48731l);
        xVar.f48924y.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1(ArrayList arrayList, RecyclerView.D d9, int i9, ArrayList arrayList2, List list, int i10, RelativeLayout relativeLayout) {
        if (arrayList.size() > 0) {
            m1(d9, i9, arrayList2, list, i10);
        } else {
            d1(d9, i9, arrayList2, list, i10);
        }
        this.f48737r = true;
        Context context = this.f48728i;
        if (context instanceof VodAllDataSingleActivity) {
            ((VodAllDataSingleActivity) context).v2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1(ArrayList arrayList, RecyclerView.D d9, int i9, ArrayList arrayList2) {
        if (arrayList.size() > 0) {
            n1(d9, i9, arrayList2);
        } else {
            e1(d9, i9, arrayList2);
        }
        this.f48737r = true;
        Context context = this.f48728i;
        if (context instanceof VodAllDataSingleActivity) {
            ((VodAllDataSingleActivity) context).v2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1() {
        if (this.f48735p.equals("mobile")) {
            try {
                this.f48740u = C2325b.e(this.f48728i).c().c();
            } catch (Exception unused) {
            }
        }
        C2328e c2328e = this.f48740u;
        if (c2328e == null || !c2328e.c()) {
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f48728i).equals("onestream_api")) {
                m7.w.w0(this.f48728i, "", 0, "movie", this.f48736q, "0", this.f48745z, this.f48720J, this.f48711A, this.f48719I, "", "");
                return;
            } else {
                AbstractC2237a.f44533q0 = true;
                m7.w.w0(this.f48728i, "", m7.w.r0(this.f48744y), "movie", this.f48736q, "0", this.f48745z, "", this.f48711A, "", "", "");
                return;
            }
        }
        String strU = SharepreferenceDBHandler.getCurrentAPPType(this.f48728i).equals("onestream_api") ? this.f48720J : m7.w.U(this.f48728i, m7.w.r0(this.f48744y), this.f48736q, "movie");
        C2328e c2328e2 = this.f48740u;
        if (((c2328e2 == null || c2328e2.r() == null || this.f48740u.r().j() == null || this.f48740u.r().j().J() == null) ? "" : this.f48740u.r().j().J()).equals(strU)) {
            this.f48728i.startActivity(new Intent(this.f48728i, (Class<?>) ExpandedControlsActivity.class));
        } else {
            AbstractC1902a.c(m7.w.r0(this.f48742w), true, AbstractC1902a.a(this.f48745z, "", "", 0, strU, "videos/mp4", this.f48741v, "", null), this.f48740u, this.f48728i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m1(RecyclerView.D d9, int i9, ArrayList arrayList, List list, int i10) {
        if (i10 == 1) {
            this.f48730k.deleteFavourite(m7.w.r0(((LiveStreamsDBModel) list.get(i9)).getStreamId()), ((LiveStreamsDBModel) list.get(i9)).getCategoryId(), "vod", ((LiveStreamsDBModel) list.get(i9)).getName(), SharepreferenceDBHandler.getUserID(this.f48728i), ((LiveStreamsDBModel) list.get(i9)).getStreamIdOneStream());
            ((t) d9).f48911y.setVisibility(4);
        } else {
            this.f48730k.deleteFavourite(m7.w.r0(((LiveStreamsDBModel) arrayList.get(i9)).getStreamId()), ((LiveStreamsDBModel) arrayList.get(i9)).getCategoryId(), "vod", ((LiveStreamsDBModel) arrayList.get(i9)).getName(), SharepreferenceDBHandler.getUserID(this.f48728i), ((LiveStreamsDBModel) arrayList.get(i9)).getStreamIdOneStream());
            ((x) d9).f48924y.setVisibility(4);
            boolean z9 = this.f48728i instanceof VodAllDataSingleActivity;
        }
    }

    private void n1(RecyclerView.D d9, int i9, ArrayList arrayList) {
        this.f48713C.deleteFavourite(((LiveStreamsDBModel) arrayList.get(i9)).getUrl(), SharepreferenceDBHandler.getUserID(this.f48728i));
        ((x) d9).f48924y.setVisibility(4);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:11|(1:13)|16|(1:18)|(1:31)(5:300|22|23|298|24)|32|(1:34)(1:35)|(17:37|(0)(1:41)|313|44|315|45|53|296|54|(1:60)|61|(8:290|63|68|(1:70)(1:71)|72|(0)(1:76)|79|(2:81|(2:83|(1:85))(1:86)))(1:67)|66|68|(0)(0)|72|(1:74))(1:42)|43|313|44|315|45|53|296|54|(0)|61|(0)(0)|66|68|(0)(0)|72|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0161, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0163, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0164, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0165, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0168, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0175, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0177, code lost:
    
        r0.printStackTrace();
        r0 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0540 A[Catch: Exception -> 0x0340, TRY_ENTER, TryCatch #9 {Exception -> 0x0340, blocks: (B:91:0x0312, B:93:0x0316, B:95:0x031c, B:97:0x0320, B:99:0x0339, B:103:0x0346, B:105:0x034c, B:107:0x0353, B:109:0x0359, B:111:0x0362, B:113:0x0368, B:116:0x0372, B:118:0x0380, B:120:0x0386, B:122:0x038d, B:124:0x0393, B:126:0x039a, B:128:0x03a0, B:130:0x03aa, B:131:0x03ae, B:133:0x03b4, B:141:0x03cc, B:143:0x03d2, B:145:0x03db, B:147:0x03e5, B:148:0x03e8, B:150:0x03ee, B:152:0x03f7, B:154:0x03fd, B:156:0x0406, B:158:0x040c, B:160:0x0415, B:162:0x041b, B:164:0x0424, B:166:0x042a, B:168:0x0433, B:170:0x0439, B:171:0x043d, B:173:0x0443, B:181:0x045e, B:183:0x0464, B:185:0x046d, B:187:0x0481, B:188:0x0484, B:190:0x048d, B:192:0x0493, B:194:0x0499, B:195:0x04a1, B:197:0x04aa, B:204:0x0530, B:207:0x0540, B:209:0x0554, B:210:0x0557, B:228:0x05b9, B:211:0x055b, B:213:0x0563, B:221:0x0580, B:222:0x0583, B:223:0x0589, B:224:0x058d, B:226:0x05aa, B:227:0x05b2, B:219:0x0579, B:203:0x0500, B:202:0x04fc, B:201:0x04cd, B:196:0x04a5, B:189:0x0488, B:179:0x0454, B:139:0x03c5, B:199:0x04b0, B:215:0x0571), top: B:302:0x0312, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0563 A[Catch: Exception -> 0x0340, TRY_LEAVE, TryCatch #9 {Exception -> 0x0340, blocks: (B:91:0x0312, B:93:0x0316, B:95:0x031c, B:97:0x0320, B:99:0x0339, B:103:0x0346, B:105:0x034c, B:107:0x0353, B:109:0x0359, B:111:0x0362, B:113:0x0368, B:116:0x0372, B:118:0x0380, B:120:0x0386, B:122:0x038d, B:124:0x0393, B:126:0x039a, B:128:0x03a0, B:130:0x03aa, B:131:0x03ae, B:133:0x03b4, B:141:0x03cc, B:143:0x03d2, B:145:0x03db, B:147:0x03e5, B:148:0x03e8, B:150:0x03ee, B:152:0x03f7, B:154:0x03fd, B:156:0x0406, B:158:0x040c, B:160:0x0415, B:162:0x041b, B:164:0x0424, B:166:0x042a, B:168:0x0433, B:170:0x0439, B:171:0x043d, B:173:0x0443, B:181:0x045e, B:183:0x0464, B:185:0x046d, B:187:0x0481, B:188:0x0484, B:190:0x048d, B:192:0x0493, B:194:0x0499, B:195:0x04a1, B:197:0x04aa, B:204:0x0530, B:207:0x0540, B:209:0x0554, B:210:0x0557, B:228:0x05b9, B:211:0x055b, B:213:0x0563, B:221:0x0580, B:222:0x0583, B:223:0x0589, B:224:0x058d, B:226:0x05aa, B:227:0x05b2, B:219:0x0579, B:203:0x0500, B:202:0x04fc, B:201:0x04cd, B:196:0x04a5, B:189:0x0488, B:179:0x0454, B:139:0x03c5, B:199:0x04b0, B:215:0x0571), top: B:302:0x0312, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06d5 A[Catch: Exception -> 0x06ea, TryCatch #2 {Exception -> 0x06ea, blocks: (B:232:0x06cb, B:234:0x06d5, B:236:0x06e3, B:238:0x06e7, B:241:0x06ed, B:243:0x06f1, B:245:0x06f7, B:249:0x070a, B:251:0x070e, B:253:0x0712, B:255:0x0716, B:256:0x071b, B:258:0x072c, B:260:0x0730, B:262:0x0736, B:264:0x073e, B:266:0x0742, B:267:0x0768, B:268:0x076c, B:269:0x0794, B:274:0x07a1, B:276:0x07af, B:278:0x07b5, B:280:0x07b9, B:281:0x07c1), top: B:289:0x06cb }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x070e A[Catch: Exception -> 0x06ea, TryCatch #2 {Exception -> 0x06ea, blocks: (B:232:0x06cb, B:234:0x06d5, B:236:0x06e3, B:238:0x06e7, B:241:0x06ed, B:243:0x06f1, B:245:0x06f7, B:249:0x070a, B:251:0x070e, B:253:0x0712, B:255:0x0716, B:256:0x071b, B:258:0x072c, B:260:0x0730, B:262:0x0736, B:264:0x073e, B:266:0x0742, B:267:0x0768, B:268:0x076c, B:269:0x0794, B:274:0x07a1, B:276:0x07af, B:278:0x07b5, B:280:0x07b9, B:281:0x07c1), top: B:289:0x06cb }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x07af A[Catch: Exception -> 0x06ea, TryCatch #2 {Exception -> 0x06ea, blocks: (B:232:0x06cb, B:234:0x06d5, B:236:0x06e3, B:238:0x06e7, B:241:0x06ed, B:243:0x06f1, B:245:0x06f7, B:249:0x070a, B:251:0x070e, B:253:0x0712, B:255:0x0716, B:256:0x071b, B:258:0x072c, B:260:0x0730, B:262:0x0736, B:264:0x073e, B:266:0x0742, B:267:0x0768, B:268:0x076c, B:269:0x0794, B:274:0x07a1, B:276:0x07af, B:278:0x07b5, B:280:0x07b9, B:281:0x07c1), top: B:289:0x06cb }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017d A[Catch: Exception -> 0x00c5, TryCatch #14 {Exception -> 0x00c5, blocks: (B:5:0x0029, B:7:0x002d, B:9:0x0033, B:11:0x0037, B:13:0x00b9, B:16:0x00c8, B:18:0x00d6, B:20:0x00e3, B:22:0x00e9, B:24:0x00ef, B:32:0x0104, B:34:0x011f, B:37:0x012e, B:39:0x0136, B:41:0x013c, B:60:0x017d, B:61:0x0187, B:68:0x020b, B:70:0x022e, B:72:0x0239, B:74:0x02c7, B:76:0x02cb, B:79:0x02dd, B:81:0x02ed, B:83:0x02f3, B:85:0x02f7, B:86:0x02ff, B:71:0x0234, B:67:0x01dc, B:66:0x01d8, B:65:0x01aa, B:58:0x0177, B:51:0x0165, B:43:0x0149, B:35:0x0125, B:30:0x00fe, B:63:0x018d, B:54:0x0170), top: B:312:0x0029, inners: #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01dc A[Catch: Exception -> 0x00c5, TryCatch #14 {Exception -> 0x00c5, blocks: (B:5:0x0029, B:7:0x002d, B:9:0x0033, B:11:0x0037, B:13:0x00b9, B:16:0x00c8, B:18:0x00d6, B:20:0x00e3, B:22:0x00e9, B:24:0x00ef, B:32:0x0104, B:34:0x011f, B:37:0x012e, B:39:0x0136, B:41:0x013c, B:60:0x017d, B:61:0x0187, B:68:0x020b, B:70:0x022e, B:72:0x0239, B:74:0x02c7, B:76:0x02cb, B:79:0x02dd, B:81:0x02ed, B:83:0x02f3, B:85:0x02f7, B:86:0x02ff, B:71:0x0234, B:67:0x01dc, B:66:0x01d8, B:65:0x01aa, B:58:0x0177, B:51:0x0165, B:43:0x0149, B:35:0x0125, B:30:0x00fe, B:63:0x018d, B:54:0x0170), top: B:312:0x0029, inners: #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022e A[Catch: Exception -> 0x00c5, TryCatch #14 {Exception -> 0x00c5, blocks: (B:5:0x0029, B:7:0x002d, B:9:0x0033, B:11:0x0037, B:13:0x00b9, B:16:0x00c8, B:18:0x00d6, B:20:0x00e3, B:22:0x00e9, B:24:0x00ef, B:32:0x0104, B:34:0x011f, B:37:0x012e, B:39:0x0136, B:41:0x013c, B:60:0x017d, B:61:0x0187, B:68:0x020b, B:70:0x022e, B:72:0x0239, B:74:0x02c7, B:76:0x02cb, B:79:0x02dd, B:81:0x02ed, B:83:0x02f3, B:85:0x02f7, B:86:0x02ff, B:71:0x0234, B:67:0x01dc, B:66:0x01d8, B:65:0x01aa, B:58:0x0177, B:51:0x0165, B:43:0x0149, B:35:0x0125, B:30:0x00fe, B:63:0x018d, B:54:0x0170), top: B:312:0x0029, inners: #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0234 A[Catch: Exception -> 0x00c5, TryCatch #14 {Exception -> 0x00c5, blocks: (B:5:0x0029, B:7:0x002d, B:9:0x0033, B:11:0x0037, B:13:0x00b9, B:16:0x00c8, B:18:0x00d6, B:20:0x00e3, B:22:0x00e9, B:24:0x00ef, B:32:0x0104, B:34:0x011f, B:37:0x012e, B:39:0x0136, B:41:0x013c, B:60:0x017d, B:61:0x0187, B:68:0x020b, B:70:0x022e, B:72:0x0239, B:74:0x02c7, B:76:0x02cb, B:79:0x02dd, B:81:0x02ed, B:83:0x02f3, B:85:0x02f7, B:86:0x02ff, B:71:0x0234, B:67:0x01dc, B:66:0x01d8, B:65:0x01aa, B:58:0x0177, B:51:0x0165, B:43:0x0149, B:35:0x0125, B:30:0x00fe, B:63:0x018d, B:54:0x0170), top: B:312:0x0029, inners: #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c7 A[Catch: Exception -> 0x00c5, TryCatch #14 {Exception -> 0x00c5, blocks: (B:5:0x0029, B:7:0x002d, B:9:0x0033, B:11:0x0037, B:13:0x00b9, B:16:0x00c8, B:18:0x00d6, B:20:0x00e3, B:22:0x00e9, B:24:0x00ef, B:32:0x0104, B:34:0x011f, B:37:0x012e, B:39:0x0136, B:41:0x013c, B:60:0x017d, B:61:0x0187, B:68:0x020b, B:70:0x022e, B:72:0x0239, B:74:0x02c7, B:76:0x02cb, B:79:0x02dd, B:81:0x02ed, B:83:0x02f3, B:85:0x02f7, B:86:0x02ff, B:71:0x0234, B:67:0x01dc, B:66:0x01d8, B:65:0x01aa, B:58:0x0177, B:51:0x0165, B:43:0x0149, B:35:0x0125, B:30:0x00fe, B:63:0x018d, B:54:0x0170), top: B:312:0x0029, inners: #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ed A[Catch: Exception -> 0x00c5, TryCatch #14 {Exception -> 0x00c5, blocks: (B:5:0x0029, B:7:0x002d, B:9:0x0033, B:11:0x0037, B:13:0x00b9, B:16:0x00c8, B:18:0x00d6, B:20:0x00e3, B:22:0x00e9, B:24:0x00ef, B:32:0x0104, B:34:0x011f, B:37:0x012e, B:39:0x0136, B:41:0x013c, B:60:0x017d, B:61:0x0187, B:68:0x020b, B:70:0x022e, B:72:0x0239, B:74:0x02c7, B:76:0x02cb, B:79:0x02dd, B:81:0x02ed, B:83:0x02f3, B:85:0x02f7, B:86:0x02ff, B:71:0x0234, B:67:0x01dc, B:66:0x01d8, B:65:0x01aa, B:58:0x0177, B:51:0x0165, B:43:0x0149, B:35:0x0125, B:30:0x00fe, B:63:0x018d, B:54:0x0170), top: B:312:0x0029, inners: #3, #6 }] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(androidx.recyclerview.widget.RecyclerView.D r51, int r52) {
        /*
            Method dump skipped, instruction units count: 1995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.m0.E(androidx.recyclerview.widget.RecyclerView$D, int):void");
    }

    @Override // z7.g
    public void F(StalkerGetSeriesCategoriesCallback stalkerGetSeriesCategoriesCallback) {
    }

    @Override // z7.g
    public void G(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, Z.E e9, int i9) {
    }

    @Override // z7.g
    public void G0(StalkerTokenCallback stalkerTokenCallback) {
    }

    @Override // z7.g
    public void H(String str) {
    }

    @Override // z7.g
    public void I(x xVar, int i9) {
        try {
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f48728i);
            String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(this.f48728i);
            this.f48715E = xVar;
            this.f48716F = "remove";
            this.f48714D.f(loggedInMacAddress, stalkerToken, i9);
        } catch (Exception unused) {
            m7.w.X();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public RecyclerView.D L(ViewGroup viewGroup, int i9) {
        return i9 == 1 ? new t(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12917z4, viewGroup, false)) : new x(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12911y4, viewGroup, false));
    }

    @Override // z7.g
    public void M(StalkerGetAdCallback stalkerGetAdCallback, int i9) {
        VodAllDataSingleActivity vodAllDataSingleActivity;
        String streamId;
        try {
            m7.w.X();
            String str = this.f48716F;
            if (str == null || !str.equals("add")) {
                this.f48715E.f48924y.setVisibility(4);
                ArrayList arrayList = this.f48724e;
                if (arrayList == null || arrayList.size() <= 0 || this.f48724e.get(i9) == null) {
                    return;
                }
                ((LiveStreamsDBModel) this.f48724e.get(i9)).setFav(0);
                vodAllDataSingleActivity = (VodAllDataSingleActivity) this.f48728i;
                streamId = ((LiveStreamsDBModel) this.f48724e.get(i9)).getStreamId();
            } else {
                this.f48715E.f48924y.startAnimation(this.f48731l);
                this.f48715E.f48924y.setVisibility(0);
                ArrayList arrayList2 = this.f48724e;
                if (arrayList2 == null || arrayList2.size() <= 0 || this.f48724e.get(i9) == null) {
                    return;
                }
                ((LiveStreamsDBModel) this.f48724e.get(i9)).setFav(1);
                vodAllDataSingleActivity = (VodAllDataSingleActivity) this.f48728i;
                streamId = ((LiveStreamsDBModel) this.f48724e.get(i9)).getStreamId();
            }
            vodAllDataSingleActivity.q2(streamId, this.f48716F);
        } catch (Exception unused) {
        }
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
    }

    @Override // z7.g
    public void V0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, x xVar, int i9) {
        if (stalkerSetLiveFavCallback != null) {
            try {
                if (stalkerSetLiveFavCallback.getJs() == null || !stalkerSetLiveFavCallback.getJs().equals(Boolean.TRUE)) {
                    return;
                }
                String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f48728i);
                String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(this.f48728i);
                this.f48715E = xVar;
                this.f48716F = "add";
                this.f48714D.f(loggedInMacAddress, stalkerToken, i9);
            } catch (Exception unused) {
                m7.w.X();
            }
        }
    }

    @Override // z7.g
    public void c(String str) {
    }

    public final void c1(int i9, x xVar, int i10) {
        try {
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f48728i);
            this.f48714D.e(SharepreferenceDBHandler.getLoggedInMacAddress(this.f48728i), stalkerToken, xVar, String.valueOf(i9), i10);
        } catch (Exception unused) {
            m7.w.X();
        }
    }

    @Override // z7.g
    public void d0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, C2635t.o oVar, String str, String str2) {
    }

    @Override // z7.g
    public void e(String str) {
    }

    @Override // z7.g
    public void e0(String str) {
    }

    @Override // z7.g
    public void f0(StalkerGetGenresCallback stalkerGetGenresCallback) {
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f48732m.equals("continue_watching") ? this.f48734o : this.f48733n;
    }

    public boolean h1() {
        return this.f48737r;
    }

    @Override // z7.g
    public void i(StalkerGetAllChannelsCallback stalkerGetAllChannelsCallback) {
    }

    public int i1() {
        return this.f48738s;
    }

    @Override // z7.g
    public void j(StalkerGetVodCategoriesCallback stalkerGetVodCategoriesCallback) {
    }

    public final void k1(RecyclerView.D d9, int i9, ArrayList arrayList, ArrayList arrayList2, int i10) {
        if (i10 == 1) {
            k.U u9 = new k.U(this.f48728i, ((t) d9).f48910x);
            u9.d(a7.h.f12926i);
            if (this.f48730k.checkFavourite(m7.w.r0(((LiveStreamsDBModel) arrayList2.get(i9)).getStreamId()), ((LiveStreamsDBModel) arrayList2.get(i9)).getCategoryId(), "vod", SharepreferenceDBHandler.getUserID(this.f48728i), ((LiveStreamsDBModel) arrayList2.get(i9)).getStreamId()).size() > 0) {
                u9.b().getItem(0).setVisible(false);
                u9.b().getItem(1).setVisible(true);
            } else {
                u9.b().getItem(0).setVisible(true);
                u9.b().getItem(1).setVisible(false);
            }
            u9.f(new k(d9, i9, arrayList, arrayList2, i10));
            u9.g();
        }
    }

    public final void l1(int i9, x xVar, int i10) {
        try {
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f48728i);
            this.f48714D.s(SharepreferenceDBHandler.getLoggedInMacAddress(this.f48728i), stalkerToken, xVar, String.valueOf(i9), i10);
        } catch (Exception unused) {
            m7.w.X();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        ArrayList arrayList;
        if (this.f48732m.equals("continue_watching")) {
            ArrayList arrayList2 = this.f48727h;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                return 0;
            }
            arrayList = this.f48727h;
        } else {
            ArrayList arrayList3 = this.f48724e;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return 0;
            }
            arrayList = this.f48724e;
        }
        return arrayList.size();
    }

    @Override // z7.g
    public void o0(String str) {
        try {
            m7.w.X();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public void o1() {
        this.f48737r = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int p(int i9) {
        return this.f48732m.equals("continue_watching") ? 1 : 0;
    }

    public void p1(m7.c cVar) {
    }

    @Override // z7.g
    public void q(StalkerGetVODByCatCallback stalkerGetVODByCatCallback) {
    }

    public void q1() {
        this.f48723d = VodAllCategoriesSingleton.getInstance().getvodList();
        this.f48724e = VodAllCategoriesSingleton.getInstance().getvodList();
    }

    public final void r1(int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i11, String str17) {
        String str18;
        String strValueOf;
        if (this.f48728i == null) {
            Log.e("Null hai context", ">>>>>>>>>>>True its Null");
            return;
        }
        Intent intent = (AbstractC2237a.f44540u.booleanValue() && SharepreferenceDBHandler.getCurrentAPPType(this.f48728i).equals("m3u")) ? new Intent(this.f48728i, (Class<?>) ViewDetailsTMDBActivity.class) : new Intent(this.f48728i, (Class<?>) ViewDetailsActivity.class);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f48728i).equals("onestream_api")) {
            str18 = AbstractC2237a.f44464Q;
            strValueOf = String.valueOf(str17);
        } else {
            str18 = AbstractC2237a.f44464Q;
            strValueOf = String.valueOf(i9);
        }
        intent.putExtra(str18, strValueOf);
        intent.putExtra("movie", str);
        intent.putExtra("movie_icon", str7);
        intent.putExtra("selectedPlayer", str2);
        intent.putExtra("streamType", str3);
        intent.putExtra("containerExtension", str4);
        intent.putExtra("categoryID", str5);
        intent.putExtra("num", str6);
        intent.putExtra("videoURL", str8);
        intent.putExtra("movie_director", str9);
        intent.putExtra("movie_cast", str10);
        intent.putExtra("movie_genre", str11);
        intent.putExtra("movie_description", str12);
        intent.putExtra("movie_cmd", str13);
        intent.putExtra("movie_rating", str14);
        intent.putExtra("movie_duration_min", str15);
        intent.putExtra("movie_year", str16);
        intent.putExtra("movie_fav", i11);
        SharepreferenceDBHandler.setOneStreamVideourl(str8, this.f48728i);
        AbstractC2237a.f44518l0 = i10;
        this.f48728i.startActivity(intent);
    }

    @Override // z7.g
    public void v0(String str) {
        try {
            m7.w.X();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // z7.g
    public void y0(String str) {
        try {
            m7.w.X();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }
}
