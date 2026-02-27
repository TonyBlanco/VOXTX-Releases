package com.journeyapps.barcodescanner;

import B6.j;
import B6.o;
import Y6.v;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.journeyapps.barcodescanner.a;
import java.util.ArrayList;
import java.util.List;
import x6.q;

/* JADX INFO: loaded from: classes.dex */
public class ViewfinderView extends View {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f27972o = {0, 64, 128, 192, 255, 192, 128, 64};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f27973a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f27974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f27979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f27980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f27981j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f27982k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.journeyapps.barcodescanner.a f27983l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Rect f27984m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public v f27985n;

    public class a implements a.f {
        public a() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void a() {
            ViewfinderView.this.b();
            ViewfinderView.this.invalidate();
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void b() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void c(Exception exc) {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void d() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void e() {
        }
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27973a = new Paint(1);
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f730f);
        this.f27975d = typedArrayObtainStyledAttributes.getColor(o.f735k, resources.getColor(j.f706d));
        this.f27976e = typedArrayObtainStyledAttributes.getColor(o.f732h, resources.getColor(j.f704b));
        this.f27977f = typedArrayObtainStyledAttributes.getColor(o.f733i, resources.getColor(j.f705c));
        this.f27978g = typedArrayObtainStyledAttributes.getColor(o.f731g, resources.getColor(j.f703a));
        this.f27979h = typedArrayObtainStyledAttributes.getBoolean(o.f734j, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f27980i = 0;
        this.f27981j = new ArrayList(20);
        this.f27982k = new ArrayList(20);
    }

    public void a(q qVar) {
        if (this.f27981j.size() < 20) {
            this.f27981j.add(qVar);
        }
    }

    public void b() {
        com.journeyapps.barcodescanner.a aVar = this.f27983l;
        if (aVar == null) {
            return;
        }
        Rect framingRect = aVar.getFramingRect();
        v previewSize = this.f27983l.getPreviewSize();
        if (framingRect == null || previewSize == null) {
            return;
        }
        this.f27984m = framingRect;
        this.f27985n = previewSize;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        v vVar;
        b();
        Rect rect = this.f27984m;
        if (rect == null || (vVar = this.f27985n) == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        this.f27973a.setColor(this.f27974c != null ? this.f27976e : this.f27975d);
        float f9 = width;
        canvas.drawRect(0.0f, 0.0f, f9, rect.top, this.f27973a);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, this.f27973a);
        canvas.drawRect(rect.right + 1, rect.top, f9, rect.bottom + 1, this.f27973a);
        canvas.drawRect(0.0f, rect.bottom + 1, f9, height, this.f27973a);
        if (this.f27974c != null) {
            this.f27973a.setAlpha(160);
            canvas.drawBitmap(this.f27974c, (Rect) null, rect, this.f27973a);
            return;
        }
        if (this.f27979h) {
            this.f27973a.setColor(this.f27977f);
            Paint paint = this.f27973a;
            int[] iArr = f27972o;
            paint.setAlpha(iArr[this.f27980i]);
            this.f27980i = (this.f27980i + 1) % iArr.length;
            int iHeight = (rect.height() / 2) + rect.top;
            canvas.drawRect(rect.left + 2, iHeight - 1, rect.right - 1, iHeight + 2, this.f27973a);
        }
        float width2 = getWidth() / vVar.f10736a;
        float height2 = getHeight() / vVar.f10737c;
        if (!this.f27982k.isEmpty()) {
            this.f27973a.setAlpha(80);
            this.f27973a.setColor(this.f27978g);
            for (q qVar : this.f27982k) {
                canvas.drawCircle((int) (qVar.c() * width2), (int) (qVar.d() * height2), 3.0f, this.f27973a);
            }
            this.f27982k.clear();
        }
        if (!this.f27981j.isEmpty()) {
            this.f27973a.setAlpha(160);
            this.f27973a.setColor(this.f27978g);
            for (q qVar2 : this.f27981j) {
                canvas.drawCircle((int) (qVar2.c() * width2), (int) (qVar2.d() * height2), 6.0f, this.f27973a);
            }
            List list = this.f27981j;
            List list2 = this.f27982k;
            this.f27981j = list2;
            this.f27982k = list;
            list2.clear();
        }
        postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
    }

    public void setCameraPreview(com.journeyapps.barcodescanner.a aVar) {
        this.f27983l = aVar;
        aVar.i(new a());
    }

    public void setLaserVisibility(boolean z9) {
        this.f27979h = z9;
    }

    public void setMaskColor(int i9) {
        this.f27975d = i9;
    }
}
