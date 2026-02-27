package com.squareup.okhttp;

import com.google.android.gms.common.api.a;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.HttpEngine;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class Dispatcher {
    private ExecutorService executorService;
    private int maxRequests = 64;
    private int maxRequestsPerHost = 5;
    private final Deque<Call.AsyncCall> readyCalls = new ArrayDeque();
    private final Deque<Call.AsyncCall> runningCalls = new ArrayDeque();
    private final Deque<Call> executedCalls = new ArrayDeque();

    public Dispatcher() {
    }

    public Dispatcher(ExecutorService executorService) {
        this.executorService = executorService;
    }

    private void promoteCalls() {
        if (this.runningCalls.size() < this.maxRequests && !this.readyCalls.isEmpty()) {
            Iterator<Call.AsyncCall> it = this.readyCalls.iterator();
            while (it.hasNext()) {
                Call.AsyncCall next = it.next();
                if (runningCallsForHost(next) < this.maxRequestsPerHost) {
                    it.remove();
                    this.runningCalls.add(next);
                    getExecutorService().execute(next);
                }
                if (this.runningCalls.size() >= this.maxRequests) {
                    return;
                }
            }
        }
    }

    private int runningCallsForHost(Call.AsyncCall asyncCall) {
        Iterator<Call.AsyncCall> it = this.runningCalls.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            if (it.next().host().equals(asyncCall.host())) {
                i9++;
            }
        }
        return i9;
    }

    public synchronized void cancel(Object obj) {
        try {
            for (Call.AsyncCall asyncCall : this.readyCalls) {
                if (Util.equal(obj, asyncCall.tag())) {
                    asyncCall.cancel();
                }
            }
            for (Call.AsyncCall asyncCall2 : this.runningCalls) {
                if (Util.equal(obj, asyncCall2.tag())) {
                    asyncCall2.get().canceled = true;
                    HttpEngine httpEngine = asyncCall2.get().engine;
                    if (httpEngine != null) {
                        httpEngine.cancel();
                    }
                }
            }
            for (Call call : this.executedCalls) {
                if (Util.equal(obj, call.tag())) {
                    call.cancel();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void enqueue(Call.AsyncCall asyncCall) {
        try {
            if (this.runningCalls.size() >= this.maxRequests || runningCallsForHost(asyncCall) >= this.maxRequestsPerHost) {
                this.readyCalls.add(asyncCall);
            } else {
                this.runningCalls.add(asyncCall);
                getExecutorService().execute(asyncCall);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void executed(Call call) {
        this.executedCalls.add(call);
    }

    public synchronized void finished(Call.AsyncCall asyncCall) {
        if (!this.runningCalls.remove(asyncCall)) {
            throw new AssertionError("AsyncCall wasn't running!");
        }
        promoteCalls();
    }

    public synchronized void finished(Call call) {
        if (!this.executedCalls.remove(call)) {
            throw new AssertionError("Call wasn't in-flight!");
        }
    }

    public synchronized ExecutorService getExecutorService() {
        try {
            if (this.executorService == null) {
                this.executorService = new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.executorService;
    }

    public synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public synchronized int getQueuedCallCount() {
        return this.readyCalls.size();
    }

    public synchronized int getRunningCallCount() {
        return this.runningCalls.size();
    }

    public synchronized void setMaxRequests(int i9) {
        if (i9 < 1) {
            throw new IllegalArgumentException("max < 1: " + i9);
        }
        this.maxRequests = i9;
        promoteCalls();
    }

    public synchronized void setMaxRequestsPerHost(int i9) {
        if (i9 < 1) {
            throw new IllegalArgumentException("max < 1: " + i9);
        }
        this.maxRequestsPerHost = i9;
        promoteCalls();
    }
}
