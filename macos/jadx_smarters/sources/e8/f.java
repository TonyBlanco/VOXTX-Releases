package E8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static void a(Appendable appendable, Object obj, w8.l lVar) {
        CharSequence charSequenceValueOf;
        kotlin.jvm.internal.l.e(appendable, "<this>");
        if (lVar == null) {
            if (!(obj == null ? true : obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    appendable.append(((Character) obj).charValue());
                    return;
                }
                charSequenceValueOf = String.valueOf(obj);
            }
            appendable.append(charSequenceValueOf);
        }
        obj = lVar.invoke(obj);
        charSequenceValueOf = (CharSequence) obj;
        appendable.append(charSequenceValueOf);
    }
}
