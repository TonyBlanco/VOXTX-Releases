package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class k0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14702a;

    public k0(O o9) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f14702a = null;
    }

    public C1140z a() {
        return new C1140z(getMessage());
    }
}
