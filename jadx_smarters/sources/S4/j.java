package s4;

import android.view.View;
import p4.C2434i;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2709a f49956a;

    public j(AbstractActivityC2709a abstractActivityC2709a) {
        this.f49956a = abstractActivityC2709a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2434i c2434iD1;
        if (!this.f49956a.f49909J.isClickable() || (c2434iD1 = this.f49956a.D1()) == null) {
            return;
        }
        c2434iD1.V();
    }
}
