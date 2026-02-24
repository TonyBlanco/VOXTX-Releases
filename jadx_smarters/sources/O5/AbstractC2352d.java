package o5;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: o5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2352d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextInputLayout f46082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f46083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CheckableImageButton f46084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46085d;

    public AbstractC2352d(TextInputLayout textInputLayout, int i9) {
        this.f46082a = textInputLayout;
        this.f46083b = textInputLayout.getContext();
        this.f46084c = textInputLayout.getEndIconView();
        this.f46085d = i9;
    }

    public abstract void a();

    public boolean b(int i9) {
        return true;
    }

    public void c(boolean z9) {
    }

    public boolean d() {
        return false;
    }
}
