package com.google.android.play.core.integrity;

import android.content.Context;
import q5.C2553C;
import q5.C2556c;
import q5.InterfaceC2555b;
import q5.InterfaceC2557d;

/* JADX INFO: loaded from: classes3.dex */
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f27840a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2557d f27841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2557d f27842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC2557d f27843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC2557d f27844e;

    public /* synthetic */ j(Context context, i iVar) {
        InterfaceC2555b interfaceC2555bB = C2556c.b(context);
        this.f27841b = interfaceC2555bB;
        InterfaceC2557d interfaceC2557dB = C2553C.b(o.f27850a);
        this.f27842c = interfaceC2557dB;
        InterfaceC2557d interfaceC2557dB2 = C2553C.b(new v(interfaceC2555bB, interfaceC2557dB));
        this.f27843d = interfaceC2557dB2;
        this.f27844e = C2553C.b(new n(interfaceC2557dB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f27844e.a();
    }
}
