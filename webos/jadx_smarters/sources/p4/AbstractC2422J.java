package p4;

import com.facebook.ads.AdError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import p4.C2434i;
import t4.C2790q;

/* JADX INFO: renamed from: p4.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2422J extends BasePendingResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t4.v f46403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2434i f46405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2422J(C2434i c2434i, boolean z9) {
        super(null);
        this.f46405c = c2434i;
        this.f46404b = z9;
    }

    public abstract void c();

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.h createFailedResult(Status status) {
        return new C2421I(this, status);
    }

    public final t4.v d() {
        if (this.f46403a == null) {
            this.f46403a = new C2420H(this);
        }
        return this.f46403a;
    }

    public final void e() {
        if (!this.f46404b) {
            Iterator it = this.f46405c.f46525h.iterator();
            while (it.hasNext()) {
                ((C2434i.b) it.next()).d();
            }
            Iterator it2 = this.f46405c.f46526i.iterator();
            while (it2.hasNext()) {
                ((C2434i.a) it2.next()).f();
            }
        }
        try {
            synchronized (this.f46405c.f46518a) {
                c();
            }
        } catch (C2790q unused) {
            setResult(new C2421I(this, new Status(AdError.BROKEN_MEDIA_ERROR_CODE)));
        }
    }
}
