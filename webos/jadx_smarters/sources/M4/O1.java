package M4;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class O1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P1 f4395d;

    public O1(P1 p12, String str, String str2) {
        this.f4395d = p12;
        com.google.android.gms.common.internal.r.g(str);
        this.f4392a = str;
    }

    public final String a() {
        if (!this.f4393b) {
            this.f4393b = true;
            this.f4394c = this.f4395d.o().getString(this.f4392a, null);
        }
        return this.f4394c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f4395d.o().edit();
        editorEdit.putString(this.f4392a, str);
        editorEdit.apply();
        this.f4394c = str;
    }
}
