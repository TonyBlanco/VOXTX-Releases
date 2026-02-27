package p4;

import android.util.LruCache;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends LruCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2429d f46442a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(C2429d c2429d, int i9) {
        super(i9);
        this.f46442a = c2429d;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z9, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        if (z9) {
            com.google.android.gms.common.internal.r.m(this.f46442a.f46449g);
            this.f46442a.f46449g.add(num);
        }
    }
}
