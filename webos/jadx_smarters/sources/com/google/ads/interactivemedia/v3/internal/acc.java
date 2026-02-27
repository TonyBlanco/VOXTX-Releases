package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class acc extends ace {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f18897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f18898c;

    public acc(int i9, long j9) {
        super(i9);
        this.f18896a = j9;
        this.f18897b = new ArrayList();
        this.f18898c = new ArrayList();
    }

    public final acc a(int i9) {
        int size = this.f18898c.size();
        for (int i10 = 0; i10 < size; i10++) {
            acc accVar = (acc) this.f18898c.get(i10);
            if (accVar.f18900d == i9) {
                return accVar;
            }
        }
        return null;
    }

    public final acd b(int i9) {
        int size = this.f18897b.size();
        for (int i10 = 0; i10 < size; i10++) {
            acd acdVar = (acd) this.f18897b.get(i10);
            if (acdVar.f18900d == i9) {
                return acdVar;
            }
        }
        return null;
    }

    public final void c(acc accVar) {
        this.f18898c.add(accVar);
    }

    public final void d(acd acdVar) {
        this.f18897b.add(acdVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ace
    public final String toString() {
        return ace.g(this.f18900d) + " leaves: " + Arrays.toString(this.f18897b.toArray()) + " containers: " + Arrays.toString(this.f18898c.toArray());
    }
}
