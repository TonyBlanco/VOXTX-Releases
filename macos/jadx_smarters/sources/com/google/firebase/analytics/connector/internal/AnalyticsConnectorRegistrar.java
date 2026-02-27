package com.google.firebase.analytics.connector.internal;

import A5.f;
import C5.a;
import I5.C0637c;
import I5.InterfaceC0639e;
import I5.h;
import I5.r;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import g6.d;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C0637c> getComponents() {
        return Arrays.asList(C0637c.e(a.class).b(r.k(f.class)).b(r.k(Context.class)).b(r.k(d.class)).f(new h() { // from class: D5.a
            @Override // I5.h
            public final Object a(InterfaceC0639e interfaceC0639e) {
                return C5.b.d((A5.f) interfaceC0639e.a(A5.f.class), (Context) interfaceC0639e.a(Context.class), (g6.d) interfaceC0639e.a(g6.d.class));
            }
        }).e().d(), s6.h.b("fire-analytics", "21.3.0"));
    }
}
