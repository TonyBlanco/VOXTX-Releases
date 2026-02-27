package E8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l8.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends f {

    public static final class a extends kotlin.jvm.internal.m implements w8.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1734a = new a();

        public a() {
            super(1);
        }

        @Override // w8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            kotlin.jvm.internal.l.e(line, "line");
            return line;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements w8.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1735a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f1735a = str;
        }

        @Override // w8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            kotlin.jvm.internal.l.e(line, "line");
            return this.f1735a + line;
        }
    }

    public static final w8.l b(String str) {
        return str.length() == 0 ? a.f1734a : new b(str);
    }

    public static final int c(String str) {
        int length = str.length();
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                i9 = -1;
                break;
            }
            if (!E8.a.c(str.charAt(i9))) {
                break;
            }
            i9++;
        }
        return i9 == -1 ? str.length() : i9;
    }

    public static final String d(String str, String newIndent) {
        String str2;
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(newIndent, "newIndent");
        List listZ = o.Z(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listZ) {
            if (!n.q((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(l8.l.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(c((String) it.next())));
        }
        Integer num = (Integer) s.C(arrayList2);
        int i9 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listZ.size());
        w8.l lVarB = b(newIndent);
        int iG = l8.k.g(listZ);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listZ) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                l8.k.n();
            }
            String str3 = (String) obj2;
            if ((i9 == 0 || i9 == iG) && n.q(str3)) {
                str3 = null;
            } else {
                String strE0 = q.E0(str3, iIntValue);
                if (strE0 != null && (str2 = (String) lVarB.invoke(strE0)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i9 = i10;
        }
        String string = ((StringBuilder) s.x(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        kotlin.jvm.internal.l.d(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    public static final String e(String str, String newIndent, String marginPrefix) {
        int i9;
        String str2;
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(newIndent, "newIndent");
        kotlin.jvm.internal.l.e(marginPrefix, "marginPrefix");
        if (!(!n.q(marginPrefix))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List listZ = o.Z(str);
        int length = str.length() + (newIndent.length() * listZ.size());
        w8.l lVarB = b(newIndent);
        int iG = l8.k.g(listZ);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listZ) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                l8.k.n();
            }
            String str3 = (String) obj;
            String strSubstring = null;
            if ((i10 == 0 || i10 == iG) && n.q(str3)) {
                str3 = null;
            } else {
                int length2 = str3.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i9 = -1;
                        break;
                    }
                    if (!E8.a.c(str3.charAt(i12))) {
                        i9 = i12;
                        break;
                    }
                    i12++;
                }
                if (i9 != -1) {
                    int i13 = i9;
                    if (n.A(str3, marginPrefix, i9, false, 4, null)) {
                        int length3 = i13 + marginPrefix.length();
                        kotlin.jvm.internal.l.c(str3, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str3.substring(length3);
                        kotlin.jvm.internal.l.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                    }
                }
                if (strSubstring != null && (str2 = (String) lVarB.invoke(strSubstring)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i10 = i11;
        }
        String string = ((StringBuilder) s.x(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        kotlin.jvm.internal.l.d(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    public static String f(String str) {
        kotlin.jvm.internal.l.e(str, "<this>");
        return d(str, "");
    }

    public static final String g(String str, String marginPrefix) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(marginPrefix, "marginPrefix");
        return e(str, "", marginPrefix);
    }

    public static /* synthetic */ String h(String str, String str2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str2 = "|";
        }
        return g(str, str2);
    }
}
