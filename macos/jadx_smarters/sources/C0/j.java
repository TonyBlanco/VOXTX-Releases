package C0;

import G0.c;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class j implements c.InterfaceC0032c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.InterfaceC0032c f939c;

    public j(String str, File file, c.InterfaceC0032c interfaceC0032c) {
        this.f937a = str;
        this.f938b = file;
        this.f939c = interfaceC0032c;
    }

    @Override // G0.c.InterfaceC0032c
    public G0.c a(c.b bVar) {
        return new i(bVar.f2137a, this.f937a, this.f938b, bVar.f2139c.f2136a, this.f939c.a(bVar));
    }
}
