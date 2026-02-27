package F2;

import C2.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1891e = new C0027a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f1892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f1894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1895d;

    /* JADX INFO: renamed from: F2.a$a, reason: collision with other inner class name */
    public static final class C0027a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f1896a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f1897b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f1898c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f1899d = "";

        public C0027a a(d dVar) {
            this.f1897b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f1896a, Collections.unmodifiableList(this.f1897b), this.f1898c, this.f1899d);
        }

        public C0027a c(String str) {
            this.f1899d = str;
            return this;
        }

        public C0027a d(b bVar) {
            this.f1898c = bVar;
            return this;
        }

        public C0027a e(f fVar) {
            this.f1896a = fVar;
            return this;
        }
    }

    public a(f fVar, List list, b bVar, String str) {
        this.f1892a = fVar;
        this.f1893b = list;
        this.f1894c = bVar;
        this.f1895d = str;
    }

    public static C0027a e() {
        return new C0027a();
    }

    public String a() {
        return this.f1895d;
    }

    public b b() {
        return this.f1894c;
    }

    public List c() {
        return this.f1893b;
    }

    public f d() {
        return this.f1892a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
