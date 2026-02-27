package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import q5.AbstractC2552B;
import q5.AbstractC2561h;
import q5.C2567n;
import q5.C2578y;

/* JADX INFO: loaded from: classes3.dex */
final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C2578y f27860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2567n f27861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27862c;

    public t(Context context, C2567n c2567n) {
        this.f27862c = context.getPackageName();
        this.f27861b = c2567n;
        if (AbstractC2552B.a(context)) {
            this.f27860a = new C2578y(context, c2567n, "IntegrityService", u.f27863a, q.f27851a, null, null);
        } else {
            c2567n.b("Phonesky is not installed.", new Object[0]);
            this.f27860a = null;
        }
    }

    public static /* bridge */ /* synthetic */ Bundle a(t tVar, byte[] bArr, Long l9) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", tVar.f27862c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 1);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l9 != null) {
            bundle.putLong("cloud.prj", l9.longValue());
        }
        ArrayList<AbstractC2561h> arrayList = new ArrayList();
        arrayList.add(AbstractC2561h.c(3, System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC2561h abstractC2561h : arrayList) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", abstractC2561h.b());
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }

    public final Task b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f27860a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            this.f27861b.d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f27860a.p(new r(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e9) {
            return Tasks.forException(new IntegrityServiceException(-13, e9));
        }
    }
}
