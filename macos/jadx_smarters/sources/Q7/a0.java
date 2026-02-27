package q7;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.Listsingleton;
import com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import k.U;
import m7.AbstractC2237a;

/* JADX INFO: loaded from: classes4.dex */
public class a0 extends RecyclerView.g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static SharedPreferences f48087s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f48090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f48091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f48092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f48093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f48094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f48095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f48096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f48097m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f48098n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f48099o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SharedPreferences f48100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f48101q = new SimpleDateFormat("dd-MMM-yyyy", Locale.US).format(new Date());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f48102r = "";

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48103a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48104c;

        public a(String str, String str2) {
            this.f48103a = str;
            this.f48104c = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!AbstractC2237a.f44475V0.booleanValue() || !AbstractC2237a.f44498e1.equalsIgnoreCase("1")) {
                a0.this.l0(view, this.f48103a, this.f48104c);
                return;
            }
            if (SharepreferenceDBHandler.getEventAdsView(a0.this.f48098n) >= AbstractC2237a.f44501f1) {
                SharepreferenceDBHandler.setEventAdsView(0, a0.this.f48098n);
            } else {
                if (SharepreferenceDBHandler.getEventAdsView(a0.this.f48098n) != 0 || !SharepreferenceDBHandler.getFirstTimeAdsShow(a0.this.f48098n)) {
                    a0.this.l0(view, this.f48103a, this.f48104c);
                    SharepreferenceDBHandler.setEventAdsView(SharepreferenceDBHandler.getEventAdsView(a0.this.f48098n) + 1, a0.this.f48098n);
                    return;
                }
                SharepreferenceDBHandler.setFirstTimeAdsShow(false, a0.this.f48098n);
            }
            a0.this.n0(view, this.f48103a, this.f48104c);
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48106a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48107c;

        public b(String str, String str2) {
            this.f48106a = str;
            this.f48107c = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!AbstractC2237a.f44475V0.booleanValue() || !AbstractC2237a.f44498e1.equalsIgnoreCase("1")) {
                a0.this.l0(view, this.f48106a, this.f48107c);
                return;
            }
            if (SharepreferenceDBHandler.getEventAdsView(a0.this.f48098n) >= AbstractC2237a.f44501f1) {
                SharepreferenceDBHandler.setEventAdsView(0, a0.this.f48098n);
            } else {
                if (SharepreferenceDBHandler.getEventAdsView(a0.this.f48098n) != 0 || !SharepreferenceDBHandler.getFirstTimeAdsShow(a0.this.f48098n)) {
                    a0.this.l0(view, this.f48106a, this.f48107c);
                    SharepreferenceDBHandler.setEventAdsView(SharepreferenceDBHandler.getEventAdsView(a0.this.f48098n) + 1, a0.this.f48098n);
                    return;
                }
                SharepreferenceDBHandler.setFirstTimeAdsShow(false, a0.this.f48098n);
            }
            a0.this.n0(view, this.f48106a, this.f48107c);
        }
    }

    public class c implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f48109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f48110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f48112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48114f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48115g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48116h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48117i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48118j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f48119k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f48120l;

        public c(ArrayList arrayList, Context context, String str, int i9, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.f48109a = arrayList;
            this.f48110b = context;
            this.f48111c = str;
            this.f48112d = i9;
            this.f48113e = str2;
            this.f48114f = str3;
            this.f48115g = str4;
            this.f48116h = str5;
            this.f48117i = str6;
            this.f48118j = str7;
            this.f48119k = str8;
            this.f48120l = str9;
        }

        @Override // k.U.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                ArrayList arrayList = this.f48109a;
                if (arrayList != null && arrayList.size() > 0) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < this.f48109a.size()) {
                            if (menuItem.getItemId() != i9) {
                                i9++;
                            } else if (menuItem.getItemId() == 0) {
                                m7.w.u0(this.f48110b, this.f48111c, this.f48112d, this.f48113e, this.f48114f, this.f48115g, this.f48116h, this.f48117i, this.f48118j, this.f48119k, this.f48120l);
                            } else {
                                String strT = m7.w.T(this.f48110b, this.f48112d, this.f48117i, this.f48119k);
                                Intent intent = new Intent(this.f48110b, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", strT);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f48109a.get(i9)).getAppname());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f48109a.get(i9)).getPackagename());
                                this.f48110b.startActivity(intent);
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

    public class d implements U.c {
        public d() {
        }

        @Override // k.U.c
        public void a(k.U u9) {
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48123a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Dialog f48125d;

        public e(String str, String str2, Dialog dialog) {
            this.f48123a = str;
            this.f48124c = str2;
            this.f48125d = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a0.this.l0(view, this.f48123a, this.f48124c);
            this.f48125d.dismiss();
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48127a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Dialog f48129d;

        public f(String str, String str2, Dialog dialog) {
            this.f48127a = str;
            this.f48128c = str2;
            this.f48129d = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a0.this.l0(view, this.f48127a, this.f48128c);
            this.f48129d.dismiss();
        }
    }

    public class g implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f48131a;

        public g(View view) {
            this.f48131a = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                View view2 = this.f48131a;
                if (view2 == null || view2.getTag() == null) {
                    return;
                }
                this.f48131a.getTag().equals("iv_cross");
                return;
            }
            View view3 = this.f48131a;
            if (view3 == null || view3.getTag() == null || !this.f48131a.getTag().equals("iv_cross")) {
                return;
            }
            view.setBackground(a0.this.f48098n.getResources().getDrawable(a7.e.f11933L));
        }
    }

    public static class h extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f48133t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f48134u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TextView f48135v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public RelativeLayout f48136w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public LinearLayout f48137x;

        public h(View view) {
            super(view);
            this.f48133t = (TextView) view.findViewById(a7.f.zi);
            this.f48134u = (TextView) view.findViewById(a7.f.ei);
            this.f48135v = (TextView) view.findViewById(a7.f.Ek);
            this.f48136w = (RelativeLayout) view.findViewById(a7.f.Rd);
            this.f48137x = (LinearLayout) view.findViewById(a7.f.f12195K8);
        }
    }

    public a0(ArrayList arrayList, int i9, boolean z9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Context context) {
        this.f48099o = arrayList;
        this.f48098n = context;
        this.f48088d = i9;
        this.f48089e = str;
        this.f48090f = z9;
        this.f48091g = str2;
        this.f48092h = str3;
        this.f48093i = str4;
        this.f48095k = str5;
        this.f48096l = str6;
        this.f48097m = str7;
        this.f48094j = str8;
    }

    private long m0(String str, String str2) {
        long time;
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        new Date(System.currentTimeMillis());
        new SimpleDateFormat("yyyy-MM-dd", locale);
        try {
            time = simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime();
        } catch (ParseException e9) {
            e9.printStackTrace();
            time = -1;
        }
        return (time / 1000) / 60;
    }

    public void l0(View view, String str, String str2) {
        int i9;
        try {
            i9 = Integer.parseInt(this.f48091g);
        } catch (NumberFormatException unused) {
            i9 = -1;
        }
        r0(view, this.f48098n, this.f48102r, i9, this.f48092h, this.f48093i, this.f48096l, this.f48095k, str, this.f48097m, str2, "url");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f48099o.size();
    }

    public final void n0(View view, String str, String str2) {
        if (Listsingleton.b().a() == null || Listsingleton.b().a().size() <= 0) {
            l0(view, str, str2);
            return;
        }
        List listA = Listsingleton.b().a();
        Dialog dialog = new Dialog(this.f48098n, a7.k.f13462g);
        dialog.requestWindowFeature(1);
        dialog.setContentView(a7.g.f12682N1);
        dialog.getWindow().setBackgroundDrawable(null);
        dialog.getWindow().setLayout(-1, -2);
        dialog.setCancelable(false);
        ImageView imageView = (ImageView) dialog.findViewById(a7.f.f12201L4);
        ImageView imageView2 = (ImageView) dialog.findViewById(a7.f.f12308W4);
        LinearLayout linearLayout = (LinearLayout) dialog.findViewById(a7.f.f12114C7);
        imageView2.setOnClickListener(new e(str, str2, dialog));
        linearLayout.setOnClickListener(new f(str, str2, dialog));
        imageView2.setOnFocusChangeListener(new g(imageView2));
        imageView2.setOnFocusChangeListener(new g(imageView2));
        imageView2.setNextFocusUpId(a7.f.f12308W4);
        imageView2.setNextFocusDownId(a7.f.f12308W4);
        imageView2.setNextFocusRightId(a7.f.f12308W4);
        imageView2.setNextFocusLeftId(a7.f.f12308W4);
        imageView2.requestFocus();
        if (listA != null) {
            try {
                if (listA.size() > 0) {
                    if (listA.size() > AbstractC2237a.f44516k1) {
                        com.squareup.picasso.t.q(this.f48098n).l((String) listA.get(AbstractC2237a.f44516k1)).g(imageView);
                        AbstractC2237a.f44516k1++;
                    } else {
                        com.squareup.picasso.t.q(this.f48098n).l((String) listA.get(0)).g(imageView);
                        AbstractC2237a.f44516k1 = 1;
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        dialog.show();
        imageView2.requestFocus();
        dialog.getWindow().setBackgroundDrawableResource(a7.c.f11875z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void E(h hVar, int i9) {
        String str;
        String str2;
        String str3;
        String str4;
        RelativeLayout relativeLayout;
        Resources resources;
        int i10;
        String[] strArrSplit;
        String[] strArrSplit2;
        try {
            Context context = this.f48098n;
            if (context != null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("selectedPlayer", 0);
                this.f48100p = sharedPreferences;
                this.f48102r = sharedPreferences.getString("selectedPlayer", "");
                String start = ((XMLTVProgrammePojo) this.f48099o.get(i9)).getStart();
                String stop = ((XMLTVProgrammePojo) this.f48099o.get(i9)).getStop();
                try {
                    strArrSplit2 = start.split("T");
                    str = strArrSplit2[0];
                } catch (Exception e9) {
                    e = e9;
                    str = "";
                }
                try {
                    str2 = strArrSplit2[1].split("\\+")[0];
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                    str2 = "";
                }
                try {
                    strArrSplit = stop.split("T");
                    str3 = strArrSplit[0];
                } catch (Exception e11) {
                    e = e11;
                    str3 = "";
                }
                try {
                    str4 = strArrSplit[1].split("\\+")[0];
                } catch (Exception e12) {
                    e = e12;
                    e.printStackTrace();
                    str4 = "";
                }
                String str5 = str + " " + str2;
                String str6 = str3 + " " + str4;
                ((XMLTVProgrammePojo) this.f48099o.get(i9)).getUrl();
                SharedPreferences sharedPreferences2 = this.f48098n.getSharedPreferences("timeFormat", 0);
                f48087s = sharedPreferences2;
                new SimpleDateFormat(sharedPreferences2.getString("timeFormat", ""), Locale.US);
                String strK = m7.w.K(str5, this.f48098n);
                String strK2 = m7.w.K(str6, this.f48098n);
                DateFormat.getInstance();
                String strValueOf = String.valueOf(m0(str5, str6));
                String strS0 = s0(str5);
                String str7 = new String(Base64.decode(((XMLTVProgrammePojo) this.f48099o.get(i9)).getTitle(), 0), StandardCharsets.UTF_8);
                new SimpleDateFormat("yyyy-MM-dd");
                new SimpleDateFormat("MMMM d, yyyy");
                new SimpleDateFormat("HH:mm:ss");
                new SimpleDateFormat("HH:mm:ss");
                hVar.f48133t.setText(strK + " - " + strK2);
                hVar.f48134u.setText(str7);
                String str8 = this.f48101q;
                if (str8 != null && str8.equals(this.f48089e) && i9 == this.f48088d && this.f48090f) {
                    relativeLayout = hVar.f48136w;
                    resources = this.f48098n.getResources();
                    i10 = a7.c.f11854e;
                } else {
                    relativeLayout = hVar.f48136w;
                    resources = this.f48098n.getResources();
                    i10 = a7.c.f11846D;
                }
                relativeLayout.setBackgroundColor(resources.getColor(i10));
                hVar.f48136w.setOnClickListener(new a(strS0, strValueOf));
                hVar.f48137x.setOnClickListener(new b(strS0, strValueOf));
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public h L(ViewGroup viewGroup, int i9) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12612B3, viewGroup, false);
        if (viewInflate != null) {
            viewInflate.setFocusable(true);
        }
        return new h(viewInflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d0 A[Catch: Exception -> 0x00d5, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d5, blocks: (B:13:0x00c6, B:14:0x00d0), top: B:20:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0(android.view.View r17, android.content.Context r18, java.lang.String r19, int r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.a0.r0(android.view.View, android.content.Context, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final String s0(String str) {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        new Date(System.currentTimeMillis());
        try {
            return new SimpleDateFormat("yyyy-MM-dd:HH-mm", locale).format(simpleDateFormat.parse(str));
        } catch (ParseException e9) {
            e9.printStackTrace();
            return null;
        }
    }
}
