package g7;

import android.R;
import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
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

/* JADX INFO: renamed from: g7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1840b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static C2858a f41384v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f41387c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f41390f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f41392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f41393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f41394j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C2625i f41395k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2627k f41396l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Button f41397m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Button f41398n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ListViewMaxHeight f41400p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AlertDialog.Builder f41401q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AlertDialog f41402r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f41404t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public File f41405u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41385a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f41388d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f41389e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f41391g = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HashMap f41399o = new HashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f41403s = Boolean.TRUE;

    /* JADX INFO: renamed from: g7.b$a */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
            String[] list;
            Intent intent;
            C1840b.this.f41398n.setVisibility(0);
            C1840b.this.f41405u = new File((String) C1840b.this.f41391g.get(i9));
            if (C1840b.this.f41405u != null && C1840b.this.f41405u.isFile()) {
                C1840b c1840b = C1840b.this;
                c1840b.f41388d = c1840b.f41405u.getName();
                if (C1840b.this.f41394j != null) {
                    if (C1840b.this.f41387c != null) {
                        C2858a unused = C1840b.f41384v = new C2858a(C1840b.this.f41387c);
                        if (C1840b.f41384v.x() == 3) {
                            C1840b.f41384v.U(C1840b.this.f41387c.getResources().getString(a7.j.f13349p2));
                            intent = new Intent(C1840b.this.f41387c, (Class<?>) HoneyPlayer.class);
                        } else {
                            intent = new Intent(C1840b.this.f41387c, (Class<?>) HoneyPlayer.class);
                        }
                        intent.putExtra("type", "devicedata");
                        intent.putExtra("VIDEO_NUM", 0);
                        intent.putExtra("VIDEO_PATH", C1840b.this.f41405u.getPath());
                        C1840b.this.f41387c.startActivity(intent);
                    }
                    C1840b.this.f41402r.dismiss();
                    return;
                }
                return;
            }
            C1840b c1840b2 = C1840b.this;
            c1840b2.f41388d = c1840b2.f41405u.getName();
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (C1840b.this.f41388d.equals("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                C1840b c1840b3 = C1840b.this;
                c1840b3.v(c1840b3.f41405u);
                return;
            }
            arrayList.add(C1840b.this.f41405u.getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
            if (C1840b.this.f41405u.list() != null && (list = C1840b.this.f41405u.list()) != null) {
                for (String str : list) {
                    arrayList.add(C1840b.this.f41405u.getPath() + "/" + str);
                }
            }
            C1840b.this.f41391g.clear();
            C1840b.this.f41391g.addAll(arrayList);
            C1840b.this.f41396l.notifyDataSetChanged();
            C1840b.this.f41400p.setSelection(0);
            if (C1840b.this.f41400p != null) {
                C1840b.this.f41400p.requestFocus();
            }
        }
    }

    /* JADX INFO: renamed from: g7.b$b, reason: collision with other inner class name */
    public class DialogInterfaceOnShowListenerC0335b implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: g7.b$b$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C1840b.this.f41402r.dismiss();
            }
        }

        /* JADX INFO: renamed from: g7.b$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC0336b implements View.OnClickListener {
            public ViewOnClickListenerC0336b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C1840b.this.f41391g == null || C1840b.this.f41391g.get(0) == null) {
                    return;
                }
                C1840b.this.v(new File((String) C1840b.this.f41391g.get(0)));
            }
        }

        public DialogInterfaceOnShowListenerC0335b() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            C1840b c1840b = C1840b.this;
            c1840b.f41397m = c1840b.f41402r.getButton(-2);
            C1840b c1840b2 = C1840b.this;
            c1840b2.f41398n = c1840b2.f41402r.getButton(-3);
            if (C1840b.this.f41405u == null || C1840b.this.f41405u.getParent() == null || C1840b.this.f41405u.getParent().equals("/storage/emulated/0")) {
                C1840b.this.f41398n.setVisibility(4);
            } else {
                C1840b.this.f41398n.setVisibility(0);
            }
            C1840b.this.f41397m.setTag("1");
            C1840b.this.f41398n.setTag("3");
            Button button = C1840b.this.f41397m;
            C1840b c1840b3 = C1840b.this;
            button.setOnFocusChangeListener(c1840b3.new h(c1840b3.f41397m));
            C1840b.this.f41397m.setTextColor(C1840b.this.f41387c.getResources().getColor(a7.c.f11849G));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) C1840b.this.f41397m.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) C1840b.this.f41398n.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new C2858a(C1840b.this.f41387c).A();
            if (strA.equals(AbstractC2237a.f44453K0)) {
                C1840b.this.f41397m.setTextSize(16.0f);
                C1840b.this.f41397m.setBackground(C1840b.this.f41387c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                C1840b.this.f41397m.setTextSize(14.0f);
                C1840b.this.f41397m.setBackground(C1840b.this.f41387c.getResources().getDrawable(a7.e.f12010h));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            C1840b.this.f41397m.setOnClickListener(new a());
            C1840b.this.f41398n.setOnClickListener(new ViewOnClickListenerC0336b());
            Button button2 = C1840b.this.f41398n;
            C1840b c1840b4 = C1840b.this;
            button2.setOnFocusChangeListener(c1840b4.new h(c1840b4.f41398n));
            C1840b.this.f41398n.setTextColor(C1840b.this.f41387c.getResources().getColor(a7.c.f11849G));
            if (strA.equals(AbstractC2237a.f44453K0)) {
                C1840b.this.f41398n.setTextSize(16.0f);
                C1840b.this.f41398n.setBackground(C1840b.this.f41387c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
                return;
            }
            C1840b.this.f41398n.setTextSize(14.0f);
            C1840b.this.f41398n.setBackground(C1840b.this.f41387c.getResources().getDrawable(a7.e.f12024k1));
            marginLayoutParams2.width = 255;
            marginLayoutParams2.height = 135;
        }
    }

    /* JADX INFO: renamed from: g7.b$c */
    public class c implements AdapterView.OnItemClickListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
            C1840b c1840b;
            StringBuilder sb;
            String str;
            String string;
            if (((String) C1840b.this.f41391g.get(i9)).equals("Internal Storage")) {
                c1840b = C1840b.this;
                string = "/emulated/0";
            } else {
                if (C1840b.this.f41391g.get(i9) != null && i9 == 0 && ((String) C1840b.this.f41391g.get(i9)).equals("..")) {
                    C1840b.this.f41398n.performClick();
                    C1840b.this.C();
                }
                if (C1840b.this.f41399o == null || C1840b.this.f41399o.get(C1840b.this.f41391g.get(i9)) == null || ((String) C1840b.this.f41399o.get(C1840b.this.f41391g.get(i9))).equals("")) {
                    c1840b = C1840b.this;
                    sb = new StringBuilder();
                    sb.append("/");
                    str = (String) C1840b.this.f41391g.get(i9);
                    sb.append(str);
                    string = sb.toString();
                } else {
                    c1840b = C1840b.this;
                    sb = new StringBuilder();
                    sb.append("/");
                    sb.append((String) C1840b.this.f41399o.get(C1840b.this.f41391g.get(i9)));
                    sb.append("/Android/data/");
                    str = "com.nst.iptvsmarterstvbox";
                    sb.append(str);
                    string = sb.toString();
                }
            }
            C1840b.n(c1840b, string);
            C1840b.this.C();
        }
    }

    /* JADX INFO: renamed from: g7.b$d */
    public class d implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: g7.b$d$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C1840b c1840b;
                File file;
                if (C1840b.this.f41388d.equals(C1840b.this.f41386b)) {
                    C1840b.this.f41397m.performClick();
                    return;
                }
                if (!C1840b.this.f41388d.equals("/storage/emulated/0")) {
                    C1840b.this.f41388d = new File(C1840b.this.f41388d).getParent();
                    String[] strArrSplit = C1840b.this.f41388d.split("/");
                    if (strArrSplit.length >= 3) {
                        if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                            if (C1840b.this.f41388d.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                                C1840b.this.f41388d = "/storage/" + strArrSplit[2];
                                c1840b = C1840b.this;
                                file = new File(C1840b.this.f41388d);
                            }
                        }
                        if (new File(C1840b.this.f41388d).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            C1840b.this.f41388d = "/storage/" + strArrSplit[2] + "/Android/data/com.nst.iptvsmarterstvbox";
                        }
                    }
                    C1840b.this.C();
                }
                C1840b.this.f41388d = "/storage/emulated";
                c1840b = C1840b.this;
                file = new File(C1840b.this.f41388d);
                c1840b.f41388d = file.getParent();
                C1840b.this.C();
            }
        }

        public d() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Button button;
            Resources resources;
            int i9;
            int i10;
            C1840b c1840b = C1840b.this;
            c1840b.f41397m = c1840b.f41402r.getButton(-2);
            C1840b c1840b2 = C1840b.this;
            c1840b2.f41398n = c1840b2.f41402r.getButton(-3);
            if (C1840b.this.f41388d.equals(C1840b.this.f41386b)) {
                C1840b.this.f41398n.setVisibility(4);
            } else {
                C1840b.this.f41398n.setVisibility(0);
            }
            C1840b.this.f41397m.setTag("1");
            C1840b.this.f41398n.setTag("3");
            Button button2 = C1840b.this.f41397m;
            C1840b c1840b3 = C1840b.this;
            button2.setOnFocusChangeListener(c1840b3.new h(c1840b3.f41397m));
            C1840b.this.f41397m.setTextColor(C1840b.this.f41387c.getResources().getColor(a7.c.f11849G));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) C1840b.this.f41397m.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) C1840b.this.f41398n.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new C2858a(C1840b.this.f41387c).A();
            if (strA.equals(AbstractC2237a.f44453K0)) {
                C1840b.this.f41397m.setTextSize(16.0f);
                button = C1840b.this.f41397m;
                resources = C1840b.this.f41387c.getResources();
                i9 = a7.e.f12038o;
            } else {
                C1840b.this.f41397m.setTextSize(14.0f);
                button = C1840b.this.f41397m;
                resources = C1840b.this.f41387c.getResources();
                i9 = a7.e.f12010h;
            }
            button.setBackground(resources.getDrawable(i9));
            marginLayoutParams.width = 255;
            marginLayoutParams.height = 135;
            Button button3 = C1840b.this.f41398n;
            C1840b c1840b4 = C1840b.this;
            button3.setOnFocusChangeListener(c1840b4.new h(c1840b4.f41398n));
            C1840b.this.f41398n.setTextColor(C1840b.this.f41387c.getResources().getColor(a7.c.f11849G));
            if (strA.equals(AbstractC2237a.f44453K0)) {
                C1840b.this.f41398n.setTextSize(16.0f);
                C1840b.this.f41398n.setBackground(C1840b.this.f41387c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams2.width = 230;
                i10 = 90;
            } else {
                C1840b.this.f41398n.setTextSize(14.0f);
                C1840b.this.f41398n.setBackground(C1840b.this.f41387c.getResources().getDrawable(a7.e.f12024k1));
                marginLayoutParams2.width = 250;
                i10 = IjkMediaMeta.FF_PROFILE_H264_HIGH_10;
            }
            marginLayoutParams2.height = i10;
            C1840b.this.f41398n.setOnClickListener(new a());
        }
    }

    /* JADX INFO: renamed from: g7.b$e */
    public class e implements DialogInterface.OnKeyListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i9, KeyEvent keyEvent) {
            C1840b c1840b;
            File file;
            if (i9 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (C1840b.this.f41388d.equals(C1840b.this.f41386b)) {
                C1840b.this.f41402r.dismiss();
                return true;
            }
            if (!C1840b.this.f41388d.equals("/storage/emulated/0")) {
                C1840b.this.f41388d = new File(C1840b.this.f41388d).getParent();
                String[] strArrSplit = C1840b.this.f41388d.split("/");
                if (strArrSplit.length >= 3) {
                    if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                        if (C1840b.this.f41388d.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            C1840b.this.f41388d = "/storage/" + strArrSplit[2];
                            c1840b = C1840b.this;
                            file = new File(C1840b.this.f41388d);
                        }
                    }
                    if (new File(C1840b.this.f41388d).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                        C1840b.this.f41388d = "/storage/" + strArrSplit[2] + "/Android/data/com.nst.iptvsmarterstvbox";
                    }
                }
                C1840b.this.C();
                return true;
            }
            C1840b.this.f41388d = "/storage/emulated";
            c1840b = C1840b.this;
            file = new File(C1840b.this.f41388d);
            c1840b.f41388d = file.getParent();
            C1840b.this.C();
            return true;
        }
    }

    /* JADX INFO: renamed from: g7.b$f */
    public class f implements Comparator {
        public f() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* JADX INFO: renamed from: g7.b$g */
    public interface g {
    }

    /* JADX INFO: renamed from: g7.b$h */
    public class h implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f41415a;

        public h(View view) {
            this.f41415a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f41415a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f41415a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                View view2 = this.f41415a;
                if (view2 == null || view2.getTag() == null || !this.f41415a.getTag().equals("6")) {
                    f = z9 ? 1.12f : 1.0f;
                    a(f);
                    b(f);
                    View view3 = this.f41415a;
                    if (view3 != null && view3.getTag() != null && this.f41415a.getTag().equals("1") && C1840b.this.f41397m != null) {
                        C1840b.this.f41397m.setBackgroundResource(a7.e.f12010h);
                    }
                    View view4 = this.f41415a;
                    if (view4 == null || view4.getTag() == null || !this.f41415a.getTag().equals("3") || C1840b.this.f41398n == null) {
                        return;
                    }
                    C1840b.this.f41398n.setBackgroundResource(a7.e.f12042p);
                    return;
                }
                if (z9) {
                    f = 1.18f;
                }
            } else {
                if (z9) {
                    return;
                }
                View view5 = this.f41415a;
                if (view5 != null && view5.getTag() != null && this.f41415a.getTag().equals("1") && C1840b.this.f41397m != null) {
                    C1840b.this.f41397m.setBackgroundResource(a7.e.f12038o);
                }
                View view6 = this.f41415a;
                if (view6 != null && view6.getTag() != null && this.f41415a.getTag().equals("3") && C1840b.this.f41398n != null) {
                    C1840b.this.f41398n.setBackgroundResource(a7.e.f12038o);
                }
            }
            a(f);
            b(f);
        }
    }

    public C1840b(Context context, g gVar) {
        this.f41386b = "";
        this.f41390f = null;
        this.f41394j = null;
        this.f41387c = context;
        int length = context.getExternalFilesDirs("external").length;
        this.f41390f = new ArrayList();
        this.f41404t = new ArrayList();
        this.f41392h = new ArrayList();
        this.f41393i = new ArrayList();
        this.f41386b = "/storage";
        this.f41394j = gVar;
        try {
            this.f41386b = new File(this.f41386b).getCanonicalPath();
        } catch (IOException unused) {
        }
    }

    public static /* synthetic */ String n(C1840b c1840b, Object obj) {
        String str = c1840b.f41388d + obj;
        c1840b.f41388d = str;
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
        this.f41391g.clear();
        Iterator it = list.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!str.equals("self")) {
                if (str.equals("emulated")) {
                    z9 = true;
                } else if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(str).matches()) {
                    this.f41399o.put("SD Card", str);
                    this.f41391g.add("SD Card");
                } else {
                    this.f41391g.add(str);
                }
            }
        }
        if (z9) {
            this.f41391g.add(0, "Internal Storage");
        }
    }

    public final void C() {
        Intent intent;
        List list;
        String str;
        try {
            if (!this.f41388d.contains(".mp4") && !this.f41388d.contains(".mp3") && !this.f41388d.contains(".3gp") && !this.f41388d.contains(".ts") && !this.f41388d.contains(".webm") && !this.f41388d.contains(".mkv") && !this.f41388d.contains(".flv") && !this.f41388d.contains(".wmv") && !this.f41388d.contains(".MP3")) {
                if (this.f41388d.equals(this.f41386b)) {
                    B(A(this.f41388d));
                } else if (this.f41388d.endsWith(".zip") || this.f41388d.endsWith(".apk") || this.f41388d.endsWith(".txt") || this.f41388d.endsWith(".pdf") || this.f41388d.endsWith(".m3u") || this.f41388d.endsWith(".xml")) {
                    Toast.makeText(this.f41387c, "File Not Supported !!", 1).show();
                    this.f41398n.performClick();
                } else {
                    if (this.f41388d.indexOf(InstructionFileId.DOT) != this.f41388d.lastIndexOf(InstructionFileId.DOT)) {
                        if (this.f41388d.endsWith(".zip") || this.f41388d.endsWith(".apk") || !this.f41388d.endsWith(".mp4") || !this.f41388d.endsWith(".ts") || !this.f41388d.endsWith(".mp3") || !this.f41388d.endsWith(".webm") || !this.f41388d.endsWith(".3gp") || !this.f41388d.endsWith(".mkv") || !this.f41388d.endsWith(".flv") || !this.f41388d.endsWith(".wmv")) {
                            Toast.makeText(this.f41387c, "File Not Supported !!", 1).show();
                            this.f41398n.performClick();
                        }
                        this.f41391g.clear();
                        this.f41391g.add("..");
                        list = this.f41391g;
                        str = this.f41388d;
                    } else {
                        this.f41391g.clear();
                        this.f41391g.add("..");
                        list = this.f41391g;
                        str = this.f41388d;
                    }
                    list.addAll(A(str));
                }
                AlertDialog alertDialog = this.f41402r;
                if (alertDialog != null) {
                    ((TextView) alertDialog.findViewById(R.id.message)).setText(this.f41388d);
                }
                if (this.f41388d.equals(this.f41386b)) {
                    this.f41398n.setVisibility(4);
                } else {
                    this.f41398n.setVisibility(0);
                }
                this.f41395k.f48398c.clear();
                this.f41395k.f48398c.add(this.f41388d);
                C2625i c2625i = this.f41395k;
                c2625i.f48415t++;
                c2625i.notifyDataSetChanged();
                this.f41400p.setSelection(0);
                ListViewMaxHeight listViewMaxHeight = this.f41400p;
                if (listViewMaxHeight != null) {
                    listViewMaxHeight.requestFocus();
                    return;
                }
                return;
            }
            if (this.f41394j != null) {
                if (this.f41387c != null && this.f41403s.booleanValue()) {
                    C2858a c2858a = new C2858a(this.f41387c);
                    f41384v = c2858a;
                    if (c2858a.x() == 3) {
                        f41384v.U(this.f41387c.getResources().getString(a7.j.f13349p2));
                        intent = new Intent(this.f41387c, (Class<?>) HoneyPlayer.class);
                    } else {
                        intent = new Intent(this.f41387c, (Class<?>) HoneyPlayer.class);
                    }
                    intent.putExtra("type", "devicedata");
                    intent.putExtra("VIDEO_NUM", 0);
                    intent.putExtra("VIDEO_PATH", this.f41388d);
                    this.f41387c.startActivity(intent);
                }
                this.f41398n.performClick();
            }
        } catch (Exception unused) {
        }
    }

    public final void v(File file) {
        String[] list;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (file.getParent() != null) {
                String parent = file.getParent();
                if (parent.equals("/storage/emulated/0")) {
                    this.f41398n.setVisibility(4);
                } else {
                    arrayList.add(new File(parent).getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                    this.f41398n.setVisibility(0);
                }
                File file2 = new File(file.getParent());
                if (file2.list() != null && (list = file2.list()) != null) {
                    for (String str : list) {
                        arrayList.add(file.getParent() + "/" + str);
                    }
                }
            }
            this.f41391g.clear();
            this.f41391g.addAll(arrayList);
            this.f41396l.notifyDataSetChanged();
            this.f41400p.setSelection(0);
            ListViewMaxHeight listViewMaxHeight = this.f41400p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.requestFocus();
            }
        } catch (Exception unused) {
        }
    }

    public void w(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            str = this.f41386b;
        }
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            this.f41404t.clear();
            this.f41388d = canonicalPath;
            this.f41389e = A(canonicalPath);
            this.f41391g = A("");
            B(this.f41389e);
            this.f41401q = z(canonicalPath, this.f41391g);
            C2625i c2625i = new C2625i(this.f41387c, this.f41391g);
            this.f41395k = c2625i;
            ListViewMaxHeight listViewMaxHeight = this.f41400p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c2625i);
                this.f41400p.setOnItemClickListener(new c());
            }
            AlertDialog alertDialogCreate = this.f41401q.create();
            this.f41402r = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new d());
            this.f41402r.setOnKeyListener(new e());
            this.f41402r.show();
            this.f41402r.getWindow().setLayout(-1, -1);
            this.f41402r.getWindow().setBackgroundDrawableResource(a7.c.f11847E);
        } catch (IOException unused) {
        }
    }

    public void x(String str) {
        String[] list;
        try {
            File absoluteFile = Environment.getExternalStoragePublicDirectory("").getAbsoluteFile();
            ArrayList arrayList = new ArrayList();
            this.f41391g = arrayList;
            arrayList.clear();
            if (absoluteFile.list() != null && (list = absoluteFile.list()) != null) {
                for (String str2 : list) {
                    this.f41391g.add(new File(Environment.getExternalStoragePublicDirectory(str2).toString()).getPath());
                }
            }
            AlertDialog.Builder builderZ = z("", this.f41391g);
            this.f41401q = builderZ;
            builderZ.setNegativeButton(this.f41387c.getResources().getString(a7.j.f13149U6), (DialogInterface.OnClickListener) null);
            this.f41401q.setNeutralButton(this.f41387c.getResources().getString(a7.j.f13140T6), (DialogInterface.OnClickListener) null);
            C2627k c2627k = new C2627k(this.f41387c, this.f41391g);
            this.f41396l = c2627k;
            ListViewMaxHeight listViewMaxHeight = this.f41400p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c2627k);
                this.f41400p.setOnItemClickListener(new a());
            }
            AlertDialog alertDialogCreate = this.f41401q.create();
            this.f41402r = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new DialogInterfaceOnShowListenerC0335b());
            this.f41402r.show();
            if (this.f41402r.getWindow() != null) {
                this.f41402r.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f41402r.getWindow().setLayout(y(650.0f, this.f41387c), -2);
            }
        } catch (Exception unused) {
        }
    }

    public final AlertDialog.Builder z(String str, List list) {
        this.f41401q = new AlertDialog.Builder(this.f41387c, a7.k.f13457b);
        LinearLayout linearLayout = new LinearLayout(this.f41387c);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(this.f41387c);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView.setText(this.f41387c.getResources().getString(a7.j.f13287j0));
        Drawable drawable = this.f41387c.getResources().getDrawable(a7.e.f12082z);
        drawable.setBounds(0, 0, 80, 80);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setTextSize(22.0f);
        textView.setTextColor(this.f41387c.getResources().getColor(R.color.white));
        textView.setPadding(50, 50, 0, 0);
        textView.setTypeface(null, 1);
        linearLayout.addView(textView);
        this.f41401q.setCustomTitle(linearLayout);
        View viewInflate = ((LayoutInflater) this.f41387c.getSystemService("layout_inflater")).inflate(a7.g.f12891v2, (ViewGroup) null);
        this.f41401q.setView(viewInflate);
        this.f41400p = (ListViewMaxHeight) viewInflate.findViewById(a7.f.Za);
        this.f41401q.setCancelable(true);
        return this.f41401q;
    }
}
