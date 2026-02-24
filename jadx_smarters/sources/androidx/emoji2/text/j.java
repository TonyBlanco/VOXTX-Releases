package androidx.emoji2.text;

import L.t;
import M.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.e;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class j extends e.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f14841j = new a();

    public static class a {
        public Typeface a(Context context, g.b bVar) {
            return M.g.a(context, null, new g.b[]{bVar});
        }

        public g.a b(Context context, M.e eVar) {
            return M.g.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    public static class b implements e.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f14842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final M.e f14843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f14844c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f14845d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Handler f14846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Executor f14847f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f14848g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public e.h f14849h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ContentObserver f14850i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Runnable f14851j;

        public b(Context context, M.e eVar, a aVar) {
            O.h.g(context, "Context cannot be null");
            O.h.g(eVar, "FontRequest cannot be null");
            this.f14842a = context.getApplicationContext();
            this.f14843b = eVar;
            this.f14844c = aVar;
        }

        @Override // androidx.emoji2.text.e.g
        public void a(e.h hVar) {
            O.h.g(hVar, "LoaderCallback cannot be null");
            synchronized (this.f14845d) {
                this.f14849h = hVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.f14845d) {
                try {
                    this.f14849h = null;
                    ContentObserver contentObserver = this.f14850i;
                    if (contentObserver != null) {
                        this.f14844c.c(this.f14842a, contentObserver);
                        this.f14850i = null;
                    }
                    Handler handler = this.f14846e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f14851j);
                    }
                    this.f14846e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f14848g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f14847f = null;
                    this.f14848g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void c() {
            synchronized (this.f14845d) {
                try {
                    if (this.f14849h == null) {
                        return;
                    }
                    try {
                        g.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f14845d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            t.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f14844c.a(this.f14842a, bVarE);
                            ByteBuffer byteBufferF = G.m.f(this.f14842a, null, bVarE.d());
                            if (byteBufferF == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            m mVarB = m.b(typefaceA, byteBufferF);
                            t.b();
                            synchronized (this.f14845d) {
                                try {
                                    e.h hVar = this.f14849h;
                                    if (hVar != null) {
                                        hVar.b(mVarB);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            t.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f14845d) {
                            try {
                                e.h hVar2 = this.f14849h;
                                if (hVar2 != null) {
                                    hVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void d() {
            synchronized (this.f14845d) {
                try {
                    if (this.f14849h == null) {
                        return;
                    }
                    if (this.f14847f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("emojiCompat");
                        this.f14848g = threadPoolExecutorB;
                        this.f14847f = threadPoolExecutorB;
                    }
                    this.f14847f.execute(new Runnable() { // from class: androidx.emoji2.text.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f14852a.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final g.b e() {
            try {
                g.a aVarB = this.f14844c.b(this.f14842a, this.f14843b);
                if (aVarB.c() == 0) {
                    g.b[] bVarArrB = aVarB.b();
                    if (bVarArrB == null || bVarArrB.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrB[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.c() + ")");
            } catch (PackageManager.NameNotFoundException e9) {
                throw new RuntimeException("provider not found", e9);
            }
        }

        public void f(Executor executor) {
            synchronized (this.f14845d) {
                this.f14847f = executor;
            }
        }
    }

    public j(Context context, M.e eVar) {
        super(new b(context, eVar, f14841j));
    }

    public j c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
