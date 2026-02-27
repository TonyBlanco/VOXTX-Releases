package S7;

import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P7.b f9444b;

    public a(String influenceId, P7.b channel) {
        l.e(influenceId, "influenceId");
        l.e(channel, "channel");
        this.f9443a = influenceId;
        this.f9444b = channel;
    }

    public P7.b a() {
        return this.f9444b;
    }

    public String b() {
        return this.f9443a;
    }
}
