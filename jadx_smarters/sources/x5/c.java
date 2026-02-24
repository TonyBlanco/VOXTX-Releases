package x5;

import com.amazonaws.services.s3.internal.Constants;
import java.lang.reflect.Type;
import r5.C2678g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2678g f51957a = C2678g.g(", ").i(Constants.NULL_VERSION_ID);

    public static String a(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
