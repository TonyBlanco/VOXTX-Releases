package q7;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.ParentalControlActivitity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class L extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Typeface f47262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f47263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f47264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f47265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ParentalControlActivitity f47266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f47267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f47268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f47269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SharedPreferences f47270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LiveStreamDBHandler f47271m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PasswordStatusDBModel f47272n;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47273a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f47274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47275d;

        public a(String str, d dVar, String str2) {
            this.f47273a = str;
            this.f47274c = dVar;
            this.f47275d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context;
            StringBuilder sb;
            Resources resources;
            int i9;
            L l9 = L.this;
            l9.f47272n = l9.f47271m.getPasswordStatus(L.this.f47269k, this.f47273a, SharepreferenceDBHandler.getUserID(L.this.f47268j));
            if (L.this.f47272n == null || L.this.f47272n.getPasswordStatus() == null || !L.this.f47272n.getPasswordStatus().equals("1")) {
                if (L.this.f47272n != null && L.this.f47272n.getPasswordStatus() != null && L.this.f47272n.getPasswordStatus().equals("0")) {
                    this.f47274c.f47286w.setImageResource(a7.e.f11984a1);
                    L.this.f47271m.updatePasswordStatus(L.this.f47269k, this.f47273a, "1", SharepreferenceDBHandler.getUserID(L.this.f47268j));
                    if (L.this.f47268j == null) {
                        return;
                    }
                    context = L.this.f47268j;
                    sb = new StringBuilder();
                } else {
                    if (L.this.f47272n == null) {
                        return;
                    }
                    L.this.f47272n.setPasswordStatusCategoryId(this.f47273a);
                    L.this.f47272n.setPasswordStatusUserDetail(L.this.f47269k);
                    L.this.f47272n.setPasswordStatus("1");
                    L.this.f47272n.setUserID(SharepreferenceDBHandler.getUserID(L.this.f47268j));
                    L.this.f47271m.addPasswordStatus(L.this.f47272n);
                    this.f47274c.f47286w.setImageResource(a7.e.f11984a1);
                    if (L.this.f47268j == null) {
                        return;
                    }
                    context = L.this.f47268j;
                    sb = new StringBuilder();
                }
                resources = L.this.f47268j.getResources();
                i9 = a7.j.f13200a3;
            } else {
                this.f47274c.f47286w.setImageResource(a7.e.f11988b1);
                L.this.f47271m.updatePasswordStatus(L.this.f47269k, this.f47273a, "0", SharepreferenceDBHandler.getUserID(L.this.f47268j));
                if (L.this.f47268j == null) {
                    return;
                }
                context = L.this.f47268j;
                sb = new StringBuilder();
                resources = L.this.f47268j.getResources();
                i9 = a7.j.f13285i8;
            }
            sb.append(resources.getString(i9));
            sb.append(" ");
            sb.append(this.f47275d);
            m7.w.P0(context, sb.toString());
        }
    }

    public class b implements View.OnKeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f47277a;

        public b(d dVar) {
            this.f47277a = dVar;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i9, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i9 != 23 && i9 != 66) {
                return false;
            }
            this.f47277a.f47284u.performClick();
            return true;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47279a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f47280c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                L l9;
                ArrayList arrayList;
                if (!TextUtils.isEmpty(c.this.f47279a)) {
                    if (L.this.f47264f.size() == 0) {
                        L l10 = L.this;
                        l10.f47263e = l10.f47264f;
                        c.this.f47280c.setVisibility(0);
                        if (L.this.f47268j != null) {
                            c cVar = c.this;
                            cVar.f47280c.setText(L.this.f47268j.getResources().getString(a7.j.f13441y4));
                        }
                    } else if (!L.this.f47264f.isEmpty() || L.this.f47264f.isEmpty()) {
                        l9 = L.this;
                        arrayList = l9.f47264f;
                    }
                    L.this.w();
                }
                l9 = L.this;
                arrayList = l9.f47265g;
                l9.f47263e = arrayList;
                c.this.f47280c.setVisibility(4);
                L.this.w();
            }
        }

        public c(String str, TextView textView) {
            this.f47279a = str;
            this.f47280c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            L.this.f47264f = new ArrayList();
            if (L.this.f47264f != null) {
                L.this.f47264f.clear();
            }
            if (TextUtils.isEmpty(this.f47279a)) {
                L.this.f47264f.addAll(L.this.f47265g);
            } else {
                for (LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel : L.this.f47265g) {
                    if (liveStreamCategoryIdDBModel.getLiveStreamCategoryName().toLowerCase().contains(this.f47279a.toLowerCase())) {
                        L.this.f47264f.add(liveStreamCategoryIdDBModel);
                    }
                }
            }
            ((Activity) L.this.f47268j).runOnUiThread(new a());
        }
    }

    public class d extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f47283t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public RelativeLayout f47284u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public RelativeLayout f47285v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ImageView f47286w;

        public d(View view) {
            super(view);
            this.f47283t = (TextView) view.findViewById(a7.f.ci);
            this.f47284u = (RelativeLayout) view.findViewById(a7.f.be);
            this.f47285v = (RelativeLayout) view.findViewById(a7.f.ce);
            this.f47286w = (ImageView) view.findViewById(a7.f.f12528s5);
        }
    }

    public L(ArrayList arrayList, Context context, ParentalControlActivitity parentalControlActivitity, Typeface typeface) {
        this.f47269k = "";
        this.f47263e = arrayList;
        this.f47268j = context;
        this.f47266h = parentalControlActivitity;
        this.f47262d = typeface;
        this.f47265g = arrayList;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
            this.f47270l = sharedPreferences;
            this.f47269k = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
            this.f47271m = new LiveStreamDBHandler(context);
            this.f47272n = new PasswordStatusDBModel();
        }
    }

    public final void A0(d dVar, String str) {
        this.f47271m.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f47268j));
        this.f47272n = this.f47271m.getPasswordStatus(this.f47269k, str, SharepreferenceDBHandler.getUserID(this.f47268j));
        int i9 = Build.VERSION.SDK_INT;
        if (i9 <= 21) {
            dVar.f47286w.setImageResource(a7.e.f11988b1);
        }
        dVar.f47286w.setImageDrawable(this.f47268j.getResources().getDrawable(a7.e.f11988b1, null));
        PasswordStatusDBModel passwordStatusDBModel = this.f47272n;
        if (passwordStatusDBModel == null || passwordStatusDBModel.getPasswordStatus() == null || !this.f47272n.getPasswordStatus().equals("1")) {
            return;
        }
        if (i9 <= 21) {
            dVar.f47286w.setImageResource(a7.e.f11984a1);
        }
        dVar.f47286w.setImageDrawable(this.f47268j.getResources().getDrawable(a7.e.f11984a1, null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f47263e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int p(int i9) {
        return 0;
    }

    public void t0(String str, TextView textView, ProgressDialog progressDialog) {
        new Thread(new c(str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public void E(d dVar, int i9) {
        ArrayList arrayList = this.f47263e;
        if (arrayList != null) {
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = (LiveStreamCategoryIdDBModel) arrayList.get(i9);
            String liveStreamCategoryID = liveStreamCategoryIdDBModel.getLiveStreamCategoryID();
            String liveStreamCategoryName = liveStreamCategoryIdDBModel.getLiveStreamCategoryName();
            A0(dVar, liveStreamCategoryID);
            dVar.f47283t.setText(liveStreamCategoryIdDBModel.getLiveStreamCategoryName());
            dVar.f47284u.setOnClickListener(new a(liveStreamCategoryID, dVar, liveStreamCategoryName));
        }
        dVar.f47285v.setOnKeyListener(new b(dVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public d L(ViewGroup viewGroup, int i9) {
        d dVar = new d(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12820j3, viewGroup, false));
        this.f47267i = dVar;
        return dVar;
    }
}
