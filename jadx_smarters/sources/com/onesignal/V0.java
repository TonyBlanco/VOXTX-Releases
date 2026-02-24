package com.onesignal;

import android.content.Context;
import android.net.Uri;
import java.security.SecureRandom;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q0 f38607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f38608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f38609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f38612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f38613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f38614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Uri f38615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f38616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f38617k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Uri f38618l;

    public V0(Context context) {
        this.f38608b = context;
    }

    public V0(Context context, Q0 q02, JSONObject jSONObject) {
        this.f38608b = context;
        this.f38609c = jSONObject;
        r(q02);
    }

    public V0(Context context, JSONObject jSONObject) {
        this(context, new Q0(jSONObject), jSONObject);
    }

    public Integer a() {
        return Integer.valueOf(this.f38607a.d());
    }

    public String b() {
        return F1.e0(this.f38609c);
    }

    public CharSequence c() {
        CharSequence charSequence = this.f38613g;
        return charSequence != null ? charSequence : this.f38607a.e();
    }

    public Context d() {
        return this.f38608b;
    }

    public JSONObject e() {
        return this.f38609c;
    }

    public Q0 f() {
        return this.f38607a;
    }

    public Uri g() {
        return this.f38618l;
    }

    public Integer h() {
        return this.f38616j;
    }

    public Uri i() {
        return this.f38615i;
    }

    public Long j() {
        return this.f38612f;
    }

    public CharSequence k() {
        CharSequence charSequence = this.f38614h;
        return charSequence != null ? charSequence : this.f38607a.k();
    }

    public boolean l() {
        this.f38607a.f();
        return false;
    }

    public boolean m() {
        return this.f38611e;
    }

    public boolean n() {
        return this.f38610d;
    }

    public void o(Context context) {
        this.f38608b = context;
    }

    public void p(boolean z9) {
        this.f38611e = z9;
    }

    public void q(JSONObject jSONObject) {
        this.f38609c = jSONObject;
    }

    public void r(Q0 q02) {
        if (q02 != null && !q02.m()) {
            Q0 q03 = this.f38607a;
            q02.r((q03 == null || !q03.m()) ? new SecureRandom().nextInt() : this.f38607a.d());
        }
        this.f38607a = q02;
    }

    public void s(Integer num) {
        this.f38617k = num;
    }

    public void t(Uri uri) {
        this.f38618l = uri;
    }

    public String toString() {
        return "OSNotificationGenerationJob{jsonPayload=" + this.f38609c + ", isRestoring=" + this.f38610d + ", isNotificationToDisplay=" + this.f38611e + ", shownTimeStamp=" + this.f38612f + ", overriddenBodyFromExtender=" + ((Object) this.f38613g) + ", overriddenTitleFromExtender=" + ((Object) this.f38614h) + ", overriddenSound=" + this.f38615i + ", overriddenFlags=" + this.f38616j + ", orgFlags=" + this.f38617k + ", orgSound=" + this.f38618l + ", notification=" + this.f38607a + '}';
    }

    public void u(CharSequence charSequence) {
        this.f38613g = charSequence;
    }

    public void v(Integer num) {
        this.f38616j = num;
    }

    public void w(Uri uri) {
        this.f38615i = uri;
    }

    public void x(CharSequence charSequence) {
        this.f38614h = charSequence;
    }

    public void y(boolean z9) {
        this.f38610d = z9;
    }

    public void z(Long l9) {
        this.f38612f = l9;
    }
}
