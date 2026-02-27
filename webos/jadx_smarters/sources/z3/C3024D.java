package z3;

import android.net.Uri;
import b4.I;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: z3.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3024D implements I.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I.a f52661a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f52662c;

    public C3024D(I.a aVar, List list) {
        this.f52661a = aVar;
        this.f52662c = list;
    }

    @Override // b4.I.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3023C a(Uri uri, InputStream inputStream) {
        InterfaceC3023C interfaceC3023C = (InterfaceC3023C) this.f52661a.a(uri, inputStream);
        List list = this.f52662c;
        return (list == null || list.isEmpty()) ? interfaceC3023C : (InterfaceC3023C) interfaceC3023C.a(this.f52662c);
    }
}
