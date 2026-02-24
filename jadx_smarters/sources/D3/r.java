package d3;

import d4.k0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q3.C2540a;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f39604c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39605a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39606b = -1;

    public boolean a() {
        return (this.f39605a == -1 || this.f39606b == -1) ? false : true;
    }

    public final boolean b(String str) {
        Matcher matcher = f39604c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i9 = Integer.parseInt((String) k0.j(matcher.group(1)), 16);
            int i10 = Integer.parseInt((String) k0.j(matcher.group(2)), 16);
            if (i9 <= 0 && i10 <= 0) {
                return false;
            }
            this.f39605a = i9;
            this.f39606b = i10;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean c(C2540a c2540a) {
        for (int i9 = 0; i9 < c2540a.f(); i9++) {
            C2540a.b bVarE = c2540a.e(i9);
            if (bVarE instanceof v3.e) {
                v3.e eVar = (v3.e) bVarE;
                if ("iTunSMPB".equals(eVar.f51305d) && b(eVar.f51306e)) {
                    return true;
                }
            } else if (bVarE instanceof v3.j) {
                v3.j jVar = (v3.j) bVarE;
                if ("com.apple.iTunes".equals(jVar.f51317c) && "iTunSMPB".equals(jVar.f51318d) && b(jVar.f51319e)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i9) {
        int i10 = i9 >> 12;
        int i11 = i9 & 4095;
        if (i10 <= 0 && i11 <= 0) {
            return false;
        }
        this.f39605a = i10;
        this.f39606b = i11;
        return true;
    }
}
