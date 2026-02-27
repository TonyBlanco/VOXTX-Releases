package com.google.android.exoplayer2.ui;

import P3.b;
import a4.C1089c;
import a4.Y;
import a4.b0;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends View implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25941a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f25942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f25944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1089c f25945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f25946g;

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25941a = new ArrayList();
        this.f25942c = Collections.emptyList();
        this.f25943d = 0;
        this.f25944e = 0.0533f;
        this.f25945f = C1089c.f11611g;
        this.f25946g = 0.08f;
    }

    public static P3.b b(P3.b bVar) {
        b.C0083b c0083bP = bVar.b().k(-3.4028235E38f).l(Integer.MIN_VALUE).p(null);
        if (bVar.f7197g == 0) {
            c0083bP.h(1.0f - bVar.f7196f, 0);
        } else {
            c0083bP.h((-bVar.f7196f) - 1.0f, 1);
        }
        int i9 = bVar.f7198h;
        if (i9 == 0) {
            c0083bP.i(2);
        } else if (i9 == 2) {
            c0083bP.i(0);
        }
        return c0083bP.a();
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List list, C1089c c1089c, float f9, int i9, float f10) {
        this.f25942c = list;
        this.f25945f = c1089c;
        this.f25944e = f9;
        this.f25943d = i9;
        this.f25946g = f10;
        while (this.f25941a.size() < list.size()) {
            this.f25941a.add(new Y(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List list = this.f25942c;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i9 = paddingBottom - paddingTop;
        float fH = b0.h(this.f25943d, this.f25944e, height, i9);
        if (fH <= 0.0f) {
            return;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            P3.b bVarB = (P3.b) list.get(i10);
            if (bVarB.f7207q != Integer.MIN_VALUE) {
                bVarB = b(bVarB);
            }
            P3.b bVar = bVarB;
            int i11 = paddingBottom;
            ((Y) this.f25941a.get(i10)).b(bVar, this.f25945f, fH, b0.h(bVar.f7205o, bVar.f7206p, height, i9), this.f25946g, canvas, paddingLeft, paddingTop, width, i11);
            i10++;
            size = size;
            i9 = i9;
            paddingBottom = i11;
            width = width;
        }
    }
}
