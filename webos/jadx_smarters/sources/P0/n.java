package P0;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes.dex */
public class n extends O0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebMessagePortBoundaryInterface f6857a;

    public n(InvocationHandler invocationHandler) {
        this.f6857a = (WebMessagePortBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessagePortBoundaryInterface.class, invocationHandler);
    }
}
