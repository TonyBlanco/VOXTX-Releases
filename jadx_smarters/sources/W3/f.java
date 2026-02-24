package W3;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.k0;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static void a(Spannable spannable, int i9, int i10, g gVar, d dVar, Map map, int i11) {
        d dVarE;
        Object cVar;
        g gVarF;
        Object absoluteSizeSpan;
        int i12;
        if (gVar.l() != -1) {
            spannable.setSpan(new StyleSpan(gVar.l()), i9, i10, 33);
        }
        if (gVar.s()) {
            spannable.setSpan(new StrikethroughSpan(), i9, i10, 33);
        }
        if (gVar.t()) {
            spannable.setSpan(new UnderlineSpan(), i9, i10, 33);
        }
        if (gVar.q()) {
            T3.d.a(spannable, new ForegroundColorSpan(gVar.c()), i9, i10, 33);
        }
        if (gVar.p()) {
            T3.d.a(spannable, new BackgroundColorSpan(gVar.b()), i9, i10, 33);
        }
        if (gVar.d() != null) {
            T3.d.a(spannable, new TypefaceSpan(gVar.d()), i9, i10, 33);
        }
        if (gVar.o() != null) {
            b bVar = (b) AbstractC1684a.e(gVar.o());
            int i13 = bVar.f10237a;
            if (i13 == -1) {
                i13 = (i11 == 2 || i11 == 1) ? 3 : 1;
                i12 = 1;
            } else {
                i12 = bVar.f10238b;
            }
            int i14 = bVar.f10239c;
            if (i14 == -2) {
                i14 = 1;
            }
            T3.d.a(spannable, new T3.e(i13, i12, i14), i9, i10, 33);
        }
        int iJ = gVar.j();
        if (iJ == 2) {
            d dVarD = d(dVar, map);
            if (dVarD != null && (dVarE = e(dVarD, map)) != null) {
                if (dVarE.g() != 1 || dVarE.f(0).f10258b == null) {
                    AbstractC1681B.g("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) k0.j(dVarE.f(0).f10258b);
                    g gVarF2 = f(dVarE.f10262f, dVarE.l(), map);
                    int i15 = gVarF2 != null ? gVarF2.i() : -1;
                    if (i15 == -1 && (gVarF = f(dVarD.f10262f, dVarD.l(), map)) != null) {
                        i15 = gVarF.i();
                    }
                    cVar = new T3.c(str, i15);
                    spannable.setSpan(cVar, i9, i10, 33);
                }
            }
        } else if (iJ == 3 || iJ == 4) {
            cVar = new a();
            spannable.setSpan(cVar, i9, i10, 33);
        }
        if (gVar.n()) {
            T3.d.a(spannable, new T3.a(), i9, i10, 33);
        }
        int iF = gVar.f();
        if (iF == 1) {
            absoluteSizeSpan = new AbsoluteSizeSpan((int) gVar.e(), true);
        } else if (iF == 2) {
            absoluteSizeSpan = new RelativeSizeSpan(gVar.e());
        } else if (iF != 3) {
            return;
        } else {
            absoluteSizeSpan = new RelativeSizeSpan(gVar.e() / 100.0f);
        }
        T3.d.a(spannable, absoluteSizeSpan, i9, i10, 33);
    }

    public static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    public static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    public static d d(d dVar, Map map) {
        while (dVar != null) {
            g gVarF = f(dVar.f10262f, dVar.l(), map);
            if (gVarF != null && gVarF.j() == 1) {
                return dVar;
            }
            dVar = dVar.f10266j;
        }
        return null;
    }

    public static d e(d dVar, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            d dVar2 = (d) arrayDeque.pop();
            g gVarF = f(dVar2.f10262f, dVar2.l(), map);
            if (gVarF != null && gVarF.j() == 3) {
                return dVar2;
            }
            for (int iG = dVar2.g() - 1; iG >= 0; iG--) {
                arrayDeque.push(dVar2.f(iG));
            }
        }
        return null;
    }

    public static g f(g gVar, String[] strArr, Map map) {
        int i9 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i9 < length) {
                    gVar2.a((g) map.get(strArr[i9]));
                    i9++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.a((g) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i9 < length2) {
                    gVar.a((g) map.get(strArr[i9]));
                    i9++;
                }
            }
        }
        return gVar;
    }
}
