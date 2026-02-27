package n1;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import okhttp3.ResponseBody;
import p1.e;

/* JADX INFO: renamed from: n1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2244b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f44885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter f44886b;

    public C2244b(Gson gson, TypeAdapter typeAdapter) {
        this.f44885a = gson;
        this.f44886b = typeAdapter;
    }

    @Override // p1.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object convert(ResponseBody responseBody) {
        try {
            return this.f44886b.read2(this.f44885a.newJsonReader(responseBody.charStream()));
        } finally {
            responseBody.close();
        }
    }
}
