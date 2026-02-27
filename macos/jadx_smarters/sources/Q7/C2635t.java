package q7;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.StalkerLiveFavIdsSingleton;
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
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity;
import com.squareup.picasso.InterfaceC1611e;
import i7.AbstractC1902a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.U;
import m7.AbstractC2237a;
import n4.C2281m;
import o4.C2325b;
import o4.C2328e;
import org.json.JSONObject;
import q7.Z;
import q7.m0;
import u7.C2858a;
import x4.C2957a;

/* JADX INFO: renamed from: q7.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2635t extends RecyclerView.g implements Filterable, z7.g {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f49226B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f49227C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Handler f49229E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public LiveStreamDBHandler f49230F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public n7.e f49231G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ArrayList f49233I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f49234J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f49235d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f49239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f49240i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DatabaseHandler f49242k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Animation f49243l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f49244m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l f49245n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f49246o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f49247p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SharedPreferences f49251t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C2328e f49252u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f49241j = Boolean.FALSE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f49248q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f49249r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f49250s = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f49253v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f49254w = "0";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f49255x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f49256y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f49257z = "";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f49225A = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f49228D = "";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f49232H = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f49236e = VodAllCategoriesSingleton.getInstance().getLiveList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f49237f = VodAllCategoriesSingleton.getInstance().getLiveList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f49238g = VodAllCategoriesSingleton.getInstance().getContinueWatchingList();

    /* JADX INFO: renamed from: q7.t$a */
    public class a implements InterfaceC1611e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f49258a;

        /* JADX INFO: renamed from: q7.t$a$a, reason: collision with other inner class name */
        public class C0426a implements InterfaceC1611e {
            public C0426a() {
            }

            @Override // com.squareup.picasso.InterfaceC1611e
            public void a() {
            }

            @Override // com.squareup.picasso.InterfaceC1611e
            public void onSuccess() {
            }
        }

        public a(o oVar) {
            this.f49258a = oVar;
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
            com.squareup.picasso.t.q(C2635t.this.f49240i).l(String.valueOf(F.h.f(C2635t.this.f49240i.getResources(), a7.e.f11895B1, C2635t.this.f49240i.getTheme()))).e().b().h(this.f49258a.f49348v, new C0426a());
            this.f49258a.f49346t.setVisibility(0);
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: q7.t$b */
    public class b implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f49262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f49263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f49264d;

        /* JADX INFO: renamed from: q7.t$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C2635t.this.w();
            }
        }

        /* JADX INFO: renamed from: q7.t$b$b, reason: collision with other inner class name */
        public class DialogC0427b extends Dialog implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Activity f49267a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public TextView f49268c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public TextView f49269d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public TextView f49270e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public LinearLayout f49271f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public LinearLayout f49272g;

            /* JADX INFO: renamed from: q7.t$b$b$a */
            public class a implements Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (C2635t.this.f49240i instanceof LiveAllDataSingleActivity) {
                        ((LiveAllDataSingleActivity) C2635t.this.f49240i).j2();
                    }
                }
            }

            /* JADX INFO: renamed from: q7.t$b$b$b, reason: collision with other inner class name */
            public class ViewOnFocusChangeListenerC0428b implements View.OnFocusChangeListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public View f49275a;

                public ViewOnFocusChangeListenerC0428b(View view) {
                    this.f49275a = view;
                }

                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view, boolean z9) {
                    LinearLayout linearLayout;
                    int i9;
                    if (z9) {
                        View view2 = this.f49275a;
                        if (view2 == null || view2.getTag() == null || !this.f49275a.getTag().equals("1")) {
                            View view3 = this.f49275a;
                            if (view3 == null || view3.getTag() == null || !this.f49275a.getTag().equals("2")) {
                                return;
                            } else {
                                linearLayout = DialogC0427b.this.f49272g;
                            }
                        } else {
                            linearLayout = DialogC0427b.this.f49271f;
                        }
                        i9 = a7.e.f12042p;
                    } else {
                        View view4 = this.f49275a;
                        if (view4 == null || view4.getTag() == null || !this.f49275a.getTag().equals("1")) {
                            View view5 = this.f49275a;
                            if (view5 == null || view5.getTag() == null || !this.f49275a.getTag().equals("2")) {
                                return;
                            } else {
                                linearLayout = DialogC0427b.this.f49272g;
                            }
                        } else {
                            linearLayout = DialogC0427b.this.f49271f;
                        }
                        i9 = a7.e.f12038o;
                    }
                    linearLayout.setBackgroundResource(i9);
                }
            }

            public DialogC0427b(Activity activity) {
                super(activity);
                this.f49267a = activity;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int id = view.getId();
                if (id == a7.f.f12544u1) {
                    try {
                        C2635t.this.f49230F.deleteLiveRecentlyWatched(String.valueOf(b.this.f49261a));
                        if (C2635t.this.f49240i instanceof LiveAllDataSingleActivity) {
                            ((LiveAllDataSingleActivity) C2635t.this.f49240i).p2();
                        }
                        new Handler().postDelayed(new a(), 100L);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                } else if (id == a7.f.f12412h1) {
                    dismiss();
                }
                dismiss();
            }

            @Override // android.app.Dialog
            public void onCreate(Bundle bundle) {
                super.onCreate(bundle);
                setContentView(new C2858a(C2635t.this.f49240i).A().equals(AbstractC2237a.f44453K0) ? a7.g.f12742X1 : a7.g.f12736W1);
                this.f49268c = (TextView) findViewById(a7.f.f12544u1);
                this.f49269d = (TextView) findViewById(a7.f.f12412h1);
                this.f49271f = (LinearLayout) findViewById(a7.f.V8);
                this.f49272g = (LinearLayout) findViewById(a7.f.Ia);
                TextView textView = (TextView) findViewById(a7.f.um);
                this.f49270e = textView;
                textView.setText(C2635t.this.f49240i.getResources().getString(a7.j.Y8));
                this.f49268c.setOnClickListener(this);
                this.f49269d.setOnClickListener(this);
                TextView textView2 = this.f49268c;
                textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0428b(textView2));
                TextView textView3 = this.f49269d;
                textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0428b(textView3));
            }
        }

        public b(String str, o oVar, int i9, ArrayList arrayList) {
            this.f49261a = str;
            this.f49262b = oVar;
            this.f49263c = i9;
            this.f49264d = arrayList;
        }

        @Override // k.U.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId != a7.f.Bb && itemId != a7.f.Lb) {
                if (itemId != a7.f.kb) {
                    return false;
                }
                new DialogC0427b((LiveAllDataSingleActivity) C2635t.this.f49240i).show();
                return false;
            }
            C2635t.this.a1(C2635t.this.f49230F.checkFavourite(this.f49261a, SharepreferenceDBHandler.getUserID(C2635t.this.f49240i)), this.f49262b, this.f49263c, this.f49264d);
            new Handler().postDelayed(new a(), 300L);
            if (!(C2635t.this.f49240i instanceof LiveAllDataSingleActivity)) {
                return false;
            }
            ((LiveAllDataSingleActivity) C2635t.this.f49240i).j2();
            return false;
        }
    }

    /* JADX INFO: renamed from: q7.t$c */
    public class c implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LiveStreamsDBModel f49278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f49280d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f49281e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f49282f;

        /* JADX INFO: renamed from: q7.t$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C2635t.this.w();
            }
        }

        /* JADX INFO: renamed from: q7.t$c$b */
        public class b extends Dialog implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Activity f49285a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public TextView f49286c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public TextView f49287d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public TextView f49288e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public LinearLayout f49289f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public LinearLayout f49290g;

            /* JADX INFO: renamed from: q7.t$c$b$a */
            public class a implements Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (C2635t.this.f49240i instanceof LiveAllDataSingleActivity) {
                        ((LiveAllDataSingleActivity) C2635t.this.f49240i).j2();
                    }
                }
            }

            /* JADX INFO: renamed from: q7.t$c$b$b, reason: collision with other inner class name */
            public class ViewOnFocusChangeListenerC0429b implements View.OnFocusChangeListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public View f49293a;

                public ViewOnFocusChangeListenerC0429b(View view) {
                    this.f49293a = view;
                }

                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view, boolean z9) {
                    LinearLayout linearLayout;
                    int i9;
                    if (z9) {
                        View view2 = this.f49293a;
                        if (view2 == null || view2.getTag() == null || !this.f49293a.getTag().equals("1")) {
                            View view3 = this.f49293a;
                            if (view3 == null || view3.getTag() == null || !this.f49293a.getTag().equals("2")) {
                                return;
                            } else {
                                linearLayout = b.this.f49290g;
                            }
                        } else {
                            linearLayout = b.this.f49289f;
                        }
                        i9 = a7.e.f12042p;
                    } else {
                        View view4 = this.f49293a;
                        if (view4 == null || view4.getTag() == null || !this.f49293a.getTag().equals("1")) {
                            View view5 = this.f49293a;
                            if (view5 == null || view5.getTag() == null || !this.f49293a.getTag().equals("2")) {
                                return;
                            } else {
                                linearLayout = b.this.f49290g;
                            }
                        } else {
                            linearLayout = b.this.f49289f;
                        }
                        i9 = a7.e.f12038o;
                    }
                    linearLayout.setBackgroundResource(i9);
                }
            }

            public b(Activity activity) {
                super(activity);
                this.f49285a = activity;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view.getId() == a7.f.f12544u1) {
                    try {
                        C2635t.this.f49230F.deleteLiveRecentlyWatched(String.valueOf(c.this.f49277a));
                        if (C2635t.this.f49240i instanceof LiveAllDataSingleActivity) {
                            ((LiveAllDataSingleActivity) C2635t.this.f49240i).p2();
                        }
                        new Handler().postDelayed(new a(), 100L);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                } else if (view.getId() == a7.f.f12412h1) {
                    dismiss();
                }
                dismiss();
            }

            @Override // android.app.Dialog
            public void onCreate(Bundle bundle) {
                super.onCreate(bundle);
                setContentView(new C2858a(C2635t.this.f49240i).A().equals(AbstractC2237a.f44453K0) ? a7.g.f12742X1 : a7.g.f12736W1);
                this.f49286c = (TextView) findViewById(a7.f.f12544u1);
                this.f49287d = (TextView) findViewById(a7.f.f12412h1);
                this.f49289f = (LinearLayout) findViewById(a7.f.V8);
                this.f49290g = (LinearLayout) findViewById(a7.f.Ia);
                TextView textView = (TextView) findViewById(a7.f.um);
                this.f49288e = textView;
                textView.setText(C2635t.this.f49240i.getResources().getString(a7.j.Y8));
                this.f49286c.setOnClickListener(this);
                this.f49287d.setOnClickListener(this);
                TextView textView2 = this.f49286c;
                textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0429b(textView2));
                TextView textView3 = this.f49287d;
                textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0429b(textView3));
            }
        }

        public c(String str, LiveStreamsDBModel liveStreamsDBModel, String str2, o oVar, int i9, ArrayList arrayList) {
            this.f49277a = str;
            this.f49278b = liveStreamsDBModel;
            this.f49279c = str2;
            this.f49280d = oVar;
            this.f49281e = i9;
            this.f49282f = arrayList;
        }

        @Override // k.U.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (menuItem.getItemId() != a7.f.Bb && menuItem.getItemId() != a7.f.Lb) {
                if (menuItem.getItemId() != a7.f.kb) {
                    return false;
                }
                new b((LiveAllDataSingleActivity) C2635t.this.f49240i).show();
                return false;
            }
            C2635t.this.Z0(C2635t.this.f49242k.checkFavourite(Integer.parseInt(this.f49277a), this.f49278b.getCategoryId(), this.f49278b.getStreamType(), SharepreferenceDBHandler.getUserID(C2635t.this.f49240i), this.f49279c), this.f49280d, this.f49281e, this.f49282f);
            new Handler().postDelayed(new a(), 300L);
            if (!(C2635t.this.f49240i instanceof LiveAllDataSingleActivity)) {
                return false;
            }
            ((LiveAllDataSingleActivity) C2635t.this.f49240i).j2();
            return false;
        }
    }

    /* JADX INFO: renamed from: q7.t$d */
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

    /* JADX INFO: renamed from: q7.t$e */
    public class e implements InterfaceC1611e {
        public e() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: q7.t$f */
    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49297a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f49299d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f49300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f49301f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f49302g;

        public f(String str, String str2, int i9, String str3, String str4, String str5) {
            this.f49297a = str;
            this.f49298c = str2;
            this.f49299d = i9;
            this.f49300e = str3;
            this.f49301f = str4;
            this.f49302g = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strU;
            String string;
            String str;
            String str2 = "";
            int iD1 = SharepreferenceDBHandler.getCurrentAPPType(C2635t.this.f49240i).equals("m3u") ? C2635t.this.d1(this.f49297a, "m3u") : SharepreferenceDBHandler.getCurrentAPPType(C2635t.this.f49240i).equals("onestream_api") ? C2635t.this.d1(this.f49298c, "onestream_api") : C2635t.this.d1(String.valueOf(this.f49299d), "api");
            try {
                C2635t c2635t = C2635t.this;
                c2635t.f49252u = C2325b.e(c2635t.f49240i).c().c();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            if (C2635t.this.f49252u == null || !C2635t.this.f49252u.c()) {
                m7.w.x0(C2635t.this.f49240i, "Built-in Player ( Default )", this.f49299d, this.f49302g, iD1, "", "", "", C2635t.this.f49227C, "", C2635t.this.f49226B);
                return;
            }
            if (C2635t.this.f49252u != null && C2635t.this.f49252u.r() != null && C2635t.this.f49252u.r().j() != null && C2635t.this.f49252u.r().j().J() != null) {
                C2635t c2635t2 = C2635t.this;
                c2635t2.f49228D = c2635t2.f49252u.r().j().J();
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(C2635t.this.f49240i).equals("m3u")) {
                strU = this.f49297a;
            } else {
                String str3 = "m3u8";
                if (SharepreferenceDBHandler.getCurrentAPPType(C2635t.this.f49240i).equals("onestream_api")) {
                    try {
                        JSONObject jSONObject = new JSONObject(this.f49297a);
                        String string2 = C2635t.this.f49240i.getSharedPreferences("allowedFormat", 0).getString("allowedFormat", "");
                        String str4 = "ts";
                        if (string2 == null || string2.isEmpty() || !string2.equals(".ts")) {
                            string = "";
                            str = string;
                        } else {
                            Iterator<String> itKeys = jSONObject.keys();
                            while (true) {
                                if (!itKeys.hasNext()) {
                                    str = "";
                                    break;
                                } else if (itKeys.next().equals("ts")) {
                                    str = "ts";
                                    break;
                                }
                            }
                            if (str.equals("")) {
                                while (true) {
                                    if (!itKeys.hasNext()) {
                                        break;
                                    } else if (itKeys.next().equals("m3u8")) {
                                        str = "m3u8";
                                        break;
                                    }
                                }
                            }
                            string = jSONObject.getString(str);
                        }
                        if (string2 != null) {
                            try {
                                if (!string2.isEmpty() && string2.equals(".m3u8")) {
                                    Iterator<String> itKeys2 = jSONObject.keys();
                                    while (true) {
                                        if (!itKeys2.hasNext()) {
                                            str3 = str;
                                            break;
                                        } else if (itKeys2.next().equals("m3u8")) {
                                            break;
                                        }
                                    }
                                    if (str3.equals("")) {
                                        while (itKeys2.hasNext()) {
                                            if (itKeys2.next().equals("ts")) {
                                                break;
                                            }
                                        }
                                        str4 = str3;
                                        string = jSONObject.getString(str4);
                                    } else {
                                        str4 = str3;
                                        string = jSONObject.getString(str4);
                                    }
                                }
                            } catch (Exception unused) {
                                str2 = string;
                                strU = str2;
                            }
                        }
                        strU = string;
                    } catch (Exception unused2) {
                    }
                } else {
                    strU = m7.w.U(C2635t.this.f49240i, this.f49299d, "m3u8", "live");
                }
            }
            if (C2635t.this.f49228D.contains(String.valueOf(strU))) {
                C2635t.this.f49240i.startActivity(new Intent(C2635t.this.f49240i, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            C2281m c2281m = new C2281m(1);
            c2281m.M("com.google.android.gms.cast.metadata.TITLE", this.f49300e);
            c2281m.c(new C2957a(Uri.parse(this.f49301f)));
            C2635t c2635t3 = C2635t.this;
            AbstractC1902a.b(c2635t3.f49229E, c2635t3.f49252u.r(), strU, c2281m, C2635t.this.f49240i);
        }
    }

    /* JADX INFO: renamed from: q7.t$g */
    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49304a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f49306d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f49307e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f49308f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f49309g;

        public g(String str, String str2, int i9, String str3, String str4, String str5) {
            this.f49304a = str;
            this.f49305c = str2;
            this.f49306d = i9;
            this.f49307e = str3;
            this.f49308f = str4;
            this.f49309g = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strU;
            String string;
            String str;
            String str2 = "";
            int iD1 = SharepreferenceDBHandler.getCurrentAPPType(C2635t.this.f49240i).equals("m3u") ? C2635t.this.d1(this.f49304a, "m3u") : SharepreferenceDBHandler.getCurrentAPPType(C2635t.this.f49240i).equals("onestream_api") ? C2635t.this.d1(this.f49305c, "onestream_api") : C2635t.this.d1(String.valueOf(this.f49306d), "api");
            try {
                C2635t c2635t = C2635t.this;
                c2635t.f49252u = C2325b.e(c2635t.f49240i).c().c();
            } catch (Exception unused) {
            }
            if (C2635t.this.f49252u == null || !C2635t.this.f49252u.c()) {
                m7.w.x0(C2635t.this.f49240i, "Built-in Player ( Default )", this.f49306d, this.f49309g, iD1, "", "", "", C2635t.this.f49227C, "", C2635t.this.f49226B);
                return;
            }
            if (C2635t.this.f49252u != null && C2635t.this.f49252u.r() != null && C2635t.this.f49252u.r().j() != null && C2635t.this.f49252u.r().j().J() != null) {
                C2635t c2635t2 = C2635t.this;
                c2635t2.f49228D = c2635t2.f49252u.r().j().J();
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(C2635t.this.f49240i).equals("m3u")) {
                strU = this.f49304a;
            } else {
                String str3 = "m3u8";
                if (SharepreferenceDBHandler.getCurrentAPPType(C2635t.this.f49240i).equals("onestream_api")) {
                    try {
                        JSONObject jSONObject = new JSONObject(this.f49304a);
                        String string2 = C2635t.this.f49240i.getSharedPreferences("allowedFormat", 0).getString("allowedFormat", "");
                        String str4 = "ts";
                        if (string2 == null || string2.isEmpty() || !string2.equals(".ts")) {
                            string = "";
                            str = string;
                        } else {
                            Iterator<String> itKeys = jSONObject.keys();
                            while (true) {
                                if (!itKeys.hasNext()) {
                                    str = "";
                                    break;
                                } else if (itKeys.next().equals("ts")) {
                                    str = "ts";
                                    break;
                                }
                            }
                            if (str.equals("")) {
                                while (true) {
                                    if (!itKeys.hasNext()) {
                                        break;
                                    } else if (itKeys.next().equals("m3u8")) {
                                        str = "m3u8";
                                        break;
                                    }
                                }
                            }
                            string = jSONObject.getString(str);
                        }
                        if (string2 != null) {
                            try {
                                if (!string2.isEmpty() && string2.equals(".m3u8")) {
                                    Iterator<String> itKeys2 = jSONObject.keys();
                                    while (true) {
                                        if (!itKeys2.hasNext()) {
                                            str3 = str;
                                            break;
                                        } else if (itKeys2.next().equals("m3u8")) {
                                            break;
                                        }
                                    }
                                    if (str3.equals("")) {
                                        while (itKeys2.hasNext()) {
                                            if (itKeys2.next().equals("ts")) {
                                                break;
                                            }
                                        }
                                        str4 = str3;
                                        string = jSONObject.getString(str4);
                                    } else {
                                        str4 = str3;
                                        string = jSONObject.getString(str4);
                                    }
                                }
                            } catch (Exception unused2) {
                                str2 = string;
                                strU = str2;
                            }
                        }
                        strU = string;
                    } catch (Exception unused3) {
                    }
                } else {
                    strU = m7.w.U(C2635t.this.f49240i, this.f49306d, "m3u8", "live");
                }
            }
            if (C2635t.this.f49228D.contains(String.valueOf(this.f49306d))) {
                C2635t.this.f49240i.startActivity(new Intent(C2635t.this.f49240i, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            C2281m c2281m = new C2281m(1);
            c2281m.M("com.google.android.gms.cast.metadata.TITLE", this.f49307e);
            c2281m.c(new C2957a(Uri.parse(this.f49308f)));
            C2635t c2635t3 = C2635t.this;
            AbstractC1902a.b(c2635t3.f49229E, c2635t3.f49252u.r(), strU, c2281m, C2635t.this.f49240i);
        }
    }

    /* JADX INFO: renamed from: q7.t$h */
    public class h implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49311a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f49313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f49314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f49315f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f49316g;

        public h(String str, String str2, int i9, String str3, String str4, String str5) {
            this.f49311a = str;
            this.f49312c = str2;
            this.f49313d = i9;
            this.f49314e = str3;
            this.f49315f = str4;
            this.f49316g = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strU;
            String string;
            String str;
            String str2 = "";
            int iD1 = SharepreferenceDBHandler.getCurrentAPPType(C2635t.this.f49240i).equals("m3u") ? C2635t.this.d1(this.f49311a, "m3u") : SharepreferenceDBHandler.getCurrentAPPType(C2635t.this.f49240i).equals("onestream_api") ? C2635t.this.d1(this.f49312c, "onestream_api") : C2635t.this.d1(String.valueOf(this.f49313d), "api");
            try {
                C2635t c2635t = C2635t.this;
                c2635t.f49252u = C2325b.e(c2635t.f49240i).c().c();
            } catch (Exception unused) {
            }
            if (C2635t.this.f49252u == null || !C2635t.this.f49252u.c()) {
                m7.w.x0(C2635t.this.f49240i, "Built-in Player ( Default )", this.f49313d, this.f49316g, iD1, "", "", "", C2635t.this.f49227C, "", C2635t.this.f49226B);
                return;
            }
            if (C2635t.this.f49252u != null && C2635t.this.f49252u.r() != null && C2635t.this.f49252u.r().j() != null && C2635t.this.f49252u.r().j().J() != null) {
                C2635t c2635t2 = C2635t.this;
                c2635t2.f49228D = c2635t2.f49252u.r().j().J();
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(C2635t.this.f49240i).equals("m3u")) {
                strU = this.f49311a;
            } else {
                String str3 = "m3u8";
                if (SharepreferenceDBHandler.getCurrentAPPType(C2635t.this.f49240i).equals("onestream_api")) {
                    try {
                        JSONObject jSONObject = new JSONObject(this.f49311a);
                        String string2 = C2635t.this.f49240i.getSharedPreferences("allowedFormat", 0).getString("allowedFormat", "");
                        String str4 = "ts";
                        if (string2 == null || string2.isEmpty() || !string2.equals(".ts")) {
                            string = "";
                            str = string;
                        } else {
                            Iterator<String> itKeys = jSONObject.keys();
                            while (true) {
                                if (!itKeys.hasNext()) {
                                    str = "";
                                    break;
                                } else if (itKeys.next().equals("ts")) {
                                    str = "ts";
                                    break;
                                }
                            }
                            if (str.equals("")) {
                                while (true) {
                                    if (!itKeys.hasNext()) {
                                        break;
                                    } else if (itKeys.next().equals("m3u8")) {
                                        str = "m3u8";
                                        break;
                                    }
                                }
                            }
                            string = jSONObject.getString(str);
                        }
                        if (string2 != null) {
                            try {
                                if (!string2.isEmpty() && string2.equals(".m3u8")) {
                                    Iterator<String> itKeys2 = jSONObject.keys();
                                    while (true) {
                                        if (!itKeys2.hasNext()) {
                                            str3 = str;
                                            break;
                                        } else if (itKeys2.next().equals("m3u8")) {
                                            break;
                                        }
                                    }
                                    if (str3.equals("")) {
                                        while (itKeys2.hasNext()) {
                                            if (itKeys2.next().equals("ts")) {
                                                break;
                                            }
                                        }
                                        str4 = str3;
                                        string = jSONObject.getString(str4);
                                    } else {
                                        str4 = str3;
                                        string = jSONObject.getString(str4);
                                    }
                                }
                            } catch (Exception unused2) {
                                str2 = string;
                                strU = str2;
                            }
                        }
                        strU = string;
                    } catch (Exception unused3) {
                    }
                } else {
                    strU = m7.w.U(C2635t.this.f49240i, this.f49313d, "m3u8", "live");
                }
            }
            if (C2635t.this.f49228D.contains(String.valueOf(this.f49313d))) {
                C2635t.this.f49240i.startActivity(new Intent(C2635t.this.f49240i, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            C2281m c2281m = new C2281m(1);
            c2281m.M("com.google.android.gms.cast.metadata.TITLE", this.f49314e);
            c2281m.c(new C2957a(Uri.parse(this.f49315f)));
            C2635t c2635t3 = C2635t.this;
            AbstractC1902a.b(c2635t3.f49229E, c2635t3.f49252u.r(), strU, c2281m, C2635t.this.f49240i);
        }
    }

    /* JADX INFO: renamed from: q7.t$i */
    public class i implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f49318a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f49319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49320d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f49321e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f49322f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f49323g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f49324h;

        public i(o oVar, int i9, String str, int i10, String str2, String str3, String str4) {
            this.f49318a = oVar;
            this.f49319c = i9;
            this.f49320d = str;
            this.f49321e = i10;
            this.f49322f = str2;
            this.f49323g = str3;
            this.f49324h = str4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (C2635t.this.f49227C.equals("-6")) {
                C2635t c2635t = C2635t.this;
                c2635t.e1(this.f49318a, this.f49319c, c2635t.f49237f);
                return true;
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(C2635t.this.f49240i).equals("m3u")) {
                ArrayList<FavouriteM3UModel> arrayListCheckFavourite = C2635t.this.f49230F.checkFavourite(this.f49320d, SharepreferenceDBHandler.getUserID(C2635t.this.f49240i));
                C2635t c2635t2 = C2635t.this;
                c2635t2.a1(arrayListCheckFavourite, this.f49318a, this.f49319c, c2635t2.f49237f);
            } else if (SharepreferenceDBHandler.getCurrentAPPType(C2635t.this.f49240i).equals("stalker_api")) {
                m7.w.N0(C2635t.this.f49240i);
                C2635t.this.f49232H = 0;
                try {
                    if (C2635t.this.f49235d == null || C2635t.this.f49235d.size() <= 0 || !C2635t.this.f49235d.contains(Integer.valueOf(this.f49321e))) {
                        C2635t.this.S0(this.f49321e, this.f49318a);
                    } else {
                        C2635t.this.f1(this.f49321e, this.f49318a);
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            } else {
                ArrayList<FavouriteDBModel> arrayListCheckFavourite2 = C2635t.this.f49242k.checkFavourite(this.f49321e, this.f49323g, this.f49324h, SharepreferenceDBHandler.getUserID(C2635t.this.f49240i), this.f49322f);
                C2635t c2635t3 = C2635t.this;
                c2635t3.Z0(arrayListCheckFavourite2, this.f49318a, this.f49319c, c2635t3.f49237f);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: q7.t$j */
    public class j implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f49326a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f49327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49328d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f49329e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f49330f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f49331g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f49332h;

        public j(o oVar, int i9, String str, int i10, String str2, String str3, String str4) {
            this.f49326a = oVar;
            this.f49327c = i9;
            this.f49328d = str;
            this.f49329e = i10;
            this.f49330f = str2;
            this.f49331g = str3;
            this.f49332h = str4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (C2635t.this.f49227C.equals("-6")) {
                C2635t c2635t = C2635t.this;
                c2635t.e1(this.f49326a, this.f49327c, c2635t.f49237f);
                return true;
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(C2635t.this.f49240i).equals("m3u")) {
                ArrayList<FavouriteM3UModel> arrayListCheckFavourite = C2635t.this.f49230F.checkFavourite(this.f49328d, SharepreferenceDBHandler.getUserID(C2635t.this.f49240i));
                C2635t c2635t2 = C2635t.this;
                c2635t2.a1(arrayListCheckFavourite, this.f49326a, this.f49327c, c2635t2.f49237f);
            } else if (SharepreferenceDBHandler.getCurrentAPPType(C2635t.this.f49240i).equals("stalker_api")) {
                m7.w.N0(C2635t.this.f49240i);
                C2635t.this.f49232H = 0;
                try {
                    if (C2635t.this.f49235d == null || C2635t.this.f49235d.size() <= 0 || !C2635t.this.f49235d.contains(Integer.valueOf(this.f49329e))) {
                        C2635t.this.S0(this.f49329e, this.f49326a);
                    } else {
                        C2635t.this.f1(this.f49329e, this.f49326a);
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            } else {
                ArrayList<FavouriteDBModel> arrayListCheckFavourite2 = C2635t.this.f49242k.checkFavourite(this.f49329e, this.f49331g, this.f49332h, SharepreferenceDBHandler.getUserID(C2635t.this.f49240i), this.f49330f);
                C2635t c2635t3 = C2635t.this;
                c2635t3.Z0(arrayListCheckFavourite2, this.f49326a, this.f49327c, c2635t3.f49237f);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: q7.t$k */
    public class k implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f49334a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f49335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49336d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f49337e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f49338f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f49339g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f49340h;

        public k(o oVar, int i9, String str, int i10, String str2, String str3, String str4) {
            this.f49334a = oVar;
            this.f49335c = i9;
            this.f49336d = str;
            this.f49337e = i10;
            this.f49338f = str2;
            this.f49339g = str3;
            this.f49340h = str4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (C2635t.this.f49227C.equals("-6")) {
                C2635t c2635t = C2635t.this;
                c2635t.e1(this.f49334a, this.f49335c, c2635t.f49237f);
                return true;
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(C2635t.this.f49240i).equals("m3u")) {
                ArrayList<FavouriteM3UModel> arrayListCheckFavourite = C2635t.this.f49230F.checkFavourite(this.f49336d, SharepreferenceDBHandler.getUserID(C2635t.this.f49240i));
                C2635t c2635t2 = C2635t.this;
                c2635t2.a1(arrayListCheckFavourite, this.f49334a, this.f49335c, c2635t2.f49237f);
            } else if (SharepreferenceDBHandler.getCurrentAPPType(C2635t.this.f49240i).equals("stalker_api")) {
                m7.w.N0(C2635t.this.f49240i);
                C2635t.this.f49232H = 0;
                try {
                    if (C2635t.this.f49235d == null || C2635t.this.f49235d.size() <= 0 || !C2635t.this.f49235d.contains(Integer.valueOf(this.f49337e))) {
                        C2635t.this.S0(this.f49337e, this.f49334a);
                    } else {
                        C2635t.this.f1(this.f49337e, this.f49334a);
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            } else {
                ArrayList<FavouriteDBModel> arrayListCheckFavourite2 = C2635t.this.f49242k.checkFavourite(this.f49337e, this.f49339g, this.f49340h, SharepreferenceDBHandler.getUserID(C2635t.this.f49240i), this.f49338f);
                C2635t c2635t3 = C2635t.this;
                c2635t3.Z0(arrayListCheckFavourite2, this.f49334a, this.f49335c, c2635t3.f49237f);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: q7.t$l */
    public class l extends Filter {
        public l() {
        }

        public /* synthetic */ l(C2635t c2635t, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = C2635t.this.f49236e;
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
                C2635t.this.f49237f = (ArrayList) filterResults.values;
                if (C2635t.this.f49237f != null) {
                    C2635t.this.w();
                    if (C2635t.this.f49237f == null || C2635t.this.f49237f.size() != 0) {
                        ((LiveAllDataSingleActivity) C2635t.this.f49240i).u2();
                        ((LiveAllDataSingleActivity) C2635t.this.f49240i).X1();
                    } else {
                        ((LiveAllDataSingleActivity) C2635t.this.f49240i).V1();
                        ((LiveAllDataSingleActivity) C2635t.this.f49240i).v2(C2635t.this.f49240i.getResources().getString(a7.j.f13261g4));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: q7.t$m */
    public class m extends Filter {
        public m() {
        }

        public /* synthetic */ m(C2635t c2635t, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = C2635t.this.f49238g;
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
                C2635t.this.f49239h = (ArrayList) filterResults.values;
                if (C2635t.this.f49239h != null) {
                    C2635t.this.w();
                    if (C2635t.this.f49239h.size() == 0) {
                        ((LiveAllDataSingleActivity) C2635t.this.f49240i).V1();
                        ((LiveAllDataSingleActivity) C2635t.this.f49240i).v2(C2635t.this.f49240i.getResources().getString(a7.j.f13261g4));
                    } else {
                        ((LiveAllDataSingleActivity) C2635t.this.f49240i).u2();
                        ((LiveAllDataSingleActivity) C2635t.this.f49240i).X1();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: q7.t$n */
    public class n implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49344a;

        public n(int i9) {
            this.f49344a = i9;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            C2635t.this.f49250s = z9 ? this.f49344a : -1;
        }
    }

    /* JADX INFO: renamed from: q7.t$o */
    public static class o extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f49346t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public RelativeLayout f49347u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ImageView f49348v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public CardView f49349w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public TextView f49350x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public ImageView f49351y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public LinearLayout f49352z;

        public o(View view) {
            super(view);
            this.f49346t = (TextView) view.findViewById(a7.f.Fl);
            this.f49347u = (RelativeLayout) view.findViewById(a7.f.Ge);
            this.f49348v = (ImageView) view.findViewById(a7.f.f12102B5);
            this.f49349w = (CardView) view.findViewById(a7.f.f12178J1);
            this.f49350x = (TextView) view.findViewById(a7.f.Ul);
            this.f49351y = (ImageView) view.findViewById(a7.f.f12406g5);
            this.f49352z = (LinearLayout) view.findViewById(a7.f.f12235O8);
        }
    }

    public C2635t(Context context, String str, String str2, String str3, String str4) {
        this.f49244m = "";
        a aVar = null;
        this.f49245n = new l(this, aVar);
        this.f49246o = new m(this, aVar);
        this.f49247p = "mobile";
        this.f49226B = "";
        this.f49227C = "0";
        this.f49240i = context;
        this.f49234J = str4;
        this.f49233I = str4.equalsIgnoreCase("live") ? VodAllCategoriesSingleton.getInstance().getLiveFavList() : VodAllCategoriesSingleton.getInstance().getRadioFavList();
        this.f49239h = VodAllCategoriesSingleton.getInstance().getContinueWatchingList();
        this.f49242k = new DatabaseHandler(context);
        this.f49230F = new LiveStreamDBHandler(context);
        this.f49243l = AnimationUtils.loadAnimation(context, a7.b.f11823a);
        this.f49244m = str;
        this.f49226B = str2;
        this.f49227C = str3;
        this.f49235d = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
        this.f49231G = new n7.e(this, context);
        if (new C2858a(context).A().equals(AbstractC2237a.f44453K0)) {
            this.f49247p = "tv";
        } else {
            this.f49247p = "mobile";
        }
        this.f49229E = new Handler(Looper.getMainLooper());
        if (this.f49247p.equals("mobile")) {
            try {
                this.f49252u = C2325b.e(context).c().c();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x018e A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:3:0x001f, B:5:0x0023, B:7:0x0029, B:9:0x0043, B:11:0x005b, B:14:0x0062, B:16:0x0068, B:18:0x006f, B:20:0x0075, B:22:0x007e, B:24:0x0084, B:33:0x00a0, B:35:0x00a6, B:37:0x00ad, B:39:0x00b3, B:41:0x00ba, B:43:0x00c0, B:45:0x00c9, B:47:0x00e2, B:49:0x00ef, B:56:0x017f, B:58:0x018e, B:60:0x01a0, B:61:0x01a2, B:79:0x01f9, B:81:0x0290, B:83:0x0294, B:62:0x01a6, B:63:0x01a8, B:64:0x01ac, B:66:0x01ba, B:68:0x01be, B:70:0x01c4, B:72:0x01d0, B:73:0x01d3, B:74:0x01d6, B:75:0x01d9, B:77:0x01f3, B:78:0x01f6, B:55:0x014a, B:54:0x0146, B:53:0x0112, B:48:0x00e8, B:32:0x009c, B:84:0x02a0, B:86:0x02b0, B:28:0x0095, B:51:0x00f5), top: B:90:0x001f, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ac A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:3:0x001f, B:5:0x0023, B:7:0x0029, B:9:0x0043, B:11:0x005b, B:14:0x0062, B:16:0x0068, B:18:0x006f, B:20:0x0075, B:22:0x007e, B:24:0x0084, B:33:0x00a0, B:35:0x00a6, B:37:0x00ad, B:39:0x00b3, B:41:0x00ba, B:43:0x00c0, B:45:0x00c9, B:47:0x00e2, B:49:0x00ef, B:56:0x017f, B:58:0x018e, B:60:0x01a0, B:61:0x01a2, B:79:0x01f9, B:81:0x0290, B:83:0x0294, B:62:0x01a6, B:63:0x01a8, B:64:0x01ac, B:66:0x01ba, B:68:0x01be, B:70:0x01c4, B:72:0x01d0, B:73:0x01d3, B:74:0x01d6, B:75:0x01d9, B:77:0x01f3, B:78:0x01f6, B:55:0x014a, B:54:0x0146, B:53:0x0112, B:48:0x00e8, B:32:0x009c, B:84:0x02a0, B:86:0x02b0, B:28:0x0095, B:51:0x00f5), top: B:90:0x001f, inners: #1, #3 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(androidx.recyclerview.widget.RecyclerView.D r25, int r26) {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C2635t.E(androidx.recyclerview.widget.RecyclerView$D, int):void");
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
    public void I(m0.x xVar, int i9) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public RecyclerView.D L(ViewGroup viewGroup, int i9) {
        return new o(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12904x3, viewGroup, false));
    }

    @Override // z7.g
    public void M(StalkerGetAdCallback stalkerGetAdCallback, int i9) {
    }

    @Override // z7.g
    public void O(Z.E e9, int i9) {
    }

    @Override // z7.g
    public void P0(String str) {
        try {
            m7.w.X();
        } catch (Exception unused) {
        }
    }

    public final void S0(int i9, o oVar) {
        try {
            StringBuilder sb = new StringBuilder();
            List list = this.f49235d;
            if (list != null && list.size() > 0) {
                for (int i10 = 0; i10 < this.f49235d.size(); i10++) {
                    sb.append(this.f49235d.get(i10));
                    sb.append(",");
                }
            }
            sb.append(i9);
            this.f49232H = i9;
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f49240i);
            this.f49231G.c(SharepreferenceDBHandler.getLoggedInMacAddress(this.f49240i), stalkerToken, oVar, sb.toString(), "added", "");
        } catch (Exception unused) {
            m7.w.X();
        }
    }

    @Override // z7.g
    public void U(StalkerLiveFavIdsCallback stalkerLiveFavIdsCallback) {
    }

    @Override // z7.g
    public void V(StalkerProfilesCallback stalkerProfilesCallback) {
    }

    @Override // z7.g
    public void V0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, m0.x xVar, int i9) {
    }

    public final void W0(RecyclerView.D d9, int i9, ArrayList arrayList) {
        o oVar = (o) d9;
        FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
        favouriteDBModel.setCategoryID(((LiveStreamsDBModel) arrayList.get(i9)).getCategoryId());
        favouriteDBModel.setStreamID(m7.w.r0(((LiveStreamsDBModel) arrayList.get(i9)).getStreamId()));
        favouriteDBModel.setStreamIDOneStream(((LiveStreamsDBModel) arrayList.get(i9)).getStreamIdOneStream());
        favouriteDBModel.setName(((LiveStreamsDBModel) arrayList.get(i9)).getName());
        favouriteDBModel.setNum(((LiveStreamsDBModel) arrayList.get(i9)).getNum());
        favouriteDBModel.setUserID(SharepreferenceDBHandler.getUserID(this.f49240i));
        this.f49242k.addToFavourite(favouriteDBModel, ((LiveStreamsDBModel) arrayList.get(i9)).getStreamType());
        oVar.f49351y.startAnimation(this.f49243l);
        oVar.f49351y.setVisibility(0);
    }

    public final void Y0(RecyclerView.D d9, int i9, ArrayList arrayList) {
        o oVar = (o) d9;
        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
        favouriteM3UModel.setUrl(((LiveStreamsDBModel) arrayList.get(i9)).getUrl());
        favouriteM3UModel.setUserID(SharepreferenceDBHandler.getUserID(this.f49240i));
        favouriteM3UModel.setName(((LiveStreamsDBModel) arrayList.get(i9)).getName());
        favouriteM3UModel.setCategoryID(((LiveStreamsDBModel) arrayList.get(i9)).getCategoryId());
        this.f49230F.addToFavourite(favouriteM3UModel);
        oVar.f49351y.startAnimation(this.f49243l);
        oVar.f49351y.setVisibility(0);
    }

    public final void Z0(ArrayList arrayList, RecyclerView.D d9, int i9, ArrayList arrayList2) {
        if (arrayList.size() > 0) {
            g1(d9, i9, arrayList2);
        } else {
            W0(d9, i9, arrayList2);
        }
        this.f49249r = true;
        Context context = this.f49240i;
        if (context instanceof LiveAllDataSingleActivity) {
            ((LiveAllDataSingleActivity) context).j2();
        }
    }

    public final void a1(ArrayList arrayList, RecyclerView.D d9, int i9, ArrayList arrayList2) {
        if (arrayList.size() > 0) {
            h1(d9, i9, arrayList2);
        } else {
            Y0(d9, i9, arrayList2);
        }
        this.f49249r = true;
        Context context = this.f49240i;
        if (context instanceof LiveAllDataSingleActivity) {
            ((LiveAllDataSingleActivity) context).j2();
        }
    }

    public boolean b1() {
        return this.f49249r;
    }

    @Override // z7.g
    public void c(String str) {
    }

    public int c1() {
        return this.f49250s;
    }

    @Override // z7.g
    public void d0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, o oVar, String str, String str2) {
        try {
            m7.w.X();
            if (stalkerSetLiveFavCallback == null || stalkerSetLiveFavCallback.getJs() == null || !stalkerSetLiveFavCallback.getJs().equals(Boolean.TRUE)) {
                return;
            }
            this.f49235d = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
            if (str.equals("added")) {
                int i9 = this.f49232H;
                if (i9 != 0) {
                    this.f49235d.add(Integer.valueOf(i9));
                }
                StalkerLiveFavIdsSingleton.getInstance().setFavIdsList(this.f49235d);
                oVar.f49351y.startAnimation(this.f49243l);
                oVar.f49351y.setVisibility(0);
            } else {
                int i10 = this.f49232H;
                if (i10 != 0) {
                    this.f49235d.remove(Integer.valueOf(i10));
                    StalkerLiveFavIdsSingleton.getInstance().setFavIdsList(this.f49235d);
                }
                oVar.f49351y.setVisibility(4);
            }
            this.f49249r = true;
            Context context = this.f49240i;
            if (context instanceof LiveAllDataSingleActivity) {
                ((LiveAllDataSingleActivity) context).j2();
            }
        } catch (Exception unused) {
        }
    }

    public int d1(String str, String str2) {
        try {
            ArrayList arrayList = this.f49236e;
            if (arrayList != null && arrayList.size() > 0) {
                if (str2.equals("m3u")) {
                    for (int i9 = 0; i9 < this.f49236e.size(); i9++) {
                        if (((LiveStreamsDBModel) this.f49236e.get(i9)).getUrl().equals(str)) {
                            return i9;
                        }
                    }
                } else {
                    for (int i10 = 0; i10 < this.f49236e.size(); i10++) {
                        if (((LiveStreamsDBModel) this.f49236e.get(i10)).getStreamId().equals(str)) {
                            return i10;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    @Override // z7.g
    public void e(String str) {
    }

    @Override // z7.g
    public void e0(String str) {
    }

    public final void e1(RecyclerView.D d9, int i9, ArrayList arrayList) {
        String streamIdOneStream;
        try {
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f49240i).equals("m3u")) {
                if (arrayList == null || arrayList.size() <= 0) {
                    return;
                }
                o oVar = (o) d9;
                k.U u9 = new k.U(this.f49240i, oVar.f49349w);
                u9.d(a7.h.f12932o);
                String url = ((LiveStreamsDBModel) arrayList.get(i9)).getUrl();
                if (this.f49230F.checkFavourite(url, SharepreferenceDBHandler.getUserID(this.f49240i)).size() > 0) {
                    u9.b().getItem(0).setVisible(false);
                    u9.b().getItem(1).setVisible(true);
                } else {
                    u9.b().getItem(0).setVisible(true);
                    u9.b().getItem(1).setVisible(false);
                }
                u9.f(new b(url, oVar, i9, arrayList));
                u9.g();
                return;
            }
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            o oVar2 = (o) d9;
            k.U u10 = new k.U(this.f49240i, oVar2.f49349w);
            u10.d(a7.h.f12932o);
            LiveStreamsDBModel liveStreamsDBModel = (LiveStreamsDBModel) arrayList.get(i9);
            try {
                streamIdOneStream = liveStreamsDBModel.getStreamIdOneStream();
            } catch (Exception e9) {
                e9.printStackTrace();
                streamIdOneStream = "";
            }
            String streamIdOneStream2 = ((LiveStreamsDBModel) arrayList.get(i9)).getStreamIdOneStream() != null ? ((LiveStreamsDBModel) arrayList.get(i9)).getStreamIdOneStream() : ((LiveStreamsDBModel) arrayList.get(i9)).getStreamId() != null ? ((LiveStreamsDBModel) arrayList.get(i9)).getStreamId() : "";
            if (this.f49242k.checkFavourite(Integer.parseInt(streamIdOneStream2), liveStreamsDBModel.getCategoryId(), liveStreamsDBModel.getStreamType(), SharepreferenceDBHandler.getUserID(this.f49240i), streamIdOneStream).size() > 0) {
                u10.b().getItem(0).setVisible(false);
                u10.b().getItem(1).setVisible(true);
            } else {
                u10.b().getItem(0).setVisible(true);
                u10.b().getItem(1).setVisible(false);
            }
            u10.f(new c(streamIdOneStream2, liveStreamsDBModel, streamIdOneStream, oVar2, i9, arrayList));
            u10.g();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // z7.g
    public void f0(StalkerGetGenresCallback stalkerGetGenresCallback) {
    }

    public final void f1(int i9, o oVar) {
        try {
            List list = this.f49235d;
            if (list == null) {
                m7.w.X();
                return;
            }
            list.remove(Integer.valueOf(i9));
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < this.f49235d.size(); i10++) {
                sb.append(this.f49235d.get(i10));
                sb.append(",");
            }
            this.f49235d.add(Integer.valueOf(i9));
            String strSubstring = sb.toString().contains(",") ? sb.substring(0, sb.lastIndexOf(",")) : sb.toString();
            this.f49232H = i9;
            this.f49231G.c(SharepreferenceDBHandler.getLoggedInMacAddress(this.f49240i), SharepreferenceDBHandler.getStalkerToken(this.f49240i), oVar, strSubstring, "removed", "");
        } catch (Exception unused) {
            m7.w.X();
        }
    }

    public final void g1(RecyclerView.D d9, int i9, ArrayList arrayList) {
        this.f49242k.deleteFavourite(m7.w.r0(((LiveStreamsDBModel) arrayList.get(i9)).getStreamId()), ((LiveStreamsDBModel) arrayList.get(i9)).getCategoryId(), ((LiveStreamsDBModel) arrayList.get(i9)).getStreamType(), ((LiveStreamsDBModel) arrayList.get(i9)).getName(), SharepreferenceDBHandler.getUserID(this.f49240i), ((LiveStreamsDBModel) arrayList.get(i9)).getStreamIdOneStream());
        ((o) d9).f49351y.setVisibility(4);
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f49244m.equals("continue_watching") ? this.f49246o : this.f49245n;
    }

    public final void h1(RecyclerView.D d9, int i9, ArrayList arrayList) {
        this.f49230F.deleteFavourite(((LiveStreamsDBModel) arrayList.get(i9)).getUrl(), SharepreferenceDBHandler.getUserID(this.f49240i));
        ((o) d9).f49351y.setVisibility(4);
    }

    @Override // z7.g
    public void i(StalkerGetAllChannelsCallback stalkerGetAllChannelsCallback) {
    }

    public void i1() {
        this.f49249r = false;
    }

    @Override // z7.g
    public void j(StalkerGetVodCategoriesCallback stalkerGetVodCategoriesCallback) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        ArrayList arrayList;
        if (this.f49244m.equals("continue_watching")) {
            ArrayList arrayList2 = this.f49239h;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                return 0;
            }
            arrayList = this.f49239h;
        } else {
            ArrayList arrayList3 = this.f49237f;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return 0;
            }
            arrayList = this.f49237f;
        }
        return arrayList.size();
    }

    @Override // z7.g
    public void o0(String str) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int p(int i9) {
        return 0;
    }

    @Override // z7.g
    public void q(StalkerGetVODByCatCallback stalkerGetVODByCatCallback) {
    }

    @Override // z7.g
    public void v0(String str) {
    }

    @Override // z7.g
    public void y0(String str) {
    }
}
