package D;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    public static class a {
        public static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(N n9) {
            throw null;
        }

        public static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    public static RemoteInput a(N n9) {
        return a.b(n9);
    }

    public static RemoteInput[] b(N[] nArr) {
        if (nArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[nArr.length];
        for (int i9 = 0; i9 < nArr.length; i9++) {
            N n9 = nArr[i9];
            remoteInputArr[i9] = a(null);
        }
        return remoteInputArr;
    }
}
