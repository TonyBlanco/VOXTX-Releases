package o0;

import L.e;
import L.s;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import o0.AbstractC2303c;

/* JADX INFO: renamed from: o0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2302b extends AbstractC2301a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC2303c.a f45712o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Uri f45713p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String[] f45714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f45715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String[] f45716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f45717t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Cursor f45718u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e f45719v;

    public AbstractC2302b(Context context) {
        super(context);
        this.f45712o = new AbstractC2303c.a();
    }

    @Override // o0.AbstractC2301a
    public void A() {
        super.A();
        synchronized (this) {
            try {
                e eVar = this.f45719v;
                if (eVar != null) {
                    eVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o0.AbstractC2303c
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void f(Cursor cursor) {
        if (k()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f45718u;
        this.f45718u = cursor;
        if (l()) {
            super.f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // o0.AbstractC2301a
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public Cursor F() {
        synchronized (this) {
            if (E()) {
                throw new s();
            }
            this.f45719v = new e();
        }
        try {
            Cursor cursorA = E.a.a(i().getContentResolver(), this.f45713p, this.f45714q, this.f45715r, this.f45716s, this.f45717t, this.f45719v);
            if (cursorA != null) {
                try {
                    cursorA.getCount();
                    cursorA.registerContentObserver(this.f45712o);
                } catch (RuntimeException e9) {
                    cursorA.close();
                    throw e9;
                }
            }
            synchronized (this) {
                this.f45719v = null;
            }
            return cursorA;
        } catch (Throwable th) {
            synchronized (this) {
                this.f45719v = null;
                throw th;
            }
        }
    }

    @Override // o0.AbstractC2301a
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void G(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public void L(String[] strArr) {
        this.f45714q = strArr;
    }

    public void M(String str) {
        this.f45715r = str;
    }

    public void N(String[] strArr) {
        this.f45716s = strArr;
    }

    public void O(String str) {
        this.f45717t = str;
    }

    public void P(Uri uri) {
        this.f45713p = uri;
    }

    @Override // o0.AbstractC2301a, o0.AbstractC2303c
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f45713p);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f45714q));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f45715r);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f45716s));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f45717t);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f45718u);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f45726g);
    }

    @Override // o0.AbstractC2303c
    public void q() {
        super.q();
        s();
        Cursor cursor = this.f45718u;
        if (cursor != null && !cursor.isClosed()) {
            this.f45718u.close();
        }
        this.f45718u = null;
    }

    @Override // o0.AbstractC2303c
    public void r() {
        Cursor cursor = this.f45718u;
        if (cursor != null) {
            f(cursor);
        }
        if (y() || this.f45718u == null) {
            h();
        }
    }

    @Override // o0.AbstractC2303c
    public void s() {
        b();
    }
}
