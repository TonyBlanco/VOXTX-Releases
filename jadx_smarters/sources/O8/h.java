package o8;

import java.io.Serializable;
import kotlin.jvm.internal.l;
import o8.g;
import w8.p;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements g, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f46144a = new h();

    @Override // o8.g
    public g V(g context) {
        l.e(context, "context");
        return context;
    }

    @Override // o8.g
    public g.b a(g.c key) {
        l.e(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // o8.g
    public Object l(Object obj, p operation) {
        l.e(operation, "operation");
        return obj;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // o8.g
    public g w(g.c key) {
        l.e(key, "key");
        return this;
    }
}
