package g7;

import android.R;
import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer;
import com.nst.iptvsmarterstvbox.view.utility.ListViewMaxHeight;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import m7.AbstractC2237a;
import q7.C2625i;
import q7.C2627k;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import u5.AbstractC2855a;
import u7.C2858a;

/* JADX INFO: renamed from: g7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1839a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static C2858a f41351v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f41354c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f41357f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f41359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f41360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f41361j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C2625i f41362k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f41363l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Button f41364m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ListViewMaxHeight f41366o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AlertDialog.Builder f41367p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AlertDialog f41368q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f41370s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C2627k f41371t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public File f41372u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41352a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f41355d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f41356e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f41358g = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HashMap f41365n = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Boolean f41369r = Boolean.TRUE;

    /* JADX INFO: renamed from: g7.a$a, reason: collision with other inner class name */
    public class C0331a implements AdapterView.OnItemClickListener {
        public C0331a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
            Intent intent;
            C1839a.this.f41364m.setVisibility(0);
            C1839a.this.f41372u = new File((String) C1839a.this.f41358g.get(i9));
            if (C1839a.this.f41372u != null && C1839a.this.f41372u.isFile()) {
                C1839a c1839a = C1839a.this;
                c1839a.f41355d = c1839a.f41372u.getName();
                if (C1839a.this.f41361j != null) {
                    if (C1839a.this.f41354c != null) {
                        C2858a unused = C1839a.f41351v = new C2858a(C1839a.this.f41354c);
                        if (C1839a.f41351v.x() == 3) {
                            C1839a.f41351v.U(C1839a.this.f41354c.getResources().getString(a7.j.f13349p2));
                            intent = new Intent(C1839a.this.f41354c, (Class<?>) HoneyPlayer.class);
                        } else {
                            intent = new Intent(C1839a.this.f41354c, (Class<?>) HoneyPlayer.class);
                        }
                        intent.putExtra("type", "devicedata");
                        intent.putExtra("VIDEO_NUM", 0);
                        intent.putExtra("VIDEO_PATH", C1839a.this.f41372u.getPath());
                        C1839a.this.f41354c.startActivity(intent);
                    }
                    C1839a.this.f41368q.dismiss();
                    return;
                }
                return;
            }
            C1839a c1839a2 = C1839a.this;
            c1839a2.f41355d = c1839a2.f41372u.getName();
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (C1839a.this.f41355d.equals("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                C1839a c1839a3 = C1839a.this;
                c1839a3.v(c1839a3.f41372u);
                return;
            }
            arrayList.add(C1839a.this.f41372u.getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
            if (C1839a.this.f41372u.list() != null) {
                int i10 = 0;
                while (true) {
                    String[] list = C1839a.this.f41372u.list();
                    Objects.requireNonNull(list);
                    if (i10 >= list.length) {
                        break;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(C1839a.this.f41372u.getPath());
                    sb.append("/");
                    String[] list2 = C1839a.this.f41372u.list();
                    Objects.requireNonNull(list2);
                    sb.append(list2[i10]);
                    arrayList.add(sb.toString());
                    i10++;
                }
            }
            C1839a.this.f41358g.clear();
            C1839a.this.f41358g.addAll(arrayList);
            C1839a.this.f41371t.notifyDataSetChanged();
            C1839a.this.f41366o.setSelection(0);
            if (C1839a.this.f41366o != null) {
                C1839a.this.f41366o.requestFocus();
            }
        }
    }

    /* JADX INFO: renamed from: g7.a$b */
    public class b implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: g7.a$b$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0332a implements View.OnClickListener {
            public ViewOnClickListenerC0332a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C1839a.this.f41368q.dismiss();
            }
        }

        /* JADX INFO: renamed from: g7.a$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC0333b implements View.OnClickListener {
            public ViewOnClickListenerC0333b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C1839a.this.f41358g == null || C1839a.this.f41358g.get(0) == null) {
                    return;
                }
                C1839a.this.v(new File((String) C1839a.this.f41358g.get(0)));
            }
        }

        public b() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            C1839a c1839a = C1839a.this;
            c1839a.f41363l = c1839a.f41368q.getButton(-2);
            C1839a c1839a2 = C1839a.this;
            c1839a2.f41364m = c1839a2.f41368q.getButton(-3);
            if (C1839a.this.f41372u == null || C1839a.this.f41372u.getParent() == null || C1839a.this.f41372u.getParent().equals("/storage/emulated/0")) {
                C1839a.this.f41364m.setVisibility(4);
            } else {
                C1839a.this.f41364m.setVisibility(0);
            }
            C1839a.this.f41363l.setTag("1");
            C1839a.this.f41364m.setTag("3");
            Button button = C1839a.this.f41363l;
            C1839a c1839a3 = C1839a.this;
            button.setOnFocusChangeListener(c1839a3.new h(c1839a3.f41363l));
            C1839a.this.f41363l.setTextColor(C1839a.this.f41354c.getResources().getColor(a7.c.f11849G));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) C1839a.this.f41363l.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) C1839a.this.f41364m.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new C2858a(C1839a.this.f41354c).A();
            if (strA.equals(AbstractC2237a.f44453K0)) {
                C1839a.this.f41363l.setTextSize(16.0f);
                C1839a.this.f41363l.setBackground(C1839a.this.f41354c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                C1839a.this.f41363l.setTextSize(14.0f);
                C1839a.this.f41363l.setBackground(C1839a.this.f41354c.getResources().getDrawable(a7.e.f12010h));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            C1839a.this.f41363l.setOnClickListener(new ViewOnClickListenerC0332a());
            C1839a.this.f41364m.setOnClickListener(new ViewOnClickListenerC0333b());
            Button button2 = C1839a.this.f41364m;
            C1839a c1839a4 = C1839a.this;
            button2.setOnFocusChangeListener(c1839a4.new h(c1839a4.f41364m));
            C1839a.this.f41364m.setTextColor(C1839a.this.f41354c.getResources().getColor(a7.c.f11849G));
            if (strA.equals(AbstractC2237a.f44453K0)) {
                C1839a.this.f41364m.setTextSize(16.0f);
                C1839a.this.f41364m.setBackground(C1839a.this.f41354c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
                return;
            }
            C1839a.this.f41364m.setTextSize(14.0f);
            C1839a.this.f41364m.setBackground(C1839a.this.f41354c.getResources().getDrawable(a7.e.f12024k1));
            marginLayoutParams2.width = 255;
            marginLayoutParams2.height = 135;
        }
    }

    /* JADX INFO: renamed from: g7.a$c */
    public class c implements AdapterView.OnItemClickListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
            C1839a c1839a;
            StringBuilder sb;
            String str;
            String string;
            if (((String) C1839a.this.f41358g.get(i9)).equals("Internal Storage")) {
                c1839a = C1839a.this;
                string = "/emulated/0";
            } else {
                if (C1839a.this.f41358g.get(i9) != null && i9 == 0 && ((String) C1839a.this.f41358g.get(i9)).equals("..")) {
                    C1839a.this.f41364m.performClick();
                    C1839a.this.C();
                }
                if (C1839a.this.f41365n == null || C1839a.this.f41365n.get(C1839a.this.f41358g.get(i9)) == null || ((String) C1839a.this.f41365n.get(C1839a.this.f41358g.get(i9))).equals("")) {
                    c1839a = C1839a.this;
                    sb = new StringBuilder();
                    sb.append("/");
                    str = (String) C1839a.this.f41358g.get(i9);
                    sb.append(str);
                    string = sb.toString();
                } else {
                    c1839a = C1839a.this;
                    sb = new StringBuilder();
                    sb.append("/");
                    sb.append((String) C1839a.this.f41365n.get(C1839a.this.f41358g.get(i9)));
                    sb.append("/Android/data/");
                    str = "com.nst.iptvsmarterstvbox";
                    sb.append(str);
                    string = sb.toString();
                }
            }
            C1839a.n(c1839a, string);
            C1839a.this.C();
        }
    }

    /* JADX INFO: renamed from: g7.a$d */
    public class d implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: g7.a$d$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0334a implements View.OnClickListener {
            public ViewOnClickListenerC0334a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C1839a c1839a;
                File file;
                if (C1839a.this.f41355d.equals(C1839a.this.f41353b)) {
                    C1839a.this.f41363l.performClick();
                    return;
                }
                if (!C1839a.this.f41355d.equals("/storage/emulated/0")) {
                    C1839a.this.f41355d = new File(C1839a.this.f41355d).getParent();
                    String[] strArrSplit = C1839a.this.f41355d.split("/");
                    if (strArrSplit.length >= 3) {
                        if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                            if (C1839a.this.f41355d.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                                C1839a.this.f41355d = "/storage/" + strArrSplit[2];
                                c1839a = C1839a.this;
                                file = new File(C1839a.this.f41355d);
                            }
                        }
                        if (new File(C1839a.this.f41355d).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            C1839a.this.f41355d = "/storage/" + strArrSplit[2] + "/Android/data/com.nst.iptvsmarterstvbox";
                        }
                    }
                    C1839a.this.C();
                }
                C1839a.this.f41355d = "/storage/emulated";
                c1839a = C1839a.this;
                file = new File(C1839a.this.f41355d);
                c1839a.f41355d = file.getParent();
                C1839a.this.C();
            }
        }

        public d() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            C1839a c1839a = C1839a.this;
            c1839a.f41363l = c1839a.f41368q.getButton(-2);
            C1839a c1839a2 = C1839a.this;
            c1839a2.f41364m = c1839a2.f41368q.getButton(-3);
            if (C1839a.this.f41355d.equals(C1839a.this.f41353b)) {
                C1839a.this.f41364m.setVisibility(4);
            } else {
                C1839a.this.f41364m.setVisibility(0);
            }
            C1839a.this.f41363l.setTag("1");
            C1839a.this.f41364m.setTag("3");
            Button button = C1839a.this.f41363l;
            C1839a c1839a3 = C1839a.this;
            button.setOnFocusChangeListener(c1839a3.new h(c1839a3.f41363l));
            C1839a.this.f41363l.setTextColor(C1839a.this.f41354c.getResources().getColor(a7.c.f11849G));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) C1839a.this.f41363l.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) C1839a.this.f41364m.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new C2858a(C1839a.this.f41354c).A();
            if (strA.equals(AbstractC2237a.f44453K0)) {
                C1839a.this.f41363l.setTextSize(16.0f);
                C1839a.this.f41363l.setBackground(C1839a.this.f41354c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                C1839a.this.f41363l.setTextSize(14.0f);
                C1839a.this.f41363l.setBackground(C1839a.this.f41354c.getResources().getDrawable(a7.e.f12010h));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            Button button2 = C1839a.this.f41364m;
            C1839a c1839a4 = C1839a.this;
            button2.setOnFocusChangeListener(c1839a4.new h(c1839a4.f41364m));
            C1839a.this.f41364m.setTextColor(C1839a.this.f41354c.getResources().getColor(a7.c.f11849G));
            if (strA.equals(AbstractC2237a.f44453K0)) {
                C1839a.this.f41364m.setTextSize(16.0f);
                C1839a.this.f41364m.setBackground(C1839a.this.f41354c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
            } else {
                C1839a.this.f41364m.setTextSize(14.0f);
                C1839a.this.f41364m.setBackground(C1839a.this.f41354c.getResources().getDrawable(a7.e.f12024k1));
                marginLayoutParams2.width = 250;
                marginLayoutParams2.height = IjkMediaMeta.FF_PROFILE_H264_HIGH_10;
            }
            C1839a.this.f41364m.setOnClickListener(new ViewOnClickListenerC0334a());
        }
    }

    /* JADX INFO: renamed from: g7.a$e */
    public class e implements DialogInterface.OnKeyListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i9, KeyEvent keyEvent) {
            C1839a c1839a;
            File file;
            if (i9 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (C1839a.this.f41355d.equals(C1839a.this.f41353b)) {
                C1839a.this.f41368q.dismiss();
                return true;
            }
            if (!C1839a.this.f41355d.equals("/storage/emulated/0")) {
                C1839a.this.f41355d = new File(C1839a.this.f41355d).getParent();
                String[] strArrSplit = C1839a.this.f41355d.split("/");
                if (strArrSplit.length >= 3) {
                    if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                        if (C1839a.this.f41355d.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            C1839a.this.f41355d = "/storage/" + strArrSplit[2];
                            c1839a = C1839a.this;
                            file = new File(C1839a.this.f41355d);
                        }
                    }
                    if (new File(C1839a.this.f41355d).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                        C1839a.this.f41355d = "/storage/" + strArrSplit[2] + "/Android/data/com.nst.iptvsmarterstvbox";
                    }
                }
                C1839a.this.C();
                return true;
            }
            C1839a.this.f41355d = "/storage/emulated";
            c1839a = C1839a.this;
            file = new File(C1839a.this.f41355d);
            c1839a.f41355d = file.getParent();
            C1839a.this.C();
            return true;
        }
    }

    /* JADX INFO: renamed from: g7.a$f */
    public class f implements Comparator {
        public f() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* JADX INFO: renamed from: g7.a$g */
    public interface g {
    }

    /* JADX INFO: renamed from: g7.a$h */
    public class h implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f41382a;

        public h(View view) {
            this.f41382a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f41382a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f41382a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                View view2 = this.f41382a;
                if (view2 == null || view2.getTag() == null || !this.f41382a.getTag().equals("6")) {
                    f = z9 ? 1.12f : 1.0f;
                    a(f);
                    b(f);
                    View view3 = this.f41382a;
                    if (view3 != null && view3.getTag() != null && this.f41382a.getTag().equals("1") && C1839a.this.f41363l != null) {
                        C1839a.this.f41363l.setBackgroundResource(a7.e.f12010h);
                    }
                    View view4 = this.f41382a;
                    if (view4 == null || view4.getTag() == null || !this.f41382a.getTag().equals("3") || C1839a.this.f41364m == null) {
                        return;
                    }
                    C1839a.this.f41364m.setBackgroundResource(a7.e.f12042p);
                    return;
                }
                if (z9) {
                    f = 1.18f;
                }
            } else {
                if (z9) {
                    return;
                }
                View view5 = this.f41382a;
                if (view5 != null && view5.getTag() != null && this.f41382a.getTag().equals("1") && C1839a.this.f41363l != null) {
                    C1839a.this.f41363l.setBackgroundResource(a7.e.f12038o);
                }
                View view6 = this.f41382a;
                if (view6 != null && view6.getTag() != null && this.f41382a.getTag().equals("3") && C1839a.this.f41364m != null) {
                    C1839a.this.f41364m.setBackgroundResource(a7.e.f12038o);
                }
            }
            a(f);
            b(f);
        }
    }

    public C1839a(Context context, g gVar) {
        this.f41353b = "";
        this.f41357f = null;
        this.f41361j = null;
        this.f41354c = context;
        int length = context.getExternalFilesDirs("external").length;
        this.f41357f = new ArrayList();
        this.f41370s = new ArrayList();
        this.f41359h = new ArrayList();
        this.f41360i = new ArrayList();
        this.f41353b = "/storage";
        this.f41361j = gVar;
        try {
            this.f41353b = new File(this.f41353b).getCanonicalPath();
        } catch (IOException unused) {
        }
    }

    public static /* synthetic */ String n(C1839a c1839a, Object obj) {
        String str = c1839a.f41355d + obj;
        c1839a.f41355d = str;
        return str;
    }

    public static int y(float f9, Context context) {
        return (int) ((f9 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final List A(String str) {
        File file;
        String name;
        ArrayList arrayList = new ArrayList();
        try {
            file = new File(str);
        } catch (Exception unused) {
        }
        if (file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                try {
                    if (file2.isDirectory()) {
                        name = file2.getName();
                    } else {
                        AbstractC2855a.a(file2.getName());
                        name = file2.getName();
                    }
                    arrayList.add(name);
                } catch (Exception e9) {
                    e9.getMessage();
                }
            }
            Collections.sort(arrayList, new f());
            return arrayList;
        }
        return arrayList;
    }

    public final void B(List list) {
        this.f41358g.clear();
        Iterator it = list.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!str.equals("self")) {
                if (str.equals("emulated")) {
                    z9 = true;
                } else if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(str).matches()) {
                    this.f41365n.put("SD Card", str);
                    this.f41358g.add("SD Card");
                } else {
                    this.f41358g.add(str);
                }
            }
        }
        if (z9) {
            this.f41358g.add(0, "Internal Storage");
        }
    }

    public final void C() {
        Intent intent;
        List list;
        String str;
        try {
            if (!this.f41355d.contains(".mp4") && !this.f41355d.contains(".mp3") && !this.f41355d.contains(".3gp") && !this.f41355d.contains(".ts") && !this.f41355d.contains(".webm") && !this.f41355d.contains(".mkv") && !this.f41355d.contains(".flv") && !this.f41355d.contains(".wmv") && !this.f41355d.contains(".MP3")) {
                if (this.f41355d.equals(this.f41353b)) {
                    B(A(this.f41355d));
                } else if (this.f41355d.endsWith(".zip") || this.f41355d.endsWith(".apk") || this.f41355d.endsWith(".txt") || this.f41355d.endsWith(".pdf") || this.f41355d.endsWith(".m3u") || this.f41355d.endsWith(".xml")) {
                    Toast.makeText(this.f41354c, "File Not Supported !!", 1).show();
                    this.f41364m.performClick();
                } else {
                    if (this.f41355d.indexOf(InstructionFileId.DOT) != this.f41355d.lastIndexOf(InstructionFileId.DOT)) {
                        if (this.f41355d.endsWith(".zip") || this.f41355d.endsWith(".apk") || !this.f41355d.endsWith(".mp4") || !this.f41355d.endsWith(".ts") || !this.f41355d.endsWith(".mp3") || !this.f41355d.endsWith(".webm") || !this.f41355d.endsWith(".3gp") || !this.f41355d.endsWith(".mkv") || !this.f41355d.endsWith(".flv") || !this.f41355d.endsWith(".wmv")) {
                            Toast.makeText(this.f41354c, "File Not Supported !!", 1).show();
                            this.f41364m.performClick();
                        }
                        this.f41358g.clear();
                        this.f41358g.add("..");
                        list = this.f41358g;
                        str = this.f41355d;
                    } else {
                        this.f41358g.clear();
                        this.f41358g.add("..");
                        list = this.f41358g;
                        str = this.f41355d;
                    }
                    list.addAll(A(str));
                }
                AlertDialog alertDialog = this.f41368q;
                if (alertDialog != null) {
                    ((TextView) alertDialog.findViewById(R.id.message)).setText(this.f41355d);
                }
                if (this.f41355d.equals(this.f41353b)) {
                    this.f41364m.setVisibility(4);
                } else {
                    this.f41364m.setVisibility(0);
                }
                this.f41362k.f48398c.clear();
                this.f41362k.f48398c.add(this.f41355d);
                C2625i c2625i = this.f41362k;
                c2625i.f48415t++;
                c2625i.notifyDataSetChanged();
                this.f41366o.setSelection(0);
                ListViewMaxHeight listViewMaxHeight = this.f41366o;
                if (listViewMaxHeight != null) {
                    listViewMaxHeight.requestFocus();
                    return;
                }
                return;
            }
            if (this.f41361j != null) {
                if (this.f41354c != null && this.f41369r.booleanValue()) {
                    C2858a c2858a = new C2858a(this.f41354c);
                    f41351v = c2858a;
                    if (c2858a.x() == 3) {
                        f41351v.U(this.f41354c.getResources().getString(a7.j.f13349p2));
                        intent = new Intent(this.f41354c, (Class<?>) HoneyPlayer.class);
                    } else {
                        intent = new Intent(this.f41354c, (Class<?>) HoneyPlayer.class);
                    }
                    intent.putExtra("type", "devicedata");
                    intent.putExtra("VIDEO_NUM", 0);
                    intent.putExtra("VIDEO_PATH", this.f41355d);
                    this.f41354c.startActivity(intent);
                }
                this.f41364m.performClick();
            }
        } catch (Exception unused) {
        }
    }

    public final void v(File file) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (file.getParent() != null) {
                String parent = file.getParent();
                if (parent.equals("/storage/emulated/0")) {
                    this.f41364m.setVisibility(4);
                } else {
                    arrayList.add(new File(parent).getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                    this.f41364m.setVisibility(0);
                }
                File file2 = new File(file.getParent());
                if (file2.list() != null) {
                    int i9 = 0;
                    while (true) {
                        String[] list = file2.list();
                        Objects.requireNonNull(list);
                        if (i9 >= list.length) {
                            break;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(file.getParent());
                        sb.append("/");
                        String[] list2 = file2.list();
                        Objects.requireNonNull(list2);
                        sb.append(list2[i9]);
                        arrayList.add(sb.toString());
                        i9++;
                    }
                }
            }
            this.f41358g.clear();
            this.f41358g.addAll(arrayList);
            this.f41371t.notifyDataSetChanged();
            this.f41366o.setSelection(0);
            ListViewMaxHeight listViewMaxHeight = this.f41366o;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.requestFocus();
            }
        } catch (Exception unused) {
        }
    }

    public void w(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            str = this.f41353b;
        }
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            this.f41370s.clear();
            this.f41355d = canonicalPath;
            this.f41356e = A(canonicalPath);
            this.f41358g = A("");
            B(this.f41356e);
            AlertDialog.Builder builderZ = z(canonicalPath, this.f41358g);
            this.f41367p = builderZ;
            builderZ.setNegativeButton(this.f41354c.getResources().getString(a7.j.f13149U6), (DialogInterface.OnClickListener) null);
            this.f41367p.setNeutralButton(this.f41354c.getResources().getString(a7.j.f13140T6), (DialogInterface.OnClickListener) null);
            C2625i c2625i = new C2625i(this.f41354c, this.f41358g);
            this.f41362k = c2625i;
            ListViewMaxHeight listViewMaxHeight = this.f41366o;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c2625i);
                this.f41366o.setOnItemClickListener(new c());
            }
            AlertDialog alertDialogCreate = this.f41367p.create();
            this.f41368q = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new d());
            this.f41368q.setOnKeyListener(new e());
            this.f41368q.show();
            if (this.f41368q.getWindow() != null) {
                this.f41368q.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f41368q.getWindow().setLayout(y(650.0f, this.f41354c), -2);
            }
        } catch (IOException unused) {
        }
    }

    public void x(String str) {
        try {
            File absoluteFile = Environment.getExternalStoragePublicDirectory("").getAbsoluteFile();
            ArrayList arrayList = new ArrayList();
            this.f41358g = arrayList;
            arrayList.clear();
            if (absoluteFile.list() != null) {
                int i9 = 0;
                while (true) {
                    String[] list = absoluteFile.list();
                    Objects.requireNonNull(list);
                    if (i9 >= list.length) {
                        break;
                    }
                    String[] list2 = absoluteFile.list();
                    Objects.requireNonNull(list2);
                    this.f41358g.add(new File(Environment.getExternalStoragePublicDirectory(list2[i9]).toString()).getPath());
                    i9++;
                }
            }
            AlertDialog.Builder builderZ = z("", this.f41358g);
            this.f41367p = builderZ;
            builderZ.setNegativeButton(this.f41354c.getResources().getString(a7.j.f13149U6), (DialogInterface.OnClickListener) null);
            this.f41367p.setNeutralButton(this.f41354c.getResources().getString(a7.j.f13140T6), (DialogInterface.OnClickListener) null);
            C2627k c2627k = new C2627k(this.f41354c, this.f41358g);
            this.f41371t = c2627k;
            ListViewMaxHeight listViewMaxHeight = this.f41366o;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c2627k);
                this.f41366o.setOnItemClickListener(new C0331a());
            }
            AlertDialog alertDialogCreate = this.f41367p.create();
            this.f41368q = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new b());
            this.f41368q.show();
            if (this.f41368q.getWindow() != null) {
                this.f41368q.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f41368q.getWindow().setLayout(y(650.0f, this.f41354c), -2);
            }
        } catch (Exception unused) {
        }
    }

    public final AlertDialog.Builder z(String str, List list) {
        this.f41367p = new AlertDialog.Builder(this.f41354c, a7.k.f13456a);
        LinearLayout linearLayout = new LinearLayout(this.f41354c);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(this.f41354c);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(this.f41354c.getResources().getString(a7.j.f13287j0));
        Drawable drawable = this.f41354c.getResources().getDrawable(a7.e.f12082z);
        drawable.setBounds(0, 0, 80, 80);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setTextSize(22.0f);
        textView.setTextColor(this.f41354c.getResources().getColor(R.color.black));
        textView.setPadding(50, 50, 0, 0);
        textView.setTypeface(null, 1);
        linearLayout.addView(textView);
        this.f41367p.setCustomTitle(linearLayout);
        View viewInflate = ((LayoutInflater) this.f41354c.getSystemService("layout_inflater")).inflate(a7.g.f12885u2, (ViewGroup) null);
        this.f41367p.setView(viewInflate);
        this.f41366o = (ListViewMaxHeight) viewInflate.findViewById(a7.f.Za);
        this.f41367p.setCancelable(false);
        return this.f41367p;
    }
}
