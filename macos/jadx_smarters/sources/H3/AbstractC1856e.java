package h3;

import O2.C0897l1;
import d3.w;
import d4.M;

/* JADX INFO: renamed from: h3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1856e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f41641a;

    /* JADX INFO: renamed from: h3.e$a */
    public static final class a extends C0897l1 {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    public AbstractC1856e(w wVar) {
        this.f41641a = wVar;
    }

    public final boolean a(M m9, long j9) {
        return b(m9) && c(m9, j9);
    }

    public abstract boolean b(M m9);

    public abstract boolean c(M m9, long j9);
}
