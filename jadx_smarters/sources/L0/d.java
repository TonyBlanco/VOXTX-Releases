package L0;

import F.k;
import G.e;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    public static class a implements TypeEvaluator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e.b[] f3898a;

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e.b[] evaluate(float f9, e.b[] bVarArr, e.b[] bVarArr2) {
            if (!G.e.b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!G.e.b(this.f3898a, bVarArr)) {
                this.f3898a = G.e.f(bVarArr);
            }
            for (int i9 = 0; i9 < bVarArr.length; i9++) {
                this.f3898a[i9].d(bVarArr[i9], bVarArr2[i9], f9);
            }
            return this.f3898a;
        }
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f9) {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        if (r23 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        if (r13 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
    
        if (r2.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fd, code lost:
    
        if (r24 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
    
        r23.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        r23.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0106, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.d.b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Keyframe c(Keyframe keyframe, float f9) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f9) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f9) : Keyframe.ofObject(f9);
    }

    public static void d(Keyframe[] keyframeArr, float f9, int i9, int i10) {
        float f10 = f9 / ((i10 - i9) + 2);
        while (i9 <= i10) {
            keyframeArr[i9].setFraction(keyframeArr[i9 - 1].getFraction() + f10);
            i9++;
        }
    }

    public static PropertyValuesHolder e(TypedArray typedArray, int i9, int i10, int i11, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        boolean z9 = typedValuePeekValue != null;
        int i12 = z9 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i11);
        boolean z10 = typedValuePeekValue2 != null;
        int i13 = z10 ? typedValuePeekValue2.type : 0;
        if (i9 == 4) {
            i9 = ((z9 && h(i12)) || (z10 && h(i13))) ? 3 : 0;
        }
        boolean z11 = i9 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i9 != 2) {
            e eVarA = i9 == 3 ? e.a() : null;
            if (z11) {
                if (z9) {
                    float dimension = i12 == 5 ? typedArray.getDimension(i10, 0.0f) : typedArray.getFloat(i10, 0.0f);
                    if (z10) {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f));
                    } else {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f));
                }
                propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
            } else if (z9) {
                int dimension2 = i12 == 5 ? (int) typedArray.getDimension(i10, 0.0f) : h(i12) ? typedArray.getColor(i10, 0) : typedArray.getInt(i10, 0);
                if (z10) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : h(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0));
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z10) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : h(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0));
            }
            if (propertyValuesHolderOfInt == null || eVarA == null) {
                return propertyValuesHolderOfInt;
            }
            propertyValuesHolderOfInt.setEvaluator(eVarA);
            return propertyValuesHolderOfInt;
        }
        String string = typedArray.getString(i10);
        String string2 = typedArray.getString(i11);
        e.b[] bVarArrD = G.e.d(string);
        e.b[] bVarArrD2 = G.e.d(string2);
        if (bVarArrD == null && bVarArrD2 == null) {
            return null;
        }
        if (bVarArrD == null) {
            if (bVarArrD2 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), bVarArrD2);
            }
            return null;
        }
        a aVar = new a();
        if (bVarArrD2 == null) {
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, bVarArrD);
        } else {
            if (!G.e.b(bVarArrD, bVarArrD2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, bVarArrD, bVarArrD2);
        }
        return propertyValuesHolderOfObject;
    }

    public static int f(TypedArray typedArray, int i9, int i10) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i9);
        boolean z9 = typedValuePeekValue != null;
        int i11 = z9 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i10);
        boolean z10 = typedValuePeekValue2 != null;
        return ((z9 && h(i11)) || (z10 && h(z10 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
    }

    public static int g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayS = k.s(resources, theme, attributeSet, L0.a.f3882j);
        int i9 = 0;
        TypedValue typedValueT = k.t(typedArrayS, xmlPullParser, "value", 0);
        if (typedValueT != null && h(typedValueT.type)) {
            i9 = 3;
        }
        typedArrayS.recycle();
        return i9;
    }

    public static boolean h(int i9) {
        return i9 >= 28 && i9 <= 31;
    }

    public static Animator i(Context context, int i9) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i9) : j(context, context.getResources(), context.getTheme(), i9);
    }

    public static Animator j(Context context, Resources resources, Resources.Theme theme, int i9) {
        return k(context, resources, theme, i9, 1.0f);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, int i9, float f9) {
        XmlResourceParser animation = null;
        try {
            try {
                try {
                    animation = resources.getAnimation(i9);
                    return a(context, resources, theme, animation, f9);
                } catch (IOException e9) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i9));
                    notFoundException.initCause(e9);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e10) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i9));
                notFoundException2.initCause(e10);
                throw notFoundException2;
            }
        } finally {
            if (animation != null) {
                animation.close();
            }
        }
    }

    public static ValueAnimator l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f9, XmlPullParser xmlPullParser) {
        TypedArray typedArrayS = k.s(resources, theme, attributeSet, L0.a.f3879g);
        TypedArray typedArrayS2 = k.s(resources, theme, attributeSet, L0.a.f3883k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        q(valueAnimator, typedArrayS, typedArrayS2, f9, xmlPullParser);
        int iL = k.l(typedArrayS, xmlPullParser, "interpolator", 0, 0);
        if (iL > 0) {
            valueAnimator.setInterpolator(c.a(context, iL));
        }
        typedArrayS.recycle();
        if (typedArrayS2 != null) {
            typedArrayS2.recycle();
        }
        return valueAnimator;
    }

    public static Keyframe m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i9, XmlPullParser xmlPullParser) {
        TypedArray typedArrayS = k.s(resources, theme, attributeSet, L0.a.f3882j);
        float fJ = k.j(typedArrayS, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue typedValueT = k.t(typedArrayS, xmlPullParser, "value", 0);
        boolean z9 = typedValueT != null;
        if (i9 == 4) {
            i9 = (z9 && h(typedValueT.type)) ? 3 : 0;
        }
        Keyframe keyframeOfInt = z9 ? i9 != 0 ? (i9 == 1 || i9 == 3) ? Keyframe.ofInt(fJ, k.k(typedArrayS, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(fJ, k.j(typedArrayS, xmlPullParser, "value", 0, 0.0f)) : i9 == 0 ? Keyframe.ofFloat(fJ) : Keyframe.ofInt(fJ);
        int iL = k.l(typedArrayS, xmlPullParser, "interpolator", 1, 0);
        if (iL > 0) {
            keyframeOfInt.setInterpolator(c.a(context, iL));
        }
        typedArrayS.recycle();
        return keyframeOfInt;
    }

    public static ObjectAnimator n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f9, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        l(context, resources, theme, attributeSet, objectAnimator, f9, xmlPullParser);
        return objectAnimator;
    }

    public static PropertyValuesHolder o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i9) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolderOfKeyframe = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i9 == 4) {
                    i9 = g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe keyframeM = m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i9, xmlPullParser);
                if (keyframeM != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(keyframeM);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i10 = 0; i10 < size; i10++) {
                Keyframe keyframe3 = keyframeArr[i10];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i10 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i11 = size - 1;
                        if (i10 == i11) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i12 = i10;
                            for (int i13 = i10 + 1; i13 < i11 && keyframeArr[i13].getFraction() < 0.0f; i13++) {
                                i12 = i13;
                            }
                            d(keyframeArr, keyframeArr[i12 + 1].getFraction() - keyframeArr[i10 - 1].getFraction(), i10, i12);
                        }
                    }
                }
            }
            propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i9 == 3) {
                propertyValuesHolderOfKeyframe.setEvaluator(e.a());
            }
        }
        return propertyValuesHolderOfKeyframe;
    }

    public static PropertyValuesHolder[] p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i9;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("propertyValuesHolder")) {
                TypedArray typedArrayS = k.s(resources, theme, attributeSet, L0.a.f3881i);
                String strM = k.m(typedArrayS, xmlPullParser, "propertyName", 3);
                int iK = k.k(typedArrayS, xmlPullParser, "valueType", 2, 4);
                PropertyValuesHolder propertyValuesHolderO = o(context, resources, theme, xmlPullParser, strM, iK);
                if (propertyValuesHolderO == null) {
                    propertyValuesHolderO = e(typedArrayS, iK, 0, 1, strM);
                }
                if (propertyValuesHolderO != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(propertyValuesHolderO);
                }
                typedArrayS.recycle();
            }
            xmlPullParser.next();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i9 = 0; i9 < size; i9++) {
                propertyValuesHolderArr[i9] = (PropertyValuesHolder) arrayList.get(i9);
            }
        }
        return propertyValuesHolderArr;
    }

    public static void q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f9, XmlPullParser xmlPullParser) {
        long jK = k.k(typedArray, xmlPullParser, "duration", 1, 300);
        long jK2 = k.k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int iK = k.k(typedArray, xmlPullParser, "valueType", 7, 4);
        if (k.r(xmlPullParser, "valueFrom") && k.r(xmlPullParser, "valueTo")) {
            if (iK == 4) {
                iK = f(typedArray, 5, 6);
            }
            PropertyValuesHolder propertyValuesHolderE = e(typedArray, iK, 5, 6, "");
            if (propertyValuesHolderE != null) {
                valueAnimator.setValues(propertyValuesHolderE);
            }
        }
        valueAnimator.setDuration(jK);
        valueAnimator.setStartDelay(jK2);
        valueAnimator.setRepeatCount(k.k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(k.k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            r(valueAnimator, typedArray2, iK, f9, xmlPullParser);
        }
    }

    public static void r(ValueAnimator valueAnimator, TypedArray typedArray, int i9, float f9, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String strM = k.m(typedArray, xmlPullParser, "pathData", 1);
        if (strM == null) {
            objectAnimator.setPropertyName(k.m(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String strM2 = k.m(typedArray, xmlPullParser, "propertyXName", 2);
        String strM3 = k.m(typedArray, xmlPullParser, "propertyYName", 3);
        if (i9 != 2) {
        }
        if (strM2 != null || strM3 != null) {
            s(G.e.e(strM), objectAnimator, f9 * 0.5f, strM2, strM3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    public static void s(Path path, ObjectAnimator objectAnimator, float f9, String str, String str2) {
        int i9 = 1;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f10 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float length = 0.0f;
        do {
            length += pathMeasure.getLength();
            arrayList.add(Float.valueOf(length));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int iMin = Math.min(100, ((int) (length / f9)) + 1);
        float[] fArr = new float[iMin];
        float[] fArr2 = new float[iMin];
        float[] fArr3 = new float[2];
        float f11 = length / (iMin - 1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iMin) {
                break;
            }
            pathMeasure2.getPosTan(f10 - ((Float) arrayList.get(i11)).floatValue(), fArr3, null);
            fArr[i10] = fArr3[0];
            fArr2[i10] = fArr3[1];
            f10 += f11;
            int i12 = i11 + 1;
            if (i12 < arrayList.size() && f10 > ((Float) arrayList.get(i12)).floatValue()) {
                pathMeasure2.nextContour();
                i11 = i12;
            }
            i9 = 1;
            i10++;
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (propertyValuesHolderOfFloat == null) {
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[i9];
            propertyValuesHolderArr[0] = propertyValuesHolderOfFloat2;
            objectAnimator.setValues(propertyValuesHolderArr);
        } else if (propertyValuesHolderOfFloat2 == null) {
            PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[i9];
            propertyValuesHolderArr2[0] = propertyValuesHolderOfFloat;
            objectAnimator.setValues(propertyValuesHolderArr2);
        } else {
            PropertyValuesHolder[] propertyValuesHolderArr3 = new PropertyValuesHolder[2];
            propertyValuesHolderArr3[0] = propertyValuesHolderOfFloat;
            propertyValuesHolderArr3[i9] = propertyValuesHolderOfFloat2;
            objectAnimator.setValues(propertyValuesHolderArr3);
        }
    }
}
