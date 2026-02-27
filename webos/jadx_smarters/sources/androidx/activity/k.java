package androidx.activity;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f13524a;

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f13524a.run();
    }
}
