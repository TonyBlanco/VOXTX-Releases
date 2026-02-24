package n1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import p1.e;

/* JADX INFO: renamed from: n1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2243a extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f44884a;

    public C2243a(Gson gson) {
        this.f44884a = gson;
    }

    @Override // p1.e.a
    public e a(Type type) {
        return new C2244b(this.f44884a, this.f44884a.getAdapter(TypeToken.get(type)));
    }
}
