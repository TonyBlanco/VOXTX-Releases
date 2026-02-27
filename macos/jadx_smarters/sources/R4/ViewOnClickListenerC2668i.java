package r4;

import android.view.View;

/* JADX INFO: renamed from: r4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC2668i implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f49711a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2661b f49712c;

    public ViewOnClickListenerC2668i(C2661b c2661b, long j9) {
        this.f49712c = c2661b;
        this.f49711a = j9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f49712c.G(view, this.f49711a);
    }
}
