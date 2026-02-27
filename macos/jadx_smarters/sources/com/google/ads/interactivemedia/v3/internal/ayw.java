package com.google.ads.interactivemedia.v3.internal;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class ayw implements ayv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ayw f20952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f20953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ ayw[] f20954c;

    static {
        ayw aywVar = new ayw();
        f20952a = aywVar;
        f20954c = new ayw[]{aywVar};
        f20953b = new CopyOnWriteArraySet();
    }

    private ayw() {
    }

    public static ayw[] values() {
        return (ayw[]) f20954c.clone();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayv
    public final void a(Class cls) {
        Iterator it = f20953b.iterator();
        while (it.hasNext()) {
            if (cls.equals(((WeakReference) it.next()).get())) {
                return;
            }
        }
        ayy.c(cls);
        Set set = f20953b;
        if (set.size() > 1000) {
            set.clear();
        }
        set.add(new WeakReference(cls));
    }
}
