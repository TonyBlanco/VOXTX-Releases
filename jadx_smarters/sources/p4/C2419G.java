package p4;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: renamed from: p4.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2419G extends BasePendingResult {
    public C2419G() {
        super(null);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.h createFailedResult(Status status) {
        return new C2418F(this, status);
    }
}
