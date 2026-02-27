package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class B implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f14568a;

    public B(Iterator it) {
        this.f14568a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f14568a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f14568a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f14568a.remove();
    }
}
