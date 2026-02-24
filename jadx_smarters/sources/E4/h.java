package e4;

import android.view.Surface;
import p3.C2408n;

/* JADX INFO: loaded from: classes3.dex */
public class h extends C2408n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f40269e;

    public h(Throwable th, p3.t tVar, Surface surface) {
        super(th, tVar);
        this.f40268d = System.identityHashCode(surface);
        this.f40269e = surface == null || surface.isValid();
    }
}
