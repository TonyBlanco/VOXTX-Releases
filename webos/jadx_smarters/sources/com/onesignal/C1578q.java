package com.onesignal;

import android.os.PersistableBundle;

/* JADX INFO: renamed from: com.onesignal.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1578q implements InterfaceC1566m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PersistableBundle f38804a = new PersistableBundle();

    @Override // com.onesignal.InterfaceC1566m
    public void a(String str, String str2) {
        this.f38804a.putString(str, str2);
    }

    @Override // com.onesignal.InterfaceC1566m
    public boolean b(String str, boolean z9) {
        return this.f38804a.getBoolean(str, z9);
    }

    @Override // com.onesignal.InterfaceC1566m
    public Long c(String str) {
        return Long.valueOf(this.f38804a.getLong(str));
    }

    @Override // com.onesignal.InterfaceC1566m
    public Integer d(String str) {
        return Integer.valueOf(this.f38804a.getInt(str));
    }

    @Override // com.onesignal.InterfaceC1566m
    public void e(String str, Long l9) {
        this.f38804a.putLong(str, l9.longValue());
    }

    @Override // com.onesignal.InterfaceC1566m
    public boolean g(String str) {
        return this.f38804a.containsKey(str);
    }

    @Override // com.onesignal.InterfaceC1566m
    public String getString(String str) {
        return this.f38804a.getString(str);
    }

    @Override // com.onesignal.InterfaceC1566m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public PersistableBundle f() {
        return this.f38804a;
    }
}
