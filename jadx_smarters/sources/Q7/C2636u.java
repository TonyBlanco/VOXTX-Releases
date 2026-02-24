package q7;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity;
import com.squareup.picasso.InterfaceC1611e;
import i7.AbstractC1902a;
import java.util.ArrayList;
import m7.AbstractC2237a;
import n4.C2281m;
import o4.C2325b;
import o4.C2328e;
import u7.C2858a;
import x4.C2957a;

/* JADX INFO: renamed from: q7.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2636u extends RecyclerView.g {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public SharedPreferences.Editor f49355C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public SharedPreferences f49356D;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f49359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f49360e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DatabaseHandler f49362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Animation f49363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f49364i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ProgressDialog f49366k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SharedPreferences f49369n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C2328e f49370o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Handler f49372q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LiveStreamDBHandler f49374s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f49378w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f49361f = Boolean.FALSE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f49365j = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f49367l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f49368m = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f49371p = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f49375t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f49376u = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f49379x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f49380y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f49381z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f49353A = "";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f49354B = "";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ArrayList f49357E = new ArrayList();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f49358F = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f49373r = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f49377v = new ArrayList();

    /* JADX INFO: renamed from: q7.u$a */
    public class a implements InterfaceC1611e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f49382a;

        /* JADX INFO: renamed from: q7.u$a$a, reason: collision with other inner class name */
        public class C0430a implements InterfaceC1611e {
            public C0430a() {
            }

            @Override // com.squareup.picasso.InterfaceC1611e
            public void a() {
            }

            @Override // com.squareup.picasso.InterfaceC1611e
            public void onSuccess() {
            }
        }

        public a(m mVar) {
            this.f49382a = mVar;
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
            com.squareup.picasso.t.q(C2636u.this.f49360e).l(String.valueOf(C2636u.this.f49360e.getResources().getDrawable(a7.e.f11895B1))).e().b().h(this.f49382a.f49446v, new C0430a());
            this.f49382a.f49444t.setVisibility(0);
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: q7.u$b */
    public class b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49385a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49386c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49387d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f49388e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ m f49389f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f49390g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f49391h;

        public b(String str, String str2, String str3, int i9, m mVar, int i10, int i11) {
            this.f49385a = str;
            this.f49386c = str2;
            this.f49387d = str3;
            this.f49388e = i9;
            this.f49389f = mVar;
            this.f49390g = i10;
            this.f49391h = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(C2636u.this.f49360e).equals("m3u")) {
                ArrayList<FavouriteM3UModel> arrayListCheckFavourite = C2636u.this.f49374s.checkFavourite(this.f49385a, SharepreferenceDBHandler.getUserID(C2636u.this.f49360e));
                C2636u c2636u = C2636u.this;
                c2636u.O0(arrayListCheckFavourite, this.f49389f, this.f49390g, c2636u.f49359d);
                return true;
            }
            ArrayList<FavouriteDBModel> arrayListCheckFavourite2 = C2636u.this.f49362g.checkFavourite(this.f49388e, this.f49387d, "live", SharepreferenceDBHandler.getUserID(C2636u.this.f49360e), this.f49386c);
            C2636u c2636u2 = C2636u.this;
            c2636u2.N0(arrayListCheckFavourite2, this.f49389f, this.f49390g, c2636u2.f49359d, this.f49391h, this.f49389f.f49445u);
            return true;
        }
    }

    /* JADX INFO: renamed from: q7.u$c */
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

    /* JADX INFO: renamed from: q7.u$d */
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

    /* JADX INFO: renamed from: q7.u$e */
    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49395a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f49396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f49398e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f49399f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f49400g;

        public e(String str, int i9, String str2, String str3, String str4, String str5) {
            this.f49395a = str;
            this.f49396c = i9;
            this.f49397d = str2;
            this.f49398e = str3;
            this.f49399f = str4;
            this.f49400g = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                C2636u c2636u = C2636u.this;
                c2636u.f49370o = C2325b.e(c2636u.f49360e).c().c();
            } catch (Exception unused) {
            }
            if (C2636u.this.f49370o == null || !C2636u.this.f49370o.c()) {
                C2636u.this.a1(this.f49396c, this.f49399f, this.f49395a, this.f49400g);
                return;
            }
            if (C2636u.this.f49370o != null && C2636u.this.f49370o.r() != null && C2636u.this.f49370o.r().j() != null && C2636u.this.f49370o.r().j().J() != null) {
                C2636u c2636u2 = C2636u.this;
                c2636u2.f49371p = c2636u2.f49370o.r().j().J();
            }
            String strU = SharepreferenceDBHandler.getCurrentAPPType(C2636u.this.f49360e).equals("m3u") ? this.f49395a : m7.w.U(C2636u.this.f49360e, this.f49396c, "m3u8", "live");
            if (C2636u.this.f49371p.contains(String.valueOf(strU))) {
                C2636u.this.f49360e.startActivity(new Intent(C2636u.this.f49360e, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            C2281m c2281m = new C2281m(1);
            c2281m.M("com.google.android.gms.cast.metadata.TITLE", this.f49397d);
            c2281m.c(new C2957a(Uri.parse(this.f49398e)));
            C2636u c2636u3 = C2636u.this;
            AbstractC1902a.b(c2636u3.f49372q, c2636u3.f49370o.r(), strU, c2281m, C2636u.this.f49360e);
        }
    }

    /* JADX INFO: renamed from: q7.u$f */
    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49402a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f49403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f49405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f49406f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f49407g;

        public f(String str, int i9, String str2, String str3, String str4, String str5) {
            this.f49402a = str;
            this.f49403c = i9;
            this.f49404d = str2;
            this.f49405e = str3;
            this.f49406f = str4;
            this.f49407g = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                C2636u c2636u = C2636u.this;
                c2636u.f49370o = C2325b.e(c2636u.f49360e).c().c();
            } catch (Exception unused) {
            }
            if (C2636u.this.f49370o == null || !C2636u.this.f49370o.c()) {
                C2636u.this.a1(this.f49403c, this.f49406f, this.f49402a, this.f49407g);
                return;
            }
            if (C2636u.this.f49370o != null && C2636u.this.f49370o.r() != null && C2636u.this.f49370o.r().j() != null && C2636u.this.f49370o.r().j().J() != null) {
                C2636u c2636u2 = C2636u.this;
                c2636u2.f49371p = c2636u2.f49370o.r().j().J();
            }
            String strU = SharepreferenceDBHandler.getCurrentAPPType(C2636u.this.f49360e).equals("m3u") ? this.f49402a : m7.w.U(C2636u.this.f49360e, this.f49403c, "m3u8", "live");
            if (C2636u.this.f49371p.contains(String.valueOf(strU))) {
                C2636u.this.f49360e.startActivity(new Intent(C2636u.this.f49360e, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            C2281m c2281m = new C2281m(1);
            c2281m.M("com.google.android.gms.cast.metadata.TITLE", this.f49404d);
            c2281m.c(new C2957a(Uri.parse(this.f49405e)));
            C2636u c2636u3 = C2636u.this;
            AbstractC1902a.b(c2636u3.f49372q, c2636u3.f49370o.r(), strU, c2281m, C2636u.this.f49360e);
        }
    }

    /* JADX INFO: renamed from: q7.u$g */
    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49409a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f49410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f49412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f49413f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f49414g;

        public g(String str, int i9, String str2, String str3, String str4, String str5) {
            this.f49409a = str;
            this.f49410c = i9;
            this.f49411d = str2;
            this.f49412e = str3;
            this.f49413f = str4;
            this.f49414g = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                C2636u c2636u = C2636u.this;
                c2636u.f49370o = C2325b.e(c2636u.f49360e).c().c();
            } catch (Exception unused) {
            }
            if (C2636u.this.f49370o == null || !C2636u.this.f49370o.c()) {
                C2636u.this.a1(this.f49410c, this.f49413f, this.f49409a, this.f49414g);
                return;
            }
            if (C2636u.this.f49370o != null && C2636u.this.f49370o.r() != null && C2636u.this.f49370o.r().j() != null && C2636u.this.f49370o.r().j().J() != null) {
                C2636u c2636u2 = C2636u.this;
                c2636u2.f49371p = c2636u2.f49370o.r().j().J();
            }
            String strU = SharepreferenceDBHandler.getCurrentAPPType(C2636u.this.f49360e).equals("m3u") ? this.f49409a : m7.w.U(C2636u.this.f49360e, this.f49410c, "m3u8", "live");
            if (C2636u.this.f49371p.contains(String.valueOf(strU))) {
                C2636u.this.f49360e.startActivity(new Intent(C2636u.this.f49360e, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            C2281m c2281m = new C2281m(1);
            c2281m.M("com.google.android.gms.cast.metadata.TITLE", this.f49411d);
            c2281m.c(new C2957a(Uri.parse(this.f49412e)));
            C2636u c2636u3 = C2636u.this;
            AbstractC1902a.b(c2636u3.f49372q, c2636u3.f49370o.r(), strU, c2281m, C2636u.this.f49360e);
        }
    }

    /* JADX INFO: renamed from: q7.u$h */
    public class h implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49416a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f49419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ m f49420f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f49421g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f49422h;

        public h(String str, String str2, String str3, int i9, m mVar, int i10, int i11) {
            this.f49416a = str;
            this.f49417c = str2;
            this.f49418d = str3;
            this.f49419e = i9;
            this.f49420f = mVar;
            this.f49421g = i10;
            this.f49422h = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(C2636u.this.f49360e).equals("m3u")) {
                ArrayList<FavouriteM3UModel> arrayListCheckFavourite = C2636u.this.f49374s.checkFavourite(this.f49416a, SharepreferenceDBHandler.getUserID(C2636u.this.f49360e));
                C2636u c2636u = C2636u.this;
                c2636u.O0(arrayListCheckFavourite, this.f49420f, this.f49421g, c2636u.f49359d);
                return true;
            }
            ArrayList<FavouriteDBModel> arrayListCheckFavourite2 = C2636u.this.f49362g.checkFavourite(this.f49419e, this.f49418d, "live", SharepreferenceDBHandler.getUserID(C2636u.this.f49360e), this.f49417c);
            C2636u c2636u2 = C2636u.this;
            c2636u2.N0(arrayListCheckFavourite2, this.f49420f, this.f49421g, c2636u2.f49359d, this.f49422h, this.f49420f.f49445u);
            return true;
        }
    }

    /* JADX INFO: renamed from: q7.u$i */
    public class i implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49424a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49426d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f49427e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ m f49428f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f49429g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f49430h;

        public i(String str, String str2, String str3, int i9, m mVar, int i10, int i11) {
            this.f49424a = str;
            this.f49425c = str2;
            this.f49426d = str3;
            this.f49427e = i9;
            this.f49428f = mVar;
            this.f49429g = i10;
            this.f49430h = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(C2636u.this.f49360e).equals("m3u")) {
                ArrayList<FavouriteM3UModel> arrayListCheckFavourite = C2636u.this.f49374s.checkFavourite(this.f49424a, SharepreferenceDBHandler.getUserID(C2636u.this.f49360e));
                C2636u c2636u = C2636u.this;
                c2636u.O0(arrayListCheckFavourite, this.f49428f, this.f49429g, c2636u.f49359d);
                return true;
            }
            ArrayList<FavouriteDBModel> arrayListCheckFavourite2 = C2636u.this.f49362g.checkFavourite(this.f49427e, this.f49426d, "live", SharepreferenceDBHandler.getUserID(C2636u.this.f49360e), this.f49425c);
            C2636u c2636u2 = C2636u.this;
            c2636u2.N0(arrayListCheckFavourite2, this.f49428f, this.f49429g, c2636u2.f49359d, this.f49430h, this.f49428f.f49445u);
            return true;
        }
    }

    /* JADX INFO: renamed from: q7.u$j */
    public class j implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49432a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49434d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f49435e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ m f49436f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f49437g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f49438h;

        public j(String str, String str2, String str3, int i9, m mVar, int i10, int i11) {
            this.f49432a = str;
            this.f49433c = str2;
            this.f49434d = str3;
            this.f49435e = i9;
            this.f49436f = mVar;
            this.f49437g = i10;
            this.f49438h = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(C2636u.this.f49360e).equals("m3u")) {
                ArrayList<FavouriteM3UModel> arrayListCheckFavourite = C2636u.this.f49374s.checkFavourite(this.f49432a, SharepreferenceDBHandler.getUserID(C2636u.this.f49360e));
                C2636u c2636u = C2636u.this;
                c2636u.O0(arrayListCheckFavourite, this.f49436f, this.f49437g, c2636u.f49359d);
                return true;
            }
            ArrayList<FavouriteDBModel> arrayListCheckFavourite2 = C2636u.this.f49362g.checkFavourite(this.f49435e, this.f49434d, "live", SharepreferenceDBHandler.getUserID(C2636u.this.f49360e), this.f49433c);
            C2636u c2636u2 = C2636u.this;
            c2636u2.N0(arrayListCheckFavourite2, this.f49436f, this.f49437g, c2636u2.f49359d, this.f49438h, this.f49436f.f49445u);
            return true;
        }
    }

    /* JADX INFO: renamed from: q7.u$k */
    public class k extends AsyncTask {
        public k() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return C2636u.this.Q0(strArr[1]);
            } catch (Exception unused) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            C2636u.this.W0();
            C2636u.this.j0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX INFO: renamed from: q7.u$l */
    public class l implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49441a;

        public l(int i9) {
            this.f49441a = i9;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            C2636u.this.f49368m = z9 ? this.f49441a : -1;
        }
    }

    /* JADX INFO: renamed from: q7.u$m */
    public static class m extends RecyclerView.D {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public RelativeLayout f49443A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f49444t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public RelativeLayout f49445u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ImageView f49446v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public CardView f49447w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public TextView f49448x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public ImageView f49449y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public LinearLayout f49450z;

        public m(View view) {
            super(view);
            this.f49444t = (TextView) view.findViewById(a7.f.Fl);
            this.f49445u = (RelativeLayout) view.findViewById(a7.f.Ge);
            this.f49446v = (ImageView) view.findViewById(a7.f.f12102B5);
            this.f49447w = (CardView) view.findViewById(a7.f.f12178J1);
            this.f49448x = (TextView) view.findViewById(a7.f.Ul);
            this.f49449y = (ImageView) view.findViewById(a7.f.f12406g5);
            this.f49450z = (LinearLayout) view.findViewById(a7.f.f12235O8);
            this.f49443A = (RelativeLayout) view.findViewById(a7.f.Ie);
        }
    }

    /* JADX INFO: renamed from: q7.u$n */
    public class n extends AsyncTask {
        public n() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return C2636u.this.Y0();
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            C2636u.this.f1();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            C2636u.this.h1();
            super.onPreExecute();
        }
    }

    public C2636u(Context context, ArrayList arrayList) {
        this.f49364i = "mobile";
        this.f49360e = context;
        this.f49359d = arrayList;
        this.f49362g = new DatabaseHandler(context);
        this.f49363h = AnimationUtils.loadAnimation(context, a7.b.f11823a);
        this.f49374s = new LiveStreamDBHandler(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("currentlyPlayingVideo", 0);
        this.f49356D = sharedPreferences;
        this.f49355C = sharedPreferences.edit();
        if (new C2858a(context).A().equals(AbstractC2237a.f44453K0)) {
            this.f49364i = "tv";
        } else {
            this.f49364i = "mobile";
        }
        this.f49372q = new Handler(Looper.getMainLooper());
        if (this.f49364i.equals("mobile")) {
            try {
                this.f49370o = C2325b.e(context).c().c();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    private void L0(RecyclerView.D d9, int i9, ArrayList arrayList) {
        m mVar = (m) d9;
        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
        favouriteM3UModel.setUrl(((LiveStreamsDBModel) arrayList.get(i9)).getUrl());
        favouriteM3UModel.setUserID(SharepreferenceDBHandler.getUserID(this.f49360e));
        favouriteM3UModel.setName(((LiveStreamsDBModel) arrayList.get(i9)).getName());
        favouriteM3UModel.setCategoryID(((LiveStreamsDBModel) arrayList.get(i9)).getCategoryId());
        this.f49374s.addToFavourite(favouriteM3UModel);
        mVar.f49449y.startAnimation(this.f49363h);
        mVar.f49449y.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(ArrayList arrayList, RecyclerView.D d9, int i9, ArrayList arrayList2) {
        if (arrayList.size() > 0) {
            c1(d9, i9, arrayList2);
        } else {
            L0(d9, i9, arrayList2);
        }
        this.f49367l = true;
        Context context = this.f49360e;
        if (context instanceof LiveAllDataSingleActivity) {
            ((LiveAllDataSingleActivity) context).j2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() {
        ProgressDialog progressDialog = this.f49366k;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f49366k.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean Y0() {
        try {
            if (this.f49360e != null) {
                ArrayList arrayList = this.f49373r;
                if (arrayList != null) {
                    arrayList.clear();
                }
                this.f49373r = this.f49374s.getAllliveCategories();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 = new LiveStreamCategoryIdDBModel();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel3 = new LiveStreamCategoryIdDBModel();
                int streamsCount = this.f49374s.getStreamsCount("live");
                liveStreamCategoryIdDBModel.setLiveStreamCategoryID("0");
                liveStreamCategoryIdDBModel.setLiveStreamCategoryName(this.f49360e.getResources().getString(a7.j.f13426x));
                liveStreamCategoryIdDBModel.setLiveStreamCounter(streamsCount);
                liveStreamCategoryIdDBModel2.setLiveStreamCategoryID("-1");
                liveStreamCategoryIdDBModel2.setLiveStreamCategoryName(this.f49360e.getResources().getString(a7.j.f13209b2));
                int uncatCount = this.f49374s.getUncatCount("-2", "live");
                this.f49375t = uncatCount;
                if (uncatCount != 0 && uncatCount > 0) {
                    liveStreamCategoryIdDBModel3.setLiveStreamCategoryID("-2");
                    liveStreamCategoryIdDBModel3.setLiveStreamCategoryName(this.f49360e.getResources().getString(a7.j.f13215b8));
                    liveStreamCategoryIdDBModel3.setLiveStreamCounter(this.f49375t);
                    ArrayList arrayList2 = this.f49373r;
                    arrayList2.add(arrayList2.size(), liveStreamCategoryIdDBModel3);
                }
                this.f49373r.add(0, liveStreamCategoryIdDBModel);
                this.f49373r.add(1, liveStreamCategoryIdDBModel2);
            }
            return Boolean.TRUE;
        } catch (NullPointerException unused) {
            return Boolean.FALSE;
        } catch (Exception unused2) {
            return Boolean.FALSE;
        }
    }

    private void Z0() {
        new n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    private void c1(RecyclerView.D d9, int i9, ArrayList arrayList) {
        this.f49374s.deleteFavourite(((LiveStreamsDBModel) arrayList.get(i9)).getUrl(), SharepreferenceDBHandler.getUserID(this.f49360e));
        ((m) d9).f49449y.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1() {
        ArrayList arrayList = this.f49373r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = this.f49377v;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ArrayList arrayList3 = new ArrayList();
        this.f49377v = arrayList3;
        arrayList3.addAll(this.f49373r);
        int i9 = 0;
        while (true) {
            if (i9 >= this.f49373r.size()) {
                break;
            }
            if (this.f49379x.equals(String.valueOf(((LiveStreamCategoryIdDBModel) this.f49373r.get(i9)).getLiveStreamCategoryID()))) {
                this.f49380y = ((LiveStreamCategoryIdDBModel) this.f49373r.get(i9)).getLiveStreamCategoryName();
                break;
            }
            i9++;
        }
        ArrayList arrayList4 = this.f49377v;
        if (arrayList4 == null || arrayList4.size() <= 0) {
            return;
        }
        VodAllCategoriesSingleton.getInstance().setLiveCategoriesList(this.f49377v);
        m7.w.f44702o = new k().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_all", this.f49379x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h1() {
        ProgressDialog progressDialog = new ProgressDialog(this.f49360e);
        this.f49366k = progressDialog;
        progressDialog.setCanceledOnTouchOutside(false);
        this.f49366k.setMessage(this.f49360e.getResources().getString(a7.j.f13392t5));
        this.f49366k.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x017e A[Catch: Exception -> 0x004c, TryCatch #1 {Exception -> 0x004c, blocks: (B:3:0x0022, B:5:0x0026, B:7:0x002c, B:9:0x0030, B:11:0x0048, B:14:0x004f, B:16:0x0055, B:18:0x005c, B:20:0x0062, B:21:0x0065, B:23:0x0071, B:25:0x007f, B:27:0x0085, B:36:0x00a1, B:38:0x00a7, B:40:0x00ae, B:42:0x00b4, B:44:0x00bb, B:46:0x00c1, B:48:0x00ca, B:50:0x00e0, B:52:0x00ed, B:59:0x0171, B:61:0x017e, B:63:0x0190, B:64:0x0192, B:71:0x01be, B:73:0x026b, B:75:0x026f, B:65:0x0196, B:66:0x0198, B:67:0x019c, B:69:0x01b8, B:70:0x01bb, B:58:0x0142, B:57:0x013e, B:56:0x0110, B:51:0x00e6, B:35:0x009d, B:76:0x027c, B:78:0x028c, B:80:0x0292, B:82:0x0296, B:83:0x029f, B:54:0x00f3, B:31:0x0096), top: B:89:0x0022, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019c A[Catch: Exception -> 0x004c, TryCatch #1 {Exception -> 0x004c, blocks: (B:3:0x0022, B:5:0x0026, B:7:0x002c, B:9:0x0030, B:11:0x0048, B:14:0x004f, B:16:0x0055, B:18:0x005c, B:20:0x0062, B:21:0x0065, B:23:0x0071, B:25:0x007f, B:27:0x0085, B:36:0x00a1, B:38:0x00a7, B:40:0x00ae, B:42:0x00b4, B:44:0x00bb, B:46:0x00c1, B:48:0x00ca, B:50:0x00e0, B:52:0x00ed, B:59:0x0171, B:61:0x017e, B:63:0x0190, B:64:0x0192, B:71:0x01be, B:73:0x026b, B:75:0x026f, B:65:0x0196, B:66:0x0198, B:67:0x019c, B:69:0x01b8, B:70:0x01bb, B:58:0x0142, B:57:0x013e, B:56:0x0110, B:51:0x00e6, B:35:0x009d, B:76:0x027c, B:78:0x028c, B:80:0x0292, B:82:0x0296, B:83:0x029f, B:54:0x00f3, B:31:0x0096), top: B:89:0x0022, inners: #0, #2 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(androidx.recyclerview.widget.RecyclerView.D r25, int r26) {
        /*
            Method dump skipped, instruction units count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C2636u.E(androidx.recyclerview.widget.RecyclerView$D, int):void");
    }

    public final void K0(RecyclerView.D d9, int i9, ArrayList arrayList, int i10) {
        m mVar = (m) d9;
        FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
        favouriteDBModel.setCategoryID(((LiveStreamsDBModel) arrayList.get(i9)).getCategoryId());
        favouriteDBModel.setStreamID(m7.w.r0(((LiveStreamsDBModel) arrayList.get(i9)).getStreamId()));
        favouriteDBModel.setStreamIDOneStream(((LiveStreamsDBModel) arrayList.get(i9)).getStreamId());
        favouriteDBModel.setName(((LiveStreamsDBModel) arrayList.get(i9)).getName());
        favouriteDBModel.setNum(((LiveStreamsDBModel) arrayList.get(i9)).getNum());
        favouriteDBModel.setUserID(SharepreferenceDBHandler.getUserID(this.f49360e));
        this.f49362g.addToFavourite(favouriteDBModel, "live");
        mVar.f49449y.startAnimation(this.f49363h);
        mVar.f49449y.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public RecyclerView.D L(ViewGroup viewGroup, int i9) {
        LayoutInflater layoutInflaterFrom;
        int i10;
        if (this.f49364i.equals("tv")) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12910y3;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12904x3;
        }
        return new m(layoutInflaterFrom.inflate(i10, viewGroup, false));
    }

    public final void N0(ArrayList arrayList, RecyclerView.D d9, int i9, ArrayList arrayList2, int i10, RelativeLayout relativeLayout) {
        if (arrayList.size() > 0) {
            b1(d9, i9, arrayList2, i10);
        } else {
            K0(d9, i9, arrayList2, i10);
        }
        this.f49367l = true;
        Context context = this.f49360e;
        if (context instanceof LiveAllDataSingleActivity) {
            ((LiveAllDataSingleActivity) context).j2();
        }
    }

    public String Q0(String str) {
        try {
            this.f49378w = this.f49374s.getAllLiveStreasWithCategoryId(str, "live");
            return "get_all";
        } catch (Exception unused) {
            return "get_all";
        }
    }

    public int R0() {
        return this.f49368m;
    }

    public int S0(String str, String str2) {
        ArrayList arrayList = this.f49378w;
        if (arrayList != null && arrayList.size() > 0) {
            if (str2.equals("m3u")) {
                for (int i9 = 0; i9 < this.f49378w.size(); i9++) {
                    if (((LiveStreamsDBModel) this.f49378w.get(i9)).getUrl().equals(str)) {
                        return i9;
                    }
                }
            } else {
                for (int i10 = 0; i10 < this.f49378w.size(); i10++) {
                    if (((LiveStreamsDBModel) this.f49378w.get(i10)).getStreamId().equals(str)) {
                        return i10;
                    }
                }
            }
        }
        return 0;
    }

    public final void a1(int i9, String str, String str2, String str3) {
        this.f49379x = str;
        this.f49381z = i9;
        this.f49354B = str2;
        this.f49353A = str3;
        Z0();
    }

    public final void b1(RecyclerView.D d9, int i9, ArrayList arrayList, int i10) {
        this.f49362g.deleteFavourite(m7.w.r0(((LiveStreamsDBModel) arrayList.get(i9)).getStreamId()), ((LiveStreamsDBModel) arrayList.get(i9)).getCategoryId(), "live", ((LiveStreamsDBModel) arrayList.get(i9)).getName(), SharepreferenceDBHandler.getUserID(this.f49360e), ((LiveStreamsDBModel) arrayList.get(i9)).getStreamIdOneStream());
        ((m) d9).f49449y.setVisibility(4);
    }

    public void d1() {
    }

    public void e1(m7.c cVar) {
    }

    public void g1(ArrayList arrayList) {
        this.f49359d = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[Catch: Exception -> 0x00c2, TryCatch #0 {Exception -> 0x00c2, blocks: (B:3:0x0004, B:5:0x0010, B:6:0x0012, B:12:0x0034, B:14:0x003e, B:16:0x0046, B:18:0x004e, B:20:0x0061, B:19:0x0058, B:21:0x008f, B:23:0x0093, B:25:0x0099, B:26:0x00ba, B:8:0x0018, B:10:0x0024, B:11:0x002b), top: B:29:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f A[Catch: Exception -> 0x00c2, TryCatch #0 {Exception -> 0x00c2, blocks: (B:3:0x0004, B:5:0x0010, B:6:0x0012, B:12:0x0034, B:14:0x003e, B:16:0x0046, B:18:0x004e, B:20:0x0061, B:19:0x0058, B:21:0x008f, B:23:0x0093, B:25:0x0099, B:26:0x00ba, B:8:0x0018, B:10:0x0024, B:11:0x002b), top: B:29:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j0() {
        /*
            r12 = this;
            java.lang.String r0 = "onestream_api"
            java.lang.String r1 = "m3u"
            android.content.Context r2 = r12.f49360e     // Catch: java.lang.Exception -> Lc2
            java.lang.String r2 = com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.getCurrentAPPType(r2)     // Catch: java.lang.Exception -> Lc2
            boolean r2 = r2.equals(r1)     // Catch: java.lang.Exception -> Lc2
            if (r2 == 0) goto L18
            java.lang.String r0 = r12.f49354B     // Catch: java.lang.Exception -> Lc2
        L12:
            int r0 = r12.S0(r0, r1)     // Catch: java.lang.Exception -> Lc2
        L16:
            r5 = r0
            goto L34
        L18:
            android.content.Context r1 = r12.f49360e     // Catch: java.lang.Exception -> Lc2
            java.lang.String r1 = com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.getCurrentAPPType(r1)     // Catch: java.lang.Exception -> Lc2
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Exception -> Lc2
            if (r1 == 0) goto L2b
            java.lang.String r1 = r12.f49353A     // Catch: java.lang.Exception -> Lc2
            int r0 = r12.S0(r1, r0)     // Catch: java.lang.Exception -> Lc2
            goto L16
        L2b:
            int r0 = r12.f49381z     // Catch: java.lang.Exception -> Lc2
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> Lc2
            java.lang.String r1 = "api"
            goto L12
        L34:
            java.lang.String r0 = r12.f49364i     // Catch: java.lang.Exception -> Lc2
            java.lang.String r1 = "tv"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Lc2
            if (r0 == 0) goto L8f
            android.content.Context r0 = r12.f49360e     // Catch: java.lang.Exception -> Lc2
            java.lang.String r0 = com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.getLivePlayerPkgName(r0)     // Catch: java.lang.Exception -> Lc2
            if (r0 == 0) goto L58
            java.lang.String r1 = "default_native"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Exception -> Lc2
            if (r0 == 0) goto L58
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> Lc2
            android.content.Context r1 = r12.f49360e     // Catch: java.lang.Exception -> Lc2
            java.lang.Class<com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity> r2 = com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity.class
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> Lc2
            goto L61
        L58:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> Lc2
            android.content.Context r1 = r12.f49360e     // Catch: java.lang.Exception -> Lc2
            java.lang.Class<com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity> r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.class
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> Lc2
        L61:
            java.lang.String r1 = "OPENED_STREAM_ID"
            int r2 = r12.f49381z     // Catch: java.lang.Exception -> Lc2
            r0.putExtra(r1, r2)     // Catch: java.lang.Exception -> Lc2
            java.lang.String r1 = "VIDEO_NUM"
            r0.putExtra(r1, r5)     // Catch: java.lang.Exception -> Lc2
            java.lang.String r1 = "OPENED_CAT_ID"
            java.lang.String r2 = r12.f49379x     // Catch: java.lang.Exception -> Lc2
            r0.putExtra(r1, r2)     // Catch: java.lang.Exception -> Lc2
            java.lang.String r1 = "VIDEO_URL"
            java.lang.String r2 = r12.f49354B     // Catch: java.lang.Exception -> Lc2
            r0.putExtra(r1, r2)     // Catch: java.lang.Exception -> Lc2
            java.lang.String r1 = "OPENED_CAT_NAME"
            java.lang.String r2 = r12.f49380y     // Catch: java.lang.Exception -> Lc2
            r0.putExtra(r1, r2)     // Catch: java.lang.Exception -> Lc2
            java.lang.String r1 = "FROM_SEARCH"
            java.lang.String r2 = "true"
            r0.putExtra(r1, r2)     // Catch: java.lang.Exception -> Lc2
            android.content.Context r1 = r12.f49360e     // Catch: java.lang.Exception -> Lc2
            r1.startActivity(r0)     // Catch: java.lang.Exception -> Lc2
            goto Lc2
        L8f:
            java.util.ArrayList r0 = r12.f49378w     // Catch: java.lang.Exception -> Lc2
            if (r0 == 0) goto Lba
            int r0 = r0.size()     // Catch: java.lang.Exception -> Lc2
            if (r0 <= 0) goto Lba
            com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton r0 = com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton.getInstance()     // Catch: java.lang.Exception -> Lc2
            java.util.ArrayList r1 = r12.f49378w     // Catch: java.lang.Exception -> Lc2
            r0.setLiveList(r1)     // Catch: java.lang.Exception -> Lc2
            android.content.Context r1 = r12.f49360e     // Catch: java.lang.Exception -> Lc2
            java.lang.String r2 = "Built-in Player ( Default )"
            int r3 = r12.f49381z     // Catch: java.lang.Exception -> Lc2
            java.lang.String r4 = "live"
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            java.lang.String r9 = r12.f49379x     // Catch: java.lang.Exception -> Lc2
            java.lang.String r10 = r12.f49354B     // Catch: java.lang.Exception -> Lc2
            java.lang.String r11 = r12.f49380y     // Catch: java.lang.Exception -> Lc2
            m7.w.x0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> Lc2
            goto Lc2
        Lba:
            com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton r0 = com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton.getInstance()     // Catch: java.lang.Exception -> Lc2
            r1 = 0
            r0.setLiveList(r1)     // Catch: java.lang.Exception -> Lc2
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C2636u.j0():void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        ArrayList arrayList = this.f49359d;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        return this.f49359d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int p(int i9) {
        return 0;
    }
}
