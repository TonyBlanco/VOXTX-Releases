package t4;

import com.google.android.gms.common.api.Status;
import n4.AbstractC2268e;
import n4.C2266d;

/* JADX INFO: loaded from: classes3.dex */
public final class K implements AbstractC2268e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f50657a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2266d f50658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f50659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f50660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f50661f;

    public K(Status status, C2266d c2266d, String str, String str2, boolean z9) {
        this.f50657a = status;
        this.f50658c = c2266d;
        this.f50659d = str;
        this.f50660e = str2;
        this.f50661f = z9;
    }

    @Override // n4.AbstractC2268e.a
    public final C2266d A() {
        return this.f50658c;
    }

    @Override // n4.AbstractC2268e.a
    public final boolean d() {
        return this.f50661f;
    }

    @Override // n4.AbstractC2268e.a
    public final String f() {
        return this.f50659d;
    }

    @Override // n4.AbstractC2268e.a
    public final String getSessionId() {
        return this.f50660e;
    }

    @Override // com.google.android.gms.common.api.h
    public final Status getStatus() {
        return this.f50657a;
    }
}
