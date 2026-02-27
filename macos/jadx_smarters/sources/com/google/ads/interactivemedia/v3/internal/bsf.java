package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class bsf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f22210a = new ArrayDeque();

    private bsf() {
    }

    public /* synthetic */ bsf(byte[] bArr) {
    }

    public static /* bridge */ /* synthetic */ bpb a(bsf bsfVar, bpb bpbVar, bpb bpbVar2) {
        bsfVar.b(bpbVar);
        bsfVar.b(bpbVar2);
        bpb bshVar = (bpb) bsfVar.f22210a.pop();
        while (!bsfVar.f22210a.isEmpty()) {
            bshVar = new bsh((bpb) bsfVar.f22210a.pop(), bshVar, null);
        }
        return bshVar;
    }

    private final void b(bpb bpbVar) {
        byte[] bArr;
        if (!bpbVar.h()) {
            if (!(bpbVar instanceof bsh)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(bpbVar.getClass())));
            }
            bsh bshVar = (bsh) bpbVar;
            b(bshVar.f22215d);
            b(bshVar.f22216e);
            return;
        }
        int iC = c(bpbVar.d());
        int iC2 = bsh.c(iC + 1);
        if (this.f22210a.isEmpty() || ((bpb) this.f22210a.peek()).d() >= iC2) {
            this.f22210a.push(bpbVar);
            return;
        }
        int iC3 = bsh.c(iC);
        bpb bshVar2 = (bpb) this.f22210a.pop();
        while (true) {
            bArr = null;
            if (this.f22210a.isEmpty() || ((bpb) this.f22210a.peek()).d() >= iC3) {
                break;
            } else {
                bshVar2 = new bsh((bpb) this.f22210a.pop(), bshVar2, bArr);
            }
        }
        bsh bshVar3 = new bsh(bshVar2, bpbVar, bArr);
        while (!this.f22210a.isEmpty()) {
            if (((bpb) this.f22210a.peek()).d() >= bsh.c(c(bshVar3.d()) + 1)) {
                break;
            } else {
                bshVar3 = new bsh((bpb) this.f22210a.pop(), bshVar3, bArr);
            }
        }
        this.f22210a.push(bshVar3);
    }

    private static final int c(int i9) {
        int iBinarySearch = Arrays.binarySearch(bsh.f22213a, i9);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}
