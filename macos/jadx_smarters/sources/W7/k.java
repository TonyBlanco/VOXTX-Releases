package w7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;

/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f51714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f51715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TableLayout f51716c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f51717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f51718b;

        public b() {
        }

        public void a(String str) {
            TextView textView = this.f51717a;
            if (textView != null) {
                textView.setText(str);
            }
        }

        public void b(String str) {
            TextView textView = this.f51718b;
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    public k(Context context) {
        this(context, a7.g.f12649H4);
    }

    public k(Context context, int i9) {
        this.f51714a = context;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(i9, (ViewGroup) null);
        this.f51715b = viewGroup;
        this.f51716c = (TableLayout) viewGroup.findViewById(a7.f.Qg);
    }

    public k(Context context, TableLayout tableLayout) {
        this.f51714a = context;
        this.f51715b = tableLayout;
        this.f51716c = tableLayout;
    }

    public static String a() {
        return "V";
    }

    public static String i() {
        return "GhlIGFwcCB5b3UgYXJlIHVzaW5nIGlzIG5vdCBvcmlnaW5hbC4=";
    }

    public View b(int i9, String str, String str2) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f51714a).inflate(i9, (ViewGroup) this.f51716c, false);
        k(viewGroup, str, str2);
        this.f51716c.addView(viewGroup);
        return viewGroup;
    }

    public View c(int i9, String str) {
        return d(this.f51714a.getString(i9), str);
    }

    public View d(String str, String str2) {
        return b(a7.g.f12655I4, str, str2);
    }

    public View e(int i9) {
        return f(this.f51714a.getString(i9));
    }

    public View f(String str) {
        return b(a7.g.f12661J4, str, null);
    }

    public a.C0158a g() {
        a.C0158a c0158a = new a.C0158a(this.f51714a);
        c0158a.setView(h());
        return c0158a;
    }

    public ViewGroup h() {
        return this.f51715b;
    }

    public b j(View view) {
        b bVar = (b) view.getTag();
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        bVar2.f51717a = (TextView) view.findViewById(a7.f.vb);
        bVar2.f51718b = (TextView) view.findViewById(a7.f.Em);
        view.setTag(bVar2);
        return bVar2;
    }

    public void k(View view, String str, String str2) {
        b bVarJ = j(view);
        bVarJ.a(str);
        bVarJ.b(str2);
    }

    public void l(View view, String str) {
        j(view).b(str);
    }
}
