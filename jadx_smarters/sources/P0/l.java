package P0;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements WebMessageBoundaryInterface {
    public static O0.d[] a(InvocationHandler[] invocationHandlerArr) {
        O0.d[] dVarArr = new O0.d[invocationHandlerArr.length];
        for (int i9 = 0; i9 < invocationHandlerArr.length; i9++) {
            dVarArr[i9] = new n(invocationHandlerArr[i9]);
        }
        return dVarArr;
    }

    public static O0.c b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        return new O0.c(webMessageBoundaryInterface.getData(), a(webMessageBoundaryInterface.getPorts()));
    }
}
