package f5;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40830a;

    public x(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f40830a = getVisibility();
    }

    public final void b(int i9, boolean z9) {
        super.setVisibility(i9);
        if (z9) {
            this.f40830a = i9;
        }
    }

    public final int getUserSetVisibility() {
        return this.f40830a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i9) {
        b(i9, true);
    }
}
