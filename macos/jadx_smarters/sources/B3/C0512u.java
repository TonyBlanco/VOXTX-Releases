package B3;

import android.net.Uri;
import b4.C1227s;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: B3.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0512u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicLong f632h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1227s f634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f639g;

    public C0512u(long j9, C1227s c1227s, long j10) {
        this(j9, c1227s, c1227s.f17598a, Collections.emptyMap(), j10, 0L, 0L);
    }

    public C0512u(long j9, C1227s c1227s, Uri uri, Map map, long j10, long j11, long j12) {
        this.f633a = j9;
        this.f634b = c1227s;
        this.f635c = uri;
        this.f636d = map;
        this.f637e = j10;
        this.f638f = j11;
        this.f639g = j12;
    }

    public static long a() {
        return f632h.getAndIncrement();
    }
}
