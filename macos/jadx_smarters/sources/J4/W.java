package J4;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class W implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C0644c c0644c = (C0644c) obj;
        C0644c c0644c2 = (C0644c) obj2;
        com.google.android.gms.common.internal.r.m(c0644c);
        com.google.android.gms.common.internal.r.m(c0644c2);
        int iH = c0644c.H();
        int iH2 = c0644c2.H();
        if (iH != iH2) {
            return iH >= iH2 ? 1 : -1;
        }
        int I9 = c0644c.I();
        int I10 = c0644c2.I();
        if (I9 == I10) {
            return 0;
        }
        return I9 < I10 ? -1 : 1;
    }
}
