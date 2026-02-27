package v1;

import java.util.Map;

/* JADX INFO: renamed from: v1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2868f {

    /* JADX INFO: renamed from: v1.f$a */
    public interface a {
        m marshaller();
    }

    /* JADX INFO: renamed from: v1.f$b */
    public static class b {
        public abstract InterfaceC2865c marshaller();

        public abstract Map valueMap();
    }

    InterfaceC2869g name();

    String operationId();

    String queryDocument();

    l responseFieldMapper();

    b variables();

    Object wrapData(a aVar);
}
