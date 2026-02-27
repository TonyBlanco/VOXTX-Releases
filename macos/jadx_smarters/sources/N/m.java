package N;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Spannable {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextPaint f5265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f5266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f5268d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f5269e;

        /* JADX INFO: renamed from: N.m$a$a, reason: collision with other inner class name */
        public static class C0070a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TextPaint f5270a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public TextDirectionHeuristic f5271b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f5272c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f5273d;

            public C0070a(TextPaint textPaint) {
                this.f5270a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f5272c = 1;
                    this.f5273d = 1;
                } else {
                    this.f5273d = 0;
                    this.f5272c = 0;
                }
                this.f5271b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public a a() {
                return new a(this.f5270a, this.f5271b, this.f5272c, this.f5273d);
            }

            public C0070a b(int i9) {
                this.f5272c = i9;
                return this;
            }

            public C0070a c(int i9) {
                this.f5273d = i9;
                return this;
            }

            public C0070a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f5271b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f5265a = params.getTextPaint();
            this.f5266b = params.getTextDirection();
            this.f5267c = params.getBreakStrategy();
            this.f5268d = params.getHyphenationFrequency();
            this.f5269e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i9, int i10) {
            this.f5269e = Build.VERSION.SDK_INT >= 29 ? c.a(textPaint).setBreakStrategy(i9).setHyphenationFrequency(i10).setTextDirection(textDirectionHeuristic).build() : null;
            this.f5265a = textPaint;
            this.f5266b = textDirectionHeuristic;
            this.f5267c = i9;
            this.f5268d = i10;
        }

        public boolean a(a aVar) {
            int i9 = Build.VERSION.SDK_INT;
            if ((i9 >= 23 && (this.f5267c != aVar.b() || this.f5268d != aVar.c())) || this.f5265a.getTextSize() != aVar.e().getTextSize() || this.f5265a.getTextScaleX() != aVar.e().getTextScaleX() || this.f5265a.getTextSkewX() != aVar.e().getTextSkewX() || this.f5265a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f5265a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f5265a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i9 >= 24) {
                if (!this.f5265a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f5265a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.f5265a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f5265a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f5267c;
        }

        public int c() {
            return this.f5268d;
        }

        public TextDirectionHeuristic d() {
            return this.f5266b;
        }

        public TextPaint e() {
            return this.f5265a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f5266b == aVar.d();
        }

        public int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? O.c.b(Float.valueOf(this.f5265a.getTextSize()), Float.valueOf(this.f5265a.getTextScaleX()), Float.valueOf(this.f5265a.getTextSkewX()), Float.valueOf(this.f5265a.getLetterSpacing()), Integer.valueOf(this.f5265a.getFlags()), this.f5265a.getTextLocales(), this.f5265a.getTypeface(), Boolean.valueOf(this.f5265a.isElegantTextHeight()), this.f5266b, Integer.valueOf(this.f5267c), Integer.valueOf(this.f5268d)) : O.c.b(Float.valueOf(this.f5265a.getTextSize()), Float.valueOf(this.f5265a.getTextScaleX()), Float.valueOf(this.f5265a.getTextSkewX()), Float.valueOf(this.f5265a.getLetterSpacing()), Integer.valueOf(this.f5265a.getFlags()), this.f5265a.getTextLocale(), this.f5265a.getTypeface(), Boolean.valueOf(this.f5265a.isElegantTextHeight()), this.f5266b, Integer.valueOf(this.f5267c), Integer.valueOf(this.f5268d));
        }

        public String toString() {
            StringBuilder sb;
            Object textLocale;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f5265a.getTextSize());
            sb2.append(", textScaleX=" + this.f5265a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f5265a.getTextSkewX());
            int i9 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f5265a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f5265a.isElegantTextHeight());
            if (i9 >= 24) {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f5265a.getTextLocales();
            } else {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f5265a.getTextLocale();
            }
            sb.append(textLocale);
            sb2.append(sb.toString());
            sb2.append(", typeface=" + this.f5265a.getTypeface());
            if (i9 >= 26) {
                sb2.append(", variationSettings=" + this.f5265a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f5266b);
            sb2.append(", breakStrategy=" + this.f5267c);
            sb2.append(", hyphenationFrequency=" + this.f5268d);
            sb2.append("}");
            return sb2.toString();
        }
    }
}
