package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class apb extends apj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final StackTraceElement[] f20455h;

    public apb(anw anwVar, agl aglVar, int i9, StackTraceElement[] stackTraceElementArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "5Y5rtCIQhjVwnkrBvzpTMg0rZuVvyD2oudHeojlpiyRPt3QF1dIwn8qKzMnR3WrD", "L+eAMQBxQYtni61+5W3ps9X1nzCZQ5WzyUUXMjOuRZ4=", aglVar, i9, 45, null, null, null);
        this.f20455h = stackTraceElementArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.f20455h;
        if (stackTraceElementArr != null) {
            anq anqVar = new anq((String) this.f20471d.invoke(null, stackTraceElementArr));
            synchronized (this.f20474g) {
                try {
                    this.f20474g.ap(anqVar.f20343a.longValue());
                    if (anqVar.f20344b.booleanValue()) {
                        this.f20474g.aM(anqVar.f20345c.booleanValue() ? agh.f19669a : agh.f19670b);
                    } else {
                        this.f20474g.aM(agh.f19671c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
