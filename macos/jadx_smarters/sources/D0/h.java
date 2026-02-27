package d0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class h implements TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransformationMethod f39466a;

    public h(TransformationMethod transformationMethod) {
        this.f39466a = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f39466a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f39466a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.e.b().d() != 1) ? charSequence : androidx.emoji2.text.e.b().o(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z9, int i9, Rect rect) {
        TransformationMethod transformationMethod = this.f39466a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z9, i9, rect);
        }
    }
}
