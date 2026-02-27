package W3;

import P3.i;
import P3.k;
import android.text.Layout;
import com.amazonaws.mobileconnectors.appsync.AppSyncMutationsSqlHelper;
import com.amazonaws.services.s3.model.InstructionFileId;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.k0;
import d4.m0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import r5.AbstractC2673b;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends P3.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f10240p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f10241q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f10242r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f10243s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f10244t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f10245u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f10246v = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f10247w = new b(30.0f, 1, 1);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f10248x = new a(32, 15);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final XmlPullParserFactory f10249o;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10251b;

        public a(int i9, int i10) {
            this.f10250a = i9;
            this.f10251b = i10;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f10252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10254c;

        public b(float f9, int i9, int i10) {
            this.f10252a = f9;
            this.f10253b = i9;
            this.f10254c = i10;
        }
    }

    /* JADX INFO: renamed from: W3.c$c, reason: collision with other inner class name */
    public static final class C0134c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10256b;

        public C0134c(int i9, int i10) {
            this.f10255a = i9;
            this.f10256b = i10;
        }
    }

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f10249o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e9) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e9);
        }
    }

    public static g B(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean C(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals(AppSyncMutationsSqlHelper.COLUMN_REGION) || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static Layout.Alignment D(String str) {
        String strE = AbstractC2673b.e(str);
        strE.hashCode();
        switch (strE) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static a E(XmlPullParser xmlPullParser, a aVar) throws k {
        StringBuilder sb;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f10246v.matcher(attributeValue);
        if (matcher.matches()) {
            try {
                int i9 = Integer.parseInt((String) AbstractC1684a.e(matcher.group(1)));
                int i10 = Integer.parseInt((String) AbstractC1684a.e(matcher.group(2)));
                if (i9 != 0 && i10 != 0) {
                    return new a(i9, i10);
                }
                throw new k("Invalid cell resolution " + i9 + " " + i10);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
        } else {
            sb = new StringBuilder();
        }
        sb.append("Ignoring malformed cell resolution: ");
        sb.append(attributeValue);
        AbstractC1681B.j("TtmlDecoder", sb.toString());
        return aVar;
    }

    public static void F(String str, g gVar) throws k {
        Matcher matcher;
        String str2;
        String[] strArrI1 = k0.i1(str, "\\s+");
        if (strArrI1.length == 1) {
            matcher = f10242r.matcher(str);
        } else {
            if (strArrI1.length != 2) {
                throw new k("Invalid number of entries for fontSize: " + strArrI1.length + InstructionFileId.DOT);
            }
            matcher = f10242r.matcher(strArrI1[1]);
            AbstractC1681B.j("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new k("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) AbstractC1684a.e(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                gVar.z(3);
                break;
            case "em":
                gVar.z(2);
                break;
            case "px":
                gVar.z(1);
                break;
            default:
                throw new k("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.y(Float.parseFloat((String) AbstractC1684a.e(matcher.group(1))));
    }

    public static b G(XmlPullParser xmlPullParser) throws k {
        float f9;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i9 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (k0.i1(attributeValue2, " ").length != 2) {
                throw new k("frameRateMultiplier doesn't have 2 parts");
            }
            f9 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f9 = 1.0f;
        }
        b bVar = f10247w;
        int i10 = bVar.f10253b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = bVar.f10254c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new b(i9 * f9, i10, i11);
    }

    public static Map H(XmlPullParser xmlPullParser, Map map, a aVar, C0134c c0134c, Map map2, Map map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "style")) {
                String strA = m0.a(xmlPullParser, "style");
                g gVarM = M(xmlPullParser, new g());
                if (strA != null) {
                    for (String str : N(strA)) {
                        gVarM.a((g) map.get(str));
                    }
                }
                String strG = gVarM.g();
                if (strG != null) {
                    map.put(strG, gVarM);
                }
            } else if (m0.f(xmlPullParser, AppSyncMutationsSqlHelper.COLUMN_REGION)) {
                e eVarK = K(xmlPullParser, aVar, c0134c);
                if (eVarK != null) {
                    map2.put(eVarK.f10270a, eVarK);
                }
            } else if (m0.f(xmlPullParser, "metadata")) {
                I(xmlPullParser, map3);
            }
        } while (!m0.d(xmlPullParser, "head"));
        return map;
    }

    public static void I(XmlPullParser xmlPullParser, Map map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "image") && (strA = m0.a(xmlPullParser, Name.MARK)) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!m0.d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static W3.d J(org.xmlpull.v1.XmlPullParser r20, W3.d r21, java.util.Map r22, W3.c.b r23) throws P3.k {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.c.J(org.xmlpull.v1.XmlPullParser, W3.d, java.util.Map, W3.c$b):W3.d");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static W3.e K(org.xmlpull.v1.XmlPullParser r18, W3.c.a r19, W3.c.C0134c r20) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.c.K(org.xmlpull.v1.XmlPullParser, W3.c$a, W3.c$c):W3.e");
    }

    public static float L(String str) {
        Matcher matcher = f10243s.matcher(str);
        if (!matcher.matches()) {
            AbstractC1681B.j("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) AbstractC1684a.e(matcher.group(1)))));
        } catch (NumberFormatException e9) {
            AbstractC1681B.k("TtmlDecoder", "Failed to parse shear: " + str, e9);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static W3.g M(org.xmlpull.v1.XmlPullParser r13, W3.g r14) {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.c.M(org.xmlpull.v1.XmlPullParser, W3.g):W3.g");
    }

    public static String[] N(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : k0.i1(strTrim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long O(java.lang.String r13, W3.c.b r14) throws P3.k {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.c.O(java.lang.String, W3.c$b):long");
    }

    public static C0134c P(XmlPullParser xmlPullParser) {
        StringBuilder sb;
        String str;
        String strA = m0.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f10245u.matcher(strA);
        if (matcher.matches()) {
            try {
                return new C0134c(Integer.parseInt((String) AbstractC1684a.e(matcher.group(1))), Integer.parseInt((String) AbstractC1684a.e(matcher.group(2))));
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
                str = "Ignoring malformed tts extent: ";
            }
        } else {
            sb = new StringBuilder();
            str = "Ignoring non-pixel tts extent: ";
        }
        sb.append(str);
        sb.append(strA);
        AbstractC1681B.j("TtmlDecoder", sb.toString());
        return null;
    }

    @Override // P3.h
    public i z(byte[] bArr, int i9, boolean z9) throws k {
        b bVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f10249o.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e(""));
            C0134c c0134cP = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i9), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarG = f10247w;
            a aVarE = f10248x;
            h hVar = null;
            int i10 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i10 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVarG = G(xmlPullParserNewPullParser);
                            aVarE = E(xmlPullParserNewPullParser, f10248x);
                            c0134cP = P(xmlPullParserNewPullParser);
                        }
                        C0134c c0134c = c0134cP;
                        b bVar2 = bVarG;
                        a aVar = aVarE;
                        if (C(name)) {
                            if ("head".equals(name)) {
                                bVar = bVar2;
                                H(xmlPullParserNewPullParser, map, aVar, c0134c, map2, map3);
                            } else {
                                bVar = bVar2;
                                try {
                                    d dVarJ = J(xmlPullParserNewPullParser, dVar, map2, bVar);
                                    arrayDeque.push(dVarJ);
                                    if (dVar != null) {
                                        dVar.a(dVarJ);
                                    }
                                } catch (k e9) {
                                    AbstractC1681B.k("TtmlDecoder", "Suppressing parser error", e9);
                                    i10++;
                                }
                            }
                            bVarG = bVar;
                        } else {
                            AbstractC1681B.g("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i10++;
                            bVarG = bVar2;
                        }
                        c0134cP = c0134c;
                        aVarE = aVar;
                    } else if (eventType == 4) {
                        ((d) AbstractC1684a.e(dVar)).a(d.d(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            hVar = new h((d) AbstractC1684a.e((d) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i10++;
                } else if (eventType == 3) {
                    i10--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new k("No TTML subtitles found");
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected error when reading input.", e10);
        } catch (XmlPullParserException e11) {
            throw new k("Unable to decode source", e11);
        }
    }
}
