package a4;

import O2.C0936z0;
import android.content.res.Resources;
import android.text.TextUtils;
import d4.AbstractC1684a;
import d4.k0;
import java.util.Locale;

/* JADX INFO: renamed from: a4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1094h implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f11621a;

    public C1094h(Resources resources) {
        this.f11621a = (Resources) AbstractC1684a.e(resources);
    }

    public static int i(C0936z0 c0936z0) {
        int iK = d4.F.k(c0936z0.f6467m);
        if (iK != -1) {
            return iK;
        }
        if (d4.F.n(c0936z0.f6464j) != null) {
            return 2;
        }
        if (d4.F.c(c0936z0.f6464j) != null) {
            return 1;
        }
        if (c0936z0.f6472r == -1 && c0936z0.f6473s == -1) {
            return (c0936z0.f6480z == -1 && c0936z0.f6447A == -1) ? -1 : 1;
        }
        return 2;
    }

    @Override // a4.c0
    public String a(C0936z0 c0936z0) {
        int i9 = i(c0936z0);
        String strJ = i9 == 2 ? j(h(c0936z0), g(c0936z0), c(c0936z0)) : i9 == 1 ? j(e(c0936z0), b(c0936z0), c(c0936z0)) : e(c0936z0);
        return strJ.length() == 0 ? this.f11621a.getString(AbstractC1108w.f11718F) : strJ;
    }

    public final String b(C0936z0 c0936z0) {
        Resources resources;
        int i9;
        int i10 = c0936z0.f6480z;
        if (i10 == -1 || i10 < 1) {
            return "";
        }
        if (i10 == 1) {
            resources = this.f11621a;
            i9 = AbstractC1108w.f11735q;
        } else if (i10 == 2) {
            resources = this.f11621a;
            i9 = AbstractC1108w.f11714B;
        } else if (i10 == 6 || i10 == 7) {
            resources = this.f11621a;
            i9 = AbstractC1108w.f11716D;
        } else if (i10 != 8) {
            resources = this.f11621a;
            i9 = AbstractC1108w.f11715C;
        } else {
            resources = this.f11621a;
            i9 = AbstractC1108w.f11717E;
        }
        return resources.getString(i9);
    }

    public final String c(C0936z0 c0936z0) {
        int i9 = c0936z0.f6463i;
        return i9 == -1 ? "" : this.f11621a.getString(AbstractC1108w.f11734p, Float.valueOf(i9 / 1000000.0f));
    }

    public final String d(C0936z0 c0936z0) {
        return TextUtils.isEmpty(c0936z0.f6457c) ? "" : c0936z0.f6457c;
    }

    public final String e(C0936z0 c0936z0) {
        String strJ = j(f(c0936z0), h(c0936z0));
        return TextUtils.isEmpty(strJ) ? d(c0936z0) : strJ;
    }

    public final String f(C0936z0 c0936z0) {
        String str = c0936z0.f6458d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = k0.f39777a >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale localeT = k0.T();
        String displayName = localeForLanguageTag.getDisplayName(localeT);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeT) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    public final String g(C0936z0 c0936z0) {
        int i9 = c0936z0.f6472r;
        int i10 = c0936z0.f6473s;
        return (i9 == -1 || i10 == -1) ? "" : this.f11621a.getString(AbstractC1108w.f11736r, Integer.valueOf(i9), Integer.valueOf(i10));
    }

    public final String h(C0936z0 c0936z0) {
        String string = (c0936z0.f6460f & 2) != 0 ? this.f11621a.getString(AbstractC1108w.f11737s) : "";
        if ((c0936z0.f6460f & 4) != 0) {
            string = j(string, this.f11621a.getString(AbstractC1108w.f11740v));
        }
        if ((c0936z0.f6460f & 8) != 0) {
            string = j(string, this.f11621a.getString(AbstractC1108w.f11739u));
        }
        return (c0936z0.f6460f & 1088) != 0 ? j(string, this.f11621a.getString(AbstractC1108w.f11738t)) : string;
    }

    public final String j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f11621a.getString(AbstractC1108w.f11733o, string, str);
            }
        }
        return string;
    }
}
