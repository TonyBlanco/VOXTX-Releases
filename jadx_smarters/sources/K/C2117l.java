package k;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: k.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2117l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f43376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0.f f43377b;

    public C2117l(TextView textView) {
        this.f43376a = textView;
        this.f43377b = new d0.f(textView, false);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f43377b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f43377b.b();
    }

    public void c(AttributeSet attributeSet, int i9) {
        TypedArray typedArrayObtainStyledAttributes = this.f43376a.getContext().obtainStyledAttributes(attributeSet, c.j.f18079g0, i9, 0);
        try {
            boolean z9 = typedArrayObtainStyledAttributes.hasValue(c.j.f18149u0) ? typedArrayObtainStyledAttributes.getBoolean(c.j.f18149u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z9);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void d(boolean z9) {
        this.f43377b.c(z9);
    }

    public void e(boolean z9) {
        this.f43377b.d(z9);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f43377b.e(transformationMethod);
    }
}
