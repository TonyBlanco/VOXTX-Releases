package M4;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class J1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P1 f4325e;

    public J1(P1 p12, String str, boolean z9) {
        this.f4325e = p12;
        com.google.android.gms.common.internal.r.g(str);
        this.f4321a = str;
        this.f4322b = z9;
    }

    public final void a(boolean z9) {
        SharedPreferences.Editor editorEdit = this.f4325e.o().edit();
        editorEdit.putBoolean(this.f4321a, z9);
        editorEdit.apply();
        this.f4324d = z9;
    }

    public final boolean b() {
        if (!this.f4323c) {
            this.f4323c = true;
            this.f4324d = this.f4325e.o().getBoolean(this.f4321a, this.f4322b);
        }
        return this.f4324d;
    }
}
