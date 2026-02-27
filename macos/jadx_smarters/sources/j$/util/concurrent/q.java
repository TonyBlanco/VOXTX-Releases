package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
final class q extends l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final j$.sun.misc.a f42325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f42326i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    r f42327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile r f42328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile Thread f42329g;
    volatile int lockState;

    static {
        j$.sun.misc.a aVarH = j$.sun.misc.a.h();
        f42325h = aVarH;
        f42326i = aVarH.j(q.class, "lockState");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[PHI: r7
      0x004b: PHI (r7v3 java.lang.Class<?>) = (r7v2 java.lang.Class<?>), (r7v4 java.lang.Class<?>) binds: [B:24:0x0049, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    q(j$.util.concurrent.r r11) {
        /*
            r10 = this;
            r0 = -2
            r1 = 0
            r10.<init>(r0, r1, r1)
            r10.f42328f = r11
            r0 = r1
        L8:
            if (r11 == 0) goto L6c
            j$.util.concurrent.l r2 = r11.f42312d
            j$.util.concurrent.r r2 = (j$.util.concurrent.r) r2
            r11.f42332g = r1
            r11.f42331f = r1
            r3 = 0
            if (r0 != 0) goto L1b
            r11.f42330e = r1
            r11.f42334i = r3
        L19:
            r0 = r11
            goto L68
        L1b:
            java.lang.Object r4 = r11.f42310b
            int r5 = r11.f42309a
            r6 = r0
            r7 = r1
        L21:
            java.lang.Object r8 = r6.f42310b
            int r9 = r6.f42309a
            if (r9 <= r5) goto L29
            r8 = -1
            goto L51
        L29:
            if (r9 >= r5) goto L2d
            r8 = 1
            goto L51
        L2d:
            if (r7 != 0) goto L35
            java.lang.Class r7 = j$.util.concurrent.ConcurrentHashMap.c(r4)
            if (r7 == 0) goto L4b
        L35:
            int r9 = j$.util.concurrent.ConcurrentHashMap.f42275g
            if (r8 == 0) goto L48
            java.lang.Class r9 = r8.getClass()
            if (r9 == r7) goto L40
            goto L48
        L40:
            r9 = r4
            java.lang.Comparable r9 = (java.lang.Comparable) r9
            int r9 = r9.compareTo(r8)
            goto L49
        L48:
            r9 = 0
        L49:
            if (r9 != 0) goto L50
        L4b:
            int r8 = i(r4, r8)
            goto L51
        L50:
            r8 = r9
        L51:
            if (r8 > 0) goto L56
            j$.util.concurrent.r r9 = r6.f42331f
            goto L58
        L56:
            j$.util.concurrent.r r9 = r6.f42332g
        L58:
            if (r9 != 0) goto L6a
            r11.f42330e = r6
            if (r8 > 0) goto L61
            r6.f42331f = r11
            goto L63
        L61:
            r6.f42332g = r11
        L63:
            j$.util.concurrent.r r11 = c(r0, r11)
            goto L19
        L68:
            r11 = r2
            goto L8
        L6a:
            r6 = r9
            goto L21
        L6c:
            r10.f42327e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.q.<init>(j$.util.concurrent.r):void");
    }

    static r b(r rVar, r rVar2) {
        while (rVar2 != null && rVar2 != rVar) {
            r rVar3 = rVar2.f42330e;
            if (rVar3 == null) {
                rVar2.f42334i = false;
                return rVar2;
            }
            if (rVar2.f42334i) {
                rVar2.f42334i = false;
                return rVar;
            }
            r rVar4 = rVar3.f42331f;
            if (rVar4 == rVar2) {
                rVar4 = rVar3.f42332g;
                if (rVar4 != null && rVar4.f42334i) {
                    rVar4.f42334i = false;
                    rVar3.f42334i = true;
                    rVar = g(rVar, rVar3);
                    rVar3 = rVar2.f42330e;
                    rVar4 = rVar3 == null ? null : rVar3.f42332g;
                }
                if (rVar4 == null) {
                    rVar2 = rVar3;
                } else {
                    r rVar5 = rVar4.f42331f;
                    r rVar6 = rVar4.f42332g;
                    if ((rVar6 == null || !rVar6.f42334i) && (rVar5 == null || !rVar5.f42334i)) {
                        rVar4.f42334i = true;
                        rVar2 = rVar3;
                    } else {
                        if (rVar6 == null || !rVar6.f42334i) {
                            if (rVar5 != null) {
                                rVar5.f42334i = false;
                            }
                            rVar4.f42334i = true;
                            rVar = h(rVar, rVar4);
                            rVar3 = rVar2.f42330e;
                            rVar4 = rVar3 != null ? rVar3.f42332g : null;
                        }
                        if (rVar4 != null) {
                            rVar4.f42334i = rVar3 == null ? false : rVar3.f42334i;
                            r rVar7 = rVar4.f42332g;
                            if (rVar7 != null) {
                                rVar7.f42334i = false;
                            }
                        }
                        if (rVar3 != null) {
                            rVar3.f42334i = false;
                            rVar = g(rVar, rVar3);
                        }
                        rVar2 = rVar;
                    }
                }
            } else {
                if (rVar4 != null && rVar4.f42334i) {
                    rVar4.f42334i = false;
                    rVar3.f42334i = true;
                    rVar = h(rVar, rVar3);
                    rVar3 = rVar2.f42330e;
                    rVar4 = rVar3 == null ? null : rVar3.f42331f;
                }
                if (rVar4 == null) {
                    rVar2 = rVar3;
                } else {
                    r rVar8 = rVar4.f42331f;
                    r rVar9 = rVar4.f42332g;
                    if ((rVar8 == null || !rVar8.f42334i) && (rVar9 == null || !rVar9.f42334i)) {
                        rVar4.f42334i = true;
                        rVar2 = rVar3;
                    } else {
                        if (rVar8 == null || !rVar8.f42334i) {
                            if (rVar9 != null) {
                                rVar9.f42334i = false;
                            }
                            rVar4.f42334i = true;
                            rVar = g(rVar, rVar4);
                            rVar3 = rVar2.f42330e;
                            rVar4 = rVar3 != null ? rVar3.f42331f : null;
                        }
                        if (rVar4 != null) {
                            rVar4.f42334i = rVar3 == null ? false : rVar3.f42334i;
                            r rVar10 = rVar4.f42331f;
                            if (rVar10 != null) {
                                rVar10.f42334i = false;
                            }
                        }
                        if (rVar3 != null) {
                            rVar3.f42334i = false;
                            rVar = h(rVar, rVar3);
                        }
                        rVar2 = rVar;
                    }
                }
            }
        }
        return rVar;
    }

    static r c(r rVar, r rVar2) {
        r rVar3;
        rVar2.f42334i = true;
        while (true) {
            r rVar4 = rVar2.f42330e;
            if (rVar4 == null) {
                rVar2.f42334i = false;
                return rVar2;
            }
            if (!rVar4.f42334i || (rVar3 = rVar4.f42330e) == null) {
                break;
            }
            r rVar5 = rVar3.f42331f;
            if (rVar4 == rVar5) {
                rVar5 = rVar3.f42332g;
                if (rVar5 == null || !rVar5.f42334i) {
                    if (rVar2 == rVar4.f42332g) {
                        rVar = g(rVar, rVar4);
                        r rVar6 = rVar4.f42330e;
                        rVar3 = rVar6 == null ? null : rVar6.f42330e;
                        rVar4 = rVar6;
                        rVar2 = rVar4;
                    }
                    if (rVar4 != null) {
                        rVar4.f42334i = false;
                        if (rVar3 != null) {
                            rVar3.f42334i = true;
                            rVar = h(rVar, rVar3);
                        }
                    }
                } else {
                    rVar5.f42334i = false;
                    rVar4.f42334i = false;
                    rVar3.f42334i = true;
                    rVar2 = rVar3;
                }
            } else if (rVar5 == null || !rVar5.f42334i) {
                if (rVar2 == rVar4.f42331f) {
                    rVar = h(rVar, rVar4);
                    r rVar7 = rVar4.f42330e;
                    rVar3 = rVar7 == null ? null : rVar7.f42330e;
                    rVar4 = rVar7;
                    rVar2 = rVar4;
                }
                if (rVar4 != null) {
                    rVar4.f42334i = false;
                    if (rVar3 != null) {
                        rVar3.f42334i = true;
                        rVar = g(rVar, rVar3);
                    }
                }
            } else {
                rVar5.f42334i = false;
                rVar4.f42334i = false;
                rVar3.f42334i = true;
                rVar2 = rVar3;
            }
        }
        return rVar;
    }

    private final void d() {
        if (f42325h.c(this, f42326i, 0, 1)) {
            return;
        }
        boolean z9 = false;
        while (true) {
            int i9 = this.lockState;
            if ((i9 & (-3)) == 0) {
                if (f42325h.c(this, f42326i, i9, 1)) {
                    break;
                }
            } else if ((i9 & 2) == 0) {
                if (f42325h.c(this, f42326i, i9, i9 | 2)) {
                    this.f42329g = Thread.currentThread();
                    z9 = true;
                }
            } else if (z9) {
                LockSupport.park(this);
            }
        }
        if (z9) {
            this.f42329g = null;
        }
    }

    static r g(r rVar, r rVar2) {
        r rVar3;
        if (rVar2 != null && (rVar3 = rVar2.f42332g) != null) {
            r rVar4 = rVar3.f42331f;
            rVar2.f42332g = rVar4;
            if (rVar4 != null) {
                rVar4.f42330e = rVar2;
            }
            r rVar5 = rVar2.f42330e;
            rVar3.f42330e = rVar5;
            if (rVar5 == null) {
                rVar3.f42334i = false;
                rVar = rVar3;
            } else if (rVar5.f42331f == rVar2) {
                rVar5.f42331f = rVar3;
            } else {
                rVar5.f42332g = rVar3;
            }
            rVar3.f42331f = rVar2;
            rVar2.f42330e = rVar3;
        }
        return rVar;
    }

    static r h(r rVar, r rVar2) {
        r rVar3;
        if (rVar2 != null && (rVar3 = rVar2.f42331f) != null) {
            r rVar4 = rVar3.f42332g;
            rVar2.f42331f = rVar4;
            if (rVar4 != null) {
                rVar4.f42330e = rVar2;
            }
            r rVar5 = rVar2.f42330e;
            rVar3.f42330e = rVar5;
            if (rVar5 == null) {
                rVar3.f42334i = false;
                rVar = rVar3;
            } else if (rVar5.f42332g == rVar2) {
                rVar5.f42332g = rVar3;
            } else {
                rVar5.f42331f = rVar3;
            }
            rVar3.f42332g = rVar2;
            rVar2.f42330e = rVar3;
        }
        return rVar;
    }

    static int i(Object obj, Object obj2) {
        int iCompareTo;
        return (obj == null || obj2 == null || (iCompareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : iCompareTo;
    }

    @Override // j$.util.concurrent.l
    final l a(Object obj, int i9) {
        Object obj2;
        Thread thread;
        Thread thread2;
        r rVarB = null;
        if (obj != null) {
            l lVar = this.f42328f;
            while (lVar != null) {
                int i10 = this.lockState;
                if ((i10 & 3) == 0) {
                    j$.sun.misc.a aVar = f42325h;
                    long j9 = f42326i;
                    if (aVar.c(this, j9, i10, i10 + 4)) {
                        try {
                            r rVar = this.f42327e;
                            if (rVar != null) {
                                rVarB = rVar.b(i9, obj, null);
                            }
                            if (aVar.f(this, j9) == 6 && (thread2 = this.f42329g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return rVarB;
                        } catch (Throwable th) {
                            if (f42325h.f(this, f42326i) == 6 && (thread = this.f42329g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th;
                        }
                    }
                } else {
                    if (lVar.f42309a == i9 && ((obj2 = lVar.f42310b) == obj || (obj2 != null && obj.equals(obj2)))) {
                        return lVar;
                    }
                    lVar = lVar.f42312d;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b3, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bb, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a A[PHI: r2
      0x005a: PHI (r2v5 java.lang.Class<?>) = (r2v4 java.lang.Class<?>), (r2v6 java.lang.Class<?>) binds: [B:26:0x0058, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final j$.util.concurrent.r e(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r4 = r17
            j$.util.concurrent.r r2 = r1.f42327e
            r8 = 0
            r9 = 0
            r10 = r2
            r2 = r8
            r3 = 0
        Lc:
            if (r10 != 0) goto L22
            j$.util.concurrent.r r9 = new j$.util.concurrent.r
            r6 = 0
            r7 = 0
            r2 = r9
            r3 = r16
            r4 = r17
            r5 = r18
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f42327e = r9
            r1.f42328f = r9
            goto Lb3
        L22:
            int r5 = r10.f42309a
            r11 = 1
            if (r5 <= r0) goto L2a
            r5 = -1
            r12 = -1
            goto L79
        L2a:
            if (r5 >= r0) goto L2e
            r12 = 1
            goto L79
        L2e:
            java.lang.Object r5 = r10.f42310b
            if (r5 == r4) goto Lbb
            if (r5 == 0) goto L3c
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L3c
            goto Lbb
        L3c:
            if (r2 != 0) goto L44
            java.lang.Class r2 = j$.util.concurrent.ConcurrentHashMap.c(r17)
            if (r2 == 0) goto L5a
        L44:
            int r6 = j$.util.concurrent.ConcurrentHashMap.f42275g
            if (r5 == 0) goto L57
            java.lang.Class r6 = r5.getClass()
            if (r6 == r2) goto L4f
            goto L57
        L4f:
            r6 = r4
            java.lang.Comparable r6 = (java.lang.Comparable) r6
            int r6 = r6.compareTo(r5)
            goto L58
        L57:
            r6 = 0
        L58:
            if (r6 != 0) goto L78
        L5a:
            if (r3 != 0) goto L72
            j$.util.concurrent.r r3 = r10.f42331f
            if (r3 == 0) goto L66
            j$.util.concurrent.r r3 = r3.b(r0, r4, r2)
            if (r3 != 0) goto L70
        L66:
            j$.util.concurrent.r r3 = r10.f42332g
            if (r3 == 0) goto L71
            j$.util.concurrent.r r3 = r3.b(r0, r4, r2)
            if (r3 == 0) goto L71
        L70:
            return r3
        L71:
            r3 = 1
        L72:
            int r5 = i(r4, r5)
            r12 = r5
            goto L79
        L78:
            r12 = r6
        L79:
            if (r12 > 0) goto L7e
            j$.util.concurrent.r r5 = r10.f42331f
            goto L80
        L7e:
            j$.util.concurrent.r r5 = r10.f42332g
        L80:
            if (r5 != 0) goto Lb8
            j$.util.concurrent.r r13 = r1.f42328f
            j$.util.concurrent.r r14 = new j$.util.concurrent.r
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r13
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f42328f = r14
            if (r13 == 0) goto L98
            r13.f42333h = r14
        L98:
            if (r12 > 0) goto L9d
            r10.f42331f = r14
            goto L9f
        L9d:
            r10.f42332g = r14
        L9f:
            boolean r0 = r10.f42334i
            if (r0 != 0) goto La6
            r14.f42334i = r11
            goto Lb3
        La6:
            r15.d()
            j$.util.concurrent.r r0 = r1.f42327e     // Catch: java.lang.Throwable -> Lb4
            j$.util.concurrent.r r0 = c(r0, r14)     // Catch: java.lang.Throwable -> Lb4
            r1.f42327e = r0     // Catch: java.lang.Throwable -> Lb4
            r1.lockState = r9
        Lb3:
            return r8
        Lb4:
            r0 = move-exception
            r1.lockState = r9
            throw r0
        Lb8:
            r10 = r5
            goto Lc
        Lbb:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.q.e(int, java.lang.Object, java.lang.Object):j$.util.concurrent.r");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x008e A[PHI: r0
      0x008e: PHI (r0v4 j$.util.concurrent.r) = (r0v3 j$.util.concurrent.r), (r0v12 j$.util.concurrent.r) binds: [B:55:0x008a, B:51:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean f(j$.util.concurrent.r r11) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.q.f(j$.util.concurrent.r):boolean");
    }
}
