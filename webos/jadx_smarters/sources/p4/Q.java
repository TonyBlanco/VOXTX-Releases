package p4;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class Q implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f46418a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U f46419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2435j f46420d;

    public Q(C2435j c2435j, U u9, U u10) {
        this.f46420d = c2435j;
        this.f46418a = u9;
        this.f46419c = u10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        C2435j.E(this.f46420d, this.f46418a, this.f46419c);
    }
}
