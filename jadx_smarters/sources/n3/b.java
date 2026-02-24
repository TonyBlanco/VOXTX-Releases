package N3;

import N3.a;
import O2.C0897l1;
import O2.C0936z0;
import V2.C1056m;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import b4.I;
import d4.AbstractC1684a;
import d4.AbstractC1689f;
import d4.k0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import l3.AbstractC2187l;
import l3.p;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes3.dex */
public class b implements I.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f5318a;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f5320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f5321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f5322d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f5321c = aVar;
            this.f5319a = str;
            this.f5320b = str2;
        }

        public void a(Object obj) {
        }

        public abstract Object b();

        public final Object c(String str) {
            for (int i9 = 0; i9 < this.f5322d.size(); i9++) {
                Pair pair = (Pair) this.f5322d.get(i9);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f5321c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        public boolean d(String str) {
            return false;
        }

        public final a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        public final Object f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z9 = false;
            int i9 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f5320b.equals(name)) {
                        n(xmlPullParser);
                        z9 = true;
                    } else if (z9) {
                        if (i9 > 0) {
                            i9++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a aVarE = e(this, name, this.f5319a);
                            if (aVarE == null) {
                                i9 = 1;
                            } else {
                                a(aVarE.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z9 && i9 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z9) {
                    continue;
                } else if (i9 > 0) {
                    i9--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        public final boolean g(XmlPullParser xmlPullParser, String str, boolean z9) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z9;
        }

        public void h(XmlPullParser xmlPullParser) {
        }

        public final int i(XmlPullParser xmlPullParser, String str, int i9) throws C0897l1 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i9;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e9) {
                throw C0897l1.c(null, e9);
            }
        }

        public final long j(XmlPullParser xmlPullParser, String str, long j9) throws C0897l1 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j9;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e9) {
                throw C0897l1.c(null, e9);
            }
        }

        public final int k(XmlPullParser xmlPullParser, String str) throws C0897l1 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C0072b(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e9) {
                throw C0897l1.c(null, e9);
            }
        }

        public final long l(XmlPullParser xmlPullParser, String str) throws C0897l1 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C0072b(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e9) {
                throw C0897l1.c(null, e9);
            }
        }

        public final String m(XmlPullParser xmlPullParser, String str) throws C0072b {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C0072b(str);
        }

        public abstract void n(XmlPullParser xmlPullParser);

        public void o(XmlPullParser xmlPullParser) {
        }

        public final void p(String str, Object obj) {
            this.f5322d.add(Pair.create(str, obj));
        }
    }

    /* JADX INFO: renamed from: N3.b$b, reason: collision with other inner class name */
    public static class C0072b extends C0897l1 {
        public C0072b(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    public static class c extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f5323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public UUID f5324f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f5325g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        public static p[] q(byte[] bArr) {
            return new p[]{new p(true, null, 8, r(bArr), 0, 0, null)};
        }

        public static byte[] r(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i9 = 0; i9 < bArr.length; i9 += 2) {
                sb.append((char) bArr[i9]);
            }
            String string = sb.toString();
            byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
            t(bArrDecode, 0, 3);
            t(bArrDecode, 1, 2);
            t(bArrDecode, 4, 5);
            t(bArrDecode, 6, 7);
            return bArrDecode;
        }

        public static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        public static void t(byte[] bArr, int i9, int i10) {
            byte b9 = bArr[i9];
            bArr[i9] = bArr[i10];
            bArr[i10] = b9;
        }

        @Override // N3.b.a
        public Object b() {
            UUID uuid = this.f5324f;
            return new a.C0071a(uuid, AbstractC2187l.a(uuid, this.f5325g), q(this.f5325g));
        }

        @Override // N3.b.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // N3.b.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f5323e = false;
            }
        }

        @Override // N3.b.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f5323e = true;
                this.f5324f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // N3.b.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.f5323e) {
                this.f5325g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    public static class d extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C0936z0 f5326e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        public static List q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] bArrL = k0.L(str);
                byte[][] bArrJ = AbstractC1689f.j(bArrL);
                if (bArrJ == null) {
                    arrayList.add(bArrL);
                } else {
                    Collections.addAll(arrayList, bArrJ);
                }
            }
            return arrayList;
        }

        public static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // N3.b.a
        public Object b() {
            return this.f5326e;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
        @Override // N3.b.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void n(org.xmlpull.v1.XmlPullParser r9) throws O2.C0897l1 {
            /*
                Method dump skipped, instruction units count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: N3.b.d.n(org.xmlpull.v1.XmlPullParser):void");
        }
    }

    public static class e extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f5327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5328f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f5329g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f5330h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f5331i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f5332j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f5333k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f5334l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public a.C0071a f5335m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f5333k = -1;
            this.f5335m = null;
            this.f5327e = new LinkedList();
        }

        @Override // N3.b.a
        public void a(Object obj) {
            if (obj instanceof a.b) {
                this.f5327e.add((a.b) obj);
            } else if (obj instanceof a.C0071a) {
                AbstractC1684a.g(this.f5335m == null);
                this.f5335m = (a.C0071a) obj;
            }
        }

        @Override // N3.b.a
        public Object b() {
            int size = this.f5327e.size();
            a.b[] bVarArr = new a.b[size];
            this.f5327e.toArray(bVarArr);
            if (this.f5335m != null) {
                a.C0071a c0071a = this.f5335m;
                C1056m c1056m = new C1056m(new C1056m.b(c0071a.f5299a, "video/mp4", c0071a.f5300b));
                for (int i9 = 0; i9 < size; i9++) {
                    a.b bVar = bVarArr[i9];
                    int i10 = bVar.f5302a;
                    if (i10 == 2 || i10 == 1) {
                        C0936z0[] c0936z0Arr = bVar.f5311j;
                        for (int i11 = 0; i11 < c0936z0Arr.length; i11++) {
                            c0936z0Arr[i11] = c0936z0Arr[i11].b().O(c1056m).G();
                        }
                    }
                }
            }
            return new N3.a(this.f5328f, this.f5329g, this.f5330h, this.f5331i, this.f5332j, this.f5333k, this.f5334l, this.f5335m, bVarArr);
        }

        @Override // N3.b.a
        public void n(XmlPullParser xmlPullParser) {
            this.f5328f = k(xmlPullParser, "MajorVersion");
            this.f5329g = k(xmlPullParser, "MinorVersion");
            this.f5330h = j(xmlPullParser, "TimeScale", 10000000L);
            this.f5331i = l(xmlPullParser, "Duration");
            this.f5332j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.f5333k = i(xmlPullParser, "LookaheadCount", -1);
            this.f5334l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.f5330h));
        }
    }

    public static class f extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f5336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f5337f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f5338g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f5339h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f5340i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f5341j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f5342k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f5343l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f5344m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f5345n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f5346o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f5347p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public ArrayList f5348q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f5349r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f5336e = str;
            this.f5337f = new LinkedList();
        }

        @Override // N3.b.a
        public void a(Object obj) {
            if (obj instanceof C0936z0) {
                this.f5337f.add((C0936z0) obj);
            }
        }

        @Override // N3.b.a
        public Object b() {
            C0936z0[] c0936z0Arr = new C0936z0[this.f5337f.size()];
            this.f5337f.toArray(c0936z0Arr);
            return new a.b(this.f5336e, this.f5342k, this.f5338g, this.f5339h, this.f5340i, this.f5341j, this.f5343l, this.f5344m, this.f5345n, this.f5346o, this.f5347p, c0936z0Arr, this.f5348q, this.f5349r);
        }

        @Override // N3.b.a
        public boolean d(String str) {
            return "c".equals(str);
        }

        @Override // N3.b.a
        public void n(XmlPullParser xmlPullParser) throws C0897l1 {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }

        public final void q(XmlPullParser xmlPullParser) throws C0897l1 {
            int iS = s(xmlPullParser);
            this.f5338g = iS;
            p("Type", Integer.valueOf(iS));
            this.f5339h = this.f5338g == 3 ? m(xmlPullParser, "Subtype") : xmlPullParser.getAttributeValue(null, "Subtype");
            p("Subtype", this.f5339h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f5341j = attributeValue;
            p("Name", attributeValue);
            this.f5342k = m(xmlPullParser, "Url");
            this.f5343l = i(xmlPullParser, "MaxWidth", -1);
            this.f5344m = i(xmlPullParser, "MaxHeight", -1);
            this.f5345n = i(xmlPullParser, "DisplayWidth", -1);
            this.f5346o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f5347p = attributeValue2;
            p("Language", attributeValue2);
            long jI = i(xmlPullParser, "TimeScale", -1);
            this.f5340i = jI;
            if (jI == -1) {
                this.f5340i = ((Long) c("TimeScale")).longValue();
            }
            this.f5348q = new ArrayList();
        }

        public final void r(XmlPullParser xmlPullParser) throws C0897l1 {
            int size = this.f5348q.size();
            long j9 = j(xmlPullParser, "t", -9223372036854775807L);
            int i9 = 1;
            if (j9 == -9223372036854775807L) {
                if (size == 0) {
                    j9 = 0;
                } else {
                    if (this.f5349r == -1) {
                        throw C0897l1.c("Unable to infer start time", null);
                    }
                    j9 = ((Long) this.f5348q.get(size - 1)).longValue() + this.f5349r;
                }
            }
            this.f5348q.add(Long.valueOf(j9));
            this.f5349r = j(xmlPullParser, "d", -9223372036854775807L);
            long j10 = j(xmlPullParser, "r", 1L);
            if (j10 > 1 && this.f5349r == -9223372036854775807L) {
                throw C0897l1.c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j11 = i9;
                if (j11 >= j10) {
                    return;
                }
                this.f5348q.add(Long.valueOf((this.f5349r * j11) + j9));
                i9++;
            }
        }

        public final int s(XmlPullParser xmlPullParser) throws C0897l1 {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new C0072b("Type");
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw C0897l1.c("Invalid key value[" + attributeValue + "]", null);
        }
    }

    public b() {
        try {
            this.f5318a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e9) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e9);
        }
    }

    @Override // b4.I.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public N3.a a(Uri uri, InputStream inputStream) throws C0897l1 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f5318a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return (N3.a) new e(null, uri.toString()).f(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e9) {
            throw C0897l1.c(null, e9);
        }
    }
}
