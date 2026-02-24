package androidx.preference;

import F.k;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import org.apache.http.message.TokenParser;
import z0.AbstractC2995a;
import z0.AbstractC2996b;
import z0.AbstractC2997c;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f16501A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f16502B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public b f16503C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final View.OnClickListener f16504D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16505a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f16508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f16509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f16511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Intent f16512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f16513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16514k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f16515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f16516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f16517n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f16518o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16519p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16520q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f16521r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16522s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f16523t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16524u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16525v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f16526w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16527x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f16528y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f16529z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.F(view);
        }
    }

    public interface b {
        CharSequence a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, AbstractC2997c.f52505g, R.attr.preferenceStyle));
    }

    public Preference(Context context, AttributeSet attributeSet, int i9) {
        this(context, attributeSet, i9, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Preference(android.content.Context r5, android.util.AttributeSet r6, int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public void A() {
    }

    public void B(Preference preference, boolean z9) {
        if (this.f16519p == z9) {
            this.f16519p = !z9;
            z(K());
            y();
        }
    }

    public Object C(TypedArray typedArray, int i9) {
        return null;
    }

    public void D(Preference preference, boolean z9) {
        if (this.f16520q == z9) {
            this.f16520q = !z9;
            z(K());
            y();
        }
    }

    public void E() {
        if (w() && x()) {
            A();
            r();
            if (this.f16512i != null) {
                h().startActivity(this.f16512i);
            }
        }
    }

    public void F(View view) {
        E();
    }

    public boolean G(boolean z9) {
        if (!L()) {
            return false;
        }
        if (z9 == n(!z9)) {
            return true;
        }
        q();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public boolean H(int i9) {
        if (!L()) {
            return false;
        }
        if (i9 == o(~i9)) {
            return true;
        }
        q();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public boolean I(String str) {
        if (!L()) {
            return false;
        }
        Object obj = null;
        if (TextUtils.equals(str, p(null))) {
            return true;
        }
        q();
        obj.getClass();
        throw null;
    }

    public final void J(b bVar) {
        this.f16503C = bVar;
        y();
    }

    public boolean K() {
        return !w();
    }

    public boolean L() {
        return false;
    }

    public boolean a(Object obj) {
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i9 = this.f16506c;
        int i10 = preference.f16506c;
        if (i9 != i10) {
            return i9 - i10;
        }
        CharSequence charSequence = this.f16508e;
        CharSequence charSequence2 = preference.f16508e;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f16508e.toString());
    }

    public Context h() {
        return this.f16505a;
    }

    public StringBuilder i() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequenceU = u();
        if (!TextUtils.isEmpty(charSequenceU)) {
            sb.append(charSequenceU);
            sb.append(TokenParser.SP);
        }
        CharSequence charSequenceS = s();
        if (!TextUtils.isEmpty(charSequenceS)) {
            sb.append(charSequenceS);
            sb.append(TokenParser.SP);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public String j() {
        return this.f16513j;
    }

    public Intent l() {
        return this.f16512i;
    }

    public boolean n(boolean z9) {
        if (!L()) {
            return z9;
        }
        q();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public int o(int i9) {
        if (!L()) {
            return i9;
        }
        q();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public String p(String str) {
        if (!L()) {
            return str;
        }
        q();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public AbstractC2995a q() {
        return null;
    }

    public AbstractC2996b r() {
        return null;
    }

    public CharSequence s() {
        return t() != null ? t().a(this) : this.f16509f;
    }

    public final b t() {
        return this.f16503C;
    }

    public String toString() {
        return i().toString();
    }

    public CharSequence u() {
        return this.f16508e;
    }

    public boolean v() {
        return !TextUtils.isEmpty(this.f16511h);
    }

    public boolean w() {
        return this.f16514k && this.f16519p && this.f16520q;
    }

    public boolean x() {
        return this.f16515l;
    }

    public void y() {
    }

    public void z(boolean z9) {
        List list = this.f16502B;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((Preference) list.get(i9)).B(this, z9);
        }
    }
}
