package o4;

import com.google.android.gms.common.api.internal.AbstractC1388t;
import com.google.android.gms.common.api.internal.InterfaceC1383q;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import n4.C2276i;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2328e f45885a;

    public /* synthetic */ k0(C2328e c2328e, j0 j0Var) {
        this.f45885a = c2328e;
    }

    @Override // o4.t0
    public final void A0(final String str, final C2276i c2276i) {
        C2328e c2328e = this.f45885a;
        if (c2328e.f45875j == null || !c2328e.f45875j.zzl()) {
            return;
        }
        final n4.Y y9 = (n4.Y) this.f45885a.f45875j;
        y9.doWrite(AbstractC1388t.a().b(new InterfaceC1383q() { // from class: n4.E
            @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
            public final void accept(Object obj, Object obj2) {
                y9.o(str, c2276i, (t4.S) obj, (TaskCompletionSource) obj2);
            }
        }).e(8406).a()).addOnCompleteListener(new OnCompleteListener() { // from class: o4.h0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C2328e.B(this.f45882a.f45885a, "launchApplication", task);
            }
        });
    }

    @Override // o4.t0
    public final void J0(final String str, final String str2) {
        C2328e c2328e = this.f45885a;
        if (c2328e.f45875j == null || !c2328e.f45875j.zzl()) {
            return;
        }
        final n4.Y y9 = (n4.Y) this.f45885a.f45875j;
        final n4.Z z9 = null;
        y9.doWrite(AbstractC1388t.a().b(new InterfaceC1383q(str, str2, z9) { // from class: n4.L

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f45297b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f45298c;

            @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
            public final void accept(Object obj, Object obj2) {
                this.f45296a.n(this.f45297b, this.f45298c, null, (t4.S) obj, (TaskCompletionSource) obj2);
            }
        }).e(8407).a()).addOnCompleteListener(new OnCompleteListener() { // from class: o4.i0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C2328e.B(this.f45884a.f45885a, "joinApplication", task);
            }
        });
    }

    @Override // o4.t0
    public final void p0(final String str) {
        C2328e c2328e = this.f45885a;
        if (c2328e.f45875j == null || !c2328e.f45875j.zzl()) {
            return;
        }
        final n4.Y y9 = (n4.Y) this.f45885a.f45875j;
        y9.doWrite(AbstractC1388t.a().b(new InterfaceC1383q() { // from class: n4.I
            @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
            public final void accept(Object obj, Object obj2) {
                y9.t(str, (t4.S) obj, (TaskCompletionSource) obj2);
            }
        }).e(8409).a());
    }

    @Override // o4.t0
    public final void zzb(int i9) {
        C2328e.A(this.f45885a, i9);
    }
}
