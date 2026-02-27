package com.amazonaws.mobileconnectors.appsync.cache.normalized;

import F1.d;
import F1.h;
import F1.i;
import F1.j;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import v1.InterfaceC2864b;
import v1.InterfaceC2868f;
import v1.l;
import y1.C2982a;
import z1.AbstractC3004c;
import z1.AbstractC3006e;
import z1.AbstractC3007f;
import z1.C3003b;
import z1.C3010i;
import z1.InterfaceC3002a;

/* JADX INFO: loaded from: classes.dex */
public class AppSyncStore {
    private InterfaceC3002a mStore;

    public AppSyncStore(InterfaceC3002a interfaceC3002a) {
        this.mStore = interfaceC3002a;
    }

    public AbstractC3004c cacheKeyResolver() {
        return this.mStore.a();
    }

    public h cacheResponseNormalizer() {
        return this.mStore.e();
    }

    public AbstractC3006e clearAll() {
        return this.mStore.s();
    }

    public Set<String> merge(Collection<C3010i> collection, C2982a c2982a) {
        return ((j) this.mStore).q(collection, c2982a);
    }

    public Set<String> merge(C3010i c3010i, C2982a c2982a) {
        return ((j) this.mStore).w(c3010i, c2982a);
    }

    public h networkResponseNormalizer() {
        return this.mStore.j();
    }

    public AbstractC3007f normalizedCache() {
        return this.mStore.u();
    }

    public void publish(Set<String> set) {
        this.mStore.r(set);
    }

    public Collection<C3010i> read(Collection<String> collection, C2982a c2982a) {
        return ((d) this.mStore).p(collection, c2982a);
    }

    public <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> AbstractC3006e read(InterfaceC2868f interfaceC2868f) {
        return this.mStore.k(interfaceC2868f);
    }

    public <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> AbstractC3006e read(InterfaceC2868f interfaceC2868f, l lVar, h hVar, C2982a c2982a) {
        return this.mStore.v(interfaceC2868f, lVar, hVar, c2982a);
    }

    public <F extends InterfaceC2864b> AbstractC3006e read(l lVar, C3003b c3003b, InterfaceC2868f.b bVar) {
        return this.mStore.f(lVar, c3003b, bVar);
    }

    public C3010i read(String str, C2982a c2982a) {
        return ((d) this.mStore).t(str, c2982a);
    }

    public <R> R readTransaction(i iVar) {
        return (R) this.mStore.o(iVar);
    }

    public AbstractC3006e remove(List<C3003b> list) {
        return this.mStore.m(list);
    }

    public AbstractC3006e remove(C3003b c3003b) {
        return this.mStore.d(c3003b);
    }

    public synchronized void subscribe(InterfaceC3002a.InterfaceC0490a interfaceC0490a) {
        this.mStore.l(interfaceC0490a);
    }

    public synchronized void unsubscribe(InterfaceC3002a.InterfaceC0490a interfaceC0490a) {
        this.mStore.h(interfaceC0490a);
    }

    public AbstractC3006e write(InterfaceC2864b interfaceC2864b, C3003b c3003b, InterfaceC2868f.b bVar) {
        return this.mStore.g(interfaceC2864b, c3003b, bVar);
    }

    public <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> AbstractC3006e write(InterfaceC2868f interfaceC2868f, D d9) {
        return this.mStore.i(interfaceC2868f, d9);
    }

    public AbstractC3006e writeAndPublish(InterfaceC2864b interfaceC2864b, C3003b c3003b, InterfaceC2868f.b bVar) {
        return this.mStore.c(interfaceC2864b, c3003b, bVar);
    }

    public <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> AbstractC3006e writeAndPublish(InterfaceC2868f interfaceC2868f, D d9) {
        return this.mStore.b(interfaceC2868f, d9);
    }

    public <R> R writeTransaction(i iVar) {
        return (R) this.mStore.n(iVar);
    }
}
