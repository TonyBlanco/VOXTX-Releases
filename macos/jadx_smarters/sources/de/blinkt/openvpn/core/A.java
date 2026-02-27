package de.blinkt.openvpn.core;

import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static A f39949d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f39950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f39951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f39952c;

    public A(UUID uuid) {
        this.f39950a = uuid;
    }

    public static String a(UUID uuid, boolean z9) {
        String str = b(uuid).f39952c;
        if (z9) {
            b(uuid).f39952c = null;
        }
        return str;
    }

    public static A b(UUID uuid) {
        A a9 = f39949d;
        if (a9 == null || !a9.f39950a.equals(uuid)) {
            f39949d = new A(uuid);
        }
        return f39949d;
    }

    public static String c(UUID uuid, boolean z9) {
        String str = b(uuid).f39951b;
        if (z9) {
            b(uuid).f39951b = null;
        }
        return str;
    }

    public static void d(String str, int i9, String str2) {
        A aB = b(UUID.fromString(str));
        if (i9 == 2) {
            aB.f39951b = str2;
        } else {
            if (i9 != 3) {
                return;
            }
            aB.f39952c = str2;
        }
    }
}
