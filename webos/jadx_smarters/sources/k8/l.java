package k8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements f, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w8.a f43669a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f43670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f43671d;

    public l(w8.a initializer, Object obj) {
        kotlin.jvm.internal.l.e(initializer, "initializer");
        this.f43669a = initializer;
        this.f43670c = o.f43673a;
        this.f43671d = obj == null ? this : obj;
    }

    public /* synthetic */ l(w8.a aVar, Object obj, int i9, kotlin.jvm.internal.g gVar) {
        this(aVar, (i9 & 2) != 0 ? null : obj);
    }

    public boolean a() {
        return this.f43670c != o.f43673a;
    }

    @Override // k8.f
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f43670c;
        o oVar = o.f43673a;
        if (obj != oVar) {
            return obj;
        }
        synchronized (this.f43671d) {
            objInvoke = this.f43670c;
            if (objInvoke == oVar) {
                w8.a aVar = this.f43669a;
                kotlin.jvm.internal.l.b(aVar);
                objInvoke = aVar.invoke();
                this.f43670c = objInvoke;
                this.f43669a = null;
            }
        }
        return objInvoke;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
