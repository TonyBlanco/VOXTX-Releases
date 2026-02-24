package t4;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: t4.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2773F extends AbstractBinderC2780g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f50649a;

    public BinderC2773F(H h9, TaskCompletionSource taskCompletionSource) {
        this.f50649a = taskCompletionSource;
    }

    @Override // t4.InterfaceC2781h
    public final void D0(Bundle bundle) {
        this.f50649a.setResult(bundle);
    }
}
