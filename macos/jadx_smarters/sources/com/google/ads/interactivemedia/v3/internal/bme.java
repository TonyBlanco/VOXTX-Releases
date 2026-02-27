package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bme extends boj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Writer f21694a = new bmd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final bkd f21695b = new bkd("closed");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f21696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f21697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bjy f21698e;

    public bme() {
        super(f21694a);
        this.f21696c = new ArrayList();
        this.f21698e = bka.f21595a;
    }

    private final bjy t() {
        return (bjy) this.f21696c.get(r0.size() - 1);
    }

    private final void u(bjy bjyVar) {
        if (this.f21697d != null) {
            if (!(bjyVar instanceof bka) || q()) {
                ((bkb) t()).b(this.f21697d, bjyVar);
            }
            this.f21697d = null;
            return;
        }
        if (this.f21696c.isEmpty()) {
            this.f21698e = bjyVar;
            return;
        }
        bjy bjyVarT = t();
        if (!(bjyVarT instanceof bjw)) {
            throw new IllegalStateException();
        }
        ((bjw) bjyVarT).a(bjyVar);
    }

    public final bjy a() {
        if (this.f21696c.isEmpty()) {
            return this.f21698e;
        }
        throw new IllegalStateException("Expected one JSON element but was ".concat(this.f21696c.toString()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boj
    public final void b() throws IOException {
        bjw bjwVar = new bjw();
        u(bjwVar);
        this.f21696c.add(bjwVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boj
    public final void c() throws IOException {
        bkb bkbVar = new bkb();
        u(bkbVar);
        this.f21696c.add(bkbVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boj, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f21696c.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f21696c.add(f21695b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boj
    public final void d() throws IOException {
        if (this.f21696c.isEmpty() || this.f21697d != null) {
            throw new IllegalStateException();
        }
        if (!(t() instanceof bjw)) {
            throw new IllegalStateException();
        }
        this.f21696c.remove(r0.size() - 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boj
    public final void e() throws IOException {
        if (this.f21696c.isEmpty() || this.f21697d != null) {
            throw new IllegalStateException();
        }
        if (!(t() instanceof bkb)) {
            throw new IllegalStateException();
        }
        this.f21696c.remove(r0.size() - 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boj
    public final void f(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f21696c.isEmpty() || this.f21697d != null) {
            throw new IllegalStateException();
        }
        if (!(t() instanceof bkb)) {
            throw new IllegalStateException();
        }
        this.f21697d = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boj, java.io.Flushable
    public final void flush() throws IOException {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boj
    public final void g() throws IOException {
        u(bka.f21595a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boj
    public final void h(double d9) throws IOException {
        if (s() || !(Double.isNaN(d9) || Double.isInfinite(d9))) {
            u(new bkd(Double.valueOf(d9)));
            return;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boj
    public final void i(long j9) throws IOException {
        u(new bkd(Long.valueOf(j9)));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boj
    public final void j(Boolean bool) throws IOException {
        if (bool == null) {
            g();
        } else {
            u(new bkd(bool));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boj
    public final void k(Number number) throws IOException {
        if (number == null) {
            g();
            return;
        }
        if (!s()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(number.toString()));
            }
        }
        u(new bkd(number));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boj
    public final void l(String str) throws IOException {
        if (str == null) {
            g();
        } else {
            u(new bkd(str));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boj
    public final void m(boolean z9) throws IOException {
        u(new bkd(Boolean.valueOf(z9)));
    }
}
