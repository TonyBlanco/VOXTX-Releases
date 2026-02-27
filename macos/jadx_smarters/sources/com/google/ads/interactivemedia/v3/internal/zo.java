package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25265b;

    public zo(bf bfVar, int... iArr) {
        this(bfVar, iArr, null);
    }

    public zo(bf bfVar, int[] iArr, byte[] bArr) {
        if (iArr.length == 0) {
            cd.c("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f25265b = bfVar;
        this.f25264a = iArr;
    }

    public zo(zd zdVar) {
        this.f25265b = zdVar;
        this.f25264a = new AtomicBoolean(false);
    }

    public zo(byte[] bArr, String str) {
        this.f25265b = bArr;
        this.f25264a = str;
    }

    public zo(int[] iArr, ue[] ueVarArr) {
        this.f25264a = iArr;
        this.f25265b = ueVarArr;
    }

    public final void a(long j9) {
        for (ue ueVar : (ue[]) this.f25265b) {
            ueVar.D(j9);
        }
    }

    public final int[] b() {
        int[] iArr = new int[((ue[]) this.f25265b).length];
        int i9 = 0;
        while (true) {
            ue[] ueVarArr = (ue[]) this.f25265b;
            if (i9 >= ueVarArr.length) {
                return iArr;
            }
            iArr[i9] = ueVarArr[i9].m();
            i9++;
        }
    }

    public final aae c(int i9) {
        int i10 = 0;
        while (true) {
            int[] iArr = (int[]) this.f25264a;
            if (i10 >= iArr.length) {
                cd.b("BaseMediaChunkOutput", "Unmatched track of type: " + i9);
                return new zg();
            }
            if (i9 == iArr[i10]) {
                return ((ue[]) this.f25265b)[i10];
            }
            i10++;
        }
    }

    public final String d() {
        return (String) this.f25264a;
    }

    public final byte[] e() {
        return (byte[]) this.f25265b;
    }
}
