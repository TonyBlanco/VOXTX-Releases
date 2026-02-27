package O8;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class b extends RuntimeException {
    public b(String str, String[] strArr, String[] strArr2) {
        super("Could not find '" + str + "'. Looked for: " + Arrays.toString(strArr) + ", but only found: " + Arrays.toString(strArr2) + InstructionFileId.DOT);
    }
}
