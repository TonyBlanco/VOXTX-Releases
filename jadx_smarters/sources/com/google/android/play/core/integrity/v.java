package com.google.android.play.core.integrity;

import android.content.Context;
import q5.C2567n;
import q5.InterfaceC2555b;
import q5.InterfaceC2557d;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements InterfaceC2555b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2557d f27864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2557d f27865b;

    public v(InterfaceC2557d interfaceC2557d, InterfaceC2557d interfaceC2557d2) {
        this.f27864a = interfaceC2557d;
        this.f27865b = interfaceC2557d2;
    }

    @Override // q5.InterfaceC2557d
    public final /* bridge */ /* synthetic */ Object a() {
        return new t((Context) this.f27864a.a(), (C2567n) this.f27865b.a());
    }
}
