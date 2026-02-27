package T;

import P.C0962d;
import P.F;
import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class l implements F {

    public static final class a {
        public static CharSequence a(Context context, ClipData.Item item, int i9) {
            if ((i9 & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence charSequenceCoerceToText = item.coerceToText(context);
            return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
        }
    }

    public static CharSequence b(Context context, ClipData.Item item, int i9) {
        return a.a(context, item, i9);
    }

    public static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // P.F
    public C0962d a(View view, C0962d c0962d) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0962d);
        }
        if (c0962d.d() == 2) {
            return c0962d;
        }
        ClipData clipDataB = c0962d.b();
        int iC = c0962d.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z9 = false;
        for (int i9 = 0; i9 < clipDataB.getItemCount(); i9++) {
            CharSequence charSequenceB = b(context, clipDataB.getItemAt(i9), iC);
            if (charSequenceB != null) {
                if (z9) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceB);
                } else {
                    c(editable, charSequenceB);
                    z9 = true;
                }
            }
        }
        return null;
    }
}
