package F;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    public static class a {
        public static int a(TypedArray typedArray, int i9) {
            return typedArray.getType(i9);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d[] f1758a;

        public c(d[] dVarArr) {
            this.f1758a = dVarArr;
        }

        public d[] a() {
            return this.f1758a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f1761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f1762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f1763e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f1764f;

        public d(String str, int i9, boolean z9, String str2, int i10, int i11) {
            this.f1759a = str;
            this.f1760b = i9;
            this.f1761c = z9;
            this.f1762d = str2;
            this.f1763e = i10;
            this.f1764f = i11;
        }

        public String a() {
            return this.f1759a;
        }

        public int b() {
            return this.f1764f;
        }

        public int c() {
            return this.f1763e;
        }

        public String d() {
            return this.f1762d;
        }

        public int e() {
            return this.f1760b;
        }

        public boolean f() {
            return this.f1761c;
        }
    }

    /* JADX INFO: renamed from: F.e$e, reason: collision with other inner class name */
    public static final class C0022e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final M.e f1765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f1768d;

        public C0022e(M.e eVar, int i9, int i10, String str) {
            this.f1765a = eVar;
            this.f1767c = i9;
            this.f1766b = i10;
            this.f1768d = str;
        }

        public int a() {
            return this.f1767c;
        }

        public M.e b() {
            return this.f1765a;
        }

        public String c() {
            return this.f1768d;
        }

        public int d() {
            return this.f1766b;
        }
    }

    public static int a(TypedArray typedArray, int i9) {
        return a.a(typedArray, i9);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i9) {
        if (i9 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i9);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i10 = 0; i10 < typedArrayObtainTypedArray.length(); i10++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i10, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i9)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    public static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C.d.f849h);
        String string = typedArrayObtainAttributes.getString(C.d.f850i);
        String string2 = typedArrayObtainAttributes.getString(C.d.f854m);
        String string3 = typedArrayObtainAttributes.getString(C.d.f855n);
        int resourceId = typedArrayObtainAttributes.getResourceId(C.d.f851j, 0);
        int integer = typedArrayObtainAttributes.getInteger(C.d.f852k, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(C.d.f853l, 500);
        String string4 = typedArrayObtainAttributes.getString(C.d.f856o);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new C0022e(new M.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    public static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C.d.f857p);
        int i9 = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(C.d.f866y) ? C.d.f866y : C.d.f859r, 400);
        boolean z9 = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(C.d.f864w) ? C.d.f864w : C.d.f860s, 0);
        int i10 = typedArrayObtainAttributes.hasValue(C.d.f867z) ? C.d.f867z : C.d.f861t;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(C.d.f865x) ? C.d.f865x : C.d.f862u);
        int i11 = typedArrayObtainAttributes.getInt(i10, 0);
        int i12 = typedArrayObtainAttributes.hasValue(C.d.f863v) ? C.d.f863v : C.d.f858q;
        int resourceId = typedArrayObtainAttributes.getResourceId(i12, 0);
        String string2 = typedArrayObtainAttributes.getString(i12);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i9, z9, string, i11, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i9 = 1;
        while (i9 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i9++;
            } else if (next == 3) {
                i9--;
            }
        }
    }

    public static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
