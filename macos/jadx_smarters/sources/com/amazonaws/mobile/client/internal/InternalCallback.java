package com.amazonaws.mobile.client.internal;

import android.util.Log;
import com.amazonaws.mobile.client.Callback;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public class InternalCallback<R> implements Callback<R> {
    private static final String TAG = "InternalCallback";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Exception f18373e;
    private CountDownLatch lock;
    private Mode mode;
    private R result;
    private Runnable runnable;
    private Callback<R> userCallback;

    /* JADX INFO: renamed from: com.amazonaws.mobile.client.internal.InternalCallback$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$amazonaws$mobile$client$internal$InternalCallback$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$com$amazonaws$mobile$client$internal$InternalCallback$Mode = iArr;
            try {
                iArr[Mode.Callback.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazonaws$mobile$client$internal$InternalCallback$Mode[Mode.Async.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazonaws$mobile$client$internal$InternalCallback$Mode[Mode.Sync.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazonaws$mobile$client$internal$InternalCallback$Mode[Mode.Done.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum Mode {
        Callback,
        Async,
        Sync,
        Done
    }

    public InternalCallback() {
        this(null);
    }

    public InternalCallback(Callback<R> callback) {
        this.userCallback = callback;
        this.mode = Mode.Callback;
        this.lock = new CountDownLatch(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void call(R r9, Exception exc) {
        int i9 = AnonymousClass2.$SwitchMap$com$amazonaws$mobile$client$internal$InternalCallback$Mode[this.mode.ordinal()];
        if (i9 == 1 || i9 == 2) {
            if (exc == null) {
                this.userCallback.onResult(r9);
            } else {
                this.userCallback.onError(exc);
            }
        } else if (i9 == 3) {
            this.result = r9;
            this.f18373e = exc;
            this.lock.countDown();
        } else if (i9 == 4) {
            Log.w(TAG, "Library attempted to call user callback twice, expected only once");
        }
        this.mode = Mode.Done;
        this.userCallback = null;
    }

    public void async(final Runnable runnable) {
        if (this.mode == Mode.Done) {
            Log.e(TAG, "Duplicate call to execute code.", new RuntimeException("Internal error, duplicate call"));
        }
        this.mode = Mode.Async;
        this.lock = null;
        new Thread(new Runnable() { // from class: com.amazonaws.mobile.client.internal.InternalCallback.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Exception e9) {
                    InternalCallback.this.call(null, e9);
                }
            }
        }).start();
    }

    public R await(Runnable runnable) throws Exception {
        if (this.mode == Mode.Done) {
            Log.e(TAG, "Duplicate call to execute code.", new RuntimeException("Internal error, duplicate call"));
        }
        this.mode = Mode.Sync;
        try {
            runnable.run();
            this.lock.await();
        } catch (Exception e9) {
            this.f18373e = e9;
        }
        Exception exc = this.f18373e;
        R r9 = this.result;
        this.f18373e = null;
        this.result = null;
        if (exc == null) {
            return r9;
        }
        throw exc;
    }

    @Override // com.amazonaws.mobile.client.Callback
    public void onError(Exception exc) {
        call(null, exc);
    }

    @Override // com.amazonaws.mobile.client.Callback
    public void onResult(R r9) {
        call(r9, null);
    }
}
