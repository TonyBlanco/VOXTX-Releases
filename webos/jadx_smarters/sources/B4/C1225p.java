package b4;

import java.io.IOException;

/* JADX INFO: renamed from: b4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1225p extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17591a;

    public C1225p(int i9) {
        this.f17591a = i9;
    }

    public C1225p(String str, int i9) {
        super(str);
        this.f17591a = i9;
    }

    public C1225p(String str, Throwable th, int i9) {
        super(str, th);
        this.f17591a = i9;
    }

    public C1225p(Throwable th, int i9) {
        super(th);
        this.f17591a = i9;
    }

    public static boolean a(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C1225p) && ((C1225p) cause).f17591a == 2008) {
                return true;
            }
        }
        return false;
    }
}
