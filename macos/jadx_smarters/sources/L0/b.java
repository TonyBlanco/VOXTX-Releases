package L0;

import F.k;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s.C2695a;

/* JADX INFO: loaded from: classes.dex */
public class b extends f implements Animatable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0063b f3885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f3886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArgbEvaluator f3887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Animator.AnimatorListener f3888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f3889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable.Callback f3890h;

    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
            b.this.scheduleSelf(runnable, j9);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: L0.b$b, reason: collision with other inner class name */
    public static class C0063b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f3893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AnimatorSet f3894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList f3895d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C2695a f3896e;

        public C0063b(Context context, C0063b c0063b, Drawable.Callback callback, Resources resources) {
            if (c0063b != null) {
                this.f3892a = c0063b.f3892a;
                g gVar = c0063b.f3893b;
                if (gVar != null) {
                    Drawable.ConstantState constantState = gVar.getConstantState();
                    this.f3893b = (g) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    g gVar2 = (g) this.f3893b.mutate();
                    this.f3893b = gVar2;
                    gVar2.setCallback(callback);
                    this.f3893b.setBounds(c0063b.f3893b.getBounds());
                    this.f3893b.h(false);
                }
                ArrayList arrayList = c0063b.f3895d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f3895d = new ArrayList(size);
                    this.f3896e = new C2695a(size);
                    for (int i9 = 0; i9 < size; i9++) {
                        Animator animator = (Animator) c0063b.f3895d.get(i9);
                        Animator animatorClone = animator.clone();
                        String str = (String) c0063b.f3896e.get(animator);
                        animatorClone.setTarget(this.f3893b.d(str));
                        this.f3895d.add(animatorClone);
                        this.f3896e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f3894c == null) {
                this.f3894c = new AnimatorSet();
            }
            this.f3894c.playTogether(this.f3895d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3892a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f3897a;

        public c(Drawable.ConstantState constantState) {
            this.f3897a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f3897a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3897a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            b bVar = new b();
            Drawable drawableNewDrawable = this.f3897a.newDrawable();
            bVar.f3900a = drawableNewDrawable;
            drawableNewDrawable.setCallback(bVar.f3890h);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable drawableNewDrawable = this.f3897a.newDrawable(resources);
            bVar.f3900a = drawableNewDrawable;
            drawableNewDrawable.setCallback(bVar.f3890h);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable drawableNewDrawable = this.f3897a.newDrawable(resources, theme);
            bVar.f3900a = drawableNewDrawable;
            drawableNewDrawable.setCallback(bVar.f3890h);
            return bVar;
        }
    }

    public b() {
        this(null, null, null);
    }

    public b(Context context) {
        this(context, null, null);
    }

    public b(Context context, C0063b c0063b, Resources resources) {
        this.f3887e = null;
        this.f3888f = null;
        this.f3889g = null;
        a aVar = new a();
        this.f3890h = aVar;
        this.f3886d = context;
        if (c0063b != null) {
            this.f3885c = c0063b;
        } else {
            this.f3885c = new C0063b(context, c0063b, aVar, resources);
        }
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        b bVar = new b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            H.a.a(drawable, theme);
        }
    }

    public final void b(String str, Animator animator) {
        animator.setTarget(this.f3885c.f3893b.d(str));
        C0063b c0063b = this.f3885c;
        if (c0063b.f3895d == null) {
            c0063b.f3895d = new ArrayList();
            this.f3885c.f3896e = new C2695a();
        }
        this.f3885c.f3895d.add(animator);
        this.f3885c.f3896e.put(animator, str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            return H.a.b(drawable);
        }
        return false;
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f3885c.f3893b.draw(canvas);
        if (this.f3885c.f3894c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f3900a;
        return drawable != null ? H.a.d(drawable) : this.f3885c.f3893b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3885c.f3892a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3900a;
        return drawable != null ? H.a.e(drawable) : this.f3885c.f3893b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f3900a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f3900a.getConstantState());
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3885c.f3893b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3885c.f3893b.getIntrinsicWidth();
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.getOpacity() : this.f3885c.f3893b.getOpacity();
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes;
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            H.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    typedArrayObtainAttributes = k.s(resources, theme, attributeSet, L0.a.f3877e);
                    int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        g gVarB = g.b(resources, resourceId, theme);
                        gVarB.h(false);
                        gVarB.setCallback(this.f3890h);
                        g gVar = this.f3885c.f3893b;
                        if (gVar != null) {
                            gVar.setCallback(null);
                        }
                        this.f3885c.f3893b = gVarB;
                    }
                } else if ("target".equals(name)) {
                    typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, L0.a.f3878f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3886d;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        b(string, d.i(context, resourceId2));
                    }
                } else {
                    continue;
                }
                typedArrayObtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f3885c.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f3900a;
        return drawable != null ? H.a.h(drawable) : this.f3885c.f3893b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f3900a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3885c.f3894c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.isStateful() : this.f3885c.f3893b.isStateful();
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3885c.f3893b.setBounds(rect);
        }
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i9) {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.setLevel(i9) : this.f3885c.f3893b.setLevel(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.setState(iArr) : this.f3885c.f3893b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            drawable.setAlpha(i9);
        } else {
            this.f3885c.f3893b.setAlpha(i9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z9) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            H.a.j(drawable, z9);
        } else {
            this.f3885c.f3893b.setAutoMirrored(z9);
        }
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i9) {
        super.setChangingConfigurations(i9);
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i9, PorterDuff.Mode mode) {
        super.setColorFilter(i9, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3885c.f3893b.setColorFilter(colorFilter);
        }
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z9) {
        super.setFilterBitmap(z9);
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f9, float f10) {
        super.setHotspot(f9, f10);
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i9, int i10, int i11, int i12) {
        super.setHotspotBounds(i9, i10, i11, i12);
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i9) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            H.a.n(drawable, i9);
        } else {
            this.f3885c.f3893b.setTint(i9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            H.a.o(drawable, colorStateList);
        } else {
            this.f3885c.f3893b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            H.a.p(drawable, mode);
        } else {
            this.f3885c.f3893b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            return drawable.setVisible(z9, z10);
        }
        this.f3885c.f3893b.setVisible(z9, z10);
        return super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f3885c.f3894c.isStarted()) {
                return;
            }
            this.f3885c.f3894c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3885c.f3894c.end();
        }
    }
}
