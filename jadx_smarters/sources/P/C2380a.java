package p;

import android.os.Bundle;

/* JADX INFO: renamed from: p.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2380a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f46160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f46161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f46162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f46163d;

    /* JADX INFO: renamed from: p.a$a, reason: collision with other inner class name */
    public static final class C0407a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f46164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f46165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f46166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f46167d;

        public C2380a a() {
            return new C2380a(this.f46164a, this.f46165b, this.f46166c, this.f46167d);
        }
    }

    public C2380a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f46160a = num;
        this.f46161b = num2;
        this.f46162c = num3;
        this.f46163d = num4;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f46160a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f46161b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f46162c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f46163d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
