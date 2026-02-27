package androidx.activity;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final void a(View view, l onBackPressedDispatcherOwner) {
        kotlin.jvm.internal.l.e(view, "<this>");
        kotlin.jvm.internal.l.e(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(m.f13525a, onBackPressedDispatcherOwner);
    }
}
