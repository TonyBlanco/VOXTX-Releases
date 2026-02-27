package q7;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.database.ExternalPlayerDataBase;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import com.nst.iptvsmarterstvbox.view.activity.RecordingActivity;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import m7.AbstractC2237a;
import u7.C2858a;
import w7.AbstractC2941e;
import w7.C2937a;
import w7.C2939c;
import w7.C2940d;

/* JADX INFO: loaded from: classes4.dex */
public class Q extends RecyclerView.g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static C2858a f47375m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static String f47376n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f47377o;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f47378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f47379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Date f47380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DateFormat f47381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SimpleDateFormat f47382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f47383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f47384j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RecordingActivity f47385k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f47386l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f47387a;

        public a(int i9) {
            this.f47387a = i9;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Q q9 = Q.this;
            q9.z0(view, this.f47387a, q9.f47386l);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class c implements PopupMenu.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f47390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f47391b;

        public c(ArrayList arrayList, int i9) {
            this.f47390a = arrayList;
            this.f47391b = i9;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            r6 = new android.content.Intent(r9.f47392c.f47385k, (java.lang.Class<?>) com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity.class);
            r6.putExtra("url", ((java.io.File) r9.f47390a.get(r9.f47391b)).getAbsolutePath());
            r6.putExtra("app_name", ((com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass) r9.f47392c.f47378d.get(r5)).getAppname());
            r6.putExtra("packagename", ((com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass) r9.f47392c.f47378d.get(r5)).getPackagename());
            r9.f47392c.f47385k.startActivity(r6);
         */
        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onMenuItemClick(android.view.MenuItem r10) {
            /*
                Method dump skipped, instruction units count: 482
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.Q.c.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    public class d implements PopupMenu.OnDismissListener {
        public d() {
        }

        @Override // android.widget.PopupMenu.OnDismissListener
        public void onDismiss(PopupMenu popupMenu) {
        }
    }

    public static class e extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f47394t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f47395u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TextView f47396v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public TextView f47397w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public ImageView f47398x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public LinearLayout f47399y;

        public e(View view) {
            super(view);
            this.f47394t = (TextView) view.findViewById(a7.f.ql);
            this.f47395u = (TextView) view.findViewById(a7.f.qj);
            this.f47396v = (TextView) view.findViewById(a7.f.xi);
            this.f47397w = (TextView) view.findViewById(a7.f.em);
            this.f47398x = (ImageView) view.findViewById(a7.f.f12317X4);
            this.f47399y = (LinearLayout) view.findViewById(a7.f.f12165H8);
            J(false);
        }
    }

    public class f implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f47400a;

        public f(View view) {
            this.f47400a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47400a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47400a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47400a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            int i9;
            if (z9) {
                f9 = z9 ? 1.05f : 1.0f;
                b(f9);
                c(f9);
                Log.e("id is", "" + this.f47400a.getTag());
                view2 = this.f47400a;
                i9 = a7.e.f12049q2;
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.05f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                view2 = this.f47400a;
                i9 = a7.e.f12045p2;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public Q(RecordingActivity recordingActivity, ArrayList arrayList) {
        String str;
        String str2;
        this.f47379e = Boolean.TRUE;
        new ArrayList();
        this.f47386l = arrayList;
        this.f47385k = recordingActivity;
        this.f47383i = m7.w.S0(C2937a.a());
        f47376n = recordingActivity.getApplicationContext().getPackageName();
        f47377o = s0(recordingActivity);
        this.f47384j = m7.w.S0(C2940d.d());
        Locale locale = Locale.US;
        this.f47382h = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f47381g = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f47380f = new Date();
        SimpleDateFormat simpleDateFormat = this.f47382h;
        if (r0(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(recordingActivity))), this.f47381g.format(this.f47380f)) < C2939c.p() || (str = this.f47383i) == null || this.f47384j == null) {
            return;
        }
        if (f47377o.equals(str) && (this.f47383i == null || (str2 = this.f47384j) == null || f47376n.equals(str2))) {
            return;
        }
        this.f47379e = Boolean.FALSE;
    }

    public static long r0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    public static String s0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f47386l.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public void E(e eVar, int i9) {
        File file;
        TextView textView;
        StringBuilder sb;
        String str;
        ArrayList arrayList = this.f47386l;
        if (arrayList == null || (file = (File) arrayList.get(i9)) == null) {
            return;
        }
        String string = this.f47385k.getSharedPreferences("timeFormat", 0).getString("timeFormat", AbstractC2237a.f44441E0);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(string, locale);
        Date date = new Date(file.lastModified());
        Date date2 = new Date(file.lastModified());
        float length = (file.length() / 1024.0f) / 1024.0f;
        String name = file.getName();
        eVar.f47394t.setText(name.substring(0, 1).toUpperCase() + name.substring(1));
        TextView textView2 = eVar.f47394t;
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        if (length > 1024.0f) {
            textView = eVar.f47395u;
            sb = new StringBuilder();
            sb.append((float) (Math.round(((double) (length / 1024.0f)) * 100.0d) / 100.0d));
            str = " GB";
        } else {
            textView = eVar.f47395u;
            sb = new StringBuilder();
            sb.append((float) (Math.round(((double) length) * 100.0d) / 100.0d));
            str = " MB";
        }
        sb.append(str);
        textView.setText(sb.toString());
        eVar.f47396v.setText(simpleDateFormat.format(date));
        eVar.f47397w.setText(simpleDateFormat2.format(date2));
        LinearLayout linearLayout = eVar.f47399y;
        linearLayout.setOnFocusChangeListener(new f(linearLayout));
        eVar.f47399y.setOnClickListener(new a(i9));
        eVar.f47398x.setOnClickListener(new b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public e L(ViewGroup viewGroup, int i9) {
        return new e(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12809h4, viewGroup, false));
    }

    public final void z0(View view, int i9, ArrayList arrayList) {
        PopupMenu popupMenu = new PopupMenu(this.f47385k, view);
        popupMenu.getMenuInflater().inflate(a7.h.f12933p, popupMenu.getMenu());
        this.f47378d = new ArrayList();
        ArrayList<ExternalPlayerModelClass> externalPlayer = new ExternalPlayerDataBase(this.f47385k).getExternalPlayer();
        this.f47378d = externalPlayer;
        if (externalPlayer != null && externalPlayer.size() > 0) {
            for (int i10 = 0; i10 < this.f47378d.size(); i10++) {
                try {
                    popupMenu.getMenu().add(0, i10, i10, this.f47385k.getResources().getString(a7.j.f13272h5) + " " + ((ExternalPlayerModelClass) this.f47378d.get(i10)).getAppname());
                } catch (Exception unused) {
                }
            }
        }
        popupMenu.setOnMenuItemClickListener(new c(arrayList, i9));
        popupMenu.setOnDismissListener(new d());
        popupMenu.show();
    }
}
