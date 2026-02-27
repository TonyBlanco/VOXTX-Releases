package Z0;

import Q0.c;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f10856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f10857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f10858d;

        static {
            int[] iArr = new int[Q0.o.values().length];
            f10858d = iArr;
            try {
                iArr[Q0.o.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10858d[Q0.o.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Q0.l.values().length];
            f10857c = iArr2;
            try {
                iArr2[Q0.l.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10857c[Q0.l.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10857c[Q0.l.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10857c[Q0.l.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10857c[Q0.l.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[Q0.a.values().length];
            f10856b = iArr3;
            try {
                iArr3[Q0.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10856b[Q0.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[Q0.t.values().length];
            f10855a = iArr4;
            try {
                iArr4[Q0.t.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10855a[Q0.t.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10855a[Q0.t.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10855a[Q0.t.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10855a[Q0.t.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10855a[Q0.t.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static int a(Q0.a aVar) {
        int i9 = a.f10856b[aVar.ordinal()];
        if (i9 == 1) {
            return 0;
        }
        if (i9 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + aVar + " to int");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Q0.c b(byte[] r6) throws java.lang.Throwable {
        /*
            Q0.c r0 = new Q0.c
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            int r6 = r2.readInt()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
        L17:
            if (r6 <= 0) goto L2f
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            r0.a(r3, r4)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r6 = move-exception
            goto L59
        L2d:
            r6 = move-exception
            goto L48
        L2f:
            r2.close()     // Catch: java.io.IOException -> L33
            goto L37
        L33:
            r6 = move-exception
            r6.printStackTrace()
        L37:
            r1.close()     // Catch: java.io.IOException -> L3b
            goto L58
        L3b:
            r6 = move-exception
            r6.printStackTrace()
            goto L58
        L40:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L59
        L44:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L48:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r6 = move-exception
            r6.printStackTrace()
        L55:
            r1.close()     // Catch: java.io.IOException -> L3b
        L58:
            return r0
        L59:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L5f
            goto L63
        L5f:
            r0 = move-exception
            r0.printStackTrace()
        L63:
            r1.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r0 = move-exception
            r0.printStackTrace()
        L6b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.v.b(byte[]):Q0.c");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0053 -> B:34:0x006a). Please report as a decompilation issue!!! */
    public static byte[] c(Q0.c cVar) throws Throwable {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        if (cVar.c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                } catch (IOException e9) {
                    e = e9;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                objectOutputStream.writeInt(cVar.c());
                for (c.a aVar : cVar.b()) {
                    objectOutputStream.writeUTF(aVar.a().toString());
                    objectOutputStream.writeBoolean(aVar.b());
                }
                try {
                    objectOutputStream.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                byteArrayOutputStream.close();
            } catch (IOException e11) {
                e = e11;
                objectOutputStream2 = objectOutputStream;
                e.printStackTrace();
                if (objectOutputStream2 != null) {
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream2 = objectOutputStream;
                if (objectOutputStream2 != null) {
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (IOException e14) {
                    e14.printStackTrace();
                    throw th;
                }
            }
        } catch (IOException e15) {
            e15.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static Q0.a d(int i9) {
        if (i9 == 0) {
            return Q0.a.EXPONENTIAL;
        }
        if (i9 == 1) {
            return Q0.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i9 + " to BackoffPolicy");
    }

    public static Q0.l e(int i9) {
        if (i9 == 0) {
            return Q0.l.NOT_REQUIRED;
        }
        if (i9 == 1) {
            return Q0.l.CONNECTED;
        }
        if (i9 == 2) {
            return Q0.l.UNMETERED;
        }
        if (i9 == 3) {
            return Q0.l.NOT_ROAMING;
        }
        if (i9 == 4) {
            return Q0.l.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i9 == 5) {
            return Q0.l.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i9 + " to NetworkType");
    }

    public static Q0.o f(int i9) {
        if (i9 == 0) {
            return Q0.o.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i9 == 1) {
            return Q0.o.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i9 + " to OutOfQuotaPolicy");
    }

    public static Q0.t g(int i9) {
        if (i9 == 0) {
            return Q0.t.ENQUEUED;
        }
        if (i9 == 1) {
            return Q0.t.RUNNING;
        }
        if (i9 == 2) {
            return Q0.t.SUCCEEDED;
        }
        if (i9 == 3) {
            return Q0.t.FAILED;
        }
        if (i9 == 4) {
            return Q0.t.BLOCKED;
        }
        if (i9 == 5) {
            return Q0.t.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i9 + " to State");
    }

    public static int h(Q0.l lVar) {
        int i9 = a.f10857c[lVar.ordinal()];
        if (i9 == 1) {
            return 0;
        }
        if (i9 == 2) {
            return 1;
        }
        if (i9 == 3) {
            return 2;
        }
        if (i9 == 4) {
            return 3;
        }
        if (i9 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && lVar == Q0.l.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + lVar + " to int");
    }

    public static int i(Q0.o oVar) {
        int i9 = a.f10858d[oVar.ordinal()];
        if (i9 == 1) {
            return 0;
        }
        if (i9 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + oVar + " to int");
    }

    public static int j(Q0.t tVar) {
        switch (a.f10855a[tVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + tVar + " to int");
        }
    }
}
