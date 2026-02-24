package f7;

import android.content.Context;
import android.provider.MediaStore;
import o0.AbstractC2302b;
import org.achartengine.ChartFactory;

/* JADX INFO: renamed from: f7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1782a extends AbstractC2302b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String[] f40857w = {"_id", ChartFactory.TITLE, "_data", "_size", "date_added", "duration"};

    public C1782a(Context context) {
        super(context);
        L(f40857w);
        P(MediaStore.Files.getContentUri("external"));
        O("date_added DESC");
        M("mime_type=? or mime_type=? or mime_type=?");
        N(new String[]{"audio/mpeg", "audio/mp3", "audio/x-ms-wma"});
    }
}
