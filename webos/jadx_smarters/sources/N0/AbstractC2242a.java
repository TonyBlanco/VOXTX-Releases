package n0;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC1186p;
import androidx.lifecycle.N;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o0.AbstractC2303c;

/* JADX INFO: renamed from: n0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2242a {

    /* JADX INFO: renamed from: n0.a$a, reason: collision with other inner class name */
    public interface InterfaceC0391a {
        AbstractC2303c a(int i9, Bundle bundle);

        void b(AbstractC2303c abstractC2303c);

        void c(AbstractC2303c abstractC2303c, Object obj);
    }

    public static AbstractC2242a b(InterfaceC1186p interfaceC1186p) {
        return new b(interfaceC1186p, ((N) interfaceC1186p).getViewModelStore());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract AbstractC2303c c(int i9, Bundle bundle, InterfaceC0391a interfaceC0391a);

    public abstract void d();
}
