package v2;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Log;
import android.util.Property;
import android.view.animation.Interpolator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import w2.InterpolatorC2904b;
import x2.f;

/* JADX INFO: renamed from: v2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2873d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f51276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Interpolator f51277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51278c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f51279d = 2000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51280e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f51281f = new HashMap();

    /* JADX INFO: renamed from: v2.d$a */
    public class a extends b {
        public a(float[] fArr, Property property, Float[] fArr2) {
            super(fArr, property, fArr2);
        }
    }

    /* JADX INFO: renamed from: v2.d$b */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float[] f51283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Property f51284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object[] f51285c;

        public b(float[] fArr, Property property, Object[] objArr) {
            this.f51283a = fArr;
            this.f51284b = property;
            this.f51285c = objArr;
        }
    }

    /* JADX INFO: renamed from: v2.d$c */
    public class c extends b {
        public c(float[] fArr, Property property, Integer[] numArr) {
            super(fArr, property, numArr);
        }
    }

    public C2873d(f fVar) {
        this.f51276a = fVar;
    }

    public C2873d a(float[] fArr, Integer... numArr) {
        g(fArr, f.f51886E, numArr);
        return this;
    }

    public ObjectAnimator b() {
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[this.f51281f.size()];
        Iterator it = this.f51281f.entrySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            b bVar = (b) ((Map.Entry) it.next()).getValue();
            float[] fArr = bVar.f51283a;
            Keyframe[] keyframeArr = new Keyframe[fArr.length];
            int i10 = this.f51280e;
            float f9 = fArr[i10];
            while (true) {
                int i11 = this.f51280e;
                Object[] objArr = bVar.f51285c;
                if (i10 < objArr.length + i11) {
                    int i12 = i10 - i11;
                    int length = i10 % objArr.length;
                    float f10 = fArr[length] - f9;
                    if (f10 < 0.0f) {
                        f10 += fArr[fArr.length - 1];
                    }
                    if (bVar instanceof c) {
                        keyframeArr[i12] = Keyframe.ofInt(f10, ((Integer) objArr[length]).intValue());
                    } else if (bVar instanceof a) {
                        keyframeArr[i12] = Keyframe.ofFloat(f10, ((Float) objArr[length]).floatValue());
                    } else {
                        keyframeArr[i12] = Keyframe.ofObject(f10, objArr[length]);
                    }
                    i10++;
                }
            }
            propertyValuesHolderArr[i9] = PropertyValuesHolder.ofKeyframe(bVar.f51284b, keyframeArr);
            i9++;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f51276a, propertyValuesHolderArr);
        objectAnimatorOfPropertyValuesHolder.setDuration(this.f51279d);
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(this.f51278c);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(this.f51277b);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public C2873d c(long j9) {
        this.f51279d = j9;
        return this;
    }

    public C2873d d(float... fArr) {
        h(InterpolatorC2904b.a(fArr));
        return this;
    }

    public final void e(int i9, int i10) {
        if (i9 != i10) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(i9), Integer.valueOf(i10)));
        }
    }

    public final void f(float[] fArr, Property property, Float[] fArr2) {
        e(fArr.length, fArr2.length);
        this.f51281f.put(property.getName(), new a(fArr, property, fArr2));
    }

    public final void g(float[] fArr, Property property, Integer[] numArr) {
        e(fArr.length, numArr.length);
        this.f51281f.put(property.getName(), new c(fArr, property, numArr));
    }

    public C2873d h(Interpolator interpolator) {
        this.f51277b = interpolator;
        return this;
    }

    public C2873d i(float[] fArr, Integer... numArr) {
        g(fArr, f.f51889v, numArr);
        return this;
    }

    public C2873d j(float[] fArr, Integer... numArr) {
        g(fArr, f.f51888u, numArr);
        return this;
    }

    public C2873d k(float[] fArr, Integer... numArr) {
        g(fArr, f.f51890w, numArr);
        return this;
    }

    public C2873d l(float[] fArr, Float... fArr2) {
        f(fArr, f.f51885D, fArr2);
        return this;
    }

    public C2873d m(float[] fArr, Float... fArr2) {
        f(fArr, f.f51884C, fArr2);
        return this;
    }

    public C2873d n(int i9) {
        if (i9 < 0) {
            Log.w("SpriteAnimatorBuilder", "startFrame should always be non-negative");
            i9 = 0;
        }
        this.f51280e = i9;
        return this;
    }

    public C2873d o(float[] fArr, Float... fArr2) {
        f(fArr, f.f51893z, fArr2);
        return this;
    }

    public C2873d p(float[] fArr, Float... fArr2) {
        f(fArr, f.f51882A, fArr2);
        return this;
    }
}
