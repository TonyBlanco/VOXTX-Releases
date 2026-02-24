package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class bev {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f21157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f21158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f21159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f21160d;

    public bev() {
        this.f21157a = new HashMap();
        this.f21158b = new HashMap();
        this.f21159c = new HashMap();
        this.f21160d = new HashMap();
    }

    public bev(bev bevVar) {
        this.f21157a = new HashMap(bevVar.f21157a);
        this.f21158b = new HashMap(bevVar.f21158b);
        this.f21159c = new HashMap(bevVar.f21159c);
        this.f21160d = new HashMap(bevVar.f21160d);
    }

    public /* synthetic */ bev(bev bevVar, byte[] bArr) {
        this.f21157a = new HashMap(bevVar.f21157a);
        this.f21158b = new HashMap(bevVar.f21158b);
        this.f21159c = new HashMap(bevVar.f21159c);
        this.f21160d = new HashMap(bevVar.f21160d);
    }

    public final azu a(bes besVar, bap bapVar) throws GeneralSecurityException {
        bet betVar = new bet(besVar.getClass(), besVar.d());
        if (this.f21158b.containsKey(betVar)) {
            return ((bdw) this.f21158b.get(betVar)).d(besVar, bapVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + betVar.toString() + " available");
    }

    public final bev f() {
        return new bev(this, null);
    }

    public final void g(bdw bdwVar) throws GeneralSecurityException {
        bet betVar = new bet(bdwVar.c(), bdwVar.b());
        if (!this.f21158b.containsKey(betVar)) {
            this.f21158b.put(betVar, bdwVar);
            return;
        }
        bdw bdwVar2 = (bdw) this.f21158b.get(betVar);
        if (!bdwVar2.equals(bdwVar) || !bdwVar.equals(bdwVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(betVar.toString()));
        }
    }

    public final void h(bdy bdyVar) throws GeneralSecurityException {
        beu beuVar = new beu(bdyVar.b(), bdyVar.c());
        if (!this.f21157a.containsKey(beuVar)) {
            this.f21157a.put(beuVar, bdyVar);
            return;
        }
        bdy bdyVar2 = (bdy) this.f21157a.get(beuVar);
        if (!bdyVar2.equals(bdyVar) || !bdyVar.equals(bdyVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(beuVar.toString()));
        }
    }

    public final void i(bel belVar) throws GeneralSecurityException {
        bet betVar = new bet(belVar.c(), belVar.b());
        if (!this.f21160d.containsKey(betVar)) {
            this.f21160d.put(betVar, belVar);
            return;
        }
        bel belVar2 = (bel) this.f21160d.get(betVar);
        if (!belVar2.equals(belVar) || !belVar.equals(belVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(betVar.toString()));
        }
    }

    public final void j(ben benVar) throws GeneralSecurityException {
        beu beuVar = new beu(benVar.b(), benVar.c());
        if (!this.f21159c.containsKey(beuVar)) {
            this.f21159c.put(beuVar, benVar);
            return;
        }
        ben benVar2 = (ben) this.f21159c.get(beuVar);
        if (!benVar2.equals(benVar) || !benVar.equals(benVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(beuVar.toString()));
        }
    }
}
