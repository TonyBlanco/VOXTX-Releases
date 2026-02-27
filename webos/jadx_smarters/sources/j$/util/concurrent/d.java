package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class d extends a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        l lVar = this.f42318b;
        if (lVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = lVar.f42310b;
        Object obj2 = lVar.f42311c;
        this.f42298j = lVar;
        a();
        return new k(obj, obj2, this.f42297i);
    }
}
