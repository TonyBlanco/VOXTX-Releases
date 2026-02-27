package androidx.recyclerview.widget;

import P.AbstractC0982y;
import P.C0959a;
import P.InterfaceC0983z;
import P.L;
import P.N;
import Q.AbstractC1010b;
import Q.C;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.q;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.facebook.ads.AdError;
import com.google.android.gms.common.api.a;
import d.AbstractC1617D;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okio.Segment;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0983z {

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public static final int[] f16626D0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public static final boolean f16627E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final boolean f16628F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public static final boolean f16629G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public static final boolean f16630H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public static final boolean f16631I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public static final boolean f16632J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public static final Class[] f16633K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public static final Interpolator f16634L0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f16635A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final List f16636A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f16637B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public Runnable f16638B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final AccessibilityManager f16639C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final q.b f16640C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public List f16641D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f16642E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f16643F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f16644G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f16645H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public k f16646I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public EdgeEffect f16647J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public EdgeEffect f16648K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public EdgeEffect f16649L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public EdgeEffect f16650M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public l f16651N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f16652O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f16653P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public VelocityTracker f16654Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f16655R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f16656S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f16657T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f16658U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f16659V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public r f16660W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f16661a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f16662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f16663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f16664e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f16665e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f16666f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int f16667f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.recyclerview.widget.q f16668g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f16669g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16670h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f16671h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Runnable f16672i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f16673i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f16674j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final C f16675j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rect f16676k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public androidx.recyclerview.widget.e f16677k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f16678l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public e.b f16679l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g f16680m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final A f16681m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o f16682n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public t f16683n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f16684o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public List f16685o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f16686p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f16687p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f16688q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f16689q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public s f16690r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public l.b f16691r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16692s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f16693s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f16694t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public androidx.recyclerview.widget.l f16695t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16696u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public j f16697u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16698v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final int[] f16699v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16700w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public P.A f16701w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16702x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int[] f16703x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f16704y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int[] f16705y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f16706z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final int[] f16707z0;

    public static class A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseArray f16709b;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f16720m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f16721n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f16722o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f16723p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f16724q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16708a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16710c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16711d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16712e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f16713f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f16714g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f16715h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f16716i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f16717j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f16718k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f16719l = false;

        public void a(int i9) {
            if ((this.f16712e & i9) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i9) + " but it is " + Integer.toBinaryString(this.f16712e));
        }

        public boolean b() {
            return this.f16714g;
        }

        public int c() {
            return this.f16715h ? this.f16710c - this.f16711d : this.f16713f;
        }

        public int d() {
            return this.f16723p;
        }

        public int e() {
            return this.f16724q;
        }

        public int f() {
            return this.f16708a;
        }

        public boolean g() {
            return this.f16708a != -1;
        }

        public boolean h() {
            return this.f16715h;
        }

        public void i(g gVar) {
            this.f16712e = 1;
            this.f16713f = gVar.n();
            this.f16715h = false;
            this.f16716i = false;
            this.f16717j = false;
        }

        public boolean j() {
            return this.f16719l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f16708a + ", mData=" + this.f16709b + ", mItemCount=" + this.f16713f + ", mIsMeasuring=" + this.f16717j + ", mPreviousLayoutItemCount=" + this.f16710c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f16711d + ", mStructureChanged=" + this.f16714g + ", mInPreLayout=" + this.f16715h + ", mRunSimpleAnimations=" + this.f16718k + ", mRunPredictiveAnimations=" + this.f16719l + '}';
        }
    }

    public static abstract class B {
    }

    public class C implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16725a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public OverScroller f16727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Interpolator f16728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f16729f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f16730g;

        public C() {
            Interpolator interpolator = RecyclerView.f16634L0;
            this.f16728e = interpolator;
            this.f16729f = false;
            this.f16730g = false;
            this.f16727d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i9, int i10, int i11, int i12) {
            int iRound;
            int iAbs = Math.abs(i9);
            int iAbs2 = Math.abs(i10);
            boolean z9 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt((i11 * i11) + (i12 * i12));
            int iSqrt2 = (int) Math.sqrt((i9 * i9) + (i10 * i10));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z9 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i13 = width / 2;
            float f9 = width;
            float f10 = i13;
            float fB = f10 + (b(Math.min(1.0f, (iSqrt2 * 1.0f) / f9)) * f10);
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fB / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z9) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f9) + 1.0f) * 300.0f);
            }
            return Math.min(iRound, AdError.SERVER_ERROR_CODE);
        }

        public final float b(float f9) {
            return (float) Math.sin((f9 - 0.5f) * 0.47123894f);
        }

        public void c(int i9, int i10) {
            RecyclerView.this.setScrollState(2);
            this.f16726c = 0;
            this.f16725a = 0;
            Interpolator interpolator = this.f16728e;
            Interpolator interpolator2 = RecyclerView.f16634L0;
            if (interpolator != interpolator2) {
                this.f16728e = interpolator2;
                this.f16727d = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f16727d.fling(0, 0, i9, i10, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER);
            e();
        }

        public final void d() {
            RecyclerView.this.removeCallbacks(this);
            L.k0(RecyclerView.this, this);
        }

        public void e() {
            if (this.f16729f) {
                this.f16730g = true;
            } else {
                d();
            }
        }

        public void f(int i9, int i10, int i11, Interpolator interpolator) {
            if (i11 == Integer.MIN_VALUE) {
                i11 = a(i9, i10, 0, 0);
            }
            int i12 = i11;
            if (interpolator == null) {
                interpolator = RecyclerView.f16634L0;
            }
            if (this.f16728e != interpolator) {
                this.f16728e = interpolator;
                this.f16727d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f16726c = 0;
            this.f16725a = 0;
            RecyclerView.this.setScrollState(2);
            this.f16727d.startScroll(0, 0, i9, i10, i12);
            if (Build.VERSION.SDK_INT < 23) {
                this.f16727d.computeScrollOffset();
            }
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.f16727d.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i9;
            int i10;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f16682n == null) {
                g();
                return;
            }
            this.f16730g = false;
            this.f16729f = true;
            recyclerView.v();
            OverScroller overScroller = this.f16727d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i11 = currX - this.f16725a;
                int i12 = currY - this.f16726c;
                this.f16725a = currX;
                this.f16726c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f16707z0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.G(i11, i12, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f16707z0;
                    i11 -= iArr2[0];
                    i12 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.u(i11, i12);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f16680m != null) {
                    int[] iArr3 = recyclerView3.f16707z0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.l1(i11, i12, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f16707z0;
                    i10 = iArr4[0];
                    i9 = iArr4[1];
                    i11 -= i10;
                    i12 -= i9;
                    z zVar = recyclerView4.f16682n.f16775g;
                    if (zVar != null && !zVar.g() && zVar.h()) {
                        int iC = RecyclerView.this.f16681m0.c();
                        if (iC == 0) {
                            zVar.r();
                        } else {
                            if (zVar.f() >= iC) {
                                zVar.p(iC - 1);
                            }
                            zVar.j(i10, i9);
                        }
                    }
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                if (!RecyclerView.this.f16686p.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f16707z0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.H(i10, i9, i11, i12, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f16707z0;
                int i13 = i11 - iArr6[0];
                int i14 = i12 - iArr6[1];
                if (i10 != 0 || i9 != 0) {
                    recyclerView6.J(i10, i9);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z9 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i13 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i14 != 0));
                z zVar2 = RecyclerView.this.f16682n.f16775g;
                if ((zVar2 == null || !zVar2.g()) && z9) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i15 = i13 < 0 ? -currVelocity : i13 > 0 ? currVelocity : 0;
                        if (i14 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i14 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.b(i15, currVelocity);
                    }
                    if (RecyclerView.f16630H0) {
                        RecyclerView.this.f16679l0.b();
                    }
                } else {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.f16677k0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i10, i9);
                    }
                }
            }
            z zVar3 = RecyclerView.this.f16682n.f16775g;
            if (zVar3 != null && zVar3.g()) {
                zVar3.j(0, 0);
            }
            this.f16729f = false;
            if (this.f16730g) {
                d();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.y1(1);
            }
        }
    }

    public static abstract class D {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final List f16732s = Collections.emptyList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f16733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference f16734b;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f16742j;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public RecyclerView f16750r;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16735c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16736d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f16737e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f16738f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f16739g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public D f16740h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public D f16741i = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List f16743k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List f16744l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f16745m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public v f16746n = null;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f16747o = false;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f16748p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f16749q = -1;

        public D(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f16733a = view;
        }

        public boolean A() {
            return (this.f16742j & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0;
        }

        public boolean B() {
            return (this.f16742j & 2) != 0;
        }

        public boolean C() {
            return (this.f16742j & 2) != 0;
        }

        public void D(int i9, boolean z9) {
            if (this.f16736d == -1) {
                this.f16736d = this.f16735c;
            }
            if (this.f16739g == -1) {
                this.f16739g = this.f16735c;
            }
            if (z9) {
                this.f16739g += i9;
            }
            this.f16735c += i9;
            if (this.f16733a.getLayoutParams() != null) {
                ((p) this.f16733a.getLayoutParams()).f16795d = true;
            }
        }

        public void E(RecyclerView recyclerView) {
            int iC = this.f16749q;
            if (iC == -1) {
                iC = L.C(this.f16733a);
            }
            this.f16748p = iC;
            recyclerView.o1(this, 4);
        }

        public void F(RecyclerView recyclerView) {
            recyclerView.o1(this, this.f16748p);
            this.f16748p = 0;
        }

        public void G() {
            this.f16742j = 0;
            this.f16735c = -1;
            this.f16736d = -1;
            this.f16737e = -1L;
            this.f16739g = -1;
            this.f16745m = 0;
            this.f16740h = null;
            this.f16741i = null;
            g();
            this.f16748p = 0;
            this.f16749q = -1;
            RecyclerView.s(this);
        }

        public void H() {
            if (this.f16736d == -1) {
                this.f16736d = this.f16735c;
            }
        }

        public void I(int i9, int i10) {
            this.f16742j = (i9 & i10) | (this.f16742j & (~i10));
        }

        public final void J(boolean z9) {
            int i9;
            int i10 = this.f16745m;
            int i11 = z9 ? i10 - 1 : i10 + 1;
            this.f16745m = i11;
            if (i11 < 0) {
                this.f16745m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z9 && i11 == 1) {
                i9 = this.f16742j | 16;
            } else if (!z9 || i11 != 0) {
                return;
            } else {
                i9 = this.f16742j & (-17);
            }
            this.f16742j = i9;
        }

        public void K(v vVar, boolean z9) {
            this.f16746n = vVar;
            this.f16747o = z9;
        }

        public boolean L() {
            return (this.f16742j & 16) != 0;
        }

        public boolean M() {
            return (this.f16742j & 128) != 0;
        }

        public void N() {
            this.f16746n.J(this);
        }

        public boolean O() {
            return (this.f16742j & 32) != 0;
        }

        public void d(Object obj) {
            if (obj == null) {
                e(1024);
            } else if ((1024 & this.f16742j) == 0) {
                j();
                this.f16743k.add(obj);
            }
        }

        public void e(int i9) {
            this.f16742j = i9 | this.f16742j;
        }

        public void f() {
            this.f16736d = -1;
            this.f16739g = -1;
        }

        public void g() {
            List list = this.f16743k;
            if (list != null) {
                list.clear();
            }
            this.f16742j &= -1025;
        }

        public void h() {
            this.f16742j &= -33;
        }

        public void i() {
            this.f16742j &= -257;
        }

        public final void j() {
            if (this.f16743k == null) {
                ArrayList arrayList = new ArrayList();
                this.f16743k = arrayList;
                this.f16744l = Collections.unmodifiableList(arrayList);
            }
        }

        public boolean k() {
            return (this.f16742j & 16) == 0 && L.T(this.f16733a);
        }

        public void l(int i9, int i10, boolean z9) {
            e(8);
            D(i10, z9);
            this.f16735c = i9;
        }

        public final int m() {
            RecyclerView recyclerView = this.f16750r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.e0(this);
        }

        public final long n() {
            return this.f16737e;
        }

        public final int o() {
            return this.f16738f;
        }

        public final int p() {
            int i9 = this.f16739g;
            return i9 == -1 ? this.f16735c : i9;
        }

        public final int q() {
            return this.f16736d;
        }

        public List r() {
            if ((this.f16742j & 1024) != 0) {
                return f16732s;
            }
            List list = this.f16743k;
            return (list == null || list.size() == 0) ? f16732s : this.f16744l;
        }

        public boolean s(int i9) {
            return (i9 & this.f16742j) != 0;
        }

        public boolean t() {
            return (this.f16742j & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0 || w();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f16735c + " id=" + this.f16737e + ", oldPos=" + this.f16736d + ", pLpos:" + this.f16739g);
            if (z()) {
                sb.append(" scrap ");
                sb.append(this.f16747o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (w()) {
                sb.append(" invalid");
            }
            if (!v()) {
                sb.append(" unbound");
            }
            if (C()) {
                sb.append(" update");
            }
            if (y()) {
                sb.append(" removed");
            }
            if (M()) {
                sb.append(" ignored");
            }
            if (A()) {
                sb.append(" tmpDetached");
            }
            if (!x()) {
                sb.append(" not recyclable(" + this.f16745m + ")");
            }
            if (t()) {
                sb.append(" undefined adapter position");
            }
            if (this.f16733a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public boolean u() {
            return (this.f16733a.getParent() == null || this.f16733a.getParent() == this.f16750r) ? false : true;
        }

        public boolean v() {
            return (this.f16742j & 1) != 0;
        }

        public boolean w() {
            return (this.f16742j & 4) != 0;
        }

        public final boolean x() {
            return (this.f16742j & 16) == 0 && !L.T(this.f16733a);
        }

        public boolean y() {
            return (this.f16742j & 8) != 0;
        }

        public boolean z() {
            return this.f16746n != null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    public class RunnableC1187a implements Runnable {
        public RunnableC1187a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f16698v || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f16692s) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f16704y) {
                recyclerView2.f16702x = true;
            } else {
                recyclerView2.v();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    public class RunnableC1188b implements Runnable {
        public RunnableC1188b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.f16651N;
            if (lVar != null) {
                lVar.v();
            }
            RecyclerView.this.f16693s0 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    public static class InterpolatorC1189c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f9) {
            float f10 = f9 - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d, reason: case insensitive filesystem */
    public class C1190d implements q.b {
        public C1190d() {
        }

        @Override // androidx.recyclerview.widget.q.b
        public void a(D d9, l.c cVar, l.c cVar2) {
            RecyclerView.this.m(d9, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void b(D d9) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f16682n.J1(d9.f16733a, recyclerView.f16662c);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void c(D d9, l.c cVar, l.c cVar2) {
            RecyclerView.this.f16662c.J(d9);
            RecyclerView.this.o(d9, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void d(D d9, l.c cVar, l.c cVar2) {
            d9.J(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z9 = recyclerView.f16642E;
            l lVar = recyclerView.f16651N;
            if (z9) {
                if (!lVar.b(d9, d9, cVar, cVar2)) {
                    return;
                }
            } else if (!lVar.d(d9, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.Q0();
        }
    }

    public class e implements b.InterfaceC0191b {
        public e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0191b
        public View a(int i9) {
            return RecyclerView.this.getChildAt(i9);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0191b
        public void addView(View view, int i9) {
            RecyclerView.this.addView(view, i9);
            RecyclerView.this.z(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0191b
        public void b(View view) {
            D dJ0 = RecyclerView.j0(view);
            if (dJ0 != null) {
                dJ0.E(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0191b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0191b
        public D d(View view) {
            return RecyclerView.j0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0191b
        public void e(int i9) {
            D dJ0;
            View viewA = a(i9);
            if (viewA != null && (dJ0 = RecyclerView.j0(viewA)) != null) {
                if (dJ0.A() && !dJ0.M()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + dJ0 + RecyclerView.this.Q());
                }
                dJ0.e(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
            }
            RecyclerView.this.detachViewFromParent(i9);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0191b
        public void f() {
            int iC = c();
            for (int i9 = 0; i9 < iC; i9++) {
                View viewA = a(i9);
                RecyclerView.this.A(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0191b
        public int g(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0191b
        public void h(View view) {
            D dJ0 = RecyclerView.j0(view);
            if (dJ0 != null) {
                dJ0.F(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0191b
        public void i(int i9) {
            View childAt = RecyclerView.this.getChildAt(i9);
            if (childAt != null) {
                RecyclerView.this.A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i9);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0191b
        public void j(View view, int i9, ViewGroup.LayoutParams layoutParams) {
            D dJ0 = RecyclerView.j0(view);
            if (dJ0 != null) {
                if (!dJ0.A() && !dJ0.M()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + dJ0 + RecyclerView.this.Q());
                }
                dJ0.i();
            }
            RecyclerView.this.attachViewToParent(view, i9, layoutParams);
        }
    }

    public class f implements a.InterfaceC0190a {
        public f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0190a
        public void a(int i9, int i10) {
            RecyclerView.this.G0(i9, i10);
            RecyclerView.this.f16687p0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0190a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0190a
        public void c(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0190a
        public void d(int i9, int i10) {
            RecyclerView.this.H0(i9, i10, false);
            RecyclerView.this.f16687p0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0190a
        public void e(int i9, int i10, Object obj) {
            RecyclerView.this.B1(i9, i10, obj);
            RecyclerView.this.f16689q0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0190a
        public D f(int i9) {
            D dC0 = RecyclerView.this.c0(i9, true);
            if (dC0 == null || RecyclerView.this.f16666f.n(dC0.f16733a)) {
                return null;
            }
            return dC0;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0190a
        public void g(int i9, int i10) {
            RecyclerView.this.F0(i9, i10);
            RecyclerView.this.f16687p0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0190a
        public void h(int i9, int i10) {
            RecyclerView.this.H0(i9, i10, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f16687p0 = true;
            recyclerView.f16681m0.f16711d += i10;
        }

        public void i(a.b bVar) {
            int i9 = bVar.f16892a;
            if (i9 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f16682n.n1(recyclerView, bVar.f16893b, bVar.f16895d);
                return;
            }
            if (i9 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f16682n.q1(recyclerView2, bVar.f16893b, bVar.f16895d);
            } else if (i9 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f16682n.s1(recyclerView3, bVar.f16893b, bVar.f16895d, bVar.f16894c);
            } else {
                if (i9 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f16682n.p1(recyclerView4, bVar.f16893b, bVar.f16895d, 1);
            }
        }
    }

    public static abstract class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f16756a = new h();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f16757c = false;

        public final void A(int i9, int i10) {
            this.f16756a.d(i9, i10);
        }

        public final void B(int i9) {
            this.f16756a.f(i9, 1);
        }

        public void D(RecyclerView recyclerView) {
        }

        public abstract void E(D d9, int i9);

        public void J(D d9, int i9, List list) {
            E(d9, i9);
        }

        public abstract D L(ViewGroup viewGroup, int i9);

        public void S(RecyclerView recyclerView) {
        }

        public boolean T(D d9) {
            return false;
        }

        public void W(D d9) {
        }

        public void Y(D d9) {
        }

        public void Z(D d9) {
        }

        public void b0(i iVar) {
            this.f16756a.registerObserver(iVar);
        }

        public void c0(boolean z9) {
            if (r()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f16757c = z9;
        }

        public void i0(i iVar) {
            this.f16756a.unregisterObserver(iVar);
        }

        public final void k(D d9, int i9) {
            d9.f16735c = i9;
            if (v()) {
                d9.f16737e = o(i9);
            }
            d9.I(1, 519);
            L.t.a("RV OnBindView");
            J(d9, i9, d9.r());
            d9.g();
            ViewGroup.LayoutParams layoutParams = d9.f16733a.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f16795d = true;
            }
            L.t.b();
        }

        public final D l(ViewGroup viewGroup, int i9) {
            try {
                L.t.a("RV CreateView");
                D dL = L(viewGroup, i9);
                if (dL.f16733a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                dL.f16738f = i9;
                return dL;
            } finally {
                L.t.b();
            }
        }

        public abstract int n();

        public long o(int i9) {
            return -1L;
        }

        public int p(int i9) {
            return 0;
        }

        public final boolean r() {
            return this.f16756a.a();
        }

        public final boolean v() {
            return this.f16757c;
        }

        public final void w() {
            this.f16756a.b();
        }

        public final void x(int i9) {
            this.f16756a.d(i9, 1);
        }

        public final void z(int i9, int i10) {
            this.f16756a.c(i9, i10);
        }
    }

    public static class h extends Observable {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i9, int i10) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).d(i9, i10, 1);
            }
        }

        public void d(int i9, int i10) {
            e(i9, i10, null);
        }

        public void e(int i9, int i10, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).c(i9, i10, obj);
            }
        }

        public void f(int i9, int i10) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).e(i9, i10);
            }
        }
    }

    public static abstract class i {
        public abstract void a();

        public void b(int i9, int i10) {
        }

        public void c(int i9, int i10, Object obj) {
            b(i9, i10);
        }

        public void d(int i9, int i10, int i11) {
        }

        public void e(int i9, int i10) {
        }
    }

    public interface j {
        int a(int i9, int i10);
    }

    public static class k {
        public EdgeEffect a(RecyclerView recyclerView, int i9) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f16758a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f16759b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f16760c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f16761d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f16762e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f16763f = 250;

        public interface a {
            void a();
        }

        public interface b {
            void a(D d9);
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f16764a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f16765b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f16766c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f16767d;

            public c a(D d9) {
                return b(d9, 0);
            }

            public c b(D d9, int i9) {
                View view = d9.f16733a;
                this.f16764a = view.getLeft();
                this.f16765b = view.getTop();
                this.f16766c = view.getRight();
                this.f16767d = view.getBottom();
                return this;
            }
        }

        public static int e(D d9) {
            int i9 = d9.f16742j;
            int i10 = i9 & 14;
            if (d9.w()) {
                return 4;
            }
            if ((i9 & 4) != 0) {
                return i10;
            }
            int iQ = d9.q();
            int iM = d9.m();
            return (iQ == -1 || iM == -1 || iQ == iM) ? i10 : i10 | 2048;
        }

        public abstract boolean a(D d9, c cVar, c cVar2);

        public abstract boolean b(D d9, D d10, c cVar, c cVar2);

        public abstract boolean c(D d9, c cVar, c cVar2);

        public abstract boolean d(D d9, c cVar, c cVar2);

        public abstract boolean f(D d9);

        public boolean g(D d9, List list) {
            return f(d9);
        }

        public final void h(D d9) {
            s(d9);
            b bVar = this.f16758a;
            if (bVar != null) {
                bVar.a(d9);
            }
        }

        public final void i() {
            if (this.f16759b.size() <= 0) {
                this.f16759b.clear();
            } else {
                AbstractC1617D.a(this.f16759b.get(0));
                throw null;
            }
        }

        public abstract void j(D d9);

        public abstract void k();

        public long l() {
            return this.f16760c;
        }

        public long m() {
            return this.f16763f;
        }

        public long n() {
            return this.f16762e;
        }

        public long o() {
            return this.f16761d;
        }

        public abstract boolean p();

        public final boolean q(a aVar) {
            boolean zP = p();
            if (aVar != null) {
                if (zP) {
                    this.f16759b.add(aVar);
                } else {
                    aVar.a();
                }
            }
            return zP;
        }

        public c r() {
            return new c();
        }

        public void s(D d9) {
        }

        public c t(A a9, D d9) {
            return r().a(d9);
        }

        public c u(A a9, D d9, int i9, List list) {
            return r().a(d9);
        }

        public abstract void v();

        public void w(b bVar) {
            this.f16758a = bVar;
        }
    }

    public class m implements l.b {
        public m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.b
        public void a(D d9) {
            d9.J(true);
            if (d9.f16740h != null && d9.f16741i == null) {
                d9.f16740h = null;
            }
            d9.f16741i = null;
            if (d9.L() || RecyclerView.this.Z0(d9.f16733a) || !d9.A()) {
                return;
            }
            RecyclerView.this.removeDetachedView(d9.f16733a, false);
        }
    }

    public static abstract class n {
        public void f(Rect rect, int i9, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void g(Rect rect, View view, RecyclerView recyclerView, A a9) {
            f(rect, ((p) view.getLayoutParams()).c(), recyclerView);
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, A a9) {
            h(canvas, recyclerView);
        }

        public void j(Canvas canvas, RecyclerView recyclerView) {
        }

        public void k(Canvas canvas, RecyclerView recyclerView, A a9) {
            j(canvas, recyclerView);
        }
    }

    public static abstract class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.b f16769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView f16770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p.b f16771c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p.b f16772d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public androidx.recyclerview.widget.p f16773e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public androidx.recyclerview.widget.p f16774f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public z f16775g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f16776h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f16777i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f16778j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f16779k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f16780l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f16781m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f16782n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f16783o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f16784p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f16785q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f16786r;

        public class a implements p.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.p.b
            public View a(int i9) {
                return o.this.g0(i9);
            }

            @Override // androidx.recyclerview.widget.p.b
            public int b(View view) {
                return o.this.o0(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public int c() {
                return o.this.o();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int d() {
                return o.this.I0() - o.this.k();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int e(View view) {
                return o.this.r0(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements p.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.p.b
            public View a(int i9) {
                return o.this.g0(i9);
            }

            @Override // androidx.recyclerview.widget.p.b
            public int b(View view) {
                return o.this.s0(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public int c() {
                return o.this.n();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int d() {
                return o.this.u0() - o.this.b();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int e(View view) {
                return o.this.m0(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i9, int i10);
        }

        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f16789a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f16790b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f16791c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f16792d;
        }

        public o() {
            a aVar = new a();
            this.f16771c = aVar;
            b bVar = new b();
            this.f16772d = bVar;
            this.f16773e = new androidx.recyclerview.widget.p(aVar);
            this.f16774f = new androidx.recyclerview.widget.p(bVar);
            this.f16776h = false;
            this.f16777i = false;
            this.f16778j = false;
            this.f16779k = true;
            this.f16780l = true;
        }

        public static d C0(Context context, AttributeSet attributeSet, int i9, int i10) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0.d.f33f, i9, i10);
            dVar.f16789a = typedArrayObtainStyledAttributes.getInt(A0.d.f34g, 1);
            dVar.f16790b = typedArrayObtainStyledAttributes.getInt(A0.d.f44q, 1);
            dVar.f16791c = typedArrayObtainStyledAttributes.getBoolean(A0.d.f43p, false);
            dVar.f16792d = typedArrayObtainStyledAttributes.getBoolean(A0.d.f45r, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int K(int i9, int i10, int i11) {
            int mode = View.MeasureSpec.getMode(i9);
            int size = View.MeasureSpec.getSize(i9);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i10, i11) : size : Math.min(size, Math.max(i10, i11));
        }

        private static boolean S0(int i9, int i10, int i11) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (i11 > 0 && i9 != i11) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i9;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i9;
            }
            return true;
        }

        public static int i0(int i9, int i10, int i11, int i12, boolean z9) {
            int iMax = Math.max(0, i9 - i11);
            if (z9) {
                if (i12 < 0) {
                    if (i12 != -1 || (i10 != Integer.MIN_VALUE && (i10 == 0 || i10 != 1073741824))) {
                        i10 = 0;
                        i12 = 0;
                    } else {
                        i12 = iMax;
                    }
                }
                i10 = 1073741824;
            } else {
                if (i12 < 0) {
                    if (i12 != -1) {
                        if (i12 == -2) {
                            i10 = (i10 == Integer.MIN_VALUE || i10 == 1073741824) ? Integer.MIN_VALUE : 0;
                        }
                        i10 = 0;
                        i12 = 0;
                    }
                    i12 = iMax;
                }
                i10 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i12, i10);
        }

        public void A(View view) {
            B(view, -1);
        }

        public int A0() {
            return L.G(this.f16770b);
        }

        public void A1(int i9) {
        }

        public void B(View view, int i9) {
            C(view, i9, false);
        }

        public int B0(View view) {
            return ((p) view.getLayoutParams()).c();
        }

        public void B1(z zVar) {
            if (this.f16775g == zVar) {
                this.f16775g = null;
            }
        }

        public final void C(View view, int i9, boolean z9) {
            D dJ0 = RecyclerView.j0(view);
            if (z9 || dJ0.y()) {
                this.f16770b.f16668g.b(dJ0);
            } else {
                this.f16770b.f16668g.p(dJ0);
            }
            p pVar = (p) view.getLayoutParams();
            if (dJ0.O() || dJ0.z()) {
                if (dJ0.z()) {
                    dJ0.N();
                } else {
                    dJ0.h();
                }
                this.f16769a.c(view, i9, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f16770b) {
                int iM = this.f16769a.m(view);
                if (i9 == -1) {
                    i9 = this.f16769a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f16770b.indexOfChild(view) + this.f16770b.Q());
                }
                if (iM != i9) {
                    this.f16770b.f16682n.X0(iM, i9);
                }
            } else {
                this.f16769a.a(view, i9, false);
                pVar.f16795d = true;
                z zVar = this.f16775g;
                if (zVar != null && zVar.h()) {
                    this.f16775g.k(view);
                }
            }
            if (pVar.f16796e) {
                dJ0.f16733a.invalidate();
                pVar.f16796e = false;
            }
        }

        public boolean C1(int i9, Bundle bundle) {
            RecyclerView recyclerView = this.f16770b;
            return D1(recyclerView.f16662c, recyclerView.f16681m0, i9, bundle);
        }

        public void D(String str) {
            RecyclerView recyclerView = this.f16770b;
            if (recyclerView != null) {
                recyclerView.p(str);
            }
        }

        public int D0(View view) {
            return ((p) view.getLayoutParams()).f16794c.right;
        }

        public boolean D1(v vVar, A a9, int i9, Bundle bundle) {
            int iU0;
            int iI0;
            int i10;
            int i11;
            RecyclerView recyclerView = this.f16770b;
            if (recyclerView == null) {
                return false;
            }
            if (i9 == 4096) {
                iU0 = recyclerView.canScrollVertically(1) ? (u0() - n()) - b() : 0;
                if (this.f16770b.canScrollHorizontally(1)) {
                    iI0 = (I0() - o()) - k();
                    i10 = iU0;
                    i11 = iI0;
                }
                i10 = iU0;
                i11 = 0;
            } else if (i9 != 8192) {
                i11 = 0;
                i10 = 0;
            } else {
                iU0 = recyclerView.canScrollVertically(-1) ? -((u0() - n()) - b()) : 0;
                if (this.f16770b.canScrollHorizontally(-1)) {
                    iI0 = -((I0() - o()) - k());
                    i10 = iU0;
                    i11 = iI0;
                }
                i10 = iU0;
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            this.f16770b.t1(i11, i10, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void E(View view, int i9) {
            F(view, i9, (p) view.getLayoutParams());
        }

        public int E0(v vVar, A a9) {
            RecyclerView recyclerView = this.f16770b;
            if (recyclerView == null || recyclerView.f16680m == null || !I()) {
                return 1;
            }
            return this.f16770b.f16680m.n();
        }

        public boolean E1(View view, int i9, Bundle bundle) {
            RecyclerView recyclerView = this.f16770b;
            return F1(recyclerView.f16662c, recyclerView.f16681m0, view, i9, bundle);
        }

        public void F(View view, int i9, p pVar) {
            D dJ0 = RecyclerView.j0(view);
            if (dJ0.y()) {
                this.f16770b.f16668g.b(dJ0);
            } else {
                this.f16770b.f16668g.p(dJ0);
            }
            this.f16769a.c(view, i9, pVar, dJ0.y());
        }

        public int F0(v vVar, A a9) {
            return 0;
        }

        public boolean F1(v vVar, A a9, View view, int i9, Bundle bundle) {
            return false;
        }

        public void G(View view, Rect rect) {
            RecyclerView recyclerView = this.f16770b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.n0(view));
            }
        }

        public int G0(View view) {
            return ((p) view.getLayoutParams()).f16794c.top;
        }

        public void G1() {
            for (int iH0 = h0() - 1; iH0 >= 0; iH0--) {
                this.f16769a.q(iH0);
            }
        }

        public abstract boolean H();

        public void H0(View view, boolean z9, Rect rect) {
            Matrix matrix;
            if (z9) {
                Rect rect2 = ((p) view.getLayoutParams()).f16794c;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f16770b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f16770b.f16678l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void H1(v vVar) {
            for (int iH0 = h0() - 1; iH0 >= 0; iH0--) {
                if (!RecyclerView.j0(g0(iH0)).M()) {
                    K1(iH0, vVar);
                }
            }
        }

        public abstract boolean I();

        public int I0() {
            return this.f16785q;
        }

        public void I1(v vVar) {
            int iJ = vVar.j();
            for (int i9 = iJ - 1; i9 >= 0; i9--) {
                View viewN = vVar.n(i9);
                D dJ0 = RecyclerView.j0(viewN);
                if (!dJ0.M()) {
                    dJ0.J(false);
                    if (dJ0.A()) {
                        this.f16770b.removeDetachedView(viewN, false);
                    }
                    l lVar = this.f16770b.f16651N;
                    if (lVar != null) {
                        lVar.j(dJ0);
                    }
                    dJ0.J(true);
                    vVar.y(viewN);
                }
            }
            vVar.e();
            if (iJ > 0) {
                this.f16770b.invalidate();
            }
        }

        public boolean J(p pVar) {
            return pVar != null;
        }

        public int J0() {
            return this.f16783o;
        }

        public void J1(View view, v vVar) {
            M1(view);
            vVar.B(view);
        }

        public boolean K0() {
            int iH0 = h0();
            for (int i9 = 0; i9 < iH0; i9++) {
                ViewGroup.LayoutParams layoutParams = g0(i9).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void K1(int i9, v vVar) {
            View viewG0 = g0(i9);
            N1(i9);
            vVar.B(viewG0);
        }

        public void L(int i9, int i10, A a9, c cVar) {
        }

        public boolean L0() {
            RecyclerView recyclerView = this.f16770b;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public boolean L1(Runnable runnable) {
            RecyclerView recyclerView = this.f16770b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void M(int i9, c cVar) {
        }

        public boolean M0() {
            return this.f16777i;
        }

        public void M1(View view) {
            this.f16769a.p(view);
        }

        public int N(A a9) {
            return 0;
        }

        public boolean N0() {
            return this.f16778j;
        }

        public void N1(int i9) {
            if (g0(i9) != null) {
                this.f16769a.q(i9);
            }
        }

        public int O(A a9) {
            return 0;
        }

        public final boolean O0(RecyclerView recyclerView, int i9, int i10) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iO = o();
            int iN = n();
            int iI0 = I0() - k();
            int iU0 = u0() - b();
            Rect rect = this.f16770b.f16674j;
            n0(focusedChild, rect);
            return rect.left - i9 < iI0 && rect.right - i9 > iO && rect.top - i10 < iU0 && rect.bottom - i10 > iN;
        }

        public boolean O1(RecyclerView recyclerView, View view, Rect rect, boolean z9) {
            return P1(recyclerView, view, rect, z9, false);
        }

        public int P(A a9) {
            return 0;
        }

        public final boolean P0() {
            return this.f16780l;
        }

        public boolean P1(RecyclerView recyclerView, View view, Rect rect, boolean z9, boolean z10) {
            int[] iArrJ0 = j0(view, rect);
            int i9 = iArrJ0[0];
            int i10 = iArrJ0[1];
            if ((z10 && !O0(recyclerView, i9, i10)) || (i9 == 0 && i10 == 0)) {
                return false;
            }
            if (z9) {
                recyclerView.scrollBy(i9, i10);
            } else {
                recyclerView.q1(i9, i10);
            }
            return true;
        }

        public int Q(A a9) {
            return 0;
        }

        public boolean Q0(v vVar, A a9) {
            return false;
        }

        public void Q1() {
            RecyclerView recyclerView = this.f16770b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int R(A a9) {
            return 0;
        }

        public boolean R0() {
            return this.f16779k;
        }

        public void R1() {
            this.f16776h = true;
        }

        public int S(A a9) {
            return 0;
        }

        public final void S1(v vVar, int i9, View view) {
            D dJ0 = RecyclerView.j0(view);
            if (dJ0.M()) {
                return;
            }
            if (dJ0.w() && !dJ0.y() && !this.f16770b.f16680m.v()) {
                N1(i9);
                vVar.C(dJ0);
            } else {
                V(i9);
                vVar.D(view);
                this.f16770b.f16668g.k(dJ0);
            }
        }

        public void T(v vVar) {
            for (int iH0 = h0() - 1; iH0 >= 0; iH0--) {
                S1(vVar, iH0, g0(iH0));
            }
        }

        public boolean T0() {
            z zVar = this.f16775g;
            return zVar != null && zVar.h();
        }

        public abstract int T1(int i9, v vVar, A a9);

        public void U(View view, v vVar) {
            S1(vVar, this.f16769a.m(view), view);
        }

        public boolean U0(View view, boolean z9, boolean z10) {
            boolean z11 = this.f16773e.b(view, 24579) && this.f16774f.b(view, 24579);
            return z9 ? z11 : !z11;
        }

        public abstract void U1(int i9);

        public void V(int i9) {
            W(i9, g0(i9));
        }

        public void V0(View view, int i9, int i10, int i11, int i12) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f16794c;
            view.layout(i9 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public abstract int V1(int i9, v vVar, A a9);

        public final void W(int i9, View view) {
            this.f16769a.d(i9);
        }

        public void W0(View view, int i9, int i10) {
            p pVar = (p) view.getLayoutParams();
            Rect rectN0 = this.f16770b.n0(view);
            int i11 = i9 + rectN0.left + rectN0.right;
            int i12 = i10 + rectN0.top + rectN0.bottom;
            int iI0 = i0(I0(), J0(), o() + k() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i11, ((ViewGroup.MarginLayoutParams) pVar).width, H());
            int iI02 = i0(u0(), v0(), n() + b() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i12, ((ViewGroup.MarginLayoutParams) pVar).height, I());
            if (d2(view, iI0, iI02, pVar)) {
                view.measure(iI0, iI02);
            }
        }

        public void W1(RecyclerView recyclerView) {
            Y1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void X(RecyclerView recyclerView) {
            this.f16777i = true;
            c1(recyclerView);
        }

        public void X0(int i9, int i10) {
            View viewG0 = g0(i9);
            if (viewG0 != null) {
                V(i9);
                E(viewG0, i10);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i9 + this.f16770b.toString());
            }
        }

        public final void X1(boolean z9) {
            if (z9 != this.f16780l) {
                this.f16780l = z9;
                this.f16781m = 0;
                RecyclerView recyclerView = this.f16770b;
                if (recyclerView != null) {
                    recyclerView.f16662c.K();
                }
            }
        }

        public void Y(RecyclerView recyclerView, v vVar) {
            this.f16777i = false;
            e1(recyclerView, vVar);
        }

        public void Y0(int i9) {
            RecyclerView recyclerView = this.f16770b;
            if (recyclerView != null) {
                recyclerView.D0(i9);
            }
        }

        public void Y1(int i9, int i10) {
            this.f16785q = View.MeasureSpec.getSize(i9);
            int mode = View.MeasureSpec.getMode(i9);
            this.f16783o = mode;
            if (mode == 0 && !RecyclerView.f16628F0) {
                this.f16785q = 0;
            }
            this.f16786r = View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.f16784p = mode2;
            if (mode2 != 0 || RecyclerView.f16628F0) {
                return;
            }
            this.f16786r = 0;
        }

        public View Z(View view) {
            View viewT;
            RecyclerView recyclerView = this.f16770b;
            if (recyclerView == null || (viewT = recyclerView.T(view)) == null || this.f16769a.n(viewT)) {
                return null;
            }
            return viewT;
        }

        public void Z0(int i9) {
            RecyclerView recyclerView = this.f16770b;
            if (recyclerView != null) {
                recyclerView.E0(i9);
            }
        }

        public void Z1(int i9, int i10) {
            this.f16770b.setMeasuredDimension(i9, i10);
        }

        public View a0(int i9) {
            int iH0 = h0();
            for (int i10 = 0; i10 < iH0; i10++) {
                View viewG0 = g0(i10);
                D dJ0 = RecyclerView.j0(viewG0);
                if (dJ0 != null && dJ0.p() == i9 && !dJ0.M() && (this.f16770b.f16681m0.h() || !dJ0.y())) {
                    return viewG0;
                }
            }
            return null;
        }

        public void a1(g gVar, g gVar2) {
        }

        public void a2(Rect rect, int i9, int i10) {
            Z1(K(i9, rect.width() + o() + k(), A0()), K(i10, rect.height() + n() + b(), z0()));
        }

        public int b() {
            RecyclerView recyclerView = this.f16770b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public abstract p b0();

        public boolean b1(RecyclerView recyclerView, ArrayList arrayList, int i9, int i10) {
            return false;
        }

        public void b2(int i9, int i10) {
            int iH0 = h0();
            if (iH0 == 0) {
                this.f16770b.x(i9, i10);
                return;
            }
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE;
            int i13 = a.e.API_PRIORITY_OTHER;
            int i14 = a.e.API_PRIORITY_OTHER;
            for (int i15 = 0; i15 < iH0; i15++) {
                View viewG0 = g0(i15);
                Rect rect = this.f16770b.f16674j;
                n0(viewG0, rect);
                int i16 = rect.left;
                if (i16 < i13) {
                    i13 = i16;
                }
                int i17 = rect.right;
                if (i17 > i11) {
                    i11 = i17;
                }
                int i18 = rect.top;
                if (i18 < i14) {
                    i14 = i18;
                }
                int i19 = rect.bottom;
                if (i19 > i12) {
                    i12 = i19;
                }
            }
            this.f16770b.f16674j.set(i13, i14, i11, i12);
            a2(this.f16770b.f16674j, i9, i10);
        }

        public int c() {
            RecyclerView recyclerView = this.f16770b;
            if (recyclerView != null) {
                return L.I(recyclerView);
            }
            return 0;
        }

        public p c0(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public void c1(RecyclerView recyclerView) {
        }

        public void c2(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f16770b = null;
                this.f16769a = null;
                height = 0;
                this.f16785q = 0;
            } else {
                this.f16770b = recyclerView;
                this.f16769a = recyclerView.f16666f;
                this.f16785q = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f16786r = height;
            this.f16783o = 1073741824;
            this.f16784p = 1073741824;
        }

        public p d0(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public void d1(RecyclerView recyclerView) {
        }

        public boolean d2(View view, int i9, int i10, p pVar) {
            return (!view.isLayoutRequested() && this.f16779k && S0(view.getWidth(), i9, ((ViewGroup.MarginLayoutParams) pVar).width) && S0(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public int e0() {
            return -1;
        }

        public void e1(RecyclerView recyclerView, v vVar) {
            d1(recyclerView);
        }

        public boolean e2() {
            return false;
        }

        public int f0(View view) {
            return ((p) view.getLayoutParams()).f16794c.bottom;
        }

        public View f1(View view, int i9, v vVar, A a9) {
            return null;
        }

        public boolean f2(View view, int i9, int i10, p pVar) {
            return (this.f16779k && S0(view.getMeasuredWidth(), i9, ((ViewGroup.MarginLayoutParams) pVar).width) && S0(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public View g0(int i9) {
            androidx.recyclerview.widget.b bVar = this.f16769a;
            if (bVar != null) {
                return bVar.f(i9);
            }
            return null;
        }

        public void g1(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f16770b;
            h1(recyclerView.f16662c, recyclerView.f16681m0, accessibilityEvent);
        }

        public abstract void g2(RecyclerView recyclerView, A a9, int i9);

        public int h0() {
            androidx.recyclerview.widget.b bVar = this.f16769a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public void h1(v vVar, A a9, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f16770b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z9 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f16770b.canScrollVertically(-1) && !this.f16770b.canScrollHorizontally(-1) && !this.f16770b.canScrollHorizontally(1)) {
                z9 = false;
            }
            accessibilityEvent.setScrollable(z9);
            g gVar = this.f16770b.f16680m;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.n());
            }
        }

        public void h2(z zVar) {
            z zVar2 = this.f16775g;
            if (zVar2 != null && zVar != zVar2 && zVar2.h()) {
                this.f16775g.r();
            }
            this.f16775g = zVar;
            zVar.q(this.f16770b, this);
        }

        public void i1(Q.C c9) {
            RecyclerView recyclerView = this.f16770b;
            j1(recyclerView.f16662c, recyclerView.f16681m0, c9);
        }

        public void i2() {
            z zVar = this.f16775g;
            if (zVar != null) {
                zVar.r();
            }
        }

        public final int[] j0(View view, Rect rect) {
            int iO = o();
            int iN = n();
            int iI0 = I0() - k();
            int iU0 = u0() - b();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i9 = left - iO;
            int iMin = Math.min(0, i9);
            int i10 = top - iN;
            int iMin2 = Math.min(0, i10);
            int i11 = iWidth - iI0;
            int iMax = Math.max(0, i11);
            int iMax2 = Math.max(0, iHeight - iU0);
            if (x0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i9, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i11);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i10, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        public void j1(v vVar, A a9, Q.C c9) {
            if (this.f16770b.canScrollVertically(-1) || this.f16770b.canScrollHorizontally(-1)) {
                c9.a(Segment.SIZE);
                c9.q0(true);
            }
            if (this.f16770b.canScrollVertically(1) || this.f16770b.canScrollHorizontally(1)) {
                c9.a(4096);
                c9.q0(true);
            }
            c9.Z(C.b.a(E0(vVar, a9), l0(vVar, a9), Q0(vVar, a9), F0(vVar, a9)));
        }

        public boolean j2() {
            return false;
        }

        public int k() {
            RecyclerView recyclerView = this.f16770b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public boolean k0() {
            RecyclerView recyclerView = this.f16770b;
            return recyclerView != null && recyclerView.f16670h;
        }

        public void k1(View view, Q.C c9) {
            D dJ0 = RecyclerView.j0(view);
            if (dJ0 == null || dJ0.y() || this.f16769a.n(dJ0.f16733a)) {
                return;
            }
            RecyclerView recyclerView = this.f16770b;
            l1(recyclerView.f16662c, recyclerView.f16681m0, view, c9);
        }

        public int l0(v vVar, A a9) {
            RecyclerView recyclerView = this.f16770b;
            if (recyclerView == null || recyclerView.f16680m == null || !H()) {
                return 1;
            }
            return this.f16770b.f16680m.n();
        }

        public void l1(v vVar, A a9, View view, Q.C c9) {
            c9.a0(C.c.a(I() ? B0(view) : 0, 1, H() ? B0(view) : 0, 1, false, false));
        }

        public int m0(View view) {
            return view.getBottom() + f0(view);
        }

        public View m1(View view, int i9) {
            return null;
        }

        public int n() {
            RecyclerView recyclerView = this.f16770b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public void n0(View view, Rect rect) {
            RecyclerView.k0(view, rect);
        }

        public void n1(RecyclerView recyclerView, int i9, int i10) {
        }

        public int o() {
            RecyclerView recyclerView = this.f16770b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int o0(View view) {
            return view.getLeft() - y0(view);
        }

        public void o1(RecyclerView recyclerView) {
        }

        public int p0(View view) {
            Rect rect = ((p) view.getLayoutParams()).f16794c;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void p1(RecyclerView recyclerView, int i9, int i10, int i11) {
        }

        public int q0(View view) {
            Rect rect = ((p) view.getLayoutParams()).f16794c;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void q1(RecyclerView recyclerView, int i9, int i10) {
        }

        public int r0(View view) {
            return view.getRight() + D0(view);
        }

        public void r1(RecyclerView recyclerView, int i9, int i10) {
        }

        public int s0(View view) {
            return view.getTop() - G0(view);
        }

        public void s1(RecyclerView recyclerView, int i9, int i10, Object obj) {
            r1(recyclerView, i9, i10);
        }

        public View t0() {
            View focusedChild;
            RecyclerView recyclerView = this.f16770b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f16769a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public abstract void t1(v vVar, A a9);

        public int u0() {
            return this.f16786r;
        }

        public void u1(A a9) {
        }

        public int v0() {
            return this.f16784p;
        }

        public void v1(v vVar, A a9, int i9, int i10) {
            this.f16770b.x(i9, i10);
        }

        public int w() {
            RecyclerView recyclerView = this.f16770b;
            if (recyclerView != null) {
                return L.J(recyclerView);
            }
            return 0;
        }

        public int w0() {
            RecyclerView recyclerView = this.f16770b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.n();
            }
            return 0;
        }

        public boolean w1(RecyclerView recyclerView, View view, View view2) {
            return T0() || recyclerView.y0();
        }

        public int x0() {
            return L.E(this.f16770b);
        }

        public boolean x1(RecyclerView recyclerView, A a9, View view, View view2) {
            return w1(recyclerView, view, view2);
        }

        public void y(View view) {
            z(view, -1);
        }

        public int y0(View view) {
            return ((p) view.getLayoutParams()).f16794c.left;
        }

        public abstract void y1(Parcelable parcelable);

        public void z(View view, int i9) {
            C(view, i9, true);
        }

        public int z0() {
            return L.F(this.f16770b);
        }

        public abstract Parcelable z1();
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public D f16793a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f16794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f16795d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f16796e;

        public p(int i9, int i10) {
            super(i9, i10);
            this.f16794c = new Rect();
            this.f16795d = true;
            this.f16796e = false;
        }

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16794c = new Rect();
            this.f16795d = true;
            this.f16796e = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16794c = new Rect();
            this.f16795d = true;
            this.f16796e = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f16794c = new Rect();
            this.f16795d = true;
            this.f16796e = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.f16794c = new Rect();
            this.f16795d = true;
            this.f16796e = false;
        }

        public int a() {
            return this.f16793a.m();
        }

        public int c() {
            return this.f16793a.p();
        }

        public boolean d() {
            return this.f16793a.B();
        }

        public boolean e() {
            return this.f16793a.y();
        }

        public boolean f() {
            return this.f16793a.w();
        }

        public boolean g() {
            return this.f16793a.C();
        }
    }

    public interface q {
        void b(View view);

        void d(View view);
    }

    public static abstract class r {
        public abstract boolean a(int i9, int i10);
    }

    public interface s {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z9);
    }

    public static abstract class t {
        public void a(RecyclerView recyclerView, int i9) {
        }

        public void b(RecyclerView recyclerView, int i9, int i10) {
        }
    }

    public static class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray f16797a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16798b = 0;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList f16799a = new ArrayList();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f16800b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f16801c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public long f16802d = 0;
        }

        public void a() {
            this.f16798b++;
        }

        public void b() {
            for (int i9 = 0; i9 < this.f16797a.size(); i9++) {
                ((a) this.f16797a.valueAt(i9)).f16799a.clear();
            }
        }

        public void c() {
            this.f16798b--;
        }

        public void d(int i9, long j9) {
            a aVarG = g(i9);
            aVarG.f16802d = j(aVarG.f16802d, j9);
        }

        public void e(int i9, long j9) {
            a aVarG = g(i9);
            aVarG.f16801c = j(aVarG.f16801c, j9);
        }

        public D f(int i9) {
            a aVar = (a) this.f16797a.get(i9);
            if (aVar == null || aVar.f16799a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f16799a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((D) arrayList.get(size)).u()) {
                    return (D) arrayList.remove(size);
                }
            }
            return null;
        }

        public final a g(int i9) {
            a aVar = (a) this.f16797a.get(i9);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f16797a.put(i9, aVar2);
            return aVar2;
        }

        public void h(g gVar, g gVar2, boolean z9) {
            if (gVar != null) {
                c();
            }
            if (!z9 && this.f16798b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(D d9) {
            int iO = d9.o();
            ArrayList arrayList = g(iO).f16799a;
            if (((a) this.f16797a.get(iO)).f16800b <= arrayList.size()) {
                return;
            }
            d9.G();
            arrayList.add(d9);
        }

        public long j(long j9, long j10) {
            return j9 == 0 ? j10 : ((j9 / 4) * 3) + (j10 / 4);
        }

        public void k(int i9, int i10) {
            a aVarG = g(i9);
            aVarG.f16800b = i10;
            ArrayList arrayList = aVarG.f16799a;
            while (arrayList.size() > i10) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        public boolean l(int i9, long j9, long j10) {
            long j11 = g(i9).f16802d;
            return j11 == 0 || j9 + j11 < j10;
        }

        public boolean m(int i9, long j9, long j10) {
            long j11 = g(i9).f16801c;
            return j11 == 0 || j9 + j11 < j10;
        }
    }

    public final class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f16803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f16804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f16805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f16806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f16808f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public u f16809g;

        public v() {
            ArrayList arrayList = new ArrayList();
            this.f16803a = arrayList;
            this.f16804b = null;
            this.f16805c = new ArrayList();
            this.f16806d = Collections.unmodifiableList(arrayList);
            this.f16807e = 2;
            this.f16808f = 2;
        }

        public void A(int i9) {
            a((D) this.f16805c.get(i9), true);
            this.f16805c.remove(i9);
        }

        public void B(View view) {
            D dJ0 = RecyclerView.j0(view);
            if (dJ0.A()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (dJ0.z()) {
                dJ0.N();
            } else if (dJ0.O()) {
                dJ0.h();
            }
            C(dJ0);
            if (RecyclerView.this.f16651N == null || dJ0.x()) {
                return;
            }
            RecyclerView.this.f16651N.j(dJ0);
        }

        public void C(D d9) {
            boolean z9;
            boolean z10 = true;
            if (d9.z() || d9.f16733a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d9.z());
                sb.append(" isAttached:");
                sb.append(d9.f16733a.getParent() != null);
                sb.append(RecyclerView.this.Q());
                throw new IllegalArgumentException(sb.toString());
            }
            if (d9.A()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d9 + RecyclerView.this.Q());
            }
            if (d9.M()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.Q());
            }
            boolean zK = d9.k();
            g gVar = RecyclerView.this.f16680m;
            if ((gVar != null && zK && gVar.T(d9)) || d9.x()) {
                if (this.f16808f <= 0 || d9.s(526)) {
                    z9 = false;
                } else {
                    int size = this.f16805c.size();
                    if (size >= this.f16808f && size > 0) {
                        A(0);
                        size--;
                    }
                    if (RecyclerView.f16630H0 && size > 0 && !RecyclerView.this.f16679l0.d(d9.f16735c)) {
                        int i9 = size - 1;
                        while (i9 >= 0) {
                            if (!RecyclerView.this.f16679l0.d(((D) this.f16805c.get(i9)).f16735c)) {
                                break;
                            } else {
                                i9--;
                            }
                        }
                        size = i9 + 1;
                    }
                    this.f16805c.add(size, d9);
                    z9 = true;
                }
                if (z9) {
                    z = z9;
                    z10 = false;
                } else {
                    a(d9, true);
                    z = z9;
                }
            } else {
                z10 = false;
            }
            RecyclerView.this.f16668g.q(d9);
            if (z || z10 || !zK) {
                return;
            }
            d9.f16750r = null;
        }

        public void D(View view) {
            ArrayList arrayList;
            D dJ0 = RecyclerView.j0(view);
            if (!dJ0.s(12) && dJ0.B() && !RecyclerView.this.q(dJ0)) {
                if (this.f16804b == null) {
                    this.f16804b = new ArrayList();
                }
                dJ0.K(this, true);
                arrayList = this.f16804b;
            } else {
                if (dJ0.w() && !dJ0.y() && !RecyclerView.this.f16680m.v()) {
                    throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.Q());
                }
                dJ0.K(this, false);
                arrayList = this.f16803a;
            }
            arrayList.add(dJ0);
        }

        public void E(u uVar) {
            u uVar2 = this.f16809g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.f16809g = uVar;
            if (uVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f16809g.a();
        }

        public void F(B b9) {
        }

        public void G(int i9) {
            this.f16807e = i9;
            K();
        }

        public final boolean H(D d9, int i9, int i10, long j9) {
            d9.f16750r = RecyclerView.this;
            int iO = d9.o();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j9 != Long.MAX_VALUE && !this.f16809g.l(iO, nanoTime, j9)) {
                return false;
            }
            RecyclerView.this.f16680m.k(d9, i9);
            this.f16809g.d(d9.o(), RecyclerView.this.getNanoTime() - nanoTime);
            b(d9);
            if (!RecyclerView.this.f16681m0.h()) {
                return true;
            }
            d9.f16739g = i10;
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00f5 A[PHI: r1 r4
          0x00f5: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$D) = (r1v11 androidx.recyclerview.widget.RecyclerView$D), (r1v30 androidx.recyclerview.widget.RecyclerView$D) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]
          0x00f5: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01cd A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x01d0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.D I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instruction units count: 524
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$D");
        }

        public void J(D d9) {
            (d9.f16747o ? this.f16804b : this.f16803a).remove(d9);
            d9.f16746n = null;
            d9.f16747o = false;
            d9.h();
        }

        public void K() {
            o oVar = RecyclerView.this.f16682n;
            this.f16808f = this.f16807e + (oVar != null ? oVar.f16781m : 0);
            for (int size = this.f16805c.size() - 1; size >= 0 && this.f16805c.size() > this.f16808f; size--) {
                A(size);
            }
        }

        public boolean L(D d9) {
            if (d9.y()) {
                return RecyclerView.this.f16681m0.h();
            }
            int i9 = d9.f16735c;
            if (i9 >= 0 && i9 < RecyclerView.this.f16680m.n()) {
                if (RecyclerView.this.f16681m0.h() || RecyclerView.this.f16680m.p(d9.f16735c) == d9.o()) {
                    return !RecyclerView.this.f16680m.v() || d9.n() == RecyclerView.this.f16680m.o(d9.f16735c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d9 + RecyclerView.this.Q());
        }

        public void M(int i9, int i10) {
            int i11;
            int i12 = i10 + i9;
            for (int size = this.f16805c.size() - 1; size >= 0; size--) {
                D d9 = (D) this.f16805c.get(size);
                if (d9 != null && (i11 = d9.f16735c) >= i9 && i11 < i12) {
                    d9.e(2);
                    A(size);
                }
            }
        }

        public void a(D d9, boolean z9) {
            RecyclerView.s(d9);
            View view = d9.f16733a;
            androidx.recyclerview.widget.l lVar = RecyclerView.this.f16695t0;
            if (lVar != null) {
                C0959a c0959aN = lVar.n();
                L.s0(view, c0959aN instanceof l.a ? ((l.a) c0959aN).n(view) : null);
            }
            if (z9) {
                g(d9);
            }
            d9.f16750r = null;
            i().i(d9);
        }

        public final void b(D d9) {
            if (RecyclerView.this.x0()) {
                View view = d9.f16733a;
                if (L.C(view) == 0) {
                    L.C0(view, 1);
                }
                androidx.recyclerview.widget.l lVar = RecyclerView.this.f16695t0;
                if (lVar == null) {
                    return;
                }
                C0959a c0959aN = lVar.n();
                if (c0959aN instanceof l.a) {
                    ((l.a) c0959aN).o(view);
                }
                L.s0(view, c0959aN);
            }
        }

        public void c() {
            this.f16803a.clear();
            z();
        }

        public void d() {
            int size = this.f16805c.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((D) this.f16805c.get(i9)).f();
            }
            int size2 = this.f16803a.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((D) this.f16803a.get(i10)).f();
            }
            ArrayList arrayList = this.f16804b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    ((D) this.f16804b.get(i11)).f();
                }
            }
        }

        public void e() {
            this.f16803a.clear();
            ArrayList arrayList = this.f16804b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i9) {
            if (i9 >= 0 && i9 < RecyclerView.this.f16681m0.c()) {
                return !RecyclerView.this.f16681m0.h() ? i9 : RecyclerView.this.f16664e.m(i9);
            }
            throw new IndexOutOfBoundsException("invalid position " + i9 + ". State item count is " + RecyclerView.this.f16681m0.c() + RecyclerView.this.Q());
        }

        public void g(D d9) {
            w wVar = RecyclerView.this.f16684o;
            if (wVar != null) {
                wVar.a(d9);
            }
            g gVar = RecyclerView.this.f16680m;
            if (gVar != null) {
                gVar.Z(d9);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f16681m0 != null) {
                recyclerView.f16668g.q(d9);
            }
        }

        public D h(int i9) {
            int size;
            int iM;
            ArrayList arrayList = this.f16804b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i10 = 0; i10 < size; i10++) {
                    D d9 = (D) this.f16804b.get(i10);
                    if (!d9.O() && d9.p() == i9) {
                        d9.e(32);
                        return d9;
                    }
                }
                if (RecyclerView.this.f16680m.v() && (iM = RecyclerView.this.f16664e.m(i9)) > 0 && iM < RecyclerView.this.f16680m.n()) {
                    long jO = RecyclerView.this.f16680m.o(iM);
                    for (int i11 = 0; i11 < size; i11++) {
                        D d10 = (D) this.f16804b.get(i11);
                        if (!d10.O() && d10.n() == jO) {
                            d10.e(32);
                            return d10;
                        }
                    }
                }
            }
            return null;
        }

        public u i() {
            if (this.f16809g == null) {
                this.f16809g = new u();
            }
            return this.f16809g;
        }

        public int j() {
            return this.f16803a.size();
        }

        public List k() {
            return this.f16806d;
        }

        public D l(long j9, int i9, boolean z9) {
            for (int size = this.f16803a.size() - 1; size >= 0; size--) {
                D d9 = (D) this.f16803a.get(size);
                if (d9.n() == j9 && !d9.O()) {
                    if (i9 == d9.o()) {
                        d9.e(32);
                        if (d9.y() && !RecyclerView.this.f16681m0.h()) {
                            d9.I(2, 14);
                        }
                        return d9;
                    }
                    if (!z9) {
                        this.f16803a.remove(size);
                        RecyclerView.this.removeDetachedView(d9.f16733a, false);
                        y(d9.f16733a);
                    }
                }
            }
            int size2 = this.f16805c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                D d10 = (D) this.f16805c.get(size2);
                if (d10.n() == j9 && !d10.u()) {
                    if (i9 == d10.o()) {
                        if (!z9) {
                            this.f16805c.remove(size2);
                        }
                        return d10;
                    }
                    if (!z9) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        public D m(int i9, boolean z9) {
            View viewE;
            int size = this.f16803a.size();
            for (int i10 = 0; i10 < size; i10++) {
                D d9 = (D) this.f16803a.get(i10);
                if (!d9.O() && d9.p() == i9 && !d9.w() && (RecyclerView.this.f16681m0.f16715h || !d9.y())) {
                    d9.e(32);
                    return d9;
                }
            }
            if (z9 || (viewE = RecyclerView.this.f16666f.e(i9)) == null) {
                int size2 = this.f16805c.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    D d10 = (D) this.f16805c.get(i11);
                    if (!d10.w() && d10.p() == i9 && !d10.u()) {
                        if (!z9) {
                            this.f16805c.remove(i11);
                        }
                        return d10;
                    }
                }
                return null;
            }
            D dJ0 = RecyclerView.j0(viewE);
            RecyclerView.this.f16666f.s(viewE);
            int iM = RecyclerView.this.f16666f.m(viewE);
            if (iM != -1) {
                RecyclerView.this.f16666f.d(iM);
                D(viewE);
                dJ0.e(8224);
                return dJ0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + dJ0 + RecyclerView.this.Q());
        }

        public View n(int i9) {
            return ((D) this.f16803a.get(i9)).f16733a;
        }

        public View o(int i9) {
            return p(i9, false);
        }

        public View p(int i9, boolean z9) {
            return I(i9, z9, Long.MAX_VALUE).f16733a;
        }

        public final void q(ViewGroup viewGroup, boolean z9) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z9) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void r(D d9) {
            View view = d9.f16733a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public void s() {
            int size = this.f16805c.size();
            for (int i9 = 0; i9 < size; i9++) {
                p pVar = (p) ((D) this.f16805c.get(i9)).f16733a.getLayoutParams();
                if (pVar != null) {
                    pVar.f16795d = true;
                }
            }
        }

        public void t() {
            int size = this.f16805c.size();
            for (int i9 = 0; i9 < size; i9++) {
                D d9 = (D) this.f16805c.get(i9);
                if (d9 != null) {
                    d9.e(6);
                    d9.d(null);
                }
            }
            g gVar = RecyclerView.this.f16680m;
            if (gVar == null || !gVar.v()) {
                z();
            }
        }

        public void u(int i9, int i10) {
            int size = this.f16805c.size();
            for (int i11 = 0; i11 < size; i11++) {
                D d9 = (D) this.f16805c.get(i11);
                if (d9 != null && d9.f16735c >= i9) {
                    d9.D(i10, true);
                }
            }
        }

        public void v(int i9, int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (i9 < i10) {
                i11 = -1;
                i13 = i9;
                i12 = i10;
            } else {
                i11 = 1;
                i12 = i9;
                i13 = i10;
            }
            int size = this.f16805c.size();
            for (int i15 = 0; i15 < size; i15++) {
                D d9 = (D) this.f16805c.get(i15);
                if (d9 != null && (i14 = d9.f16735c) >= i13 && i14 <= i12) {
                    if (i14 == i9) {
                        d9.D(i10 - i9, false);
                    } else {
                        d9.D(i11, false);
                    }
                }
            }
        }

        public void w(int i9, int i10, boolean z9) {
            int i11 = i9 + i10;
            for (int size = this.f16805c.size() - 1; size >= 0; size--) {
                D d9 = (D) this.f16805c.get(size);
                if (d9 != null) {
                    int i12 = d9.f16735c;
                    if (i12 >= i11) {
                        d9.D(-i10, z9);
                    } else if (i12 >= i9) {
                        d9.e(8);
                        A(size);
                    }
                }
            }
        }

        public void x(g gVar, g gVar2, boolean z9) {
            c();
            i().h(gVar, gVar2, z9);
        }

        public void y(View view) {
            D dJ0 = RecyclerView.j0(view);
            dJ0.f16746n = null;
            dJ0.f16747o = false;
            dJ0.h();
            C(dJ0);
        }

        public void z() {
            for (int size = this.f16805c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f16805c.clear();
            if (RecyclerView.f16630H0) {
                RecyclerView.this.f16679l0.b();
            }
        }
    }

    public interface w {
        void a(D d9);
    }

    public class x extends i {
        public x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            RecyclerView.this.p(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f16681m0.f16714g = true;
            recyclerView.T0(true);
            if (RecyclerView.this.f16664e.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void c(int i9, int i10, Object obj) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f16664e.r(i9, i10, obj)) {
                f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void d(int i9, int i10, int i11) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f16664e.s(i9, i10, i11)) {
                f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void e(int i9, int i10) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f16664e.t(i9, i10)) {
                f();
            }
        }

        public void f() {
            if (RecyclerView.f16629G0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f16694t && recyclerView.f16692s) {
                    L.k0(recyclerView, recyclerView.f16672i);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f16637B = true;
            recyclerView2.requestLayout();
        }
    }

    public static class y extends V.a {
        public static final Parcelable.Creator<y> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Parcelable f16812d;

        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public y createFromParcel(Parcel parcel) {
                return new y(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new y(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public y[] newArray(int i9) {
                return new y[i9];
            }
        }

        public y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f16812d = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        public y(Parcelable parcelable) {
            super(parcelable);
        }

        public void c(y yVar) {
            this.f16812d = yVar.f16812d;
        }

        @Override // V.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            super.writeToParcel(parcel, i9);
            parcel.writeParcelable(this.f16812d, 0);
        }
    }

    public static abstract class z {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView f16814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o f16815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f16816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f16817e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f16818f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f16820h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16813a = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final a f16819g = new a(0, 0);

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f16821a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f16822b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f16823c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f16824d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Interpolator f16825e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f16826f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f16827g;

            public a(int i9, int i10) {
                this(i9, i10, Integer.MIN_VALUE, null);
            }

            public a(int i9, int i10, int i11, Interpolator interpolator) {
                this.f16824d = -1;
                this.f16826f = false;
                this.f16827g = 0;
                this.f16821a = i9;
                this.f16822b = i10;
                this.f16823c = i11;
                this.f16825e = interpolator;
            }

            public boolean a() {
                return this.f16824d >= 0;
            }

            public void b(int i9) {
                this.f16824d = i9;
            }

            public void c(RecyclerView recyclerView) {
                int i9 = this.f16824d;
                if (i9 >= 0) {
                    this.f16824d = -1;
                    recyclerView.A0(i9);
                    this.f16826f = false;
                } else {
                    if (!this.f16826f) {
                        this.f16827g = 0;
                        return;
                    }
                    e();
                    recyclerView.f16675j0.f(this.f16821a, this.f16822b, this.f16823c, this.f16825e);
                    int i10 = this.f16827g + 1;
                    this.f16827g = i10;
                    if (i10 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f16826f = false;
                }
            }

            public void d(int i9, int i10, int i11, Interpolator interpolator) {
                this.f16821a = i9;
                this.f16822b = i10;
                this.f16823c = i11;
                this.f16825e = interpolator;
                this.f16826f = true;
            }

            public final void e() {
                if (this.f16825e != null && this.f16823c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f16823c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }
        }

        public interface b {
            PointF e(int i9);
        }

        public PointF a(int i9) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).e(i9);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i9) {
            return this.f16814b.f16682n.a0(i9);
        }

        public int c() {
            return this.f16814b.f16682n.h0();
        }

        public int d(View view) {
            return this.f16814b.h0(view);
        }

        public o e() {
            return this.f16815c;
        }

        public int f() {
            return this.f16813a;
        }

        public boolean g() {
            return this.f16816d;
        }

        public boolean h() {
            return this.f16817e;
        }

        public void i(PointF pointF) {
            float f9 = pointF.x;
            float f10 = pointF.y;
            float fSqrt = (float) Math.sqrt((f9 * f9) + (f10 * f10));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void j(int i9, int i10) {
            PointF pointFA;
            RecyclerView recyclerView = this.f16814b;
            if (this.f16813a == -1 || recyclerView == null) {
                r();
            }
            if (this.f16816d && this.f16818f == null && this.f16815c != null && (pointFA = a(this.f16813a)) != null) {
                float f9 = pointFA.x;
                if (f9 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.l1((int) Math.signum(f9), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f16816d = false;
            View view = this.f16818f;
            if (view != null) {
                if (d(view) == this.f16813a) {
                    o(this.f16818f, recyclerView.f16681m0, this.f16819g);
                    this.f16819g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f16818f = null;
                }
            }
            if (this.f16817e) {
                l(i9, i10, recyclerView.f16681m0, this.f16819g);
                boolean zA = this.f16819g.a();
                this.f16819g.c(recyclerView);
                if (zA && this.f16817e) {
                    this.f16816d = true;
                    recyclerView.f16675j0.e();
                }
            }
        }

        public void k(View view) {
            if (d(view) == f()) {
                this.f16818f = view;
            }
        }

        public abstract void l(int i9, int i10, A a9, a aVar);

        public abstract void m();

        public abstract void n();

        public abstract void o(View view, A a9, a aVar);

        public void p(int i9) {
            this.f16813a = i9;
        }

        public void q(RecyclerView recyclerView, o oVar) {
            recyclerView.f16675j0.g();
            if (this.f16820h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f16814b = recyclerView;
            this.f16815c = oVar;
            int i9 = this.f16813a;
            if (i9 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f16681m0.f16708a = i9;
            this.f16817e = true;
            this.f16816d = true;
            this.f16818f = b(f());
            m();
            this.f16814b.f16675j0.e();
            this.f16820h = true;
        }

        public final void r() {
            if (this.f16817e) {
                this.f16817e = false;
                n();
                this.f16814b.f16681m0.f16708a = -1;
                this.f16818f = null;
                this.f16813a = -1;
                this.f16816d = false;
                this.f16815c.B1(this);
                this.f16815c = null;
                this.f16814b = null;
            }
        }
    }

    static {
        int i9 = Build.VERSION.SDK_INT;
        f16627E0 = false;
        f16628F0 = i9 >= 23;
        f16629G0 = true;
        f16630H0 = true;
        f16631I0 = false;
        f16632J0 = false;
        Class cls = Integer.TYPE;
        f16633K0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f16634L0 = new InterpolatorC1189c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A0.a.f20a);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f16661a = new x();
        this.f16662c = new v();
        this.f16668g = new androidx.recyclerview.widget.q();
        this.f16672i = new RunnableC1187a();
        this.f16674j = new Rect();
        this.f16676k = new Rect();
        this.f16678l = new RectF();
        this.f16686p = new ArrayList();
        this.f16688q = new ArrayList();
        this.f16700w = 0;
        this.f16642E = false;
        this.f16643F = false;
        this.f16644G = 0;
        this.f16645H = 0;
        this.f16646I = new k();
        this.f16651N = new c();
        this.f16652O = 0;
        this.f16653P = -1;
        this.f16669g0 = Float.MIN_VALUE;
        this.f16671h0 = Float.MIN_VALUE;
        this.f16673i0 = true;
        this.f16675j0 = new C();
        this.f16679l0 = f16630H0 ? new e.b() : null;
        this.f16681m0 = new A();
        this.f16687p0 = false;
        this.f16689q0 = false;
        this.f16691r0 = new m();
        this.f16693s0 = false;
        this.f16699v0 = new int[2];
        this.f16703x0 = new int[2];
        this.f16705y0 = new int[2];
        this.f16707z0 = new int[2];
        this.f16636A0 = new ArrayList();
        this.f16638B0 = new RunnableC1188b();
        this.f16640C0 = new C1190d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f16659V = viewConfiguration.getScaledTouchSlop();
        this.f16669g0 = N.b(viewConfiguration, context);
        this.f16671h0 = N.d(viewConfiguration, context);
        this.f16665e0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f16667f0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f16651N.w(this.f16691r0);
        s0();
        u0();
        t0();
        if (L.C(this) == 0) {
            L.C0(this, 1);
        }
        this.f16639C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.l(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0.d.f33f, i9, 0);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            saveAttributeDataForStyleable(context, A0.d.f33f, attributeSet, typedArrayObtainStyledAttributes, i9, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(A0.d.f42o);
        if (typedArrayObtainStyledAttributes.getInt(A0.d.f36i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f16670h = typedArrayObtainStyledAttributes.getBoolean(A0.d.f35h, true);
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(A0.d.f37j, false);
        this.f16696u = z9;
        if (z9) {
            v0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(A0.d.f40m), typedArrayObtainStyledAttributes.getDrawable(A0.d.f41n), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(A0.d.f38k), typedArrayObtainStyledAttributes.getDrawable(A0.d.f39l));
        }
        typedArrayObtainStyledAttributes.recycle();
        w(context, string, attributeSet, i9, 0);
        int[] iArr = f16626D0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i9, 0);
        if (i10 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i9, 0);
        }
        boolean z10 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
    }

    public static RecyclerView X(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            RecyclerView recyclerViewX = X(viewGroup.getChildAt(i9));
            if (recyclerViewX != null) {
                return recyclerViewX;
            }
        }
        return null;
    }

    private P.A getScrollingChildHelper() {
        if (this.f16701w0 == null) {
            this.f16701w0 = new P.A(this);
        }
        return this.f16701w0;
    }

    public static D j0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f16793a;
    }

    public static void k0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f16794c;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    public static void s(D d9) {
        WeakReference weakReference = d9.f16734b;
        if (weakReference != null) {
            Object parent = weakReference.get();
            while (true) {
                for (View view = (View) parent; view != null; view = null) {
                    if (view == d9.f16733a) {
                        return;
                    }
                    parent = view.getParent();
                    if (parent instanceof View) {
                        break;
                    }
                }
                d9.f16734b = null;
                return;
            }
        }
    }

    public void A(View view) {
        D dJ0 = j0(view);
        J0(view);
        g gVar = this.f16680m;
        if (gVar != null && dJ0 != null) {
            gVar.Y(dJ0);
        }
        List list = this.f16641D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((q) this.f16641D.get(size)).b(view);
            }
        }
    }

    public void A0(int i9) {
        if (this.f16682n == null) {
            return;
        }
        setScrollState(2);
        this.f16682n.U1(i9);
        awakenScrollBars();
    }

    public final void A1() {
        this.f16675j0.g();
        o oVar = this.f16682n;
        if (oVar != null) {
            oVar.i2();
        }
    }

    public final void B() {
        int i9 = this.f16635A;
        this.f16635A = 0;
        if (i9 == 0 || !x0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        AbstractC1010b.b(accessibilityEventObtain, i9);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    public void B0() {
        int iJ = this.f16666f.j();
        for (int i9 = 0; i9 < iJ; i9++) {
            ((p) this.f16666f.i(i9).getLayoutParams()).f16795d = true;
        }
        this.f16662c.s();
    }

    public void B1(int i9, int i10, Object obj) {
        int i11;
        int iJ = this.f16666f.j();
        int i12 = i9 + i10;
        for (int i13 = 0; i13 < iJ; i13++) {
            View viewI = this.f16666f.i(i13);
            D dJ0 = j0(viewI);
            if (dJ0 != null && !dJ0.M() && (i11 = dJ0.f16735c) >= i9 && i11 < i12) {
                dJ0.e(2);
                dJ0.d(obj);
                ((p) viewI.getLayoutParams()).f16795d = true;
            }
        }
        this.f16662c.M(i9, i10);
    }

    public void C() {
        String str;
        if (this.f16680m == null) {
            str = "No adapter attached; skipping layout";
        } else {
            if (this.f16682n != null) {
                A a9 = this.f16681m0;
                a9.f16717j = false;
                if (a9.f16712e != 1) {
                    if (!this.f16664e.q() && this.f16682n.I0() == getWidth() && this.f16682n.u0() == getHeight()) {
                        this.f16682n.W1(this);
                    }
                    F();
                    return;
                }
                D();
                this.f16682n.W1(this);
                E();
                F();
                return;
            }
            str = "No layout manager attached; skipping layout";
        }
        Log.e("RecyclerView", str);
    }

    public void C0() {
        int iJ = this.f16666f.j();
        for (int i9 = 0; i9 < iJ; i9++) {
            D dJ0 = j0(this.f16666f.i(i9));
            if (dJ0 != null && !dJ0.M()) {
                dJ0.e(6);
            }
        }
        B0();
        this.f16662c.t();
    }

    public final void D() {
        this.f16681m0.a(1);
        R(this.f16681m0);
        this.f16681m0.f16717j = false;
        v1();
        this.f16668g.f();
        K0();
        S0();
        i1();
        A a9 = this.f16681m0;
        a9.f16716i = a9.f16718k && this.f16689q0;
        this.f16689q0 = false;
        this.f16687p0 = false;
        a9.f16715h = a9.f16719l;
        a9.f16713f = this.f16680m.n();
        W(this.f16699v0);
        if (this.f16681m0.f16718k) {
            int iG = this.f16666f.g();
            for (int i9 = 0; i9 < iG; i9++) {
                D dJ0 = j0(this.f16666f.f(i9));
                if (!dJ0.M() && (!dJ0.w() || this.f16680m.v())) {
                    this.f16668g.e(dJ0, this.f16651N.u(this.f16681m0, dJ0, l.e(dJ0), dJ0.r()));
                    if (this.f16681m0.f16716i && dJ0.B() && !dJ0.y() && !dJ0.M() && !dJ0.w()) {
                        this.f16668g.c(f0(dJ0), dJ0);
                    }
                }
            }
        }
        if (this.f16681m0.f16719l) {
            j1();
            A a10 = this.f16681m0;
            boolean z9 = a10.f16714g;
            a10.f16714g = false;
            this.f16682n.t1(this.f16662c, a10);
            this.f16681m0.f16714g = z9;
            for (int i10 = 0; i10 < this.f16666f.g(); i10++) {
                D dJ02 = j0(this.f16666f.f(i10));
                if (!dJ02.M() && !this.f16668g.i(dJ02)) {
                    int iE = l.e(dJ02);
                    boolean zS = dJ02.s(Segment.SIZE);
                    if (!zS) {
                        iE |= 4096;
                    }
                    l.c cVarU = this.f16651N.u(this.f16681m0, dJ02, iE, dJ02.r());
                    if (zS) {
                        V0(dJ02, cVarU);
                    } else {
                        this.f16668g.a(dJ02, cVarU);
                    }
                }
            }
        }
        t();
        L0();
        x1(false);
        this.f16681m0.f16712e = 2;
    }

    public void D0(int i9) {
        int iG = this.f16666f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            this.f16666f.f(i10).offsetLeftAndRight(i9);
        }
    }

    public final void E() {
        v1();
        K0();
        this.f16681m0.a(6);
        this.f16664e.j();
        this.f16681m0.f16713f = this.f16680m.n();
        A a9 = this.f16681m0;
        a9.f16711d = 0;
        a9.f16715h = false;
        this.f16682n.t1(this.f16662c, a9);
        A a10 = this.f16681m0;
        a10.f16714g = false;
        this.f16663d = null;
        a10.f16718k = a10.f16718k && this.f16651N != null;
        a10.f16712e = 4;
        L0();
        x1(false);
    }

    public void E0(int i9) {
        int iG = this.f16666f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            this.f16666f.f(i10).offsetTopAndBottom(i9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F() {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.F():void");
    }

    public void F0(int i9, int i10) {
        int iJ = this.f16666f.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            D dJ0 = j0(this.f16666f.i(i11));
            if (dJ0 != null && !dJ0.M() && dJ0.f16735c >= i9) {
                dJ0.D(i10, false);
                this.f16681m0.f16714g = true;
            }
        }
        this.f16662c.u(i9, i10);
        requestLayout();
    }

    public boolean G(int i9, int i10, int[] iArr, int[] iArr2, int i11) {
        return getScrollingChildHelper().d(i9, i10, iArr, iArr2, i11);
    }

    public void G0(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int iJ = this.f16666f.j();
        if (i9 < i10) {
            i13 = -1;
            i12 = i9;
            i11 = i10;
        } else {
            i11 = i9;
            i12 = i10;
            i13 = 1;
        }
        for (int i15 = 0; i15 < iJ; i15++) {
            D dJ0 = j0(this.f16666f.i(i15));
            if (dJ0 != null && (i14 = dJ0.f16735c) >= i12 && i14 <= i11) {
                if (i14 == i9) {
                    dJ0.D(i10 - i9, false);
                } else {
                    dJ0.D(i13, false);
                }
                this.f16681m0.f16714g = true;
            }
        }
        this.f16662c.v(i9, i10);
        requestLayout();
    }

    public final void H(int i9, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        getScrollingChildHelper().e(i9, i10, i11, i12, iArr, i13, iArr2);
    }

    public void H0(int i9, int i10, boolean z9) {
        int i11 = i9 + i10;
        int iJ = this.f16666f.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            D dJ0 = j0(this.f16666f.i(i12));
            if (dJ0 != null && !dJ0.M()) {
                int i13 = dJ0.f16735c;
                if (i13 >= i11) {
                    dJ0.D(-i10, z9);
                } else if (i13 >= i9) {
                    dJ0.l(i9 - 1, -i10, z9);
                }
                this.f16681m0.f16714g = true;
            }
        }
        this.f16662c.w(i9, i10, z9);
        requestLayout();
    }

    public void I(int i9) {
        o oVar = this.f16682n;
        if (oVar != null) {
            oVar.A1(i9);
        }
        O0(i9);
        t tVar = this.f16683n0;
        if (tVar != null) {
            tVar.a(this, i9);
        }
        List list = this.f16685o0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((t) this.f16685o0.get(size)).a(this, i9);
            }
        }
    }

    public void I0(View view) {
    }

    public void J(int i9, int i10) {
        this.f16645H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i9, scrollY - i10);
        P0(i9, i10);
        t tVar = this.f16683n0;
        if (tVar != null) {
            tVar.b(this, i9, i10);
        }
        List list = this.f16685o0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((t) this.f16685o0.get(size)).b(this, i9, i10);
            }
        }
        this.f16645H--;
    }

    public void J0(View view) {
    }

    public void K() {
        int i9;
        for (int size = this.f16636A0.size() - 1; size >= 0; size--) {
            D d9 = (D) this.f16636A0.get(size);
            if (d9.f16733a.getParent() == this && !d9.M() && (i9 = d9.f16749q) != -1) {
                L.C0(d9.f16733a, i9);
                d9.f16749q = -1;
            }
        }
        this.f16636A0.clear();
    }

    public void K0() {
        this.f16644G++;
    }

    public final boolean L(MotionEvent motionEvent) {
        s sVar = this.f16690r;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return V(motionEvent);
        }
        sVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f16690r = null;
        }
        return true;
    }

    public void L0() {
        M0(true);
    }

    public void M() {
        int measuredWidth;
        int measuredHeight;
        if (this.f16650M != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f16646I.a(this, 3);
        this.f16650M = edgeEffectA;
        if (this.f16670h) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectA.setSize(measuredWidth, measuredHeight);
    }

    public void M0(boolean z9) {
        int i9 = this.f16644G - 1;
        this.f16644G = i9;
        if (i9 < 1) {
            this.f16644G = 0;
            if (z9) {
                B();
                K();
            }
        }
    }

    public void N() {
        int measuredHeight;
        int measuredWidth;
        if (this.f16647J != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f16646I.a(this, 0);
        this.f16647J = edgeEffectA;
        if (this.f16670h) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectA.setSize(measuredHeight, measuredWidth);
    }

    public final void N0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f16653P) {
            int i9 = actionIndex == 0 ? 1 : 0;
            this.f16653P = motionEvent.getPointerId(i9);
            int x9 = (int) (motionEvent.getX(i9) + 0.5f);
            this.f16657T = x9;
            this.f16655R = x9;
            int y9 = (int) (motionEvent.getY(i9) + 0.5f);
            this.f16658U = y9;
            this.f16656S = y9;
        }
    }

    public void O() {
        int measuredHeight;
        int measuredWidth;
        if (this.f16649L != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f16646I.a(this, 2);
        this.f16649L = edgeEffectA;
        if (this.f16670h) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectA.setSize(measuredHeight, measuredWidth);
    }

    public void O0(int i9) {
    }

    public void P() {
        int measuredWidth;
        int measuredHeight;
        if (this.f16648K != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f16646I.a(this, 1);
        this.f16648K = edgeEffectA;
        if (this.f16670h) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectA.setSize(measuredWidth, measuredHeight);
    }

    public void P0(int i9, int i10) {
    }

    public String Q() {
        return " " + super.toString() + ", adapter:" + this.f16680m + ", layout:" + this.f16682n + ", context:" + getContext();
    }

    public void Q0() {
        if (this.f16693s0 || !this.f16692s) {
            return;
        }
        L.k0(this, this.f16638B0);
        this.f16693s0 = true;
    }

    public final void R(A a9) {
        if (getScrollState() != 2) {
            a9.f16723p = 0;
            a9.f16724q = 0;
        } else {
            OverScroller overScroller = this.f16675j0.f16727d;
            a9.f16723p = overScroller.getFinalX() - overScroller.getCurrX();
            a9.f16724q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public final boolean R0() {
        return this.f16651N != null && this.f16682n.j2();
    }

    public View S(float f9, float f10) {
        for (int iG = this.f16666f.g() - 1; iG >= 0; iG--) {
            View viewF = this.f16666f.f(iG);
            float translationX = viewF.getTranslationX();
            float translationY = viewF.getTranslationY();
            if (f9 >= viewF.getLeft() + translationX && f9 <= viewF.getRight() + translationX && f10 >= viewF.getTop() + translationY && f10 <= viewF.getBottom() + translationY) {
                return viewF;
            }
        }
        return null;
    }

    public final void S0() {
        boolean z9;
        if (this.f16642E) {
            this.f16664e.x();
            if (this.f16643F) {
                this.f16682n.o1(this);
            }
        }
        if (R0()) {
            this.f16664e.v();
        } else {
            this.f16664e.j();
        }
        boolean z10 = this.f16687p0 || this.f16689q0;
        this.f16681m0.f16718k = this.f16698v && this.f16651N != null && ((z9 = this.f16642E) || z10 || this.f16682n.f16776h) && (!z9 || this.f16680m.v());
        A a9 = this.f16681m0;
        a9.f16719l = a9.f16718k && z10 && !this.f16642E && R0();
    }

    public View T(View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public void T0(boolean z9) {
        this.f16643F = z9 | this.f16643F;
        this.f16642E = true;
        C0();
    }

    public D U(View view) {
        View viewT = T(view);
        if (viewT == null) {
            return null;
        }
        return i0(viewT);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.N()
            android.widget.EdgeEffect r3 = r6.f16647J
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L1c:
            T.d.c(r3, r4, r9)
            r9 = 1
            goto L39
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L38
            r6.O()
            android.widget.EdgeEffect r3 = r6.f16649L
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L1c
        L38:
            r9 = 0
        L39:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L53
            r6.P()
            android.widget.EdgeEffect r9 = r6.f16648K
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            T.d.c(r9, r0, r7)
            goto L6f
        L53:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L6e
            r6.M()
            android.widget.EdgeEffect r9 = r6.f16650M
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            T.d.c(r9, r3, r0)
            goto L6f
        L6e:
            r1 = r9
        L6f:
            if (r1 != 0) goto L79
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L79
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7c
        L79:
            P.L.j0(r6)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.U0(float, float, float, float):void");
    }

    public final boolean V(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f16688q.size();
        for (int i9 = 0; i9 < size; i9++) {
            s sVar = (s) this.f16688q.get(i9);
            if (sVar.c(this, motionEvent) && action != 3) {
                this.f16690r = sVar;
                return true;
            }
        }
        return false;
    }

    public void V0(D d9, l.c cVar) {
        d9.I(0, Segment.SIZE);
        if (this.f16681m0.f16716i && d9.B() && !d9.y() && !d9.M()) {
            this.f16668g.c(f0(d9), d9);
        }
        this.f16668g.e(d9, cVar);
    }

    public final void W(int[] iArr) {
        int iG = this.f16666f.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i9 = a.e.API_PRIORITY_OTHER;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < iG; i11++) {
            D dJ0 = j0(this.f16666f.f(i11));
            if (!dJ0.M()) {
                int iP = dJ0.p();
                if (iP < i9) {
                    i9 = iP;
                }
                if (iP > i10) {
                    i10 = iP;
                }
            }
        }
        iArr[0] = i9;
        iArr[1] = i10;
    }

    public final void W0() {
        View viewFindViewById;
        if (!this.f16673i0 || this.f16680m == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f16632J0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f16666f.n(focusedChild)) {
                    return;
                }
            } else if (this.f16666f.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewY = null;
        D dA0 = (this.f16681m0.f16721n == -1 || !this.f16680m.v()) ? null : a0(this.f16681m0.f16721n);
        if (dA0 != null && !this.f16666f.n(dA0.f16733a) && dA0.f16733a.hasFocusable()) {
            viewY = dA0.f16733a;
        } else if (this.f16666f.g() > 0) {
            viewY = Y();
        }
        if (viewY != null) {
            int i9 = this.f16681m0.f16722o;
            if (i9 != -1 && (viewFindViewById = viewY.findViewById(i9)) != null && viewFindViewById.isFocusable()) {
                viewY = viewFindViewById;
            }
            viewY.requestFocus();
        }
    }

    public final void X0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f16647J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f16647J.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f16648K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f16648K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f16649L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f16649L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f16650M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f16650M.isFinished();
        }
        if (zIsFinished) {
            L.j0(this);
        }
    }

    public final View Y() {
        D dZ;
        A a9 = this.f16681m0;
        int i9 = a9.f16720m;
        if (i9 == -1) {
            i9 = 0;
        }
        int iC = a9.c();
        for (int i10 = i9; i10 < iC; i10++) {
            D dZ2 = Z(i10);
            if (dZ2 == null) {
                break;
            }
            if (dZ2.f16733a.hasFocusable()) {
                return dZ2.f16733a;
            }
        }
        int iMin = Math.min(iC, i9);
        do {
            iMin--;
            if (iMin < 0 || (dZ = Z(iMin)) == null) {
                return null;
            }
        } while (!dZ.f16733a.hasFocusable());
        return dZ.f16733a;
    }

    public void Y0() {
        l lVar = this.f16651N;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.f16682n;
        if (oVar != null) {
            oVar.H1(this.f16662c);
            this.f16682n.I1(this.f16662c);
        }
        this.f16662c.c();
    }

    public D Z(int i9) {
        D d9 = null;
        if (this.f16642E) {
            return null;
        }
        int iJ = this.f16666f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            D dJ0 = j0(this.f16666f.i(i10));
            if (dJ0 != null && !dJ0.y() && e0(dJ0) == i9) {
                if (!this.f16666f.n(dJ0.f16733a)) {
                    return dJ0;
                }
                d9 = dJ0;
            }
        }
        return d9;
    }

    public boolean Z0(View view) {
        v1();
        boolean zR = this.f16666f.r(view);
        if (zR) {
            D dJ0 = j0(view);
            this.f16662c.J(dJ0);
            this.f16662c.C(dJ0);
        }
        x1(!zR);
        return zR;
    }

    public D a0(long j9) {
        g gVar = this.f16680m;
        D d9 = null;
        if (gVar != null && gVar.v()) {
            int iJ = this.f16666f.j();
            for (int i9 = 0; i9 < iJ; i9++) {
                D dJ0 = j0(this.f16666f.i(i9));
                if (dJ0 != null && !dJ0.y() && dJ0.n() == j9) {
                    if (!this.f16666f.n(dJ0.f16733a)) {
                        return dJ0;
                    }
                    d9 = dJ0;
                }
            }
        }
        return d9;
    }

    public void a1(n nVar) {
        o oVar = this.f16682n;
        if (oVar != null) {
            oVar.D("Cannot remove item decoration during a scroll  or layout");
        }
        this.f16686p.remove(nVar);
        if (this.f16686p.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        B0();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i9, int i10) {
        o oVar = this.f16682n;
        if (oVar == null || !oVar.b1(this, arrayList, i9, i10)) {
            super.addFocusables(arrayList, i9, i10);
        }
    }

    public void b(int i9, int i10) {
        if (i9 < 0) {
            N();
            if (this.f16647J.isFinished()) {
                this.f16647J.onAbsorb(-i9);
            }
        } else if (i9 > 0) {
            O();
            if (this.f16649L.isFinished()) {
                this.f16649L.onAbsorb(i9);
            }
        }
        if (i10 < 0) {
            P();
            if (this.f16648K.isFinished()) {
                this.f16648K.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            M();
            if (this.f16650M.isFinished()) {
                this.f16650M.onAbsorb(i10);
            }
        }
        if (i9 == 0 && i10 == 0) {
            return;
        }
        L.j0(this);
    }

    public D b0(int i9) {
        return c0(i9, false);
    }

    public void b1(q qVar) {
        List list = this.f16641D;
        if (list == null) {
            return;
        }
        list.remove(qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.RecyclerView.D c0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f16666f
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.f16666f
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$D r3 = j0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.y()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f16735c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.p()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.f16666f
            android.view.View r4 = r3.f16733a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.c0(int, boolean):androidx.recyclerview.widget.RecyclerView$D");
    }

    public void c1(s sVar) {
        this.f16688q.remove(sVar);
        if (this.f16690r == sVar) {
            this.f16690r = null;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.f16682n.J((p) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        o oVar = this.f16682n;
        if (oVar != null && oVar.H()) {
            return this.f16682n.N(this.f16681m0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        o oVar = this.f16682n;
        if (oVar != null && oVar.H()) {
            return this.f16682n.O(this.f16681m0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        o oVar = this.f16682n;
        if (oVar != null && oVar.H()) {
            return this.f16682n.P(this.f16681m0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        o oVar = this.f16682n;
        if (oVar != null && oVar.I()) {
            return this.f16682n.Q(this.f16681m0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        o oVar = this.f16682n;
        if (oVar != null && oVar.I()) {
            return this.f16682n.R(this.f16681m0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        o oVar = this.f16682n;
        if (oVar != null && oVar.I()) {
            return this.f16682n.S(this.f16681m0);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean d0(int i9, int i10) {
        o oVar = this.f16682n;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f16704y) {
            return false;
        }
        int iH = oVar.H();
        boolean zI = this.f16682n.I();
        if (iH == 0 || Math.abs(i9) < this.f16665e0) {
            i9 = 0;
        }
        if (!zI || Math.abs(i10) < this.f16665e0) {
            i10 = 0;
        }
        if (i9 == 0 && i10 == 0) {
            return false;
        }
        float f9 = i9;
        float f10 = i10;
        if (!dispatchNestedPreFling(f9, f10)) {
            boolean z9 = iH != 0 || zI;
            dispatchNestedFling(f9, f10, z9);
            r rVar = this.f16660W;
            if (rVar != null && rVar.a(i9, i10)) {
                return true;
            }
            if (z9) {
                if (zI) {
                    iH = (iH == true ? 1 : 0) | 2;
                }
                w1(iH, 1);
                int i11 = this.f16667f0;
                int iMax = Math.max(-i11, Math.min(i9, i11));
                int i12 = this.f16667f0;
                this.f16675j0.c(iMax, Math.max(-i12, Math.min(i10, i12)));
                return true;
            }
        }
        return false;
    }

    public void d1(t tVar) {
        List list = this.f16685o0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f9, float f10, boolean z9) {
        return getScrollingChildHelper().a(f9, f10, z9);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f9, float f10) {
        return getScrollingChildHelper().b(f9, f10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i9, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i9, i10, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i9, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().f(i9, i10, i11, i12, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z9;
        float paddingRight;
        int paddingBottom;
        super.draw(canvas);
        int size = this.f16686p.size();
        boolean z10 = false;
        for (int i9 = 0; i9 < size; i9++) {
            ((n) this.f16686p.get(i9)).k(canvas, this, this.f16681m0);
        }
        EdgeEffect edgeEffect = this.f16647J;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z9 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom2 = this.f16670h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom2, 0.0f);
            EdgeEffect edgeEffect2 = this.f16647J;
            z9 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f16648K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f16670h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f16648K;
            z9 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f16649L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f16670h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f16649L;
            z9 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f16650M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f16670h) {
                paddingRight = (-getWidth()) + getPaddingRight();
                paddingBottom = (-getHeight()) + getPaddingBottom();
            } else {
                paddingRight = -getWidth();
                paddingBottom = -getHeight();
            }
            canvas.translate(paddingRight, paddingBottom);
            EdgeEffect edgeEffect8 = this.f16650M;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z10 = true;
            }
            z9 |= z10;
            canvas.restoreToCount(iSave4);
        }
        if ((z9 || this.f16651N == null || this.f16686p.size() <= 0 || !this.f16651N.p()) ? z9 : true) {
            L.j0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j9) {
        return super.drawChild(canvas, view, j9);
    }

    public int e0(D d9) {
        if (d9.s(524) || !d9.v()) {
            return -1;
        }
        return this.f16664e.e(d9.f16735c);
    }

    public void e1() {
        D d9;
        int iG = this.f16666f.g();
        for (int i9 = 0; i9 < iG; i9++) {
            View viewF = this.f16666f.f(i9);
            D dI0 = i0(viewF);
            if (dI0 != null && (d9 = dI0.f16741i) != null) {
                View view = d9.f16733a;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public long f0(D d9) {
        return this.f16680m.v() ? d9.n() : d9.f16735c;
    }

    public final void f1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f16674j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f16795d) {
                Rect rect = pVar.f16794c;
                Rect rect2 = this.f16674j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f16674j);
            offsetRectIntoDescendantCoords(view, this.f16674j);
        }
        this.f16682n.P1(this, view, this.f16674j, !this.f16698v, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i9) {
        View viewF1;
        boolean z9;
        View viewM1 = this.f16682n.m1(view, i9);
        if (viewM1 != null) {
            return viewM1;
        }
        boolean z10 = (this.f16680m == null || this.f16682n == null || y0() || this.f16704y) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z10 && (i9 == 2 || i9 == 1)) {
            if (this.f16682n.I()) {
                int i10 = i9 == 2 ? 130 : 33;
                z9 = focusFinder.findNextFocus(this, view, i10) == null;
                if (f16631I0) {
                    i9 = i10;
                }
            } else {
                z9 = false;
            }
            if (!z9 && this.f16682n.H()) {
                int i11 = (this.f16682n.x0() == 1) ^ (i9 == 2) ? 66 : 17;
                boolean z11 = focusFinder.findNextFocus(this, view, i11) == null;
                if (f16631I0) {
                    i9 = i11;
                }
                z9 = z11;
            }
            if (z9) {
                v();
                if (T(view) == null) {
                    return null;
                }
                v1();
                this.f16682n.f1(view, i9, this.f16662c, this.f16681m0);
                x1(false);
            }
            viewF1 = focusFinder.findNextFocus(this, view, i9);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i9);
            if (viewFindNextFocus == null && z10) {
                v();
                if (T(view) == null) {
                    return null;
                }
                v1();
                viewF1 = this.f16682n.f1(view, i9, this.f16662c, this.f16681m0);
                x1(false);
            } else {
                viewF1 = viewFindNextFocus;
            }
        }
        if (viewF1 == null || viewF1.hasFocusable()) {
            return z0(view, viewF1, i9) ? viewF1 : super.focusSearch(view, i9);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i9);
        }
        f1(viewF1, null);
        return view;
    }

    public final void g(D d9) {
        View view = d9.f16733a;
        boolean z9 = view.getParent() == this;
        this.f16662c.J(i0(view));
        if (d9.A()) {
            this.f16666f.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        b bVar = this.f16666f;
        if (z9) {
            bVar.k(view);
        } else {
            bVar.b(view, true);
        }
    }

    public int g0(View view) {
        D dJ0 = j0(view);
        if (dJ0 != null) {
            return dJ0.m();
        }
        return -1;
    }

    public final void g1() {
        A a9 = this.f16681m0;
        a9.f16721n = -1L;
        a9.f16720m = -1;
        a9.f16722o = -1;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.f16682n;
        if (oVar != null) {
            return oVar.b0();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.f16682n;
        if (oVar != null) {
            return oVar.c0(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.f16682n;
        if (oVar != null) {
            return oVar.d0(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.f16680m;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.f16682n;
        return oVar != null ? oVar.e0() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i9, int i10) {
        j jVar = this.f16697u0;
        return jVar == null ? super.getChildDrawingOrder(i9, i10) : jVar.a(i9, i10);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f16670h;
    }

    public androidx.recyclerview.widget.l getCompatAccessibilityDelegate() {
        return this.f16695t0;
    }

    public k getEdgeEffectFactory() {
        return this.f16646I;
    }

    public l getItemAnimator() {
        return this.f16651N;
    }

    public int getItemDecorationCount() {
        return this.f16686p.size();
    }

    public o getLayoutManager() {
        return this.f16682n;
    }

    public int getMaxFlingVelocity() {
        return this.f16667f0;
    }

    public int getMinFlingVelocity() {
        return this.f16665e0;
    }

    public long getNanoTime() {
        if (f16630H0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r getOnFlingListener() {
        return this.f16660W;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f16673i0;
    }

    public u getRecycledViewPool() {
        return this.f16662c.i();
    }

    public int getScrollState() {
        return this.f16652O;
    }

    public void h(n nVar) {
        i(nVar, -1);
    }

    public int h0(View view) {
        D dJ0 = j0(view);
        if (dJ0 != null) {
            return dJ0.p();
        }
        return -1;
    }

    public final void h1() {
        VelocityTracker velocityTracker = this.f16654Q;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        y1(0);
        X0();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(n nVar, int i9) {
        o oVar = this.f16682n;
        if (oVar != null) {
            oVar.D("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f16686p.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i9 < 0) {
            this.f16686p.add(nVar);
        } else {
            this.f16686p.add(i9, nVar);
        }
        B0();
        requestLayout();
    }

    public D i0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return j0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final void i1() {
        View focusedChild = (this.f16673i0 && hasFocus() && this.f16680m != null) ? getFocusedChild() : null;
        D dU = focusedChild != null ? U(focusedChild) : null;
        if (dU == null) {
            g1();
            return;
        }
        this.f16681m0.f16721n = this.f16680m.v() ? dU.n() : -1L;
        this.f16681m0.f16720m = this.f16642E ? -1 : dU.y() ? dU.f16736d : dU.m();
        this.f16681m0.f16722o = l0(dU.f16733a);
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f16692s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f16704y;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(q qVar) {
        if (this.f16641D == null) {
            this.f16641D = new ArrayList();
        }
        this.f16641D.add(qVar);
    }

    public void j1() {
        int iJ = this.f16666f.j();
        for (int i9 = 0; i9 < iJ; i9++) {
            D dJ0 = j0(this.f16666f.i(i9));
            if (!dJ0.M()) {
                dJ0.H();
            }
        }
    }

    public void k(s sVar) {
        this.f16688q.add(sVar);
    }

    public boolean k1(int i9, int i10, MotionEvent motionEvent) {
        int i11;
        int i12;
        int i13;
        int i14;
        v();
        if (this.f16680m != null) {
            int[] iArr = this.f16707z0;
            iArr[0] = 0;
            iArr[1] = 0;
            l1(i9, i10, iArr);
            int[] iArr2 = this.f16707z0;
            int i15 = iArr2[0];
            int i16 = iArr2[1];
            i11 = i16;
            i12 = i15;
            i13 = i9 - i15;
            i14 = i10 - i16;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (!this.f16686p.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f16707z0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        H(i12, i11, i13, i14, this.f16703x0, 0, iArr3);
        int[] iArr4 = this.f16707z0;
        int i17 = iArr4[0];
        int i18 = i13 - i17;
        int i19 = iArr4[1];
        int i20 = i14 - i19;
        boolean z9 = (i17 == 0 && i19 == 0) ? false : true;
        int i21 = this.f16657T;
        int[] iArr5 = this.f16703x0;
        int i22 = iArr5[0];
        this.f16657T = i21 - i22;
        int i23 = this.f16658U;
        int i24 = iArr5[1];
        this.f16658U = i23 - i24;
        int[] iArr6 = this.f16705y0;
        iArr6[0] = iArr6[0] + i22;
        iArr6[1] = iArr6[1] + i24;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !AbstractC0982y.b(motionEvent, 8194)) {
                U0(motionEvent.getX(), i18, motionEvent.getY(), i20);
            }
            u(i9, i10);
        }
        if (i12 != 0 || i11 != 0) {
            J(i12, i11);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z9 && i12 == 0 && i11 == 0) ? false : true;
    }

    public void l(t tVar) {
        if (this.f16685o0 == null) {
            this.f16685o0 = new ArrayList();
        }
        this.f16685o0.add(tVar);
    }

    public final int l0(View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    break;
                }
            }
        }
        return id;
    }

    public void l1(int i9, int i10, int[] iArr) {
        v1();
        K0();
        L.t.a("RV Scroll");
        R(this.f16681m0);
        int iT1 = i9 != 0 ? this.f16682n.T1(i9, this.f16662c, this.f16681m0) : 0;
        int iV1 = i10 != 0 ? this.f16682n.V1(i10, this.f16662c, this.f16681m0) : 0;
        L.t.b();
        e1();
        L0();
        x1(false);
        if (iArr != null) {
            iArr[0] = iT1;
            iArr[1] = iV1;
        }
    }

    public void m(D d9, l.c cVar, l.c cVar2) {
        d9.J(false);
        if (this.f16651N.a(d9, cVar, cVar2)) {
            Q0();
        }
    }

    public final String m0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(InstructionFileId.DOT)) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    public void m1(int i9) {
        if (this.f16704y) {
            return;
        }
        z1();
        o oVar = this.f16682n;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.U1(i9);
            awakenScrollBars();
        }
    }

    public final void n(D d9, D d10, l.c cVar, l.c cVar2, boolean z9, boolean z10) {
        d9.J(false);
        if (z9) {
            g(d9);
        }
        if (d9 != d10) {
            if (z10) {
                g(d10);
            }
            d9.f16740h = d10;
            g(d9);
            this.f16662c.J(d9);
            d10.J(false);
            d10.f16741i = d9;
        }
        if (this.f16651N.b(d9, d10, cVar, cVar2)) {
            Q0();
        }
    }

    public Rect n0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f16795d) {
            return pVar.f16794c;
        }
        if (this.f16681m0.h() && (pVar.d() || pVar.f())) {
            return pVar.f16794c;
        }
        Rect rect = pVar.f16794c;
        rect.set(0, 0, 0, 0);
        int size = this.f16686p.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.f16674j.set(0, 0, 0, 0);
            ((n) this.f16686p.get(i9)).g(this.f16674j, view, this, this.f16681m0);
            int i10 = rect.left;
            Rect rect2 = this.f16674j;
            rect.left = i10 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f16795d = false;
        return rect;
    }

    public final void n1(g gVar, boolean z9, boolean z10) {
        g gVar2 = this.f16680m;
        if (gVar2 != null) {
            gVar2.i0(this.f16661a);
            this.f16680m.S(this);
        }
        if (!z9 || z10) {
            Y0();
        }
        this.f16664e.x();
        g gVar3 = this.f16680m;
        this.f16680m = gVar;
        if (gVar != null) {
            gVar.b0(this.f16661a);
            gVar.D(this);
        }
        o oVar = this.f16682n;
        if (oVar != null) {
            oVar.a1(gVar3, this.f16680m);
        }
        this.f16662c.x(gVar3, this.f16680m, z9);
        this.f16681m0.f16714g = true;
    }

    public void o(D d9, l.c cVar, l.c cVar2) {
        g(d9);
        d9.J(false);
        if (this.f16651N.c(d9, cVar, cVar2)) {
            Q0();
        }
    }

    public final void o0(long j9, D d9, D d10) {
        int iG = this.f16666f.g();
        for (int i9 = 0; i9 < iG; i9++) {
            D dJ0 = j0(this.f16666f.f(i9));
            if (dJ0 != d9 && f0(dJ0) == j9) {
                g gVar = this.f16680m;
                if (gVar == null || !gVar.v()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + dJ0 + " \n View Holder 2:" + d9 + Q());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + dJ0 + " \n View Holder 2:" + d9 + Q());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d10 + " cannot be found but it is necessary for " + d9 + Q());
    }

    public boolean o1(D d9, int i9) {
        if (!y0()) {
            L.C0(d9.f16733a, i9);
            return true;
        }
        d9.f16749q = i9;
        this.f16636A0.add(d9);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f16644G = r0
            r1 = 1
            r5.f16692s = r1
            boolean r2 = r5.f16698v
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            r5.f16698v = r1
            androidx.recyclerview.widget.RecyclerView$o r1 = r5.f16682n
            if (r1 == 0) goto L1e
            r1.X(r5)
        L1e:
            r5.f16693s0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f16630H0
            if (r0 == 0) goto L61
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.e.f16988f
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.e) r1
            r5.f16677k0 = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.f16677k0 = r1
            android.view.Display r1 = P.L.x(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.e r2 = r5.f16677k0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f16992d = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.e r0 = r5.f16677k0
            r0.a(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        l lVar = this.f16651N;
        if (lVar != null) {
            lVar.k();
        }
        z1();
        this.f16692s = false;
        o oVar = this.f16682n;
        if (oVar != null) {
            oVar.Y(this, this.f16662c);
        }
        this.f16636A0.clear();
        removeCallbacks(this.f16638B0);
        this.f16668g.j();
        if (!f16630H0 || (eVar = this.f16677k0) == null) {
            return;
        }
        eVar.j(this);
        this.f16677k0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f16686p.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((n) this.f16686p.get(i9)).i(canvas, this, this.f16681m0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f16682n
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f16704y
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L79
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f16682n
            boolean r0 = r0.I()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f16682n
            boolean r3 = r3.H()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = 0
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f16682n
            boolean r3 = r3.I()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f16682n
            boolean r3 = r3.H()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = 0
            goto L64
        L62:
            r0 = 0
            goto L3c
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L79
        L6c:
            float r2 = r5.f16669g0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f16671h0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.k1(r2, r0, r6)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        if (this.f16704y) {
            return false;
        }
        this.f16690r = null;
        if (V(motionEvent)) {
            r();
            return true;
        }
        o oVar = this.f16682n;
        if (oVar == null) {
            return false;
        }
        boolean zH = oVar.H();
        boolean zI = this.f16682n.I();
        if (this.f16654Q == null) {
            this.f16654Q = VelocityTracker.obtain();
        }
        this.f16654Q.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f16706z) {
                this.f16706z = false;
            }
            this.f16653P = motionEvent.getPointerId(0);
            int x9 = (int) (motionEvent.getX() + 0.5f);
            this.f16657T = x9;
            this.f16655R = x9;
            int y9 = (int) (motionEvent.getY() + 0.5f);
            this.f16658U = y9;
            this.f16656S = y9;
            if (this.f16652O == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                y1(1);
            }
            int[] iArr = this.f16705y0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i9 = zH;
            if (zI) {
                i9 = (zH ? 1 : 0) | 2;
            }
            w1(i9, 0);
        } else if (actionMasked == 1) {
            this.f16654Q.clear();
            y1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f16653P);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f16653P + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f16652O != 1) {
                int i10 = x10 - this.f16655R;
                int i11 = y10 - this.f16656S;
                if (!zH || Math.abs(i10) <= this.f16659V) {
                    z9 = false;
                } else {
                    this.f16657T = x10;
                    z9 = true;
                }
                if (zI && Math.abs(i11) > this.f16659V) {
                    this.f16658U = y10;
                    z9 = true;
                }
                if (z9) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            r();
        } else if (actionMasked == 5) {
            this.f16653P = motionEvent.getPointerId(actionIndex);
            int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f16657T = x11;
            this.f16655R = x11;
            int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f16658U = y11;
            this.f16656S = y11;
        } else if (actionMasked == 6) {
            N0(motionEvent);
        }
        return this.f16652O == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        L.t.a("RV OnLayout");
        C();
        L.t.b();
        this.f16698v = true;
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        o oVar = this.f16682n;
        if (oVar == null) {
            x(i9, i10);
            return;
        }
        if (oVar.N0()) {
            int mode = View.MeasureSpec.getMode(i9);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.f16682n.v1(this.f16662c, this.f16681m0, i9, i10);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.f16680m == null) {
                return;
            }
            if (this.f16681m0.f16712e == 1) {
                D();
            }
            this.f16682n.Y1(i9, i10);
            this.f16681m0.f16717j = true;
            E();
            this.f16682n.b2(i9, i10);
            if (this.f16682n.e2()) {
                this.f16682n.Y1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f16681m0.f16717j = true;
                E();
                this.f16682n.b2(i9, i10);
                return;
            }
            return;
        }
        if (this.f16694t) {
            this.f16682n.v1(this.f16662c, this.f16681m0, i9, i10);
            return;
        }
        if (this.f16637B) {
            v1();
            K0();
            S0();
            L0();
            A a9 = this.f16681m0;
            if (a9.f16719l) {
                a9.f16715h = true;
            } else {
                this.f16664e.j();
                this.f16681m0.f16715h = false;
            }
            this.f16637B = false;
            x1(false);
        } else if (this.f16681m0.f16719l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g gVar = this.f16680m;
        if (gVar != null) {
            this.f16681m0.f16713f = gVar.n();
        } else {
            this.f16681m0.f16713f = 0;
        }
        v1();
        this.f16682n.v1(this.f16662c, this.f16681m0, i9, i10);
        x1(false);
        this.f16681m0.f16715h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i9, Rect rect) {
        if (y0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i9, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        this.f16663d = yVar;
        super.onRestoreInstanceState(yVar.a());
        o oVar = this.f16682n;
        if (oVar == null || (parcelable2 = this.f16663d.f16812d) == null) {
            return;
        }
        oVar.y1(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        y yVar2 = this.f16663d;
        if (yVar2 != null) {
            yVar.c(yVar2);
        } else {
            o oVar = this.f16682n;
            yVar.f16812d = oVar != null ? oVar.z1() : null;
        }
        return yVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 == i11 && i10 == i12) {
            return;
        }
        w0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[PHI: r0
      0x00dd: PHI (r0v36 int) = (r0v26 int), (r0v40 int) binds: [B:41:0x00c8, B:46:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(String str) {
        if (y0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + Q());
        }
        if (this.f16645H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + Q()));
        }
    }

    public boolean p0() {
        return this.f16694t;
    }

    public boolean p1(AccessibilityEvent accessibilityEvent) {
        if (!y0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? AbstractC1010b.a(accessibilityEvent) : 0;
        this.f16635A |= iA != 0 ? iA : 0;
        return true;
    }

    public boolean q(D d9) {
        l lVar = this.f16651N;
        return lVar == null || lVar.g(d9, d9.r());
    }

    public boolean q0() {
        return !this.f16698v || this.f16642E || this.f16664e.p();
    }

    public void q1(int i9, int i10) {
        r1(i9, i10, null);
    }

    public final void r() {
        h1();
        setScrollState(0);
    }

    public final boolean r0() {
        int iG = this.f16666f.g();
        for (int i9 = 0; i9 < iG; i9++) {
            D dJ0 = j0(this.f16666f.f(i9));
            if (dJ0 != null && !dJ0.M() && dJ0.B()) {
                return true;
            }
        }
        return false;
    }

    public void r1(int i9, int i10, Interpolator interpolator) {
        s1(i9, i10, interpolator, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z9) {
        D dJ0 = j0(view);
        if (dJ0 != null) {
            if (dJ0.A()) {
                dJ0.i();
            } else if (!dJ0.M()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + dJ0 + Q());
            }
        }
        view.clearAnimation();
        A(view);
        super.removeDetachedView(view, z9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f16682n.x1(this, this.f16681m0, view, view2) && view2 != null) {
            f1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        return this.f16682n.O1(this, view, rect, z9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z9) {
        int size = this.f16688q.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((s) this.f16688q.get(i9)).e(z9);
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f16700w != 0 || this.f16704y) {
            this.f16702x = true;
        } else {
            super.requestLayout();
        }
    }

    public void s0() {
        this.f16664e = new a(new f());
    }

    public void s1(int i9, int i10, Interpolator interpolator, int i11) {
        t1(i9, i10, interpolator, i11, false);
    }

    @Override // android.view.View
    public void scrollBy(int i9, int i10) {
        o oVar = this.f16682n;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f16704y) {
            return;
        }
        boolean zH = oVar.H();
        boolean zI = this.f16682n.I();
        if (zH || zI) {
            if (!zH) {
                i9 = 0;
            }
            if (!zI) {
                i10 = 0;
            }
            k1(i9, i10, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i9, int i10) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (p1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.l lVar) {
        this.f16695t0 = lVar;
        L.s0(this, lVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        n1(gVar, false, true);
        T0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == this.f16697u0) {
            return;
        }
        setChildrenDrawingOrderEnabled(jVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z9) {
        if (z9 != this.f16670h) {
            w0();
        }
        this.f16670h = z9;
        super.setClipToPadding(z9);
        if (this.f16698v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        O.h.f(kVar);
        this.f16646I = kVar;
        w0();
    }

    public void setHasFixedSize(boolean z9) {
        this.f16694t = z9;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.f16651N;
        if (lVar2 != null) {
            lVar2.k();
            this.f16651N.w(null);
        }
        this.f16651N = lVar;
        if (lVar != null) {
            lVar.w(this.f16691r0);
        }
    }

    public void setItemViewCacheSize(int i9) {
        this.f16662c.G(i9);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z9) {
        suppressLayout(z9);
    }

    public void setLayoutManager(o oVar) {
        if (oVar == this.f16682n) {
            return;
        }
        z1();
        if (this.f16682n != null) {
            l lVar = this.f16651N;
            if (lVar != null) {
                lVar.k();
            }
            this.f16682n.H1(this.f16662c);
            this.f16682n.I1(this.f16662c);
            this.f16662c.c();
            if (this.f16692s) {
                this.f16682n.Y(this, this.f16662c);
            }
            this.f16682n.c2(null);
            this.f16682n = null;
        } else {
            this.f16662c.c();
        }
        this.f16666f.o();
        this.f16682n = oVar;
        if (oVar != null) {
            if (oVar.f16770b != null) {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f16770b.Q());
            }
            oVar.c2(this);
            if (this.f16692s) {
                this.f16682n.X(this);
            }
        }
        this.f16662c.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z9) {
        getScrollingChildHelper().m(z9);
    }

    public void setOnFlingListener(r rVar) {
        this.f16660W = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.f16683n0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z9) {
        this.f16673i0 = z9;
    }

    public void setRecycledViewPool(u uVar) {
        this.f16662c.E(uVar);
    }

    public void setRecyclerListener(w wVar) {
        this.f16684o = wVar;
    }

    public void setScrollState(int i9) {
        if (i9 == this.f16652O) {
            return;
        }
        this.f16652O = i9;
        if (i9 != 2) {
            A1();
        }
        I(i9);
    }

    public void setScrollingTouchSlop(int i9) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i9 == 0) {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else if (i9 != 1) {
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i9 + "; using default value");
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
        this.f16659V = scaledTouchSlop;
    }

    public void setViewCacheExtension(B b9) {
        this.f16662c.F(b9);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i9) {
        return getScrollingChildHelper().o(i9);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z9) {
        if (z9 != this.f16704y) {
            p("Do not suppressLayout in layout or scroll");
            if (z9) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f16704y = true;
                this.f16706z = true;
                z1();
                return;
            }
            this.f16704y = false;
            if (this.f16702x && this.f16682n != null && this.f16680m != null) {
                requestLayout();
            }
            this.f16702x = false;
        }
    }

    public void t() {
        int iJ = this.f16666f.j();
        for (int i9 = 0; i9 < iJ; i9++) {
            D dJ0 = j0(this.f16666f.i(i9));
            if (!dJ0.M()) {
                dJ0.f();
            }
        }
        this.f16662c.d();
    }

    public final void t0() {
        if (L.D(this) == 0) {
            L.D0(this, 8);
        }
    }

    public void t1(int i9, int i10, Interpolator interpolator, int i11, boolean z9) {
        o oVar = this.f16682n;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f16704y) {
            return;
        }
        if (!oVar.H()) {
            i9 = 0;
        }
        if (!this.f16682n.I()) {
            i10 = 0;
        }
        if (i9 == 0 && i10 == 0) {
            return;
        }
        if (i11 != Integer.MIN_VALUE && i11 <= 0) {
            scrollBy(i9, i10);
            return;
        }
        if (z9) {
            int i12 = i9 != 0 ? 1 : 0;
            if (i10 != 0) {
                i12 |= 2;
            }
            w1(i12, 1);
        }
        this.f16675j0.f(i9, i10, i11, interpolator);
    }

    public void u(int i9, int i10) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f16647J;
        if (edgeEffect == null || edgeEffect.isFinished() || i9 <= 0) {
            zIsFinished = false;
        } else {
            this.f16647J.onRelease();
            zIsFinished = this.f16647J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f16649L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i9 < 0) {
            this.f16649L.onRelease();
            zIsFinished |= this.f16649L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f16648K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.f16648K.onRelease();
            zIsFinished |= this.f16648K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f16650M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.f16650M.onRelease();
            zIsFinished |= this.f16650M.isFinished();
        }
        if (zIsFinished) {
            L.j0(this);
        }
    }

    public final void u0() {
        this.f16666f = new b(new e());
    }

    public void u1(int i9) {
        if (this.f16704y) {
            return;
        }
        o oVar = this.f16682n;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.g2(this, this.f16681m0, i9);
        }
    }

    public void v() {
        if (!this.f16698v || this.f16642E) {
            L.t.a("RV FullInvalidate");
            C();
            L.t.b();
            return;
        }
        if (this.f16664e.p()) {
            if (this.f16664e.o(4) && !this.f16664e.o(11)) {
                L.t.a("RV PartialInvalidate");
                v1();
                K0();
                this.f16664e.v();
                if (!this.f16702x) {
                    if (r0()) {
                        C();
                    } else {
                        this.f16664e.i();
                    }
                }
                x1(true);
                L0();
            } else {
                if (!this.f16664e.p()) {
                    return;
                }
                L.t.a("RV FullInvalidate");
                C();
            }
            L.t.b();
        }
    }

    public void v0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(A0.b.f21a), resources.getDimensionPixelSize(A0.b.f23c), resources.getDimensionPixelOffset(A0.b.f22b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + Q());
        }
    }

    public void v1() {
        int i9 = this.f16700w + 1;
        this.f16700w = i9;
        if (i9 != 1 || this.f16704y) {
            return;
        }
        this.f16702x = false;
    }

    public final void w(Context context, String str, AttributeSet attributeSet, int i9, int i10) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strM0 = m0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strM0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f16633K0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i9), Integer.valueOf(i10)};
                } catch (NoSuchMethodException e9) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e10) {
                        e10.initCause(e9);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strM0, e10);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e11) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strM0, e11);
            } catch (ClassNotFoundException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strM0, e12);
            } catch (IllegalAccessException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strM0, e13);
            } catch (InstantiationException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM0, e14);
            } catch (InvocationTargetException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM0, e15);
            }
        }
    }

    public void w0() {
        this.f16650M = null;
        this.f16648K = null;
        this.f16649L = null;
        this.f16647J = null;
    }

    public boolean w1(int i9, int i10) {
        return getScrollingChildHelper().p(i9, i10);
    }

    public void x(int i9, int i10) {
        setMeasuredDimension(o.K(i9, getPaddingLeft() + getPaddingRight(), L.G(this)), o.K(i10, getPaddingTop() + getPaddingBottom(), L.F(this)));
    }

    public boolean x0() {
        AccessibilityManager accessibilityManager = this.f16639C;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void x1(boolean z9) {
        if (this.f16700w < 1) {
            this.f16700w = 1;
        }
        if (!z9 && !this.f16704y) {
            this.f16702x = false;
        }
        if (this.f16700w == 1) {
            if (z9 && this.f16702x && !this.f16704y && this.f16682n != null && this.f16680m != null) {
                C();
            }
            if (!this.f16704y) {
                this.f16702x = false;
            }
        }
        this.f16700w--;
    }

    public final boolean y(int i9, int i10) {
        W(this.f16699v0);
        int[] iArr = this.f16699v0;
        return (iArr[0] == i9 && iArr[1] == i10) ? false : true;
    }

    public boolean y0() {
        return this.f16644G > 0;
    }

    public void y1(int i9) {
        getScrollingChildHelper().r(i9);
    }

    public void z(View view) {
        D dJ0 = j0(view);
        I0(view);
        g gVar = this.f16680m;
        if (gVar != null && dJ0 != null) {
            gVar.W(dJ0);
        }
        List list = this.f16641D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((q) this.f16641D.get(size)).d(view);
            }
        }
    }

    public final boolean z0(View view, View view2, int i9) {
        int i10;
        if (view2 == null || view2 == this || T(view2) == null) {
            return false;
        }
        if (view == null || T(view) == null) {
            return true;
        }
        this.f16674j.set(0, 0, view.getWidth(), view.getHeight());
        this.f16676k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f16674j);
        offsetDescendantRectToMyCoords(view2, this.f16676k);
        byte b9 = -1;
        int i11 = this.f16682n.x0() == 1 ? -1 : 1;
        Rect rect = this.f16674j;
        int i12 = rect.left;
        Rect rect2 = this.f16676k;
        int i13 = rect2.left;
        if ((i12 < i13 || rect.right <= i13) && rect.right < rect2.right) {
            i10 = 1;
        } else {
            int i14 = rect.right;
            int i15 = rect2.right;
            i10 = ((i14 > i15 || i12 >= i15) && i12 > i13) ? -1 : 0;
        }
        int i16 = rect.top;
        int i17 = rect2.top;
        if ((i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom) {
            b9 = 1;
        } else {
            int i18 = rect.bottom;
            int i19 = rect2.bottom;
            if ((i18 <= i19 && i16 < i19) || i16 <= i17) {
                b9 = 0;
            }
        }
        if (i9 == 1) {
            return b9 < 0 || (b9 == 0 && i10 * i11 <= 0);
        }
        if (i9 == 2) {
            return b9 > 0 || (b9 == 0 && i10 * i11 >= 0);
        }
        if (i9 == 17) {
            return i10 < 0;
        }
        if (i9 == 33) {
            return b9 < 0;
        }
        if (i9 == 66) {
            return i10 > 0;
        }
        if (i9 == 130) {
            return b9 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i9 + Q());
    }

    public void z1() {
        setScrollState(0);
        A1();
    }
}
