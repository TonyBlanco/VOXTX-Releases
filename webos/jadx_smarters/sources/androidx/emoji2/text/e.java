package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import s.C2696b;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f14784n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f14785o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static volatile e f14786p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f14788b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f14791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f14792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f14794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f14795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f14796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f14797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f14798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f14799m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReadWriteLock f14787a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f14789c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f14790d = new Handler(Looper.getMainLooper());

    public static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile androidx.emoji2.text.h f14800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile m f14801c;

        /* JADX INFO: renamed from: androidx.emoji2.text.e$a$a, reason: collision with other inner class name */
        public class C0169a extends h {
            public C0169a() {
            }

            @Override // androidx.emoji2.text.e.h
            public void a(Throwable th) {
                a.this.f14803a.m(th);
            }

            @Override // androidx.emoji2.text.e.h
            public void b(m mVar) {
                a.this.d(mVar);
            }
        }

        public a(e eVar) {
            super(eVar);
        }

        @Override // androidx.emoji2.text.e.b
        public void a() {
            try {
                this.f14803a.f14792f.a(new C0169a());
            } catch (Throwable th) {
                this.f14803a.m(th);
            }
        }

        @Override // androidx.emoji2.text.e.b
        public CharSequence b(CharSequence charSequence, int i9, int i10, int i11, boolean z9) {
            return this.f14800b.h(charSequence, i9, i10, i11, z9);
        }

        @Override // androidx.emoji2.text.e.b
        public void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f14801c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f14803a.f14793g);
        }

        public void d(m mVar) {
            if (mVar == null) {
                this.f14803a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f14801c = mVar;
            m mVar2 = this.f14801c;
            i iVar = new i();
            d dVar = this.f14803a.f14799m;
            e eVar = this.f14803a;
            this.f14800b = new androidx.emoji2.text.h(mVar2, iVar, dVar, eVar.f14794h, eVar.f14795i);
            this.f14803a.n();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f14803a;

        public b(e eVar) {
            this.f14803a = eVar;
        }

        public abstract void a();

        public abstract CharSequence b(CharSequence charSequence, int i9, int i10, int i11, boolean z9);

        public abstract void c(EditorInfo editorInfo);
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f14804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f14805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f14806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int[] f14807d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Set f14808e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f14809f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f14810g = -16711936;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f14811h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f14812i = new androidx.emoji2.text.d();

        public c(g gVar) {
            O.h.g(gVar, "metadataLoader cannot be null.");
            this.f14804a = gVar;
        }

        public final g a() {
            return this.f14804a;
        }

        public c b(int i9) {
            this.f14811h = i9;
            return this;
        }
    }

    public interface d {
        boolean a(CharSequence charSequence, int i9, int i10, int i11);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.e$e, reason: collision with other inner class name */
    public static abstract class AbstractC0170e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    public static class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f14813a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Throwable f14814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f14815d;

        public f(AbstractC0170e abstractC0170e, int i9) {
            this(Arrays.asList((AbstractC0170e) O.h.g(abstractC0170e, "initCallback cannot be null")), i9, null);
        }

        public f(Collection collection, int i9) {
            this(collection, i9, null);
        }

        public f(Collection collection, int i9, Throwable th) {
            O.h.g(collection, "initCallbacks cannot be null");
            this.f14813a = new ArrayList(collection);
            this.f14815d = i9;
            this.f14814c = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f14813a.size();
            int i9 = 0;
            if (this.f14815d != 1) {
                while (i9 < size) {
                    ((AbstractC0170e) this.f14813a.get(i9)).a(this.f14814c);
                    i9++;
                }
            } else {
                while (i9 < size) {
                    ((AbstractC0170e) this.f14813a.get(i9)).b();
                    i9++;
                }
            }
        }
    }

    public interface g {
        void a(h hVar);
    }

    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(m mVar);
    }

    public static class i {
        public androidx.emoji2.text.i a(androidx.emoji2.text.g gVar) {
            return new o(gVar);
        }
    }

    public e(c cVar) {
        this.f14793g = cVar.f14805b;
        this.f14794h = cVar.f14806c;
        this.f14795i = cVar.f14807d;
        this.f14796j = cVar.f14809f;
        this.f14797k = cVar.f14810g;
        this.f14792f = cVar.f14804a;
        this.f14798l = cVar.f14811h;
        this.f14799m = cVar.f14812i;
        C2696b c2696b = new C2696b();
        this.f14788b = c2696b;
        Set set = cVar.f14808e;
        if (set != null && !set.isEmpty()) {
            c2696b.addAll(cVar.f14808e);
        }
        this.f14791e = new a(this);
        l();
    }

    public static e b() {
        e eVar;
        synchronized (f14784n) {
            eVar = f14786p;
            O.h.h(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i9, int i10, boolean z9) {
        return androidx.emoji2.text.h.c(inputConnection, editable, i9, i10, z9);
    }

    public static boolean f(Editable editable, int i9, KeyEvent keyEvent) {
        return androidx.emoji2.text.h.d(editable, i9, keyEvent);
    }

    public static e g(c cVar) {
        e eVar = f14786p;
        if (eVar == null) {
            synchronized (f14784n) {
                try {
                    eVar = f14786p;
                    if (eVar == null) {
                        eVar = new e(cVar);
                        f14786p = eVar;
                    }
                } finally {
                }
            }
        }
        return eVar;
    }

    public static boolean h() {
        return f14786p != null;
    }

    public int c() {
        return this.f14797k;
    }

    public int d() {
        this.f14787a.readLock().lock();
        try {
            return this.f14789c;
        } finally {
            this.f14787a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.f14796j;
    }

    public final boolean j() {
        return d() == 1;
    }

    public void k() {
        O.h.h(this.f14798l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (j()) {
            return;
        }
        this.f14787a.writeLock().lock();
        try {
            if (this.f14789c == 0) {
                return;
            }
            this.f14789c = 0;
            this.f14787a.writeLock().unlock();
            this.f14791e.a();
        } finally {
            this.f14787a.writeLock().unlock();
        }
    }

    public final void l() {
        this.f14787a.writeLock().lock();
        try {
            if (this.f14798l == 0) {
                this.f14789c = 0;
            }
            this.f14787a.writeLock().unlock();
            if (d() == 0) {
                this.f14791e.a();
            }
        } catch (Throwable th) {
            this.f14787a.writeLock().unlock();
            throw th;
        }
    }

    public void m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f14787a.writeLock().lock();
        try {
            this.f14789c = 2;
            arrayList.addAll(this.f14788b);
            this.f14788b.clear();
            this.f14787a.writeLock().unlock();
            this.f14790d.post(new f(arrayList, this.f14789c, th));
        } catch (Throwable th2) {
            this.f14787a.writeLock().unlock();
            throw th2;
        }
    }

    public void n() {
        ArrayList arrayList = new ArrayList();
        this.f14787a.writeLock().lock();
        try {
            this.f14789c = 1;
            arrayList.addAll(this.f14788b);
            this.f14788b.clear();
            this.f14787a.writeLock().unlock();
            this.f14790d.post(new f(arrayList, this.f14789c));
        } catch (Throwable th) {
            this.f14787a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence p(CharSequence charSequence, int i9, int i10) {
        return q(charSequence, i9, i10, a.e.API_PRIORITY_OTHER);
    }

    public CharSequence q(CharSequence charSequence, int i9, int i10, int i11) {
        return r(charSequence, i9, i10, i11, 0);
    }

    public CharSequence r(CharSequence charSequence, int i9, int i10, int i11, int i12) {
        O.h.h(j(), "Not initialized yet");
        O.h.d(i9, "start cannot be negative");
        O.h.d(i10, "end cannot be negative");
        O.h.d(i11, "maxEmojiCount cannot be negative");
        O.h.a(i9 <= i10, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        O.h.a(i9 <= charSequence.length(), "start should be < than charSequence length");
        O.h.a(i10 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i9 == i10) {
            return charSequence;
        }
        return this.f14791e.b(charSequence, i9, i10, i11, i12 != 1 ? i12 != 2 ? this.f14793g : false : true);
    }

    public void s(AbstractC0170e abstractC0170e) {
        O.h.g(abstractC0170e, "initCallback cannot be null");
        this.f14787a.writeLock().lock();
        try {
            if (this.f14789c == 1 || this.f14789c == 2) {
                this.f14790d.post(new f(abstractC0170e, this.f14789c));
            } else {
                this.f14788b.add(abstractC0170e);
            }
            this.f14787a.writeLock().unlock();
        } catch (Throwable th) {
            this.f14787a.writeLock().unlock();
            throw th;
        }
    }

    public void t(AbstractC0170e abstractC0170e) {
        O.h.g(abstractC0170e, "initCallback cannot be null");
        this.f14787a.writeLock().lock();
        try {
            this.f14788b.remove(abstractC0170e);
        } finally {
            this.f14787a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (!j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f14791e.c(editorInfo);
    }
}
