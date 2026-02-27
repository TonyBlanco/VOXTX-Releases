package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.AbstractC1388t;
import com.google.android.gms.common.api.internal.InterfaceC1383q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes3.dex */
final class akk implements akj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final are f20026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.ads.interactivemedia.v3.impl.data.bg f20027b;

    public akk(Context context, com.google.ads.interactivemedia.v3.impl.data.bg bgVar) {
        this.f20026a = new arj(context);
        this.f20027b = bgVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akj
    public final com.google.ads.interactivemedia.v3.impl.data.br a(com.google.ads.interactivemedia.v3.impl.data.bq bqVar) {
        String strId;
        int iA;
        Task taskDoRead;
        try {
            final int i9 = bqVar.requestType() == com.google.ads.interactivemedia.v3.impl.data.bp.GET ? 0 : 1;
            are areVar = this.f20026a;
            final String strUrl = bqVar.url();
            final String strContent = bqVar.content();
            com.google.ads.interactivemedia.v3.impl.data.bg bgVar = this.f20027b;
            if (0 != 0) {
                taskDoRead = Tasks.forException(new arf(8));
            } else {
                final arj arjVar = (arj) areVar;
                taskDoRead = ((arj) areVar).doRead(AbstractC1388t.a().d(ate.f20678b).c(false).b(new InterfaceC1383q() { // from class: com.google.ads.interactivemedia.v3.internal.arg
                    @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
                    public final void accept(Object obj, Object obj2) throws RemoteException {
                        String str = strUrl;
                        int i10 = i9;
                        String str2 = strContent;
                        ((ara) ((ark) obj).getService()).e(new arb(str, i10, str2), new ari((TaskCompletionSource) obj2));
                    }
                }).a());
            }
            return com.google.ads.interactivemedia.v3.impl.data.br.forResponse(bqVar.id(), (String) Tasks.await(taskDoRead, bqVar.connectionTimeoutMs() + bqVar.readTimeoutMs(), TimeUnit.MILLISECONDS));
        } catch (InterruptedException | TimeoutException unused) {
            strId = bqVar.id();
            iA = 101;
            return com.google.ads.interactivemedia.v3.impl.data.br.forError(strId, iA);
        } catch (ExecutionException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof arf) {
                iA = ((arf) cause).a();
                strId = bqVar.id();
            } else {
                boolean z9 = cause instanceof com.google.android.gms.common.api.b;
                strId = bqVar.id();
                iA = z9 ? HttpStatus.SC_PROCESSING : 100;
            }
            return com.google.ads.interactivemedia.v3.impl.data.br.forError(strId, iA);
        }
    }
}
