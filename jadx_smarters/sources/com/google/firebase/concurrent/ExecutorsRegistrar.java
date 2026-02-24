package com.google.firebase.concurrent;

import E5.a;
import E5.b;
import E5.c;
import E5.d;
import I5.C0637c;
import I5.F;
import I5.InterfaceC0639e;
import I5.h;
import I5.x;
import J5.C;
import J5.ThreadFactoryC0668b;
import J5.o;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import j6.InterfaceC2102b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f27919a = new x(new InterfaceC2102b() { // from class: J5.s
        @Override // j6.InterfaceC2102b
        public final Object get() {
            return ExecutorsRegistrar.p();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f27920b = new x(new InterfaceC2102b() { // from class: J5.t
        @Override // j6.InterfaceC2102b
        public final Object get() {
            return ExecutorsRegistrar.q();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f27921c = new x(new InterfaceC2102b() { // from class: J5.u
        @Override // j6.InterfaceC2102b
        public final Object get() {
            return ExecutorsRegistrar.r();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f27922d = new x(new InterfaceC2102b() { // from class: J5.v
        @Override // j6.InterfaceC2102b
        public final Object get() {
            return ExecutorsRegistrar.s();
        }
    });

    public static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 23) {
            builderDetectNetwork.detectResourceMismatches();
            if (i9 >= 26) {
                builderDetectNetwork.detectUnbufferedIo();
            }
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    public static ThreadFactory j(String str, int i9) {
        return new ThreadFactoryC0668b(str, i9, null);
    }

    public static ThreadFactory k(String str, int i9, StrictMode.ThreadPolicy threadPolicy) {
        return new ThreadFactoryC0668b(str, i9, threadPolicy);
    }

    public static /* synthetic */ ScheduledExecutorService l(InterfaceC0639e interfaceC0639e) {
        return (ScheduledExecutorService) f27919a.get();
    }

    public static /* synthetic */ ScheduledExecutorService m(InterfaceC0639e interfaceC0639e) {
        return (ScheduledExecutorService) f27921c.get();
    }

    public static /* synthetic */ ScheduledExecutorService n(InterfaceC0639e interfaceC0639e) {
        return (ScheduledExecutorService) f27920b.get();
    }

    public static /* synthetic */ Executor o(InterfaceC0639e interfaceC0639e) {
        return C.INSTANCE;
    }

    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    public static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f27922d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C0637c.d(F.a(a.class, ScheduledExecutorService.class), F.a(a.class, ExecutorService.class), F.a(a.class, Executor.class)).f(new h() { // from class: J5.w
            @Override // I5.h
            public final Object a(InterfaceC0639e interfaceC0639e) {
                return ExecutorsRegistrar.l(interfaceC0639e);
            }
        }).d(), C0637c.d(F.a(b.class, ScheduledExecutorService.class), F.a(b.class, ExecutorService.class), F.a(b.class, Executor.class)).f(new h() { // from class: J5.x
            @Override // I5.h
            public final Object a(InterfaceC0639e interfaceC0639e) {
                return ExecutorsRegistrar.m(interfaceC0639e);
            }
        }).d(), C0637c.d(F.a(c.class, ScheduledExecutorService.class), F.a(c.class, ExecutorService.class), F.a(c.class, Executor.class)).f(new h() { // from class: J5.y
            @Override // I5.h
            public final Object a(InterfaceC0639e interfaceC0639e) {
                return ExecutorsRegistrar.n(interfaceC0639e);
            }
        }).d(), C0637c.c(F.a(d.class, Executor.class)).f(new h() { // from class: J5.z
            @Override // I5.h
            public final Object a(InterfaceC0639e interfaceC0639e) {
                return ExecutorsRegistrar.o(interfaceC0639e);
            }
        }).d());
    }
}
