package J1;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Closeable {

    public enum a {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract boolean g();

    public abstract boolean h();

    public abstract String i();

    public abstract String j();

    public abstract a k();

    public abstract void l();
}
