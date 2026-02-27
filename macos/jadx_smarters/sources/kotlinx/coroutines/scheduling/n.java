package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class n {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i9, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i9, obj, obj2)) {
            if (atomicReferenceArray.get(i9) != obj) {
                return false;
            }
        }
        return true;
    }
}
