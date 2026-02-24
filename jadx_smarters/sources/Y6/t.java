package Y6;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f10725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f10726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Intent f10729g;

    public t(Intent intent) {
        this(null, null, null, null, null, null, intent);
    }

    public t(String str, String str2, byte[] bArr, Integer num, String str3, String str4, Intent intent) {
        this.f10723a = str;
        this.f10724b = str2;
        this.f10725c = bArr;
        this.f10726d = num;
        this.f10727e = str3;
        this.f10728f = str4;
        this.f10729g = intent;
    }

    public static t c(int i9, Intent intent) {
        if (i9 != -1) {
            return new t(intent);
        }
        String stringExtra = intent.getStringExtra("SCAN_RESULT");
        String stringExtra2 = intent.getStringExtra("SCAN_RESULT_FORMAT");
        byte[] byteArrayExtra = intent.getByteArrayExtra("SCAN_RESULT_BYTES");
        int intExtra = intent.getIntExtra("SCAN_RESULT_ORIENTATION", Integer.MIN_VALUE);
        return new t(stringExtra, stringExtra2, byteArrayExtra, intExtra == Integer.MIN_VALUE ? null : Integer.valueOf(intExtra), intent.getStringExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL"), intent.getStringExtra("SCAN_RESULT_IMAGE_PATH"), intent);
    }

    public String a() {
        return this.f10723a;
    }

    public Intent b() {
        return this.f10729g;
    }

    public String toString() {
        byte[] bArr = this.f10725c;
        return "Format: " + this.f10724b + "\nContents: " + this.f10723a + "\nRaw bytes: (" + (bArr == null ? 0 : bArr.length) + " bytes)\nOrientation: " + this.f10726d + "\nEC level: " + this.f10727e + "\nBarcode image: " + this.f10728f + "\nOriginal intent: " + this.f10729g + '\n';
    }
}
