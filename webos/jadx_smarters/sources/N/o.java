package N;

import java.util.Locale;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f5274a = new e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f5275b = new e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f5276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f5277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f5278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f5279f;

    public static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f5280b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5281a;

        public a(boolean z9) {
            this.f5281a = z9;
        }

        @Override // N.o.c
        public int a(CharSequence charSequence, int i9, int i10) {
            int i11 = i10 + i9;
            boolean z9 = false;
            while (i9 < i11) {
                int iA = o.a(Character.getDirectionality(charSequence.charAt(i9)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i9++;
                    } else if (!this.f5281a) {
                        return 1;
                    }
                } else if (this.f5281a) {
                    return 0;
                }
                z9 = true;
                i9++;
            }
            if (z9) {
                return this.f5281a ? 1 : 0;
            }
            return 2;
        }
    }

    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f5282a = new b();

        @Override // N.o.c
        public int a(CharSequence charSequence, int i9, int i10) {
            int i11 = i10 + i9;
            int iB = 2;
            while (i9 < i11 && iB == 2) {
                iB = o.b(Character.getDirectionality(charSequence.charAt(i9)));
                i9++;
            }
            return iB;
        }
    }

    public interface c {
        int a(CharSequence charSequence, int i9, int i10);
    }

    public static abstract class d implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f5283a;

        public d(c cVar) {
            this.f5283a = cVar;
        }

        @Override // N.n
        public boolean a(CharSequence charSequence, int i9, int i10) {
            if (charSequence == null || i9 < 0 || i10 < 0 || charSequence.length() - i10 < i9) {
                throw new IllegalArgumentException();
            }
            return this.f5283a == null ? b() : c(charSequence, i9, i10);
        }

        public abstract boolean b();

        public final boolean c(CharSequence charSequence, int i9, int i10) {
            int iA = this.f5283a.a(charSequence, i9, i10);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return b();
            }
            return false;
        }
    }

    public static class e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f5284b;

        public e(c cVar, boolean z9) {
            super(cVar);
            this.f5284b = z9;
        }

        @Override // N.o.d
        public boolean b() {
            return this.f5284b;
        }
    }

    public static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f5285b = new f();

        public f() {
            super(null);
        }

        @Override // N.o.d
        public boolean b() {
            return p.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f5282a;
        f5276c = new e(bVar, false);
        f5277d = new e(bVar, true);
        f5278e = new e(a.f5280b, false);
        f5279f = f.f5285b;
    }

    public static int a(int i9) {
        if (i9 != 0) {
            return (i9 == 1 || i9 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i9) {
        if (i9 != 0) {
            if (i9 == 1 || i9 == 2) {
                return 0;
            }
            switch (i9) {
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    break;
                case 16:
                case LangUtils.HASH_SEED /* 17 */:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
