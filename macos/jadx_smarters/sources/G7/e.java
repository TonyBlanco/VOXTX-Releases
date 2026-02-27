package g7;

import android.R;
import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f41421c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f41425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C2624h f41426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2626j f41427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f41428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f41429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f41430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Button f41431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Button f41432n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ListViewMaxHeight f41434p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f41435q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AlertDialog.Builder f41436r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AlertDialog f41437s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public File f41438t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41419a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f41422d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f41423e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f41424f = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HashMap f41433o = new HashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f41439u = "";

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            if (e.this.f41425g != null) {
                e.this.f41425g.a(e.this.f41439u);
            }
        }
    }

    public class b implements AdapterView.OnItemClickListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
            e.this.f41430l.setVisibility(0);
            e.this.f41429k.setVisibility(0);
            e.this.f41438t = new File((String) e.this.f41424f.get(i9));
            if (e.this.f41438t == null || !e.this.f41438t.isFile()) {
                e eVar = e.this;
                eVar.f41422d = eVar.f41438t.getName();
                e eVar2 = e.this;
                eVar2.f41439u = eVar2.f41438t.getPath();
                ArrayList arrayList = new ArrayList();
                arrayList.clear();
                if (e.this.f41422d.equals("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                    e eVar3 = e.this;
                    eVar3.C(eVar3.f41438t);
                    return;
                }
                arrayList.add(e.this.f41438t.getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                if (e.this.f41438t.list() != null) {
                    int i10 = 0;
                    while (true) {
                        String[] list = e.this.f41438t.list();
                        Objects.requireNonNull(list);
                        if (i10 >= list.length) {
                            break;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(e.this.f41438t.getPath());
                        sb.append("/");
                        String[] list2 = e.this.f41438t.list();
                        Objects.requireNonNull(list2);
                        sb.append(list2[i10]);
                        if (new File(sb.toString()).isDirectory()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(e.this.f41438t.getPath());
                            sb2.append("/");
                            String[] list3 = e.this.f41438t.list();
                            Objects.requireNonNull(list3);
                            sb2.append(list3[i10]);
                            arrayList.add(sb2.toString());
                        }
                        i10++;
                    }
                }
                e.this.f41424f.clear();
                e.this.f41424f.addAll(arrayList);
                e.this.f41427i.notifyDataSetChanged();
                e.this.f41434p.setSelection(0);
                if (e.this.f41434p != null) {
                    e.this.f41434p.requestFocus();
                }
            }
        }
    }

    public class c implements DialogInterface.OnShowListener {

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e.this.f41437s.dismiss();
            }
        }

        public class b implements View.OnClickListener {
            public b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (e.this.f41424f == null || e.this.f41424f.get(0) == null) {
                    return;
                }
                e.this.C(new File((String) e.this.f41424f.get(0)));
            }
        }

        public c() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            e eVar = e.this;
            eVar.f41428j = eVar.f41437s.getButton(-2);
            e eVar2 = e.this;
            eVar2.f41429k = eVar2.f41437s.getButton(-1);
            e eVar3 = e.this;
            eVar3.f41430l = eVar3.f41437s.getButton(-3);
            if (e.this.f41438t == null || e.this.f41438t.getParent() == null || e.this.f41438t.getParent().equals("/storage/emulated/0")) {
                e.this.f41430l.setVisibility(4);
                e.this.f41429k.setVisibility(4);
            } else {
                e.this.f41430l.setVisibility(0);
                e.this.f41429k.setVisibility(0);
            }
            e.this.f41428j.setTag("1");
            e.this.f41429k.setTag("2");
            e.this.f41430l.setTag("3");
            Button button = e.this.f41428j;
            e eVar4 = e.this;
            button.setOnFocusChangeListener(eVar4.new k(eVar4.f41428j));
            e.this.f41428j.setTextColor(e.this.f41421c.getResources().getColor(a7.c.f11849G));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e.this.f41428j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) e.this.f41429k.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) e.this.f41430l.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new C2858a(e.this.f41421c).A();
            if (strA.equals(AbstractC2237a.f44453K0)) {
                e.this.f41428j.setTextSize(16.0f);
                e.this.f41428j.setBackground(e.this.f41421c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                e.this.f41428j.setTextSize(14.0f);
                e.this.f41428j.setBackground(e.this.f41421c.getResources().getDrawable(a7.e.f12010h));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            e.this.f41428j.setOnClickListener(new a());
            e.this.f41430l.setOnClickListener(new b());
            Button button2 = e.this.f41429k;
            e eVar5 = e.this;
            button2.setOnFocusChangeListener(eVar5.new k(eVar5.f41429k));
            marginLayoutParams2.setMargins(0, 0, 70, 0);
            if (strA.equals(AbstractC2237a.f44453K0)) {
                e.this.f41429k.setTextColor(e.this.f41421c.getResources().getColor(a7.c.f11849G));
                e.this.f41429k.setTextSize(16.0f);
                e.this.f41429k.setBackground(e.this.f41421c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
            } else {
                e.this.f41429k.setTextColor(e.this.f41421c.getResources().getColor(a7.c.f11849G));
                e.this.f41429k.setTextSize(14.0f);
                e.this.f41429k.setBackground(e.this.f41421c.getResources().getDrawable(a7.e.f12024k1));
                marginLayoutParams2.width = 255;
                marginLayoutParams2.height = 135;
            }
            Button button3 = e.this.f41430l;
            e eVar6 = e.this;
            button3.setOnFocusChangeListener(eVar6.new k(eVar6.f41430l));
            e.this.f41430l.setTextColor(e.this.f41421c.getResources().getColor(a7.c.f11849G));
            if (strA.equals(AbstractC2237a.f44453K0)) {
                e.this.f41430l.setTextSize(16.0f);
                e.this.f41430l.setBackground(e.this.f41421c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams3.width = 230;
                marginLayoutParams3.height = 90;
                return;
            }
            e.this.f41430l.setTextSize(14.0f);
            e.this.f41430l.setBackground(e.this.f41421c.getResources().getDrawable(a7.e.f12024k1));
            marginLayoutParams3.width = 255;
            marginLayoutParams3.height = 135;
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            if (e.this.f41425g != null) {
                e.this.f41425g.a(e.this.f41422d);
            }
        }
    }

    /* JADX INFO: renamed from: g7.e$e, reason: collision with other inner class name */
    public class C0337e implements AdapterView.OnItemClickListener {
        public C0337e() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
            e eVar;
            StringBuilder sb;
            String str;
            String string;
            if (((String) e.this.f41424f.get(i9)).equals("Internal Storage")) {
                eVar = e.this;
                string = "/emulated/0";
            } else {
                if (e.this.f41424f.get(i9) != null && i9 == 0 && ((String) e.this.f41424f.get(i9)).equals("..")) {
                    e.this.f41430l.performClick();
                    e.this.L();
                }
                if (e.this.f41433o == null || e.this.f41433o.get(e.this.f41424f.get(i9)) == null || ((String) e.this.f41433o.get(e.this.f41424f.get(i9))).equals("")) {
                    eVar = e.this;
                    sb = new StringBuilder();
                    sb.append("/");
                    str = (String) e.this.f41424f.get(i9);
                    sb.append(str);
                    string = sb.toString();
                } else {
                    eVar = e.this;
                    sb = new StringBuilder();
                    sb.append("/");
                    sb.append((String) e.this.f41433o.get(e.this.f41424f.get(i9)));
                    sb.append("/Android/data/");
                    str = "com.nst.iptvsmarterstvbox";
                    sb.append(str);
                    string = sb.toString();
                }
            }
            e.y(eVar, string);
            e.this.L();
        }
    }

    public class f implements DialogInterface.OnShowListener {

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e eVar;
                File file;
                if (e.this.f41422d.equals(e.this.f41420b)) {
                    return;
                }
                if (!e.this.f41422d.equals("/storage/emulated/0")) {
                    e.this.f41422d = new File(e.this.f41422d).getParent();
                    String[] strArrSplit = e.this.f41422d.split("/");
                    if (strArrSplit.length >= 3) {
                        if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                            if (e.this.f41422d.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                                e.this.f41422d = "/storage/" + strArrSplit[2];
                                eVar = e.this;
                                file = new File(e.this.f41422d);
                            }
                        }
                        if (new File(e.this.f41422d).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            e.this.f41422d = "/storage/" + strArrSplit[2] + "/Android/data/com.nst.iptvsmarterstvbox";
                        }
                    }
                    e.this.L();
                }
                e.this.f41422d = "/storage/emulated";
                eVar = e.this;
                file = new File(e.this.f41422d);
                eVar.f41422d = file.getParent();
                e.this.L();
            }
        }

        public f() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            e eVar = e.this;
            eVar.f41428j = eVar.f41437s.getButton(-2);
            e eVar2 = e.this;
            eVar2.f41429k = eVar2.f41437s.getButton(-1);
            e eVar3 = e.this;
            eVar3.f41430l = eVar3.f41437s.getButton(-3);
            if (e.this.f41422d.equals(e.this.f41420b)) {
                e.this.f41430l.setVisibility(4);
                e.this.f41429k.setVisibility(8);
            } else {
                e.this.f41430l.setVisibility(0);
                e.this.f41429k.setVisibility(0);
            }
            e.this.f41428j.setTag("1");
            e.this.f41429k.setTag("2");
            e.this.f41430l.setTag("3");
            Button button = e.this.f41428j;
            e eVar4 = e.this;
            button.setOnFocusChangeListener(eVar4.new k(eVar4.f41428j));
            e.this.f41428j.setTextColor(e.this.f41421c.getResources().getColor(a7.c.f11849G));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e.this.f41428j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) e.this.f41429k.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) e.this.f41430l.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new C2858a(e.this.f41421c).A();
            if (strA.equals(AbstractC2237a.f44453K0)) {
                e.this.f41428j.setTextSize(16.0f);
                e.this.f41428j.setBackground(e.this.f41421c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                e.this.f41428j.setTextSize(14.0f);
                e.this.f41428j.setBackground(e.this.f41421c.getResources().getDrawable(a7.e.f12010h));
                marginLayoutParams.width = 250;
                marginLayoutParams.height = IjkMediaMeta.FF_PROFILE_H264_HIGH_10;
            }
            Button button2 = e.this.f41429k;
            e eVar5 = e.this;
            button2.setOnFocusChangeListener(eVar5.new k(eVar5.f41429k));
            marginLayoutParams2.setMargins(0, 0, 70, 0);
            if (strA.equals(AbstractC2237a.f44453K0)) {
                e.this.f41429k.setTextColor(e.this.f41421c.getResources().getColor(a7.c.f11849G));
                e.this.f41429k.setTextSize(16.0f);
                e.this.f41429k.setBackground(e.this.f41421c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
            } else {
                e.this.f41429k.setTextColor(e.this.f41421c.getResources().getColor(a7.c.f11849G));
                e.this.f41429k.setTextSize(14.0f);
                e.this.f41429k.setBackground(e.this.f41421c.getResources().getDrawable(a7.e.f12024k1));
                marginLayoutParams2.width = 250;
                marginLayoutParams2.height = IjkMediaMeta.FF_PROFILE_H264_HIGH_10;
            }
            Button button3 = e.this.f41430l;
            e eVar6 = e.this;
            button3.setOnFocusChangeListener(eVar6.new k(eVar6.f41430l));
            e.this.f41430l.setTextColor(e.this.f41421c.getResources().getColor(a7.c.f11849G));
            if (strA.equals(AbstractC2237a.f44453K0)) {
                e.this.f41430l.setTextSize(16.0f);
                e.this.f41430l.setBackground(e.this.f41421c.getResources().getDrawable(a7.e.f12038o));
                marginLayoutParams3.width = 230;
                marginLayoutParams3.height = 90;
            } else {
                e.this.f41430l.setTextSize(14.0f);
                e.this.f41430l.setBackground(e.this.f41421c.getResources().getDrawable(a7.e.f12024k1));
                marginLayoutParams3.width = 250;
                marginLayoutParams3.height = IjkMediaMeta.FF_PROFILE_H264_HIGH_10;
            }
            e.this.f41430l.setOnClickListener(new a());
        }
    }

    public class g implements DialogInterface.OnKeyListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i9, KeyEvent keyEvent) {
            e eVar;
            File file;
            if (i9 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (e.this.f41422d.equals(e.this.f41420b)) {
                e.this.f41437s.dismiss();
                return true;
            }
            if (!e.this.f41422d.equals("/storage/emulated/0")) {
                e.this.f41422d = new File(e.this.f41422d).getParent();
                String[] strArrSplit = e.this.f41422d.split("/");
                if (strArrSplit.length >= 3) {
                    if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                        if (e.this.f41422d.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            e.this.f41422d = "/storage/" + strArrSplit[2];
                            eVar = e.this;
                            file = new File(e.this.f41422d);
                        }
                    }
                    if (new File(e.this.f41422d).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                        e.this.f41422d = "/storage/" + strArrSplit[2] + "/Android/data/com.nst.iptvsmarterstvbox";
                    }
                }
                e.this.L();
                return true;
            }
            e.this.f41422d = "/storage/emulated";
            eVar = e.this;
            file = new File(e.this.f41422d);
            eVar.f41422d = file.getParent();
            e.this.L();
            return true;
        }
    }

    public class h implements Comparator {
        public h() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    public class i implements View.OnClickListener {

        public class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ EditText f41452a;

            public a(EditText editText) {
                this.f41452a = editText;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i9) {
                Context context;
                StringBuilder sb;
                e eVar;
                File file;
                String string = this.f41452a.getText().toString();
                if (Build.VERSION.SDK_INT < 30) {
                    if (e.this.H(e.this.f41422d + "/" + string)) {
                        e.y(e.this, "/" + string);
                        e.this.L();
                        return;
                    }
                    context = e.this.f41421c;
                    sb = new StringBuilder();
                    sb.append(e.this.f41421c.getResources().getString(a7.j.f13189Z1));
                    sb.append("'");
                } else if (e.this.f41439u.equals("") || e.this.f41439u.equals("/storage/emulated/0/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                    if (e.this.H(new File("/storage/emulated/0/" + string).toString())) {
                        eVar = e.this;
                        file = new File("/storage/emulated/0/" + string);
                        eVar.C(file);
                        return;
                    }
                    context = e.this.f41421c;
                    sb = new StringBuilder();
                    sb.append(e.this.f41421c.getResources().getString(a7.j.f13189Z1));
                    sb.append(" '");
                } else if (e.this.f41439u.contains("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                    e eVar2 = e.this;
                    eVar2.f41439u = eVar2.f41439u.replace("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#", "");
                    if (e.this.H(e.this.f41439u + "/" + string)) {
                        eVar = e.this;
                        file = new File(e.this.f41439u + "/" + string);
                        eVar.C(file);
                        return;
                    }
                    context = e.this.f41421c;
                    sb = new StringBuilder();
                    sb.append(e.this.f41421c.getResources().getString(a7.j.f13189Z1));
                    sb.append(" '");
                } else {
                    if (e.this.H(e.this.f41439u + "/" + string)) {
                        eVar = e.this;
                        file = new File(e.this.f41439u + "/" + string);
                        eVar.C(file);
                        return;
                    }
                    context = e.this.f41421c;
                    sb = new StringBuilder();
                    sb.append(e.this.f41421c.getResources().getString(a7.j.f13189Z1));
                    sb.append(" '");
                }
                sb.append(string);
                sb.append("' ");
                sb.append(e.this.f41421c.getResources().getString(a7.j.f13299k2));
                Toast.makeText(context, sb.toString(), 0).show();
            }
        }

        public class b implements DialogInterface.OnShowListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AlertDialog f41454a;

            public b(AlertDialog alertDialog) {
                this.f41454a = alertDialog;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                e.this.f41432n = this.f41454a.getButton(-3);
                e.this.f41431m = this.f41454a.getButton(-1);
                e.this.f41432n.setTag("4");
                e.this.f41431m.setTag("5");
                Button button = e.this.f41432n;
                e eVar = e.this;
                button.setOnFocusChangeListener(eVar.new k(eVar.f41432n));
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e.this.f41432n.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) e.this.f41431m.getLayoutParams();
                marginLayoutParams.setMargins(70, 0, 0, 0);
                marginLayoutParams2.setMargins(0, 0, 70, 0);
                String strA = new C2858a(e.this.f41421c).A();
                if (strA.equals(AbstractC2237a.f44453K0)) {
                    e.this.f41432n.setTextColor(e.this.f41421c.getResources().getColor(a7.c.f11849G));
                    e.this.f41432n.setTextSize(16.0f);
                    e.this.f41432n.setBackground(e.this.f41421c.getResources().getDrawable(a7.e.f12038o));
                    marginLayoutParams.width = 230;
                    marginLayoutParams.height = 70;
                } else {
                    e.this.f41432n.setTextColor(e.this.f41421c.getResources().getColor(a7.c.f11849G));
                    e.this.f41432n.setTextSize(14.0f);
                    e.this.f41432n.setBackground(e.this.f41421c.getResources().getDrawable(a7.e.f12010h));
                    marginLayoutParams.width = 250;
                    marginLayoutParams.height = IjkMediaMeta.FF_PROFILE_H264_HIGH_10;
                }
                Button button2 = e.this.f41431m;
                e eVar2 = e.this;
                button2.setOnFocusChangeListener(eVar2.new k(eVar2.f41431m));
                e.this.f41431m.setTextColor(e.this.f41421c.getResources().getColor(a7.c.f11849G));
                if (strA.equals(AbstractC2237a.f44453K0)) {
                    e.this.f41431m.setTextSize(16.0f);
                    e.this.f41431m.setBackground(e.this.f41421c.getResources().getDrawable(a7.e.f12038o));
                    marginLayoutParams2.width = 230;
                    marginLayoutParams2.height = 70;
                    return;
                }
                e.this.f41431m.setTextSize(14.0f);
                e.this.f41431m.setBackground(e.this.f41421c.getResources().getDrawable(a7.e.f12024k1));
                marginLayoutParams2.width = 250;
                marginLayoutParams2.height = IjkMediaMeta.FF_PROFILE_H264_HIGH_10;
            }
        }

        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = new EditText(e.this.f41421c);
            editText.setLayoutParams(new ViewGroup.LayoutParams(-1, 100));
            AlertDialog.Builder builder = new AlertDialog.Builder(e.this.f41421c, a7.k.f13456a);
            builder.setTitle(e.this.f41421c.getResources().getString(a7.j.f13191Z3)).setView(editText).setPositiveButton(e.this.f41421c.getResources().getString(a7.j.f13158V6), new a(editText)).setNeutralButton(e.this.f41421c.getResources().getString(a7.j.f13149U6), (DialogInterface.OnClickListener) null);
            AlertDialog alertDialogCreate = builder.create();
            alertDialogCreate.setOnShowListener(new b(alertDialogCreate));
            alertDialogCreate.show();
            if (alertDialogCreate.getWindow() != null) {
                alertDialogCreate.getWindow().setLayout(750, 350);
                alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
            }
        }
    }

    public interface j {
        void a(String str);
    }

    public class k implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f41456a;

        public k(View view) {
            this.f41456a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f41456a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f41456a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                View view2 = this.f41456a;
                if (view2 == null || view2.getTag() == null || !this.f41456a.getTag().equals("6")) {
                    f = z9 ? 1.12f : 1.0f;
                    a(f);
                    b(f);
                    View view3 = this.f41456a;
                    if (view3 != null && view3.getTag() != null && this.f41456a.getTag().equals("1") && e.this.f41428j != null) {
                        e.this.f41428j.setBackgroundResource(a7.e.f12010h);
                    }
                    View view4 = this.f41456a;
                    if (view4 != null && view4.getTag() != null && this.f41456a.getTag().equals("2") && e.this.f41429k != null) {
                        e.this.f41429k.setBackgroundResource(a7.e.f12024k1);
                    }
                    View view5 = this.f41456a;
                    if (view5 != null && view5.getTag() != null && this.f41456a.getTag().equals("3") && e.this.f41430l != null) {
                        e.this.f41430l.setBackgroundResource(a7.e.f12042p);
                    }
                    View view6 = this.f41456a;
                    if (view6 != null && view6.getTag() != null && this.f41456a.getTag().equals("4") && e.this.f41432n != null) {
                        e.this.f41432n.setBackgroundResource(a7.e.f12010h);
                    }
                    View view7 = this.f41456a;
                    if (view7 == null || view7.getTag() == null || !this.f41456a.getTag().equals("5") || e.this.f41431m == null) {
                        return;
                    }
                    e.this.f41431m.setBackgroundResource(a7.e.f12024k1);
                    return;
                }
                if (z9) {
                    f = 1.18f;
                }
            } else {
                if (z9) {
                    return;
                }
                View view8 = this.f41456a;
                if (view8 != null && view8.getTag() != null && this.f41456a.getTag().equals("1") && e.this.f41428j != null) {
                    e.this.f41428j.setBackgroundResource(a7.e.f12038o);
                }
                View view9 = this.f41456a;
                if (view9 != null && view9.getTag() != null && this.f41456a.getTag().equals("2") && e.this.f41429k != null) {
                    e.this.f41429k.setBackgroundResource(a7.e.f12038o);
                }
                View view10 = this.f41456a;
                if (view10 != null && view10.getTag() != null && this.f41456a.getTag().equals("3") && e.this.f41430l != null) {
                    e.this.f41430l.setBackgroundResource(a7.e.f12038o);
                }
                View view11 = this.f41456a;
                if (view11 != null && view11.getTag() != null && this.f41456a.getTag().equals("4") && e.this.f41432n != null) {
                    e.this.f41432n.setBackgroundResource(a7.e.f12038o);
                }
                View view12 = this.f41456a;
                if (view12 != null && view12.getTag() != null && this.f41456a.getTag().equals("5") && e.this.f41431m != null) {
                    e.this.f41431m.setBackgroundResource(a7.e.f12038o);
                }
            }
            a(f);
            b(f);
        }
    }

    public e(Context context, j jVar) {
        this.f41420b = "";
        this.f41425g = null;
        this.f41421c = context;
        int length = context.getExternalFilesDirs("external").length;
        this.f41420b = "/storage";
        this.f41425g = jVar;
        try {
            this.f41420b = new File(this.f41420b).getCanonicalPath();
        } catch (IOException unused) {
        }
    }

    public static int F(float f9, Context context) {
        return (int) ((f9 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static /* synthetic */ String y(e eVar, Object obj) {
        String str = eVar.f41422d + obj;
        eVar.f41422d = str;
        return str;
    }

    public final void C(File file) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (file.getParent() != null) {
                String parent = file.getParent();
                if (parent.equals("/storage/emulated/0")) {
                    this.f41430l.setVisibility(4);
                } else {
                    arrayList.add(new File(parent).getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                    this.f41430l.setVisibility(0);
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
                        if (new File(sb.toString()).isDirectory()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(file.getParent());
                            sb2.append("/");
                            String[] list3 = file2.list();
                            Objects.requireNonNull(list3);
                            sb2.append(list3[i9]);
                            arrayList.add(sb2.toString());
                        }
                        i9++;
                    }
                }
            }
            this.f41424f.clear();
            this.f41424f.addAll(arrayList);
            this.f41427i.notifyDataSetChanged();
            this.f41434p.setSelection(0);
            ListViewMaxHeight listViewMaxHeight = this.f41434p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.requestFocus();
            }
        } catch (Exception unused) {
        }
    }

    public void D(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            str = this.f41420b;
        }
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            this.f41422d = canonicalPath;
            this.f41423e = I(canonicalPath);
            this.f41424f = I("");
            J(this.f41423e);
            AlertDialog.Builder builderG = G(canonicalPath, this.f41424f);
            this.f41436r = builderG;
            builderG.setNegativeButton(this.f41421c.getResources().getString(a7.j.f13149U6), (DialogInterface.OnClickListener) null);
            this.f41436r.setNeutralButton(this.f41421c.getResources().getString(a7.j.f13140T6), (DialogInterface.OnClickListener) null);
            this.f41436r.setPositiveButton(this.f41421c.getResources().getString(a7.j.f13158V6), new d());
            C2624h c2624h = new C2624h(this.f41421c, this.f41424f);
            this.f41426h = c2624h;
            ListViewMaxHeight listViewMaxHeight = this.f41434p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c2624h);
                this.f41434p.setOnItemClickListener(new C0337e());
            }
            AlertDialog alertDialogCreate = this.f41436r.create();
            this.f41437s = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new f());
            this.f41437s.setOnKeyListener(new g());
            this.f41437s.show();
            if (this.f41437s.getWindow() != null) {
                this.f41437s.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f41437s.getWindow().setLayout(F(650.0f, this.f41421c), -2);
            }
        } catch (IOException unused) {
        }
    }

    public void E(String str) {
        try {
            this.f41439u = "";
            File absoluteFile = Environment.getExternalStoragePublicDirectory("").getAbsoluteFile();
            ArrayList arrayList = new ArrayList();
            this.f41424f = arrayList;
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
                    File file = new File(Environment.getExternalStoragePublicDirectory(list2[i9]).toString());
                    if (file.isDirectory()) {
                        this.f41424f.add(file.getPath());
                    }
                    i9++;
                }
            }
            AlertDialog.Builder builderG = G("", this.f41424f);
            this.f41436r = builderG;
            builderG.setNegativeButton(this.f41421c.getResources().getString(a7.j.f13149U6), (DialogInterface.OnClickListener) null);
            this.f41436r.setNeutralButton(this.f41421c.getResources().getString(a7.j.f13140T6), (DialogInterface.OnClickListener) null);
            this.f41436r.setPositiveButton(this.f41421c.getResources().getString(a7.j.f13158V6), new a());
            C2626j c2626j = new C2626j(this.f41421c, this.f41424f, "recording");
            this.f41427i = c2626j;
            ListViewMaxHeight listViewMaxHeight = this.f41434p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c2626j);
                this.f41434p.setOnItemClickListener(new b());
            }
            AlertDialog alertDialogCreate = this.f41436r.create();
            this.f41437s = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new c());
            this.f41437s.show();
            if (this.f41437s.getWindow() != null) {
                this.f41437s.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f41437s.getWindow().setLayout(F(650.0f, this.f41421c), -2);
            }
        } catch (Exception unused) {
        }
    }

    public final AlertDialog.Builder G(String str, List list) {
        this.f41436r = new AlertDialog.Builder(this.f41421c, a7.k.f13456a);
        LinearLayout linearLayout = new LinearLayout(this.f41421c);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(this.f41421c);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(this.f41421c.getResources().getString(a7.j.f13317m0));
        Drawable drawable = this.f41421c.getResources().getDrawable(a7.e.f12082z);
        drawable.setBounds(0, 0, 80, 80);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setTextSize(22.0f);
        textView.setTextColor(this.f41421c.getResources().getColor(R.color.black));
        textView.setPadding(50, 50, 0, 0);
        textView.setTypeface(null, 1);
        ImageView imageView = new ImageView(this.f41421c);
        this.f41435q = imageView;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f41435q.setPadding(20, 20, 0, 0);
        this.f41435q.setTag("6");
        this.f41435q.setId(a7.f.Xg);
        this.f41435q.setFocusable(true);
        ImageView imageView2 = this.f41435q;
        imageView2.setOnFocusChangeListener(new k(imageView2));
        if (Build.VERSION.SDK_INT <= 21) {
            this.f41435q.setImageResource(a7.e.f12002f);
        }
        this.f41435q.setImageDrawable(this.f41421c.getResources().getDrawable(a7.e.f12002f, null));
        ((LinearLayout.LayoutParams) this.f41435q.getLayoutParams()).gravity = 8388613;
        this.f41435q.setOnClickListener(new i());
        linearLayout.addView(textView);
        linearLayout.addView(this.f41435q);
        this.f41436r.setCustomTitle(linearLayout);
        View viewInflate = ((LayoutInflater) this.f41421c.getSystemService("layout_inflater")).inflate(a7.g.f12885u2, (ViewGroup) null);
        this.f41436r.setView(viewInflate);
        this.f41434p = (ListViewMaxHeight) viewInflate.findViewById(a7.f.Za);
        this.f41436r.setCancelable(false);
        return this.f41436r;
    }

    public final boolean H(String str) {
        File file = new File(str);
        if (file.exists()) {
            return false;
        }
        return file.mkdir();
    }

    public final List I(String str) {
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
            }
            Collections.sort(arrayList, new h());
            return arrayList;
        }
        return arrayList;
    }

    public final void J(List list) {
        this.f41424f.clear();
        Iterator it = list.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!str.equals("self")) {
                if (str.equals("emulated")) {
                    z9 = true;
                } else if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(str).matches()) {
                    this.f41433o.put("SD Card", str);
                    this.f41424f.add("SD Card");
                } else {
                    this.f41424f.add(str);
                }
            }
        }
        if (z9) {
            this.f41424f.add(0, "Internal Storage");
        }
    }

    public void K(boolean z9) {
        this.f41419a = z9;
    }

    public final void L() {
        TextView textView;
        try {
            if (this.f41422d.equals(this.f41420b)) {
                J(I(this.f41422d));
            } else {
                this.f41424f.clear();
                this.f41424f.add("..");
                this.f41424f.addAll(I(this.f41422d));
            }
            AlertDialog alertDialog = this.f41437s;
            if (alertDialog != null && (textView = (TextView) alertDialog.findViewById(R.id.message)) != null) {
                textView.setText(this.f41422d);
            }
            if (this.f41422d.equals(this.f41420b)) {
                this.f41430l.setVisibility(4);
                this.f41429k.setVisibility(8);
            } else {
                this.f41430l.setVisibility(0);
                this.f41429k.setVisibility(0);
            }
            this.f41426h.notifyDataSetChanged();
            this.f41434p.setSelection(0);
            ListViewMaxHeight listViewMaxHeight = this.f41434p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.requestFocus();
            }
        } catch (Exception unused) {
        }
    }
}
