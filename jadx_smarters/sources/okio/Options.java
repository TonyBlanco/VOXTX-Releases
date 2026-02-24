package okio;

import java.io.IOException;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.g;
import l8.AbstractC2208c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Options extends AbstractC2208c implements RandomAccess {
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final ByteString[] byteStrings;

    @NotNull
    private final int[] trie;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final void buildTrieRecursive(long j9, Buffer buffer, int i9, List<? extends ByteString> list, int i10, int i11, List<Integer> list2) throws IOException {
            int i12;
            int i13;
            int i14;
            int i15;
            Buffer buffer2;
            int i16 = i9;
            if (!(i10 < i11)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i17 = i10; i17 < i11; i17++) {
                if (!(list.get(i17).size() >= i16)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString byteString = list.get(i10);
            ByteString byteString2 = list.get(i11 - 1);
            if (i16 == byteString.size()) {
                int iIntValue = list2.get(i10).intValue();
                int i18 = i10 + 1;
                ByteString byteString3 = list.get(i18);
                i12 = i18;
                i13 = iIntValue;
                byteString = byteString3;
            } else {
                i12 = i10;
                i13 = -1;
            }
            if (byteString.getByte(i16) == byteString2.getByte(i16)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i19 = 0;
                for (int i20 = i16; i20 < iMin && byteString.getByte(i20) == byteString2.getByte(i20); i20++) {
                    i19++;
                }
                long intCount = j9 + getIntCount(buffer) + ((long) 2) + ((long) i19) + 1;
                buffer.writeInt(-i19);
                buffer.writeInt(i13);
                int i21 = i16 + i19;
                while (i16 < i21) {
                    buffer.writeInt(byteString.getByte(i16) & 255);
                    i16++;
                }
                if (i12 + 1 == i11) {
                    if (!(i21 == list.get(i12).size())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    buffer.writeInt(list2.get(i12).intValue());
                    return;
                } else {
                    Buffer buffer3 = new Buffer();
                    buffer.writeInt(((int) (getIntCount(buffer3) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer3, i21, list, i12, i11, list2);
                    buffer.writeAll(buffer3);
                    return;
                }
            }
            int i22 = 1;
            for (int i23 = i12 + 1; i23 < i11; i23++) {
                if (list.get(i23 - 1).getByte(i16) != list.get(i23).getByte(i16)) {
                    i22++;
                }
            }
            long intCount2 = j9 + getIntCount(buffer) + ((long) 2) + ((long) (i22 * 2));
            buffer.writeInt(i22);
            buffer.writeInt(i13);
            for (int i24 = i12; i24 < i11; i24++) {
                byte b9 = list.get(i24).getByte(i16);
                if (i24 == i12 || b9 != list.get(i24 - 1).getByte(i16)) {
                    buffer.writeInt(b9 & 255);
                }
            }
            Buffer buffer4 = new Buffer();
            while (i12 < i11) {
                byte b10 = list.get(i12).getByte(i16);
                int i25 = i12 + 1;
                int i26 = i25;
                while (true) {
                    if (i26 >= i11) {
                        i14 = i11;
                        break;
                    } else {
                        if (b10 != list.get(i26).getByte(i16)) {
                            i14 = i26;
                            break;
                        }
                        i26++;
                    }
                }
                if (i25 == i14 && i16 + 1 == list.get(i12).size()) {
                    buffer.writeInt(list2.get(i12).intValue());
                    i15 = i14;
                    buffer2 = buffer4;
                } else {
                    buffer.writeInt(((int) (intCount2 + getIntCount(buffer4))) * (-1));
                    i15 = i14;
                    buffer2 = buffer4;
                    buildTrieRecursive(intCount2, buffer4, i16 + 1, list, i12, i14, list2);
                }
                buffer4 = buffer2;
                i12 = i15;
            }
            buffer.writeAll(buffer4);
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j9, Buffer buffer, int i9, List list, int i10, int i11, List list2, int i12, Object obj) throws IOException {
            companion.buildTrieRecursive((i12 & 1) != 0 ? 0L : j9, buffer, (i12 & 4) != 0 ? 0 : i9, list, (i12 & 16) != 0 ? 0 : i10, (i12 & 32) != 0 ? list.size() : i11, list2);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / ((long) 4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x00e7, code lost:
        
            continue;
         */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okio.Options of(@org.jetbrains.annotations.NotNull okio.ByteString... r17) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 320
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.Options.Companion.of(okio.ByteString[]):okio.Options");
        }
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, g gVar) {
        this(byteStringArr, iArr);
    }

    @NotNull
    public static final Options of(@NotNull ByteString... byteStringArr) {
        return Companion.of(byteStringArr);
    }

    @Override // l8.AbstractC2206a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Object) byteString);
    }

    @Override // l8.AbstractC2208c, java.util.List
    @NotNull
    public ByteString get(int i9) {
        return this.byteStrings[i9];
    }

    @NotNull
    public final ByteString[] getByteStrings$okio() {
        return this.byteStrings;
    }

    @Override // l8.AbstractC2206a
    public int getSize() {
        return this.byteStrings.length;
    }

    @NotNull
    public final int[] getTrie$okio() {
        return this.trie;
    }

    @Override // l8.AbstractC2208c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Object) byteString);
    }

    @Override // l8.AbstractC2208c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Object) byteString);
    }
}
