package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.leanback.widget.picker.a;
import com.facebook.ads.AdError;
import g0.l;
import j0.AbstractC2072a;
import j0.C2073b;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class DatePicker extends AbstractC2072a {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int[] f15739H = {5, 2, 1};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f15740A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final DateFormat f15741B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public a.C0177a f15742C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Calendar f15743D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Calendar f15744E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Calendar f15745F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Calendar f15746G;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f15747u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C2073b f15748v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C2073b f15749w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C2073b f15750x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f15751y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f15752z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f15753a;

        public a(boolean z9) {
            this.f15753a = z9;
        }

        @Override // java.lang.Runnable
        public void run() {
            DatePicker.this.u(this.f15753a);
        }
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DatePicker(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15741B = new SimpleDateFormat("MM/dd/yyyy");
        q();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f41081K);
        String string = typedArrayObtainStyledAttributes.getString(l.f41082L);
        String string2 = typedArrayObtainStyledAttributes.getString(l.f41083M);
        this.f15746G.clear();
        if (TextUtils.isEmpty(string) || !o(string, this.f15746G)) {
            this.f15746G.set(1900, 0, 1);
        }
        this.f15743D.setTimeInMillis(this.f15746G.getTimeInMillis());
        this.f15746G.clear();
        if (TextUtils.isEmpty(string2) || !o(string2, this.f15746G)) {
            this.f15746G.set(AdError.BROKEN_MEDIA_ERROR_CODE, 0, 1);
        }
        this.f15744E.setTimeInMillis(this.f15746G.getTimeInMillis());
        String string3 = typedArrayObtainStyledAttributes.getString(l.f41084N);
        setDatePickerFormat(TextUtils.isEmpty(string3) ? new String(android.text.format.DateFormat.getDateFormatOrder(context)) : string3);
    }

    public static boolean n(char c9, char[] cArr) {
        for (char c10 : cArr) {
            if (c9 == c10) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(C2073b c2073b, int i9) {
        if (i9 == c2073b.d()) {
            return false;
        }
        c2073b.h(i9);
        return true;
    }

    public static boolean s(C2073b c2073b, int i9) {
        if (i9 == c2073b.e()) {
            return false;
        }
        c2073b.i(i9);
        return true;
    }

    @Override // j0.AbstractC2072a
    public final void c(int i9, int i10) {
        this.f15746G.setTimeInMillis(this.f15745F.getTimeInMillis());
        int iB = a(i9).b();
        if (i9 == this.f15752z) {
            this.f15746G.add(5, i10 - iB);
        } else if (i9 == this.f15751y) {
            this.f15746G.add(2, i10 - iB);
        } else {
            if (i9 != this.f15740A) {
                throw new IllegalArgumentException();
            }
            this.f15746G.add(1, i10 - iB);
        }
        p(this.f15746G.get(1), this.f15746G.get(2), this.f15746G.get(5));
        t(false);
    }

    public long getDate() {
        return this.f15745F.getTimeInMillis();
    }

    public String getDatePickerFormat() {
        return this.f15747u;
    }

    public long getMaxDate() {
        return this.f15744E.getTimeInMillis();
    }

    public long getMinDate() {
        return this.f15743D.getTimeInMillis();
    }

    public List l() {
        String strM = m(this.f15747u);
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'Y', 'y', 'M', 'm', 'D', 'd'};
        boolean z9 = false;
        char c9 = 0;
        for (int i9 = 0; i9 < strM.length(); i9++) {
            char cCharAt = strM.charAt(i9);
            if (cCharAt != ' ') {
                if (cCharAt != '\'') {
                    if (z9 || !n(cCharAt, cArr)) {
                        sb.append(cCharAt);
                    } else if (cCharAt != c9) {
                        arrayList.add(sb.toString());
                        sb.setLength(0);
                    }
                    c9 = cCharAt;
                } else if (z9) {
                    z9 = false;
                } else {
                    sb.setLength(0);
                    z9 = true;
                }
            }
        }
        arrayList.add(sb.toString());
        return arrayList;
    }

    public String m(String str) {
        String localizedPattern;
        if (androidx.leanback.widget.picker.a.f15755a) {
            localizedPattern = android.text.format.DateFormat.getBestDateTimePattern(this.f15742C.f15756a, str);
        } else {
            DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(getContext());
            localizedPattern = dateFormat instanceof SimpleDateFormat ? ((SimpleDateFormat) dateFormat).toLocalizedPattern() : "MM/dd/yyyy";
        }
        return TextUtils.isEmpty(localizedPattern) ? "MM/dd/yyyy" : localizedPattern;
    }

    public final boolean o(String str, Calendar calendar) {
        try {
            calendar.setTime(this.f15741B.parse(str));
            return true;
        } catch (ParseException unused) {
            Log.w("DatePicker", "Date: " + str + " not in format: MM/dd/yyyy");
            return false;
        }
    }

    public final void p(int i9, int i10, int i11) {
        Calendar calendar;
        Calendar calendar2;
        this.f15745F.set(i9, i10, i11);
        if (this.f15745F.before(this.f15743D)) {
            calendar = this.f15745F;
            calendar2 = this.f15743D;
        } else {
            if (!this.f15745F.after(this.f15744E)) {
                return;
            }
            calendar = this.f15745F;
            calendar2 = this.f15744E;
        }
        calendar.setTimeInMillis(calendar2.getTimeInMillis());
    }

    public final void q() {
        a.C0177a c0177aC = androidx.leanback.widget.picker.a.c(Locale.getDefault(), getContext().getResources());
        this.f15742C = c0177aC;
        this.f15746G = androidx.leanback.widget.picker.a.b(this.f15746G, c0177aC.f15756a);
        this.f15743D = androidx.leanback.widget.picker.a.b(this.f15743D, this.f15742C.f15756a);
        this.f15744E = androidx.leanback.widget.picker.a.b(this.f15744E, this.f15742C.f15756a);
        this.f15745F = androidx.leanback.widget.picker.a.b(this.f15745F, this.f15742C.f15756a);
        C2073b c2073b = this.f15748v;
        if (c2073b != null) {
            c2073b.j(this.f15742C.f15757b);
            d(this.f15751y, this.f15748v);
        }
    }

    public void setDatePickerFormat(String str) {
        if (TextUtils.isEmpty(str)) {
            str = new String(android.text.format.DateFormat.getDateFormatOrder(getContext()));
        }
        if (TextUtils.equals(this.f15747u, str)) {
            return;
        }
        this.f15747u = str;
        List listL = l();
        if (listL.size() != str.length() + 1) {
            throw new IllegalStateException("Separators size: " + listL.size() + " must equal the size of datePickerFormat: " + str.length() + " + 1");
        }
        setSeparators(listL);
        this.f15749w = null;
        this.f15748v = null;
        this.f15750x = null;
        this.f15751y = -1;
        this.f15752z = -1;
        this.f15740A = -1;
        String upperCase = str.toUpperCase();
        ArrayList arrayList = new ArrayList(3);
        for (int i9 = 0; i9 < upperCase.length(); i9++) {
            char cCharAt = upperCase.charAt(i9);
            if (cCharAt == 'D') {
                if (this.f15749w != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                C2073b c2073b = new C2073b();
                this.f15749w = c2073b;
                arrayList.add(c2073b);
                this.f15749w.g("%02d");
                this.f15752z = i9;
            } else if (cCharAt != 'M') {
                if (cCharAt != 'Y') {
                    throw new IllegalArgumentException("datePicker format error");
                }
                if (this.f15750x != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                C2073b c2073b2 = new C2073b();
                this.f15750x = c2073b2;
                arrayList.add(c2073b2);
                this.f15740A = i9;
                this.f15750x.g("%d");
            } else {
                if (this.f15748v != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                C2073b c2073b3 = new C2073b();
                this.f15748v = c2073b3;
                arrayList.add(c2073b3);
                this.f15748v.j(this.f15742C.f15757b);
                this.f15751y = i9;
            }
        }
        setColumns(arrayList);
        t(false);
    }

    public void setMaxDate(long j9) {
        this.f15746G.setTimeInMillis(j9);
        if (this.f15746G.get(1) != this.f15744E.get(1) || this.f15746G.get(6) == this.f15744E.get(6)) {
            this.f15744E.setTimeInMillis(j9);
            if (this.f15745F.after(this.f15744E)) {
                this.f15745F.setTimeInMillis(this.f15744E.getTimeInMillis());
            }
            t(false);
        }
    }

    public void setMinDate(long j9) {
        this.f15746G.setTimeInMillis(j9);
        if (this.f15746G.get(1) != this.f15743D.get(1) || this.f15746G.get(6) == this.f15743D.get(6)) {
            this.f15743D.setTimeInMillis(j9);
            if (this.f15745F.before(this.f15743D)) {
                this.f15745F.setTimeInMillis(this.f15743D.getTimeInMillis());
            }
            t(false);
        }
    }

    public final void t(boolean z9) {
        post(new a(z9));
    }

    public void u(boolean z9) {
        int[] iArr = {this.f15752z, this.f15751y, this.f15740A};
        boolean z10 = true;
        boolean z11 = true;
        for (int length = f15739H.length - 1; length >= 0; length--) {
            int i9 = iArr[length];
            if (i9 >= 0) {
                int i10 = f15739H[length];
                C2073b c2073bA = a(i9);
                boolean zS = s(c2073bA, z10 ? this.f15743D.get(i10) : this.f15745F.getActualMinimum(i10)) | r(c2073bA, z11 ? this.f15744E.get(i10) : this.f15745F.getActualMaximum(i10));
                z10 &= this.f15745F.get(i10) == this.f15743D.get(i10);
                z11 &= this.f15745F.get(i10) == this.f15744E.get(i10);
                if (zS) {
                    d(iArr[length], c2073bA);
                }
                e(iArr[length], this.f15745F.get(i10), z9);
            }
        }
    }
}
