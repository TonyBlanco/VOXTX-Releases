package Q;

import Q.F;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import d.AbstractC1617D;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;
import okio.Segment;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f7379d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f7380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7381b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7382c = -1;

    public static class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final a f7383A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final a f7384B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final a f7385C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final a f7386D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final a f7387E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final a f7388F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final a f7389G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final a f7390H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final a f7391I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final a f7392J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static final a f7393K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final a f7394L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public static final a f7395M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final a f7396N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final a f7397O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public static final a f7398P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public static final a f7399Q;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f7400e = new a(1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f7401f = new a(2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f7402g = new a(4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f7403h = new a(8, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f7404i = new a(16, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f7405j = new a(32, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f7406k = new a(64, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f7407l = new a(128, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f7408m = new a(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, (CharSequence) null, F.b.class);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f7409n = new a(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED, (CharSequence) null, F.b.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f7410o = new a(1024, (CharSequence) null, F.c.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f7411p = new a(2048, (CharSequence) null, F.c.class);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f7412q = new a(4096, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f7413r = new a(Segment.SIZE, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f7414s = new a(Http2.INITIAL_MAX_FRAME_SIZE, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f7415t = new a(32768, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f7416u = new a(65536, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f7417v = new a(131072, (CharSequence) null, F.g.class);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f7418w = new a(262144, null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f7419x = new a(524288, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final a f7420y = new a(Constants.MB, null);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f7421z = new a(2097152, (CharSequence) null, F.h.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f7422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class f7424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final F f7425d;

        static {
            int i9 = Build.VERSION.SDK_INT;
            f7383A = new a(i9 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            f7384B = new a(i9 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, F.e.class);
            f7385C = new a(i9 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            f7386D = new a(i9 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            f7387E = new a(i9 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            f7388F = new a(i9 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            f7389G = new a(i9 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f7390H = new a(i9 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f7391I = new a(i9 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f7392J = new a(i9 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f7393K = new a(i9 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            f7394L = new a(i9 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, F.f.class);
            f7395M = new a(i9 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, F.d.class);
            f7396N = new a(i9 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f7397O = new a(i9 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f7398P = new a(i9 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f7399Q = new a(i9 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        }

        public a(int i9, CharSequence charSequence) {
            this(null, i9, charSequence, null, null);
        }

        public a(int i9, CharSequence charSequence, F f9) {
            this(null, i9, charSequence, f9, null);
        }

        public a(int i9, CharSequence charSequence, Class cls) {
            this(null, i9, charSequence, null, cls);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(Object obj, int i9, CharSequence charSequence, F f9, Class cls) {
            this.f7423b = i9;
            this.f7425d = f9;
            this.f7422a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i9, charSequence) : obj;
            this.f7424c = cls;
        }

        public a a(CharSequence charSequence, F f9) {
            return new a(null, this.f7423b, charSequence, f9, this.f7424c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f7422a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f7422a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f7425d == null) {
                return false;
            }
            Class cls = this.f7424c;
            if (cls != null) {
                try {
                    AbstractC1617D.a(cls.getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e9) {
                    Class cls2 = this.f7424c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? Constants.NULL_VERSION_ID : cls2.getName()), e9);
                }
            }
            return this.f7425d.a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f7422a;
            Object obj3 = ((a) obj).f7422a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f7422a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f7426a;

        public b(Object obj) {
            this.f7426a = obj;
        }

        public static b a(int i9, int i10, boolean z9, int i11) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i9, i10, z9, i11));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f7427a;

        public c(Object obj) {
            this.f7427a = obj;
        }

        public static c a(int i9, int i10, int i11, int i12, boolean z9, boolean z10) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i9, i10, i11, i12, z9, z10));
        }
    }

    public C(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f7380a = accessibilityNodeInfo;
    }

    public static C K() {
        return y0(AccessibilityNodeInfo.obtain());
    }

    public static C L(C c9) {
        return y0(AccessibilityNodeInfo.obtain(c9.f7380a));
    }

    public static C M(View view) {
        return y0(AccessibilityNodeInfo.obtain(view));
    }

    public static String i(int i9) {
        if (i9 == 1) {
            return "ACTION_FOCUS";
        }
        if (i9 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i9) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case JceEncryptionConstants.SYMMETRIC_KEY_LENGTH /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case Segment.SIZE /* 8192 */:
                return "ACTION_SCROLL_BACKWARD";
            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionImeEnter:
                return "ACTION_IME_ENTER";
            default:
                switch (i9) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i9) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static C y0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C(accessibilityNodeInfo);
    }

    public boolean A() {
        return this.f7380a.isChecked();
    }

    public boolean B() {
        return this.f7380a.isClickable();
    }

    public boolean C() {
        return this.f7380a.isEnabled();
    }

    public boolean D() {
        return this.f7380a.isFocusable();
    }

    public boolean E() {
        return this.f7380a.isFocused();
    }

    public boolean F() {
        return this.f7380a.isLongClickable();
    }

    public boolean G() {
        return this.f7380a.isPassword();
    }

    public boolean H() {
        return this.f7380a.isScrollable();
    }

    public boolean I() {
        return this.f7380a.isSelected();
    }

    public boolean J() {
        return Build.VERSION.SDK_INT >= 26 ? this.f7380a.isShowingHintText() : k(4);
    }

    public boolean N(int i9, Bundle bundle) {
        return this.f7380a.performAction(i9, bundle);
    }

    public void O() {
        this.f7380a.recycle();
    }

    public boolean P(a aVar) {
        return this.f7380a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f7422a);
    }

    public final void Q(View view) {
        SparseArray sparseArrayU = u(view);
        if (sparseArrayU != null) {
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < sparseArrayU.size(); i9++) {
                if (((WeakReference) sparseArrayU.valueAt(i9)).get() == null) {
                    arrayList.add(Integer.valueOf(i9));
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                sparseArrayU.remove(((Integer) arrayList.get(i10)).intValue());
            }
        }
    }

    public void R(boolean z9) {
        this.f7380a.setAccessibilityFocused(z9);
    }

    public final void S(int i9, boolean z9) {
        Bundle bundleR = r();
        if (bundleR != null) {
            int i10 = bundleR.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i9);
            if (!z9) {
                i9 = 0;
            }
            bundleR.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i9 | i10);
        }
    }

    public void T(Rect rect) {
        this.f7380a.setBoundsInParent(rect);
    }

    public void U(Rect rect) {
        this.f7380a.setBoundsInScreen(rect);
    }

    public void V(boolean z9) {
        this.f7380a.setCheckable(z9);
    }

    public void W(boolean z9) {
        this.f7380a.setChecked(z9);
    }

    public void X(CharSequence charSequence) {
        this.f7380a.setClassName(charSequence);
    }

    public void Y(boolean z9) {
        this.f7380a.setClickable(z9);
    }

    public void Z(Object obj) {
        this.f7380a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f7426a);
    }

    public void a(int i9) {
        this.f7380a.addAction(i9);
    }

    public void a0(Object obj) {
        this.f7380a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f7427a);
    }

    public void b(a aVar) {
        this.f7380a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f7422a);
    }

    public void b0(CharSequence charSequence) {
        this.f7380a.setContentDescription(charSequence);
    }

    public void c(View view, int i9) {
        this.f7380a.addChild(view, i9);
    }

    public void c0(boolean z9) {
        this.f7380a.setEnabled(z9);
    }

    public final void d(ClickableSpan clickableSpan, Spanned spanned, int i9) {
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i9));
    }

    public void d0(CharSequence charSequence) {
        this.f7380a.setError(charSequence);
    }

    public void e(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            f();
            Q(view);
            ClickableSpan[] clickableSpanArrP = p(charSequence);
            if (clickableSpanArrP == null || clickableSpanArrP.length <= 0) {
                return;
            }
            r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C.c.f800a);
            SparseArray sparseArrayS = s(view);
            for (int i9 = 0; i9 < clickableSpanArrP.length; i9++) {
                int iY = y(clickableSpanArrP[i9], sparseArrayS);
                sparseArrayS.put(iY, new WeakReference(clickableSpanArrP[i9]));
                d(clickableSpanArrP[i9], (Spanned) charSequence, iY);
            }
        }
    }

    public void e0(boolean z9) {
        this.f7380a.setFocusable(z9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C)) {
            return false;
        }
        C c9 = (C) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f7380a;
        if (accessibilityNodeInfo == null) {
            if (c9.f7380a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c9.f7380a)) {
            return false;
        }
        return this.f7382c == c9.f7382c && this.f7381b == c9.f7381b;
    }

    public final void f() {
        this.f7380a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f7380a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f7380a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f7380a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public void f0(boolean z9) {
        this.f7380a.setFocused(z9);
    }

    public final List g(String str) {
        ArrayList<Integer> integerArrayList = this.f7380a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f7380a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void g0(boolean z9) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7380a.setHeading(z9);
        } else {
            S(2, z9);
        }
    }

    public List h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f7380a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(new a(actionList.get(i9)));
        }
        return arrayList;
    }

    public void h0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7380a.setHintText(charSequence);
        } else {
            this.f7380a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f7380a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(View view) {
        this.f7380a.setLabelFor(view);
    }

    public int j() {
        return this.f7380a.getActions();
    }

    public void j0(int i9) {
        this.f7380a.setMaxTextLength(i9);
    }

    public final boolean k(int i9) {
        Bundle bundleR = r();
        return bundleR != null && (bundleR.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i9) == i9;
    }

    public void k0(CharSequence charSequence) {
        this.f7380a.setPackageName(charSequence);
    }

    public void l(Rect rect) {
        this.f7380a.getBoundsInParent(rect);
    }

    public void l0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7380a.setPaneTitle(charSequence);
        } else {
            this.f7380a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void m(Rect rect) {
        this.f7380a.getBoundsInScreen(rect);
    }

    public void m0(View view) {
        this.f7381b = -1;
        this.f7380a.setParent(view);
    }

    public int n() {
        return this.f7380a.getChildCount();
    }

    public void n0(View view, int i9) {
        this.f7381b = i9;
        this.f7380a.setParent(view, i9);
    }

    public CharSequence o() {
        return this.f7380a.getClassName();
    }

    public void o0(CharSequence charSequence) {
        this.f7380a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void p0(boolean z9) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7380a.setScreenReaderFocusable(z9);
        } else {
            S(1, z9);
        }
    }

    public CharSequence q() {
        return this.f7380a.getContentDescription();
    }

    public void q0(boolean z9) {
        this.f7380a.setScrollable(z9);
    }

    public Bundle r() {
        return this.f7380a.getExtras();
    }

    public void r0(boolean z9) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7380a.setShowingHintText(z9);
        } else {
            S(4, z9);
        }
    }

    public final SparseArray s(View view) {
        SparseArray sparseArrayU = u(view);
        if (sparseArrayU != null) {
            return sparseArrayU;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(C.c.f789I, sparseArray);
        return sparseArray;
    }

    public void s0(View view, int i9) {
        this.f7382c = i9;
        this.f7380a.setSource(view, i9);
    }

    public CharSequence t() {
        return this.f7380a.getPackageName();
    }

    public void t0(CharSequence charSequence) {
        if (L.a.b()) {
            this.f7380a.setStateDescription(charSequence);
        } else {
            this.f7380a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        sb.append("; boundsInParent: " + rect);
        m(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(t());
        sb.append("; className: ");
        sb.append(o());
        sb.append("; text: ");
        sb.append(v());
        sb.append("; contentDescription: ");
        sb.append(q());
        sb.append("; viewId: ");
        sb.append(w());
        sb.append("; checkable: ");
        sb.append(z());
        sb.append("; checked: ");
        sb.append(A());
        sb.append("; focusable: ");
        sb.append(D());
        sb.append("; focused: ");
        sb.append(E());
        sb.append("; selected: ");
        sb.append(I());
        sb.append("; clickable: ");
        sb.append(B());
        sb.append("; longClickable: ");
        sb.append(F());
        sb.append("; enabled: ");
        sb.append(C());
        sb.append("; password: ");
        sb.append(G());
        sb.append("; scrollable: " + H());
        sb.append("; [");
        List listH = h();
        for (int i9 = 0; i9 < listH.size(); i9++) {
            a aVar = (a) listH.get(i9);
            String strI = i(aVar.b());
            if (strI.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strI = aVar.c().toString();
            }
            sb.append(strI);
            if (i9 != listH.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final SparseArray u(View view) {
        return (SparseArray) view.getTag(C.c.f789I);
    }

    public void u0(CharSequence charSequence) {
        this.f7380a.setText(charSequence);
    }

    public CharSequence v() {
        if (!x()) {
            return this.f7380a.getText();
        }
        List listG = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listG2 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listG3 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listG4 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f7380a.getText(), 0, this.f7380a.getText().length()));
        for (int i9 = 0; i9 < listG.size(); i9++) {
            spannableString.setSpan(new C1009a(((Integer) listG4.get(i9)).intValue(), this, r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listG.get(i9)).intValue(), ((Integer) listG2.get(i9)).intValue(), ((Integer) listG3.get(i9)).intValue());
        }
        return spannableString;
    }

    public void v0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f7380a.setTraversalAfter(view);
        }
    }

    public String w() {
        return this.f7380a.getViewIdResourceName();
    }

    public void w0(boolean z9) {
        this.f7380a.setVisibleToUser(z9);
    }

    public final boolean x() {
        return !g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public AccessibilityNodeInfo x0() {
        return this.f7380a;
    }

    public final int y(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i9)).get())) {
                    return sparseArray.keyAt(i9);
                }
            }
        }
        int i10 = f7379d;
        f7379d = i10 + 1;
        return i10;
    }

    public boolean z() {
        return this.f7380a.isCheckable();
    }
}
