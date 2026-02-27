package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import g0.AbstractC1799d;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y extends EditText {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f15609g = Pattern.compile("\\S+");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Property f15610h = new a(Integer.class, "streamPosition");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Random f15611a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f15612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bitmap f15613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObjectAnimator f15615f;

    public static class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(Y y9) {
            return Integer.valueOf(y9.getStreamPosition());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Y y9, Integer num) {
            y9.setStreamPosition(num.intValue());
        }
    }

    public class b extends ReplacementSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f15617b;

        public b(int i9, int i10) {
            this.f15616a = i9;
            this.f15617b = i10;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f9, int i11, int i12, int i13, Paint paint) {
            int iMeasureText = (int) paint.measureText(charSequence, i9, i10);
            int width = Y.this.f15612c.getWidth();
            int i14 = width * 2;
            int i15 = iMeasureText / i14;
            int i16 = (iMeasureText % i14) / 2;
            boolean zD = Y.d(Y.this);
            Y.this.f15611a.setSeed(this.f15616a);
            int alpha = paint.getAlpha();
            for (int i17 = 0; i17 < i15; i17++) {
                int i18 = this.f15617b + i17;
                Y y9 = Y.this;
                if (i18 >= y9.f15614e) {
                    break;
                }
                float f10 = (i17 * i14) + i16 + (width / 2);
                float f11 = zD ? ((iMeasureText + f9) - f10) - width : f9 + f10;
                paint.setAlpha((y9.f15611a.nextInt(4) + 1) * 63);
                canvas.drawBitmap(Y.this.f15611a.nextBoolean() ? Y.this.f15613d : Y.this.f15612c, f11, i12 - r3.getHeight(), paint);
            }
            paint.setAlpha(alpha);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
            return (int) paint.measureText(charSequence, i9, i10);
        }
    }

    public Y(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15611a = new Random();
    }

    public static boolean d(View view) {
        return 1 == view.getLayoutDirection();
    }

    public final void a(SpannableStringBuilder spannableStringBuilder, String str, int i9) {
        Matcher matcher = f15609g.matcher(str);
        while (matcher.find()) {
            int iStart = matcher.start() + i9;
            spannableStringBuilder.setSpan(new b(str.charAt(matcher.start()), iStart), iStart, matcher.end() + i9, 33);
        }
    }

    public final void b() {
        ObjectAnimator objectAnimator = this.f15615f;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final Bitmap c(int i9, float f9) {
        return Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), i9), (int) (r3.getWidth() * f9), (int) (r3.getHeight() * f9), false);
    }

    public void e() {
        this.f15614e = -1;
        b();
        setText("");
    }

    public final void f() {
        b();
        int streamPosition = getStreamPosition();
        int length = length();
        int i9 = length - streamPosition;
        if (i9 > 0) {
            if (this.f15615f == null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                this.f15615f = objectAnimator;
                objectAnimator.setTarget(this);
                this.f15615f.setProperty(f15610h);
            }
            this.f15615f.setIntValues(streamPosition, length);
            this.f15615f.setDuration(((long) i9) * 50);
            this.f15615f.start();
        }
    }

    public void g(String str, String str2) {
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (str2 != null) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            a(spannableStringBuilder, str2, length);
        }
        this.f15614e = Math.max(str.length(), this.f15614e);
        h(new SpannedString(spannableStringBuilder));
        f();
    }

    public int getStreamPosition() {
        return this.f15614e;
    }

    public final void h(CharSequence charSequence) {
        setText(charSequence);
        bringPointIntoView(length());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f15612c = c(AbstractC1799d.f41001e, 1.3f);
        this.f15613d = c(AbstractC1799d.f41002f, 1.3f);
        e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Y.class.getCanonicalName());
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(T.j.r(this, callback));
    }

    public void setFinalRecognizedText(CharSequence charSequence) {
        h(charSequence);
    }

    public void setStreamPosition(int i9) {
        this.f15614e = i9;
        invalidate();
    }
}
