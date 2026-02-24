package t1;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: t1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2761b extends AbstractC2760a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f50609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f50610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f50611d;

    public C2761b(Context context, String str) {
        super(context);
        this.f50609b = new HashMap();
        this.f50610c = str;
        n();
    }

    public void h() {
        p();
        this.f50609b.clear();
        i();
    }

    public final void i() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f50609b.keySet()) {
            C2764e c2764e = (C2764e) this.f50609b.get(str);
            arrayList.add(str + ">>>>>" + c2764e.f50632a + ">>>>>" + c2764e.f50633c);
        }
        g(k(), TextUtils.join("#####", arrayList));
        this.f50611d = Long.toString(new Date().getTime());
        g(l(), this.f50611d);
    }

    public final String j() {
        return e(l(), "0");
    }

    public final String k() {
        return c() + this.f50610c;
    }

    public final String l() {
        return k() + ".version";
    }

    public boolean m(String str) {
        p();
        return this.f50609b.containsKey(str);
    }

    public final void n() {
        for (String str : e(k(), "").split(Pattern.quote("#####"))) {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split(Pattern.quote(">>>>>"));
                if (strArrSplit.length > 2) {
                    this.f50609b.put(strArrSplit[0], new C2764e(strArrSplit[1], strArrSplit[2]));
                } else if (strArrSplit.length > 1) {
                    this.f50609b.put(strArrSplit[0], new C2764e(strArrSplit[1], null));
                }
            }
        }
        this.f50611d = j();
    }

    public void o(String str, String str2, String str3) {
        p();
        if (this.f50609b.containsKey(str)) {
            return;
        }
        this.f50609b.put(str, new C2764e(str2, str3));
        i();
    }

    public final void p() {
        if (this.f50611d.equalsIgnoreCase(j())) {
            return;
        }
        this.f50609b.clear();
        n();
    }

    public String toString() {
        return TextUtils.join(", ", this.f50609b.keySet());
    }
}
