package F;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f1769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f1770b;

        public a(int i9, int i10) {
            this.f1769a = new int[]{i9, i10};
            this.f1770b = new float[]{0.0f, 1.0f};
        }

        public a(int i9, int i10, int i11) {
            this.f1769a = new int[]{i9, i10, i11};
            this.f1770b = new float[]{0.0f, 0.5f, 1.0f};
        }

        public a(List list, List list2) {
            int size = list.size();
            this.f1769a = new int[size];
            this.f1770b = new float[size];
            for (int i9 = 0; i9 < size; i9++) {
                this.f1769a[i9] = ((Integer) list.get(i9)).intValue();
                this.f1770b[i9] = ((Float) list2.get(i9)).floatValue();
            }
        }
    }

    public static a a(a aVar, int i9, int i10, boolean z9, int i11) {
        return aVar != null ? aVar : z9 ? new a(i9, i11, i10) : new a(i9, i10);
    }

    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayS = k.s(resources, theme, attributeSet, C.d.f826A);
        float fJ = k.j(typedArrayS, xmlPullParser, "startX", C.d.f835J, 0.0f);
        float fJ2 = k.j(typedArrayS, xmlPullParser, "startY", C.d.f836K, 0.0f);
        float fJ3 = k.j(typedArrayS, xmlPullParser, "endX", C.d.f837L, 0.0f);
        float fJ4 = k.j(typedArrayS, xmlPullParser, "endY", C.d.f838M, 0.0f);
        float fJ5 = k.j(typedArrayS, xmlPullParser, "centerX", C.d.f830E, 0.0f);
        float fJ6 = k.j(typedArrayS, xmlPullParser, "centerY", C.d.f831F, 0.0f);
        int iK = k.k(typedArrayS, xmlPullParser, "type", C.d.f829D, 0);
        int iF = k.f(typedArrayS, xmlPullParser, "startColor", C.d.f827B, 0);
        boolean zR = k.r(xmlPullParser, "centerColor");
        int iF2 = k.f(typedArrayS, xmlPullParser, "centerColor", C.d.f834I, 0);
        int iF3 = k.f(typedArrayS, xmlPullParser, "endColor", C.d.f828C, 0);
        int iK2 = k.k(typedArrayS, xmlPullParser, "tileMode", C.d.f833H, 0);
        float fJ7 = k.j(typedArrayS, xmlPullParser, "gradientRadius", C.d.f832G, 0.0f);
        typedArrayS.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iF, iF3, zR, iF2);
        if (iK != 1) {
            return iK != 2 ? new LinearGradient(fJ, fJ2, fJ3, fJ4, aVarA.f1769a, aVarA.f1770b, d(iK2)) : new SweepGradient(fJ5, fJ6, aVarA.f1769a, aVarA.f1770b);
        }
        if (fJ7 > 0.0f) {
            return new RadialGradient(fJ5, fJ6, fJ7, aVarA.f1769a, aVarA.f1770b, d(iK2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        return new F.f.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static F.f.a c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = C.d.f839N
            android.content.res.TypedArray r3 = F.k.s(r8, r11, r10, r3)
            int r5 = C.d.f840O
            boolean r5 = r3.hasValue(r5)
            int r6 = C.d.f841P
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = C.d.f840O
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = C.d.f841P
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            F.f$a r8 = new F.f$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: F.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):F.f$a");
    }

    public static Shader.TileMode d(int i9) {
        return i9 != 1 ? i9 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
