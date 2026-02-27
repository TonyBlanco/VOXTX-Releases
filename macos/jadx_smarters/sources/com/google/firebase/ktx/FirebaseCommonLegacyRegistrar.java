package com.google.firebase.ktx;

import I5.C0637c;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import l8.j;
import org.jetbrains.annotations.NotNull;
import s6.h;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<C0637c> getComponents() {
        return j.b(h.b("fire-core-ktx", "20.4.2"));
    }
}
