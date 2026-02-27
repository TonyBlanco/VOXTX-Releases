package z1;

import java.util.Map;
import v1.InterfaceC2867e;
import v1.InterfaceC2868f;
import v1.t;

/* JADX INFO: renamed from: z1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3004c {
    public static final AbstractC3004c DEFAULT = new a();
    public static final C3003b QUERY_ROOT_KEY = C3003b.a("QUERY_ROOT");
    public static final C3003b MUTATION_ROOT_KEY = C3003b.a("MUTATION_ROOT");
    public static final C3003b SUBSCRIPTION_ROOT_KEY = C3003b.a("SUBSCRIPTION_ROOT");

    /* JADX INFO: renamed from: z1.c$a */
    public static class a extends AbstractC3004c {
        @Override // z1.AbstractC3004c
        public C3003b fromFieldArguments(v1.k kVar, InterfaceC2868f.b bVar) {
            return C3003b.f52622b;
        }

        @Override // z1.AbstractC3004c
        public C3003b fromFieldRecordSet(v1.k kVar, Map map) {
            return C3003b.f52622b;
        }
    }

    public static C3003b rootKeyForOperation(InterfaceC2868f interfaceC2868f) {
        if (interfaceC2868f instanceof v1.h) {
            return QUERY_ROOT_KEY;
        }
        if (interfaceC2868f instanceof InterfaceC2867e) {
            return MUTATION_ROOT_KEY;
        }
        if (interfaceC2868f instanceof t) {
            return SUBSCRIPTION_ROOT_KEY;
        }
        throw new IllegalArgumentException("Unknown operation type.");
    }

    public abstract C3003b fromFieldArguments(v1.k kVar, InterfaceC2868f.b bVar);

    public abstract C3003b fromFieldRecordSet(v1.k kVar, Map map);
}
