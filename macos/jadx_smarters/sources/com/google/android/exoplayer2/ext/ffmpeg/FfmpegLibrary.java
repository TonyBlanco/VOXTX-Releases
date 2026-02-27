package com.google.android.exoplayer2.ext.ffmpeg;

import O2.AbstractC0928w0;
import d4.AbstractC1681B;
import d4.AbstractC1706x;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class FfmpegLibrary {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1706x f25333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f25334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f25335c;

    public class a extends AbstractC1706x {
        public a(String... strArr) {
            super(strArr);
        }

        @Override // d4.AbstractC1706x
        public void b(String str) {
            System.loadLibrary(str);
        }
    }

    static {
        AbstractC0928w0.a("goog.exo.ffmpeg");
        f25333a = new a("ffmpegJNI");
        f25335c = -1;
    }

    public static String a(String str) {
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/eac3":
                return "eac3";
            case "audio/amr-wb":
                return "amrwb";
            case "audio/vnd.dts":
            case "audio/vnd.dts.hd":
                return "dca";
            case "audio/vorbis":
                return "vorbis";
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/mpeg":
                return "mp3";
            case "audio/mp4a-latm":
                return "aac";
            case "audio/ac3":
                return "ac3";
            case "audio/3gpp":
                return "amrnb";
            case "audio/alac":
                return "alac";
            case "audio/flac":
                return "flac";
            case "audio/opus":
                return "opus";
            case "audio/true-hd":
                return "truehd";
            case "audio/g711-alaw":
                return "pcm_alaw";
            case "audio/g711-mlaw":
                return "pcm_mulaw";
            default:
                return null;
        }
    }

    public static int b() {
        if (!d()) {
            return -1;
        }
        if (f25335c == -1) {
            f25335c = ffmpegGetInputBufferPaddingSize();
        }
        return f25335c;
    }

    public static String c() {
        if (!d()) {
            return null;
        }
        if (f25334b == null) {
            f25334b = ffmpegGetVersion();
        }
        return f25334b;
    }

    public static boolean d() {
        return f25333a.a();
    }

    public static boolean e(String str) {
        String strA;
        if (!d() || (strA = a(str)) == null) {
            return false;
        }
        if (ffmpegHasDecoder(strA)) {
            return true;
        }
        AbstractC1681B.j("FfmpegLibrary", "No " + strA + " decoder available. Check the FFmpeg build configuration.");
        return false;
    }

    private static native int ffmpegGetInputBufferPaddingSize();

    private static native String ffmpegGetVersion();

    private static native boolean ffmpegHasDecoder(String str);
}
