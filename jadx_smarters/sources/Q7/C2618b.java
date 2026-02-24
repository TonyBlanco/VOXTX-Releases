package q7;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.database.ExternalPlayerDataBase;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import com.nst.iptvsmarterstvbox.view.activity.AddedExternalPlayerActivity;
import java.util.List;
import k.U;
import m7.AbstractC2237a;
import u7.C2858a;

/* JADX INFO: renamed from: q7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2618b extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f48138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f48139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PackageManager f48140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AddedExternalPlayerActivity f48141g;

    /* JADX INFO: renamed from: q7.b$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48142a;

        public a(int i9) {
            this.f48142a = i9;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2618b c2618b = C2618b.this;
            c2618b.r0(view, ((ExternalPlayerModelClass) c2618b.f48139e.get(this.f48142a)).getAppname(), this.f48142a);
        }
    }

    /* JADX INFO: renamed from: q7.b$b, reason: collision with other inner class name */
    public class ViewOnLongClickListenerC0420b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48144a;

        public ViewOnLongClickListenerC0420b(int i9) {
            this.f48144a = i9;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            C2618b c2618b = C2618b.this;
            c2618b.r0(view, ((ExternalPlayerModelClass) c2618b.f48139e.get(this.f48144a)).getAppname(), this.f48144a);
            return true;
        }
    }

    /* JADX INFO: renamed from: q7.b$c */
    public class c implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f48147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k.U f48148c;

        public c(String str, int i9, k.U u9) {
            this.f48146a = str;
            this.f48147b = i9;
            this.f48148c = u9;
        }

        @Override // k.U.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (menuItem.getItemId() != a7.f.Jb) {
                return false;
            }
            C2618b.this.s0(this.f48146a, this.f48147b);
            this.f48148c.a();
            return false;
        }
    }

    /* JADX INFO: renamed from: q7.b$d */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PopupWindow f48150a;

        public d(PopupWindow popupWindow) {
            this.f48150a = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PopupWindow popupWindow = this.f48150a;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f48150a.dismiss();
        }
    }

    /* JADX INFO: renamed from: q7.b$e */
    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48152a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ PopupWindow f48154d;

        public e(String str, int i9, PopupWindow popupWindow) {
            this.f48152a = str;
            this.f48153c = i9;
            this.f48154d = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context;
            String string;
            if (new ExternalPlayerDataBase(C2618b.this.f48138d).removePlayer(this.f48152a) > 0) {
                C2618b.this.f48139e.remove(this.f48153c);
                C2618b.this.w();
                C2618b.this.B(this.f48153c);
                if (C2618b.this.f48139e != null && C2618b.this.f48139e.size() == 0) {
                    C2618b.this.f48141g.A1();
                }
                context = C2618b.this.f48138d;
                string = C2618b.this.f48138d.getString(a7.j.f13253f6);
            } else {
                context = C2618b.this.f48138d;
                string = " error on Removed player";
            }
            m7.w.P0(context, string);
            PopupWindow popupWindow = this.f48154d;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f48154d.dismiss();
        }
    }

    /* JADX INFO: renamed from: q7.b$f */
    public static class f implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f48156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f48157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Context f48158c;

        public f(View view, Context context) {
            this.f48156a = view;
            this.f48158c = context;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48156a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48156a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            int i9;
            if (z9) {
                float f9 = z9 ? 1.12f : 1.0f;
                View view2 = this.f48156a;
                if (view2 == null || view2.getTag() == null || !this.f48156a.getTag().equals("1")) {
                    View view3 = this.f48156a;
                    if (view3 == null || view3.getTag() == null || !this.f48156a.getTag().equals("2")) {
                        View view4 = this.f48156a;
                        if (view4 == null || view4.getTag() == null || !this.f48156a.getTag().equals("3")) {
                            view.setBackground(this.f48157b.getResources().getDrawable(a7.e.f11923I1));
                            return;
                        } else {
                            a(f9);
                            b(f9);
                            i9 = a7.e.f12042p;
                        }
                    } else {
                        a(f9);
                        b(f9);
                        i9 = a7.e.f12024k1;
                    }
                } else {
                    a(f9);
                    b(f9);
                    i9 = a7.e.f12010h;
                }
            } else {
                if (z9) {
                    return;
                }
                a(1.0f);
                b(1.0f);
                View view5 = this.f48156a;
                if (view5 != null && view5.getTag() != null && this.f48156a.getTag().equals("1")) {
                    view.setBackgroundResource(a7.e.f12038o);
                }
                View view6 = this.f48156a;
                if (view6 != null && view6.getTag() != null && this.f48156a.getTag().equals("2")) {
                    view.setBackgroundResource(a7.e.f12038o);
                }
                View view7 = this.f48156a;
                if (view7 == null || view7.getTag() == null || !this.f48156a.getTag().equals("3")) {
                    return;
                } else {
                    i9 = a7.e.f12038o;
                }
            }
            view.setBackgroundResource(i9);
        }
    }

    /* JADX INFO: renamed from: q7.b$g */
    public class g extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f48159t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f48160u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ImageView f48161v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public LinearLayout f48162w;

        public g(View view) {
            super(view);
            this.f48159t = (TextView) view.findViewById(a7.f.Gk);
            this.f48160u = (TextView) view.findViewById(a7.f.Dh);
            this.f48161v = (ImageView) view.findViewById(a7.f.f12597z4);
            this.f48162w = (LinearLayout) view.findViewById(a7.f.g9);
        }
    }

    public C2618b(Context context, List list, AddedExternalPlayerActivity addedExternalPlayerActivity) {
        this.f48138d = context;
        this.f48139e = list;
        this.f48140f = context.getPackageManager();
        this.f48141g = addedExternalPlayerActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f48139e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void E(g gVar, int i9) {
        gVar.f48160u.setText(((ExternalPlayerModelClass) this.f48139e.get(i9)).getAppname());
        gVar.f48159t.setText(((ExternalPlayerModelClass) this.f48139e.get(i9)).getPackagename());
        try {
            Drawable applicationIcon = this.f48138d.getPackageManager().getApplicationIcon(((ExternalPlayerModelClass) this.f48139e.get(i9)).getPackagename());
            if (applicationIcon != null) {
                gVar.f48161v.setImageDrawable(applicationIcon);
            }
        } catch (PackageManager.NameNotFoundException e9) {
            e9.printStackTrace();
        }
        gVar.f48162w.setOnClickListener(new a(i9));
        gVar.f48162w.setOnLongClickListener(new ViewOnLongClickListenerC0420b(i9));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public g L(ViewGroup viewGroup, int i9) {
        LayoutInflater layoutInflaterFrom;
        int i10;
        if (new C2858a(this.f48138d).A().equals(AbstractC2237a.f44453K0)) {
            layoutInflaterFrom = LayoutInflater.from(this.f48138d);
            i10 = a7.g.f12795f2;
        } else {
            layoutInflaterFrom = LayoutInflater.from(this.f48138d);
            i10 = a7.g.f12789e2;
        }
        return new g(layoutInflaterFrom.inflate(i10, viewGroup, false));
    }

    public final void r0(View view, String str, int i9) {
        Context context = this.f48138d;
        if (context != null) {
            k.U u9 = new k.U(context, view);
            u9.d(a7.h.f12934q);
            u9.f(new c(str, i9, u9));
            u9.g();
        }
    }

    public final void s0(String str, int i9) {
        try {
            View viewInflate = ((LayoutInflater) this.f48138d.getSystemService("layout_inflater")).inflate(new C2858a(this.f48138d).A().equals(AbstractC2237a.f44453K0) ? a7.g.f12784d4 : a7.g.f12777c4, (RelativeLayout) ((Activity) this.f48138d).findViewById(a7.f.Re));
            PopupWindow popupWindow = new PopupWindow(this.f48138d);
            popupWindow.setContentView(viewInflate);
            popupWindow.setWidth(-1);
            popupWindow.setHeight(-1);
            popupWindow.setFocusable(true);
            popupWindow.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(a7.f.f12412h1);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12544u1);
            button2.setText(this.f48138d.getResources().getString(a7.j.f13132S8));
            button2.setFocusable(true);
            button.setText(this.f48138d.getResources().getString(a7.j.f13231d4));
            button.setFocusable(true);
            ((TextView) viewInflate.findViewById(a7.f.Di)).setText(this.f48138d.getResources().getString(a7.j.f13053L));
            button.setOnFocusChangeListener(new f(button, this.f48138d));
            button2.setOnFocusChangeListener(new f(button2, this.f48138d));
            button2.requestFocus();
            button2.requestFocusFromTouch();
            button.setOnClickListener(new d(popupWindow));
            button2.setOnClickListener(new e(str, i9, popupWindow));
        } catch (NullPointerException | Exception unused) {
        }
    }
}
