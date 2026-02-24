package i3;

import O2.C0897l1;
import d4.AbstractC1681B;
import d4.m0;
import i3.b;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f41855a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f41856b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f41857c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static b a(String str) {
        try {
            return b(str);
        } catch (C0897l1 | NumberFormatException | XmlPullParserException unused) {
            AbstractC1681B.j("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static b b(String str) throws XmlPullParserException, IOException {
        String str2;
        String str3;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!m0.f(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw C0897l1.a("Couldn't find xmp metadata", null);
        }
        AbstractC2743y abstractC2743yZ = AbstractC2743y.z();
        long jE = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (!m0.f(xmlPullParserNewPullParser, "rdf:Description")) {
                if (m0.f(xmlPullParserNewPullParser, "Container:Directory")) {
                    str2 = "Container";
                    str3 = "Item";
                } else if (m0.f(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    str2 = "GContainer";
                    str3 = "GContainerItem";
                }
                abstractC2743yZ = f(xmlPullParserNewPullParser, str2, str3);
            } else {
                if (!d(xmlPullParserNewPullParser)) {
                    return null;
                }
                jE = e(xmlPullParserNewPullParser);
                abstractC2743yZ = c(xmlPullParserNewPullParser);
            }
        } while (!m0.d(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (abstractC2743yZ.isEmpty()) {
            return null;
        }
        return new b(jE, abstractC2743yZ);
    }

    public static AbstractC2743y c(XmlPullParser xmlPullParser) {
        for (String str : f41857c) {
            String strA = m0.a(xmlPullParser, str);
            if (strA != null) {
                return AbstractC2743y.B(new b.a("image/jpeg", "Primary", 0L, 0L), new b.a("video/mp4", "MotionPhoto", Long.parseLong(strA), 0L));
            }
        }
        return AbstractC2743y.z();
    }

    public static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f41855a) {
            String strA = m0.a(xmlPullParser, str);
            if (strA != null) {
                return Integer.parseInt(strA) == 1;
            }
        }
        return false;
    }

    public static long e(XmlPullParser xmlPullParser) {
        for (String str : f41856b) {
            String strA = m0.a(xmlPullParser, str);
            if (strA != null) {
                long j9 = Long.parseLong(strA);
                if (j9 == -1) {
                    return -9223372036854775807L;
                }
                return j9;
            }
        }
        return -9223372036854775807L;
    }

    public static AbstractC2743y f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        AbstractC2743y.a aVarP = AbstractC2743y.p();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, str3)) {
                String strA = m0.a(xmlPullParser, str2 + ":Mime");
                String strA2 = m0.a(xmlPullParser, str2 + ":Semantic");
                String strA3 = m0.a(xmlPullParser, str2 + ":Length");
                String strA4 = m0.a(xmlPullParser, str2 + ":Padding");
                if (strA == null || strA2 == null) {
                    return AbstractC2743y.z();
                }
                aVarP.a(new b.a(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!m0.d(xmlPullParser, str4));
        return aVarP.k();
    }
}
