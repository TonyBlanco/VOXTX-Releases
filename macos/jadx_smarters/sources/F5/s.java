package f5;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import i5.AbstractC1896f;
import i5.C1894d;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f40815c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1894d f40818f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f40813a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1896f f40814b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40816d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference f40817e = new WeakReference(null);

    public class a extends AbstractC1896f {
        public a() {
        }

        @Override // i5.AbstractC1896f
        public void a(int i9) {
            s.this.f40816d = true;
            b bVar = (b) s.this.f40817e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // i5.AbstractC1896f
        public void b(Typeface typeface, boolean z9) {
            if (z9) {
                return;
            }
            s.this.f40816d = true;
            b bVar = (b) s.this.f40817e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public s(b bVar) {
        g(bVar);
    }

    public final float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f40813a.measureText(charSequence, 0, charSequence.length());
    }

    public C1894d d() {
        return this.f40818f;
    }

    public TextPaint e() {
        return this.f40813a;
    }

    public float f(String str) {
        if (!this.f40816d) {
            return this.f40815c;
        }
        float fC = c(str);
        this.f40815c = fC;
        this.f40816d = false;
        return fC;
    }

    public void g(b bVar) {
        this.f40817e = new WeakReference(bVar);
    }

    public void h(C1894d c1894d, Context context) {
        if (this.f40818f != c1894d) {
            this.f40818f = c1894d;
            if (c1894d != null) {
                c1894d.o(context, this.f40813a, this.f40814b);
                b bVar = (b) this.f40817e.get();
                if (bVar != null) {
                    this.f40813a.drawableState = bVar.getState();
                }
                c1894d.n(context, this.f40813a, this.f40814b);
                this.f40816d = true;
            }
            b bVar2 = (b) this.f40817e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z9) {
        this.f40816d = z9;
    }

    public void j(Context context) {
        this.f40818f.n(context, this.f40813a, this.f40814b);
    }
}
