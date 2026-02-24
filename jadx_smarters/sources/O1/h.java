package O1;

import W1.a;
import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public U1.c f5474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V1.b f5475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public W1.h f5476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExecutorService f5477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ExecutorService f5478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public S1.a f5479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a.InterfaceC0132a f5480h;

    public h(Context context) {
        this.f5473a = context.getApplicationContext();
    }

    public g a() {
        if (this.f5477e == null) {
            this.f5477e = new X1.a(Math.max(1, Runtime.getRuntime().availableProcessors()));
        }
        if (this.f5478f == null) {
            this.f5478f = new X1.a(1);
        }
        W1.i iVar = new W1.i(this.f5473a);
        if (this.f5475c == null) {
            this.f5475c = new V1.d(iVar.a());
        }
        if (this.f5476d == null) {
            this.f5476d = new W1.g(iVar.c());
        }
        if (this.f5480h == null) {
            this.f5480h = new W1.f(this.f5473a);
        }
        if (this.f5474b == null) {
            this.f5474b = new U1.c(this.f5476d, this.f5480h, this.f5478f, this.f5477e);
        }
        if (this.f5479g == null) {
            this.f5479g = S1.a.DEFAULT;
        }
        return new g(this.f5474b, this.f5476d, this.f5475c, this.f5473a, this.f5479g);
    }
}
