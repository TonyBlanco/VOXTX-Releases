package q7;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import k.U;
import m7.AbstractC2237a;

/* JADX INFO: renamed from: q7.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2637v extends RecyclerView.g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static SharedPreferences f49452p;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f49453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f49454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f49455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f49456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f49457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatabaseHandler f49458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LiveStreamDBHandler f49459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f49460k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SharedPreferences f49461l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SimpleDateFormat f49462m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f49463n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f49464o;

    /* JADX INFO: renamed from: q7.v$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: q7.v$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: q7.v$c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: q7.v$d */
    public class d implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f49468a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f49469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f49471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f49472f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f49473g;

        public d(i iVar, int i9, String str, String str2, String str3, String str4) {
            this.f49468a = iVar;
            this.f49469c = i9;
            this.f49470d = str;
            this.f49471e = str2;
            this.f49472f = str3;
            this.f49473g = str4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            C2637v.this.z0(this.f49468a, this.f49469c, this.f49470d, this.f49471e, this.f49472f, this.f49473g);
            return true;
        }
    }

    /* JADX INFO: renamed from: q7.v$e */
    public class e implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f49475a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f49476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f49478e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f49479f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f49480g;

        public e(i iVar, int i9, String str, String str2, String str3, String str4) {
            this.f49475a = iVar;
            this.f49476c = i9;
            this.f49477d = str;
            this.f49478e = str2;
            this.f49479f = str3;
            this.f49480g = str4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            C2637v.this.z0(this.f49475a, this.f49476c, this.f49477d, this.f49478e, this.f49479f, this.f49480g);
            return true;
        }
    }

    /* JADX INFO: renamed from: q7.v$f */
    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f49482a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f49483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f49485e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f49486f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f49487g;

        public f(i iVar, int i9, String str, String str2, String str3, String str4) {
            this.f49482a = iVar;
            this.f49483c = i9;
            this.f49484d = str;
            this.f49485e = str2;
            this.f49486f = str3;
            this.f49487g = str4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2637v.this.z0(this.f49482a, this.f49483c, this.f49484d, this.f49485e, this.f49486f, this.f49487g);
        }
    }

    /* JADX INFO: renamed from: q7.v$g */
    public class g implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f49489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f49490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f49491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f49493e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f49494f;

        public g(i iVar, String str, int i9, String str2, String str3, String str4) {
            this.f49489a = iVar;
            this.f49490b = str;
            this.f49491c = i9;
            this.f49492d = str2;
            this.f49493e = str3;
            this.f49494f = str4;
        }

        public final void a() {
            FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
            favouriteDBModel.setCategoryID(this.f49490b);
            favouriteDBModel.setStreamID(this.f49491c);
            favouriteDBModel.setStreamIDOneStream(this.f49492d);
            favouriteDBModel.setName(this.f49493e);
            favouriteDBModel.setNum(this.f49494f);
            favouriteDBModel.setUserID(SharepreferenceDBHandler.getUserID(C2637v.this.f49453d));
            C2637v.this.f49458i.addToFavourite(favouriteDBModel, "live");
            this.f49489a.f49509x.setVisibility(0);
        }

        public final void b() {
            this.f49489a.f49507v.performClick();
        }

        public final void c() {
            C2637v.this.f49458i.deleteFavourite(this.f49491c, this.f49490b, "live", this.f49493e, SharepreferenceDBHandler.getUserID(C2637v.this.f49453d), this.f49492d);
            this.f49489a.f49509x.setVisibility(4);
        }

        @Override // k.U.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == a7.f.Hb) {
                b();
                return false;
            }
            if (itemId == a7.f.Bb) {
                a();
                return false;
            }
            if (itemId != a7.f.Lb) {
                return false;
            }
            c();
            return false;
        }
    }

    /* JADX INFO: renamed from: q7.v$h */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49496a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f49497c;

        /* JADX INFO: renamed from: q7.v$h$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C2637v c2637v;
                List list;
                if (!TextUtils.isEmpty(h.this.f49496a)) {
                    if (!C2637v.this.f49456g.isEmpty() || C2637v.this.f49456g.isEmpty()) {
                        c2637v = C2637v.this;
                        list = c2637v.f49456g;
                    }
                    if (C2637v.this.f49454e != null && C2637v.this.f49454e.size() == 0) {
                        h.this.f49497c.setVisibility(0);
                    }
                    C2637v c2637v2 = C2637v.this;
                    c2637v2.f49463n = c2637v2.f49464o;
                    c2637v2.w();
                }
                c2637v = C2637v.this;
                list = c2637v.f49457h;
                c2637v.f49454e = list;
                if (C2637v.this.f49454e != null) {
                    h.this.f49497c.setVisibility(0);
                }
                C2637v c2637v22 = C2637v.this;
                c2637v22.f49463n = c2637v22.f49464o;
                c2637v22.w();
            }
        }

        public h(String str, TextView textView) {
            this.f49496a = str;
            this.f49497c = textView;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r4 = this;
                q7.v r0 = q7.C2637v.this
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                q7.C2637v.n0(r0, r1)
                q7.v r0 = q7.C2637v.this
                java.lang.String r1 = r4.f49496a
                int r1 = r1.length()
                r0.f49464o = r1
                q7.v r0 = q7.C2637v.this
                java.util.List r0 = q7.C2637v.m0(r0)
                if (r0 == 0) goto L25
                q7.v r0 = q7.C2637v.this
                java.util.List r0 = q7.C2637v.m0(r0)
                r0.clear()
            L25:
                java.lang.String r0 = r4.f49496a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L3d
                q7.v r0 = q7.C2637v.this
                java.util.List r0 = q7.C2637v.m0(r0)
                q7.v r1 = q7.C2637v.this
                java.util.List r1 = q7.C2637v.p0(r1)
                r0.addAll(r1)
                goto La4
            L3d:
                q7.v r0 = q7.C2637v.this
                java.util.List r0 = q7.C2637v.q0(r0)
                if (r0 == 0) goto L51
                q7.v r0 = q7.C2637v.this
                java.util.List r0 = q7.C2637v.q0(r0)
                int r0 = r0.size()
                if (r0 == 0) goto L59
            L51:
                q7.v r0 = q7.C2637v.this
                int r1 = r0.f49463n
                int r0 = r0.f49464o
                if (r1 <= r0) goto L62
            L59:
                q7.v r0 = q7.C2637v.this
                java.util.List r1 = q7.C2637v.p0(r0)
                q7.C2637v.r0(r0, r1)
            L62:
                q7.v r0 = q7.C2637v.this
                java.util.List r0 = q7.C2637v.q0(r0)
                if (r0 == 0) goto La4
                q7.v r0 = q7.C2637v.this
                java.util.List r0 = q7.C2637v.q0(r0)
                java.util.Iterator r0 = r0.iterator()
            L74:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto La4
                java.lang.Object r1 = r0.next()
                com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel r1 = (com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel) r1
                java.lang.String r2 = r1.getName()
                if (r2 == 0) goto L74
                java.lang.String r2 = r1.getName()
                java.lang.String r2 = r2.toLowerCase()
                java.lang.String r3 = r4.f49496a
                java.lang.String r3 = r3.toLowerCase()
                boolean r2 = r2.contains(r3)
                if (r2 == 0) goto L74
                q7.v r2 = q7.C2637v.this
                java.util.List r2 = q7.C2637v.m0(r2)
                r2.add(r1)
                goto L74
            La4:
                q7.v r0 = q7.C2637v.this
                android.content.Context r0 = q7.C2637v.k0(r0)
                android.app.Activity r0 = (android.app.Activity) r0
                q7.v$h$a r1 = new q7.v$h$a
                r1.<init>()
                r0.runOnUiThread(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.C2637v.h.run():void");
        }
    }

    /* JADX INFO: renamed from: q7.v$i */
    public static class i extends RecyclerView.D {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public LinearLayout f49500A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public ProgressBar f49501B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public TextView f49502C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public TextView f49503D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public RelativeLayout f49504E;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ImageView f49505t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f49506u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CardView f49507v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public TextView f49508w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public ImageView f49509x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public RelativeLayout f49510y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public RelativeLayout f49511z;

        public i(View view) {
            super(view);
            this.f49505t = (ImageView) view.findViewById(a7.f.f12241P4);
            this.f49506u = (TextView) view.findViewById(a7.f.lk);
            this.f49507v = (CardView) view.findViewById(a7.f.f12178J1);
            this.f49508w = (TextView) view.findViewById(a7.f.Ul);
            this.f49509x = (ImageView) view.findViewById(a7.f.f12406g5);
            this.f49510y = (RelativeLayout) view.findViewById(a7.f.qf);
            this.f49511z = (RelativeLayout) view.findViewById(a7.f.f12379de);
            this.f49500A = (LinearLayout) view.findViewById(a7.f.f12235O8);
            this.f49501B = (ProgressBar) view.findViewById(a7.f.Nc);
            this.f49502C = (TextView) view.findViewById(a7.f.si);
            this.f49503D = (TextView) view.findViewById(a7.f.em);
            this.f49504E = (RelativeLayout) view.findViewById(a7.f.He);
            J(false);
        }
    }

    public C2637v(List list, Context context) {
        this.f49454e = list;
        this.f49453d = context;
        ArrayList arrayList = new ArrayList();
        this.f49456g = arrayList;
        arrayList.addAll(list);
        this.f49457h = list;
        this.f49458i = new DatabaseHandler(context);
        this.f49459j = new LiveStreamDBHandler(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        List list = this.f49454e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void s0(String str, TextView textView) {
        new Thread(new h(str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public void E(i iVar, int i9) {
        int i10;
        LiveStreamDBHandler liveStreamDBHandler;
        ArrayList<XMLTVProgrammePojo> epg;
        int iM;
        Context context = this.f49453d;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("selectedPlayer", 0);
            this.f49455f = sharedPreferences;
            sharedPreferences.getString("selectedPlayer", "");
            String strTrim = ((LiveStreamsDBModel) this.f49454e.get(i9)).getStreamId().trim();
            ((LiveStreamsDBModel) this.f49454e.get(i9)).getStreamId().trim();
            try {
                i10 = Integer.parseInt(strTrim);
            } catch (NumberFormatException unused) {
                i10 = -1;
            }
            String categoryId = ((LiveStreamsDBModel) this.f49454e.get(i9)).getCategoryId();
            ((LiveStreamsDBModel) this.f49454e.get(i9)).getStreamType();
            String epgChannelId = ((LiveStreamsDBModel) this.f49454e.get(i9)).getEpgChannelId();
            String num = ((LiveStreamsDBModel) this.f49454e.get(i9)).getNum();
            iVar.f49503D.setText("");
            iVar.f49501B.setVisibility(8);
            iVar.f49502C.setText("");
            if (epgChannelId != null && !epgChannelId.equals("") && (liveStreamDBHandler = this.f49459j) != null && (epg = liveStreamDBHandler.getEPG(epgChannelId)) != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= epg.size()) {
                        break;
                    }
                    String start = epg.get(i11).getStart();
                    String stop = epg.get(i11).getStop();
                    String title = epg.get(i11).getTitle();
                    epg.get(i11).getDesc();
                    long jX = m7.w.x(start, this.f49453d);
                    Long lValueOf = Long.valueOf(jX);
                    long jX2 = m7.w.x(stop, this.f49453d);
                    Long lValueOf2 = Long.valueOf(jX2);
                    if (!m7.w.b0(jX, jX2, this.f49453d) || (iM = m7.w.M(jX, jX2, this.f49453d)) == 0) {
                        i11++;
                    } else {
                        int i12 = 100 - iM;
                        if (i12 == 0 || title.equals("")) {
                            iVar.f49503D.setVisibility(8);
                            iVar.f49501B.setVisibility(8);
                            iVar.f49502C.setVisibility(8);
                        } else {
                            if (AbstractC2237a.f44456M == 0) {
                                iVar.f49503D.setVisibility(0);
                                SharedPreferences sharedPreferences2 = this.f49453d.getSharedPreferences("timeFormat", 0);
                                f49452p = sharedPreferences2;
                                this.f49462m = new SimpleDateFormat(sharedPreferences2.getString("timeFormat", AbstractC2237a.f44441E0));
                                iVar.f49503D.setText(this.f49462m.format(lValueOf) + " - " + this.f49462m.format(lValueOf2));
                            }
                            iVar.f49501B.setVisibility(0);
                            iVar.f49501B.setProgress(i12);
                            iVar.f49502C.setVisibility(0);
                            iVar.f49502C.setText(title);
                        }
                    }
                }
            }
            ((LiveStreamsDBModel) this.f49454e.get(i9)).getNum();
            String name = ((LiveStreamsDBModel) this.f49454e.get(i9)).getName();
            iVar.f49506u.setText(((LiveStreamsDBModel) this.f49454e.get(i9)).getName());
            String streamIcon = ((LiveStreamsDBModel) this.f49454e.get(i9)).getStreamIcon();
            ((LiveStreamsDBModel) this.f49454e.get(i9)).getEpgChannelId();
            iVar.f49505t.setImageDrawable(null);
            if (streamIcon == null || streamIcon.equals("")) {
                iVar.f49505t.setImageDrawable(this.f49453d.getResources().getDrawable(a7.e.f12016i1, null));
            } else {
                com.squareup.picasso.t.q(this.f49453d).l(streamIcon).j(a7.e.f12016i1).g(iVar.f49505t);
            }
            iVar.f49507v.setOnClickListener(new a());
            iVar.f49504E.setOnClickListener(new b());
            iVar.f49510y.setOnClickListener(new c());
            ArrayList<FavouriteDBModel> arrayListCheckFavourite = this.f49458i.checkFavourite(i10, categoryId, "live", SharepreferenceDBHandler.getUserID(this.f49453d), strTrim);
            if (arrayListCheckFavourite == null || arrayListCheckFavourite.size() <= 0) {
                iVar.f49509x.setVisibility(4);
            } else {
                iVar.f49509x.setVisibility(0);
            }
            int i13 = i10;
            iVar.f49510y.setOnLongClickListener(new d(iVar, i13, categoryId, name, num, strTrim));
            iVar.f49504E.setOnLongClickListener(new e(iVar, i13, categoryId, name, num, strTrim));
            iVar.f49500A.setOnClickListener(new f(iVar, i13, categoryId, name, num, strTrim));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public i L(ViewGroup viewGroup, int i9) {
        SharedPreferences sharedPreferences = this.f49453d.getSharedPreferences("listgridview", 0);
        this.f49461l = sharedPreferences;
        int i10 = sharedPreferences.getInt("livestream", 0);
        AbstractC2237a.f44456M = i10;
        i iVar = i10 == 1 ? new i(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12618C3, viewGroup, false)) : new i(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12624D3, viewGroup, false));
        this.f49460k = iVar;
        return iVar;
    }

    public final void z0(i iVar, int i9, String str, String str2, String str3, String str4) {
        k.U u9 = new k.U(this.f49453d, iVar.f49508w);
        u9.d(a7.h.f12922e);
        (this.f49458i.checkFavourite(i9, str, "live", SharepreferenceDBHandler.getUserID(this.f49453d), str4).size() > 0 ? u9.b().getItem(2) : u9.b().getItem(1)).setVisible(true);
        u9.f(new g(iVar, str, i9, str4, str2, str3));
        u9.g();
    }
}
