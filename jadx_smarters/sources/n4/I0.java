package n4;

import java.util.Collection;
import java.util.Locale;
import t4.AbstractC2774a;

/* JADX INFO: loaded from: classes3.dex */
public final class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f45293c;

    public /* synthetic */ I0(String str, String str2, Collection collection, boolean z9, boolean z10, H0 h02) {
        this.f45291a = str;
        this.f45292b = str2;
        this.f45293c = collection;
    }

    public static /* bridge */ /* synthetic */ String a(I0 i02) {
        StringBuilder sb = new StringBuilder(i02.f45291a);
        String str = i02.f45292b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(String.valueOf(i02.f45292b)));
            }
            sb.append("/");
            sb.append(upperCase);
        }
        Collection collection = i02.f45293c;
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (i02.f45292b == null) {
                sb.append("/");
            }
            sb.append("/");
            boolean z9 = true;
            for (String str2 : i02.f45293c) {
                AbstractC2774a.f(str2);
                if (!z9) {
                    sb.append(",");
                }
                sb.append(AbstractC2774a.i(str2));
                z9 = false;
            }
        }
        if (i02.f45292b == null && i02.f45293c == null) {
            sb.append("/");
        }
        if (i02.f45293c == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }
}
