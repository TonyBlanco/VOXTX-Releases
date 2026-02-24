package g7;

import android.R;
import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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
import u7.C2858a;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f41460c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f41464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C2624h f41465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2626j f41466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f41467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f41468k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ListViewMaxHeight f41470m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AlertDialog.Builder f41471n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AlertDialog f41472o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public File f41473p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41458a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f41461d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f41462e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f41463f = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashMap f41469l = new HashMap();

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
            f.this.f41468k.setVisibility(0);
            f.this.f41473p = new File((String) f.this.f41463f.get(i9));
            if (f.this.f41473p != null && f.this.f41473p.isFile()) {
                f fVar = f.this;
                fVar.f41461d = fVar.f41473p.getName();
                if (!f.this.f41461d.endsWith(".m3u") && !f.this.f41461d.endsWith(".m3u8")) {
                    Toast.makeText(f.this.f41460c, "Please select .m3u File", 0).show();
                    return;
                } else {
                    if (f.this.f41464g != null) {
                        f.this.f41464g.a(f.this.f41473p.getPath());
                        f.this.f41472o.dismiss();
                        return;
                    }
                    return;
                }
            }
            f fVar2 = f.this;
            fVar2.f41461d = fVar2.f41473p.getName();
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (f.this.f41461d.equals("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                f fVar3 = f.this;
                fVar3.t(fVar3.f41473p);
                return;
            }
            arrayList.add(f.this.f41473p.getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
            if (f.this.f41473p.list() != null) {
                int i10 = 0;
                while (true) {
                    String[] list = f.this.f41473p.list();
                    Objects.requireNonNull(list);
                    if (i10 >= list.length) {
                        break;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(f.this.f41473p.getPath());
                    sb.append("/");
                    String[] list2 = f.this.f41473p.list();
                    Objects.requireNonNull(list2);
                    sb.append(list2[i10]);
                    arrayList.add(sb.toString());
                    i10++;
                }
            }
            f.this.f41463f.clear();
            f.this.f41463f.addAll(arrayList);
            f.this.f41466i.notifyDataSetChanged();
            f.this.f41470m.setSelection(0);
            if (f.this.f41470m != null) {
                f.this.f41470m.requestFocus();
            }
        }
    }

    public class b implements DialogInterface.OnShowListener {

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                f.this.f41472o.dismiss();
            }
        }

        /* JADX INFO: renamed from: g7.f$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC0338b implements View.OnClickListener {
            public ViewOnClickListenerC0338b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (f.this.f41463f == null || f.this.f41463f.get(0) == null) {
                    return;
                }
                f.this.t(new File((String) f.this.f41463f.get(0)));
            }
        }

        public b() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            f fVar = f.this;
            fVar.f41467j = fVar.f41472o.getButton(-2);
            f fVar2 = f.this;
            fVar2.f41468k = fVar2.f41472o.getButton(-3);
            if (f.this.f41473p == null || f.this.f41473p.getParent() == null || f.this.f41473p.getParent().equals("/storage/emulated/0")) {
                f.this.f41468k.setVisibility(4);
            } else {
                f.this.f41468k.setVisibility(0);
            }
            f.this.f41467j.setTag("1");
            f.this.f41468k.setTag("3");
            Button button = f.this.f41467j;
            f fVar3 = f.this;
            button.setOnFocusChangeListener(fVar3.new h(fVar3.f41467j));
            f.this.f41467j.setTextColor(f.this.f41460c.getResources().getColor(a7.c.f11849G));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f.this.f41467j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) f.this.f41468k.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new C2858a(f.this.f41460c).A();
            if (strA.equals(AbstractC2237a.f44453K0)) {
                f.this.f41467j.setTextSize(16.0f);
                f.this.f41467j.setBackground(f.this.f41460c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                f.this.f41467j.setTextSize(14.0f);
                f.this.f41467j.setBackground(f.this.f41460c.getResources().getDrawable(a7.e.f12010h));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            f.this.f41467j.setOnClickListener(new a());
            f.this.f41468k.setOnClickListener(new ViewOnClickListenerC0338b());
            Button button2 = f.this.f41468k;
            f fVar4 = f.this;
            button2.setOnFocusChangeListener(fVar4.new h(fVar4.f41468k));
            f.this.f41468k.setTextColor(f.this.f41460c.getResources().getColor(a7.c.f11849G));
            if (strA.equals(AbstractC2237a.f44453K0)) {
                f.this.f41468k.setTextSize(16.0f);
                f.this.f41468k.setBackground(f.this.f41460c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
                return;
            }
            f.this.f41468k.setTextSize(14.0f);
            f.this.f41468k.setBackground(f.this.f41460c.getResources().getDrawable(a7.e.f12024k1));
            marginLayoutParams2.width = 255;
            marginLayoutParams2.height = 135;
        }
    }

    public class c implements AdapterView.OnItemClickListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
            f fVar;
            StringBuilder sb;
            String str;
            String string;
            if (((String) f.this.f41463f.get(i9)).equals("Internal Storage")) {
                fVar = f.this;
                string = "/emulated/0";
            } else {
                if (f.this.f41463f.get(i9) != null && i9 == 0 && ((String) f.this.f41463f.get(i9)).equals("..")) {
                    f.this.f41468k.performClick();
                    f.this.A();
                }
                if (f.this.f41469l == null || f.this.f41469l.get(f.this.f41463f.get(i9)) == null || ((String) f.this.f41469l.get(f.this.f41463f.get(i9))).equals("")) {
                    fVar = f.this;
                    sb = new StringBuilder();
                    sb.append("/");
                    str = (String) f.this.f41463f.get(i9);
                    sb.append(str);
                    string = sb.toString();
                } else {
                    fVar = f.this;
                    sb = new StringBuilder();
                    sb.append("/");
                    sb.append((String) f.this.f41469l.get(f.this.f41463f.get(i9)));
                    sb.append("/Android/data/");
                    str = "com.nst.iptvsmarterstvbox";
                    sb.append(str);
                    string = sb.toString();
                }
            }
            f.m(fVar, string);
            f.this.A();
        }
    }

    public class d implements DialogInterface.OnShowListener {

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                f fVar;
                File file;
                if (f.this.f41461d.equals(f.this.f41459b)) {
                    return;
                }
                if (!f.this.f41461d.equals("/storage/emulated/0")) {
                    f.this.f41461d = new File(f.this.f41461d).getParent();
                    String[] strArrSplit = f.this.f41461d.split("/");
                    if (strArrSplit.length >= 3) {
                        if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                            if (f.this.f41461d.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                                f.this.f41461d = "/storage/" + strArrSplit[2];
                                fVar = f.this;
                                file = new File(f.this.f41461d);
                            }
                        }
                        if (new File(f.this.f41461d).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            f.this.f41461d = "/storage/" + strArrSplit[2] + "/Android/data/com.nst.iptvsmarterstvbox";
                        }
                    }
                    f.this.A();
                }
                f.this.f41461d = "/storage/emulated";
                fVar = f.this;
                file = new File(f.this.f41461d);
                fVar.f41461d = file.getParent();
                f.this.A();
            }
        }

        public d() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            f fVar = f.this;
            fVar.f41467j = fVar.f41472o.getButton(-2);
            f fVar2 = f.this;
            fVar2.f41468k = fVar2.f41472o.getButton(-3);
            if (f.this.f41461d.equals(f.this.f41459b)) {
                f.this.f41468k.setVisibility(4);
            } else {
                f.this.f41468k.setVisibility(0);
            }
            f.this.f41467j.setTag("1");
            f.this.f41468k.setTag("3");
            Button button = f.this.f41467j;
            f fVar3 = f.this;
            button.setOnFocusChangeListener(fVar3.new h(fVar3.f41467j));
            f.this.f41467j.setTextColor(f.this.f41460c.getResources().getColor(a7.c.f11849G));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f.this.f41467j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) f.this.f41468k.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new C2858a(f.this.f41460c).A();
            if (strA.equals(AbstractC2237a.f44453K0)) {
                f.this.f41467j.setTextSize(16.0f);
                f.this.f41467j.setBackground(f.this.f41460c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                f.this.f41467j.setTextSize(14.0f);
                f.this.f41467j.setBackground(f.this.f41460c.getResources().getDrawable(a7.e.f12010h));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            Button button2 = f.this.f41468k;
            f fVar4 = f.this;
            button2.setOnFocusChangeListener(fVar4.new h(fVar4.f41468k));
            f.this.f41468k.setTextColor(f.this.f41460c.getResources().getColor(a7.c.f11849G));
            if (strA.equals(AbstractC2237a.f44453K0)) {
                f.this.f41468k.setTextSize(16.0f);
                f.this.f41468k.setBackground(f.this.f41460c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
            } else {
                f.this.f41468k.setTextSize(14.0f);
                f.this.f41468k.setBackground(f.this.f41460c.getResources().getDrawable(a7.e.f12024k1));
                marginLayoutParams2.width = 255;
                marginLayoutParams2.height = 135;
            }
            f.this.f41468k.setOnClickListener(new a());
        }
    }

    public class e implements DialogInterface.OnKeyListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i9, KeyEvent keyEvent) {
            f fVar;
            File file;
            if (i9 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (f.this.f41461d.equals(f.this.f41459b)) {
                f.this.f41472o.dismiss();
                return true;
            }
            if (!f.this.f41461d.equals("/storage/emulated/0")) {
                f.this.f41461d = new File(f.this.f41461d).getParent();
                String[] strArrSplit = f.this.f41461d.split("/");
                if (strArrSplit.length >= 3) {
                    if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                        if (f.this.f41461d.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            f.this.f41461d = "/storage/" + strArrSplit[2];
                            fVar = f.this;
                            file = new File(f.this.f41461d);
                        }
                    }
                    if (new File(f.this.f41461d).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                        f.this.f41461d = "/storage/" + strArrSplit[2] + "/Android/data/com.nst.iptvsmarterstvbox";
                    }
                }
                f.this.A();
                return true;
            }
            f.this.f41461d = "/storage/emulated";
            fVar = f.this;
            file = new File(f.this.f41461d);
            fVar.f41461d = file.getParent();
            f.this.A();
            return true;
        }
    }

    /* JADX INFO: renamed from: g7.f$f, reason: collision with other inner class name */
    public class C0339f implements Comparator {
        public C0339f() {
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
        public final View f41483a;

        public h(View view) {
            this.f41483a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f41483a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f41483a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                View view2 = this.f41483a;
                if (view2 == null || view2.getTag() == null || !this.f41483a.getTag().equals("6")) {
                    f = z9 ? 1.12f : 1.0f;
                    a(f);
                    b(f);
                    View view3 = this.f41483a;
                    if (view3 != null && view3.getTag() != null && this.f41483a.getTag().equals("1") && f.this.f41467j != null) {
                        f.this.f41467j.setBackgroundResource(a7.e.f12010h);
                    }
                    View view4 = this.f41483a;
                    if (view4 == null || view4.getTag() == null || !this.f41483a.getTag().equals("3") || f.this.f41468k == null) {
                        return;
                    }
                    f.this.f41468k.setBackgroundResource(a7.e.f12042p);
                    return;
                }
                if (z9) {
                    f = 1.18f;
                }
            } else {
                if (z9) {
                    return;
                }
                View view5 = this.f41483a;
                if (view5 != null && view5.getTag() != null && this.f41483a.getTag().equals("1") && f.this.f41467j != null) {
                    f.this.f41467j.setBackgroundResource(a7.e.f12038o);
                }
                View view6 = this.f41483a;
                if (view6 != null && view6.getTag() != null && this.f41483a.getTag().equals("3") && f.this.f41468k != null) {
                    f.this.f41468k.setBackgroundResource(a7.e.f12038o);
                }
            }
            a(f);
            b(f);
        }
    }

    public f(Context context, g gVar) {
        this.f41459b = "";
        this.f41464g = null;
        this.f41460c = context;
        int length = context.getExternalFilesDirs("external").length;
        this.f41459b = "/storage";
        this.f41464g = gVar;
        try {
            this.f41459b = new File(this.f41459b).getCanonicalPath();
        } catch (IOException unused) {
        }
    }

    public static /* synthetic */ String m(f fVar, Object obj) {
        String str = fVar.f41461d + obj;
        fVar.f41461d = str;
        return str;
    }

    public static int w(float f9, Context context) {
        return (int) ((f9 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void A() {
        TextView textView;
        try {
            if (!this.f41461d.endsWith(".m3u") && !this.f41461d.endsWith(".m3u8")) {
                if (this.f41461d.equals(this.f41459b)) {
                    z(y(this.f41461d));
                } else {
                    this.f41463f.clear();
                    this.f41463f.add("..");
                    this.f41463f.addAll(y(this.f41461d));
                }
                AlertDialog alertDialog = this.f41472o;
                if (alertDialog != null && (textView = (TextView) alertDialog.findViewById(R.id.message)) != null) {
                    textView.setText(this.f41461d);
                }
                if (this.f41461d.equals(this.f41459b)) {
                    this.f41468k.setVisibility(4);
                } else {
                    this.f41468k.setVisibility(0);
                }
                this.f41465h.notifyDataSetChanged();
                this.f41470m.setSelection(0);
                ListViewMaxHeight listViewMaxHeight = this.f41470m;
                if (listViewMaxHeight != null) {
                    listViewMaxHeight.requestFocus();
                    return;
                }
                return;
            }
            g gVar = this.f41464g;
            if (gVar != null) {
                gVar.a(this.f41461d);
                this.f41472o.dismiss();
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
                    this.f41468k.setVisibility(4);
                } else {
                    arrayList.add(new File(parent).getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                    this.f41468k.setVisibility(0);
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
            this.f41463f.clear();
            this.f41463f.addAll(arrayList);
            this.f41466i.notifyDataSetChanged();
            this.f41470m.setSelection(0);
            ListViewMaxHeight listViewMaxHeight = this.f41470m;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.requestFocus();
            }
        } catch (Exception unused) {
        }
    }

    public void u(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            str = this.f41459b;
        }
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            this.f41461d = canonicalPath;
            this.f41462e = y(canonicalPath);
            this.f41463f = y("");
            z(this.f41462e);
            AlertDialog.Builder builderX = x(canonicalPath, this.f41463f);
            this.f41471n = builderX;
            builderX.setNegativeButton(this.f41460c.getResources().getString(a7.j.f13149U6), (DialogInterface.OnClickListener) null);
            this.f41471n.setNeutralButton(this.f41460c.getResources().getString(a7.j.f13140T6), (DialogInterface.OnClickListener) null);
            C2624h c2624h = new C2624h(this.f41460c, this.f41463f);
            this.f41465h = c2624h;
            ListViewMaxHeight listViewMaxHeight = this.f41470m;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c2624h);
                this.f41470m.setOnItemClickListener(new c());
            }
            AlertDialog alertDialogCreate = this.f41471n.create();
            this.f41472o = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new d());
            this.f41472o.setOnKeyListener(new e());
            this.f41472o.show();
            if (this.f41472o.getWindow() != null) {
                this.f41472o.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f41472o.getWindow().setLayout(w(650.0f, this.f41460c), -2);
            }
        } catch (IOException unused) {
        }
    }

    public void v(String str) {
        try {
            File absoluteFile = Environment.getExternalStoragePublicDirectory("").getAbsoluteFile();
            ArrayList arrayList = new ArrayList();
            this.f41463f = arrayList;
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
                    this.f41463f.add(new File(Environment.getExternalStoragePublicDirectory(list2[i9]).toString()).getPath());
                    i9++;
                }
            }
            AlertDialog.Builder builderX = x("", this.f41463f);
            this.f41471n = builderX;
            builderX.setNegativeButton(this.f41460c.getResources().getString(a7.j.f13149U6), (DialogInterface.OnClickListener) null);
            this.f41471n.setNeutralButton(this.f41460c.getResources().getString(a7.j.f13140T6), (DialogInterface.OnClickListener) null);
            C2626j c2626j = new C2626j(this.f41460c, this.f41463f, "m3u");
            this.f41466i = c2626j;
            ListViewMaxHeight listViewMaxHeight = this.f41470m;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c2626j);
                this.f41470m.setOnItemClickListener(new a());
            }
            AlertDialog alertDialogCreate = this.f41471n.create();
            this.f41472o = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new b());
            this.f41472o.show();
            if (this.f41472o.getWindow() != null) {
                this.f41472o.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f41472o.getWindow().setLayout(w(650.0f, this.f41460c), -2);
            }
        } catch (Exception unused) {
        }
    }

    public final AlertDialog.Builder x(String str, List list) {
        this.f41471n = new AlertDialog.Builder(this.f41460c, a7.k.f13456a);
        LinearLayout linearLayout = new LinearLayout(this.f41460c);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(this.f41460c);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(this.f41460c.getResources().getString(a7.j.f13307l0));
        Drawable drawable = this.f41460c.getResources().getDrawable(a7.e.f12082z);
        drawable.setBounds(0, 0, 80, 80);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setTextSize(22.0f);
        textView.setTextColor(this.f41460c.getResources().getColor(R.color.black));
        textView.setPadding(50, 50, 0, 0);
        textView.setTypeface(null, 1);
        linearLayout.addView(textView);
        this.f41471n.setCustomTitle(linearLayout);
        View viewInflate = ((LayoutInflater) this.f41460c.getSystemService("layout_inflater")).inflate(a7.g.f12885u2, (ViewGroup) null);
        this.f41471n.setView(viewInflate);
        this.f41470m = (ListViewMaxHeight) viewInflate.findViewById(a7.f.Za);
        this.f41471n.setCancelable(true);
        return this.f41471n;
    }

    public final List y(String str) {
        File file;
        ArrayList arrayList = new ArrayList();
        try {
            file = new File(str);
        } catch (Exception unused) {
        }
        if (file.exists() && file.isDirectory()) {
            if (file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    if (file2.isDirectory()) {
                        arrayList.add(file2.getName());
                    }
                    if ((file2.isFile() && file2.getName().endsWith(".m3u")) || (file2.isFile() && file2.getName().endsWith(".m3u8"))) {
                        arrayList.add(file2.getName());
                    }
                }
            }
            Collections.sort(arrayList, new C0339f());
            return arrayList;
        }
        return arrayList;
    }

    public final void z(List list) {
        this.f41463f.clear();
        Iterator it = list.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!str.equals("self")) {
                if (str.equals("emulated")) {
                    z9 = true;
                } else if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(str).matches()) {
                    this.f41469l.put("SD Card", str);
                    this.f41463f.add("SD Card");
                } else {
                    this.f41463f.add(str);
                }
            }
        }
        if (z9) {
            this.f41463f.add(0, "Internal Storage");
        }
    }
}
