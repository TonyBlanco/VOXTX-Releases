package com.google.android.exoplayer2.ui;

import P3.b;
import a4.C1089c;
import a4.b0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import d4.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f25914a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1089c f25915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f25917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f25918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f25922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f25923k;

    public interface a {
        void a(List list, C1089c c1089c, float f9, int i9, float f10);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25914a = Collections.emptyList();
        this.f25915c = C1089c.f11611g;
        this.f25916d = 0;
        this.f25917e = 0.0533f;
        this.f25918f = 0.08f;
        this.f25919g = true;
        this.f25920h = true;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context);
        this.f25922j = aVar;
        this.f25923k = aVar;
        addView(aVar);
        this.f25921i = 1;
    }

    private List<P3.b> getCuesWithStylingPreferencesApplied() {
        if (this.f25919g && this.f25920h) {
            return this.f25914a;
        }
        ArrayList arrayList = new ArrayList(this.f25914a.size());
        for (int i9 = 0; i9 < this.f25914a.size(); i9++) {
            arrayList.add(a((P3.b) this.f25914a.get(i9)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (k0.f39777a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C1089c getUserCaptionStyle() {
        if (k0.f39777a < 19 || isInEditMode()) {
            return C1089c.f11611g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? C1089c.f11611g : C1089c.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t9) {
        removeView(this.f25923k);
        View view = this.f25923k;
        if (view instanceof g) {
            ((g) view).g();
        }
        this.f25923k = t9;
        this.f25922j = t9;
        addView(t9);
    }

    public final P3.b a(P3.b bVar) {
        b.C0083b c0083bB = bVar.b();
        if (!this.f25919g) {
            b0.e(c0083bB);
        } else if (!this.f25920h) {
            b0.f(c0083bB);
        }
        return c0083bB.a();
    }

    public void b(float f9, boolean z9) {
        c(z9 ? 1 : 0, f9);
    }

    public final void c(int i9, float f9) {
        this.f25916d = i9;
        this.f25917e = f9;
        f();
    }

    public void d() {
        setStyle(getUserCaptionStyle());
    }

    public void e() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void f() {
        this.f25922j.a(getCuesWithStylingPreferencesApplied(), this.f25915c, this.f25917e, this.f25916d, this.f25918f);
    }

    public void setApplyEmbeddedFontSizes(boolean z9) {
        this.f25920h = z9;
        f();
    }

    public void setApplyEmbeddedStyles(boolean z9) {
        this.f25919g = z9;
        f();
    }

    public void setBottomPaddingFraction(float f9) {
        this.f25918f = f9;
        f();
    }

    public void setCues(List<P3.b> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f25914a = list;
        f();
    }

    public void setFractionalTextSize(float f9) {
        b(f9, false);
    }

    public void setStyle(C1089c c1089c) {
        this.f25915c = c1089c;
        f();
    }

    public void setViewType(int i9) {
        KeyEvent.Callback aVar;
        if (this.f25921i == i9) {
            return;
        }
        if (i9 == 1) {
            aVar = new com.google.android.exoplayer2.ui.a(getContext());
        } else {
            if (i9 != 2) {
                throw new IllegalArgumentException();
            }
            aVar = new g(getContext());
        }
        setView(aVar);
        this.f25921i = i9;
    }
}
