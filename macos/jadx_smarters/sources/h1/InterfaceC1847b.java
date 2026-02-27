package h1;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: h1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1847b {

    /* JADX INFO: renamed from: h1.b$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f41506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f41507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f41508c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f41509d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f41510e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f41511f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Map f41512g = Collections.emptyMap();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List f41513h;

        public boolean a() {
            return b(System.currentTimeMillis());
        }

        public boolean b(long j9) {
            return this.f41510e < j9;
        }

        public boolean c(long j9) {
            return this.f41511f < j9;
        }
    }

    void a(String str, boolean z9);

    void b(String str, a aVar);

    a get(String str);

    void initialize();
}
