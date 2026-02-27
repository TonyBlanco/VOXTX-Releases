package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h4.C1858a;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class asg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f20619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aru f20620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final arw f20621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final asf f20622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final asf f20623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Task f20624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Task f20625h;

    @VisibleForTesting
    public asg(Context context, Executor executor, aru aruVar, arw arwVar, asd asdVar, ase aseVar) {
        this.f20618a = context;
        this.f20619b = executor;
        this.f20620c = aruVar;
        this.f20621d = arwVar;
        this.f20622e = asdVar;
        this.f20623f = aseVar;
    }

    public static asg e(Context context, Executor executor, aru aruVar, arw arwVar) {
        Task taskForResult;
        final asg asgVar = new asg(context, executor, aruVar, arwVar, new asd(), new ase());
        if (asgVar.f20621d.d()) {
            final int i9 = 1;
            taskForResult = asgVar.h(new Callable(asgVar) { // from class: com.google.ads.interactivemedia.v3.internal.asb

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ asg f20613a;

                {
                    this.f20613a = asgVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return i9 != 0 ? this.f20613a.c() : this.f20613a.d();
                }
            });
        } else {
            taskForResult = Tasks.forResult(asgVar.f20622e.a());
        }
        asgVar.f20624g = taskForResult;
        final int i10 = 0;
        asgVar.f20625h = asgVar.h(new Callable(asgVar) { // from class: com.google.ads.interactivemedia.v3.internal.asb

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ asg f20613a;

            {
                this.f20613a = asgVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return i10 != 0 ? this.f20613a.c() : this.f20613a.d();
            }
        });
        return asgVar;
    }

    private static agc g(Task task, agc agcVar) {
        return !task.isSuccessful() ? agcVar : (agc) task.getResult();
    }

    private final Task h(Callable callable) {
        return Tasks.call(this.f20619b, callable).addOnFailureListener(this.f20619b, new OnFailureListener() { // from class: com.google.ads.interactivemedia.v3.internal.asc
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f20615a.f(exc);
            }
        });
    }

    public final agc a() {
        return g(this.f20624g, this.f20622e.a());
    }

    public final agc b() {
        return g(this.f20625h, this.f20623f.a());
    }

    public final /* synthetic */ agc c() throws Exception {
        Context context = this.f20618a;
        agl aglVarAs = agc.as();
        C1858a.C0341a c0341aA = C1858a.a(context);
        String strA = c0341aA.a();
        if (strA != null && strA.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uuidFromString = UUID.fromString(strA);
            byte[] bArr = new byte[16];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
            strA = Base64.encodeToString(bArr, 11);
        }
        if (strA != null) {
            aglVarAs.ab(strA);
            aglVarAs.aa(c0341aA.b());
            aglVarAs.aL(aft.f19505f);
        }
        return (agc) aglVarAs.aY();
    }

    public final /* synthetic */ agc d() throws Exception {
        Context context = this.f20618a;
        return asa.b(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f20620c.c(2025, -1L, exc);
    }
}
