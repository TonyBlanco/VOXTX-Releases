package com.google.ads.interactivemedia.v3.internal;

import com.amplifyframework.core.model.ModelIdentifier;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bml implements bkm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bkw f21721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bjm f21722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bky f21723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bma f21724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f21725e;

    public bml(bkw bkwVar, bjm bjmVar, bky bkyVar, bma bmaVar, List list) {
        this.f21721a = bkwVar;
        this.f21722b = bjmVar;
        this.f21723c = bkyVar;
        this.f21724d = bmaVar;
        this.f21725e = list;
    }

    public static /* bridge */ /* synthetic */ void b(Object obj, Field field) {
        if (true == Modifier.isStatic(field.getModifiers())) {
            obj = null;
        }
        if (blo.c(field, obj)) {
            return;
        }
        throw new bjz("Field '" + field.getDeclaringClass().getName() + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + field.getName() + "' is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type or adjust the access filter.");
    }

    private final boolean c(Field field, boolean z9) {
        return (this.f21723c.c(field.getType(), z9) || this.f21723c.d(field, z9)) ? false : true;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // com.google.ads.interactivemedia.v3.internal.bkm
    public final com.google.ads.interactivemedia.v3.internal.bkl a(com.google.ads.interactivemedia.v3.internal.bjt r40, com.google.ads.interactivemedia.v3.internal.bof r41) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bml.a(com.google.ads.interactivemedia.v3.internal.bjt, com.google.ads.interactivemedia.v3.internal.bof):com.google.ads.interactivemedia.v3.internal.bkl");
    }
}
