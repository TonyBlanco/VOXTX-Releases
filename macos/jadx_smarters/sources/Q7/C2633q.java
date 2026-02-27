package q7;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
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
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.SearchActivity;
import com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK;
import com.squareup.picasso.InterfaceC1611e;
import java.util.ArrayList;
import m7.AbstractC2237a;
import o4.C2325b;
import o4.C2328e;
import u7.C2858a;

/* JADX INFO: renamed from: q7.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2633q extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f49107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f49108e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DatabaseHandler f49110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Animation f49111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f49112i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SharedPreferences f49116m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C2328e f49117n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Handler f49119p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LiveStreamDBHandler f49121r;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f49127x;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f49109f = Boolean.FALSE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f49113j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f49114k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f49115l = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f49118o = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f49122s = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f49124u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f49125v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f49126w = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f49120q = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f49123t = new ArrayList();

    /* JADX INFO: renamed from: q7.q$a */
    public class a implements InterfaceC1611e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f49128a;

        /* JADX INFO: renamed from: q7.q$a$a, reason: collision with other inner class name */
        public class C0425a implements InterfaceC1611e {
            public C0425a() {
            }

            @Override // com.squareup.picasso.InterfaceC1611e
            public void a() {
            }

            @Override // com.squareup.picasso.InterfaceC1611e
            public void onSuccess() {
            }
        }

        public a(k kVar) {
            this.f49128a = kVar;
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
            com.squareup.picasso.t.q(C2633q.this.f49108e).l(String.valueOf(C2633q.this.f49108e.getResources().getDrawable(a7.e.f11895B1))).e().b().h(this.f49128a.f49163v, new C0425a());
            this.f49128a.f49161t.setVisibility(0);
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: q7.q$b */
    public class b implements InterfaceC1611e {
        public b() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: q7.q$c */
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

    /* JADX INFO: renamed from: q7.q$d */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: q7.q$e */
    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f49134a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f49135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49136d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f49137e;

        public e(int i9, k kVar, String str, int i10) {
            this.f49134a = i9;
            this.f49135c = kVar;
            this.f49136d = str;
            this.f49137e = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchActivityLowerSDK searchActivityLowerSDK;
            String strValueOf;
            SearchActivity searchActivity;
            String strValueOf2;
            C2633q.this.f49127x = this.f49134a;
            this.f49135c.f49163v.setBackground(C2633q.this.f49108e.getResources().getDrawable(a7.e.f12061t2));
            if (SharepreferenceDBHandler.getCurrentAPPType(C2633q.this.f49108e).equals("m3u")) {
                if (Build.VERSION.SDK_INT >= 23) {
                    searchActivity = (SearchActivity) C2633q.this.f49108e;
                    strValueOf2 = String.valueOf(this.f49136d);
                    searchActivity.f2(strValueOf2);
                } else {
                    searchActivityLowerSDK = (SearchActivityLowerSDK) C2633q.this.f49108e;
                    strValueOf = String.valueOf(this.f49136d);
                    searchActivityLowerSDK.M(strValueOf);
                }
            } else if (Build.VERSION.SDK_INT >= 23) {
                searchActivity = (SearchActivity) C2633q.this.f49108e;
                strValueOf2 = String.valueOf(this.f49137e);
                searchActivity.f2(strValueOf2);
            } else {
                searchActivityLowerSDK = (SearchActivityLowerSDK) C2633q.this.f49108e;
                strValueOf = String.valueOf(this.f49137e);
                searchActivityLowerSDK.M(strValueOf);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                ((SearchActivity) C2633q.this.f49108e).p1(C2633q.this.f49127x);
            } else {
                ((SearchActivityLowerSDK) C2633q.this.f49108e).a(C2633q.this.f49127x);
            }
        }
    }

    /* JADX INFO: renamed from: q7.q$f */
    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f49139a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f49140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f49142e;

        public f(int i9, k kVar, String str, int i10) {
            this.f49139a = i9;
            this.f49140c = kVar;
            this.f49141d = str;
            this.f49142e = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchActivity searchActivity;
            String strValueOf;
            C2633q.this.f49127x = this.f49139a;
            this.f49140c.f49163v.setBackground(C2633q.this.f49108e.getResources().getDrawable(a7.e.f12061t2));
            if (SharepreferenceDBHandler.getCurrentAPPType(C2633q.this.f49108e).equals("m3u")) {
                if (Build.VERSION.SDK_INT >= 23) {
                    searchActivity = (SearchActivity) C2633q.this.f49108e;
                    strValueOf = String.valueOf(this.f49141d);
                    searchActivity.f2(strValueOf);
                }
                ((SearchActivityLowerSDK) C2633q.this.f49108e).M(String.valueOf(this.f49141d));
            } else {
                if (Build.VERSION.SDK_INT >= 23) {
                    searchActivity = (SearchActivity) C2633q.this.f49108e;
                    strValueOf = String.valueOf(this.f49142e);
                    searchActivity.f2(strValueOf);
                }
                ((SearchActivityLowerSDK) C2633q.this.f49108e).M(String.valueOf(this.f49141d));
            }
            if (Build.VERSION.SDK_INT >= 23) {
                ((SearchActivity) C2633q.this.f49108e).p1(C2633q.this.f49127x);
            } else {
                ((SearchActivityLowerSDK) C2633q.this.f49108e).M(String.valueOf(this.f49141d));
            }
        }
    }

    /* JADX INFO: renamed from: q7.q$g */
    public class g implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49144a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f49147e;

        public g(String str, String str2, String str3, int i9) {
            this.f49144a = str;
            this.f49145c = str2;
            this.f49146d = str3;
            this.f49147e = i9;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* JADX INFO: renamed from: q7.q$h */
    public class h implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49149a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49151d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f49152e;

        public h(String str, String str2, String str3, int i9) {
            this.f49149a = str;
            this.f49150c = str2;
            this.f49151d = str3;
            this.f49152e = i9;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* JADX INFO: renamed from: q7.q$i */
    public class i implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49154a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49155c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49156d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f49157e;

        public i(String str, String str2, String str3, int i9) {
            this.f49154a = str;
            this.f49155c = str2;
            this.f49156d = str3;
            this.f49157e = i9;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* JADX INFO: renamed from: q7.q$j */
    public class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49159a;

        public j(int i9) {
            this.f49159a = i9;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            C2633q.this.f49115l = z9 ? this.f49159a : -1;
        }
    }

    /* JADX INFO: renamed from: q7.q$k */
    public static class k extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f49161t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public RelativeLayout f49162u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ImageView f49163v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public CardView f49164w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public TextView f49165x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public ImageView f49166y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public LinearLayout f49167z;

        public k(View view) {
            super(view);
            this.f49161t = (TextView) view.findViewById(a7.f.Fl);
            this.f49162u = (RelativeLayout) view.findViewById(a7.f.Ge);
            this.f49163v = (ImageView) view.findViewById(a7.f.f12102B5);
            this.f49164w = (CardView) view.findViewById(a7.f.f12178J1);
            this.f49165x = (TextView) view.findViewById(a7.f.Ul);
            this.f49166y = (ImageView) view.findViewById(a7.f.f12406g5);
            this.f49167z = (LinearLayout) view.findViewById(a7.f.f12235O8);
        }
    }

    public C2633q(Context context, ArrayList arrayList, int i9) {
        this.f49112i = "mobile";
        this.f49127x = 0;
        this.f49108e = context;
        this.f49107d = arrayList;
        this.f49110g = new DatabaseHandler(context);
        this.f49111h = AnimationUtils.loadAnimation(context, a7.b.f11823a);
        this.f49121r = new LiveStreamDBHandler(context);
        this.f49127x = i9;
        if (new C2858a(context).A().equals(AbstractC2237a.f44453K0)) {
            this.f49112i = "tv";
        } else {
            this.f49112i = "mobile";
        }
        this.f49119p = new Handler(Looper.getMainLooper());
        if (this.f49112i.equals("mobile")) {
            try {
                this.f49117n = C2325b.e(context).c().c();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x013c A[Catch: Exception -> 0x025d, TryCatch #1 {Exception -> 0x025d, blocks: (B:3:0x0011, B:5:0x0015, B:7:0x001b, B:9:0x001f, B:11:0x0037, B:12:0x003a, B:14:0x0040, B:16:0x0046, B:18:0x004c, B:22:0x0067, B:24:0x006d, B:25:0x0070, B:27:0x0076, B:29:0x007c, B:31:0x0082, B:33:0x0088, B:35:0x008e, B:37:0x0097, B:44:0x012f, B:46:0x013c, B:48:0x014e, B:53:0x0175, B:55:0x01aa, B:57:0x01c9, B:59:0x01cd, B:60:0x01d5, B:68:0x020c, B:61:0x01d9, B:62:0x01e1, B:63:0x01e5, B:65:0x01e9, B:66:0x01f2, B:67:0x01fb, B:49:0x0154, B:50:0x015a, B:43:0x0102, B:42:0x00fc, B:41:0x00d0, B:69:0x0248, B:71:0x0258, B:39:0x00b3), top: B:76:0x0011, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015a A[Catch: Exception -> 0x025d, TryCatch #1 {Exception -> 0x025d, blocks: (B:3:0x0011, B:5:0x0015, B:7:0x001b, B:9:0x001f, B:11:0x0037, B:12:0x003a, B:14:0x0040, B:16:0x0046, B:18:0x004c, B:22:0x0067, B:24:0x006d, B:25:0x0070, B:27:0x0076, B:29:0x007c, B:31:0x0082, B:33:0x0088, B:35:0x008e, B:37:0x0097, B:44:0x012f, B:46:0x013c, B:48:0x014e, B:53:0x0175, B:55:0x01aa, B:57:0x01c9, B:59:0x01cd, B:60:0x01d5, B:68:0x020c, B:61:0x01d9, B:62:0x01e1, B:63:0x01e5, B:65:0x01e9, B:66:0x01f2, B:67:0x01fb, B:49:0x0154, B:50:0x015a, B:43:0x0102, B:42:0x00fc, B:41:0x00d0, B:69:0x0248, B:71:0x0258, B:39:0x00b3), top: B:76:0x0011, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01aa A[Catch: Exception -> 0x025d, TryCatch #1 {Exception -> 0x025d, blocks: (B:3:0x0011, B:5:0x0015, B:7:0x001b, B:9:0x001f, B:11:0x0037, B:12:0x003a, B:14:0x0040, B:16:0x0046, B:18:0x004c, B:22:0x0067, B:24:0x006d, B:25:0x0070, B:27:0x0076, B:29:0x007c, B:31:0x0082, B:33:0x0088, B:35:0x008e, B:37:0x0097, B:44:0x012f, B:46:0x013c, B:48:0x014e, B:53:0x0175, B:55:0x01aa, B:57:0x01c9, B:59:0x01cd, B:60:0x01d5, B:68:0x020c, B:61:0x01d9, B:62:0x01e1, B:63:0x01e5, B:65:0x01e9, B:66:0x01f2, B:67:0x01fb, B:49:0x0154, B:50:0x015a, B:43:0x0102, B:42:0x00fc, B:41:0x00d0, B:69:0x0248, B:71:0x0258, B:39:0x00b3), top: B:76:0x0011, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fb A[Catch: Exception -> 0x025d, TryCatch #1 {Exception -> 0x025d, blocks: (B:3:0x0011, B:5:0x0015, B:7:0x001b, B:9:0x001f, B:11:0x0037, B:12:0x003a, B:14:0x0040, B:16:0x0046, B:18:0x004c, B:22:0x0067, B:24:0x006d, B:25:0x0070, B:27:0x0076, B:29:0x007c, B:31:0x0082, B:33:0x0088, B:35:0x008e, B:37:0x0097, B:44:0x012f, B:46:0x013c, B:48:0x014e, B:53:0x0175, B:55:0x01aa, B:57:0x01c9, B:59:0x01cd, B:60:0x01d5, B:68:0x020c, B:61:0x01d9, B:62:0x01e1, B:63:0x01e5, B:65:0x01e9, B:66:0x01f2, B:67:0x01fb, B:49:0x0154, B:50:0x015a, B:43:0x0102, B:42:0x00fc, B:41:0x00d0, B:69:0x0248, B:71:0x0258, B:39:0x00b3), top: B:76:0x0011, inners: #0 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(androidx.recyclerview.widget.RecyclerView.D r20, int r21) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C2633q.E(androidx.recyclerview.widget.RecyclerView$D, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public RecyclerView.D L(ViewGroup viewGroup, int i9) {
        LayoutInflater layoutInflaterFrom;
        int i10;
        if (this.f49112i.equals("tv")) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12898w3;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12892v3;
        }
        return new k(layoutInflaterFrom.inflate(i10, viewGroup, false));
    }

    public int m0() {
        return this.f49115l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        ArrayList arrayList = this.f49107d;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        return this.f49107d.size();
    }

    public void n0(m7.c cVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int p(int i9) {
        return 0;
    }
}
