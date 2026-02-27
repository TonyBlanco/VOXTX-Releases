package com.nytimes.android.external.cache;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h {

    public static final class a extends h implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f37974a = new a();

        @Override // com.nytimes.android.external.cache.h
        public boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.nytimes.android.external.cache.h
        public int b(Object obj) {
            return obj.hashCode();
        }
    }

    public static final class b extends h implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f37975a = new b();

        @Override // com.nytimes.android.external.cache.h
        public boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // com.nytimes.android.external.cache.h
        public int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static h c() {
        return a.f37974a;
    }

    public static h f() {
        return b.f37975a;
    }

    public abstract boolean a(Object obj, Object obj2);

    public abstract int b(Object obj);

    public final boolean d(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return a(obj, obj2);
    }

    public final int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return b(obj);
    }
}
