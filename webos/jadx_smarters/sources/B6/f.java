package B6;

import android.content.Intent;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import x6.EnumC2960a;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f683a = Pattern.compile(",");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set f689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set f690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map f691i;

    static {
        EnumSet enumSetOf = EnumSet.of(EnumC2960a.QR_CODE);
        f687e = enumSetOf;
        EnumSet enumSetOf2 = EnumSet.of(EnumC2960a.DATA_MATRIX);
        f688f = enumSetOf2;
        EnumSet enumSetOf3 = EnumSet.of(EnumC2960a.AZTEC);
        f689g = enumSetOf3;
        EnumSet enumSetOf4 = EnumSet.of(EnumC2960a.PDF_417);
        f690h = enumSetOf4;
        EnumSet enumSetOf5 = EnumSet.of(EnumC2960a.UPC_A, EnumC2960a.UPC_E, EnumC2960a.EAN_13, EnumC2960a.EAN_8, EnumC2960a.RSS_14, EnumC2960a.RSS_EXPANDED);
        f684b = enumSetOf5;
        EnumSet enumSetOf6 = EnumSet.of(EnumC2960a.CODE_39, EnumC2960a.CODE_93, EnumC2960a.CODE_128, EnumC2960a.ITF, EnumC2960a.CODABAR);
        f685c = enumSetOf6;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf5);
        f686d = enumSetCopyOf;
        enumSetCopyOf.addAll(enumSetOf6);
        HashMap map = new HashMap();
        f691i = map;
        map.put("ONE_D_MODE", enumSetCopyOf);
        map.put("PRODUCT_MODE", enumSetOf5);
        map.put("QR_CODE_MODE", enumSetOf);
        map.put("DATA_MATRIX_MODE", enumSetOf2);
        map.put("AZTEC_MODE", enumSetOf3);
        map.put("PDF417_MODE", enumSetOf4);
    }

    public static Set a(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return b(stringExtra != null ? Arrays.asList(f683a.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
    }

    public static Set b(Iterable iterable, String str) {
        if (iterable != null) {
            EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC2960a.class);
            try {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    enumSetNoneOf.add(EnumC2960a.valueOf((String) it.next()));
                }
                return enumSetNoneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return (Set) f691i.get(str);
        }
        return null;
    }
}
