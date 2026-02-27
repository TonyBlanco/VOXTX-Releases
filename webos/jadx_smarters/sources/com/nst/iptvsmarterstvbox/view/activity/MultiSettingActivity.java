package com.nst.iptvsmarterstvbox.view.activity;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import m7.AbstractC2237a;
import m7.w;
import org.apache.http.client.config.CookieSpecs;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class MultiSettingActivity extends androidx.appcompat.app.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f30949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f30950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f30951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CheckBox f30952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f30953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f30954i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f30955j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f30956k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f30957l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f30958m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f30959n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f30960o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f30961p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PopupWindow f30962q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C2858a f30963r;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MultiSettingActivity multiSettingActivity = MultiSettingActivity.this;
            multiSettingActivity.y1(multiSettingActivity.f30954i);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MultiSettingActivity.this.z1();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MultiSettingActivity.this.onBackPressed();
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f30967a;

        public d(Context context) {
            this.f30967a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharepreferenceDBHandler.setScreenTYPE(CookieSpecs.DEFAULT, this.f30967a);
            MultiSettingActivity multiSettingActivity = MultiSettingActivity.this;
            multiSettingActivity.f30953h.setImageDrawable(multiSettingActivity.getResources().getDrawable(a7.e.f11929K));
            MultiSettingActivity.this.f30962q.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MultiSettingActivity multiSettingActivity = MultiSettingActivity.this;
            multiSettingActivity.f30961p = "screen1";
            multiSettingActivity.f30953h.setImageDrawable(multiSettingActivity.getResources().getDrawable(a7.e.f11899C1));
            MultiSettingActivity.this.f30962q.dismiss();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MultiSettingActivity multiSettingActivity = MultiSettingActivity.this;
            multiSettingActivity.f30961p = "screen2";
            multiSettingActivity.f30953h.setImageDrawable(multiSettingActivity.getResources().getDrawable(a7.e.f11903D1));
            MultiSettingActivity.this.f30962q.dismiss();
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MultiSettingActivity multiSettingActivity = MultiSettingActivity.this;
            multiSettingActivity.f30961p = "screen3";
            multiSettingActivity.f30953h.setImageDrawable(multiSettingActivity.getResources().getDrawable(a7.e.f11907E1));
            MultiSettingActivity.this.f30962q.dismiss();
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MultiSettingActivity multiSettingActivity = MultiSettingActivity.this;
            multiSettingActivity.f30961p = "screen4";
            multiSettingActivity.f30953h.setImageDrawable(multiSettingActivity.getResources().getDrawable(a7.e.f11911F1));
            MultiSettingActivity.this.f30962q.dismiss();
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MultiSettingActivity multiSettingActivity = MultiSettingActivity.this;
            multiSettingActivity.f30961p = "screen5";
            multiSettingActivity.f30953h.setImageDrawable(multiSettingActivity.getResources().getDrawable(a7.e.f11915G1));
            MultiSettingActivity.this.f30962q.dismiss();
        }
    }

    public class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f30974a;

        public j(View view) {
            this.f30974a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30974a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30974a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30974a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            int i9;
            if (!z9) {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                if ((this.f30974a.getTag() == null || !this.f30974a.getTag().equals("1")) && ((this.f30974a.getTag() == null || !this.f30974a.getTag().equals("2")) && (this.f30974a.getTag() == null || !this.f30974a.getTag().equals("3")))) {
                    return;
                }
                this.f30974a.setBackgroundResource(a7.e.f12038o);
                return;
            }
            f9 = z9 ? 1.09f : 1.0f;
            if (this.f30974a.getTag() != null && this.f30974a.getTag().equals("1")) {
                view2 = this.f30974a;
                i9 = a7.e.f12042p;
            } else if (this.f30974a.getTag() != null && this.f30974a.getTag().equals("2")) {
                view2 = this.f30974a;
                i9 = a7.e.f12010h;
            } else {
                if (this.f30974a.getTag() == null || !this.f30974a.getTag().equals("3")) {
                    return;
                }
                view2 = this.f30974a;
                i9 = a7.e.f12024k1;
            }
            view2.setBackgroundResource(i9);
            b(f9);
            c(f9);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void x1() {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.MultiSettingActivity.x1():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z1() {
        SharepreferenceDBHandler.setScreenTYPE(this.f30961p, this.f30954i);
        Boolean bool = this.f30952g.isChecked() ? Boolean.TRUE : Boolean.FALSE;
        SharepreferenceDBHandler.setValueChecked(bool, this.f30954i);
        SharepreferenceDBHandler.setShowPop(bool, this.f30954i);
        Toast.makeText(this.f30954i, getResources().getString(a7.j.f13302k5), 0).show();
        onBackPressed();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f30954i = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f30954i);
        this.f30963r = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12752Z : a7.g.f12746Y);
        w.Y(this);
        this.f30949d = (Button) findViewById(a7.f.f12402g1);
        this.f30950e = (Button) findViewById(a7.f.Jf);
        this.f30951f = (Button) findViewById(a7.f.f12401g0);
        this.f30952g = (CheckBox) findViewById(a7.f.hg);
        this.f30953h = (ImageView) findViewById(a7.f.Sf);
        x1();
    }

    public final void y1(Context context) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(new C2858a(context).A().equals(AbstractC2237a.f44453K0) ? a7.g.f12863q4 : a7.g.f12857p4, (LinearLayout) findViewById(a7.f.Rf));
        this.f30955j = (ImageView) viewInflate.findViewById(a7.f.f12139F2);
        this.f30956k = (ImageView) viewInflate.findViewById(a7.f.Mf);
        this.f30957l = (ImageView) viewInflate.findViewById(a7.f.Nf);
        this.f30958m = (ImageView) viewInflate.findViewById(a7.f.Of);
        this.f30959n = (ImageView) viewInflate.findViewById(a7.f.Pf);
        this.f30960o = (ImageView) viewInflate.findViewById(a7.f.Qf);
        PopupWindow popupWindow = new PopupWindow(context);
        this.f30962q = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f30962q.setWidth(-1);
        this.f30962q.setHeight(-1);
        this.f30962q.setFocusable(true);
        this.f30962q.showAtLocation(viewInflate, 0, 0, 0);
        this.f30955j.setOnClickListener(new d(context));
        this.f30956k.setOnClickListener(new e());
        this.f30957l.setOnClickListener(new f());
        this.f30958m.setOnClickListener(new g());
        this.f30959n.setOnClickListener(new h());
        this.f30960o.setOnClickListener(new i());
    }
}
