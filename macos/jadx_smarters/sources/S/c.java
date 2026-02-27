package S;

import O.h;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f9361a = new String[0];

    public static class a {
        public static void a(EditorInfo editorInfo, CharSequence charSequence, int i9) {
            editorInfo.setInitialSurroundingSubText(charSequence, i9);
        }
    }

    public static String[] a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f9361a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f9361a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f9361a;
    }

    public static boolean b(CharSequence charSequence, int i9, int i10) {
        if (i10 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i9));
        }
        if (i10 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i9));
    }

    public static boolean c(int i9) {
        int i10 = i9 & 4095;
        return i10 == 129 || i10 == 225 || i10 == 18;
    }

    public static void d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static void e(EditorInfo editorInfo, CharSequence charSequence, int i9) {
        h.f(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(editorInfo, charSequence, i9);
            return;
        }
        int i10 = editorInfo.initialSelStart;
        int i11 = editorInfo.initialSelEnd;
        int i12 = i10 > i11 ? i11 - i9 : i10 - i9;
        int i13 = i10 > i11 ? i10 - i9 : i11 - i9;
        int length = charSequence.length();
        if (i9 < 0 || i12 < 0 || i13 > length) {
            g(editorInfo, null, 0, 0);
            return;
        }
        if (c(editorInfo.inputType)) {
            g(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            g(editorInfo, charSequence, i12, i13);
        } else {
            h(editorInfo, charSequence, i12, i13);
        }
    }

    public static void f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(editorInfo, charSequence, 0);
        } else {
            e(editorInfo, charSequence, 0);
        }
    }

    public static void g(EditorInfo editorInfo, CharSequence charSequence, int i9, int i10) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i9);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i10);
    }

    public static void h(EditorInfo editorInfo, CharSequence charSequence, int i9, int i10) {
        int i11 = i10 - i9;
        int i12 = i11 > 1024 ? 0 : i11;
        int i13 = 2048 - i12;
        int iMin = Math.min(charSequence.length() - i10, i13 - Math.min(i9, (int) (((double) i13) * 0.8d)));
        int iMin2 = Math.min(i9, i13 - iMin);
        int i14 = i9 - iMin2;
        if (b(charSequence, i14, 0)) {
            i14++;
            iMin2--;
        }
        if (b(charSequence, (i10 + iMin) - 1, 1)) {
            iMin--;
        }
        g(editorInfo, i12 != i11 ? TextUtils.concat(charSequence.subSequence(i14, i14 + iMin2), charSequence.subSequence(i10, iMin + i10)) : charSequence.subSequence(i14, iMin2 + i12 + iMin + i14), iMin2, i12 + iMin2);
    }
}
