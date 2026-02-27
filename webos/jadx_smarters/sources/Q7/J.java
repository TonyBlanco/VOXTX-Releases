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
public class J extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Typeface f47230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f47231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f47232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f47233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ParentalControlActivitity f47234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f47235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f47236j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f47237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SharedPreferences f47238l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LiveStreamDBHandler f47239m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PasswordStatusDBModel f47240n;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47241a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f47242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47243d;

        public a(String str, d dVar, String str2) {
            this.f47241a = str;
            this.f47242c = dVar;
            this.f47243d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context;
            StringBuilder sb;
            Resources resources;
            int i9;
            J j9 = J.this;
            j9.f47240n = j9.f47239m.getPasswordStatus(J.this.f47237k, this.f47241a, SharepreferenceDBHandler.getUserID(J.this.f47236j));
            if (J.this.f47240n == null || J.this.f47240n.getPasswordStatus() == null || !J.this.f47240n.getPasswordStatus().equals("1")) {
                if (J.this.f47240n != null && J.this.f47240n.getPasswordStatus() != null && J.this.f47240n.getPasswordStatus().equals("0")) {
                    this.f47242c.f47254w.setImageResource(a7.e.f11984a1);
                    J.this.f47239m.updatePasswordStatus(J.this.f47237k, this.f47241a, "1", SharepreferenceDBHandler.getUserID(J.this.f47236j));
                    if (J.this.f47236j == null) {
                        return;
                    }
                    context = J.this.f47236j;
                    sb = new StringBuilder();
                } else {
                    if (J.this.f47240n == null) {
                        return;
                    }
                    J.this.f47240n.setPasswordStatusCategoryId(this.f47241a);
                    J.this.f47240n.setPasswordStatusUserDetail(J.this.f47237k);
                    J.this.f47240n.setPasswordStatus("1");
                    J.this.f47240n.setUserID(SharepreferenceDBHandler.getUserID(J.this.f47236j));
                    J.this.f47239m.addPasswordStatus(J.this.f47240n);
                    this.f47242c.f47254w.setImageResource(a7.e.f11984a1);
                    if (J.this.f47236j == null) {
                        return;
                    }
                    context = J.this.f47236j;
                    sb = new StringBuilder();
                }
                resources = J.this.f47236j.getResources();
                i9 = a7.j.f13200a3;
            } else {
                this.f47242c.f47254w.setImageResource(a7.e.f11988b1);
                J.this.f47239m.updatePasswordStatus(J.this.f47237k, this.f47241a, "0", SharepreferenceDBHandler.getUserID(J.this.f47236j));
                if (J.this.f47236j == null) {
                    return;
                }
                context = J.this.f47236j;
                sb = new StringBuilder();
                resources = J.this.f47236j.getResources();
                i9 = a7.j.f13285i8;
            }
            sb.append(resources.getString(i9));
            sb.append(" ");
            sb.append(this.f47243d);
            m7.w.P0(context, sb.toString());
        }
    }

    public class b implements View.OnKeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f47245a;

        public b(d dVar) {
            this.f47245a = dVar;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i9, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i9 != 23 && i9 != 66) {
                return false;
            }
            this.f47245a.f47252u.performClick();
            return true;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47247a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f47248c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                J j9;
                ArrayList arrayList;
                if (!TextUtils.isEmpty(c.this.f47247a)) {
                    if (J.this.f47232f.size() == 0) {
                        J j10 = J.this;
                        j10.f47231e = j10.f47232f;
                        c.this.f47248c.setVisibility(0);
                        if (J.this.f47236j != null) {
                            c cVar = c.this;
                            cVar.f47248c.setText(J.this.f47236j.getResources().getString(a7.j.f13441y4));
                        }
                    } else if (!J.this.f47232f.isEmpty() || J.this.f47232f.isEmpty()) {
                        j9 = J.this;
                        arrayList = j9.f47232f;
                    }
                    J.this.w();
                }
                j9 = J.this;
                arrayList = j9.f47233g;
                j9.f47231e = arrayList;
                c.this.f47248c.setVisibility(4);
                J.this.w();
            }
        }

        public c(String str, TextView textView) {
            this.f47247a = str;
            this.f47248c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            J.this.f47232f = new ArrayList();
            if (J.this.f47232f != null) {
                J.this.f47232f.clear();
            }
            if (TextUtils.isEmpty(this.f47247a)) {
                J.this.f47232f.addAll(J.this.f47233g);
            } else {
                for (LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel : J.this.f47233g) {
                    if (liveStreamCategoryIdDBModel.getLiveStreamCategoryName().toLowerCase().contains(this.f47247a.toLowerCase())) {
                        J.this.f47232f.add(liveStreamCategoryIdDBModel);
                    }
                }
            }
            ((Activity) J.this.f47236j).runOnUiThread(new a());
        }
    }

    public class d extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f47251t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public RelativeLayout f47252u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public RelativeLayout f47253v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ImageView f47254w;

        public d(View view) {
            super(view);
            this.f47251t = (TextView) view.findViewById(a7.f.ci);
            this.f47252u = (RelativeLayout) view.findViewById(a7.f.be);
            this.f47253v = (RelativeLayout) view.findViewById(a7.f.ce);
            this.f47254w = (ImageView) view.findViewById(a7.f.f12528s5);
        }
    }

    public J(ArrayList arrayList, Context context, ParentalControlActivitity parentalControlActivitity, Typeface typeface) {
        this.f47237k = "";
        this.f47231e = arrayList;
        this.f47236j = context;
        this.f47234h = parentalControlActivitity;
        this.f47230d = typeface;
        this.f47233g = arrayList;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
            this.f47238l = sharedPreferences;
            this.f47237k = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
            this.f47239m = new LiveStreamDBHandler(context);
            this.f47240n = new PasswordStatusDBModel();
        }
    }

    public final void A0(d dVar, String str) {
        this.f47239m.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f47236j));
        this.f47240n = this.f47239m.getPasswordStatus(this.f47237k, str, SharepreferenceDBHandler.getUserID(this.f47236j));
        int i9 = Build.VERSION.SDK_INT;
        if (i9 <= 21) {
            dVar.f47254w.setImageResource(a7.e.f11988b1);
        }
        dVar.f47254w.setImageDrawable(this.f47236j.getResources().getDrawable(a7.e.f11988b1, null));
        PasswordStatusDBModel passwordStatusDBModel = this.f47240n;
        if (passwordStatusDBModel == null || passwordStatusDBModel.getPasswordStatus() == null || !this.f47240n.getPasswordStatus().equals("1")) {
            return;
        }
        if (i9 <= 21) {
            dVar.f47254w.setImageResource(a7.e.f11984a1);
        }
        dVar.f47254w.setImageDrawable(this.f47236j.getResources().getDrawable(a7.e.f11984a1, null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f47231e.size();
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
        ArrayList arrayList = this.f47231e;
        if (arrayList != null) {
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = (LiveStreamCategoryIdDBModel) arrayList.get(i9);
            String liveStreamCategoryID = liveStreamCategoryIdDBModel.getLiveStreamCategoryID();
            String liveStreamCategoryName = liveStreamCategoryIdDBModel.getLiveStreamCategoryName();
            A0(dVar, liveStreamCategoryID);
            dVar.f47251t.setText(liveStreamCategoryIdDBModel.getLiveStreamCategoryName());
            dVar.f47252u.setOnClickListener(new a(liveStreamCategoryID, dVar, liveStreamCategoryName));
        }
        dVar.f47253v.setOnKeyListener(new b(dVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public d L(ViewGroup viewGroup, int i9) {
        d dVar = new d(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12820j3, viewGroup, false));
        this.f47235i = dVar;
        return dVar;
    }
}
