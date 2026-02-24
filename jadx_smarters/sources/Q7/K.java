package q7;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import org.apache.commons.codec.language.bm.Rule;
import s7.C2749b;
import s7.C2750c;
import s7.C2751d;
import s7.C2752e;

/* JADX INFO: loaded from: classes4.dex */
public class K extends androidx.fragment.app.u {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String[] f47256j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f47257k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f47258l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Context f47259m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f47260n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f47261o;

    public K(androidx.fragment.app.m mVar, int i9, Context context, ArrayList arrayList, String str) {
        super(mVar);
        this.f47256j = new String[5];
        this.f47257k = 4;
        new ArrayList();
        this.f47261o = false;
        this.f47257k = i9;
        this.f47259m = context;
        this.f47258l = str;
        this.f47260n = arrayList;
        if (str.equals("m3u")) {
            String[] strArr = this.f47256j;
            strArr[0] = Rule.ALL;
            strArr[1] = this.f47259m.getResources().getString(a7.j.f13325m8);
        } else {
            this.f47256j[0] = this.f47259m.getResources().getString(a7.j.f13267h0);
            this.f47256j[1] = this.f47259m.getResources().getString(a7.j.f13445y8);
            this.f47256j[2] = this.f47259m.getResources().getString(a7.j.f13090O6);
            this.f47256j[3] = this.f47259m.getResources().getString(a7.j.f13109Q5);
            this.f47256j[4] = this.f47259m.getResources().getString(a7.j.f13325m8);
        }
    }

    @Override // N0.a
    public int c() {
        return this.f47257k;
    }

    @Override // androidx.fragment.app.u
    public Fragment p(int i9) {
        if (this.f47258l.equals("m3u")) {
            if (i9 == 0) {
                return new C2750c();
            }
            if (i9 != 1) {
                return null;
            }
            return new s7.f();
        }
        if (i9 == 0) {
            return new C2749b();
        }
        if (i9 == 1) {
            return new s7.g();
        }
        if (i9 == 2) {
            return new C2752e();
        }
        if (i9 == 3) {
            return new C2751d();
        }
        if (i9 != 4) {
            return null;
        }
        return new s7.f();
    }

    public View q(int i9) {
        View viewInflate = LayoutInflater.from(this.f47259m).inflate(a7.g.f12643G4, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(a7.f.Zl)).setText(this.f47256j[i9]);
        return viewInflate;
    }

    public void r(View view, Typeface typeface, int i9) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(a7.f.Zl);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#ffffff"));
        }
    }

    public void s(View view, Typeface typeface) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(a7.f.Zl);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#ffffff"));
        }
    }

    public void t(View view, Typeface typeface, int i9) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(a7.f.Zl);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#ffffff"));
        }
    }

    public void u(View view, Typeface typeface) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(a7.f.Zl);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#ffffff"));
        }
    }

    public void v(View view, Typeface typeface) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(a7.f.Zl);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#000000"));
        }
    }

    public void w(View view, Typeface typeface) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(a7.f.Zl);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#000000"));
        }
    }

    public void x(View view, Typeface typeface) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(a7.f.Zl);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#000000"));
        }
    }

    public void y(View view, Typeface typeface) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(a7.f.Zl);
            textView.setTypeface(typeface);
            textView.setTextColor(Color.parseColor("#000000"));
        }
    }
}
