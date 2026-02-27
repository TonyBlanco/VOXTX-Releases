package com.google.ads.interactivemedia.v3.internal;

import android.os.ConditionVariable;
import j$.util.concurrent.ThreadLocalRandom;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class amu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected volatile Boolean f20275b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final anw f20276e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConditionVariable f20273c = new ConditionVariable();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static volatile ata f20272a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile Random f20274d = null;

    public amu(anw anwVar) {
        this.f20276e = anwVar;
        anwVar.j().execute(new amt(this, 0));
    }

    public static final int d() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            return f().nextInt();
        }
    }

    private static Random f() {
        if (f20274d == null) {
            synchronized (amu.class) {
                try {
                    if (f20274d == null) {
                        f20274d = new Random();
                    }
                } finally {
                }
            }
        }
        return f20274d;
    }

    public final void c(int i9, int i10, long j9, String str, Exception exc) {
        try {
            f20273c.block();
            if (!this.f20275b.booleanValue() || f20272a == null) {
                return;
            }
            afl aflVarJ = afk.j();
            aflVarJ.a(this.f20276e.f20361a.getPackageName());
            aflVarJ.e(j9);
            if (str != null) {
                aflVarJ.b(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                aflVarJ.f(stringWriter.toString());
                aflVarJ.d(exc.getClass().getName());
            }
            asz aszVarA = f20272a.a(((afk) aflVarJ.aY()).av());
            aszVarA.b(i9);
            if (i10 != -1) {
                aszVarA.c(i10);
            }
            aszVarA.a();
        } catch (Exception unused) {
        }
    }

    public final void e(int i9, long j9, String str) {
        c(i9, -1, j9, str, null);
    }
}
