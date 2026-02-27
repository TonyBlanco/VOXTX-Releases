package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1371k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f26643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f26644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile a f26645c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.k$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f26646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f26647b;

        public a(Object obj, String str) {
            this.f26646a = obj;
            this.f26647b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f26646a == aVar.f26646a && this.f26647b.equals(aVar.f26647b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f26646a) * 31) + this.f26647b.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.k$b */
    public interface b {
        void notifyListener(Object obj);

        void onNotifyListenerFailed();
    }

    public C1371k(Looper looper, Object obj, String str) {
        this.f26643a = new D4.a(looper);
        this.f26644b = com.google.android.gms.common.internal.r.n(obj, "Listener must not be null");
        this.f26645c = new a(obj, com.google.android.gms.common.internal.r.g(str));
    }

    public void a() {
        this.f26644b = null;
        this.f26645c = null;
    }

    public a b() {
        return this.f26645c;
    }

    public void c(final b bVar) {
        com.google.android.gms.common.internal.r.n(bVar, "Notifier must not be null");
        this.f26643a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.w0
            @Override // java.lang.Runnable
            public final void run() {
                this.f26726a.d(bVar);
            }
        });
    }

    public final void d(b bVar) {
        Object obj = this.f26644b;
        if (obj == null) {
            bVar.onNotifyListenerFailed();
            return;
        }
        try {
            bVar.notifyListener(obj);
        } catch (RuntimeException e9) {
            bVar.onNotifyListenerFailed();
            throw e9;
        }
    }
}
