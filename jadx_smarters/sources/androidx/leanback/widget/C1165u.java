package androidx.leanback.widget;

import android.view.View;
import androidx.leanback.widget.C1164t;

/* JADX INFO: renamed from: androidx.leanback.widget.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1165u extends C1164t.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f15788a;

    public C1165u(Q q9) {
        this.f15788a = q9;
    }

    @Override // androidx.leanback.widget.C1164t.e
    public View a(View view) {
        return this.f15788a.a(view.getContext());
    }

    @Override // androidx.leanback.widget.C1164t.e
    public void b(View view, View view2) {
        ((P) view).c(view2);
    }
}
