package P7;

import E8.n;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public enum c {
    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;


    @NotNull
    public static final a Companion = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final c a(String str) {
            c cVar = null;
            if (str != null) {
                c[] cVarArrValues = c.values();
                int length = cVarArrValues.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    c cVar2 = cVarArrValues[length];
                    if (n.o(cVar2.name(), str, true)) {
                        cVar = cVar2;
                        break;
                    }
                }
            }
            return cVar == null ? c.UNATTRIBUTED : cVar;
        }
    }

    @NotNull
    public static final c fromString(@Nullable String str) {
        return Companion.a(str);
    }

    public final boolean isAttributed() {
        return isDirect() || isIndirect();
    }

    public final boolean isDirect() {
        return this == DIRECT;
    }

    public final boolean isDisabled() {
        return this == DISABLED;
    }

    public final boolean isIndirect() {
        return this == INDIRECT;
    }

    public final boolean isUnattributed() {
        return this == UNATTRIBUTED;
    }
}
