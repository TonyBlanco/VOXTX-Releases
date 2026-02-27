package K0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: renamed from: K0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0672c extends AbstractC0681l {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final String[] f3446M = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final Property f3447N = new b(PointF.class, "boundsOrigin");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Property f3448O = new C0054c(PointF.class, "topLeft");

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final Property f3449P = new d(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final Property f3450Q = new e(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final Property f3451R = new f(PointF.class, "topLeft");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final Property f3452S = new g(PointF.class, "position");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static C0679j f3453T = new C0679j();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int[] f3454J = new int[2];

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f3455K = false;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f3456L = false;

    /* JADX INFO: renamed from: K0.c$a */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3457a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ BitmapDrawable f3458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f3459d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f3460e;

        public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f9) {
            this.f3457a = viewGroup;
            this.f3458c = bitmapDrawable;
            this.f3459d = view;
            this.f3460e = f9;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            A.b(this.f3457a).b(this.f3458c);
            A.g(this.f3459d, this.f3460e);
        }
    }

    /* JADX INFO: renamed from: K0.c$b */
    public class b extends Property {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f3462a;

        public b(Class cls, String str) {
            super(cls, str);
            this.f3462a = new Rect();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f3462a);
            Rect rect = this.f3462a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f3462a);
            this.f3462a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f3462a);
        }
    }

    /* JADX INFO: renamed from: K0.c$c, reason: collision with other inner class name */
    public class C0054c extends Property {
        public C0054c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* JADX INFO: renamed from: K0.c$d */
    public class d extends Property {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* JADX INFO: renamed from: K0.c$e */
    public class e extends Property {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            A.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: K0.c$f */
    public class f extends Property {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            A.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: K0.c$g */
    public class g extends Property {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            A.f(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: K0.c$h */
    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f3463a;
        private k mViewBounds;

        public h(k kVar) {
            this.f3463a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* JADX INFO: renamed from: K0.c$i */
    public class i extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3465a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f3466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Rect f3467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f3468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f3469f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f3470g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f3471h;

        public i(View view, Rect rect, int i9, int i10, int i11, int i12) {
            this.f3466c = view;
            this.f3467d = rect;
            this.f3468e = i9;
            this.f3469f = i10;
            this.f3470g = i11;
            this.f3471h = i12;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3465a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3465a) {
                return;
            }
            P.L.z0(this.f3466c, this.f3467d);
            A.f(this.f3466c, this.f3468e, this.f3469f, this.f3470g, this.f3471h);
        }
    }

    /* JADX INFO: renamed from: K0.c$j */
    public class j extends AbstractC0682m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3473a = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3474c;

        public j(ViewGroup viewGroup) {
            this.f3474c = viewGroup;
        }

        @Override // K0.AbstractC0682m, K0.AbstractC0681l.f
        public void b(AbstractC0681l abstractC0681l) {
            x.c(this.f3474c, false);
        }

        @Override // K0.AbstractC0681l.f
        public void c(AbstractC0681l abstractC0681l) {
            if (!this.f3473a) {
                x.c(this.f3474c, false);
            }
            abstractC0681l.Q(this);
        }

        @Override // K0.AbstractC0682m, K0.AbstractC0681l.f
        public void d(AbstractC0681l abstractC0681l) {
            x.c(this.f3474c, false);
            this.f3473a = true;
        }

        @Override // K0.AbstractC0682m, K0.AbstractC0681l.f
        public void e(AbstractC0681l abstractC0681l) {
            x.c(this.f3474c, true);
        }
    }

    /* JADX INFO: renamed from: K0.c$k */
    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f3480e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3481f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f3482g;

        public k(View view) {
            this.f3480e = view;
        }

        public void a(PointF pointF) {
            this.f3478c = Math.round(pointF.x);
            this.f3479d = Math.round(pointF.y);
            int i9 = this.f3482g + 1;
            this.f3482g = i9;
            if (this.f3481f == i9) {
                b();
            }
        }

        public final void b() {
            A.f(this.f3480e, this.f3476a, this.f3477b, this.f3478c, this.f3479d);
            this.f3481f = 0;
            this.f3482g = 0;
        }

        public void c(PointF pointF) {
            this.f3476a = Math.round(pointF.x);
            this.f3477b = Math.round(pointF.y);
            int i9 = this.f3481f + 1;
            this.f3481f = i9;
            if (i9 == this.f3482g) {
                b();
            }
        }
    }

    @Override // K0.AbstractC0681l
    public String[] E() {
        return f3446M;
    }

    public final void d0(s sVar) {
        View view = sVar.f3569b;
        if (!P.L.W(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        sVar.f3568a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        sVar.f3568a.put("android:changeBounds:parent", sVar.f3569b.getParent());
        if (this.f3456L) {
            sVar.f3569b.getLocationInWindow(this.f3454J);
            sVar.f3568a.put("android:changeBounds:windowX", Integer.valueOf(this.f3454J[0]));
            sVar.f3568a.put("android:changeBounds:windowY", Integer.valueOf(this.f3454J[1]));
        }
        if (this.f3455K) {
            sVar.f3568a.put("android:changeBounds:clip", P.L.w(view));
        }
    }

    public final boolean e0(View view, View view2) {
        if (!this.f3456L) {
            return true;
        }
        s sVarU = u(view, true);
        if (sVarU == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == sVarU.f3569b) {
            return true;
        }
        return false;
    }

    @Override // K0.AbstractC0681l
    public void g(s sVar) {
        d0(sVar);
    }

    @Override // K0.AbstractC0681l
    public void j(s sVar) {
        d0(sVar);
    }

    @Override // K0.AbstractC0681l
    public Animator n(ViewGroup viewGroup, s sVar, s sVar2) {
        int i9;
        View view;
        int i10;
        ObjectAnimator objectAnimator;
        Animator animatorC;
        Path pathA;
        Property property;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map map = sVar.f3568a;
        Map map2 = sVar2.f3568a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f3569b;
        if (!e0(viewGroup2, viewGroup3)) {
            int iIntValue = ((Integer) sVar.f3568a.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) sVar.f3568a.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) sVar2.f3568a.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) sVar2.f3568a.get("android:changeBounds:windowY")).intValue();
            if (iIntValue == iIntValue3 && iIntValue2 == iIntValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f3454J);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(bitmapCreateBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            float fC = A.c(view2);
            A.g(view2, 0.0f);
            A.b(viewGroup).a(bitmapDrawable);
            AbstractC0676g abstractC0676gW = w();
            int[] iArr = this.f3454J;
            int i11 = iArr[0];
            int i12 = iArr[1];
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, AbstractC0677h.a(f3447N, abstractC0676gW.a(iIntValue - i11, iIntValue2 - i12, iIntValue3 - i11, iIntValue4 - i12)));
            objectAnimatorOfPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, fC));
            return objectAnimatorOfPropertyValuesHolder;
        }
        Rect rect = (Rect) sVar.f3568a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) sVar2.f3568a.get("android:changeBounds:bounds");
        int i13 = rect.left;
        int i14 = rect2.left;
        int i15 = rect.top;
        int i16 = rect2.top;
        int i17 = rect.right;
        int i18 = rect2.right;
        int i19 = rect.bottom;
        int i20 = rect2.bottom;
        int i21 = i17 - i13;
        int i22 = i19 - i15;
        int i23 = i18 - i14;
        int i24 = i20 - i16;
        Rect rect3 = (Rect) sVar.f3568a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) sVar2.f3568a.get("android:changeBounds:clip");
        if ((i21 == 0 || i22 == 0) && (i23 == 0 || i24 == 0)) {
            i9 = 0;
        } else {
            i9 = (i13 == i14 && i15 == i16) ? 0 : 1;
            if (i17 != i18 || i19 != i20) {
                i9++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i9++;
        }
        if (i9 <= 0) {
            return null;
        }
        if (this.f3455K) {
            view = view2;
            A.f(view, i13, i15, Math.max(i21, i23) + i13, Math.max(i22, i24) + i15);
            ObjectAnimator objectAnimatorA = (i13 == i14 && i15 == i16) ? null : AbstractC0675f.a(view, f3452S, w().a(i13, i15, i14, i16));
            if (rect3 == null) {
                i10 = 0;
                rect3 = new Rect(0, 0, i21, i22);
            } else {
                i10 = 0;
            }
            Rect rect5 = rect4 == null ? new Rect(i10, i10, i23, i24) : rect4;
            if (rect3.equals(rect5)) {
                objectAnimator = null;
            } else {
                P.L.z0(view, rect3);
                C0679j c0679j = f3453T;
                Object[] objArr = new Object[2];
                objArr[i10] = rect3;
                objArr[1] = rect5;
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", c0679j, objArr);
                objectAnimatorOfObject.addListener(new i(view, rect4, i14, i16, i18, i20));
                objectAnimator = objectAnimatorOfObject;
            }
            animatorC = r.c(objectAnimatorA, objectAnimator);
        } else {
            view = view2;
            A.f(view, i13, i15, i17, i19);
            if (i9 == 2) {
                if (i21 == i23 && i22 == i24) {
                    pathA = w().a(i13, i15, i14, i16);
                    property = f3452S;
                } else {
                    k kVar = new k(view);
                    ObjectAnimator objectAnimatorA2 = AbstractC0675f.a(kVar, f3448O, w().a(i13, i15, i14, i16));
                    ObjectAnimator objectAnimatorA3 = AbstractC0675f.a(kVar, f3449P, w().a(i17, i19, i18, i20));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                    animatorSet.addListener(new h(kVar));
                    animatorC = animatorSet;
                }
            } else if (i13 == i14 && i15 == i16) {
                pathA = w().a(i17, i19, i18, i20);
                property = f3450Q;
            } else {
                pathA = w().a(i13, i15, i14, i16);
                property = f3451R;
            }
            animatorC = AbstractC0675f.a(view, property, pathA);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            x.c(viewGroup4, true);
            b(new j(viewGroup4));
        }
        return animatorC;
    }
}
