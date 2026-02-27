package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public class r implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14867a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Spannable f14868c;

    public static class a {
        public static IntStream a(CharSequence charSequence) {
            return IntStream.VivifiedWrapper.convert(charSequence.chars());
        }

        public static IntStream b(CharSequence charSequence) {
            return IntStream.VivifiedWrapper.convert(charSequence.codePoints());
        }
    }

    public static class b {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof N.m;
        }
    }

    public static class c extends b {
        @Override // androidx.emoji2.text.r.b
        public boolean a(CharSequence charSequence) {
            return s.a(charSequence) || (charSequence instanceof N.m);
        }
    }

    public r(Spannable spannable) {
        this.f14868c = spannable;
    }

    public r(CharSequence charSequence) {
        this.f14868c = new SpannableString(charSequence);
    }

    public static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    public final void a() {
        Spannable spannable = this.f14868c;
        if (!this.f14867a && c().a(spannable)) {
            this.f14868c = new SpannableString(spannable);
        }
        this.f14867a = true;
    }

    public Spannable b() {
        return this.f14868c;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i9) {
        return this.f14868c.charAt(i9);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f14868c);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f14868c);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f14868c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f14868c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f14868c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i9, int i10, Class cls) {
        return this.f14868c.getSpans(i9, i10, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f14868c.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i9, int i10, Class cls) {
        return this.f14868c.nextSpanTransition(i9, i10, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f14868c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i9, int i10, int i11) {
        a();
        this.f14868c.setSpan(obj, i9, i10, i11);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i9, int i10) {
        return this.f14868c.subSequence(i9, i10);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f14868c.toString();
    }
}
