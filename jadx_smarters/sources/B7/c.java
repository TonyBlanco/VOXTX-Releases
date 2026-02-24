package B7;

import android.net.Uri;
import android.text.InputFilter;
import android.text.Spanned;
import android.widget.EditText;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static InputFilter f743a = new b();

    public class a implements InputFilter {
        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
            while (i9 < i10) {
                if (Character.isWhitespace(charSequence.charAt(i9))) {
                    return "";
                }
                i9++;
            }
            return null;
        }
    }

    public class b implements InputFilter {
        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
            while (i9 < i10) {
                if (Character.getType(charSequence.charAt(i9)) == 19) {
                    return "";
                }
                i9++;
            }
            return null;
        }
    }

    public static void a(EditText editText) {
        editText.setFilters(new InputFilter[]{new a()});
    }

    public static boolean b(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean c(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }
}
