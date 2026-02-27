package W3;

import android.text.TextUtils;
import java.util.regex.Pattern;
import r5.AbstractC2673b;
import s5.AbstractC2719C;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f10232d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC2719C f10233e = AbstractC2719C.B("auto", "none");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC2719C f10234f = AbstractC2719C.D("dot", "sesame", "circle");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC2719C f10235g = AbstractC2719C.B("filled", "open");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC2719C f10236h = AbstractC2719C.D("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10239c;

    public b(int i9, int i10, int i11) {
        this.f10237a = i9;
        this.f10238b = i10;
        this.f10239c = i11;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String strE = AbstractC2673b.e(str.trim());
        if (strE.isEmpty()) {
            return null;
        }
        return b(AbstractC2719C.s(TextUtils.split(strE, f10232d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static W3.b b(s5.AbstractC2719C r9) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.b.b(s5.C):W3.b");
    }
}
