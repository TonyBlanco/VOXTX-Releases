package Q;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: Q.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1009a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f7431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7432c;

    public C1009a(int i9, C c9, int i10) {
        this.f7430a = i9;
        this.f7431b = c9;
        this.f7432c = i10;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f7430a);
        this.f7431b.N(this.f7432c, bundle);
    }
}
