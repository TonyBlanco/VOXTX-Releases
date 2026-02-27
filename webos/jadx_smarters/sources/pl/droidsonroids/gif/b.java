package pl.droidsonroids.gif;

import com.facebook.ads.AdError;
import java.util.Locale;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.HttpStatus;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes4.dex */
public enum b {
    NO_ERROR(0, "No error"),
    OPEN_FAILED(101, "Failed to open given input"),
    READ_FAILED(HttpStatus.SC_PROCESSING, "Failed to read from given input"),
    NOT_GIF_FILE(103, "Data is not in GIF format"),
    NO_SCRN_DSCR(104, "No screen descriptor detected"),
    NO_IMAG_DSCR(105, "No image descriptor detected"),
    NO_COLOR_MAP(106, "Neither global nor local color map found"),
    WRONG_RECORD(107, "Wrong record type detected"),
    DATA_TOO_BIG(108, "Number of pixels bigger than width * height"),
    NOT_ENOUGH_MEM(109, "Failed to allocate required memory"),
    CLOSE_FAILED(IjkMediaMeta.FF_PROFILE_H264_HIGH_10, "Failed to close given input"),
    NOT_READABLE(111, "Given file was not opened for read"),
    IMAGE_DEFECT(112, "Image is defective, decoding aborted"),
    EOF_TOO_SOON(113, "Image EOF detected before image complete"),
    NO_FRAMES(1000, "No frames found, at least one frame required"),
    INVALID_SCR_DIMS(1001, "Invalid screen size, dimensions must be positive"),
    INVALID_IMG_DIMS(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, "Invalid image size, dimensions must be positive"),
    IMG_NOT_CONFINED(1003, "Image size exceeds screen size"),
    REWIND_FAILED(1004, "Input source rewind failed, animation stopped"),
    INVALID_BYTE_BUFFER(WebSocketProtocol.CLOSE_NO_STATUS_CODE, "Invalid and/or indirect byte buffer specified"),
    UNKNOWN(-1, "Unknown error");

    public final String description;
    int errorCode;

    b(int i9, String str) {
        this.errorCode = i9;
        this.description = str;
    }

    public static b fromCode(int i9) {
        for (b bVar : values()) {
            if (bVar.errorCode == i9) {
                return bVar;
            }
        }
        b bVar2 = UNKNOWN;
        bVar2.errorCode = i9;
        return bVar2;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getFormattedDescription() {
        return String.format(Locale.ENGLISH, "GifError %d: %s", Integer.valueOf(this.errorCode), this.description);
    }
}
