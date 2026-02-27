package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class aoj extends apj {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ayt f20428i = new ayt();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f20429h;

    public aoj(anw anwVar, agl aglVar, int i9, Context context, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "ATj3hbklxV/XiswqkLJ9VlaAJFBsAV/1VJ4eSTnw1AP/96KhgekAXYnIpmljK7wO", "rfBYaobM06JIPnbukgoyOwsb7bCc9rvkUNfR4KOQWHU=", aglVar, i9, 29, null, null, null);
        this.f20429h = context;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.f20474g.W("E");
        AtomicReference atomicReferenceB = f20428i.b(this.f20429h.getPackageName());
        if (atomicReferenceB.get() == null) {
            synchronized (atomicReferenceB) {
                try {
                    if (atomicReferenceB.get() == null) {
                        atomicReferenceB.set((String) this.f20471d.invoke(null, this.f20429h));
                    }
                } finally {
                }
            }
        }
        String str = (String) atomicReferenceB.get();
        synchronized (this.f20474g) {
            this.f20474g.W(com.google.ads.interactivemedia.v3.impl.data.aq.a(str.getBytes(), true));
        }
    }
}
