package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
abstract class azc extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Runnable f20959a = new azb(null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Runnable f20960b = new azb(null, 0);

    private final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        aza azaVar = null;
        boolean z9 = false;
        int i9 = 0;
        while (true) {
            if (!(runnable instanceof aza)) {
                if (runnable != f20960b) {
                    break;
                }
            } else {
                azaVar = (aza) runnable;
            }
            i9++;
            if (i9 > 1000) {
                Runnable runnable2 = f20960b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z9 = Thread.interrupted() || z9;
                    LockSupport.park(azaVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z9) {
            thread.interrupt();
        }
    }

    public abstract Object a() throws Exception;

    public abstract String b();

    public abstract void d(Throwable th);

    public abstract void e(Object obj);

    public abstract boolean g();

    public final void h() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            aza azaVar = new aza(this);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, azaVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f20959a)) == f20960b) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(f20959a)) == f20960b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z9 = !g();
            if (z9) {
                try {
                    objA = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, f20959a)) {
                            c(threadCurrentThread);
                        }
                        d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, f20959a)) {
                            c(threadCurrentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f20959a)) {
                c(threadCurrentThread);
            }
            if (z9) {
                e(objA);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f20959a) {
            str = "running=[DONE]";
        } else if (runnable instanceof aza) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
