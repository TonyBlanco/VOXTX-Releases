package M4;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class L1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P1 f4354e;

    public L1(P1 p12, String str, long j9) {
        this.f4354e = p12;
        com.google.android.gms.common.internal.r.g(str);
        this.f4350a = str;
        this.f4351b = j9;
    }

    public final long a() {
        if (!this.f4352c) {
            this.f4352c = true;
            this.f4353d = this.f4354e.o().getLong(this.f4350a, this.f4351b);
        }
        return this.f4353d;
    }

    public final void b(long j9) {
        SharedPreferences.Editor editorEdit = this.f4354e.o().edit();
        editorEdit.putLong(this.f4350a, j9);
        editorEdit.apply();
        this.f4353d = j9;
    }
}
