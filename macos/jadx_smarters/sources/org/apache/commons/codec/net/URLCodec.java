package org.apache.commons.codec.net;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.StringUtils;

/* JADX INFO: loaded from: classes4.dex */
public class URLCodec implements BinaryEncoder, BinaryDecoder, StringEncoder, StringDecoder {
    protected static final byte ESCAPE_CHAR = 37;
    static final int RADIX = 16;
    protected static final BitSet WWW_FORM_URL = new BitSet(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);

    @Deprecated
    protected String charset;

    static {
        for (int i9 = 97; i9 <= 122; i9++) {
            WWW_FORM_URL.set(i9);
        }
        for (int i10 = 65; i10 <= 90; i10++) {
            WWW_FORM_URL.set(i10);
        }
        for (int i11 = 48; i11 <= 57; i11++) {
            WWW_FORM_URL.set(i11);
        }
        BitSet bitSet = WWW_FORM_URL;
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
        bitSet.set(32);
    }

    public URLCodec() {
        this("UTF-8");
    }

    public URLCodec(String str) {
        this.charset = str;
    }

    public static final byte[] decodeUrl(byte[] bArr) throws DecoderException {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i9 = 0;
        while (i9 < bArr.length) {
            byte b9 = bArr[i9];
            if (b9 == 43) {
                b9 = 32;
            } else {
                if (b9 == 37) {
                    try {
                        int iDigit16 = Utils.digit16(bArr[i9 + 1]);
                        i9 += 2;
                        byteArrayOutputStream.write((char) ((iDigit16 << 4) + Utils.digit16(bArr[i9])));
                    } catch (ArrayIndexOutOfBoundsException e9) {
                        throw new DecoderException("Invalid URL encoding: ", e9);
                    }
                }
                i9++;
            }
            byteArrayOutputStream.write(b9);
            i9++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static final byte[] encodeUrl(BitSet bitSet, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bitSet == null) {
            bitSet = WWW_FORM_URL;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            int upperCase = bArr[i9];
            if (upperCase < 0) {
                upperCase += JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
            }
            if (!bitSet.get(upperCase)) {
                byteArrayOutputStream.write(37);
                char upperCase2 = Character.toUpperCase(Character.forDigit((upperCase >> 4) & 15, 16));
                upperCase = Character.toUpperCase(Character.forDigit(upperCase & 15, 16));
                byteArrayOutputStream.write(upperCase2);
            } else if (upperCase == 32) {
                upperCase = 43;
            }
            byteArrayOutputStream.write(upperCase);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be URL decoded");
    }

    @Override // org.apache.commons.codec.StringDecoder
    public String decode(String str) throws DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return decode(str, getDefaultCharset());
        } catch (UnsupportedEncodingException e9) {
            throw new DecoderException(e9.getMessage(), e9);
        }
    }

    public String decode(String str, String str2) throws DecoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return new String(decode(StringUtils.getBytesUsAscii(str)), str2);
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) throws DecoderException {
        return decodeUrl(bArr);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be URL encoded");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) throws EncoderException {
        if (str == null) {
            return null;
        }
        try {
            return encode(str, getDefaultCharset());
        } catch (UnsupportedEncodingException e9) {
            throw new EncoderException(e9.getMessage(), e9);
        }
    }

    public String encode(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return StringUtils.newStringUsAscii(encode(str.getBytes(str2)));
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return encodeUrl(WWW_FORM_URL, bArr);
    }

    public String getDefaultCharset() {
        return this.charset;
    }

    @Deprecated
    public String getEncoding() {
        return this.charset;
    }
}
