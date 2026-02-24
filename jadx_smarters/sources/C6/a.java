package C6;

import android.hardware.Camera;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1167a = "C6.a";

    public static int a(int i9) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(f1167a, "No cameras!");
            return -1;
        }
        boolean z9 = i9 >= 0;
        if (!z9) {
            i9 = 0;
            while (i9 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i9, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i9++;
            }
        }
        return i9 < numberOfCameras ? i9 : z9 ? -1 : 0;
    }

    public static Camera b(int i9) {
        int iA = a(i9);
        if (iA == -1) {
            return null;
        }
        return Camera.open(iA);
    }
}
