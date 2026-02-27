package j$.util;

import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
final class B extends b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ SortedSet f42206f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(SortedSet sortedSet, java.util.Collection collection) {
        super(collection, 21);
        this.f42206f = sortedSet;
    }

    @Override // j$.util.b0, j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f42206f.comparator();
    }
}
