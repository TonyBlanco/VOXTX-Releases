package o2;

import android.widget.ImageView;
import e2.AbstractC1732b;

/* JADX INFO: renamed from: o2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2309d extends AbstractC2310e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AbstractC1732b f45752g;

    public C2309d(ImageView imageView) {
        this(imageView, -1);
    }

    public C2309d(ImageView imageView, int i9) {
        super(imageView);
        this.f45751f = i9;
    }

    @Override // o2.AbstractC2310e, o2.InterfaceC2315j
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void b(AbstractC1732b abstractC1732b, n2.c cVar) {
        if (!abstractC1732b.b()) {
            float intrinsicWidth = abstractC1732b.getIntrinsicWidth() / abstractC1732b.getIntrinsicHeight();
            if (Math.abs((((ImageView) this.f45762b).getWidth() / ((ImageView) this.f45762b).getHeight()) - 1.0f) <= 0.05f && Math.abs(intrinsicWidth - 1.0f) <= 0.05f) {
                abstractC1732b = new C2314i(abstractC1732b, ((ImageView) this.f45762b).getWidth());
            }
        }
        super.b(abstractC1732b, cVar);
        this.f45752g = abstractC1732b;
        abstractC1732b.c(this.f45751f);
        abstractC1732b.start();
    }

    @Override // o2.AbstractC2310e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void l(AbstractC1732b abstractC1732b) {
        ((ImageView) this.f45762b).setImageDrawable(abstractC1732b);
    }

    @Override // o2.AbstractC2306a, j2.InterfaceC2082h
    public void onStart() {
        AbstractC1732b abstractC1732b = this.f45752g;
        if (abstractC1732b != null) {
            abstractC1732b.start();
        }
    }

    @Override // o2.AbstractC2306a, j2.InterfaceC2082h
    public void onStop() {
        AbstractC1732b abstractC1732b = this.f45752g;
        if (abstractC1732b != null) {
            abstractC1732b.stop();
        }
    }
}
