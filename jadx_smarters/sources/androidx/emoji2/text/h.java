package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.e;
import androidx.emoji2.text.m;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e.i f14823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f14824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e.d f14825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f14827e;

    public static final class a {
        public static int a(CharSequence charSequence, int i9, int i10) {
            int length = charSequence.length();
            if (i9 < 0 || length < i9 || i10 < 0) {
                return -1;
            }
            while (true) {
                boolean z9 = false;
                while (i10 != 0) {
                    i9--;
                    if (i9 < 0) {
                        return z9 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i9);
                    if (z9) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i10--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i10--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z9 = true;
                    }
                }
                return i9;
            }
        }

        public static int b(CharSequence charSequence, int i9, int i10) {
            int length = charSequence.length();
            if (i9 < 0 || length < i9 || i10 < 0) {
                return -1;
            }
            while (true) {
                boolean z9 = false;
                while (i10 != 0) {
                    if (i9 >= length) {
                        if (z9) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i9);
                    if (z9) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i10--;
                        i9++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i10--;
                        i9++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i9++;
                        z9 = true;
                    }
                }
                return i9;
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14828a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m.a f14829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public m.a f14830c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public m.a f14831d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14832e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f14833f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f14834g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int[] f14835h;

        public b(m.a aVar, boolean z9, int[] iArr) {
            this.f14829b = aVar;
            this.f14830c = aVar;
            this.f14834g = z9;
            this.f14835h = iArr;
        }

        public static boolean d(int i9) {
            return i9 == 65039;
        }

        public static boolean f(int i9) {
            return i9 == 65038;
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int a(int r5) {
            /*
                r4 = this;
                androidx.emoji2.text.m$a r0 = r4.f14830c
                androidx.emoji2.text.m$a r0 = r0.a(r5)
                int r1 = r4.f14828a
                r2 = 1
                r3 = 2
                if (r1 == r3) goto L1a
                if (r0 != 0) goto L13
            Le:
                int r3 = r4.g()
                goto L4c
            L13:
                r4.f14828a = r3
                r4.f14830c = r0
                r4.f14833f = r2
                goto L4c
            L1a:
                if (r0 == 0) goto L24
                r4.f14830c = r0
                int r0 = r4.f14833f
                int r0 = r0 + r2
                r4.f14833f = r0
                goto L4c
            L24:
                boolean r0 = f(r5)
                if (r0 == 0) goto L2b
                goto Le
            L2b:
                boolean r0 = d(r5)
                if (r0 == 0) goto L32
                goto L4c
            L32:
                androidx.emoji2.text.m$a r0 = r4.f14830c
                androidx.emoji2.text.g r0 = r0.b()
                if (r0 == 0) goto Le
                int r0 = r4.f14833f
                r3 = 3
                if (r0 != r2) goto L45
                boolean r0 = r4.h()
                if (r0 == 0) goto Le
            L45:
                androidx.emoji2.text.m$a r0 = r4.f14830c
                r4.f14831d = r0
                r4.g()
            L4c:
                r4.f14832e = r5
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.h.b.a(int):int");
        }

        public g b() {
            return this.f14830c.b();
        }

        public g c() {
            return this.f14831d.b();
        }

        public boolean e() {
            return this.f14828a == 2 && this.f14830c.b() != null && (this.f14833f > 1 || h());
        }

        public final int g() {
            this.f14828a = 1;
            this.f14830c = this.f14829b;
            this.f14833f = 0;
            return 1;
        }

        public final boolean h() {
            if (this.f14830c.b().j() || d(this.f14832e)) {
                return true;
            }
            if (this.f14834g) {
                if (this.f14835h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f14835h, this.f14830c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public h(m mVar, e.i iVar, e.d dVar, boolean z9, int[] iArr) {
        this.f14823a = iVar;
        this.f14824b = mVar;
        this.f14825c = dVar;
        this.f14826d = z9;
        this.f14827e = iArr;
    }

    public static boolean b(Editable editable, KeyEvent keyEvent, boolean z9) {
        i[] iVarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (iVarArr = (i[]) editable.getSpans(selectionStart, selectionEnd, i.class)) != null && iVarArr.length > 0) {
            for (i iVar : iVarArr) {
                int spanStart = editable.getSpanStart(iVar);
                int spanEnd = editable.getSpanEnd(iVar);
                if ((z9 && spanStart == selectionStart) || ((!z9 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(InputConnection inputConnection, Editable editable, int i9, int i10, boolean z9) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i9 >= 0 && i10 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z9) {
                iMax = a.a(editable, selectionStart, Math.max(i9, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i10, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i9, 0);
                iMin = Math.min(selectionEnd + i10, editable.length());
            }
            i[] iVarArr = (i[]) editable.getSpans(iMax, iMin, i.class);
            if (iVarArr != null && iVarArr.length > 0) {
                for (i iVar : iVarArr) {
                    int spanStart = editable.getSpanStart(iVar);
                    int spanEnd = editable.getSpanEnd(iVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean d(Editable editable, int i9, KeyEvent keyEvent) {
        if (!(i9 != 67 ? i9 != 112 ? false : b(editable, keyEvent, true) : b(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public static boolean f(int i9, int i10) {
        return i9 == -1 || i10 == -1 || i9 != i10;
    }

    public static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public final void a(Spannable spannable, g gVar, int i9, int i10) {
        spannable.setSpan(this.f14823a.a(gVar), i9, i10, 33);
    }

    public final boolean e(CharSequence charSequence, int i9, int i10, g gVar) {
        if (gVar.d() == 0) {
            gVar.k(this.f14825c.a(charSequence, i9, i10, gVar.h()));
        }
        return gVar.d() == 2;
    }

    public CharSequence h(CharSequence charSequence, int i9, int i10, int i11, boolean z9) {
        r rVar;
        int iCharCount;
        i[] iVarArr;
        boolean z10 = charSequence instanceof n;
        if (z10) {
            ((n) charSequence).a();
        }
        if (!z10) {
            try {
                rVar = charSequence instanceof Spannable ? new r((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i9 + (-1), i10 + 1, i.class) > i10) ? null : new r(charSequence);
            } finally {
                if (z10) {
                    ((n) charSequence).d();
                }
            }
        }
        if (rVar != null && (iVarArr = (i[]) rVar.getSpans(i9, i10, i.class)) != null && iVarArr.length > 0) {
            for (i iVar : iVarArr) {
                int spanStart = rVar.getSpanStart(iVar);
                int spanEnd = rVar.getSpanEnd(iVar);
                if (spanStart != i10) {
                    rVar.removeSpan(iVar);
                }
                i9 = Math.min(spanStart, i9);
                i10 = Math.max(spanEnd, i10);
            }
        }
        if (i9 != i10 && i9 < charSequence.length()) {
            if (i11 != Integer.MAX_VALUE && rVar != null) {
                i11 -= ((i[]) rVar.getSpans(0, rVar.length(), i.class)).length;
            }
            b bVar = new b(this.f14824b.f(), this.f14826d, this.f14827e);
            r rVar2 = rVar;
            int iCodePointAt = Character.codePointAt(charSequence, i9);
            int i12 = 0;
            loop1: while (true) {
                iCharCount = i9;
                while (i9 < i10 && i12 < i11) {
                    int iA = bVar.a(iCodePointAt);
                    if (iA == 1) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i10) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        }
                        i9 = iCharCount;
                    } else if (iA == 2) {
                        i9 += Character.charCount(iCodePointAt);
                        if (i9 < i10) {
                            iCodePointAt = Character.codePointAt(charSequence, i9);
                        }
                    } else if (iA == 3) {
                        if (z9 || !e(charSequence, iCharCount, i9, bVar.c())) {
                            if (rVar2 == null) {
                                rVar2 = new r((Spannable) new SpannableString(charSequence));
                            }
                            a(rVar2, bVar.c(), iCharCount, i9);
                            i12++;
                        }
                    }
                }
                break loop1;
            }
            if (bVar.e() && i12 < i11 && (z9 || !e(charSequence, iCharCount, i9, bVar.b()))) {
                if (rVar2 == null) {
                    rVar2 = new r(charSequence);
                }
                a(rVar2, bVar.b(), iCharCount, i9);
            }
            if (rVar2 == null) {
                if (z10) {
                    ((n) charSequence).d();
                }
                return charSequence;
            }
            Spannable spannableB = rVar2.b();
            if (z10) {
                ((n) charSequence).d();
            }
            return spannableB;
        }
        return charSequence;
    }
}
