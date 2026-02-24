package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d.AbstractC1617D;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f27499c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27500a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f27501b = new Handler(Looper.getMainLooper(), new C0262a());

    /* JADX INFO: renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    public class C0262a implements Handler.Callback {
        public C0262a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            AbstractC1617D.a(message.obj);
            aVar.c(null);
            return true;
        }
    }

    public interface b {
    }

    public static class c {
    }

    public static a b() {
        if (f27499c == null) {
            f27499c = new a();
        }
        return f27499c;
    }

    public final boolean a(c cVar, int i9) {
        throw null;
    }

    public void c(c cVar) {
        synchronized (this.f27500a) {
            a(cVar, 2);
        }
    }

    public final boolean d(b bVar) {
        return false;
    }

    public void e(b bVar) {
        synchronized (this.f27500a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f27500a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
