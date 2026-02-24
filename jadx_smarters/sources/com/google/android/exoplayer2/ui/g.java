package com.google.android.exoplayer2.ui;

import a4.AbstractC1096j;
import a4.C1089c;
import a4.b0;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import d4.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends FrameLayout implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.ui.a f26148a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WebView f26149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f26150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1089c f26151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f26152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f26154h;

    public class a extends WebView {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26156a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f26156a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26156a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26156a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(Context context) {
        this(context, null);
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26150d = Collections.emptyList();
        this.f26151e = C1089c.f11611g;
        this.f26152f = 0.0533f;
        this.f26153g = 0;
        this.f26154h = 0.08f;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context, attributeSet);
        this.f26148a = aVar;
        a aVar2 = new a(context, attributeSet);
        this.f26149c = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }

    public static int b(int i9) {
        if (i9 != 1) {
            return i9 != 2 ? 0 : -100;
        }
        return -50;
    }

    public static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i9 = b.f26156a[alignment.ordinal()];
        return i9 != 1 ? i9 != 2 ? "center" : "end" : "start";
    }

    public static String d(C1089c c1089c) {
        int i9 = c1089c.f11615d;
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? "unset" : k0.D("-0.05em -0.05em 0.15em %s", AbstractC1096j.b(c1089c.f11616e)) : k0.D("0.06em 0.08em 0.15em %s", AbstractC1096j.b(c1089c.f11616e)) : k0.D("0.1em 0.12em 0.15em %s", AbstractC1096j.b(c1089c.f11616e)) : k0.D("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", AbstractC1096j.b(c1089c.f11616e));
    }

    public static String f(int i9) {
        return i9 != 1 ? i9 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    public static String h(P3.b bVar) {
        float f9 = bVar.f7208r;
        if (f9 == 0.0f) {
            return "";
        }
        int i9 = bVar.f7207q;
        return k0.D("%s(%.2fdeg)", (i9 == 2 || i9 == 1) ? "skewY" : "skewX", Float.valueOf(f9));
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List list, C1089c c1089c, float f9, int i9, float f10) {
        this.f26151e = c1089c;
        this.f26152f = f9;
        this.f26153g = i9;
        this.f26154h = f10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            P3.b bVar = (P3.b) list.get(i10);
            if (bVar.f7195e != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f26150d.isEmpty() || !arrayList2.isEmpty()) {
            this.f26150d = arrayList2;
            i();
        }
        this.f26148a.a(arrayList, c1089c, f9, i9, f10);
        invalidate();
    }

    public final String e(int i9, float f9) {
        float fH = b0.h(i9, f9, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fH == -3.4028235E38f ? "unset" : k0.D("%.2fpx", Float.valueOf(fH / getContext().getResources().getDisplayMetrics().density));
    }

    public void g() {
        this.f26149c.destroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.g.i():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        if (!z9 || this.f26150d.isEmpty()) {
            return;
        }
        i();
    }
}
