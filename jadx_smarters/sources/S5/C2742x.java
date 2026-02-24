package s5;

import java.io.Serializable;

/* JADX INFO: renamed from: s5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2742x extends AbstractC2724e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f50158a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f50159c;

    public C2742x(Object obj, Object obj2) {
        this.f50158a = obj;
        this.f50159c = obj2;
    }

    @Override // s5.AbstractC2724e, java.util.Map.Entry
    public final Object getKey() {
        return this.f50158a;
    }

    @Override // s5.AbstractC2724e, java.util.Map.Entry
    public final Object getValue() {
        return this.f50159c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
