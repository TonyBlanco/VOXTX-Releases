package f;

import F.k;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import f.AbstractC1751b;
import f.AbstractC1754e;
import g.AbstractC1792b;
import g.AbstractC1793c;
import g.AbstractC1795e;
import java.io.IOException;
import k.V;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s.C2700f;
import s.j;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: f.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1750a extends AbstractC1754e implements H.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f40469p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g f40470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f40471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f40472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f40473t;

    /* JADX INFO: renamed from: f.a$b */
    public static class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animatable f40474a;

        public b(Animatable animatable) {
            super();
            this.f40474a = animatable;
        }

        @Override // f.C1750a.g
        public void c() {
            this.f40474a.start();
        }

        @Override // f.C1750a.g
        public void d() {
            this.f40474a.stop();
        }
    }

    /* JADX INFO: renamed from: f.a$c */
    public static class c extends AbstractC1754e.a {

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public C2700f f40475K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public j f40476L;

        public c(c cVar, C1750a c1750a, Resources resources) {
            j jVar;
            super(cVar, c1750a, resources);
            if (cVar != null) {
                this.f40475K = cVar.f40475K;
                jVar = cVar.f40476L;
            } else {
                this.f40475K = new C2700f();
                jVar = new j();
            }
            this.f40476L = jVar;
        }

        public static long D(int i9, int i10) {
            return ((long) i10) | (((long) i9) << 32);
        }

        public int B(int[] iArr, Drawable drawable, int i9) {
            int iZ = super.z(iArr, drawable);
            this.f40476L.k(iZ, Integer.valueOf(i9));
            return iZ;
        }

        public int C(int i9, int i10, Drawable drawable, boolean z9) {
            int iA = super.a(drawable);
            long jD = D(i9, i10);
            long j9 = z9 ? IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT : 0L;
            long j10 = iA;
            this.f40475K.b(jD, Long.valueOf(j10 | j9));
            if (z9) {
                this.f40475K.b(D(i10, i9), Long.valueOf(IjkMediaMeta.AV_CH_WIDE_RIGHT | j10 | j9));
            }
            return iA;
        }

        public int E(int i9) {
            if (i9 < 0) {
                return 0;
            }
            return ((Integer) this.f40476L.h(i9, 0)).intValue();
        }

        public int F(int[] iArr) {
            int iA = super.A(iArr);
            return iA >= 0 ? iA : super.A(StateSet.WILD_CARD);
        }

        public int G(int i9, int i10) {
            return (int) ((Long) this.f40475K.h(D(i9, i10), -1L)).longValue();
        }

        public boolean H(int i9, int i10) {
            return (((Long) this.f40475K.h(D(i9, i10), -1L)).longValue() & IjkMediaMeta.AV_CH_WIDE_RIGHT) != 0;
        }

        public boolean I(int i9, int i10) {
            return (((Long) this.f40475K.h(D(i9, i10), -1L)).longValue() & IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT) != 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C1750a(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C1750a(this, resources);
        }

        @Override // f.AbstractC1754e.a, f.AbstractC1751b.d
        public void r() {
            this.f40475K = this.f40475K.clone();
            this.f40476L = this.f40476L.clone();
        }
    }

    /* JADX INFO: renamed from: f.a$d */
    public static class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final L0.b f40477a;

        public d(L0.b bVar) {
            super();
            this.f40477a = bVar;
        }

        @Override // f.C1750a.g
        public void c() {
            this.f40477a.start();
        }

        @Override // f.C1750a.g
        public void d() {
            this.f40477a.stop();
        }
    }

    /* JADX INFO: renamed from: f.a$e */
    public static class e extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ObjectAnimator f40478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f40479b;

        public e(AnimationDrawable animationDrawable, boolean z9, boolean z10) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i9 = z9 ? numberOfFrames - 1 : 0;
            int i10 = z9 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z9);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i9, i10);
            AbstractC1792b.a(objectAnimatorOfInt, true);
            objectAnimatorOfInt.setDuration(fVar.a());
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f40479b = z10;
            this.f40478a = objectAnimatorOfInt;
        }

        @Override // f.C1750a.g
        public boolean a() {
            return this.f40479b;
        }

        @Override // f.C1750a.g
        public void b() {
            this.f40478a.reverse();
        }

        @Override // f.C1750a.g
        public void c() {
            this.f40478a.start();
        }

        @Override // f.C1750a.g
        public void d() {
            this.f40478a.cancel();
        }
    }

    /* JADX INFO: renamed from: f.a$f */
    public static class f implements TimeInterpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f40480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f40481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f40482c;

        public f(AnimationDrawable animationDrawable, boolean z9) {
            b(animationDrawable, z9);
        }

        public int a() {
            return this.f40482c;
        }

        public int b(AnimationDrawable animationDrawable, boolean z9) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f40481b = numberOfFrames;
            int[] iArr = this.f40480a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f40480a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f40480a;
            int i9 = 0;
            for (int i10 = 0; i10 < numberOfFrames; i10++) {
                int duration = animationDrawable.getDuration(z9 ? (numberOfFrames - i10) - 1 : i10);
                iArr2[i10] = duration;
                i9 += duration;
            }
            this.f40482c = i9;
            return i9;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f9) {
            int i9 = (int) ((f9 * this.f40482c) + 0.5f);
            int i10 = this.f40481b;
            int[] iArr = this.f40480a;
            int i11 = 0;
            while (i11 < i10) {
                int i12 = iArr[i11];
                if (i9 < i12) {
                    break;
                }
                i9 -= i12;
                i11++;
            }
            return (i11 / i10) + (i11 < i10 ? i9 / this.f40482c : 0.0f);
        }
    }

    /* JADX INFO: renamed from: f.a$g */
    public static abstract class g {
        public g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public C1750a() {
        this(null, null);
    }

    public C1750a(c cVar, Resources resources) {
        super(null);
        this.f40471r = -1;
        this.f40472s = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static C1750a l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C1750a c1750a = new C1750a();
            c1750a.m(context, resources, xmlPullParser, attributeSet, theme);
            return c1750a;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // f.AbstractC1754e, f.AbstractC1751b
    public void h(AbstractC1751b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.f40469p = (c) dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // f.AbstractC1751b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f40470q;
        if (gVar != null) {
            gVar.d();
            this.f40470q = null;
            g(this.f40471r);
            this.f40471r = -1;
            this.f40472s = -1;
        }
    }

    @Override // f.AbstractC1751b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.f40469p, this, null);
    }

    public void m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayS = k.s(resources, theme, attributeSet, AbstractC1795e.f40939a);
        setVisible(typedArrayS.getBoolean(AbstractC1795e.f40941c, true), true);
        s(typedArrayS);
        i(resources);
        typedArrayS.recycle();
        n(context, resources, xmlPullParser, attributeSet, theme);
        o();
    }

    @Override // f.AbstractC1754e, f.AbstractC1751b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f40473t && super.mutate() == this) {
            this.f40469p.r();
            this.f40473t = true;
        }
        return this;
    }

    public final void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    p(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    public final void o() {
        onStateChange(getState());
    }

    @Override // f.AbstractC1754e, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int iF = this.f40469p.F(iArr);
        boolean z9 = iF != c() && (r(iF) || g(iF));
        Drawable current = getCurrent();
        return current != null ? z9 | current.setState(iArr) : z9;
    }

    public final int p(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayS = k.s(resources, theme, attributeSet, AbstractC1795e.f40946h);
        int resourceId = typedArrayS.getResourceId(AbstractC1795e.f40947i, 0);
        int resourceId2 = typedArrayS.getResourceId(AbstractC1795e.f40948j, -1);
        Drawable drawableJ = resourceId2 > 0 ? V.h().j(context, resourceId2) : null;
        typedArrayS.recycle();
        int[] iArrJ = j(attributeSet);
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableJ = xmlPullParser.getName().equals("vector") ? L0.g.c(resources, xmlPullParser, attributeSet, theme) : AbstractC1793c.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableJ != null) {
            return this.f40469p.B(iArrJ, drawableJ, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    public final int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayS = k.s(resources, theme, attributeSet, AbstractC1795e.f40949k);
        int resourceId = typedArrayS.getResourceId(AbstractC1795e.f40952n, -1);
        int resourceId2 = typedArrayS.getResourceId(AbstractC1795e.f40951m, -1);
        int resourceId3 = typedArrayS.getResourceId(AbstractC1795e.f40950l, -1);
        Drawable drawableJ = resourceId3 > 0 ? V.h().j(context, resourceId3) : null;
        boolean z9 = typedArrayS.getBoolean(AbstractC1795e.f40953o, false);
        typedArrayS.recycle();
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableJ = xmlPullParser.getName().equals("animated-vector") ? L0.b.a(context, resources, xmlPullParser, attributeSet, theme) : AbstractC1793c.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableJ == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f40469p.C(resourceId, resourceId2, drawableJ, z9);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    public final boolean r(int i9) {
        int iC;
        int iG;
        g bVar;
        g gVar = this.f40470q;
        if (gVar == null) {
            iC = c();
        } else {
            if (i9 == this.f40471r) {
                return true;
            }
            if (i9 == this.f40472s && gVar.a()) {
                gVar.b();
                this.f40471r = this.f40472s;
                this.f40472s = i9;
                return true;
            }
            iC = this.f40471r;
            gVar.d();
        }
        this.f40470q = null;
        this.f40472s = -1;
        this.f40471r = -1;
        c cVar = this.f40469p;
        int iE = cVar.E(iC);
        int iE2 = cVar.E(i9);
        if (iE2 == 0 || iE == 0 || (iG = cVar.G(iE, iE2)) < 0) {
            return false;
        }
        boolean zI = cVar.I(iE, iE2);
        g(iG);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(iE, iE2), zI);
        } else {
            if (!(current instanceof L0.b)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((L0.b) current);
        }
        bVar.c();
        this.f40470q = bVar;
        this.f40472s = iC;
        this.f40471r = i9;
        return true;
    }

    public final void s(TypedArray typedArray) {
        c cVar = this.f40469p;
        cVar.f40509d |= AbstractC1793c.b(typedArray);
        cVar.x(typedArray.getBoolean(AbstractC1795e.f40942d, cVar.f40514i));
        cVar.t(typedArray.getBoolean(AbstractC1795e.f40943e, cVar.f40517l));
        cVar.u(typedArray.getInt(AbstractC1795e.f40944f, cVar.f40497A));
        cVar.v(typedArray.getInt(AbstractC1795e.f40945g, cVar.f40498B));
        setDither(typedArray.getBoolean(AbstractC1795e.f40940b, cVar.f40529x));
    }

    @Override // f.AbstractC1751b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        g gVar = this.f40470q;
        if (gVar != null && (visible || z10)) {
            if (z9) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
