package k;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import c.AbstractC1238a;

/* JADX INFO: renamed from: k.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2125u extends SeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2126v f43400a;

    public C2125u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1238a.f17735L);
    }

    public C2125u(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        Z.a(this, getContext());
        C2126v c2126v = new C2126v(this);
        this.f43400a = c2126v;
        c2126v.c(attributeSet, i9);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f43400a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f43400a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f43400a.g(canvas);
    }
}
