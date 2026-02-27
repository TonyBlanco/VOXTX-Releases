package n2;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import n2.c;

/* JADX INFO: loaded from: classes.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f44892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44893b;

    public b(c cVar, int i9) {
        this.f44892a = cVar;
        this.f44893b = i9;
    }

    @Override // n2.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(Drawable drawable, c.a aVar) {
        Drawable drawableC = aVar.c();
        if (drawableC == null) {
            this.f44892a.a(drawable, aVar);
            return false;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawableC, drawable});
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(this.f44893b);
        aVar.a(transitionDrawable);
        return true;
    }
}
