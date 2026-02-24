package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.navigation.d;
import androidx.navigation.h;
import androidx.navigation.p;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import w0.AbstractC2900a;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f16420c = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f16421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f16422b;

    public o(Context context, t tVar) {
        this.f16421a = context;
        this.f16422b = tVar;
    }

    public static q a(TypedValue typedValue, q qVar, q qVar2, String str, String str2) throws XmlPullParserException {
        if (qVar == null || qVar == qVar2) {
            return qVar != null ? qVar : qVar2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    public final k b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i9) throws XmlPullParserException, IOException {
        int depth;
        k kVarA = this.f16422b.e(xmlResourceParser.getName()).a();
        kVarA.p(this.f16421a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    g(resources, kVarA, attributeSet, i9);
                } else if ("deepLink".equals(name)) {
                    h(resources, kVarA, attributeSet);
                } else if ("action".equals(name)) {
                    d(resources, kVarA, attributeSet, xmlResourceParser, i9);
                } else if ("include".equals(name) && (kVarA instanceof l)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, v.f16474r);
                    ((l) kVarA).z(c(typedArrayObtainAttributes.getResourceId(v.f16475s, 0)));
                    typedArrayObtainAttributes.recycle();
                } else if (kVarA instanceof l) {
                    ((l) kVarA).z(b(resources, xmlResourceParser, attributeSet, i9));
                }
            }
        }
        return kVarA;
    }

    public l c(int i9) {
        int next;
        Resources resources = this.f16421a.getResources();
        XmlResourceParser xml = resources.getXml(i9);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e9) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i9) + " line " + xml.getLineNumber(), e9);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        k kVarB = b(resources, xml, attributeSetAsAttributeSet, i9);
        if (kVarB instanceof l) {
            return (l) kVarB;
        }
        throw new IllegalArgumentException("Root element <" + name + "> did not inflate into a NavGraph");
    }

    public final void d(Resources resources, k kVar, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i9) throws XmlPullParserException, IOException {
        int depth;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC2900a.f51565f);
        int resourceId = typedArrayObtainAttributes.getResourceId(AbstractC2900a.f51566g, 0);
        c cVar = new c(typedArrayObtainAttributes.getResourceId(AbstractC2900a.f51567h, 0));
        p.a aVar = new p.a();
        aVar.d(typedArrayObtainAttributes.getBoolean(AbstractC2900a.f51570k, false));
        aVar.g(typedArrayObtainAttributes.getResourceId(AbstractC2900a.f51573n, -1), typedArrayObtainAttributes.getBoolean(AbstractC2900a.f51574o, false));
        aVar.b(typedArrayObtainAttributes.getResourceId(AbstractC2900a.f51568i, -1));
        aVar.c(typedArrayObtainAttributes.getResourceId(AbstractC2900a.f51569j, -1));
        aVar.e(typedArrayObtainAttributes.getResourceId(AbstractC2900a.f51571l, -1));
        aVar.f(typedArrayObtainAttributes.getResourceId(AbstractC2900a.f51572m, -1));
        cVar.e(aVar.a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && "argument".equals(xmlResourceParser.getName())) {
                f(resources, bundle, attributeSet, i9);
            }
        }
        if (!bundle.isEmpty()) {
            cVar.d(bundle);
        }
        kVar.q(resourceId, cVar);
        typedArrayObtainAttributes.recycle();
    }

    public final d e(TypedArray typedArray, Resources resources, int i9) throws XmlPullParserException {
        float f9;
        int dimension;
        d.a aVar = new d.a();
        aVar.c(typedArray.getBoolean(AbstractC2900a.f51579t, false));
        ThreadLocal threadLocal = f16420c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(AbstractC2900a.f51578s);
        Object objK = null;
        q qVarA = string != null ? q.a(string, resources.getResourcePackageName(i9)) : null;
        if (typedArray.getValue(AbstractC2900a.f51577r, typedValue)) {
            q qVar = q.f16438c;
            if (qVarA == qVar) {
                dimension = typedValue.resourceId;
                if (dimension != 0) {
                    objK = Integer.valueOf(dimension);
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + qVarA.c() + ". Must be a reference to a resource.");
                    }
                    objK = 0;
                }
            } else {
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    if (qVarA != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + qVarA.c() + ". You must use a \"" + qVar.c() + "\" type to reference other resources.");
                    }
                    qVarA = qVar;
                    objK = Integer.valueOf(i10);
                } else if (qVarA == q.f16446k) {
                    objK = typedArray.getString(AbstractC2900a.f51577r);
                } else {
                    int i11 = typedValue.type;
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                qVarA = a(typedValue, qVarA, q.f16437b, string, "dimension");
                                dimension = (int) typedValue.getDimension(resources.getDisplayMetrics());
                            } else if (i11 == 18) {
                                qVarA = a(typedValue, qVarA, q.f16444i, string, "boolean");
                                objK = Boolean.valueOf(typedValue.data != 0);
                            } else {
                                if (i11 < 16 || i11 > 31) {
                                    throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                                }
                                q qVar2 = q.f16442g;
                                if (qVarA == qVar2) {
                                    qVarA = a(typedValue, qVarA, qVar2, string, "float");
                                    f9 = typedValue.data;
                                } else {
                                    qVarA = a(typedValue, qVarA, q.f16437b, string, "integer");
                                    dimension = typedValue.data;
                                }
                            }
                            objK = Integer.valueOf(dimension);
                        } else {
                            qVarA = a(typedValue, qVarA, q.f16442g, string, "float");
                            f9 = typedValue.getFloat();
                        }
                        objK = Float.valueOf(f9);
                    } else {
                        String string2 = typedValue.string.toString();
                        if (qVarA == null) {
                            qVarA = q.d(string2);
                        }
                        objK = qVarA.k(string2);
                    }
                }
            }
        }
        if (objK != null) {
            aVar.b(objK);
        }
        if (qVarA != null) {
            aVar.d(qVarA);
        }
        return aVar.a();
    }

    public final void f(Resources resources, Bundle bundle, AttributeSet attributeSet, int i9) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC2900a.f51575p);
        String string = typedArrayObtainAttributes.getString(AbstractC2900a.f51576q);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        d dVarE = e(typedArrayObtainAttributes, resources, i9);
        if (dVarE.b()) {
            dVarE.c(string, bundle);
        }
        typedArrayObtainAttributes.recycle();
    }

    public final void g(Resources resources, k kVar, AttributeSet attributeSet, int i9) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC2900a.f51575p);
        String string = typedArrayObtainAttributes.getString(AbstractC2900a.f51576q);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        kVar.a(string, e(typedArrayObtainAttributes, resources, i9));
        typedArrayObtainAttributes.recycle();
    }

    public final void h(Resources resources, k kVar, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC2900a.f51580u);
        String string = typedArrayObtainAttributes.getString(AbstractC2900a.f51583x);
        String string2 = typedArrayObtainAttributes.getString(AbstractC2900a.f51581v);
        String string3 = typedArrayObtainAttributes.getString(AbstractC2900a.f51582w);
        if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        h.a aVar = new h.a();
        if (string != null) {
            aVar.d(string.replace("${applicationId}", this.f16421a.getPackageName()));
        }
        if (!TextUtils.isEmpty(string2)) {
            aVar.b(string2.replace("${applicationId}", this.f16421a.getPackageName()));
        }
        if (string3 != null) {
            aVar.c(string3.replace("${applicationId}", this.f16421a.getPackageName()));
        }
        kVar.b(aVar.a());
        typedArrayObtainAttributes.recycle();
    }
}
