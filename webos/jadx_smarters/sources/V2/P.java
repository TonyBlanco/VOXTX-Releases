package V2;

import android.net.Uri;
import b4.C1227s;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class P extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1227s f9895a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f9896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f9897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9898e;

    public P(C1227s c1227s, Uri uri, Map map, long j9, Throwable th) {
        super(th);
        this.f9895a = c1227s;
        this.f9896c = uri;
        this.f9897d = map;
        this.f9898e = j9;
    }
}
