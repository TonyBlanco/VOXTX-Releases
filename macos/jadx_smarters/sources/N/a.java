package N;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f5248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f5249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f5250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f5251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f5252h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f5255c;

    /* JADX INFO: renamed from: N.a$a, reason: collision with other inner class name */
    public static final class C0069a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public n f5258c;

        public C0069a() {
            c(a.e(Locale.getDefault()));
        }

        public static a b(boolean z9) {
            return z9 ? a.f5252h : a.f5251g;
        }

        public a a() {
            return (this.f5257b == 2 && this.f5258c == a.f5248d) ? b(this.f5256a) : new a(this.f5256a, this.f5257b, this.f5258c);
        }

        public final void c(boolean z9) {
            this.f5256a = z9;
            this.f5258c = a.f5248d;
            this.f5257b = 2;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final byte[] f5259f = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharSequence f5260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f5261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5262c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5263d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public char f5264e;

        static {
            for (int i9 = 0; i9 < 1792; i9++) {
                f5259f[i9] = Character.getDirectionality(i9);
            }
        }

        public b(CharSequence charSequence, boolean z9) {
            this.f5260a = charSequence;
            this.f5261b = z9;
            this.f5262c = charSequence.length();
        }

        public static byte c(char c9) {
            return c9 < 1792 ? f5259f[c9] : Character.getDirectionality(c9);
        }

        public byte a() {
            char cCharAt = this.f5260a.charAt(this.f5263d - 1);
            this.f5264e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f5260a, this.f5263d);
                this.f5263d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f5263d--;
            byte bC = c(this.f5264e);
            if (!this.f5261b) {
                return bC;
            }
            char c9 = this.f5264e;
            return c9 == '>' ? h() : c9 == ';' ? f() : bC;
        }

        public byte b() {
            char cCharAt = this.f5260a.charAt(this.f5263d);
            this.f5264e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f5260a, this.f5263d);
                this.f5263d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f5263d++;
            byte bC = c(this.f5264e);
            if (!this.f5261b) {
                return bC;
            }
            char c9 = this.f5264e;
            return c9 == '<' ? i() : c9 == '&' ? g() : bC;
        }

        public int d() {
            this.f5263d = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (this.f5263d < this.f5262c && i9 == 0) {
                byte b9 = b();
                if (b9 != 0) {
                    if (b9 == 1 || b9 == 2) {
                        if (i11 == 0) {
                            return 1;
                        }
                    } else if (b9 != 9) {
                        switch (b9) {
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                                i11++;
                                i10 = -1;
                                continue;
                            case 16:
                            case LangUtils.HASH_SEED /* 17 */:
                                i11++;
                                i10 = 1;
                                continue;
                            case 18:
                                i11--;
                                i10 = 0;
                                continue;
                        }
                    }
                } else if (i11 == 0) {
                    return -1;
                }
                i9 = i11;
            }
            if (i9 == 0) {
                return 0;
            }
            if (i10 != 0) {
                return i10;
            }
            while (this.f5263d > 0) {
                switch (a()) {
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                        if (i9 == i11) {
                            return -1;
                        }
                        break;
                    case 16:
                    case LangUtils.HASH_SEED /* 17 */:
                        if (i9 == i11) {
                            return 1;
                        }
                        break;
                    case 18:
                        i11++;
                        continue;
                }
                i11--;
            }
            return 0;
        }

        public int e() {
            this.f5263d = this.f5262c;
            int i9 = 0;
            int i10 = 0;
            while (this.f5263d > 0) {
                byte bA = a();
                if (bA == 0) {
                    if (i9 == 0) {
                        return -1;
                    }
                    if (i10 == 0) {
                        i10 = i9;
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i9 == 0) {
                        return 1;
                    }
                    if (i10 == 0) {
                        i10 = i9;
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                            if (i10 == i9) {
                                return -1;
                            }
                            i9--;
                            break;
                        case 16:
                        case LangUtils.HASH_SEED /* 17 */:
                            if (i10 == i9) {
                                return 1;
                            }
                            i9--;
                            break;
                        case 18:
                            i9++;
                            break;
                        default:
                            if (i10 == 0) {
                                i10 = i9;
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }

        public final byte f() {
            char cCharAt;
            int i9 = this.f5263d;
            do {
                int i10 = this.f5263d;
                if (i10 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f5260a;
                int i11 = i10 - 1;
                this.f5263d = i11;
                cCharAt = charSequence.charAt(i11);
                this.f5264e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f5263d = i9;
            this.f5264e = ';';
            return (byte) 13;
        }

        public final byte g() {
            char cCharAt;
            do {
                int i9 = this.f5263d;
                if (i9 >= this.f5262c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f5260a;
                this.f5263d = i9 + 1;
                cCharAt = charSequence.charAt(i9);
                this.f5264e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        public final byte h() {
            char cCharAt;
            int i9 = this.f5263d;
            while (true) {
                int i10 = this.f5263d;
                if (i10 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f5260a;
                int i11 = i10 - 1;
                this.f5263d = i11;
                char cCharAt2 = charSequence.charAt(i11);
                this.f5264e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f5263d;
                        if (i12 > 0) {
                            CharSequence charSequence2 = this.f5260a;
                            int i13 = i12 - 1;
                            this.f5263d = i13;
                            cCharAt = charSequence2.charAt(i13);
                            this.f5264e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f5263d = i9;
            this.f5264e = '>';
            return (byte) 13;
        }

        public final byte i() {
            char cCharAt;
            int i9 = this.f5263d;
            while (true) {
                int i10 = this.f5263d;
                if (i10 >= this.f5262c) {
                    this.f5263d = i9;
                    this.f5264e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f5260a;
                this.f5263d = i10 + 1;
                char cCharAt2 = charSequence.charAt(i10);
                this.f5264e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i11 = this.f5263d;
                        if (i11 < this.f5262c) {
                            CharSequence charSequence2 = this.f5260a;
                            this.f5263d = i11 + 1;
                            cCharAt = charSequence2.charAt(i11);
                            this.f5264e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }
    }

    static {
        n nVar = o.f5276c;
        f5248d = nVar;
        f5249e = Character.toString((char) 8206);
        f5250f = Character.toString((char) 8207);
        f5251g = new a(false, 2, nVar);
        f5252h = new a(true, 2, nVar);
    }

    public a(boolean z9, int i9, n nVar) {
        this.f5253a = z9;
        this.f5254b = i9;
        this.f5255c = nVar;
    }

    public static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0069a().a();
    }

    public static boolean e(Locale locale) {
        return p.a(locale) == 1;
    }

    public boolean d() {
        return (this.f5254b & 2) != 0;
    }

    public final String f(CharSequence charSequence, n nVar) {
        boolean zA = nVar.a(charSequence, 0, charSequence.length());
        return (this.f5253a || !(zA || b(charSequence) == 1)) ? this.f5253a ? (!zA || b(charSequence) == -1) ? f5250f : "" : "" : f5249e;
    }

    public final String g(CharSequence charSequence, n nVar) {
        boolean zA = nVar.a(charSequence, 0, charSequence.length());
        return (this.f5253a || !(zA || a(charSequence) == 1)) ? this.f5253a ? (!zA || a(charSequence) == -1) ? f5250f : "" : "" : f5249e;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f5255c, true);
    }

    public CharSequence i(CharSequence charSequence, n nVar, boolean z9) {
        if (charSequence == null) {
            return null;
        }
        boolean zA = nVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z9) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zA ? o.f5275b : o.f5274a));
        }
        if (zA != this.f5253a) {
            spannableStringBuilder.append(zA ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z9) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zA ? o.f5275b : o.f5274a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f5255c, true);
    }

    public String k(String str, n nVar, boolean z9) {
        if (str == null) {
            return null;
        }
        return i(str, nVar, z9).toString();
    }
}
