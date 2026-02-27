package U1;

import W1.a;
import android.util.Log;
import i2.InterfaceC1881c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import l2.InterfaceC2175b;
import q2.AbstractC2535d;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f9592m = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f9593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T1.c f9596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2175b f9597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final S1.g f9598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1881c f9599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC0122a f9600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final U1.b f9601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final O1.i f9602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f9603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f9604l;

    /* JADX INFO: renamed from: U1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0122a {
        W1.a a();
    }

    public static class b {
        public OutputStream a(File file) {
            return new BufferedOutputStream(new FileOutputStream(file));
        }
    }

    public class c implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S1.b f9605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f9606b;

        public c(S1.b bVar, Object obj) {
            this.f9605a = bVar;
            this.f9606b = obj;
        }

        @Override // W1.a.b
        public boolean a(File file) {
            OutputStream outputStreamA = null;
            try {
                try {
                    outputStreamA = a.this.f9603k.a(file);
                    boolean zA = this.f9605a.a(this.f9606b, outputStreamA);
                    if (outputStreamA == null) {
                        return zA;
                    }
                    try {
                        outputStreamA.close();
                        return zA;
                    } catch (IOException unused) {
                        return zA;
                    }
                } catch (FileNotFoundException e9) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "Failed to find file to write to disk cache", e9);
                    }
                    if (outputStreamA != null) {
                        try {
                            outputStreamA.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (outputStreamA != null) {
                    try {
                        outputStreamA.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        }
    }

    public a(f fVar, int i9, int i10, T1.c cVar, InterfaceC2175b interfaceC2175b, S1.g gVar, InterfaceC1881c interfaceC1881c, InterfaceC0122a interfaceC0122a, U1.b bVar, O1.i iVar) {
        this(fVar, i9, i10, cVar, interfaceC2175b, gVar, interfaceC1881c, interfaceC0122a, bVar, iVar, f9592m);
    }

    public a(f fVar, int i9, int i10, T1.c cVar, InterfaceC2175b interfaceC2175b, S1.g gVar, InterfaceC1881c interfaceC1881c, InterfaceC0122a interfaceC0122a, U1.b bVar, O1.i iVar, b bVar2) {
        this.f9593a = fVar;
        this.f9594b = i9;
        this.f9595c = i10;
        this.f9596d = cVar;
        this.f9597e = interfaceC2175b;
        this.f9598f = gVar;
        this.f9599g = interfaceC1881c;
        this.f9600h = interfaceC0122a;
        this.f9601i = bVar;
        this.f9602j = iVar;
        this.f9603k = bVar2;
    }

    public final l b(Object obj) {
        long jB = AbstractC2535d.b();
        this.f9600h.a().b(this.f9593a.b(), new c(this.f9597e.b(), obj));
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Wrote source to cache", jB);
        }
        long jB2 = AbstractC2535d.b();
        l lVarI = i(this.f9593a.b());
        if (Log.isLoggable("DecodeJob", 2) && lVarI != null) {
            j("Decoded source from cache", jB2);
        }
        return lVarI;
    }

    public void c() {
        this.f9604l = true;
        this.f9596d.cancel();
    }

    public l d() {
        return m(g());
    }

    public final l e(Object obj) {
        if (this.f9601i.cacheSource()) {
            return b(obj);
        }
        long jB = AbstractC2535d.b();
        l lVarA = this.f9597e.f().a(obj, this.f9594b, this.f9595c);
        if (!Log.isLoggable("DecodeJob", 2)) {
            return lVarA;
        }
        j("Decoded from source", jB);
        return lVarA;
    }

    public l f() {
        if (!this.f9601i.cacheResult()) {
            return null;
        }
        long jB = AbstractC2535d.b();
        l lVarI = i(this.f9593a);
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Decoded transformed from cache", jB);
        }
        long jB2 = AbstractC2535d.b();
        l lVarK = k(lVarI);
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Transcoded transformed from cache", jB2);
        }
        return lVarK;
    }

    public final l g() {
        try {
            long jB = AbstractC2535d.b();
            Object objB = this.f9596d.b(this.f9602j);
            if (Log.isLoggable("DecodeJob", 2)) {
                j("Fetched data", jB);
            }
            if (this.f9604l) {
                this.f9596d.a();
                return null;
            }
            l lVarE = e(objB);
            this.f9596d.a();
            return lVarE;
        } catch (Throwable th) {
            this.f9596d.a();
            throw th;
        }
    }

    public l h() {
        if (!this.f9601i.cacheSource()) {
            return null;
        }
        long jB = AbstractC2535d.b();
        l lVarI = i(this.f9593a.b());
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Decoded source from cache", jB);
        }
        return m(lVarI);
    }

    public final l i(S1.c cVar) {
        File fileC = this.f9600h.a().c(cVar);
        if (fileC == null) {
            return null;
        }
        try {
            l lVarA = this.f9597e.g().a(fileC, this.f9594b, this.f9595c);
            if (lVarA == null) {
            }
            return lVarA;
        } finally {
            this.f9600h.a().a(cVar);
        }
    }

    public final void j(String str, long j9) {
        Log.v("DecodeJob", str + " in " + AbstractC2535d.a(j9) + ", key: " + this.f9593a);
    }

    public final l k(l lVar) {
        if (lVar == null) {
            return null;
        }
        return this.f9599g.a(lVar);
    }

    public final l l(l lVar) {
        if (lVar == null) {
            return null;
        }
        l lVarA = this.f9598f.a(lVar, this.f9594b, this.f9595c);
        if (!lVar.equals(lVarA)) {
            lVar.b();
        }
        return lVarA;
    }

    public final l m(l lVar) {
        long jB = AbstractC2535d.b();
        l lVarL = l(lVar);
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Transformed resource from source", jB);
        }
        n(lVarL);
        long jB2 = AbstractC2535d.b();
        l lVarK = k(lVarL);
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Transcoded transformed from source", jB2);
        }
        return lVarK;
    }

    public final void n(l lVar) {
        if (lVar == null || !this.f9601i.cacheResult()) {
            return;
        }
        long jB = AbstractC2535d.b();
        this.f9600h.a().b(this.f9593a, new c(this.f9597e.e(), lVar));
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Wrote transformed from source to cache", jB);
        }
    }
}
