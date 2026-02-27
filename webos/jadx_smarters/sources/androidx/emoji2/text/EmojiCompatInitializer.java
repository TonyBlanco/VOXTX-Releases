package androidx.emoji2.text;

import L.t;
import android.content.Context;
import androidx.emoji2.text.e;
import androidx.lifecycle.AbstractC1173c;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.InterfaceC1174d;
import androidx.lifecycle.InterfaceC1186p;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements I0.b {

    public static class a extends e.c {
        public a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    public static class b implements e.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f14776a;

        public class a extends e.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e.h f14777a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreadPoolExecutor f14778b;

            public a(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f14777a = hVar;
                this.f14778b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.e.h
            public void a(Throwable th) {
                try {
                    this.f14777a.a(th);
                } finally {
                    this.f14778b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.e.h
            public void b(m mVar) {
                try {
                    this.f14777a.b(mVar);
                } finally {
                    this.f14778b.shutdown();
                }
            }
        }

        public b(Context context) {
            this.f14776a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.g
        public void a(final e.h hVar) {
            final ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14816a.d(hVar, threadPoolExecutorB);
                }
            });
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                j jVarA = androidx.emoji2.text.c.a(this.f14776a);
                if (jVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                jVarA.c(threadPoolExecutor);
                jVarA.a().a(new a(hVar, threadPoolExecutor));
            } catch (Throwable th) {
                hVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                t.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.h()) {
                    e.b().k();
                }
            } finally {
                t.b();
            }
        }
    }

    @Override // I0.b
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // I0.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        e.g(new a(context));
        d(context);
        return Boolean.TRUE;
    }

    public void d(Context context) {
        final AbstractC1180j lifecycle = ((InterfaceC1186p) I0.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new InterfaceC1174d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC1176f
            public /* synthetic */ void a(InterfaceC1186p interfaceC1186p) {
                AbstractC1173c.a(this, interfaceC1186p);
            }

            @Override // androidx.lifecycle.InterfaceC1176f
            public void d(InterfaceC1186p interfaceC1186p) {
                EmojiCompatInitializer.this.e();
                lifecycle.c(this);
            }

            @Override // androidx.lifecycle.InterfaceC1176f
            public /* synthetic */ void f(InterfaceC1186p interfaceC1186p) {
                AbstractC1173c.c(this, interfaceC1186p);
            }

            @Override // androidx.lifecycle.InterfaceC1176f
            public /* synthetic */ void g(InterfaceC1186p interfaceC1186p) {
                AbstractC1173c.e(this, interfaceC1186p);
            }

            @Override // androidx.lifecycle.InterfaceC1176f
            public /* synthetic */ void h(InterfaceC1186p interfaceC1186p) {
                AbstractC1173c.b(this, interfaceC1186p);
            }

            @Override // androidx.lifecycle.InterfaceC1176f
            public /* synthetic */ void i(InterfaceC1186p interfaceC1186p) {
                AbstractC1173c.d(this, interfaceC1186p);
            }
        });
    }

    public void e() {
        androidx.emoji2.text.b.d().postDelayed(new c(), 500L);
    }
}
