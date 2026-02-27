package q7;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.callback.SeriesDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.SeriesDetailActivity;
import java.util.ArrayList;
import java.util.List;
import k.U;
import m7.AbstractC2237a;

/* JADX INFO: loaded from: classes4.dex */
public class V extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f47487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f47488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f47489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f47490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f47491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatabaseHandler f47492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SharedPreferences f47493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SharedPreferences.Editor f47494k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Boolean f47495l = Boolean.FALSE;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47496a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f47499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47500f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47501g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f47502h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f47503i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f47504j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f47505k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f47506l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f47507m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f47508n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f47509o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f47510p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f47511q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f47512r;

        public a(String str, String str2, String str3, int i9, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
            this.f47496a = str;
            this.f47497c = str2;
            this.f47498d = str3;
            this.f47499e = i9;
            this.f47500f = str4;
            this.f47501g = str5;
            this.f47502h = str6;
            this.f47503i = str7;
            this.f47504j = str8;
            this.f47505k = str9;
            this.f47506l = str10;
            this.f47507m = str11;
            this.f47508n = str12;
            this.f47509o = str13;
            this.f47510p = str14;
            this.f47511q = str15;
            this.f47512r = str16;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            V.this.q0(this.f47496a, this.f47497c, this.f47498d, this.f47499e, this.f47500f, this.f47501g, this.f47502h, this.f47503i, this.f47504j, this.f47505k, this.f47506l, this.f47507m, this.f47508n, this.f47509o, this.f47510p, this.f47511q, this.f47512r);
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47514a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f47517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47519g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f47520h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f47521i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f47522j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f47523k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f47524l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f47525m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f47526n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f47527o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f47528p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f47529q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f47530r;

        public b(String str, String str2, String str3, int i9, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
            this.f47514a = str;
            this.f47515c = str2;
            this.f47516d = str3;
            this.f47517e = i9;
            this.f47518f = str4;
            this.f47519g = str5;
            this.f47520h = str6;
            this.f47521i = str7;
            this.f47522j = str8;
            this.f47523k = str9;
            this.f47524l = str10;
            this.f47525m = str11;
            this.f47526n = str12;
            this.f47527o = str13;
            this.f47528p = str14;
            this.f47529q = str15;
            this.f47530r = str16;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            V.this.q0(this.f47514a, this.f47515c, this.f47516d, this.f47517e, this.f47518f, this.f47519g, this.f47520h, this.f47521i, this.f47522j, this.f47523k, this.f47524l, this.f47525m, this.f47526n, this.f47527o, this.f47528p, this.f47529q, this.f47530r);
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47532a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f47535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47536f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47537g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f47538h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f47539i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f47540j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f47541k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f47542l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f47543m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f47544n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f47545o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f47546p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f47547q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f47548r;

        public c(String str, String str2, String str3, int i9, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
            this.f47532a = str;
            this.f47533c = str2;
            this.f47534d = str3;
            this.f47535e = i9;
            this.f47536f = str4;
            this.f47537g = str5;
            this.f47538h = str6;
            this.f47539i = str7;
            this.f47540j = str8;
            this.f47541k = str9;
            this.f47542l = str10;
            this.f47543m = str11;
            this.f47544n = str12;
            this.f47545o = str13;
            this.f47546p = str14;
            this.f47547q = str15;
            this.f47548r = str16;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            V.this.q0(this.f47532a, this.f47533c, this.f47534d, this.f47535e, this.f47536f, this.f47537g, this.f47538h, this.f47539i, this.f47540j, this.f47541k, this.f47542l, this.f47543m, this.f47544n, this.f47545o, this.f47546p, this.f47547q, this.f47548r);
        }
    }

    public class d implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f47550a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f47551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f47553e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47554f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47555g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f47556h;

        public d(i iVar, int i9, String str, String str2, String str3, String str4, String str5) {
            this.f47550a = iVar;
            this.f47551c = i9;
            this.f47552d = str;
            this.f47553e = str2;
            this.f47554f = str3;
            this.f47555g = str4;
            this.f47556h = str5;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            V.this.p0(this.f47550a, this.f47551c, this.f47552d, this.f47553e, this.f47554f, this.f47555g, this.f47556h);
            return true;
        }
    }

    public class e implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f47558a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f47559c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47560d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f47561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47562f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47563g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f47564h;

        public e(i iVar, int i9, String str, String str2, String str3, String str4, String str5) {
            this.f47558a = iVar;
            this.f47559c = i9;
            this.f47560d = str;
            this.f47561e = str2;
            this.f47562f = str3;
            this.f47563g = str4;
            this.f47564h = str5;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            V.this.p0(this.f47558a, this.f47559c, this.f47560d, this.f47561e, this.f47562f, this.f47563g, this.f47564h);
            return true;
        }
    }

    public class f implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f47566a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f47567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f47569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47570f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47571g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f47572h;

        public f(i iVar, int i9, String str, String str2, String str3, String str4, String str5) {
            this.f47566a = iVar;
            this.f47567c = i9;
            this.f47568d = str;
            this.f47569e = str2;
            this.f47570f = str3;
            this.f47571g = str4;
            this.f47572h = str5;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            V.this.p0(this.f47566a, this.f47567c, this.f47568d, this.f47569e, this.f47570f, this.f47571g, this.f47572h);
            return true;
        }
    }

    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47574a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47576d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f47577e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47578f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47579g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f47580h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f47581i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f47582j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f47583k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f47584l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f47585m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f47586n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f47587o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f47588p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f47589q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f47590r;

        public g(String str, String str2, String str3, int i9, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
            this.f47574a = str;
            this.f47575c = str2;
            this.f47576d = str3;
            this.f47577e = i9;
            this.f47578f = str4;
            this.f47579g = str5;
            this.f47580h = str6;
            this.f47581i = str7;
            this.f47582j = str8;
            this.f47583k = str9;
            this.f47584l = str10;
            this.f47585m = str11;
            this.f47586n = str12;
            this.f47587o = str13;
            this.f47588p = str14;
            this.f47589q = str15;
            this.f47590r = str16;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            V.this.q0(this.f47574a, this.f47575c, this.f47576d, this.f47577e, this.f47578f, this.f47579g, this.f47580h, this.f47581i, this.f47582j, this.f47583k, this.f47584l, this.f47585m, this.f47586n, this.f47587o, this.f47588p, this.f47589q, this.f47590r);
        }
    }

    public class h implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f47592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f47593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f47594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47595d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f47596e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47597f;

        public h(i iVar, String str, int i9, String str2, String str3, String str4) {
            this.f47592a = iVar;
            this.f47593b = str;
            this.f47594c = i9;
            this.f47595d = str2;
            this.f47596e = str3;
            this.f47597f = str4;
        }

        private void b() {
            FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
            favouriteDBModel.setCategoryID(this.f47593b);
            favouriteDBModel.setStreamID(this.f47594c);
            favouriteDBModel.setStreamIDOneStream(this.f47595d);
            favouriteDBModel.setName(this.f47596e);
            favouriteDBModel.setNum(this.f47597f);
            favouriteDBModel.setUserID(SharepreferenceDBHandler.getUserID(V.this.f47487d));
            V.this.f47492i.addToFavourite(favouriteDBModel, "series");
            this.f47592a.f47604y.setVisibility(0);
        }

        private void c() {
            V v9 = V.this;
            v9.f47492i.deleteFavourite(this.f47594c, this.f47593b, "series", this.f47596e, SharepreferenceDBHandler.getUserID(v9.f47487d), this.f47595d);
            this.f47592a.f47604y.setVisibility(4);
        }

        public final void a() {
            this.f47592a.f47602w.performClick();
        }

        @Override // k.U.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == a7.f.lb) {
                a();
                return false;
            }
            if (itemId == a7.f.Bb) {
                b();
                return false;
            }
            if (itemId != a7.f.Lb) {
                return false;
            }
            c();
            return false;
        }
    }

    public static class i extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f47599t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public RelativeLayout f47600u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ImageView f47601v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public CardView f47602w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public TextView f47603x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public ImageView f47604y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public LinearLayout f47605z;

        public i(View view) {
            super(view);
            this.f47599t = (TextView) view.findViewById(a7.f.lk);
            this.f47600u = (RelativeLayout) view.findViewById(a7.f.Ge);
            this.f47601v = (ImageView) view.findViewById(a7.f.f12102B5);
            this.f47602w = (CardView) view.findViewById(a7.f.f12178J1);
            this.f47603x = (TextView) view.findViewById(a7.f.Ul);
            this.f47604y = (ImageView) view.findViewById(a7.f.f12406g5);
            this.f47605z = (LinearLayout) view.findViewById(a7.f.f12235O8);
            J(false);
        }
    }

    public class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f47606a;

        public j(View view) {
            this.f47606a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47606a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47606a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47606a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                b(z9 ? 1.1f : 1.0f);
                Log.e("id is", "" + this.f47606a.getTag());
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

    public V(List list, Context context) {
        this.f47488e = list;
        this.f47487d = context;
        ArrayList arrayList = new ArrayList();
        this.f47490g = arrayList;
        arrayList.addAll(list);
        this.f47491h = list;
        this.f47492i = new DatabaseHandler(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void E(i iVar, int i9) {
        String name;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String loginType;
        int i10;
        if (this.f47487d != null) {
            List list = this.f47488e;
            if (list == null || list.size() <= 0) {
                name = "";
                str = name;
                str2 = str;
                str3 = str2;
                str4 = str3;
                str5 = str4;
                str6 = str5;
                str7 = str6;
                str8 = str7;
                str9 = str8;
                str10 = str9;
                str11 = str10;
                str12 = str11;
                str13 = str12;
                str14 = str13;
                str15 = str14;
                loginType = str15;
                i10 = -1;
            } else {
                SeriesDBModel seriesDBModel = (SeriesDBModel) this.f47488e.get(i9);
                String num = seriesDBModel.getNum() != null ? seriesDBModel.getNum() : "";
                name = seriesDBModel.getName() != null ? seriesDBModel.getName() : "";
                String streamType = seriesDBModel.getStreamType() != null ? seriesDBModel.getStreamType() : "";
                int i11 = seriesDBModel.getseriesID() != -1 ? seriesDBModel.getseriesID() : -1;
                String oneStreamseriesID = seriesDBModel.getOneStreamseriesID();
                String str16 = seriesDBModel.getcover() != null ? seriesDBModel.getcover() : "";
                String str17 = seriesDBModel.getplot() != null ? seriesDBModel.getplot() : "";
                String str18 = seriesDBModel.getcast() != null ? seriesDBModel.getcast() : "";
                String str19 = seriesDBModel.getdirector() != null ? seriesDBModel.getdirector() : "";
                String str20 = seriesDBModel.getgenre() != null ? seriesDBModel.getgenre() : "";
                String str21 = seriesDBModel.getreleaseDate() != null ? seriesDBModel.getreleaseDate() : "";
                String str22 = seriesDBModel.getlast_modified() != null ? seriesDBModel.getlast_modified() : "";
                String str23 = seriesDBModel.getrating() != null ? seriesDBModel.getrating() : "";
                String categoryId = seriesDBModel.getCategoryId() != null ? seriesDBModel.getCategoryId() : "";
                String youTubeTrailer = seriesDBModel.getYouTubeTrailer() != null ? seriesDBModel.getYouTubeTrailer() : "";
                String backdrop = seriesDBModel.getBackdrop() != null ? seriesDBModel.getBackdrop() : "";
                String seasons = seriesDBModel.getSeasons() != null ? seriesDBModel.getSeasons() : "";
                loginType = seriesDBModel.getLoginType() != null ? seriesDBModel.getLoginType() : "";
                str5 = oneStreamseriesID;
                str4 = str17;
                str6 = str18;
                str7 = str19;
                str8 = str20;
                str9 = str21;
                str10 = str22;
                str11 = str23;
                str12 = categoryId;
                str13 = youTubeTrailer;
                str14 = backdrop;
                str15 = seasons;
                i10 = i11;
                str2 = num;
                str3 = streamType;
                str = str16;
            }
            SharedPreferences sharedPreferences = this.f47487d.getSharedPreferences("selectedPlayer", 0);
            this.f47489f = sharedPreferences;
            sharedPreferences.getString("selectedPlayer", "");
            if (i9 == 0 && iVar.f47600u != null && !this.f47495l.booleanValue()) {
                this.f47495l = Boolean.TRUE;
                iVar.f47600u.requestFocus();
            }
            SharedPreferences sharedPreferences2 = this.f47487d.getSharedPreferences("listgridview", 0);
            this.f47493j = sharedPreferences2;
            this.f47494k = sharedPreferences2.edit();
            AbstractC2237a.f44460O = this.f47493j.getInt("series", 0);
            iVar.f47599t.setText(((SeriesDBModel) this.f47488e.get(i9)).getName());
            iVar.f47601v.setImageDrawable(null);
            if (str == null || str.equals("")) {
                iVar.f47601v.setImageDrawable(this.f47487d.getResources().getDrawable(a7.e.f12040o1, null));
            } else {
                com.squareup.picasso.t.q(this.f47487d).l(str).j(a7.e.f12040o1).g(iVar.f47601v);
            }
            String strReplace = name.trim().replace("'", " ");
            if (this.f47492i.checkFavourite(i10, str12, "series", SharepreferenceDBHandler.getUserID(this.f47487d), str5).size() > 0) {
                iVar.f47604y.setVisibility(0);
            } else {
                iVar.f47604y.setVisibility(4);
            }
            String str24 = str2;
            String str25 = str3;
            int i12 = i10;
            String str26 = str4;
            String str27 = str6;
            String str28 = str7;
            String str29 = str8;
            String str30 = str9;
            String str31 = str10;
            String str32 = str;
            String str33 = str14;
            String str34 = str15;
            String str35 = loginType;
            iVar.f47602w.setOnClickListener(new a(str24, strReplace, str25, i12, str, str26, str27, str28, str29, str30, str31, str11, str12, str13, str33, str34, str35));
            iVar.f47601v.setOnClickListener(new b(str24, strReplace, str25, i12, str32, str26, str27, str28, str29, str30, str31, str11, str12, str13, str33, str34, str35));
            iVar.f47600u.setOnClickListener(new c(str24, strReplace, str25, i12, str32, str26, str27, str28, str29, str30, str31, str11, str12, str13, str33, str34, str35));
            RelativeLayout relativeLayout = iVar.f47600u;
            relativeLayout.setOnFocusChangeListener(new j(relativeLayout));
            int i13 = i10;
            String str36 = str12;
            String str37 = str2;
            String str38 = loginType;
            String str39 = str5;
            iVar.f47600u.setOnLongClickListener(new d(iVar, i13, str36, strReplace, str37, str38, str39));
            iVar.f47601v.setOnLongClickListener(new e(iVar, i13, str36, strReplace, str37, str38, str39));
            iVar.f47602w.setOnLongClickListener(new f(iVar, i13, str36, strReplace, str37, str38, str39));
            iVar.f47605z.setOnClickListener(new g(str2, strReplace, str3, i10, str32, str4, str6, str7, str8, str9, str31, str11, str12, str13, str33, str34, str35));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f47488e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public i L(ViewGroup viewGroup, int i9) {
        LayoutInflater layoutInflaterFrom;
        int i10;
        SharedPreferences sharedPreferences = this.f47487d.getSharedPreferences("listgridview", 0);
        this.f47493j = sharedPreferences;
        int i11 = sharedPreferences.getInt("series", 0);
        AbstractC2237a.f44460O = i11;
        if (i11 == 1) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12733V4;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12727U4;
        }
        return new i(layoutInflaterFrom.inflate(i10, viewGroup, false));
    }

    public final void p0(i iVar, int i9, String str, String str2, String str3, String str4, String str5) {
        Menu menuB;
        int i10;
        k.U u9 = new k.U(this.f47487d, iVar.f47603x);
        u9.d(a7.h.f12924g);
        if (this.f47492i.checkFavourite(i9, str, "series", SharepreferenceDBHandler.getUserID(this.f47487d), str5).size() > 0) {
            menuB = u9.b();
            i10 = 1;
        } else {
            menuB = u9.b();
            i10 = 2;
        }
        menuB.getItem(i10).setVisible(false);
        u9.f(new h(iVar, str, i9, str5, str2, str3));
        u9.g();
    }

    public final void q0(String str, String str2, String str3, int i9, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        if (this.f47487d != null) {
            Intent intent = new Intent(this.f47487d, (Class<?>) SeriesDetailActivity.class);
            intent.putExtra("series_num", str);
            intent.putExtra("series_name", str2);
            intent.putExtra("series_streamType", str3);
            intent.putExtra("series_seriesID", String.valueOf(i9));
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
            this.f47487d.startActivity(intent);
        }
    }
}
