package h1;

import android.content.Intent;

/* JADX INFO: renamed from: h1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1846a extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Intent f41505d;

    public C1846a(k kVar) {
        super(kVar);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f41505d != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
