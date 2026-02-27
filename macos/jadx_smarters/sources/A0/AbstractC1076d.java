package a0;

import androidx.datastore.preferences.protobuf.C1140z;
import java.io.InputStream;
import kotlin.jvm.internal.l;

/* JADX INFO: renamed from: a0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1076d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11439a = new a(null);

    /* JADX INFO: renamed from: a0.d$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final f a(InputStream input) throws Y.a {
            l.e(input, "input");
            try {
                f fVarO = f.O(input);
                l.d(fVarO, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return fVarO;
            } catch (C1140z e9) {
                throw new Y.a("Unable to parse preferences proto.", e9);
            }
        }
    }
}
