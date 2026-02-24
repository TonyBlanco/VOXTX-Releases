package r4;

import android.view.View;

/* JADX INFO: renamed from: r4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC2667h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f49709a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2661b f49710c;

    public ViewOnClickListenerC2667h(C2661b c2661b, long j9) {
        this.f49710c = c2661b;
        this.f49709a = j9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f49710c.C(view, this.f49709a);
    }
}
