package k;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: renamed from: k.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2130z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f43436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextClassifier f43437b;

    /* JADX INFO: renamed from: k.z$a */
    public static final class a {
        public static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public C2130z(TextView textView) {
        this.f43436a = (TextView) O.h.f(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f43437b;
        return textClassifier == null ? a.a(this.f43436a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f43437b = textClassifier;
    }
}
