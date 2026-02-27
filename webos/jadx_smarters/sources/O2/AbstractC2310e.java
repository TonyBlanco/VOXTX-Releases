package o2;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import n2.c;

/* JADX INFO: renamed from: o2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2310e extends AbstractC2316k implements c.a {
    public AbstractC2310e(ImageView imageView) {
        super(imageView);
    }

    @Override // n2.c.a
    public void a(Drawable drawable) {
        ((ImageView) this.f45762b).setImageDrawable(drawable);
    }

    @Override // o2.InterfaceC2315j
    public void b(Object obj, n2.c cVar) {
        if (cVar == null || !cVar.a(obj, this)) {
            l(obj);
        }
    }

    @Override // n2.c.a
    public Drawable c() {
        return ((ImageView) this.f45762b).getDrawable();
    }

    @Override // o2.AbstractC2306a, o2.InterfaceC2315j
    public void d(Drawable drawable) {
        ((ImageView) this.f45762b).setImageDrawable(drawable);
    }

    @Override // o2.AbstractC2306a, o2.InterfaceC2315j
    public void f(Drawable drawable) {
        ((ImageView) this.f45762b).setImageDrawable(drawable);
    }

    @Override // o2.AbstractC2306a, o2.InterfaceC2315j
    public void g(Exception exc, Drawable drawable) {
        ((ImageView) this.f45762b).setImageDrawable(drawable);
    }

    public abstract void l(Object obj);
}
