package D8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import k8.j;
import k8.q;
import o8.InterfaceC2372d;
import p8.AbstractC2512c;
import q8.AbstractC2649h;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends f implements Iterator, InterfaceC2372d, x8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1520a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f1522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC2372d f1523e;

    @Override // D8.f
    public Object a(Object obj, InterfaceC2372d interfaceC2372d) {
        this.f1521c = obj;
        this.f1520a = 3;
        this.f1523e = interfaceC2372d;
        Object objD = AbstractC2512c.d();
        if (objD == AbstractC2512c.d()) {
            AbstractC2649h.c(interfaceC2372d);
        }
        return objD == AbstractC2512c.d() ? objD : q.f43674a;
    }

    public final Throwable c() {
        int i9 = this.f1520a;
        if (i9 == 4) {
            return new NoSuchElementException();
        }
        if (i9 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f1520a);
    }

    public final Object d() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public final void e(InterfaceC2372d interfaceC2372d) {
        this.f1523e = interfaceC2372d;
    }

    @Override // o8.InterfaceC2372d
    public o8.g getContext() {
        return o8.h.f46144a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i9 = this.f1520a;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2 || i9 == 3) {
                        return true;
                    }
                    if (i9 == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.f1522d;
                kotlin.jvm.internal.l.b(it);
                if (it.hasNext()) {
                    this.f1520a = 2;
                    return true;
                }
                this.f1522d = null;
            }
            this.f1520a = 5;
            InterfaceC2372d interfaceC2372d = this.f1523e;
            kotlin.jvm.internal.l.b(interfaceC2372d);
            this.f1523e = null;
            j.a aVar = k8.j.f43666c;
            interfaceC2372d.resumeWith(k8.j.b(q.f43674a));
        }
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i9 = this.f1520a;
        if (i9 == 0 || i9 == 1) {
            return d();
        }
        if (i9 == 2) {
            this.f1520a = 1;
            Iterator it = this.f1522d;
            kotlin.jvm.internal.l.b(it);
            return it.next();
        }
        if (i9 != 3) {
            throw c();
        }
        this.f1520a = 0;
        Object obj = this.f1521c;
        this.f1521c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // o8.InterfaceC2372d
    public void resumeWith(Object obj) throws Throwable {
        k8.k.b(obj);
        this.f1520a = 4;
    }
}
