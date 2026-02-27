package S4;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import s.i;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f9419a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f9420b = new i();

    public static void a(f fVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            fVar.g(objectAnimator.getPropertyName(), objectAnimator.getValues());
            fVar.h(objectAnimator.getPropertyName(), g.b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    public static f b(Context context, TypedArray typedArray, int i9) {
        int resourceId;
        if (!typedArray.hasValue(i9) || (resourceId = typedArray.getResourceId(i9, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static f c(Context context, int i9) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i9);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return d(arrayList);
        } catch (Exception e9) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i9), e9);
            return null;
        }
    }

    public static f d(List list) {
        f fVar = new f();
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            a(fVar, (Animator) list.get(i9));
        }
        return fVar;
    }

    public g e(String str) {
        if (f(str)) {
            return (g) this.f9419a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return this.f9419a.equals(((f) obj).f9419a);
        }
        return false;
    }

    public boolean f(String str) {
        return this.f9419a.get(str) != null;
    }

    public void g(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f9420b.put(str, propertyValuesHolderArr);
    }

    public void h(String str, g gVar) {
        this.f9419a.put(str, gVar);
    }

    public int hashCode() {
        return this.f9419a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f9419a + "}\n";
    }
}
