package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bnv extends bkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f21754a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f21755b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f21756c = new HashMap();

    public bnv(Class cls) {
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new bnu(cls))) {
                Enum r42 = (Enum) field.get(null);
                String strName = r42.name();
                String string = r42.toString();
                bko bkoVar = (bko) field.getAnnotation(bko.class);
                if (bkoVar != null) {
                    strName = bkoVar.a();
                    for (String str : bkoVar.b()) {
                        this.f21754a.put(str, r42);
                    }
                }
                this.f21754a.put(strName, r42);
                this.f21755b.put(string, r42);
                this.f21756c.put(r42, strName);
            }
        } catch (IllegalAccessException e9) {
            throw new AssertionError(e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        if (bohVar.r() == 9) {
            bohVar.m();
            return null;
        }
        String strH = bohVar.h();
        Enum r02 = (Enum) this.f21754a.get(strH);
        return r02 != null ? r02 : (Enum) this.f21755b.get(strH);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        Enum r32 = (Enum) obj;
        bojVar.l(r32 == null ? null : (String) this.f21756c.get(r32));
    }
}
