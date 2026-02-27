package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class w {

    @NotNull
    private volatile AtomicReferenceArray<Object> array;

    public w(int i9) {
        this.array = new AtomicReferenceArray<>(i9);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i9) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i9 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i9);
        }
        return null;
    }

    public final void c(int i9, Object obj) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i9 < length) {
            atomicReferenceArray.set(i9, obj);
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(B8.h.c(i9 + 1, length * 2));
        for (int i10 = 0; i10 < length; i10++) {
            atomicReferenceArray2.set(i10, atomicReferenceArray.get(i10));
        }
        atomicReferenceArray2.set(i9, obj);
        this.array = atomicReferenceArray2;
    }
}
