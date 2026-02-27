package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class wo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f24988a;

    public wo() {
        this.f24988a = new CopyOnWriteArrayList();
    }

    public wo(byte[] bArr) {
        this.f24988a = new cj(10);
    }

    public final void a(Handler handler, wp wpVar) {
        af.s(wpVar);
        c(wpVar);
        ((CopyOnWriteArrayList) this.f24988a).add(new wn(handler, wpVar));
    }

    public final void b(final int i9, final long j9, final long j10) {
        for (final wn wnVar : (CopyOnWriteArrayList) this.f24988a) {
            if (!wnVar.f24987c) {
                wnVar.f24985a.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.wm
                    @Override // java.lang.Runnable
                    public final void run() {
                        wn wnVar2 = wnVar;
                        wnVar2.f24986b.X(i9, j9, j10);
                    }
                });
            }
        }
    }

    public final void c(wp wpVar) {
        for (wn wnVar : (CopyOnWriteArrayList) this.f24988a) {
            if (wnVar.f24986b == wpVar) {
                wnVar.c();
                ((CopyOnWriteArrayList) this.f24988a).remove(wnVar);
            }
        }
    }

    public final ao d(zi ziVar, aax aaxVar) throws IOException {
        ao aoVarC = null;
        int i9 = 0;
        while (true) {
            try {
                ziVar.f(((cj) this.f24988a).H(), 0, 10);
                ((cj) this.f24988a).F(0);
                if (((cj) this.f24988a).k() != 4801587) {
                    break;
                }
                ((cj) this.f24988a).G(3);
                int iH = ((cj) this.f24988a).h();
                int i10 = iH + 10;
                if (aoVarC == null) {
                    byte[] bArr = new byte[i10];
                    System.arraycopy(((cj) this.f24988a).H(), 0, bArr, 0, 10);
                    ziVar.f(bArr, 10, iH);
                    aoVarC = new aaz(aaxVar).c(bArr, i10);
                } else {
                    ziVar.e(iH);
                }
                i9 += i10;
            } catch (EOFException unused) {
            }
        }
        ziVar.h();
        ziVar.e(i9);
        return aoVarC;
    }
}
