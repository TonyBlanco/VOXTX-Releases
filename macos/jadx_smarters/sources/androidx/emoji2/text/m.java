package androidx.emoji2.text;

import L.t;
import android.graphics.Typeface;
import android.util.SparseArray;
import c0.C1243b;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1243b f14856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f14857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f14858c = new a(1024);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Typeface f14859d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray f14860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f14861b;

        public a() {
            this(1);
        }

        public a(int i9) {
            this.f14860a = new SparseArray(i9);
        }

        public a a(int i9) {
            SparseArray sparseArray = this.f14860a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i9);
        }

        public final g b() {
            return this.f14861b;
        }

        public void c(g gVar, int i9, int i10) {
            a aVarA = a(gVar.b(i9));
            if (aVarA == null) {
                aVarA = new a();
                this.f14860a.put(gVar.b(i9), aVarA);
            }
            if (i10 > i9) {
                aVarA.c(gVar, i9 + 1, i10);
            } else {
                aVarA.f14861b = gVar;
            }
        }
    }

    public m(Typeface typeface, C1243b c1243b) {
        this.f14859d = typeface;
        this.f14856a = c1243b;
        this.f14857b = new char[c1243b.k() * 2];
        a(c1243b);
    }

    public static m b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            t.a("EmojiCompat.MetadataRepo.create");
            return new m(typeface, l.b(byteBuffer));
        } finally {
            t.b();
        }
    }

    public final void a(C1243b c1243b) {
        int iK = c1243b.k();
        for (int i9 = 0; i9 < iK; i9++) {
            g gVar = new g(this, i9);
            Character.toChars(gVar.f(), this.f14857b, i9 * 2);
            h(gVar);
        }
    }

    public char[] c() {
        return this.f14857b;
    }

    public C1243b d() {
        return this.f14856a;
    }

    public int e() {
        return this.f14856a.l();
    }

    public a f() {
        return this.f14858c;
    }

    public Typeface g() {
        return this.f14859d;
    }

    public void h(g gVar) {
        O.h.g(gVar, "emoji metadata cannot be null");
        O.h.a(gVar.c() > 0, "invalid metadata codepoint length");
        this.f14858c.c(gVar, 0, gVar.c() - 1);
    }
}
