package w4;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends zau {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f51679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2920h f51680b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C2920h c2920h, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f51680b = c2920h;
        this.f51679a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i9 = message.what;
        if (i9 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i9);
            return;
        }
        C2920h c2920h = this.f51680b;
        int i10 = c2920h.i(this.f51679a);
        if (c2920h.m(i10)) {
            this.f51680b.s(this.f51679a, i10);
        }
    }
}
