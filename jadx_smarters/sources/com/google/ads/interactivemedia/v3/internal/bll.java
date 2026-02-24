package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
final class bll extends bln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Method f21667a;

    public bll(Method method) {
        this.f21667a = method;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bln
    public final boolean a(AccessibleObject accessibleObject, Object obj) {
        try {
            return ((Boolean) this.f21667a.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e9) {
            throw new RuntimeException("Failed invoking canAccess", e9);
        }
    }
}
