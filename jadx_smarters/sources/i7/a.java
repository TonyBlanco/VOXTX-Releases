package I7;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.vpn.activities.ProfileActivity;
import com.squareup.picasso.InterfaceC1611e;
import com.squareup.picasso.t;
import de.blinkt.openvpn.LaunchVPN;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import m7.w;

/* JADX INFO: loaded from: classes4.dex */
public class a extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f2923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f2924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public J7.a f2925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ProfileActivity f2926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PopupWindow f2927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f2928i = "";

    /* JADX INFO: renamed from: I7.a$a, reason: collision with other inner class name */
    public class C0049a implements InterfaceC1611e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f2929a;

        public C0049a(k kVar) {
            this.f2929a = kVar;
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
            this.f2929a.f2957u.setImageResource(a7.e.f11934L0);
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    public class b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f2931a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f2932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f2933d;

        public b(int i9, k kVar, String str) {
            this.f2931a = i9;
            this.f2932c = kVar;
            this.f2933d = str;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            a aVar = a.this;
            aVar.t0(((L7.a) aVar.f2924e.get(this.f2931a)).j(), this.f2932c, this.f2933d, a.this.f2924e, this.f2931a);
            return true;
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f2935a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f2936c;

        public c(int i9, String str) {
            this.f2935a = i9;
            this.f2936c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent;
            if (!((L7.a) a.this.f2924e.get(this.f2935a)).j().equals("1")) {
                intent = new Intent(a.this.f2923d, (Class<?>) LaunchVPN.class);
            } else {
                if (((L7.a) a.this.f2924e.get(this.f2935a)).i().equals("") || ((L7.a) a.this.f2924e.get(this.f2935a)).h().equals("")) {
                    a aVar = a.this;
                    aVar.x0(this.f2936c, aVar.f2924e, this.f2935a);
                    return;
                }
                intent = new Intent(a.this.f2923d, (Class<?>) LaunchVPN.class);
            }
            intent.putExtra("vpnProfile", (Serializable) a.this.f2924e.get(this.f2935a));
            a.this.f2923d.startActivity(intent);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f2927h.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f2927h.dismiss();
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L7.a f2940a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String[] f2941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String[] f2942d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ EditText f2943e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ EditText f2944f;

        public f(L7.a aVar, String[] strArr, String[] strArr2, EditText editText, EditText editText2) {
            this.f2940a = aVar;
            this.f2941c = strArr;
            this.f2942d = strArr2;
            this.f2943e = editText;
            this.f2944f = editText2;
        }

        public final boolean a() {
            Context context;
            Resources resources;
            int i9;
            this.f2941c[0] = String.valueOf(this.f2943e.getText());
            this.f2942d[0] = String.valueOf(this.f2944f.getText());
            String str = this.f2941c[0];
            if (str == null || !str.equals("")) {
                String str2 = this.f2942d[0];
                if (str2 == null || !str2.equals("")) {
                    String str3 = this.f2941c[0];
                    return (str3 == null || this.f2942d[0] == null || str3.equals("") || this.f2942d[0].equals("")) ? false : true;
                }
                context = a.this.f2923d;
                resources = a.this.f2923d.getResources();
                i9 = a7.j.f13408v1;
            } else {
                context = a.this.f2923d;
                resources = a.this.f2923d.getResources();
                i9 = a7.j.f12945A1;
            }
            Toast.makeText(context, resources.getString(i9), 1).show();
            return false;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a()) {
                this.f2940a.v(this.f2941c[0]);
                this.f2940a.u(this.f2942d[0]);
                a.this.f2925f.o(this.f2940a);
                a.this.f2927h.dismiss();
                Intent intent = new Intent(a.this.f2923d, (Class<?>) LaunchVPN.class);
                intent.putExtra("vpnProfile", this.f2940a);
                a.this.f2923d.startActivity(intent);
            }
        }
    }

    public class g implements PopupMenu.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f2948c;

        public g(String str, ArrayList arrayList, int i9) {
            this.f2946a = str;
            this.f2947b = arrayList;
            this.f2948c = i9;
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (menuItem.getItemId() == a7.f.f12229O2) {
                a.this.x0(this.f2946a, this.f2947b, this.f2948c);
                return false;
            }
            if (menuItem.getItemId() != a7.f.f12159H2) {
                return false;
            }
            a.this.z0(this.f2946a, this.f2947b, this.f2948c);
            return false;
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f2927h.dismiss();
        }
    }

    public class i implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f2951a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ L7.a f2952c;

        public i(File file, L7.a aVar) {
            this.f2951a = file;
            this.f2952c = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f2951a.exists()) {
                this.f2951a.delete();
            }
            a.this.f2925f.i(this.f2952c.c());
            ((ProfileActivity) a.this.f2923d).N1();
            a.this.f2927h.dismiss();
        }
    }

    public class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f2954a;

        public j(View view) {
            this.f2954a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f2954a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f2954a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f2954a, "scaleY", f9);
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
                Log.e("id is", "" + this.f2954a.getTag());
                view2 = this.f2954a;
                i9 = a7.e.f12057s2;
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.05f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                view2 = this.f2954a;
                i9 = a7.e.f12053r2;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public class k extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f2956t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public ImageView f2957u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public RelativeLayout f2958v;

        public k(View view) {
            super(view);
            this.f2956t = (TextView) view.findViewById(a7.f.Zk);
            this.f2957u = (ImageView) view.findViewById(a7.f.f12300V5);
            this.f2958v = (RelativeLayout) view.findViewById(a7.f.Re);
        }
    }

    public a(Context context, ArrayList arrayList, ProfileActivity profileActivity) {
        this.f2923d = context;
        this.f2924e = arrayList;
        this.f2925f = new J7.a(context);
        this.f2926g = profileActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f2924e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void E(k kVar, int i9) {
        String str;
        try {
            str = ((L7.a) this.f2924e.get(i9)).e().substring(0, 1).toUpperCase() + ((L7.a) this.f2924e.get(i9)).e().substring(1);
        } catch (Exception unused) {
            str = "";
        }
        kVar.f2956t.setText(str);
        try {
            if (((L7.a) this.f2924e.get(i9)).b().equals("")) {
                kVar.f2957u.setImageResource(a7.e.f11934L0);
            } else {
                t.q(this.f2923d).l(((L7.a) this.f2924e.get(i9)).b()).h(kVar.f2957u, new C0049a(kVar));
            }
        } catch (Exception unused2) {
            kVar.f2957u.setImageResource(a7.e.f11934L0);
        }
        kVar.f2958v.setOnLongClickListener(new b(i9, kVar, str));
        kVar.f2958v.setOnClickListener(new c(i9, str));
        RelativeLayout relativeLayout = kVar.f2958v;
        relativeLayout.setOnFocusChangeListener(new j(relativeLayout));
        if (i9 == 0) {
            kVar.f2958v.requestFocus();
            kVar.f2958v.requestFocusFromTouch();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public k L(ViewGroup viewGroup, int i9) {
        return new k(LayoutInflater.from(this.f2923d).inflate(a7.g.f12861q2, viewGroup, false));
    }

    public final void t0(String str, k kVar, String str2, ArrayList arrayList, int i9) {
        if (this.f2923d != null) {
            PopupMenu popupMenu = new PopupMenu(this.f2923d, kVar.f2958v);
            popupMenu.inflate(a7.h.f12923f);
            popupMenu.getMenu().getItem(0).setVisible(false);
            if (str.equals("1")) {
                popupMenu.getMenu().getItem(1).setVisible(true);
            } else {
                popupMenu.getMenu().getItem(1).setVisible(false);
            }
            popupMenu.setOnMenuItemClickListener(new g(str2, arrayList, i9));
            popupMenu.show();
        }
    }

    public final void x0(String str, ArrayList arrayList, int i9) {
        L7.a aVar = (L7.a) arrayList.get(i9);
        new L7.a();
        try {
            View viewInflate = ((LayoutInflater) this.f2923d.getSystemService("layout_inflater")).inflate(a7.g.f12796f3, (RelativeLayout) ((Activity) this.f2923d).findViewById(a7.f.Sd));
            PopupWindow popupWindow = new PopupWindow(this.f2923d);
            this.f2927h = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f2927h.setWidth(-1);
            this.f2927h.setHeight(-1);
            this.f2927h.setFocusable(true);
            this.f2927h.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(a7.f.f12107C0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            if (button != null) {
                button.setOnFocusChangeListener(new w.k((View) button, (Activity) this.f2923d));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this.f2923d));
            }
            EditText editText = (EditText) viewInflate.findViewById(a7.f.pm);
            EditText editText2 = (EditText) viewInflate.findViewById(a7.f.om);
            TextView textView = (TextView) viewInflate.findViewById(a7.f.f12353b3);
            ImageView imageView = (ImageView) viewInflate.findViewById(a7.f.f12221N4);
            editText.setText(aVar.i());
            editText2.setText(aVar.h());
            textView.setText(this.f2923d.getResources().getString(a7.j.f12992E8) + " " + str);
            if (this.f2923d.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText.setGravity(21);
                editText2.setGravity(21);
            }
            String[] strArr = {""};
            String[] strArr2 = {""};
            if (button2 != null) {
                button2.setOnClickListener(new d());
            }
            if (imageView != null) {
                imageView.setOnClickListener(new e());
            }
            if (button != null) {
                button.setOnClickListener(new f(aVar, strArr, strArr2, editText, editText2));
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public final void z0(String str, ArrayList arrayList, int i9) {
        try {
            L7.a aVar = (L7.a) arrayList.get(i9);
            File file = new File(aVar.d());
            View viewInflate = ((LayoutInflater) this.f2923d.getSystemService("layout_inflater")).inflate(a7.g.f12867r2, (RelativeLayout) ((Activity) this.f2923d).findViewById(a7.f.We));
            PopupWindow popupWindow = new PopupWindow(this.f2923d);
            this.f2927h = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f2927h.setWidth(-1);
            this.f2927h.setHeight(-1);
            this.f2927h.setFocusable(true);
            this.f2927h.showAtLocation(viewInflate, 17, 0, 0);
            ((TextView) viewInflate.findViewById(a7.f.Ai)).setText("Are you Sure you want to Delete this Profile?");
            Button button = (Button) viewInflate.findViewById(a7.f.f12197L0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            if (button != null) {
                button.setOnFocusChangeListener(new w.k((View) button, (Activity) this.f2923d));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this.f2923d));
            }
            button.requestFocus();
            button2.setOnClickListener(new h());
            button.setOnClickListener(new i(file, aVar));
        } catch (Exception unused) {
        }
    }
}
