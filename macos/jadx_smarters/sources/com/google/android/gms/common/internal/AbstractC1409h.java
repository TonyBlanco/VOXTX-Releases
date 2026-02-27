package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.InterfaceC1361f;
import com.google.android.gms.common.api.internal.InterfaceC1377n;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import w4.C2916d;
import w4.C2920h;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1409h extends AbstractC1404c implements a.f, J {
    private static volatile Executor zaa;
    private final C1406e zab;
    private final Set zac;
    private final Account zad;

    public AbstractC1409h(Context context, Looper looper, int i9, C1406e c1406e, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        this(context, looper, i9, c1406e, (InterfaceC1361f) bVar, (InterfaceC1377n) cVar);
    }

    public AbstractC1409h(Context context, Looper looper, int i9, C1406e c1406e, InterfaceC1361f interfaceC1361f, InterfaceC1377n interfaceC1377n) {
        this(context, looper, AbstractC1410i.a(context), C2920h.q(), i9, c1406e, (InterfaceC1361f) r.m(interfaceC1361f), (InterfaceC1377n) r.m(interfaceC1377n));
    }

    public AbstractC1409h(Context context, Looper looper, AbstractC1410i abstractC1410i, C2920h c2920h, int i9, C1406e c1406e, InterfaceC1361f interfaceC1361f, InterfaceC1377n interfaceC1377n) {
        super(context, looper, abstractC1410i, c2920h, i9, interfaceC1361f == null ? null : new H(interfaceC1361f), interfaceC1377n == null ? null : new I(interfaceC1377n), c1406e.i());
        this.zab = c1406e;
        this.zad = c1406e.b();
        this.zac = f(c1406e.d());
    }

    public final Set f(Set set) {
        Set<Scope> setValidateScopes = validateScopes(set);
        Iterator<Scope> it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setValidateScopes;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public Executor getBindServiceExecutor() {
        return null;
    }

    public final C1406e getClientSettings() {
        return this.zab;
    }

    public C2916d[] getRequiredFeatures() {
        return new C2916d[0];
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}
