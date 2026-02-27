package pl.droidsonroids.gif;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageButton;
import pl.droidsonroids.gif.e;

/* JADX INFO: loaded from: classes4.dex */
public class GifImageButton extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f46700a;

    public GifImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(e.c(this, attributeSet, 0, 0));
    }

    public final void a(e.a aVar) {
        this.f46700a = aVar.f46730a;
        int i9 = aVar.f46728c;
        if (i9 > 0) {
            super.setImageResource(i9);
        }
        int i10 = aVar.f46729d;
        if (i10 > 0) {
            super.setBackgroundResource(i10);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        dVar.a(getDrawable(), 0);
        dVar.a(getBackground(), 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new d(super.onSaveInstanceState(), this.f46700a ? getDrawable() : null, this.f46700a ? getBackground() : null);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        if (e.e(this, false, i9)) {
            return;
        }
        super.setBackgroundResource(i9);
    }

    public void setFreezesAnimation(boolean z9) {
        this.f46700a = z9;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i9) {
        if (e.e(this, true, i9)) {
            return;
        }
        super.setImageResource(i9);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (e.d(this, uri)) {
            return;
        }
        super.setImageURI(uri);
    }
}
