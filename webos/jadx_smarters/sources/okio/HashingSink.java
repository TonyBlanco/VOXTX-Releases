package okio;

import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import k8.q;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class HashingSink extends ForwardingSink {
    public static final Companion Companion = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        @NotNull
        public final HashingSink hmacSha1(@NotNull Sink sink, @NotNull ByteString key) {
            l.e(sink, "sink");
            l.e(key, "key");
            return new HashingSink(sink, key, Constants.HMAC_SHA1_ALGORITHM);
        }

        @NotNull
        public final HashingSink hmacSha256(@NotNull Sink sink, @NotNull ByteString key) {
            l.e(sink, "sink");
            l.e(key, "key");
            return new HashingSink(sink, key, "HmacSHA256");
        }

        @NotNull
        public final HashingSink hmacSha512(@NotNull Sink sink, @NotNull ByteString key) {
            l.e(sink, "sink");
            l.e(key, "key");
            return new HashingSink(sink, key, "HmacSHA512");
        }

        @NotNull
        public final HashingSink md5(@NotNull Sink sink) {
            l.e(sink, "sink");
            return new HashingSink(sink, MessageDigestAlgorithms.MD5);
        }

        @NotNull
        public final HashingSink sha1(@NotNull Sink sink) {
            l.e(sink, "sink");
            return new HashingSink(sink, MessageDigestAlgorithms.SHA_1);
        }

        @NotNull
        public final HashingSink sha256(@NotNull Sink sink) {
            l.e(sink, "sink");
            return new HashingSink(sink, MessageDigestAlgorithms.SHA_256);
        }

        @NotNull
        public final HashingSink sha512(@NotNull Sink sink) {
            l.e(sink, "sink");
            return new HashingSink(sink, MessageDigestAlgorithms.SHA_512);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(@NotNull Sink sink, @NotNull String algorithm) {
        super(sink);
        l.e(sink, "sink");
        l.e(algorithm, "algorithm");
        this.messageDigest = MessageDigest.getInstance(algorithm);
        this.mac = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(@NotNull Sink sink, @NotNull ByteString key, @NotNull String algorithm) throws NoSuchAlgorithmException {
        super(sink);
        l.e(sink, "sink");
        l.e(key, "key");
        l.e(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            q qVar = q.f43674a;
            this.mac = mac;
            this.messageDigest = null;
        } catch (InvalidKeyException e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    @NotNull
    public static final HashingSink hmacSha1(@NotNull Sink sink, @NotNull ByteString byteString) {
        return Companion.hmacSha1(sink, byteString);
    }

    @NotNull
    public static final HashingSink hmacSha256(@NotNull Sink sink, @NotNull ByteString byteString) {
        return Companion.hmacSha256(sink, byteString);
    }

    @NotNull
    public static final HashingSink hmacSha512(@NotNull Sink sink, @NotNull ByteString byteString) {
        return Companion.hmacSha512(sink, byteString);
    }

    @NotNull
    public static final HashingSink md5(@NotNull Sink sink) {
        return Companion.md5(sink);
    }

    @NotNull
    public static final HashingSink sha1(@NotNull Sink sink) {
        return Companion.sha1(sink);
    }

    @NotNull
    public static final HashingSink sha256(@NotNull Sink sink) {
        return Companion.sha256(sink);
    }

    @NotNull
    public static final HashingSink sha512(@NotNull Sink sink) {
        return Companion.sha512(sink);
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m179deprecated_hash() {
        return hash();
    }

    @NotNull
    public final ByteString hash() {
        byte[] result;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            result = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            l.b(mac);
            result = mac.doFinal();
        }
        l.d(result, "result");
        return new ByteString(result);
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(@NotNull Buffer source, long j9) throws IOException {
        l.e(source, "source");
        Util.checkOffsetAndCount(source.size(), 0L, j9);
        Segment segment = source.head;
        l.b(segment);
        long j10 = 0;
        while (j10 < j9) {
            int iMin = (int) Math.min(j9 - j10, segment.limit - segment.pos);
            MessageDigest messageDigest = this.messageDigest;
            if (messageDigest != null) {
                messageDigest.update(segment.data, segment.pos, iMin);
            } else {
                Mac mac = this.mac;
                l.b(mac);
                mac.update(segment.data, segment.pos, iMin);
            }
            j10 += (long) iMin;
            segment = segment.next;
            l.b(segment);
        }
        super.write(source, j9);
    }
}
