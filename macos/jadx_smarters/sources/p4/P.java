package p4;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class P implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2435j f46417a;

    public P(C2435j c2435j) {
        this.f46417a = c2435j;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        C2435j c2435j = this.f46417a;
        if (c2435j.f46533f != null) {
            c2435j.f46533f.cancel();
            this.f46417a.f46533f = null;
        }
    }
}
