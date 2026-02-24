package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.G;
import com.squareup.picasso.t;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.ws.WebSocketProtocol;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes4.dex */
public class v extends ThreadPoolExecutor {

    public static final class a extends FutureTask implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RunnableC1609c f39165a;

        public a(RunnableC1609c runnableC1609c) {
            super(runnableC1609c, null);
            this.f39165a = runnableC1609c;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            t.f fVarP = this.f39165a.p();
            t.f fVarP2 = aVar.f39165a.p();
            return fVarP == fVarP2 ? this.f39165a.f39056a - aVar.f39165a.f39056a : fVarP2.ordinal() - fVarP.ordinal();
        }
    }

    public v() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new G.f());
    }

    public void a(NetworkInfo networkInfo) {
        int i9;
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            b(3);
            return;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type == 1 || type == 6 || type == 9) {
                i9 = 4;
                b(i9);
                return;
            }
            b(3);
            return;
        }
        int subtype = networkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
                b(1);
                break;
            default:
                switch (subtype) {
                    case 12:
                        break;
                    case 13:
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    default:
                        b(3);
                        break;
                }
                b(i9);
            case 3:
            case 4:
            case 5:
            case 6:
                i9 = 2;
                b(i9);
                break;
        }
    }

    public final void b(int i9) {
        setCorePoolSize(i9);
        setMaximumPoolSize(i9);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        a aVar = new a((RunnableC1609c) runnable);
        execute(aVar);
        return aVar;
    }
}
