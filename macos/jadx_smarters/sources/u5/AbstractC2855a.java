package u5;

import java.io.File;
import r5.m;
import t5.InterfaceC2794a;

/* JADX INFO: renamed from: u5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2855a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2794a f51212a = new C0467a();

    /* JADX INFO: renamed from: u5.a$a, reason: collision with other inner class name */
    public class C0467a implements InterfaceC2794a {
    }

    public static String a(String str) {
        m.k(str);
        String name = new File(str).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? "" : name.substring(iLastIndexOf + 1);
    }
}
