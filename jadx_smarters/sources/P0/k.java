package P0;

import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes.dex */
public class k extends O0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JsReplyProxyBoundaryInterface f6854a;

    public class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JsReplyProxyBoundaryInterface f6855a;

        public a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.f6855a = jsReplyProxyBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new k(this.f6855a);
        }
    }

    public k(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f6854a = jsReplyProxyBoundaryInterface;
    }

    public static k a(InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (k) jsReplyProxyBoundaryInterface.getOrCreatePeer(new a(jsReplyProxyBoundaryInterface));
    }
}
