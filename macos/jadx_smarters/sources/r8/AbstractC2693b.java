package r8;

import E8.o;
import kotlin.jvm.internal.l;

/* JADX INFO: renamed from: r8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2693b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2692a f49801a;

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9 A[Catch: ClassCastException -> 0x00be, ClassNotFoundException -> 0x00f4, TRY_ENTER, TryCatch #4 {ClassCastException -> 0x00be, blocks: (B:35:0x00b9, B:38:0x00c0, B:39:0x00c5), top: B:64:0x00b7, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0 A[Catch: ClassCastException -> 0x00be, ClassNotFoundException -> 0x00f4, TryCatch #4 {ClassCastException -> 0x00be, blocks: (B:35:0x00b9, B:38:0x00c0, B:39:0x00c5), top: B:64:0x00b7, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r8.AbstractC2693b.<clinit>():void");
    }

    public static final int a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int iQ = o.Q(property, '.', 0, false, 6, null);
        if (iQ < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int i9 = iQ + 1;
        int iQ2 = o.Q(property, '.', i9, false, 4, null);
        if (iQ2 < 0) {
            iQ2 = property.length();
        }
        String strSubstring = property.substring(0, iQ);
        l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String strSubstring2 = property.substring(i9, iQ2);
        l.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        try {
            return (Integer.parseInt(strSubstring) * 65536) + Integer.parseInt(strSubstring2);
        } catch (NumberFormatException unused2) {
            return 65542;
        }
    }
}
