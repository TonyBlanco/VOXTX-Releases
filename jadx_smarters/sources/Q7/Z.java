package q7;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
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
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.gson.JsonElement;
import com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.nst.iptvsmarterstvbox.model.EpisodesUsingSinglton;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.SeriesAllCategoriesSingleton;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.callback.SeriesDBModel;
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
import com.nst.iptvsmarterstvbox.model.database.ExternalPlayerDataBase;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity;
import com.nst.iptvsmarterstvbox.view.activity.SeriesAllDataSingleActivity;
import com.nst.iptvsmarterstvbox.view.activity.SeriesDetailActivity;
import com.squareup.picasso.InterfaceC1611e;
import com.squareup.picasso.t;
import i7.AbstractC1902a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import k.U;
import m7.AbstractC2237a;
import o4.C2325b;
import o4.C2328e;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;
import p7.C2509z0;
import q7.C2635t;
import q7.m0;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class Z extends RecyclerView.g implements Filterable, z7.m, z7.g {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ProgressDialog f47801J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C2509z0 f47802K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f47804M;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public LiveStreamDBHandler f47806O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public View f47807P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public n7.e f47808Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public E f47809R;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f47818i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DatabaseHandler f47820k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Animation f47821l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f47822m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public B f47823n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C f47824o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C2328e f47825p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f47826q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SharedPreferences f47827r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n7.j f47828s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f47819j = Boolean.FALSE;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f47829t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f47830u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f47831v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f47832w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f47833x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f47834y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f47835z = "";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f47792A = "";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f47793B = "";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f47794C = "";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f47795D = "0";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f47796E = "";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f47797F = 0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f47798G = "";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f47799H = "0";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f47800I = "";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f47803L = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ArrayList f47805N = new ArrayList();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public String f47810S = "";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f47811T = false;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f47812U = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f47813d = SeriesAllCategoriesSingleton.getInstance().getSeriesList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f47814e = SeriesAllCategoriesSingleton.getInstance().getSeriesList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f47816g = SeriesAllCategoriesSingleton.getInstance().getContinueWatchingList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f47815f = SeriesAllCategoriesSingleton.getInstance().getSeriesFavList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f47817h = SeriesAllCategoriesSingleton.getInstance().getContinueWatchingList();

    public static class A extends RecyclerView.D {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public ProgressBar f47836A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public CardView f47837B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public TextView f47838C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f47839t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f47840u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public RelativeLayout f47841v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ImageView f47842w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public CardView f47843x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public ImageView f47844y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public LinearLayout f47845z;

        public A(View view) {
            super(view);
            this.f47839t = (TextView) view.findViewById(a7.f.Fl);
            this.f47840u = (TextView) view.findViewById(a7.f.wl);
            this.f47841v = (RelativeLayout) view.findViewById(a7.f.Ge);
            this.f47842w = (ImageView) view.findViewById(a7.f.f12102B5);
            this.f47843x = (CardView) view.findViewById(a7.f.f12178J1);
            this.f47844y = (ImageView) view.findViewById(a7.f.f12406g5);
            this.f47845z = (LinearLayout) view.findViewById(a7.f.l9);
            this.f47836A = (ProgressBar) view.findViewById(a7.f.pc);
            this.f47837B = (CardView) view.findViewById(a7.f.f12109C2);
            this.f47838C = (TextView) view.findViewById(a7.f.jl);
        }
    }

    public class B extends Filter {
        public B() {
        }

        public /* synthetic */ B(Z z9, C2612a c2612a) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = Z.this.f47813d;
            if (arrayList == null) {
                filterResults.values = null;
                filterResults.count = 0;
                return filterResults;
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i9 = 0; i9 < size; i9++) {
                SeriesDBModel seriesDBModel = (SeriesDBModel) arrayList.get(i9);
                if (seriesDBModel.getName().toLowerCase().contains(lowerCase) || seriesDBModel.getName().contains(lowerCase)) {
                    arrayList2.add(seriesDBModel);
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                Z.this.f47814e = (ArrayList) filterResults.values;
                if (Z.this.f47814e != null) {
                    Z.this.w();
                    if (Z.this.f47814e == null || Z.this.f47814e.size() != 0) {
                        ((SeriesAllDataSingleActivity) Z.this.f47818i).G2();
                        ((SeriesAllDataSingleActivity) Z.this.f47818i).f2();
                    } else {
                        ((SeriesAllDataSingleActivity) Z.this.f47818i).h2();
                        ((SeriesAllDataSingleActivity) Z.this.f47818i).E2(Z.this.f47818i.getResources().getString(a7.j.f12958B4));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public class C extends Filter {
        public C() {
        }

        public /* synthetic */ C(Z z9, C2612a c2612a) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            List list = Z.this.f47816g;
            if (list == null) {
                filterResults.values = null;
                filterResults.count = 0;
                return filterResults;
            }
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i9 = 0; i9 < size; i9++) {
                GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = (GetEpisdoeDetailsCallback) list.get(i9);
                if (getEpisdoeDetailsCallback.getSeriesName().toLowerCase().contains(lowerCase) || getEpisdoeDetailsCallback.getSeriesName().contains(lowerCase)) {
                    arrayList.add(getEpisdoeDetailsCallback);
                }
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                Z.this.f47817h = (List) filterResults.values;
                if (Z.this.f47817h != null) {
                    Z.this.w();
                    if (Z.this.f47817h.size() == 0) {
                        ((SeriesAllDataSingleActivity) Z.this.f47818i).h2();
                        ((SeriesAllDataSingleActivity) Z.this.f47818i).E2(Z.this.f47818i.getResources().getString(a7.j.f12958B4));
                    } else {
                        ((SeriesAllDataSingleActivity) Z.this.f47818i).G2();
                        ((SeriesAllDataSingleActivity) Z.this.f47818i).f2();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public class D implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47848a;

        public D(int i9) {
            this.f47848a = i9;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            Z.this.f47804M = z9 ? this.f47848a : -1;
        }
    }

    public class E extends RecyclerView.D {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public CardView f47850A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public TextView f47851B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f47853t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public RelativeLayout f47854u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ImageView f47855v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public CardView f47856w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public TextView f47857x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public ImageView f47858y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public LinearLayout f47859z;

        public E(View view) {
            super(view);
            this.f47853t = (TextView) view.findViewById(a7.f.Fl);
            this.f47854u = (RelativeLayout) view.findViewById(a7.f.Ge);
            this.f47855v = (ImageView) view.findViewById(a7.f.f12102B5);
            this.f47856w = (CardView) view.findViewById(a7.f.f12178J1);
            this.f47857x = (TextView) view.findViewById(a7.f.Ul);
            this.f47858y = (ImageView) view.findViewById(a7.f.f12406g5);
            this.f47859z = (LinearLayout) view.findViewById(a7.f.f12235O8);
            this.f47850A = (CardView) view.findViewById(a7.f.f12109C2);
            this.f47851B = (TextView) view.findViewById(a7.f.jl);
        }
    }

    /* JADX INFO: renamed from: q7.Z$a, reason: case insensitive filesystem */
    public class C2612a implements InterfaceC1611e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ A f47860a;

        /* JADX INFO: renamed from: q7.Z$a$a, reason: collision with other inner class name */
        public class C0416a implements InterfaceC1611e {
            public C0416a() {
            }

            @Override // com.squareup.picasso.InterfaceC1611e
            public void a() {
            }

            @Override // com.squareup.picasso.InterfaceC1611e
            public void onSuccess() {
            }
        }

        public C2612a(A a9) {
            this.f47860a = a9;
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
            com.squareup.picasso.t.q(Z.this.f47818i).l(String.valueOf(Z.this.f47818i.getResources().getDrawable(a7.e.f11895B1))).e().a().h(this.f47860a.f47842w, new C0416a());
            this.f47860a.f47839t.setVisibility(0);
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: q7.Z$b, reason: case insensitive filesystem */
    public class C2613b implements InterfaceC1611e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ E f47863a;

        /* JADX INFO: renamed from: q7.Z$b$a */
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

        public C2613b(E e9) {
            this.f47863a = e9;
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
            com.squareup.picasso.t.q(Z.this.f47818i).l(String.valueOf(Z.this.f47818i.getResources().getDrawable(a7.e.f11895B1))).e().a().h(this.f47863a.f47855v, new a());
            this.f47863a.f47853t.setVisibility(0);
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: q7.Z$c, reason: case insensitive filesystem */
    public class C2614c implements InterfaceC1611e {
        public C2614c() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: q7.Z$d, reason: case insensitive filesystem */
    public class C2615d implements InterfaceC1611e {
        public C2615d() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: q7.Z$e, reason: case insensitive filesystem */
    public class ViewOnClickListenerC2616e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47868a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47870d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f47871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47872f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47873g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f47874h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f47875i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f47876j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f47877k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f47878l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f47879m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f47880n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f47881o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f47882p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f47883q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f47884r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f47885s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f47886t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f47887u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f47888v;

        public ViewOnClickListenerC2616e(String str, String str2, String str3, int i9, String str4, String str5, int i10, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
            this.f47868a = str;
            this.f47869c = str2;
            this.f47870d = str3;
            this.f47871e = i9;
            this.f47872f = str4;
            this.f47873g = str5;
            this.f47874h = i10;
            this.f47875i = str6;
            this.f47876j = str7;
            this.f47877k = str8;
            this.f47878l = str9;
            this.f47879m = str10;
            this.f47880n = str11;
            this.f47881o = str12;
            this.f47882p = str13;
            this.f47883q = str14;
            this.f47884r = str15;
            this.f47885s = str16;
            this.f47886t = str17;
            this.f47887u = str18;
            this.f47888v = str19;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int fav;
            if (SharepreferenceDBHandler.getCurrentAPPType(Z.this.f47818i).equals("m3u")) {
                Z.this.v1(this.f47868a, this.f47869c, this.f47870d, view);
                return;
            }
            try {
                fav = ((SeriesDBModel) Z.this.f47814e.get(this.f47871e)).getFav();
            } catch (Exception e9) {
                e9.printStackTrace();
                fav = 0;
            }
            Z.this.H1(this.f47872f, this.f47869c, this.f47873g, this.f47874h, this.f47870d, this.f47875i, this.f47876j, this.f47877k, this.f47878l, this.f47879m, this.f47880n, this.f47881o, this.f47882p, this.f47883q, this.f47884r, this.f47885s, this.f47886t, this.f47871e, fav, this.f47887u, this.f47888v);
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47890a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47891c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47892d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f47893e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47894f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47895g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f47896h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f47897i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f47898j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f47899k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f47900l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f47901m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f47902n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f47903o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f47904p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f47905q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f47906r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f47907s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f47908t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f47909u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f47910v;

        public f(String str, String str2, String str3, int i9, String str4, String str5, int i10, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
            this.f47890a = str;
            this.f47891c = str2;
            this.f47892d = str3;
            this.f47893e = i9;
            this.f47894f = str4;
            this.f47895g = str5;
            this.f47896h = i10;
            this.f47897i = str6;
            this.f47898j = str7;
            this.f47899k = str8;
            this.f47900l = str9;
            this.f47901m = str10;
            this.f47902n = str11;
            this.f47903o = str12;
            this.f47904p = str13;
            this.f47905q = str14;
            this.f47906r = str15;
            this.f47907s = str16;
            this.f47908t = str17;
            this.f47909u = str18;
            this.f47910v = str19;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int fav;
            if (SharepreferenceDBHandler.getCurrentAPPType(Z.this.f47818i).equals("m3u")) {
                Z.this.v1(this.f47890a, this.f47891c, this.f47892d, view);
                return;
            }
            try {
                fav = ((SeriesDBModel) Z.this.f47814e.get(this.f47893e)).getFav();
            } catch (Exception unused) {
                fav = 0;
            }
            Z.this.H1(this.f47894f, this.f47891c, this.f47895g, this.f47896h, this.f47892d, this.f47897i, this.f47898j, this.f47899k, this.f47900l, this.f47901m, this.f47902n, this.f47903o, this.f47904p, this.f47905q, this.f47906r, this.f47907s, this.f47908t, this.f47893e, fav, this.f47909u, this.f47910v);
        }
    }

    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47912a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47913c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47914d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f47915e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47916f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47917g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f47918h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f47919i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f47920j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f47921k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f47922l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f47923m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f47924n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f47925o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f47926p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f47927q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f47928r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f47929s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f47930t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f47931u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f47932v;

        public g(String str, String str2, String str3, int i9, String str4, String str5, int i10, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
            this.f47912a = str;
            this.f47913c = str2;
            this.f47914d = str3;
            this.f47915e = i9;
            this.f47916f = str4;
            this.f47917g = str5;
            this.f47918h = i10;
            this.f47919i = str6;
            this.f47920j = str7;
            this.f47921k = str8;
            this.f47922l = str9;
            this.f47923m = str10;
            this.f47924n = str11;
            this.f47925o = str12;
            this.f47926p = str13;
            this.f47927q = str14;
            this.f47928r = str15;
            this.f47929s = str16;
            this.f47930t = str17;
            this.f47931u = str18;
            this.f47932v = str19;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int fav;
            if (SharepreferenceDBHandler.getCurrentAPPType(Z.this.f47818i).equals("m3u")) {
                Z.this.v1(this.f47912a, this.f47913c, this.f47914d, view);
                return;
            }
            try {
                fav = ((SeriesDBModel) Z.this.f47814e.get(this.f47915e)).getFav();
            } catch (Exception e9) {
                e9.printStackTrace();
                fav = 0;
            }
            Z.this.H1(this.f47916f, this.f47913c, this.f47917g, this.f47918h, this.f47914d, this.f47919i, this.f47920j, this.f47921k, this.f47922l, this.f47923m, this.f47924n, this.f47925o, this.f47926p, this.f47927q, this.f47928r, this.f47929s, this.f47930t, this.f47915e, fav, this.f47931u, this.f47932v);
        }
    }

    public class h implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47934a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E f47935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f47936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f47937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47938f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47939g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f47940h;

        public h(String str, E e9, int i9, int i10, String str2, String str3, int i11) {
            this.f47934a = str;
            this.f47935c = e9;
            this.f47936d = i9;
            this.f47937e = i10;
            this.f47938f = str2;
            this.f47939g = str3;
            this.f47940h = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(Z.this.f47818i).equals("m3u")) {
                ArrayList<FavouriteM3UModel> arrayListCheckFavourite = Z.this.f47806O.checkFavourite(this.f47934a, SharepreferenceDBHandler.getUserID(Z.this.f47818i));
                Z z9 = Z.this;
                z9.p1(arrayListCheckFavourite, this.f47935c, this.f47936d, z9.f47814e);
                return true;
            }
            if (!SharepreferenceDBHandler.getCurrentAPPType(Z.this.f47818i).equals("stalker_api")) {
                ArrayList<FavouriteDBModel> arrayListCheckFavourite2 = Z.this.f47820k.checkFavourite(this.f47937e, this.f47939g, "series", SharepreferenceDBHandler.getUserID(Z.this.f47818i), this.f47938f);
                Z z10 = Z.this;
                z10.o1(arrayListCheckFavourite2, this.f47935c, this.f47936d, z10.f47814e, Z.this.f47817h, this.f47940h, this.f47935c.f47854u);
                return true;
            }
            m7.w.N0(Z.this.f47818i);
            try {
                if (this.f47935c.f47858y.getVisibility() == 0) {
                    Z.this.x1(this.f47937e, this.f47935c, this.f47936d);
                } else {
                    Z.this.l1(this.f47937e, this.f47935c, this.f47936d);
                }
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
    }

    public class i implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47942a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E f47943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f47944d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f47945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47946f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47947g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f47948h;

        public i(String str, E e9, int i9, int i10, String str2, String str3, int i11) {
            this.f47942a = str;
            this.f47943c = e9;
            this.f47944d = i9;
            this.f47945e = i10;
            this.f47946f = str2;
            this.f47947g = str3;
            this.f47948h = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(Z.this.f47818i).equals("m3u")) {
                ArrayList<FavouriteM3UModel> arrayListCheckFavourite = Z.this.f47806O.checkFavourite(this.f47942a, SharepreferenceDBHandler.getUserID(Z.this.f47818i));
                Z z9 = Z.this;
                z9.p1(arrayListCheckFavourite, this.f47943c, this.f47944d, z9.f47814e);
                return true;
            }
            if (!SharepreferenceDBHandler.getCurrentAPPType(Z.this.f47818i).equals("stalker_api")) {
                ArrayList<FavouriteDBModel> arrayListCheckFavourite2 = Z.this.f47820k.checkFavourite(this.f47945e, this.f47947g, "series", SharepreferenceDBHandler.getUserID(Z.this.f47818i), this.f47946f);
                Z z10 = Z.this;
                z10.o1(arrayListCheckFavourite2, this.f47943c, this.f47944d, z10.f47814e, Z.this.f47817h, this.f47948h, this.f47943c.f47854u);
                return true;
            }
            m7.w.N0(Z.this.f47818i);
            try {
                if (this.f47943c.f47858y.getVisibility() == 0) {
                    Z.this.x1(this.f47945e, this.f47943c, this.f47944d);
                } else {
                    Z.this.l1(this.f47945e, this.f47943c, this.f47944d);
                }
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
    }

    public class j implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47950a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E f47951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f47952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f47953e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47954f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47955g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f47956h;

        public j(String str, E e9, int i9, int i10, String str2, String str3, int i11) {
            this.f47950a = str;
            this.f47951c = e9;
            this.f47952d = i9;
            this.f47953e = i10;
            this.f47954f = str2;
            this.f47955g = str3;
            this.f47956h = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(Z.this.f47818i).equals("m3u")) {
                ArrayList<FavouriteM3UModel> arrayListCheckFavourite = Z.this.f47806O.checkFavourite(this.f47950a, SharepreferenceDBHandler.getUserID(Z.this.f47818i));
                Z z9 = Z.this;
                z9.p1(arrayListCheckFavourite, this.f47951c, this.f47952d, z9.f47814e);
                return true;
            }
            if (!SharepreferenceDBHandler.getCurrentAPPType(Z.this.f47818i).equals("stalker_api")) {
                ArrayList<FavouriteDBModel> arrayListCheckFavourite2 = Z.this.f47820k.checkFavourite(this.f47953e, this.f47955g, "series", SharepreferenceDBHandler.getUserID(Z.this.f47818i), this.f47954f);
                Z z10 = Z.this;
                z10.o1(arrayListCheckFavourite2, this.f47951c, this.f47952d, z10.f47814e, Z.this.f47817h, this.f47956h, this.f47951c.f47854u);
                return true;
            }
            m7.w.N0(Z.this.f47818i);
            try {
                if (this.f47951c.f47858y.getVisibility() == 0) {
                    Z.this.x1(this.f47953e, this.f47951c, this.f47952d);
                } else {
                    Z.this.l1(this.f47953e, this.f47951c, this.f47952d);
                }
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
    }

    public class k implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f47958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f47959b;

        public k(ArrayList arrayList, String str) {
            this.f47958a = arrayList;
            this.f47959b = str;
        }

        @Override // k.U.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                ArrayList arrayList = this.f47958a;
                if (arrayList != null && arrayList.size() > 0) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < this.f47958a.size()) {
                            if (menuItem.getItemId() != i9) {
                                i9++;
                            } else if (menuItem.getItemId() == 0) {
                                m7.w.v0(Z.this.f47818i, "", 0, "series", Z.this.f47793B, "0", Z.this.f47794C, null, this.f47959b, "", "");
                            } else {
                                Intent intent = new Intent(Z.this.f47818i, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", this.f47959b);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f47958a.get(i9)).getAppname());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f47958a.get(i9)).getPackagename());
                                Z.this.f47818i.startActivity(intent);
                            }
                        }
                    }
                }
                break;
            } catch (Exception unused) {
            }
            return false;
        }
    }

    public class l implements U.c {
        public l() {
        }

        @Override // k.U.c
        public void a(k.U u9) {
        }
    }

    public class m implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.D f47962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f47963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f47964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f47965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f47966e;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Z.this.w();
            }
        }

        public class b extends Dialog implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Activity f47969a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public TextView f47970c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public TextView f47971d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public TextView f47972e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public LinearLayout f47973f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public LinearLayout f47974g;

            public class a implements Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (Z.this.f47818i instanceof SeriesAllDataSingleActivity) {
                        ((SeriesAllDataSingleActivity) Z.this.f47818i).t2();
                    }
                }
            }

            /* JADX INFO: renamed from: q7.Z$m$b$b, reason: collision with other inner class name */
            public class ViewOnFocusChangeListenerC0417b implements View.OnFocusChangeListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public View f47977a;

                public ViewOnFocusChangeListenerC0417b(View view) {
                    this.f47977a = view;
                }

                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view, boolean z9) {
                    LinearLayout linearLayout;
                    int i9;
                    if (z9) {
                        View view2 = this.f47977a;
                        if (view2 == null || view2.getTag() == null || !this.f47977a.getTag().equals("1")) {
                            View view3 = this.f47977a;
                            if (view3 == null || view3.getTag() == null || !this.f47977a.getTag().equals("2")) {
                                return;
                            } else {
                                linearLayout = b.this.f47974g;
                            }
                        } else {
                            linearLayout = b.this.f47973f;
                        }
                        i9 = a7.e.f12042p;
                    } else {
                        View view4 = this.f47977a;
                        if (view4 == null || view4.getTag() == null || !this.f47977a.getTag().equals("1")) {
                            View view5 = this.f47977a;
                            if (view5 == null || view5.getTag() == null || !this.f47977a.getTag().equals("2")) {
                                return;
                            } else {
                                linearLayout = b.this.f47974g;
                            }
                        } else {
                            linearLayout = b.this.f47973f;
                        }
                        i9 = a7.e.f12038o;
                    }
                    linearLayout.setBackgroundResource(i9);
                }
            }

            public b(Activity activity) {
                super(activity);
                this.f47969a = activity;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view.getId() == a7.f.f12544u1) {
                    try {
                        Z z9 = Z.this;
                        C2509z0 c2509z0 = z9.f47802K;
                        Context context = z9.f47818i;
                        m mVar = m.this;
                        c2509z0.i(context, ((GetEpisdoeDetailsCallback) mVar.f47965d.get(mVar.f47963b)).getSeriesId());
                        if (Z.this.f47818i instanceof SeriesAllDataSingleActivity) {
                            ((SeriesAllDataSingleActivity) Z.this.f47818i).y2();
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
                setContentView(new C2858a(Z.this.f47818i).A().equals(AbstractC2237a.f44453K0) ? a7.g.f12742X1 : a7.g.f12736W1);
                this.f47970c = (TextView) findViewById(a7.f.f12544u1);
                this.f47971d = (TextView) findViewById(a7.f.f12412h1);
                this.f47973f = (LinearLayout) findViewById(a7.f.V8);
                this.f47974g = (LinearLayout) findViewById(a7.f.Ia);
                TextView textView = (TextView) findViewById(a7.f.um);
                this.f47972e = textView;
                textView.setText(Z.this.f47818i.getResources().getString(a7.j.a9));
                this.f47970c.setOnClickListener(this);
                this.f47971d.setOnClickListener(this);
                TextView textView2 = this.f47970c;
                textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0417b(textView2));
                TextView textView3 = this.f47971d;
                textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0417b(textView3));
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Z.this.w();
            }
        }

        public m(RecyclerView.D d9, int i9, ArrayList arrayList, List list, int i10) {
            this.f47962a = d9;
            this.f47963b = i9;
            this.f47964c = arrayList;
            this.f47965d = list;
            this.f47966e = i10;
        }

        @Override // k.U.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (menuItem.getItemId() == a7.f.Bb) {
                Z.this.m1(this.f47962a, this.f47963b, this.f47964c, this.f47965d, this.f47966e);
                new Handler().postDelayed(new a(), 300L);
                if (!(Z.this.f47818i instanceof SeriesAllDataSingleActivity)) {
                    return true;
                }
                ((SeriesAllDataSingleActivity) Z.this.f47818i).t2();
                return true;
            }
            if (menuItem.getItemId() != a7.f.Lb) {
                if (menuItem.getItemId() != a7.f.jb) {
                    return false;
                }
                new b((SeriesAllDataSingleActivity) Z.this.f47818i).show();
                return false;
            }
            Z.this.y1(this.f47962a, this.f47963b, this.f47964c, this.f47965d, this.f47966e);
            new Handler().postDelayed(new c(), 300L);
            if (!(Z.this.f47818i instanceof SeriesAllDataSingleActivity)) {
                return false;
            }
            ((SeriesAllDataSingleActivity) Z.this.f47818i).t2();
            return false;
        }
    }

    public class n implements com.squareup.picasso.C {
        public n() {
        }

        @Override // com.squareup.picasso.C
        public void a(Drawable drawable) {
            Log.d("TAG", "FAILED");
        }

        @Override // com.squareup.picasso.C
        public void b(Bitmap bitmap, t.e eVar) {
        }

        @Override // com.squareup.picasso.C
        public void c(Drawable drawable) {
            Log.d("TAG", "Prepare Load");
        }
    }

    public class o implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f47981a;

        public o(ArrayList arrayList) {
            this.f47981a = arrayList;
        }

        @Override // k.U.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            Context context;
            String str;
            int iR0;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            try {
                ArrayList arrayList = this.f47981a;
                if (arrayList != null && arrayList.size() > 0) {
                    int i9 = 0;
                    while (true) {
                        if (i9 >= this.f47981a.size()) {
                            break;
                        }
                        if (menuItem.getItemId() != i9) {
                            i9++;
                        } else if (menuItem.getItemId() == 0) {
                            if (SharepreferenceDBHandler.getCurrentAPPType(Z.this.f47818i).equals("onestream_api")) {
                                context = Z.this.f47818i;
                                str = "";
                                iR0 = m7.w.r0(Z.this.f47795D);
                                str2 = "series";
                                str3 = Z.this.f47793B;
                                str4 = "0";
                                str5 = Z.this.f47794C;
                                str6 = Z.this.f47796E;
                                str7 = Z.this.f47795D;
                            } else {
                                context = Z.this.f47818i;
                                str = "";
                                iR0 = m7.w.r0(Z.this.f47795D);
                                str2 = "series";
                                str3 = Z.this.f47793B;
                                str4 = "0";
                                str5 = Z.this.f47794C;
                                str6 = "";
                                str7 = "";
                            }
                            m7.w.v0(context, str, iR0, str2, str3, str4, str5, null, str6, str7, "");
                        } else {
                            String strU = SharepreferenceDBHandler.getCurrentAPPType(Z.this.f47818i).equals("onestream_api") ? Z.this.f47796E : m7.w.U(Z.this.f47818i, m7.w.r0(Z.this.f47795D), Z.this.f47793B, "series");
                            Intent intent = new Intent(Z.this.f47818i, (Class<?>) PlayExternalPlayerActivity.class);
                            intent.putExtra("url", strU);
                            intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f47981a.get(i9)).getAppname());
                            intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f47981a.get(i9)).getPackagename());
                            Z.this.f47818i.startActivity(intent);
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        }
    }

    public class p implements U.c {
        public p() {
        }

        @Override // k.U.c
        public void a(k.U u9) {
        }
    }

    public class q implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f47984a;

        public q(ArrayList arrayList) {
            this.f47984a = arrayList;
        }

        @Override // k.U.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                ArrayList arrayList = this.f47984a;
                if (arrayList != null && arrayList.size() > 0) {
                    int i9 = 0;
                    while (true) {
                        if (i9 >= this.f47984a.size()) {
                            break;
                        }
                        if (menuItem.getItemId() != i9) {
                            i9++;
                        } else if (menuItem.getItemId() == 0) {
                            m7.w.v0(Z.this.f47818i, "", m7.w.r0(Z.this.f47795D), "series", Z.this.f47793B, "0", Z.this.f47794C, null, Z.this.f47796E, Z.this.f47795D, "");
                        } else {
                            String strU = SharepreferenceDBHandler.getCurrentAPPType(Z.this.f47818i).equals("onestream_api") ? Z.this.f47796E : m7.w.U(Z.this.f47818i, m7.w.r0(Z.this.f47795D), Z.this.f47793B, "series");
                            Intent intent = new Intent(Z.this.f47818i, (Class<?>) PlayExternalPlayerActivity.class);
                            intent.putExtra("url", strU);
                            intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f47984a.get(i9)).getAppname());
                            intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f47984a.get(i9)).getPackagename());
                            Z.this.f47818i.startActivity(intent);
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        }
    }

    public class r implements U.c {
        public r() {
        }

        @Override // k.U.c
        public void a(k.U u9) {
        }
    }

    public class s implements InterfaceC1611e {
        public s() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    public class t implements InterfaceC1611e {
        public t() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    public class u implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47989a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47990c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47991d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f47992e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47993f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47994g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f47995h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f47996i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f47997j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f47998k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f47999l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f48000m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f48001n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f48002o;

        public u(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i9, String str10, String str11, String str12, int i10) {
            this.f47989a = str;
            this.f47990c = str2;
            this.f47991d = str3;
            this.f47992e = str4;
            this.f47993f = str5;
            this.f47994g = str6;
            this.f47995h = str7;
            this.f47996i = str8;
            this.f47997j = str9;
            this.f47998k = i9;
            this.f47999l = str10;
            this.f48000m = str11;
            this.f48001n = str12;
            this.f48002o = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Z.this.f47792A = String.valueOf(this.f47989a);
            Z.this.f47800I = this.f47990c;
            Z.this.f47835z = this.f47991d;
            Z.this.f47834y = this.f47992e;
            Z.this.f47832w = this.f47993f;
            Z.this.f47795D = this.f47994g;
            Z.this.f47796E = this.f47995h;
            Z.this.f47794C = this.f47996i;
            Z.this.f47793B = this.f47997j;
            Z.this.f47797F = this.f47998k;
            Z.this.f47798G = this.f47999l;
            Z.this.f47799H = this.f48000m;
            Z.this.f47833x = this.f48001n;
            AbstractC2237a.f44518l0 = this.f48002o;
            Z.this.f47807P = view;
            Z.this.u1();
        }
    }

    public class v implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48004a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48006d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48007e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48008f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48009g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48010h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48011i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48012j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f48013k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f48014l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f48015m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f48016n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f48017o;

        public v(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i9, String str10, String str11, String str12, int i10) {
            this.f48004a = str;
            this.f48005c = str2;
            this.f48006d = str3;
            this.f48007e = str4;
            this.f48008f = str5;
            this.f48009g = str6;
            this.f48010h = str7;
            this.f48011i = str8;
            this.f48012j = str9;
            this.f48013k = i9;
            this.f48014l = str10;
            this.f48015m = str11;
            this.f48016n = str12;
            this.f48017o = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Z.this.f47792A = String.valueOf(this.f48004a);
            Z.this.f47800I = this.f48005c;
            Z.this.f47835z = this.f48006d;
            Z.this.f47834y = this.f48007e;
            Z.this.f47832w = this.f48008f;
            Z.this.f47795D = this.f48009g;
            Z.this.f47796E = this.f48010h;
            Z.this.f47794C = this.f48011i;
            Z.this.f47793B = this.f48012j;
            Z.this.f47797F = this.f48013k;
            Z.this.f47798G = this.f48014l;
            Z.this.f47799H = this.f48015m;
            Z.this.f47833x = this.f48016n;
            AbstractC2237a.f44518l0 = this.f48017o;
            Z.this.f47807P = view;
            Z.this.u1();
        }
    }

    public class w implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48019a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48021d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48022e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48023f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48024g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48025h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48026i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48027j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f48028k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f48029l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f48030m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f48031n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f48032o;

        public w(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i9, String str10, String str11, String str12, int i10) {
            this.f48019a = str;
            this.f48020c = str2;
            this.f48021d = str3;
            this.f48022e = str4;
            this.f48023f = str5;
            this.f48024g = str6;
            this.f48025h = str7;
            this.f48026i = str8;
            this.f48027j = str9;
            this.f48028k = i9;
            this.f48029l = str10;
            this.f48030m = str11;
            this.f48031n = str12;
            this.f48032o = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Z.this.f47792A = String.valueOf(this.f48019a);
            Z.this.f47800I = this.f48020c;
            Z.this.f47835z = this.f48021d;
            Z.this.f47834y = this.f48022e;
            Z.this.f47832w = this.f48023f;
            Z.this.f47795D = this.f48024g;
            Z.this.f47796E = this.f48025h;
            Z.this.f47794C = this.f48026i;
            Z.this.f47793B = this.f48027j;
            Z.this.f47797F = this.f48028k;
            Z.this.f47798G = this.f48029l;
            Z.this.f47799H = this.f48030m;
            Z.this.f47833x = this.f48031n;
            AbstractC2237a.f44518l0 = this.f48032o;
            Z.this.f47807P = view;
            Z.this.u1();
        }
    }

    public class x implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ A f48034a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f48036d;

        public x(A a9, int i9, int i10) {
            this.f48034a = a9;
            this.f48035c = i9;
            this.f48036d = i10;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            try {
                Z z9 = Z.this;
                z9.w1(this.f48034a, this.f48035c, z9.f47814e, Z.this.f47817h, this.f48036d);
                return true;
            } catch (InterruptedException e9) {
                throw new RuntimeException(e9);
            }
        }
    }

    public class y implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ A f48038a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f48040d;

        public y(A a9, int i9, int i10) {
            this.f48038a = a9;
            this.f48039c = i9;
            this.f48040d = i10;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            try {
                Z z9 = Z.this;
                z9.w1(this.f48038a, this.f48039c, z9.f47814e, Z.this.f47817h, this.f48040d);
                return true;
            } catch (InterruptedException e9) {
                throw new RuntimeException(e9);
            }
        }
    }

    public class z implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ A f48042a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f48044d;

        public z(A a9, int i9, int i10) {
            this.f48042a = a9;
            this.f48043c = i9;
            this.f48044d = i10;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            try {
                Z z9 = Z.this;
                z9.w1(this.f48042a, this.f48043c, z9.f47814e, Z.this.f47817h, this.f48044d);
                return true;
            } catch (InterruptedException e9) {
                throw new RuntimeException(e9);
            }
        }
    }

    public Z(Context context, String str, int i9) {
        this.f47822m = "";
        C2612a c2612a = null;
        this.f47823n = new B(this, c2612a);
        this.f47824o = new C(this, c2612a);
        this.f47826q = "mobile";
        this.f47804M = -1;
        this.f47818i = context;
        this.f47820k = new DatabaseHandler(context);
        this.f47806O = new LiveStreamDBHandler(context);
        this.f47821l = AnimationUtils.loadAnimation(context, a7.b.f11823a);
        this.f47822m = str;
        this.f47804M = i9;
        this.f47827r = context.getSharedPreferences("loginPrefs", 0);
        this.f47828s = new n7.j(context, this);
        this.f47802K = new C2509z0(context);
        this.f47808Q = new n7.e(this, context);
        if (new C2858a(context).A().equals(AbstractC2237a.f44453K0)) {
            this.f47826q = "tv";
        } else {
            this.f47826q = "mobile";
        }
        if (this.f47826q.equals("mobile")) {
            try {
                this.f47825p = C2325b.e(context).c().c();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:61:0x00fc
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private void C1(org.json.JSONObject r12) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.Z.C1(org.json.JSONObject):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:61:0x0192
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private void D1(org.json.JSONObject r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.Z.D1(org.json.JSONObject, java.lang.String):void");
    }

    private void G1() {
        ProgressDialog progressDialog = new ProgressDialog(this.f47818i);
        this.f47801J = progressDialog;
        progressDialog.setCanceledOnTouchOutside(false);
        this.f47801J.setMessage(this.f47818i.getResources().getString(a7.j.f13392t5));
        this.f47801J.show();
    }

    private void n1(RecyclerView.D d9, int i9, ArrayList arrayList) {
        E e9 = (E) d9;
        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
        favouriteM3UModel.setUrl(((SeriesDBModel) arrayList.get(i9)).getUrl());
        favouriteM3UModel.setUserID(SharepreferenceDBHandler.getUserID(this.f47818i));
        favouriteM3UModel.setName(((SeriesDBModel) arrayList.get(i9)).getName());
        favouriteM3UModel.setCategoryID(((SeriesDBModel) arrayList.get(i9)).getCategoryId());
        this.f47806O.addToFavourite(favouriteM3UModel);
        e9.f47858y.startAnimation(this.f47821l);
        e9.f47858y.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p1(ArrayList arrayList, RecyclerView.D d9, int i9, ArrayList arrayList2) {
        if (arrayList.size() > 0) {
            z1(d9, i9, arrayList2);
        } else {
            n1(d9, i9, arrayList2);
        }
        this.f47803L = true;
        Context context = this.f47818i;
        if (context instanceof SeriesAllDataSingleActivity) {
            ((SeriesAllDataSingleActivity) context).t2();
        }
    }

    private void t1() {
        try {
            ProgressDialog progressDialog = this.f47801J;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f47801J.dismiss();
        } catch (Exception unused) {
        }
    }

    private void z1(RecyclerView.D d9, int i9, ArrayList arrayList) {
        this.f47806O.deleteFavourite(((SeriesDBModel) arrayList.get(i9)).getUrl(), SharepreferenceDBHandler.getUserID(this.f47818i));
        ((E) d9).f47858y.setVisibility(4);
    }

    public void A1() {
        this.f47803L = false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:53:0x017a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void B1(org.json.JSONObject r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.Z.B1(org.json.JSONObject, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x056f A[Catch: Exception -> 0x0363, TRY_ENTER, TryCatch #8 {Exception -> 0x0363, blocks: (B:68:0x033f, B:70:0x0343, B:72:0x0349, B:74:0x034d, B:76:0x035c, B:80:0x0369, B:82:0x036f, B:84:0x0376, B:86:0x037c, B:88:0x0385, B:90:0x038c, B:92:0x0395, B:94:0x039f, B:96:0x03a6, B:98:0x03ac, B:100:0x03b5, B:102:0x03bb, B:104:0x03c4, B:106:0x03ca, B:108:0x03d3, B:110:0x03d9, B:112:0x03e2, B:114:0x03e8, B:116:0x03f1, B:118:0x03f7, B:120:0x0400, B:122:0x0406, B:124:0x0410, B:125:0x0414, B:130:0x0429, B:132:0x042f, B:134:0x0438, B:136:0x043e, B:138:0x0447, B:140:0x044d, B:142:0x0456, B:144:0x045c, B:146:0x0465, B:148:0x046b, B:150:0x0474, B:152:0x047a, B:154:0x0487, B:156:0x048d, B:158:0x0496, B:160:0x04a6, B:163:0x04b4, B:165:0x04ba, B:167:0x04c2, B:168:0x04ca, B:170:0x04d1, B:177:0x0557, B:180:0x056f, B:182:0x0581, B:183:0x0584, B:199:0x05e0, B:184:0x0588, B:186:0x0590, B:192:0x05a7, B:193:0x05aa, B:194:0x05b0, B:195:0x05b4, B:197:0x05d1, B:198:0x05d9, B:176:0x0527, B:175:0x0523, B:174:0x04f4, B:169:0x04ce, B:161:0x04ad, B:128:0x0423, B:172:0x04d7), top: B:270:0x033f, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0590 A[Catch: Exception -> 0x0363, TRY_LEAVE, TryCatch #8 {Exception -> 0x0363, blocks: (B:68:0x033f, B:70:0x0343, B:72:0x0349, B:74:0x034d, B:76:0x035c, B:80:0x0369, B:82:0x036f, B:84:0x0376, B:86:0x037c, B:88:0x0385, B:90:0x038c, B:92:0x0395, B:94:0x039f, B:96:0x03a6, B:98:0x03ac, B:100:0x03b5, B:102:0x03bb, B:104:0x03c4, B:106:0x03ca, B:108:0x03d3, B:110:0x03d9, B:112:0x03e2, B:114:0x03e8, B:116:0x03f1, B:118:0x03f7, B:120:0x0400, B:122:0x0406, B:124:0x0410, B:125:0x0414, B:130:0x0429, B:132:0x042f, B:134:0x0438, B:136:0x043e, B:138:0x0447, B:140:0x044d, B:142:0x0456, B:144:0x045c, B:146:0x0465, B:148:0x046b, B:150:0x0474, B:152:0x047a, B:154:0x0487, B:156:0x048d, B:158:0x0496, B:160:0x04a6, B:163:0x04b4, B:165:0x04ba, B:167:0x04c2, B:168:0x04ca, B:170:0x04d1, B:177:0x0557, B:180:0x056f, B:182:0x0581, B:183:0x0584, B:199:0x05e0, B:184:0x0588, B:186:0x0590, B:192:0x05a7, B:193:0x05aa, B:194:0x05b0, B:195:0x05b4, B:197:0x05d1, B:198:0x05d9, B:176:0x0527, B:175:0x0523, B:174:0x04f4, B:169:0x04ce, B:161:0x04ad, B:128:0x0423, B:172:0x04d7), top: B:270:0x033f, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x070f A[Catch: Exception -> 0x0724, TryCatch #4 {Exception -> 0x0724, blocks: (B:203:0x0705, B:205:0x070f, B:207:0x071d, B:209:0x0721, B:212:0x0727, B:214:0x072b, B:216:0x0731, B:220:0x0744, B:222:0x0748, B:224:0x074c, B:226:0x0750, B:227:0x0755, B:229:0x0766, B:231:0x076a, B:233:0x0770, B:235:0x0778, B:237:0x077c, B:238:0x07a2, B:239:0x07a6, B:240:0x07ce, B:245:0x07da, B:247:0x07ea, B:249:0x07f0, B:251:0x07f4, B:252:0x07fc), top: B:264:0x0705 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0748 A[Catch: Exception -> 0x0724, TryCatch #4 {Exception -> 0x0724, blocks: (B:203:0x0705, B:205:0x070f, B:207:0x071d, B:209:0x0721, B:212:0x0727, B:214:0x072b, B:216:0x0731, B:220:0x0744, B:222:0x0748, B:224:0x074c, B:226:0x0750, B:227:0x0755, B:229:0x0766, B:231:0x076a, B:233:0x0770, B:235:0x0778, B:237:0x077c, B:238:0x07a2, B:239:0x07a6, B:240:0x07ce, B:245:0x07da, B:247:0x07ea, B:249:0x07f0, B:251:0x07f4, B:252:0x07fc), top: B:264:0x0705 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x07ea A[Catch: Exception -> 0x0724, TryCatch #4 {Exception -> 0x0724, blocks: (B:203:0x0705, B:205:0x070f, B:207:0x071d, B:209:0x0721, B:212:0x0727, B:214:0x072b, B:216:0x0731, B:220:0x0744, B:222:0x0748, B:224:0x074c, B:226:0x0750, B:227:0x0755, B:229:0x0766, B:231:0x076a, B:233:0x0770, B:235:0x0778, B:237:0x077c, B:238:0x07a2, B:239:0x07a6, B:240:0x07ce, B:245:0x07da, B:247:0x07ea, B:249:0x07f0, B:251:0x07f4, B:252:0x07fc), top: B:264:0x0705 }] */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021f A[Catch: Exception -> 0x0134, TryCatch #6 {Exception -> 0x0134, blocks: (B:5:0x002c, B:7:0x0030, B:9:0x0036, B:11:0x003a, B:13:0x012e, B:31:0x0165, B:32:0x016f, B:39:0x01f3, B:41:0x021f, B:43:0x022b, B:47:0x02cd, B:49:0x02eb, B:51:0x02ef, B:56:0x0305, B:58:0x0315, B:60:0x031b, B:62:0x031f, B:63:0x0327, B:42:0x0225, B:38:0x01c4, B:37:0x01c0, B:36:0x0192, B:24:0x0151, B:16:0x0137, B:34:0x0175), top: B:267:0x002c, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0225 A[Catch: Exception -> 0x0134, TryCatch #6 {Exception -> 0x0134, blocks: (B:5:0x002c, B:7:0x0030, B:9:0x0036, B:11:0x003a, B:13:0x012e, B:31:0x0165, B:32:0x016f, B:39:0x01f3, B:41:0x021f, B:43:0x022b, B:47:0x02cd, B:49:0x02eb, B:51:0x02ef, B:56:0x0305, B:58:0x0315, B:60:0x031b, B:62:0x031f, B:63:0x0327, B:42:0x0225, B:38:0x01c4, B:37:0x01c0, B:36:0x0192, B:24:0x0151, B:16:0x0137, B:34:0x0175), top: B:267:0x002c, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0315 A[Catch: Exception -> 0x0134, TryCatch #6 {Exception -> 0x0134, blocks: (B:5:0x002c, B:7:0x0030, B:9:0x0036, B:11:0x003a, B:13:0x012e, B:31:0x0165, B:32:0x016f, B:39:0x01f3, B:41:0x021f, B:43:0x022b, B:47:0x02cd, B:49:0x02eb, B:51:0x02ef, B:56:0x0305, B:58:0x0315, B:60:0x031b, B:62:0x031f, B:63:0x0327, B:42:0x0225, B:38:0x01c4, B:37:0x01c0, B:36:0x0192, B:24:0x0151, B:16:0x0137, B:34:0x0175), top: B:267:0x002c, inners: #10 }] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [boolean, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(androidx.recyclerview.widget.RecyclerView.D r55, int r56) {
        /*
            Method dump skipped, instruction units count: 2054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.Z.E(androidx.recyclerview.widget.RecyclerView$D, int):void");
    }

    public void E1(m7.c cVar) {
    }

    @Override // z7.g
    public void F(StalkerGetSeriesCategoriesCallback stalkerGetSeriesCategoriesCallback) {
    }

    public void F1() {
        this.f47813d = SeriesAllCategoriesSingleton.getInstance().getSeriesList();
        this.f47814e = SeriesAllCategoriesSingleton.getInstance().getSeriesList();
    }

    @Override // z7.g
    public void G(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, E e9, int i9) {
        if (stalkerSetLiveFavCallback != null) {
            try {
                if (stalkerSetLiveFavCallback.getJs() == null || !stalkerSetLiveFavCallback.getJs().equals(Boolean.TRUE)) {
                    return;
                }
                String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f47818i);
                String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(this.f47818i);
                this.f47809R = e9;
                this.f47810S = "add";
                this.f47808Q.f(loggedInMacAddress, stalkerToken, i9);
            } catch (Exception unused) {
                m7.w.X();
            }
        }
    }

    @Override // z7.g
    public void G0(StalkerTokenCallback stalkerTokenCallback) {
    }

    @Override // z7.g
    public void H(String str) {
    }

    public final void H1(String str, String str2, String str3, int i9, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i10, int i11, String str17, String str18) {
        if (this.f47818i != null) {
            Intent intent = new Intent(this.f47818i, (Class<?>) SeriesDetailActivity.class);
            intent.putExtra("series_num", str);
            intent.putExtra("series_name", str2);
            intent.putExtra("series_streamType", str3);
            intent.putExtra("series_seriesID", SharepreferenceDBHandler.getCurrentAPPType(this.f47818i).equals("onestream_api") ? str18 : String.valueOf(i9));
            intent.putExtra("series_cover", str4);
            intent.putExtra("series_plot", str5);
            intent.putExtra("series_cast", str6);
            intent.putExtra("series_director", str7);
            intent.putExtra("series_genre", str8);
            intent.putExtra("series_releaseDate", str9);
            intent.putExtra("series_last_modified", str10);
            intent.putExtra("series_rating", str11);
            intent.putExtra("series_categoryId", str12);
            intent.putExtra("series_youtube_trailer", str13);
            intent.putExtra("series_backdrop", str14);
            intent.putExtra("series_fav", i11);
            intent.putExtra("series_cmd", str17);
            AbstractC2237a.f44518l0 = i10;
            this.f47818i.startActivity(intent);
        }
    }

    @Override // z7.g
    public void I(m0.x xVar, int i9) {
    }

    @Override // z7.m
    public void I0(JsonElement jsonElement) {
        if (jsonElement != null) {
            try {
                JSONObject jSONObject = new JSONObject(jsonElement.toString());
                String string = jSONObject.getString("seasons");
                String string2 = jSONObject.getString("episodes");
                if (!string.equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("seasons");
                        int length = jSONArray.length();
                        this.f47829t.clear();
                        for (int i9 = 0; i9 < length; i9++) {
                            if (jSONArray.get(i9) instanceof JSONObject) {
                                B1((JSONObject) jSONArray.get(i9), String.valueOf(i9));
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("seasons");
                        Iterator<String> itKeys = jSONObject2.keys();
                        this.f47830u.clear();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (jSONObject2.get(next) instanceof JSONObject) {
                                B1(jSONObject2, next);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (!string2.equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("episodes");
                        int length2 = jSONArray2.length();
                        this.f47829t.clear();
                        for (int i10 = 0; i10 < length2; i10++) {
                            if (jSONArray2.get(i10) instanceof JSONArray) {
                                JSONArray jSONArray3 = new JSONArray(jSONArray2.get(i10).toString());
                                r1(jSONArray3, jSONArray3.length());
                            }
                        }
                    } catch (Exception unused3) {
                    }
                    JSONObject jSONObject3 = jSONObject.getJSONObject("episodes");
                    this.f47829t.clear();
                    Iterator<String> itKeys2 = jSONObject3.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        if (jSONObject3.get(next2) instanceof JSONArray) {
                            JSONArray jSONArray4 = new JSONArray(jSONObject3.get(next2).toString());
                            r1(jSONArray4, jSONArray4.length());
                        }
                    }
                }
            } catch (Exception unused4) {
            }
        }
        ArrayList arrayList = this.f47829t;
        if (arrayList != null && arrayList.size() != 0) {
            EpisodesUsingSinglton.getInstance().setEpisodeList(this.f47829t);
            this.f47805N.clear();
            for (int i11 = 0; i11 < this.f47829t.size(); i11++) {
                if (((GetEpisdoeDetailsCallback) this.f47829t.get(i11)).getSeasonNumber().equals(Integer.valueOf(this.f47797F))) {
                    this.f47805N.add((GetEpisdoeDetailsCallback) this.f47829t.get(i11));
                }
            }
            ArrayList arrayList2 = this.f47805N;
            if (arrayList2 != null && arrayList2.size() > 0) {
                EpisodesUsingSinglton.getInstance().setCurrentSeasonEpisodeList(this.f47805N);
            }
        }
        t1();
        if (this.f47826q.equals("mobile")) {
            try {
                this.f47825p = C2325b.e(this.f47818i).c().c();
            } catch (Exception unused5) {
            }
        }
        C2328e c2328e = this.f47825p;
        if (c2328e != null && c2328e.c()) {
            String str = this.f47818i.getResources().getString(a7.j.f13040J6) + " - " + this.f47797F;
            String strU = SharepreferenceDBHandler.getCurrentAPPType(this.f47818i).equals("onestream_api") ? this.f47796E : m7.w.U(this.f47818i, m7.w.r0(this.f47795D), this.f47793B, "series");
            C2328e c2328e2 = this.f47825p;
            if (((c2328e2 == null || c2328e2.r() == null || this.f47825p.r().j() == null || this.f47825p.r().j().J() == null) ? "" : this.f47825p.r().j().J()).equals(strU)) {
                this.f47818i.startActivity(new Intent(this.f47818i, (Class<?>) ExpandedControlsActivity.class));
                return;
            } else {
                AbstractC1902a.c(m7.w.r0(this.f47799H), true, AbstractC1902a.a(this.f47794C, str, "", 0, strU, "videos/mp4", this.f47798G, "", null), this.f47825p, this.f47818i);
                return;
            }
        }
        new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        k.U u9 = new k.U(this.f47818i, this.f47807P);
        u9.c().inflate(a7.h.f12930m, u9.b());
        ArrayList<ExternalPlayerModelClass> externalPlayer = new ExternalPlayerDataBase(this.f47818i).getExternalPlayer();
        if (externalPlayer != null) {
            try {
                if (externalPlayer.size() > 0) {
                    u9.b().add(0, 0, 0, this.f47818i.getResources().getString(a7.j.f13155V3));
                    ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                    externalPlayerModelClass.setId(0);
                    externalPlayerModelClass.setAppname(this.f47818i.getResources().getString(a7.j.f13272h5));
                    arrayList3.add(externalPlayerModelClass);
                    int i12 = 0;
                    while (i12 < externalPlayer.size()) {
                        int i13 = i12 + 1;
                        u9.b().add(0, i13, 0, this.f47818i.getResources().getString(a7.j.f13272h5) + " " + externalPlayer.get(i12).getAppname());
                        arrayList3.add(externalPlayer.get(i12));
                        i12 = i13;
                    }
                    u9.f(new q(arrayList3));
                    u9.e(new r());
                    u9.g();
                    return;
                }
            } catch (Exception unused6) {
                return;
            }
        }
        m7.w.v0(this.f47818i, "", m7.w.r0(this.f47795D), "series", this.f47793B, "0", this.f47794C, null, "", "", "");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public RecyclerView.D L(ViewGroup viewGroup, int i9) {
        return i9 == 1 ? new A(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12917z4, viewGroup, false)) : new E(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12911y4, viewGroup, false));
    }

    @Override // z7.g
    public void M(StalkerGetAdCallback stalkerGetAdCallback, int i9) {
        try {
            m7.w.X();
            String str = this.f47810S;
            if (str == null || !str.equals("add")) {
                this.f47809R.f47858y.setVisibility(4);
                try {
                    ArrayList arrayList = this.f47814e;
                    if (arrayList != null && arrayList.size() > 0 && this.f47814e.get(i9) != null) {
                        ((SeriesDBModel) this.f47814e.get(i9)).setFav(0);
                        ((SeriesAllDataSingleActivity) this.f47818i).o2(((SeriesDBModel) this.f47814e.get(i9)).getseriesID(), this.f47810S);
                    }
                } catch (Exception e9) {
                    e = e9;
                    e.printStackTrace();
                }
            } else {
                this.f47809R.f47858y.startAnimation(this.f47821l);
                this.f47809R.f47858y.setVisibility(0);
                try {
                    ArrayList arrayList2 = this.f47814e;
                    if (arrayList2 != null && arrayList2.size() > 0 && this.f47814e.get(i9) != null) {
                        ((SeriesDBModel) this.f47814e.get(i9)).setFav(1);
                        ((SeriesAllDataSingleActivity) this.f47818i).o2(((SeriesDBModel) this.f47814e.get(i9)).getseriesID(), this.f47810S);
                    }
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // z7.g
    public void O(E e9, int i9) {
        try {
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f47818i);
            String loggedInMacAddress = SharepreferenceDBHandler.getLoggedInMacAddress(this.f47818i);
            this.f47809R = e9;
            this.f47810S = "remove";
            this.f47808Q.f(loggedInMacAddress, stalkerToken, i9);
        } catch (Exception unused) {
            m7.w.X();
        }
    }

    @Override // z7.g
    public void P0(String str) {
    }

    @Override // z7.m
    public void R(JsonElement jsonElement) {
        if (jsonElement != null) {
            try {
                JSONObject jSONObject = new JSONObject(jsonElement.toString());
                String string = jSONObject.getString("seasons");
                String string2 = jSONObject.getString("episodes");
                try {
                    JSONArray jSONArray = jSONObject.getJSONObject("info").getJSONArray("backdrop_path") != null ? jSONObject.getJSONObject("info").getJSONArray("backdrop_path") : null;
                    if (jSONArray != null && jSONArray.length() > 0) {
                        String string3 = jSONArray.get(new Random().nextInt(jSONArray.length())).toString();
                        if (this.f47818i != null && !string3.isEmpty()) {
                            com.squareup.picasso.t.q(this.f47818i).l(string3).i(new n());
                        }
                    }
                } catch (Exception unused) {
                }
                if (!string.equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("seasons");
                        int length = jSONArray2.length();
                        this.f47830u.clear();
                        for (int i9 = 0; i9 < length; i9++) {
                            if (jSONArray2.get(i9) instanceof JSONObject) {
                                C1((JSONObject) jSONArray2.get(i9));
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("seasons");
                        Iterator<String> itKeys = jSONObject2.keys();
                        this.f47830u.clear();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (jSONObject2.get(next) instanceof JSONObject) {
                                D1(jSONObject2, next);
                            }
                        }
                    } catch (Exception unused3) {
                    }
                }
                if (!string2.equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                    try {
                        JSONArray jSONArray3 = jSONObject.getJSONArray("episodes");
                        int length2 = jSONArray3.length();
                        this.f47829t.clear();
                        for (int i10 = 0; i10 < length2; i10++) {
                            if (jSONArray3.get(i10) instanceof JSONArray) {
                                JSONArray jSONArray4 = new JSONArray(jSONArray3.get(i10).toString());
                                r1(jSONArray4, jSONArray4.length());
                            }
                        }
                    } catch (Exception unused4) {
                    }
                    JSONObject jSONObject3 = jSONObject.getJSONObject("episodes");
                    this.f47829t.clear();
                    Iterator<String> itKeys2 = jSONObject3.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        if (jSONObject3.get(next2) instanceof JSONArray) {
                            JSONArray jSONArray5 = new JSONArray(jSONObject3.get(next2).toString());
                            r1(jSONArray5, jSONArray5.length());
                        }
                    }
                }
            } catch (Exception unused5) {
            }
        }
        ArrayList arrayList = this.f47829t;
        if (arrayList != null && arrayList.size() != 0) {
            EpisodesUsingSinglton.getInstance().setEpisodeList(this.f47829t);
            this.f47805N.clear();
            for (int i11 = 0; i11 < this.f47829t.size(); i11++) {
                if (((GetEpisdoeDetailsCallback) this.f47829t.get(i11)).getSeasonNumber().equals(Integer.valueOf(this.f47797F))) {
                    this.f47805N.add((GetEpisdoeDetailsCallback) this.f47829t.get(i11));
                }
            }
            ArrayList arrayList2 = this.f47805N;
            if (arrayList2 != null && arrayList2.size() > 0) {
                EpisodesUsingSinglton.getInstance().setCurrentSeasonEpisodeList(this.f47805N);
            }
        }
        t1();
        if (this.f47826q.equals("mobile")) {
            try {
                this.f47825p = C2325b.e(this.f47818i).c().c();
            } catch (Exception unused6) {
            }
        }
        C2328e c2328e = this.f47825p;
        if (c2328e != null && c2328e.c()) {
            String str = this.f47818i.getResources().getString(a7.j.f13040J6) + " - " + this.f47797F;
            String strU = m7.w.U(this.f47818i, m7.w.r0(this.f47795D), this.f47793B, "series");
            C2328e c2328e2 = this.f47825p;
            if (((c2328e2 == null || c2328e2.r() == null || this.f47825p.r().j() == null || this.f47825p.r().j().J() == null) ? "" : this.f47825p.r().j().J()).equals(strU)) {
                this.f47818i.startActivity(new Intent(this.f47818i, (Class<?>) ExpandedControlsActivity.class));
                return;
            } else {
                AbstractC1902a.c(m7.w.r0(this.f47799H), true, AbstractC1902a.a(this.f47794C, str, "", 0, strU, "videos/mp4", this.f47798G, "", null), this.f47825p, this.f47818i);
                return;
            }
        }
        new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        k.U u9 = new k.U(this.f47818i, this.f47807P);
        u9.c().inflate(a7.h.f12930m, u9.b());
        ArrayList<ExternalPlayerModelClass> externalPlayer = new ExternalPlayerDataBase(this.f47818i).getExternalPlayer();
        if (externalPlayer != null) {
            try {
                if (externalPlayer.size() > 0) {
                    u9.b().add(0, 0, 0, this.f47818i.getResources().getString(a7.j.f13155V3));
                    ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                    externalPlayerModelClass.setId(0);
                    externalPlayerModelClass.setAppname(this.f47818i.getResources().getString(a7.j.f13272h5));
                    arrayList3.add(externalPlayerModelClass);
                    int i12 = 0;
                    while (i12 < externalPlayer.size()) {
                        int i13 = i12 + 1;
                        u9.b().add(0, i13, 0, this.f47818i.getResources().getString(a7.j.f13272h5) + " " + externalPlayer.get(i12).getAppname());
                        arrayList3.add(externalPlayer.get(i12));
                        i12 = i13;
                    }
                    u9.f(new o(arrayList3));
                    u9.e(new p());
                    u9.g();
                    return;
                }
            } catch (Exception unused7) {
                return;
            }
        }
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f47818i).equals("onestream_api")) {
            m7.w.v0(this.f47818i, "", 0, "series", this.f47793B, "0", this.f47794C, null, this.f47800I, this.f47795D, "");
        } else {
            m7.w.v0(this.f47818i, "", m7.w.r0(this.f47795D), "series", this.f47793B, "0", this.f47794C, null, "", "", "");
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

    @Override // z7.m
    public void a0(String str) {
    }

    @Override // z7.b
    public void b() {
        t1();
    }

    @Override // z7.g
    public void c(String str) {
    }

    @Override // z7.b
    public void d(String str) {
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
        return this.f47822m.equals("continue_watching") ? this.f47824o : this.f47823n;
    }

    @Override // z7.g
    public void i(StalkerGetAllChannelsCallback stalkerGetAllChannelsCallback) {
    }

    @Override // z7.g
    public void j(StalkerGetVodCategoriesCallback stalkerGetVodCategoriesCallback) {
    }

    public final void l1(int i9, E e9, int i10) {
        try {
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f47818i);
            this.f47808Q.d(SharepreferenceDBHandler.getLoggedInMacAddress(this.f47818i), stalkerToken, e9, String.valueOf(i9), i10);
        } catch (Exception unused) {
            m7.w.X();
        }
    }

    public final void m1(RecyclerView.D d9, int i9, ArrayList arrayList, List list, int i10) {
        ImageView imageView;
        if (i10 == 1) {
            A a9 = (A) d9;
            FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
            favouriteDBModel.setCategoryID(((GetEpisdoeDetailsCallback) list.get(i9)).getCategoryId());
            favouriteDBModel.setStreamID(m7.w.r0(((GetEpisdoeDetailsCallback) list.get(i9)).getSeriesId()));
            favouriteDBModel.setStreamIDOneStream(((GetEpisdoeDetailsCallback) list.get(i9)).getSeriesId());
            favouriteDBModel.setName(((GetEpisdoeDetailsCallback) list.get(i9)).getTitle());
            favouriteDBModel.setNum(((GetEpisdoeDetailsCallback) list.get(i9)).getSeriesNum());
            favouriteDBModel.setUserID(SharepreferenceDBHandler.getUserID(this.f47818i));
            this.f47820k.addToFavourite(favouriteDBModel, "series");
            a9.f47844y.startAnimation(this.f47821l);
            imageView = a9.f47844y;
        } else {
            E e9 = (E) d9;
            FavouriteDBModel favouriteDBModel2 = new FavouriteDBModel();
            favouriteDBModel2.setCategoryID(((SeriesDBModel) arrayList.get(i9)).getCategoryId());
            favouriteDBModel2.setStreamID(((SeriesDBModel) arrayList.get(i9)).getseriesID());
            favouriteDBModel2.setStreamIDOneStream(((SeriesDBModel) arrayList.get(i9)).getOneStreamseriesID());
            favouriteDBModel2.setName(((SeriesDBModel) arrayList.get(i9)).getName());
            favouriteDBModel2.setNum(((SeriesDBModel) arrayList.get(i9)).getNum());
            favouriteDBModel2.setUserID(SharepreferenceDBHandler.getUserID(this.f47818i));
            this.f47820k.addToFavourite(favouriteDBModel2, "series");
            e9.f47858y.startAnimation(this.f47821l);
            imageView = e9.f47858y;
        }
        imageView.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        if (this.f47822m.equals("continue_watching")) {
            List list = this.f47817h;
            if (list == null || list.size() <= 0) {
                return 0;
            }
            return this.f47817h.size();
        }
        ArrayList arrayList = this.f47814e;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        return this.f47814e.size();
    }

    @Override // z7.g
    public void o0(String str) {
        try {
            m7.w.X();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void o1(ArrayList arrayList, RecyclerView.D d9, int i9, ArrayList arrayList2, List list, int i10, RelativeLayout relativeLayout) {
        if (arrayList.size() > 0) {
            y1(d9, i9, arrayList2, list, i10);
        } else {
            m1(d9, i9, arrayList2, list, i10);
        }
        this.f47803L = true;
        Context context = this.f47818i;
        if (context instanceof SeriesAllDataSingleActivity) {
            ((SeriesAllDataSingleActivity) context).t2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int p(int i9) {
        return this.f47822m.equals("continue_watching") ? 1 : 0;
    }

    @Override // z7.g
    public void q(StalkerGetVODByCatCallback stalkerGetVODByCatCallback) {
    }

    public boolean q1() {
        return this.f47803L;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:128|5|6|(1:11)(1:10)|12|(1:14)(1:16)|15|17|(1:22)(1:21)|23|(1:28)(1:27)|29|(1:34)(1:33)|35|(1:40)(1:39)|41|(1:46)(1:45)|47|(1:53)(1:51)|52|54|(1:56)|(3:120|57|(1:62)(1:61))|(3:132|65|(1:70)(1:69))|(2:130|73)|(15:75|76|126|77|(1:79)|118|85|(11:87|88|124|89|(1:91)|116|97|(7:99|100|122|101|(1:103)|109|110)(1:105)|106|109|110)(1:93)|94|116|97|(0)(0)|106|109|110)(1:81)|82|118|85|(0)(0)|94|116|97|(0)(0)|106|109|110) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01df, code lost:
    
        r17 = r4;
        r4 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01af, code lost:
    
        r18 = r4;
        r4 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0195 A[Catch: Exception -> 0x01af, TRY_LEAVE, TryCatch #1 {Exception -> 0x01af, blocks: (B:85:0x018f, B:87:0x0195), top: B:118:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c5 A[Catch: Exception -> 0x01df, TRY_LEAVE, TryCatch #0 {Exception -> 0x01df, blocks: (B:97:0x01bf, B:99:0x01c5), top: B:116:0x01bf }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r1(org.json.JSONArray r22, int r23) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.Z.r1(org.json.JSONArray, int):void");
    }

    public int s1() {
        return this.f47804M;
    }

    public final void u1() {
        String string = this.f47827r.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String string2 = this.f47827r.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        if (string == null || string2 == null || string.isEmpty() || string2.isEmpty()) {
            return;
        }
        G1();
        if (!SharepreferenceDBHandler.getCurrentAPPType(this.f47818i).equals("onestream_api")) {
            this.f47828s.b(string, string2, String.valueOf(this.f47792A));
        } else {
            this.f47828s.c(this.f47792A, SharepreferenceDBHandler.getOneStreamToken(this.f47818i));
        }
    }

    @Override // z7.g
    public void v0(String str) {
        try {
            m7.w.X();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void v1(String str, String str2, String str3, View view) {
        this.f47794C = str2;
        this.f47798G = str3;
        if (this.f47826q.equals("mobile")) {
            try {
                this.f47825p = C2325b.e(this.f47818i).c().c();
            } catch (Exception unused) {
            }
        }
        C2328e c2328e = this.f47825p;
        if (c2328e != null && c2328e.c()) {
            C2328e c2328e2 = this.f47825p;
            if (((c2328e2 == null || c2328e2.r() == null || this.f47825p.r().j() == null || this.f47825p.r().j().J() == null) ? "" : this.f47825p.r().j().J()).contains(str)) {
                this.f47818i.startActivity(new Intent(this.f47818i, (Class<?>) ExpandedControlsActivity.class));
                return;
            } else {
                AbstractC1902a.c(0, true, AbstractC1902a.a(this.f47794C, "", "", 0, str, "videos/mp4", this.f47798G, "", null), this.f47825p, this.f47818i);
                return;
            }
        }
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        k.U u9 = new k.U(this.f47818i, view);
        u9.c().inflate(a7.h.f12930m, u9.b());
        ArrayList<ExternalPlayerModelClass> externalPlayer = new ExternalPlayerDataBase(this.f47818i).getExternalPlayer();
        if (externalPlayer != null) {
            try {
                if (externalPlayer.size() > 0) {
                    u9.b().add(0, 0, 0, this.f47818i.getResources().getString(a7.j.f13155V3));
                    ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                    externalPlayerModelClass.setId(0);
                    externalPlayerModelClass.setAppname(this.f47818i.getResources().getString(a7.j.f13272h5));
                    arrayList.add(externalPlayerModelClass);
                    int i9 = 0;
                    while (i9 < externalPlayer.size()) {
                        int i10 = i9 + 1;
                        u9.b().add(0, i10, 0, this.f47818i.getResources().getString(a7.j.f13272h5) + " " + externalPlayer.get(i9).getAppname());
                        arrayList.add(externalPlayer.get(i9));
                        i9 = i10;
                    }
                    u9.f(new k(arrayList, str));
                    u9.e(new l());
                    u9.g();
                    return;
                }
            } catch (Exception unused2) {
                return;
            }
        }
        m7.w.v0(this.f47818i, "", 0, "series", this.f47793B, "0", this.f47794C, null, str, "", "");
    }

    public final void w1(RecyclerView.D d9, int i9, ArrayList arrayList, List list, int i10) {
        if (i10 == 1) {
            k.U u9 = new k.U(this.f47818i, ((A) d9).f47843x);
            u9.d(a7.h.f12926i);
            if (this.f47820k.checkFavourite(m7.w.r0(((GetEpisdoeDetailsCallback) list.get(i9)).getSeriesId()), ((GetEpisdoeDetailsCallback) list.get(i9)).getCategoryId(), "series", SharepreferenceDBHandler.getUserID(this.f47818i), ((GetEpisdoeDetailsCallback) list.get(i9)).getSeriesId()).size() > 0) {
                u9.b().getItem(0).setVisible(false);
                u9.b().getItem(1).setVisible(true);
            } else {
                u9.b().getItem(0).setVisible(true);
                u9.b().getItem(1).setVisible(false);
            }
            u9.f(new m(d9, i9, arrayList, list, i10));
            u9.g();
        }
    }

    public final void x1(int i9, E e9, int i10) {
        try {
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f47818i);
            this.f47808Q.r(SharepreferenceDBHandler.getLoggedInMacAddress(this.f47818i), stalkerToken, e9, String.valueOf(i9), i10);
        } catch (Exception unused) {
            m7.w.X();
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

    public final void y1(RecyclerView.D d9, int i9, ArrayList arrayList, List list, int i10) {
        ImageView imageView;
        if (i10 == 1) {
            this.f47820k.deleteFavourite(m7.w.r0(((GetEpisdoeDetailsCallback) list.get(i9)).getSeriesId()), ((GetEpisdoeDetailsCallback) list.get(i9)).getCategoryId(), "series", ((GetEpisdoeDetailsCallback) list.get(i9)).getSeriesName(), SharepreferenceDBHandler.getUserID(this.f47818i), ((GetEpisdoeDetailsCallback) list.get(i9)).getSeriesId());
            imageView = ((A) d9).f47844y;
        } else {
            this.f47820k.deleteFavourite(((SeriesDBModel) arrayList.get(i9)).getseriesID(), ((SeriesDBModel) arrayList.get(i9)).getCategoryId(), "series", ((SeriesDBModel) arrayList.get(i9)).getName(), SharepreferenceDBHandler.getUserID(this.f47818i), ((SeriesDBModel) arrayList.get(i9)).getOneStreamseriesID());
            imageView = ((E) d9).f47858y;
        }
        imageView.setVisibility(4);
    }
}
