package V2;

import O2.C0936z0;
import P2.v0;
import V2.InterfaceC1058o;
import V2.InterfaceC1065w;
import android.os.Looper;
import com.facebook.ads.AdError;

/* JADX INFO: loaded from: classes3.dex */
public interface y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f10035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f10036b;

    public class a implements y {
        @Override // V2.y
        public int a(C0936z0 c0936z0) {
            return c0936z0.f6470p != null ? 1 : 0;
        }

        @Override // V2.y
        public void b(Looper looper, v0 v0Var) {
        }

        @Override // V2.y
        public InterfaceC1058o c(InterfaceC1065w.a aVar, C0936z0 c0936z0) {
            if (c0936z0.f6470p == null) {
                return null;
            }
            return new E(new InterfaceC1058o.a(new W(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        @Override // V2.y
        public /* synthetic */ b d(InterfaceC1065w.a aVar, C0936z0 c0936z0) {
            return AbstractC1066x.a(this, aVar, c0936z0);
        }

        @Override // V2.y
        public /* synthetic */ void prepare() {
            AbstractC1066x.b(this);
        }

        @Override // V2.y
        public /* synthetic */ void release() {
            AbstractC1066x.c(this);
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f10037a = new b() { // from class: V2.z
            @Override // V2.y.b
            public final void release() {
                A.a();
            }
        };

        void release();
    }

    static {
        a aVar = new a();
        f10035a = aVar;
        f10036b = aVar;
    }

    int a(C0936z0 c0936z0);

    void b(Looper looper, v0 v0Var);

    InterfaceC1058o c(InterfaceC1065w.a aVar, C0936z0 c0936z0);

    b d(InterfaceC1065w.a aVar, C0936z0 c0936z0);

    void prepare();

    void release();
}
