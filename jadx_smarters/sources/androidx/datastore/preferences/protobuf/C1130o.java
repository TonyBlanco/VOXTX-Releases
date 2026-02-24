package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1137w;
import d.AbstractC1617D;
import java.util.Collections;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1130o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f14710b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C1130o f14712d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f14714a = Collections.emptyMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f14711c = c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1130o f14713e = new C1130o(true);

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f14715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f14716b;

        public a(Object obj, int i9) {
            this.f14715a = obj;
            this.f14716b = i9;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14715a == aVar.f14715a && this.f14716b == aVar.f14716b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f14715a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f14716b;
        }
    }

    public C1130o(boolean z9) {
    }

    public static C1130o b() {
        C1130o c1130oA = f14712d;
        if (c1130oA == null) {
            synchronized (C1130o.class) {
                try {
                    c1130oA = f14712d;
                    if (c1130oA == null) {
                        c1130oA = f14710b ? AbstractC1129n.a() : f14713e;
                        f14712d = c1130oA;
                    }
                } finally {
                }
            }
        }
        return c1130oA;
    }

    public static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public AbstractC1137w.c a(O o9, int i9) {
        AbstractC1617D.a(this.f14714a.get(new a(o9, i9)));
        return null;
    }
}
