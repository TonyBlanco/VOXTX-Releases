package com.onesignal;

import n8.AbstractC2299a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38815a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f38816b = b.MainUI;

    public static final class a {

        /* JADX INFO: renamed from: com.onesignal.r$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0303a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f38817a;

            static {
                int[] iArr = new int[b.values().length];
                iArr[b.MainUI.ordinal()] = 1;
                iArr[b.Background.ordinal()] = 2;
                f38817a = iArr;
            }
        }

        public static final class b extends kotlin.jvm.internal.m implements w8.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f38818a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Runnable runnable) {
                super(0);
                this.f38818a = runnable;
            }

            public final void a() {
                this.f38818a.run();
            }

            @Override // w8.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return k8.q.f43674a;
            }
        }

        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final b a() {
            return r.f38816b;
        }

        public final void b(Runnable runnable) {
            kotlin.jvm.internal.l.e(runnable, "runnable");
            int i9 = C0303a.f38817a[a().ordinal()];
            if (i9 == 1) {
                OSUtils.S(runnable);
            } else {
                if (i9 != 2) {
                    return;
                }
                AbstractC2299a.a((31 & 1) != 0, (31 & 2) != 0 ? false : false, (31 & 4) != 0 ? null : null, (31 & 8) != 0 ? null : null, (31 & 16) != 0 ? -1 : 0, new b(runnable));
            }
        }
    }

    public enum b {
        MainUI,
        Background
    }
}
