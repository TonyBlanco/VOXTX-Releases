package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaFormat;
import android.net.Uri;
import android.os.Trace;
import android.text.TextUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class af {
    private static String A(StringBuilder sb, int i9, int i10) {
        int i11;
        int iLastIndexOf;
        if (i9 >= i10) {
            return sb.toString();
        }
        if (sb.charAt(i9) == '/') {
            i9++;
        }
        int i12 = i9;
        int i13 = i12;
        while (i12 <= i10) {
            if (i12 == i10) {
                i11 = i12;
            } else if (sb.charAt(i12) == '/') {
                i11 = i12 + 1;
            } else {
                i12++;
            }
            int i14 = i13 + 1;
            if (i12 == i14 && sb.charAt(i13) == '.') {
                sb.delete(i13, i11);
                i10 -= i11 - i13;
            } else {
                if (i12 == i13 + 2 && sb.charAt(i13) == '.' && sb.charAt(i14) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i13 - 2) + 1;
                    int i15 = iLastIndexOf > i9 ? iLastIndexOf : i9;
                    sb.delete(i15, i11);
                    i10 -= i11 - i15;
                } else {
                    iLastIndexOf = i12 + 1;
                }
                i13 = iLastIndexOf;
            }
            i12 = i13;
        }
        return sb.toString();
    }

    private static int[] B(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i9 = iIndexOf5 + 2;
        if (i9 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i9) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.af.a(java.lang.String):int");
    }

    public static int b(Map map) {
        List list = (List) map.get("Content-Type");
        String str = null;
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
        }
        return a(str);
    }

    public static int c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return lastPathSegment.endsWith(".avi") ? 16 : -1;
    }

    public static final C1295f d(int i9, int i10) {
        int i11 = 1;
        return new C1295f(i11, i11);
    }

    public static void e(cy cyVar) {
        if (cyVar != null) {
            try {
                cyVar.d();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean f(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean g(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return f(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean h(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean i(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return h(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static String j(XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i9 = 0; i9 < attributeCount; i9++) {
            if (z(xmlPullParser.getAttributeName(i9)).equals("default_KID")) {
                return xmlPullParser.getAttributeValue(i9);
            }
        }
        return null;
    }

    public static boolean k(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return h(xmlPullParser) && z(xmlPullParser.getName()).equals("pssh");
    }

    public static Uri l(String str, String str2) {
        return Uri.parse(m(str, str2));
    }

    public static String m(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrB = B(str2);
        if (iArrB[0] != -1) {
            sb.append(str2);
            A(sb, iArrB[1], iArrB[2]);
            return sb.toString();
        }
        int[] iArrB2 = B(str);
        if (iArrB[3] == 0) {
            sb.append((CharSequence) str, 0, iArrB2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrB[2] == 0) {
            sb.append((CharSequence) str, 0, iArrB2[2]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrB[1] != 0) {
            int i9 = iArrB2[0] + 1;
            sb.append((CharSequence) str, 0, i9);
            sb.append(str2);
            return A(sb, iArrB[1] + i9, i9 + iArrB[2]);
        }
        if (str2.charAt(0) == '/') {
            sb.append((CharSequence) str, 0, iArrB2[1]);
            sb.append(str2);
            int i10 = iArrB2[1];
            return A(sb, i10, iArrB[2] + i10);
        }
        int i11 = iArrB2[0];
        int i12 = iArrB2[1];
        if (i11 + 2 >= i12 || i12 != iArrB2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrB2[2] - 1);
            int i13 = iLastIndexOf == -1 ? iArrB2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i13);
            sb.append(str2);
            return A(sb, iArrB2[1], i13 + iArrB[2]);
        }
        sb.append((CharSequence) str, 0, i12);
        sb.append('/');
        sb.append(str2);
        int i14 = iArrB2[1];
        return A(sb, i14, iArrB[2] + i14 + 1);
    }

    public static boolean n(String str) {
        return (str == null || B(str)[0] == -1) ? false : true;
    }

    public static void o(String str) {
        if (cq.f22640a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void p() {
        if (cq.f22640a >= 18) {
            Trace.endSection();
        }
    }

    public static void q(MediaFormat mediaFormat, String str, int i9) {
        if (i9 != -1) {
            mediaFormat.setInteger(str, i9);
        }
    }

    public static void r(MediaFormat mediaFormat, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            mediaFormat.setByteBuffer("csd-" + i9, ByteBuffer.wrap((byte[]) list.get(i9)));
        }
    }

    public static Object s(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object t(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    public static void u(boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException();
        }
    }

    public static void v(boolean z9, Object obj) {
        if (!z9) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void w(boolean z9) {
        if (!z9) {
            throw new IllegalStateException();
        }
    }

    public static void x(boolean z9, Object obj) {
        if (!z9) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void y(int i9, int i10) {
        if (i9 < 0 || i9 >= i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    private static String z(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1);
    }
}
