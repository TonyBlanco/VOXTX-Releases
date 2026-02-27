package D8;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f1515a;

    public a(d sequence) {
        kotlin.jvm.internal.l.e(sequence, "sequence");
        this.f1515a = new AtomicReference(sequence);
    }

    @Override // D8.d
    public Iterator iterator() {
        d dVar = (d) this.f1515a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
