package com.google.android.exoplayer2.ui;

import a4.AbstractC1096j;
import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.google.android.exoplayer2.ui.d;
import d4.AbstractC1684a;
import d4.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import s5.AbstractC2717A;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f26042a = Pattern.compile("(&#13;)?&#10;");

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f26043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f26044b;

        public b(String str, Map map) {
            this.f26043a = str;
            this.f26044b = map;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Comparator f26045e = new Comparator() { // from class: a4.z
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d.c.e((d.c) obj, (d.c) obj2);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Comparator f26046f = new Comparator() { // from class: a4.A
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d.c.f((d.c) obj, (d.c) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f26049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f26050d;

        public c(int i9, int i10, String str, String str2) {
            this.f26047a = i9;
            this.f26048b = i10;
            this.f26049c = str;
            this.f26050d = str2;
        }

        public static /* synthetic */ int e(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f26048b, cVar.f26048b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar.f26049c.compareTo(cVar2.f26049c);
            return iCompareTo != 0 ? iCompareTo : cVar.f26050d.compareTo(cVar2.f26050d);
        }

        public static /* synthetic */ int f(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f26047a, cVar.f26047a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar2.f26049c.compareTo(cVar.f26049c);
            return iCompareTo != 0 ? iCompareTo : cVar2.f26050d.compareTo(cVar.f26050d);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.d$d, reason: collision with other inner class name */
    public static final class C0249d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f26051a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f26052b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f9) {
        int i9 = 0;
        if (charSequence == null) {
            return new b("", AbstractC2717A.k());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), AbstractC2717A.k());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(AbstractC1096j.a("bg_" + iIntValue), k0.D("background-color:%s;", AbstractC1096j.b(iIntValue)));
        }
        SparseArray sparseArrayC = c(spanned, f9);
        StringBuilder sb = new StringBuilder(spanned.length());
        int i10 = 0;
        while (i9 < sparseArrayC.size()) {
            int iKeyAt = sparseArrayC.keyAt(i9);
            sb.append(b(spanned.subSequence(i10, iKeyAt)));
            C0249d c0249d = (C0249d) sparseArrayC.get(iKeyAt);
            Collections.sort(c0249d.f26052b, c.f26046f);
            Iterator it2 = c0249d.f26052b.iterator();
            while (it2.hasNext()) {
                sb.append(((c) it2.next()).f26050d);
            }
            Collections.sort(c0249d.f26051a, c.f26045e);
            Iterator it3 = c0249d.f26051a.iterator();
            while (it3.hasNext()) {
                sb.append(((c) it3.next()).f26049c);
            }
            i9++;
            i10 = iKeyAt;
        }
        sb.append(b(spanned.subSequence(i10, spanned.length())));
        return new b(sb.toString(), map);
    }

    public static String b(CharSequence charSequence) {
        return f26042a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    public static SparseArray c(Spanned spanned, float f9) {
        SparseArray sparseArray = new SparseArray();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strE = e(obj, f9);
            String strD = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strE != null) {
                AbstractC1684a.e(strD);
                c cVar = new c(spanStart, spanEnd, strE, strD);
                f(sparseArray, spanStart).f26051a.add(cVar);
                f(sparseArray, spanEnd).f26052b.add(cVar);
            }
        }
        return sparseArray;
    }

    public static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof T3.a) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof T3.e)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof T3.c) {
                return "<rt>" + b(((T3.c) obj).f9515a) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    public static String e(Object obj, float f9) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return k0.D("<span style='color:%s;'>", AbstractC1096j.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return k0.D("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof T3.a) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            boolean dip = absoluteSizeSpan.getDip();
            float size = absoluteSizeSpan.getSize();
            if (!dip) {
                size /= f9;
            }
            return k0.D("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
        }
        if (obj instanceof RelativeSizeSpan) {
            return k0.D("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return k0.D("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof T3.c)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof T3.e)) {
                return null;
            }
            T3.e eVar = (T3.e) obj;
            return k0.D("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(eVar.f9517a, eVar.f9518b), g(eVar.f9519c));
        }
        int i9 = ((T3.c) obj).f9516b;
        if (i9 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i9 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i9 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    public static C0249d f(SparseArray sparseArray, int i9) {
        C0249d c0249d = (C0249d) sparseArray.get(i9);
        if (c0249d != null) {
            return c0249d;
        }
        C0249d c0249d2 = new C0249d();
        sparseArray.put(i9, c0249d2);
        return c0249d2;
    }

    public static String g(int i9) {
        return i9 != 2 ? "over right" : "under left";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String h(int r3, int r4) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2
            r2 = 1
            if (r4 == r2) goto L12
            if (r4 == r1) goto Lc
            goto L15
        Lc:
            java.lang.String r4 = "open "
        Le:
            r0.append(r4)
            goto L15
        L12:
            java.lang.String r4 = "filled "
            goto Le
        L15:
            if (r3 == 0) goto L2d
            if (r3 == r2) goto L2a
            if (r3 == r1) goto L27
            r4 = 3
            if (r3 == r4) goto L24
            java.lang.String r3 = "unset"
        L20:
            r0.append(r3)
            goto L30
        L24:
            java.lang.String r3 = "sesame"
            goto L20
        L27:
            java.lang.String r3 = "dot"
            goto L20
        L2a:
            java.lang.String r3 = "circle"
            goto L20
        L2d:
            java.lang.String r3 = "none"
            goto L20
        L30:
            java.lang.String r3 = r0.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.d.h(int, int):java.lang.String");
    }
}
