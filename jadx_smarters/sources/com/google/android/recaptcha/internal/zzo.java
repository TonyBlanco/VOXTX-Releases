package com.google.android.recaptcha.internal;

import k8.k;
import k8.q;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p8.AbstractC2512c;
import q8.l;
import w8.p;

/* JADX INFO: loaded from: classes3.dex */
final class zzo extends l implements p {
    public zzo(InterfaceC2372d interfaceC2372d) {
        super(2, interfaceC2372d);
    }

    @Override // q8.AbstractC2642a
    @NotNull
    public final InterfaceC2372d create(@Nullable Object obj, @NotNull InterfaceC2372d interfaceC2372d) {
        return new zzo(interfaceC2372d);
    }

    @Override // w8.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new zzo((InterfaceC2372d) obj2).invokeSuspend(q.f43674a);
    }

    @Override // q8.AbstractC2642a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        AbstractC2512c.d();
        k.b(obj);
        Thread.currentThread().setPriority(8);
        return q.f43674a;
    }
}
