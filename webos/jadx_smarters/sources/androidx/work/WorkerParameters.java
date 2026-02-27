package androidx.work;

import Q0.f;
import Q0.p;
import Q0.w;
import android.net.Network;
import c1.InterfaceC1247a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UUID f17264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f17265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f17266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f17267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f17269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1247a f17270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f17271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p f17272i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f17273j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f17274a = Collections.emptyList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f17275b = Collections.emptyList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Network f17276c;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection collection, a aVar, int i9, Executor executor, InterfaceC1247a interfaceC1247a, w wVar, p pVar, f fVar) {
        this.f17264a = uuid;
        this.f17265b = bVar;
        this.f17266c = new HashSet(collection);
        this.f17267d = aVar;
        this.f17268e = i9;
        this.f17269f = executor;
        this.f17270g = interfaceC1247a;
        this.f17271h = wVar;
        this.f17272i = pVar;
        this.f17273j = fVar;
    }

    public Executor a() {
        return this.f17269f;
    }

    public f b() {
        return this.f17273j;
    }

    public UUID c() {
        return this.f17264a;
    }

    public b d() {
        return this.f17265b;
    }

    public InterfaceC1247a e() {
        return this.f17270g;
    }

    public w f() {
        return this.f17271h;
    }
}
