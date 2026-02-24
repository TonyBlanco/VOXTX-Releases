package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class h extends a implements Iterator, Enumeration {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f42303k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l[] lVarArr, int i9, int i10, ConcurrentHashMap concurrentHashMap, int i11) {
        super(lVarArr, i9, i10, concurrentHashMap);
        this.f42303k = i11;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f42303k) {
            case 0:
                l lVar = this.f42318b;
                if (lVar == null) {
                    throw new NoSuchElementException();
                }
                this.f42298j = lVar;
                a();
                return lVar.f42310b;
            default:
                l lVar2 = this.f42318b;
                if (lVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj = lVar2.f42311c;
                this.f42298j = lVar2;
                a();
                return obj;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f42303k) {
        }
        return next();
    }
}
