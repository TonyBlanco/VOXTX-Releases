package g7;

import android.util.Log;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lock f41495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Condition f41496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41498d;

    public m() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f41495a = reentrantLock;
        this.f41496b = reentrantLock.newCondition();
        this.f41497c = false;
        this.f41498d = false;
    }

    public void a() {
        this.f41495a.lock();
        try {
            Log.v("ThreadControl", "Cancelling");
            if (this.f41498d) {
                return;
            }
            this.f41498d = true;
            this.f41496b.signalAll();
        } finally {
            this.f41495a.unlock();
        }
    }

    public boolean b() {
        return this.f41498d;
    }

    public void c() {
        this.f41495a.lock();
        Log.v("ThreadControl", "Pausing");
        this.f41497c = true;
        this.f41495a.unlock();
    }

    public void d() {
        this.f41495a.lock();
        try {
            Log.v("ThreadControl", "Resuming");
            if (this.f41497c) {
                this.f41497c = false;
                this.f41496b.signalAll();
            }
        } finally {
            this.f41495a.unlock();
        }
    }

    public void e() {
        this.f41495a.lock();
        while (this.f41497c && !this.f41498d) {
            try {
                Log.v("ThreadControl", "Going to wait");
                this.f41496b.await();
                Log.v("ThreadControl", "Done waiting");
            } finally {
                this.f41495a.unlock();
            }
        }
    }
}
