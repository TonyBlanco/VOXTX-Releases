package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class bej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bej f21140a = new bej();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f21141b = new AtomicReference(new bev().f());

    public static bej b() {
        return f21140a;
    }

    public final azu a(beq beqVar, bap bapVar) {
        try {
            try {
                return ((bev) this.f21141b.get()).a(beqVar, bapVar);
            } catch (GeneralSecurityException e9) {
                throw new bew(e9);
            }
        } catch (GeneralSecurityException unused) {
            return new bee(beqVar);
        }
    }

    public final synchronized void c(bdw bdwVar) throws GeneralSecurityException {
        bev bevVar = new bev((bev) this.f21141b.get());
        bevVar.g(bdwVar);
        this.f21141b.set(bevVar.f());
    }

    public final synchronized void d(bdy bdyVar) throws GeneralSecurityException {
        bev bevVar = new bev((bev) this.f21141b.get());
        bevVar.h(bdyVar);
        this.f21141b.set(bevVar.f());
    }

    public final synchronized void e(bel belVar) throws GeneralSecurityException {
        bev bevVar = new bev((bev) this.f21141b.get());
        bevVar.i(belVar);
        this.f21141b.set(bevVar.f());
    }

    public final synchronized void f(ben benVar) throws GeneralSecurityException {
        bev bevVar = new bev((bev) this.f21141b.get());
        bevVar.j(benVar);
        this.f21141b.set(bevVar.f());
    }
}
