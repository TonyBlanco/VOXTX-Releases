package o0;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: o0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2303c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f45721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f45722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45723d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45724e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45725f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45726g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f45727h = false;

    /* JADX INFO: renamed from: o0.c$a */
    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z9) {
            AbstractC2303c.this.o();
        }
    }

    /* JADX INFO: renamed from: o0.c$b */
    public interface b {
        void a(AbstractC2303c abstractC2303c, Object obj);
    }

    public AbstractC2303c(Context context) {
        this.f45722c = context.getApplicationContext();
    }

    public void a() {
        this.f45724e = true;
        m();
    }

    public boolean b() {
        return n();
    }

    public void c() {
        this.f45727h = false;
    }

    public String d(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        O.b.a(obj, sb);
        sb.append("}");
        return sb.toString();
    }

    public void e() {
    }

    public void f(Object obj) {
        b bVar = this.f45721b;
        if (bVar != null) {
            bVar.a(this, obj);
        }
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f45720a);
        printWriter.print(" mListener=");
        printWriter.println(this.f45721b);
        if (this.f45723d || this.f45726g || this.f45727h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f45723d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f45726g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f45727h);
        }
        if (this.f45724e || this.f45725f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f45724e);
            printWriter.print(" mReset=");
            printWriter.println(this.f45725f);
        }
    }

    public void h() {
        p();
    }

    public Context i() {
        return this.f45722c;
    }

    public boolean j() {
        return this.f45724e;
    }

    public boolean k() {
        return this.f45725f;
    }

    public boolean l() {
        return this.f45723d;
    }

    public void m() {
    }

    public abstract boolean n();

    public void o() {
        if (this.f45723d) {
            h();
        } else {
            this.f45726g = true;
        }
    }

    public void p() {
    }

    public void q() {
    }

    public abstract void r();

    public abstract void s();

    public void t(int i9, b bVar) {
        if (this.f45721b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f45721b = bVar;
        this.f45720a = i9;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        O.b.a(this, sb);
        sb.append(" id=");
        sb.append(this.f45720a);
        sb.append("}");
        return sb.toString();
    }

    public void u() {
        q();
        this.f45725f = true;
        this.f45723d = false;
        this.f45724e = false;
        this.f45726g = false;
        this.f45727h = false;
    }

    public void v() {
        if (this.f45727h) {
            o();
        }
    }

    public final void w() {
        this.f45723d = true;
        this.f45725f = false;
        this.f45724e = false;
        r();
    }

    public void x() {
        this.f45723d = false;
        s();
    }

    public boolean y() {
        boolean z9 = this.f45726g;
        this.f45726g = false;
        this.f45727h |= z9;
        return z9;
    }

    public void z(b bVar) {
        b bVar2 = this.f45721b;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f45721b = null;
    }
}
