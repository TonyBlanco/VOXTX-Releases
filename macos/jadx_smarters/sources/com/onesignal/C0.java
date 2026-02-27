package com.onesignal;

/* JADX INFO: loaded from: classes4.dex */
public class C0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f38174b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B0 f38175a;

    public B0 a(M1 m12, C1580q1 c1580q1, P0 p02, InterfaceC1565l1 interfaceC1565l1, Q7.a aVar) {
        if (this.f38175a == null) {
            synchronized (f38174b) {
                try {
                    if (this.f38175a == null) {
                        this.f38175a = new B0(m12, c1580q1, p02, interfaceC1565l1, aVar);
                    }
                } finally {
                }
            }
        }
        return this.f38175a;
    }
}
