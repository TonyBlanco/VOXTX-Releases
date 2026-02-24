package P7;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.amazonaws.regions.ServiceAbbreviations;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public enum b {
    IAM(ServiceAbbreviations.IAM),
    NOTIFICATION(TransferService.INTENT_KEY_NOTIFICATION);


    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private final String nameValue;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final b a(String str) {
            b bVar = null;
            if (str != null) {
                b[] bVarArrValues = b.values();
                int length = bVarArrValues.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    b bVar2 = bVarArrValues[length];
                    if (bVar2.equalsName(str)) {
                        bVar = bVar2;
                        break;
                    }
                }
            }
            return bVar == null ? b.NOTIFICATION : bVar;
        }
    }

    b(String str) {
        this.nameValue = str;
    }

    @NotNull
    public static final b fromString(@Nullable String str) {
        return Companion.a(str);
    }

    public final boolean equalsName(@NotNull String otherName) {
        l.e(otherName, "otherName");
        return l.a(this.nameValue, otherName);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.nameValue;
    }
}
