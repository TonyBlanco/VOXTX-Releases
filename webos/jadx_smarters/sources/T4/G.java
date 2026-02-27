package t4;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final class G extends AbstractBinderC2780g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f50650a;

    public G(H h9, TaskCompletionSource taskCompletionSource) {
        this.f50650a = taskCompletionSource;
    }

    @Override // t4.InterfaceC2781h
    public final void D0(Bundle bundle) {
        this.f50650a.setResult(bundle);
    }
}
