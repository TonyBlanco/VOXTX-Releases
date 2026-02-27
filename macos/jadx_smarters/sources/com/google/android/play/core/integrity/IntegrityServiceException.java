package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class IntegrityServiceException extends com.google.android.gms.common.api.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f27832a;

    public IntegrityServiceException(int i9, Throwable th) {
        super(new Status(i9, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i9), com.google.android.play.core.integrity.model.a.a(i9))));
        if (i9 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f27832a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f27832a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
