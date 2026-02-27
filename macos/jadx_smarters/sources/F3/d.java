package F3;

import F3.k;
import O2.AbstractC0904o;
import O2.C0897l1;
import O2.C0936z0;
import V2.C1056m;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import b4.I;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.F;
import d4.b0;
import d4.k0;
import d4.m0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;
import org.simpleframework.xml.strategy.Name;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import r5.AbstractC2673b;
import r5.AbstractC2675d;
import s3.C2707a;
import s5.AbstractC2743y;
import s5.G;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public class d extends DefaultHandler implements I.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f1946c = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f1947d = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f1948e = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f1949f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f1950a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0936z0 f1951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC2743y f1952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k f1953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f1954d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList f1955e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList f1956f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f1957g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f1958h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final List f1959i;

        public a(C0936z0 c0936z0, List list, k kVar, String str, ArrayList arrayList, ArrayList arrayList2, List list2, List list3, long j9) {
            this.f1951a = c0936z0;
            this.f1952b = AbstractC2743y.r(list);
            this.f1953c = kVar;
            this.f1954d = str;
            this.f1955e = arrayList;
            this.f1956f = arrayList2;
            this.f1958h = list2;
            this.f1959i = list3;
            this.f1957g = j9;
        }
    }

    public d() {
        try {
            this.f1950a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e9) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e9);
        }
    }

    public static int D(List list) {
        String str;
        for (int i9 = 0; i9 < list.size(); i9++) {
            e eVar = (e) list.get(i9);
            if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f1960a) && (str = eVar.f1961b) != null) {
                Matcher matcher = f1947d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                AbstractC1681B.j("MpdParser", "Unable to parse CEA-608 channel number from: " + eVar.f1961b);
            }
        }
        return -1;
    }

    public static int E(List list) {
        String str;
        for (int i9 = 0; i9 < list.size(); i9++) {
            e eVar = (e) list.get(i9);
            if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f1960a) && (str = eVar.f1961b) != null) {
                Matcher matcher = f1948e.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                AbstractC1681B.j("MpdParser", "Unable to parse CEA-708 service block number from: " + eVar.f1961b);
            }
        }
        return -1;
    }

    public static long H(XmlPullParser xmlPullParser, String str, long j9) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j9 : k0.W0(attributeValue);
    }

    public static e I(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strR0 = r0(xmlPullParser, "schemeIdUri", "");
        String strR02 = r0(xmlPullParser, "value", null);
        String strR03 = r0(xmlPullParser, Name.MARK, null);
        do {
            xmlPullParser.next();
        } while (!m0.d(xmlPullParser, str));
        return new e(strR0, strR02, strR03);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int J(org.xmlpull.v1.XmlPullParser r4) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "value"
            java.lang.String r4 = r4.getAttributeValue(r2, r3)
            r2 = -1
            if (r4 != 0) goto Ld
            return r2
        Ld:
            java.lang.String r4 = r5.AbstractC2673b.e(r4)
            r4.hashCode()
            int r3 = r4.hashCode()
            switch(r3) {
                case 1596796: goto L3e;
                case 2937391: goto L33;
                case 3094035: goto L28;
                case 3133436: goto L1d;
                default: goto L1b;
            }
        L1b:
            r4 = -1
            goto L48
        L1d:
            java.lang.String r3 = "fa01"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L26
            goto L1b
        L26:
            r4 = 3
            goto L48
        L28:
            java.lang.String r3 = "f801"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L31
            goto L1b
        L31:
            r4 = 2
            goto L48
        L33:
            java.lang.String r3 = "a000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L3c
            goto L1b
        L3c:
            r4 = 1
            goto L48
        L3e:
            java.lang.String r3 = "4000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L47
            goto L1b
        L47:
            r4 = 0
        L48:
            switch(r4) {
                case 0: goto L52;
                case 1: goto L51;
                case 2: goto L4f;
                case 3: goto L4c;
                default: goto L4b;
            }
        L4b:
            return r2
        L4c:
            r4 = 8
            return r4
        L4f:
            r4 = 6
            return r4
        L51:
            return r0
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.d.J(org.xmlpull.v1.XmlPullParser):int");
    }

    public static int K(XmlPullParser xmlPullParser) {
        int iU = U(xmlPullParser, "value", -1);
        if (iU <= 0 || iU >= 33) {
            return -1;
        }
        return iU;
    }

    public static int L(XmlPullParser xmlPullParser) {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    public static long M(XmlPullParser xmlPullParser, String str, long j9) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j9 : k0.X0(attributeValue);
    }

    public static String N(List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            e eVar = (e) list.get(i9);
            String str = eVar.f1960a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(eVar.f1961b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(eVar.f1961b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    public static float R(XmlPullParser xmlPullParser, String str, float f9) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f9 : Float.parseFloat(attributeValue);
    }

    public static float S(XmlPullParser xmlPullParser, float f9) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f9;
        }
        Matcher matcher = f1946c.matcher(attributeValue);
        if (!matcher.matches()) {
            return f9;
        }
        int i9 = Integer.parseInt(matcher.group(1));
        float f10 = i9;
        return !TextUtils.isEmpty(matcher.group(2)) ? f10 / Integer.parseInt(r2) : f10;
    }

    public static int U(XmlPullParser xmlPullParser, String str, int i9) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i9 : Integer.parseInt(attributeValue);
    }

    public static long W(List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            e eVar = (e) list.get(i9);
            if (AbstractC2673b.a("http://dashif.org/guidelines/last-segment-number", eVar.f1960a)) {
                return Long.parseLong(eVar.f1961b);
            }
        }
        return -1L;
    }

    public static long X(XmlPullParser xmlPullParser, String str, long j9) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j9 : Long.parseLong(attributeValue);
    }

    public static int Z(XmlPullParser xmlPullParser) {
        int iU = U(xmlPullParser, "value", -1);
        if (iU < 0) {
            return -1;
        }
        int[] iArr = f1949f;
        if (iU < iArr.length) {
            return iArr[iU];
        }
        return -1;
    }

    public static int p(int i9, int i10) {
        if (i9 == -1) {
            return i10;
        }
        if (i10 == -1) {
            return i9;
        }
        AbstractC1684a.g(i9 == i10);
        return i9;
    }

    public static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        AbstractC1684a.g(str.equals(str2));
        return str;
    }

    public static void r(ArrayList arrayList) {
        String str;
        int i9 = 0;
        while (true) {
            if (i9 >= arrayList.size()) {
                str = null;
                break;
            }
            C1056m.b bVar = (C1056m.b) arrayList.get(i9);
            if (AbstractC0904o.f6139c.equals(bVar.f10011c) && (str = bVar.f10012d) != null) {
                arrayList.remove(i9);
                break;
            }
            i9++;
        }
        if (str == null) {
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C1056m.b bVar2 = (C1056m.b) arrayList.get(i10);
            if (AbstractC0904o.f6138b.equals(bVar2.f10011c) && bVar2.f10012d == null) {
                arrayList.set(i10, new C1056m.b(AbstractC0904o.f6139c, str, bVar2.f10013e, bVar2.f10014f));
            }
        }
    }

    public static String r0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static void s(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1056m.b bVar = (C1056m.b) arrayList.get(size);
            if (!bVar.d()) {
                int i9 = 0;
                while (true) {
                    if (i9 >= arrayList.size()) {
                        break;
                    }
                    if (((C1056m.b) arrayList.get(i9)).a(bVar)) {
                        arrayList.remove(size);
                        break;
                    }
                    i9++;
                }
            }
        }
    }

    public static String s0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                w(xmlPullParser);
            }
        } while (!m0.d(xmlPullParser, str));
        return text;
    }

    public static long t(long j9, long j10) {
        if (j10 != -9223372036854775807L) {
            j9 = j10;
        }
        if (j9 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j9;
    }

    public static String u(String str, String str2) {
        if (F.o(str)) {
            return F.c(str2);
        }
        if (F.s(str)) {
            return F.n(str2);
        }
        if (F.r(str) || F.p(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String strG = F.g(str2);
        return "text/vtt".equals(strG) ? "application/x-mp4-vtt" : strG;
    }

    public static void w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (m0.e(xmlPullParser)) {
            int i9 = 1;
            while (i9 != 0) {
                xmlPullParser.next();
                if (m0.e(xmlPullParser)) {
                    i9++;
                } else if (m0.c(xmlPullParser)) {
                    i9--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int A(org.xmlpull.v1.XmlPullParser r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "schemeIdUri"
            r1 = 0
            java.lang.String r0 = r0(r4, r0, r1)
            r0.hashCode()
            r1 = -1
            int r2 = r0.hashCode()
            switch(r2) {
                case -2128649360: goto L56;
                case -1352850286: goto L4b;
                case -1138141449: goto L40;
                case -986633423: goto L35;
                case -79006963: goto L2a;
                case 312179081: goto L1f;
                case 2036691300: goto L14;
                default: goto L12;
            }
        L12:
            r0 = -1
            goto L60
        L14:
            java.lang.String r2 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1d
            goto L12
        L1d:
            r0 = 6
            goto L60
        L1f:
            java.lang.String r2 = "tag:dts.com,2018:uhd:audio_channel_configuration"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L28
            goto L12
        L28:
            r0 = 5
            goto L60
        L2a:
            java.lang.String r2 = "tag:dts.com,2014:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L33
            goto L12
        L33:
            r0 = 4
            goto L60
        L35:
            java.lang.String r2 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3e
            goto L12
        L3e:
            r0 = 3
            goto L60
        L40:
            java.lang.String r2 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L49
            goto L12
        L49:
            r0 = 2
            goto L60
        L4b:
            java.lang.String r2 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L54
            goto L12
        L54:
            r0 = 1
            goto L60
        L56:
            java.lang.String r2 = "urn:dts:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5f
            goto L12
        L5f:
            r0 = 0
        L60:
            switch(r0) {
                case 0: goto L7a;
                case 1: goto L73;
                case 2: goto L6e;
                case 3: goto L69;
                case 4: goto L7a;
                case 5: goto L64;
                case 6: goto L6e;
                default: goto L63;
            }
        L63:
            goto L7e
        L64:
            int r1 = L(r4)
            goto L7e
        L69:
            int r1 = Z(r4)
            goto L7e
        L6e:
            int r1 = J(r4)
            goto L7e
        L73:
            java.lang.String r0 = "value"
            int r1 = U(r4, r0, r1)
            goto L7e
        L7a:
            int r1 = K(r4)
        L7e:
            r4.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = d4.m0.d(r4, r0)
            if (r0 == 0) goto L7e
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.d.A(org.xmlpull.v1.XmlPullParser):int");
    }

    public long B(XmlPullParser xmlPullParser, long j9) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j9;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public List C(XmlPullParser xmlPullParser, List list, boolean z9) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i9 = attributeValue != null ? Integer.parseInt(attributeValue) : z9 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i10 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String strS0 = s0(xmlPullParser, "BaseURL");
        if (b0.b(strS0)) {
            if (attributeValue3 == null) {
                attributeValue3 = strS0;
            }
            return G.k(new b(strS0, attributeValue3, i9, i10));
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            b bVar = (b) list.get(i11);
            String strD = b0.d(bVar.f1929a, strS0);
            String str = attributeValue3 == null ? strD : attributeValue3;
            if (z9) {
                i9 = bVar.f1931c;
                i10 = bVar.f1932d;
                str = bVar.f1930b;
            }
            arrayList.add(new b(strD, str, i9, i10));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    /* JADX WARN: Type inference failed for: r4v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair F(org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.d.F(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public int G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public Pair O(XmlPullParser xmlPullParser, String str, String str2, long j9, long j10, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long jX = X(xmlPullParser, Name.MARK, 0L);
        long jX2 = X(xmlPullParser, "duration", -9223372036854775807L);
        long jX3 = X(xmlPullParser, "presentationTime", 0L);
        long jC1 = k0.c1(jX2, 1000L, j9);
        long jC12 = k0.c1(jX3 - j10, 1000000L, j9);
        String strR0 = r0(xmlPullParser, "messageData", null);
        byte[] bArrP = P(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jC12);
        if (strR0 != null) {
            bArrP = k0.s0(strR0);
        }
        return Pair.create(lValueOf, d(str, str2, jX, jC1, bArrP));
    }

    public byte[] P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, AbstractC2675d.f49724c.name());
        while (true) {
            xmlPullParser.nextToken();
            if (m0.d(xmlPullParser, "Event")) {
                xmlSerializerNewSerializer.flush();
                return byteArrayOutputStream.toByteArray();
            }
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i9 = 0; i9 < xmlPullParser.getAttributeCount(); i9++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i9), xmlPullParser.getAttributeName(i9), xmlPullParser.getAttributeValue(i9));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
        }
    }

    public f Q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        long j9;
        ArrayList arrayList;
        String strR0 = r0(xmlPullParser, "schemeIdUri", "");
        String strR02 = r0(xmlPullParser, "value", "");
        long jX = X(xmlPullParser, "timescale", 1L);
        long jX2 = X(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED);
        while (true) {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j10 = jX2;
                j9 = jX2;
                arrayList = arrayList2;
                arrayList.add(O(xmlPullParser, strR0, strR02, jX, j10, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                j9 = jX2;
                arrayList = arrayList2;
                w(xmlPullParser);
            }
            if (m0.d(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            jX2 = j9;
        }
        long[] jArr = new long[arrayList.size()];
        C2707a[] c2707aArr = new C2707a[arrayList.size()];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            Pair pair = (Pair) arrayList.get(i9);
            jArr[i9] = ((Long) pair.first).longValue();
            c2707aArr[i9] = (C2707a) pair.second;
        }
        return e(strR0, strR02, jX, jArr, c2707aArr);
    }

    public i T(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "sourceURL", "range");
    }

    public String V(XmlPullParser xmlPullParser) {
        return s0(xmlPullParser, "Label");
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01dc A[LOOP:0: B:24:0x00a0->B:80:0x01dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0197 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public F3.c Y(org.xmlpull.v1.XmlPullParser r47, android.net.Uri r48) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.d.Y(org.xmlpull.v1.XmlPullParser, android.net.Uri):F3.c");
    }

    public Pair a0(XmlPullParser xmlPullParser, List list, long j9, long j10, long j11, long j12, boolean z9) throws XmlPullParserException, IOException {
        long j13;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        long j14;
        k kVarL0;
        d dVar = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, Name.MARK);
        long jM = M(xmlPullParser2, "start", j9);
        long j15 = -9223372036854775807L;
        long j16 = j11 != -9223372036854775807L ? j11 + jM : -9223372036854775807L;
        long jM2 = M(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long jB = j10;
        long j17 = -9223372036854775807L;
        k kVarJ0 = null;
        e eVarI = null;
        boolean z10 = false;
        while (true) {
            xmlPullParser.next();
            if (m0.f(xmlPullParser2, "BaseURL")) {
                if (!z10) {
                    jB = dVar.B(xmlPullParser2, jB);
                    z10 = true;
                }
                arrayList6.addAll(dVar.C(xmlPullParser2, list, z9));
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                j14 = j15;
                obj = obj2;
                arrayList2 = arrayList4;
            } else {
                if (m0.f(xmlPullParser2, "AdaptationSet")) {
                    j13 = jB;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(y(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, kVarJ0, jM2, jB, j17, j16, j12, z9));
                    xmlPullParser2 = xmlPullParser;
                    arrayList3 = arrayList5;
                } else {
                    j13 = jB;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (m0.f(xmlPullParser2, "EventStream")) {
                        arrayList7.add(Q(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else {
                        arrayList3 = arrayList7;
                        if (m0.f(xmlPullParser2, "SegmentBase")) {
                            kVarJ0 = j0(xmlPullParser2, null);
                            obj = null;
                            jB = j13;
                            j14 = -9223372036854775807L;
                        } else {
                            if (m0.f(xmlPullParser2, "SegmentList")) {
                                long jB2 = B(xmlPullParser2, -9223372036854775807L);
                                obj = null;
                                kVarL0 = k0(xmlPullParser, null, j16, jM2, j13, jB2, j12);
                                j17 = jB2;
                                jB = j13;
                                j14 = -9223372036854775807L;
                            } else {
                                obj = null;
                                if (m0.f(xmlPullParser2, "SegmentTemplate")) {
                                    long jB3 = B(xmlPullParser2, -9223372036854775807L);
                                    j14 = -9223372036854775807L;
                                    kVarL0 = l0(xmlPullParser, null, AbstractC2743y.z(), j16, jM2, j13, jB3, j12);
                                    j17 = jB3;
                                    jB = j13;
                                } else {
                                    j14 = -9223372036854775807L;
                                    if (m0.f(xmlPullParser2, "AssetIdentifier")) {
                                        eVarI = I(xmlPullParser2, "AssetIdentifier");
                                    } else {
                                        w(xmlPullParser);
                                    }
                                    jB = j13;
                                }
                            }
                            kVarJ0 = kVarL0;
                        }
                    }
                }
                obj = null;
                j14 = -9223372036854775807L;
                jB = j13;
            }
            if (m0.d(xmlPullParser2, "Period")) {
                return Pair.create(h(attributeValue, jM, arrayList2, arrayList3, eVarI), Long.valueOf(jM2));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            obj2 = obj;
            arrayList5 = arrayList3;
            j15 = j14;
            dVar = this;
        }
    }

    public final long b(List list, long j9, long j10, int i9, long j11) {
        int iM = i9 >= 0 ? i9 + 1 : (int) k0.m(j11 - j9, j10);
        for (int i10 = 0; i10 < iM; i10++) {
            list.add(m(j9, j10));
            j9 += j10;
        }
        return j9;
    }

    public String[] b0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    public F3.a c(int i9, int i10, List list, List list2, List list3, List list4) {
        return new F3.a(i9, i10, list, list2, list3, list4);
    }

    public h c0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String strR0 = r0(xmlPullParser, "moreInformationURL", null);
        String strR02 = r0(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (m0.f(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (m0.f(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                w(xmlPullParser);
            }
            String str = strNextText3;
            if (m0.d(xmlPullParser, "ProgramInformation")) {
                return new h(strNextText, strNextText2, str, strR0, strR02);
            }
            strNextText3 = str;
        }
    }

    public C2707a d(String str, String str2, long j9, long j10, byte[] bArr) {
        return new C2707a(str, str2, j10, j9, bArr);
    }

    public i d0(XmlPullParser xmlPullParser, String str, String str2) {
        long j9;
        long j10;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j9 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j10 = (Long.parseLong(strArrSplit[1]) - j9) + 1;
            }
            return i(attributeValue, j9, j10);
        }
        j9 = 0;
        j10 = -1;
        return i(attributeValue, j9, j10);
    }

    public f e(String str, String str2, long j9, long[] jArr, C2707a[] c2707aArr) {
        return new f(str, str2, j9, jArr, c2707aArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01ee A[LOOP:0: B:3:0x006a->B:57:0x01ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198 A[EDGE_INSN: B:58:0x0198->B:47:0x0198 BREAK  A[LOOP:0: B:3:0x006a->B:57:0x01ee], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public F3.d.a e0(org.xmlpull.v1.XmlPullParser r36, java.util.List r37, java.lang.String r38, java.lang.String r39, int r40, int r41, float r42, int r43, int r44, java.lang.String r45, java.util.List r46, java.util.List r47, java.util.List r48, java.util.List r49, F3.k r50, long r51, long r53, long r55, long r57, long r59, boolean r61) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.d.e0(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, F3.k, long, long, long, long, long, boolean):F3.d$a");
    }

    public C0936z0 f(String str, String str2, int i9, int i10, float f9, int i11, int i12, int i13, String str3, List list, List list2, String str4, List list3, List list4) {
        String str5 = str4;
        String strU = u(str2, str5);
        if ("audio/eac3".equals(strU)) {
            strU = N(list4);
            if ("audio/eac3-joc".equals(strU)) {
                str5 = "ec+3";
            }
        }
        int iP0 = p0(list);
        int iI0 = i0(list) | f0(list2) | h0(list3) | h0(list4);
        Pair pairT0 = t0(list3);
        C0936z0.b bVarX = new C0936z0.b().U(str).M(str2).g0(strU).K(str5).b0(i13).i0(iP0).e0(iI0).X(str3);
        int iE = -1;
        C0936z0.b bVarM0 = bVarX.l0(pairT0 != null ? ((Integer) pairT0.first).intValue() : -1).m0(pairT0 != null ? ((Integer) pairT0.second).intValue() : -1);
        if (F.s(strU)) {
            bVarM0.n0(i9).S(i10).R(f9);
        } else if (F.o(strU)) {
            bVarM0.J(i11).h0(i12);
        } else if (F.r(strU)) {
            if ("application/cea-608".equals(strU)) {
                iE = D(list2);
            } else if ("application/cea-708".equals(strU)) {
                iE = E(list2);
            }
            bVarM0.H(iE);
        } else if (F.p(strU)) {
            bVarM0.n0(i9).S(i10);
        }
        return bVarM0.G();
    }

    public int f0(List list) {
        int iU0;
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            if (AbstractC2673b.a("urn:mpeg:dash:role:2011", eVar.f1960a)) {
                iU0 = g0(eVar.f1961b);
            } else if (AbstractC2673b.a("urn:tva:metadata:cs:AudioPurposeCS:2007", eVar.f1960a)) {
                iU0 = u0(eVar.f1961b);
            }
            i9 |= iU0;
        }
        return i9;
    }

    public c g(long j9, long j10, long j11, boolean z9, long j12, long j13, long j14, long j15, h hVar, o oVar, l lVar, Uri uri, List list) {
        return new c(j9, j10, j11, z9, j12, j13, j14, j15, hVar, oVar, lVar, uri, list);
    }

    public int g0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public g h(String str, long j9, List list, List list2, e eVar) {
        return new g(str, j9, list, list2, eVar);
    }

    public int h0(List list) {
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (AbstractC2673b.a("http://dashif.org/guidelines/trickmode", ((e) list.get(i10)).f1960a)) {
                i9 = Http2.INITIAL_MAX_FRAME_SIZE;
            }
        }
        return i9;
    }

    public i i(String str, long j9, long j10) {
        return new i(str, j9, j10);
    }

    public int i0(List list) {
        int iG0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            e eVar = (e) list.get(i9);
            if (AbstractC2673b.a("urn:mpeg:dash:role:2011", eVar.f1960a)) {
                iG0 |= g0(eVar.f1961b);
            }
        }
        return iG0;
    }

    public j j(a aVar, String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        C0936z0.b bVarB = aVar.f1951a.b();
        if (str != null) {
            bVarB.W(str);
        }
        String str3 = aVar.f1954d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList arrayList3 = aVar.f1955e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            s(arrayList3);
            bVarB.O(new C1056m(str2, arrayList3));
        }
        ArrayList arrayList4 = aVar.f1956f;
        arrayList4.addAll(arrayList2);
        return j.o(aVar.f1957g, bVarB.G(), aVar.f1952b, aVar.f1953c, arrayList4, aVar.f1958h, aVar.f1959i, null);
    }

    public k.e j0(XmlPullParser xmlPullParser, k.e eVar) throws XmlPullParserException, IOException {
        long j9;
        long j10;
        long jX = X(xmlPullParser, "timescale", eVar != null ? eVar.f1997b : 1L);
        long jX2 = X(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f1998c : 0L);
        long j11 = eVar != null ? eVar.f2011d : 0L;
        long j12 = eVar != null ? eVar.f2012e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j10 = Long.parseLong(strArrSplit[0]);
            j9 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
        } else {
            j9 = j12;
            j10 = j11;
        }
        i iVarT = eVar != null ? eVar.f1996a : null;
        do {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "Initialization")) {
                iVarT = T(xmlPullParser);
            } else {
                w(xmlPullParser);
            }
        } while (!m0.d(xmlPullParser, "SegmentBase"));
        return n(iVarT, jX, jX2, j10, j9);
    }

    public k.b k(i iVar, long j9, long j10, long j11, long j12, List list, long j13, List list2, long j14, long j15) {
        return new k.b(iVar, j9, j10, j11, j12, list, j13, list2, k0.P0(j14), k0.P0(j15));
    }

    public k.b k0(XmlPullParser xmlPullParser, k.b bVar, long j9, long j10, long j11, long j12, long j13) throws XmlPullParserException, IOException {
        long jX = X(xmlPullParser, "timescale", bVar != null ? bVar.f1997b : 1L);
        long jX2 = X(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f1998c : 0L);
        long jX3 = X(xmlPullParser, "duration", bVar != null ? bVar.f2000e : -9223372036854775807L);
        long jX4 = X(xmlPullParser, "startNumber", bVar != null ? bVar.f1999d : 1L);
        long jT = t(j11, j12);
        List listM0 = null;
        List arrayList = null;
        i iVarT = null;
        do {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "Initialization")) {
                iVarT = T(xmlPullParser);
            } else if (m0.f(xmlPullParser, "SegmentTimeline")) {
                listM0 = m0(xmlPullParser, jX, j10);
            } else if (m0.f(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(n0(xmlPullParser));
            } else {
                w(xmlPullParser);
            }
        } while (!m0.d(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (iVarT == null) {
                iVarT = bVar.f1996a;
            }
            if (listM0 == null) {
                listM0 = bVar.f2001f;
            }
            if (arrayList == null) {
                arrayList = bVar.f2005j;
            }
        }
        return k(iVarT, jX, jX2, jX4, jX3, listM0, jT, arrayList, j13, j9);
    }

    public k.c l(i iVar, long j9, long j10, long j11, long j12, long j13, List list, long j14, n nVar, n nVar2, long j15, long j16) {
        return new k.c(iVar, j9, j10, j11, j12, j13, list, j14, nVar, nVar2, k0.P0(j15), k0.P0(j16));
    }

    public k.c l0(XmlPullParser xmlPullParser, k.c cVar, List list, long j9, long j10, long j11, long j12, long j13) throws XmlPullParserException, IOException {
        long jX = X(xmlPullParser, "timescale", cVar != null ? cVar.f1997b : 1L);
        long jX2 = X(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f1998c : 0L);
        long jX3 = X(xmlPullParser, "duration", cVar != null ? cVar.f2000e : -9223372036854775807L);
        long jX4 = X(xmlPullParser, "startNumber", cVar != null ? cVar.f1999d : 1L);
        long jW = W(list);
        long jT = t(j11, j12);
        List listM0 = null;
        n nVarV0 = v0(xmlPullParser, "media", cVar != null ? cVar.f2007k : null);
        n nVarV02 = v0(xmlPullParser, "initialization", cVar != null ? cVar.f2006j : null);
        i iVarT = null;
        do {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "Initialization")) {
                iVarT = T(xmlPullParser);
            } else if (m0.f(xmlPullParser, "SegmentTimeline")) {
                listM0 = m0(xmlPullParser, jX, j10);
            } else {
                w(xmlPullParser);
            }
        } while (!m0.d(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (iVarT == null) {
                iVarT = cVar.f1996a;
            }
            if (listM0 == null) {
                listM0 = cVar.f2001f;
            }
        }
        return l(iVarT, jX, jX2, jX4, jW, jX3, listM0, jT, nVarV02, nVarV0, j13, j9);
    }

    public k.d m(long j9, long j10) {
        return new k.d(j9, j10);
    }

    public List m0(XmlPullParser xmlPullParser, long j9, long j10) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jB = 0;
        long jX = -9223372036854775807L;
        boolean z9 = false;
        int iU = 0;
        do {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "S")) {
                long jX2 = X(xmlPullParser, "t", -9223372036854775807L);
                if (z9) {
                    jB = b(arrayList, jB, jX, iU, jX2);
                }
                if (jX2 == -9223372036854775807L) {
                    jX2 = jB;
                }
                jX = X(xmlPullParser, "d", -9223372036854775807L);
                iU = U(xmlPullParser, "r", 0);
                jB = jX2;
                z9 = true;
            } else {
                w(xmlPullParser);
            }
        } while (!m0.d(xmlPullParser, "SegmentTimeline"));
        if (z9) {
            b(arrayList, jB, jX, iU, k0.c1(j10, j9, 1000L));
        }
        return arrayList;
    }

    public k.e n(i iVar, long j9, long j10, long j11, long j12) {
        return new k.e(iVar, j9, j10, j11, j12);
    }

    public i n0(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "media", "mediaRange");
    }

    public o o(String str, String str2) {
        return new o(str, str2);
    }

    public int o0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    public int p0(List list) {
        int iO0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            e eVar = (e) list.get(i9);
            if (AbstractC2673b.a("urn:mpeg:dash:role:2011", eVar.f1960a)) {
                iO0 |= o0(eVar.f1961b);
            }
        }
        return iO0;
    }

    public l q0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long jX = -9223372036854775807L;
        long jX2 = -9223372036854775807L;
        long jX3 = -9223372036854775807L;
        float fR = -3.4028235E38f;
        float fR2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "Latency")) {
                jX = X(xmlPullParser, "target", -9223372036854775807L);
                jX2 = X(xmlPullParser, "min", -9223372036854775807L);
                jX3 = X(xmlPullParser, "max", -9223372036854775807L);
            } else if (m0.f(xmlPullParser, "PlaybackRate")) {
                fR = R(xmlPullParser, "min", -3.4028235E38f);
                fR2 = R(xmlPullParser, "max", -3.4028235E38f);
            }
            long j9 = jX;
            long j10 = jX2;
            long j11 = jX3;
            float f9 = fR;
            float f10 = fR2;
            if (m0.d(xmlPullParser, "ServiceDescription")) {
                return new l(j9, j10, j11, f9, f10);
            }
            jX = j9;
            jX2 = j10;
            jX3 = j11;
            fR = f9;
            fR2 = f10;
        }
    }

    public Pair t0(List list) {
        String str;
        for (int i9 = 0; i9 < list.size(); i9++) {
            e eVar = (e) list.get(i9);
            if ((AbstractC2673b.a("http://dashif.org/thumbnail_tile", eVar.f1960a) || AbstractC2673b.a("http://dashif.org/guidelines/thumbnail_tile", eVar.f1960a)) && (str = eVar.f1961b) != null) {
                String[] strArrI1 = k0.i1(str, "x");
                if (strArrI1.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(strArrI1[0])), Integer.valueOf(Integer.parseInt(strArrI1[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public int u0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public final boolean v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public n v0(XmlPullParser xmlPullParser, String str, n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? n.b(attributeValue) : nVar;
    }

    public o w0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    @Override // b4.I.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public c a(Uri uri, InputStream inputStream) throws C0897l1 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f1950a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return Y(xmlPullParserNewPullParser, uri);
            }
            throw C0897l1.c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e9) {
            throw C0897l1.c(null, e9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x030d A[LOOP:0: B:3:0x007c->B:71:0x030d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ce A[EDGE_INSN: B:72:0x02ce->B:65:0x02ce BREAK  A[LOOP:0: B:3:0x007c->B:71:0x030d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public F3.a y(org.xmlpull.v1.XmlPullParser r55, java.util.List r56, F3.k r57, long r58, long r60, long r62, long r64, long r66, boolean r68) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.d.y(org.xmlpull.v1.XmlPullParser, java.util.List, F3.k, long, long, long, long, long, boolean):F3.a");
    }

    public void z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        w(xmlPullParser);
    }
}
