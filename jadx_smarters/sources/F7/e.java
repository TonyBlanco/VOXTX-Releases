package F7;

import a7.j;
import a7.k;
import android.R;
import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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
import q7.C2624h;
import q7.C2626j;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f2070c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f2074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C2624h f2075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2626j f2076i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f2077j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f2078k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ListViewMaxHeight f2080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AlertDialog.Builder f2081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AlertDialog f2082o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public File f2083p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2068a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2071d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f2072e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f2073f = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashMap f2079l = new HashMap();

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
            e.this.f2078k.setVisibility(0);
            e.this.f2083p = new File((String) e.this.f2073f.get(i9));
            if (e.this.f2083p != null && e.this.f2083p.isFile()) {
                e eVar = e.this;
                eVar.f2071d = eVar.f2083p.getName();
                if (!e.this.f2071d.endsWith(".zip") && !e.this.f2071d.endsWith(".ovpn")) {
                    Toast.makeText(e.this.f2070c, "Please select .zip or .ovpn File", 0).show();
                    return;
                } else {
                    if (e.this.f2074g != null) {
                        e.this.f2074g.a(e.this.f2083p.getPath());
                        e.this.f2082o.dismiss();
                        return;
                    }
                    return;
                }
            }
            e eVar2 = e.this;
            eVar2.f2071d = eVar2.f2083p.getName();
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (e.this.f2071d.equals("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                e eVar3 = e.this;
                eVar3.t(eVar3.f2083p);
                return;
            }
            arrayList.add(e.this.f2083p.getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
            if (e.this.f2083p.list() != null) {
                int i10 = 0;
                while (true) {
                    String[] list = e.this.f2083p.list();
                    Objects.requireNonNull(list);
                    if (i10 >= list.length) {
                        break;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(e.this.f2083p.getPath());
                    sb.append("/");
                    String[] list2 = e.this.f2083p.list();
                    Objects.requireNonNull(list2);
                    sb.append(list2[i10]);
                    arrayList.add(sb.toString());
                    i10++;
                }
            }
            e.this.f2073f.clear();
            e.this.f2073f.addAll(arrayList);
            e.this.f2076i.notifyDataSetChanged();
            e.this.f2080m.setSelection(0);
            if (e.this.f2080m != null) {
                e.this.f2080m.requestFocus();
            }
        }
    }

    public class b implements DialogInterface.OnShowListener {

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e.this.f2082o.dismiss();
            }
        }

        /* JADX INFO: renamed from: F7.e$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC0029b implements View.OnClickListener {
            public ViewOnClickListenerC0029b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (e.this.f2073f == null || e.this.f2073f.get(0) == null) {
                    return;
                }
                e.this.t(new File((String) e.this.f2073f.get(0)));
            }
        }

        public b() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            e eVar = e.this;
            eVar.f2077j = eVar.f2082o.getButton(-2);
            e eVar2 = e.this;
            eVar2.f2078k = eVar2.f2082o.getButton(-3);
            if (e.this.f2083p == null || e.this.f2083p.getParent() == null || e.this.f2083p.getParent().equals("/storage/emulated/0")) {
                e.this.f2078k.setVisibility(4);
            } else {
                e.this.f2078k.setVisibility(0);
            }
            e.this.f2077j.setTag("1");
            e.this.f2078k.setTag("3");
            Button button = e.this.f2077j;
            e eVar3 = e.this;
            button.setOnFocusChangeListener(eVar3.new h(eVar3.f2077j));
            e.this.f2077j.setTextColor(e.this.f2070c.getResources().getColor(a7.c.f11849G));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e.this.f2077j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) e.this.f2078k.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new C2858a(e.this.f2070c).A();
            if (strA.equals(AbstractC2237a.f44453K0)) {
                e.this.f2077j.setTextSize(16.0f);
                e.this.f2077j.setBackground(e.this.f2070c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                e.this.f2077j.setTextSize(14.0f);
                e.this.f2077j.setBackground(e.this.f2070c.getResources().getDrawable(a7.e.f12010h));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            e.this.f2077j.setOnClickListener(new a());
            e.this.f2078k.setOnClickListener(new ViewOnClickListenerC0029b());
            Button button2 = e.this.f2078k;
            e eVar4 = e.this;
            button2.setOnFocusChangeListener(eVar4.new h(eVar4.f2078k));
            e.this.f2078k.setTextColor(e.this.f2070c.getResources().getColor(a7.c.f11849G));
            if (strA.equals(AbstractC2237a.f44453K0)) {
                e.this.f2078k.setTextSize(16.0f);
                e.this.f2078k.setBackground(e.this.f2070c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
                return;
            }
            e.this.f2078k.setTextSize(14.0f);
            e.this.f2078k.setBackground(e.this.f2070c.getResources().getDrawable(a7.e.f12024k1));
            marginLayoutParams2.width = 255;
            marginLayoutParams2.height = 135;
        }
    }

    public class c implements AdapterView.OnItemClickListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
            e eVar;
            StringBuilder sb;
            String str;
            String string;
            if (((String) e.this.f2073f.get(i9)).equals("Internal Storage")) {
                eVar = e.this;
                string = "/emulated/0";
            } else {
                if (e.this.f2073f.get(i9) != null && i9 == 0 && ((String) e.this.f2073f.get(i9)).equals("..")) {
                    e.this.f2078k.performClick();
                    e.this.A();
                }
                if (e.this.f2079l == null || e.this.f2079l.get(e.this.f2073f.get(i9)) == null || ((String) e.this.f2079l.get(e.this.f2073f.get(i9))).equals("")) {
                    eVar = e.this;
                    sb = new StringBuilder();
                    sb.append("/");
                    str = (String) e.this.f2073f.get(i9);
                    sb.append(str);
                    string = sb.toString();
                } else {
                    eVar = e.this;
                    sb = new StringBuilder();
                    sb.append("/");
                    sb.append((String) e.this.f2079l.get(e.this.f2073f.get(i9)));
                    sb.append("/Android/data/");
                    str = "com.nst.iptvsmarterstvbox";
                    sb.append(str);
                    string = sb.toString();
                }
            }
            e.m(eVar, string);
            e.this.A();
        }
    }

    public class d implements DialogInterface.OnShowListener {

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e eVar;
                File file;
                if (e.this.f2071d.equals(e.this.f2069b)) {
                    return;
                }
                if (!e.this.f2071d.equals("/storage/emulated/0")) {
                    e.this.f2071d = new File(e.this.f2071d).getParent();
                    String[] strArrSplit = e.this.f2071d.split("/");
                    if (strArrSplit.length >= 3) {
                        if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                            if (e.this.f2071d.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                                e.this.f2071d = "/storage/" + strArrSplit[2];
                                eVar = e.this;
                                file = new File(e.this.f2071d);
                            }
                        }
                        if (new File(e.this.f2071d).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            e.this.f2071d = "/storage/" + strArrSplit[2] + "/Android/data/com.nst.iptvsmarterstvbox";
                        }
                    }
                    e.this.A();
                }
                e.this.f2071d = "/storage/emulated";
                eVar = e.this;
                file = new File(e.this.f2071d);
                eVar.f2071d = file.getParent();
                e.this.A();
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
            e eVar = e.this;
            eVar.f2077j = eVar.f2082o.getButton(-2);
            e eVar2 = e.this;
            eVar2.f2078k = eVar2.f2082o.getButton(-3);
            if (e.this.f2071d.equals(e.this.f2069b)) {
                e.this.f2078k.setVisibility(4);
            } else {
                e.this.f2078k.setVisibility(0);
            }
            e.this.f2077j.setTag("1");
            e.this.f2078k.setTag("3");
            Button button2 = e.this.f2077j;
            e eVar3 = e.this;
            button2.setOnFocusChangeListener(eVar3.new h(eVar3.f2077j));
            e.this.f2077j.setTextColor(e.this.f2070c.getResources().getColor(a7.c.f11849G));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e.this.f2077j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) e.this.f2078k.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new C2858a(e.this.f2070c).A();
            if (strA.equals(AbstractC2237a.f44453K0)) {
                e.this.f2077j.setTextSize(16.0f);
                button = e.this.f2077j;
                resources = e.this.f2070c.getResources();
                i9 = a7.e.f12038o;
            } else {
                e.this.f2077j.setTextSize(14.0f);
                button = e.this.f2077j;
                resources = e.this.f2070c.getResources();
                i9 = a7.e.f12010h;
            }
            button.setBackground(resources.getDrawable(i9));
            marginLayoutParams.width = 255;
            marginLayoutParams.height = 135;
            Button button3 = e.this.f2078k;
            e eVar4 = e.this;
            button3.setOnFocusChangeListener(eVar4.new h(eVar4.f2078k));
            e.this.f2078k.setTextColor(e.this.f2070c.getResources().getColor(a7.c.f11849G));
            if (strA.equals(AbstractC2237a.f44453K0)) {
                e.this.f2078k.setTextSize(16.0f);
                e.this.f2078k.setBackground(e.this.f2070c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams2.width = 230;
                i10 = 90;
            } else {
                e.this.f2078k.setTextSize(14.0f);
                e.this.f2078k.setBackground(e.this.f2070c.getResources().getDrawable(a7.e.f12024k1));
                marginLayoutParams2.width = 250;
                i10 = IjkMediaMeta.FF_PROFILE_H264_HIGH_10;
            }
            marginLayoutParams2.height = i10;
            e.this.f2078k.setOnClickListener(new a());
        }
    }

    /* JADX INFO: renamed from: F7.e$e, reason: collision with other inner class name */
    public class DialogInterfaceOnKeyListenerC0030e implements DialogInterface.OnKeyListener {
        public DialogInterfaceOnKeyListenerC0030e() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i9, KeyEvent keyEvent) {
            e eVar;
            File file;
            if (i9 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (e.this.f2071d.equals(e.this.f2069b)) {
                e.this.f2082o.dismiss();
                return true;
            }
            if (!e.this.f2071d.equals("/storage/emulated/0")) {
                e.this.f2071d = new File(e.this.f2071d).getParent();
                String[] strArrSplit = e.this.f2071d.split("/");
                if (strArrSplit.length >= 3) {
                    if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                        if (e.this.f2071d.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            e.this.f2071d = "/storage/" + strArrSplit[2];
                            eVar = e.this;
                            file = new File(e.this.f2071d);
                        }
                    }
                    if (new File(e.this.f2071d).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                        e.this.f2071d = "/storage/" + strArrSplit[2] + "/Android/data/com.nst.iptvsmarterstvbox";
                    }
                }
                e.this.A();
                return true;
            }
            e.this.f2071d = "/storage/emulated";
            eVar = e.this;
            file = new File(e.this.f2071d);
            eVar.f2071d = file.getParent();
            e.this.A();
            return true;
        }
    }

    public class f implements Comparator {
        public f() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    public interface g {
        void a(String str);
    }

    public class h implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f2093a;

        public h(View view) {
            this.f2093a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f2093a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f2093a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                View view2 = this.f2093a;
                if (view2 == null || view2.getTag() == null || !this.f2093a.getTag().equals("6")) {
                    f = z9 ? 1.12f : 1.0f;
                    a(f);
                    b(f);
                    View view3 = this.f2093a;
                    if (view3 != null && view3.getTag() != null && this.f2093a.getTag().equals("1") && e.this.f2077j != null) {
                        e.this.f2077j.setBackgroundResource(a7.e.f12010h);
                    }
                    View view4 = this.f2093a;
                    if (view4 == null || view4.getTag() == null || !this.f2093a.getTag().equals("3") || e.this.f2078k == null) {
                        return;
                    }
                    e.this.f2078k.setBackgroundResource(a7.e.f12042p);
                    return;
                }
                if (z9) {
                    f = 1.18f;
                }
            } else {
                if (z9) {
                    return;
                }
                View view5 = this.f2093a;
                if (view5 != null && view5.getTag() != null && this.f2093a.getTag().equals("1") && e.this.f2077j != null) {
                    e.this.f2077j.setBackgroundResource(a7.e.f12038o);
                }
                View view6 = this.f2093a;
                if (view6 != null && view6.getTag() != null && this.f2093a.getTag().equals("3") && e.this.f2078k != null) {
                    e.this.f2078k.setBackgroundResource(a7.e.f12038o);
                }
            }
            a(f);
            b(f);
        }
    }

    public e(Context context, g gVar) {
        this.f2069b = "";
        this.f2074g = null;
        this.f2070c = context;
        int length = context.getExternalFilesDirs("external").length;
        this.f2069b = "/storage";
        this.f2074g = gVar;
        try {
            this.f2069b = new File(this.f2069b).getCanonicalPath();
        } catch (IOException unused) {
        }
    }

    public static /* synthetic */ String m(e eVar, Object obj) {
        String str = eVar.f2071d + obj;
        eVar.f2071d = str;
        return str;
    }

    public static int w(float f9, Context context) {
        return (int) ((f9 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void A() {
        TextView textView;
        try {
            if (!this.f2071d.endsWith(".zip") && !this.f2071d.endsWith(".ovpn")) {
                if (this.f2071d.equals(this.f2069b)) {
                    z(y(this.f2071d));
                } else {
                    this.f2073f.clear();
                    this.f2073f.add("..");
                    this.f2073f.addAll(y(this.f2071d));
                }
                AlertDialog alertDialog = this.f2082o;
                if (alertDialog != null && (textView = (TextView) alertDialog.findViewById(R.id.message)) != null) {
                    textView.setText(this.f2071d);
                }
                if (this.f2071d.equals(this.f2069b)) {
                    this.f2078k.setVisibility(4);
                } else {
                    this.f2078k.setVisibility(0);
                }
                this.f2075h.notifyDataSetChanged();
                this.f2080m.setSelection(0);
                ListViewMaxHeight listViewMaxHeight = this.f2080m;
                if (listViewMaxHeight != null) {
                    listViewMaxHeight.requestFocus();
                    return;
                }
                return;
            }
            g gVar = this.f2074g;
            if (gVar != null) {
                gVar.a(this.f2071d);
                this.f2082o.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public final void t(File file) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (file.getParent() != null) {
                String parent = file.getParent();
                if (parent.equals("/storage/emulated/0")) {
                    this.f2078k.setVisibility(4);
                } else {
                    arrayList.add(new File(parent).getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                    this.f2078k.setVisibility(0);
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
            this.f2073f.clear();
            this.f2073f.addAll(arrayList);
            this.f2076i.notifyDataSetChanged();
            this.f2080m.setSelection(0);
            ListViewMaxHeight listViewMaxHeight = this.f2080m;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.requestFocus();
            }
        } catch (Exception unused) {
        }
    }

    public void u(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            str = this.f2069b;
        }
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            this.f2071d = canonicalPath;
            this.f2072e = y(canonicalPath);
            this.f2073f = y("");
            z(this.f2072e);
            AlertDialog.Builder builderX = x(canonicalPath, this.f2073f);
            this.f2081n = builderX;
            builderX.setNegativeButton(this.f2070c.getResources().getString(j.f13149U6), (DialogInterface.OnClickListener) null);
            this.f2081n.setNeutralButton(this.f2070c.getResources().getString(j.f13140T6), (DialogInterface.OnClickListener) null);
            C2624h c2624h = new C2624h(this.f2070c, this.f2073f);
            this.f2075h = c2624h;
            ListViewMaxHeight listViewMaxHeight = this.f2080m;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c2624h);
                this.f2080m.setOnItemClickListener(new c());
            }
            AlertDialog alertDialogCreate = this.f2081n.create();
            this.f2082o = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new d());
            this.f2082o.setOnKeyListener(new DialogInterfaceOnKeyListenerC0030e());
            this.f2082o.show();
            if (this.f2082o.getWindow() != null) {
                this.f2082o.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f2082o.getWindow().setLayout(w(650.0f, this.f2070c), -2);
            }
        } catch (IOException unused) {
        }
    }

    public void v(String str) {
        try {
            File absoluteFile = Environment.getExternalStoragePublicDirectory("").getAbsoluteFile();
            ArrayList arrayList = new ArrayList();
            this.f2073f = arrayList;
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
                    this.f2073f.add(new File(Environment.getExternalStoragePublicDirectory(list2[i9]).toString()).getPath());
                    i9++;
                }
            }
            AlertDialog.Builder builderX = x("", this.f2073f);
            this.f2081n = builderX;
            builderX.setNegativeButton(this.f2070c.getResources().getString(j.f13149U6), (DialogInterface.OnClickListener) null);
            this.f2081n.setNeutralButton(this.f2070c.getResources().getString(j.f13140T6), (DialogInterface.OnClickListener) null);
            C2626j c2626j = new C2626j(this.f2070c, this.f2073f, "vpn");
            this.f2076i = c2626j;
            ListViewMaxHeight listViewMaxHeight = this.f2080m;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c2626j);
                this.f2080m.setOnItemClickListener(new a());
            }
            AlertDialog alertDialogCreate = this.f2081n.create();
            this.f2082o = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new b());
            this.f2082o.show();
            if (this.f2082o.getWindow() != null) {
                this.f2082o.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f2082o.getWindow().setLayout(w(650.0f, this.f2070c), -2);
            }
        } catch (Exception unused) {
        }
    }

    public final AlertDialog.Builder x(String str, List list) {
        this.f2081n = new AlertDialog.Builder(this.f2070c, k.f13456a);
        LinearLayout linearLayout = new LinearLayout(this.f2070c);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(this.f2070c);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText("Choose Certificate Zip File or ovpn File");
        Drawable drawable = this.f2070c.getResources().getDrawable(a7.e.f12082z);
        drawable.setBounds(0, 0, 80, 80);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setTextSize(22.0f);
        textView.setTextColor(this.f2070c.getResources().getColor(R.color.black));
        textView.setPadding(50, 50, 0, 0);
        textView.setTypeface(null, 1);
        linearLayout.addView(textView);
        this.f2081n.setCustomTitle(linearLayout);
        View viewInflate = ((LayoutInflater) this.f2070c.getSystemService("layout_inflater")).inflate(a7.g.f12885u2, (ViewGroup) null);
        this.f2081n.setView(viewInflate);
        this.f2080m = (ListViewMaxHeight) viewInflate.findViewById(a7.f.Za);
        this.f2081n.setCancelable(true);
        return this.f2081n;
    }

    public final List y(String str) {
        File file;
        ArrayList arrayList = new ArrayList();
        try {
            file = new File(str);
        } catch (Exception unused) {
        }
        if (file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
                if ((file2.isFile() && file2.getName().endsWith(".zip")) || file2.getName().endsWith(".ovpn")) {
                    arrayList.add(file2.getName());
                }
            }
            Collections.sort(arrayList, new f());
            return arrayList;
        }
        return arrayList;
    }

    public final void z(List list) {
        this.f2073f.clear();
        Iterator it = list.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!str.equals("self")) {
                if (str.equals("emulated")) {
                    z9 = true;
                } else if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(str).matches()) {
                    this.f2079l.put("SD Card", str);
                    this.f2073f.add("SD Card");
                } else {
                    this.f2073f.add(str);
                }
            }
        }
        if (z9) {
            this.f2073f.add(0, "Internal Storage");
        }
    }
}
