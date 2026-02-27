package D8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k extends j {

    public static final class a implements Iterable, x8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f1526a;

        public a(d dVar) {
            this.f1526a = dVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f1526a.iterator();
        }
    }

    public static Iterable e(d dVar) {
        kotlin.jvm.internal.l.e(dVar, "<this>");
        return new a(dVar);
    }

    public static d f(d dVar, int i9) {
        kotlin.jvm.internal.l.e(dVar, "<this>");
        if (i9 >= 0) {
            return i9 == 0 ? dVar : dVar instanceof c ? ((c) dVar).a(i9) : new b(dVar, i9);
        }
        throw new IllegalArgumentException(("Requested element count " + i9 + " is less than zero.").toString());
    }

    public static final Appendable g(d dVar, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, CharSequence truncated, w8.l lVar) throws IOException {
        kotlin.jvm.internal.l.e(dVar, "<this>");
        kotlin.jvm.internal.l.e(buffer, "buffer");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        buffer.append(prefix);
        int i10 = 0;
        for (Object obj : dVar) {
            i10++;
            if (i10 > 1) {
                buffer.append(separator);
            }
            if (i9 >= 0 && i10 > i9) {
                break;
            }
            E8.f.a(buffer, obj, lVar);
        }
        if (i9 >= 0 && i10 > i9) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String h(d dVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, CharSequence truncated, w8.l lVar) {
        kotlin.jvm.internal.l.e(dVar, "<this>");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        String string = ((StringBuilder) g(dVar, new StringBuilder(), separator, prefix, postfix, i9, truncated, lVar)).toString();
        kotlin.jvm.internal.l.d(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static /* synthetic */ String i(d dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i9, CharSequence charSequence4, w8.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i10 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i10 & 4) == 0 ? charSequence3 : "";
        int i11 = (i10 & 8) != 0 ? -1 : i9;
        if ((i10 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        return h(dVar, charSequence, charSequence5, charSequence6, i11, charSequence7, lVar);
    }

    public static d j(d dVar, w8.l transform) {
        kotlin.jvm.internal.l.e(dVar, "<this>");
        kotlin.jvm.internal.l.e(transform, "transform");
        return new l(dVar, transform);
    }

    public static final Collection k(d dVar, Collection destination) {
        kotlin.jvm.internal.l.e(dVar, "<this>");
        kotlin.jvm.internal.l.e(destination, "destination");
        Iterator it = dVar.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static List l(d dVar) {
        kotlin.jvm.internal.l.e(dVar, "<this>");
        return l8.k.k(m(dVar));
    }

    public static final List m(d dVar) {
        kotlin.jvm.internal.l.e(dVar, "<this>");
        return (List) k(dVar, new ArrayList());
    }
}
