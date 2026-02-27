package O;

import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static void a(Object obj, StringBuilder sb) {
        String hexString;
        int iLastIndexOf;
        if (obj == null) {
            hexString = Constants.NULL_VERSION_ID;
        } else {
            String simpleName = obj.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(iLastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(hexString);
    }
}
