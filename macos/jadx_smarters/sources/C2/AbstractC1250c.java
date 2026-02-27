package c2;

import U1.l;

/* JADX INFO: renamed from: c2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1250c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18190a;

    public AbstractC1250c(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Data must not be null");
        }
        this.f18190a = obj;
    }

    @Override // U1.l
    public void b() {
    }

    @Override // U1.l
    public final Object get() {
        return this.f18190a;
    }

    @Override // U1.l
    public final int getSize() {
        return 1;
    }
}
