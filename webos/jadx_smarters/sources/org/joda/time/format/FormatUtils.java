package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes4.dex */
public class FormatUtils {
    private static final double LOG_10 = Math.log(10.0d);

    private FormatUtils() {
    }

    public static void appendPaddedInteger(Appendable appendable, int i9, int i10) throws IOException {
        if (i9 < 0) {
            appendable.append('-');
            if (i9 == Integer.MIN_VALUE) {
                while (i10 > 10) {
                    appendable.append('0');
                    i10--;
                }
                appendable.append("2147483648");
                return;
            }
            i9 = -i9;
        }
        if (i9 < 10) {
            while (i10 > 1) {
                appendable.append('0');
                i10--;
            }
        } else {
            if (i9 >= 100) {
                int iLog = i9 < 1000 ? 3 : i9 < 10000 ? 4 : ((int) (Math.log(i9) / LOG_10)) + 1;
                while (i10 > iLog) {
                    appendable.append('0');
                    i10--;
                }
                appendable.append(Integer.toString(i9));
                return;
            }
            while (i10 > 2) {
                appendable.append('0');
                i10--;
            }
            int i11 = ((i9 + 1) * 13421772) >> 27;
            appendable.append((char) (i11 + 48));
            i9 = (i9 - (i11 << 3)) - (i11 << 1);
        }
        appendable.append((char) (i9 + 48));
    }

    public static void appendPaddedInteger(Appendable appendable, long j9, int i9) throws IOException {
        int i10 = (int) j9;
        if (i10 == j9) {
            appendPaddedInteger(appendable, i10, i9);
            return;
        }
        if (i9 > 19) {
            if (j9 < 0) {
                appendable.append('-');
                if (j9 == Long.MIN_VALUE) {
                    while (i9 > 19) {
                        appendable.append('0');
                        i9--;
                    }
                    appendable.append("9223372036854775808");
                    return;
                }
                j9 = -j9;
            }
            int iLog = ((int) (Math.log(j9) / LOG_10)) + 1;
            while (i9 > iLog) {
                appendable.append('0');
                i9--;
            }
        }
        appendable.append(Long.toString(j9));
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, int i9, int i10) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, i9, i10);
        } catch (IOException unused) {
        }
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, long j9, int i9) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, j9, i9);
        } catch (IOException unused) {
        }
    }

    public static void appendUnpaddedInteger(Appendable appendable, int i9) throws IOException {
        if (i9 < 0) {
            appendable.append('-');
            if (i9 == Integer.MIN_VALUE) {
                appendable.append("2147483648");
                return;
            }
            i9 = -i9;
        }
        if (i9 >= 10) {
            if (i9 >= 100) {
                appendable.append(Integer.toString(i9));
                return;
            } else {
                int i10 = ((i9 + 1) * 13421772) >> 27;
                appendable.append((char) (i10 + 48));
                i9 = (i9 - (i10 << 3)) - (i10 << 1);
            }
        }
        appendable.append((char) (i9 + 48));
    }

    public static void appendUnpaddedInteger(Appendable appendable, long j9) throws IOException {
        int i9 = (int) j9;
        if (i9 == j9) {
            appendUnpaddedInteger(appendable, i9);
        } else {
            appendable.append(Long.toString(j9));
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, int i9) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, i9);
        } catch (IOException unused) {
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, long j9) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, j9);
        } catch (IOException unused) {
        }
    }

    public static int calculateDigitCount(long j9) {
        if (j9 < 0) {
            if (j9 != Long.MIN_VALUE) {
                return calculateDigitCount(-j9) + 1;
            }
            return 20;
        }
        if (j9 < 10) {
            return 1;
        }
        if (j9 < 100) {
            return 2;
        }
        if (j9 < 1000) {
            return 3;
        }
        if (j9 < 10000) {
            return 4;
        }
        return 1 + ((int) (Math.log(j9) / LOG_10));
    }

    public static String createErrorMessage(String str, int i9) {
        StringBuilder sb;
        String strConcat = str.length() <= i9 + 35 ? str : str.substring(0, i9 + 32).concat("...");
        if (i9 <= 0) {
            sb = new StringBuilder();
            sb.append("Invalid format: \"");
            sb.append(strConcat);
        } else {
            if (i9 >= str.length()) {
                sb = new StringBuilder();
                sb.append("Invalid format: \"");
                sb.append(strConcat);
                sb.append("\" is too short");
                return sb.toString();
            }
            sb = new StringBuilder();
            sb.append("Invalid format: \"");
            sb.append(strConcat);
            sb.append("\" is malformed at \"");
            sb.append(strConcat.substring(i9));
        }
        sb.append(TokenParser.DQUOTE);
        return sb.toString();
    }

    public static int parseTwoDigits(CharSequence charSequence, int i9) {
        int iCharAt = charSequence.charAt(i9) - '0';
        return (((iCharAt << 3) + (iCharAt << 1)) + charSequence.charAt(i9 + 1)) - 48;
    }

    public static void writePaddedInteger(Writer writer, int i9, int i10) throws IOException {
        if (i9 < 0) {
            writer.write(45);
            if (i9 == Integer.MIN_VALUE) {
                while (i10 > 10) {
                    writer.write(48);
                    i10--;
                }
                writer.write("2147483648");
                return;
            }
            i9 = -i9;
        }
        if (i9 < 10) {
            while (i10 > 1) {
                writer.write(48);
                i10--;
            }
        } else {
            if (i9 >= 100) {
                int iLog = i9 < 1000 ? 3 : i9 < 10000 ? 4 : ((int) (Math.log(i9) / LOG_10)) + 1;
                while (i10 > iLog) {
                    writer.write(48);
                    i10--;
                }
                writer.write(Integer.toString(i9));
                return;
            }
            while (i10 > 2) {
                writer.write(48);
                i10--;
            }
            int i11 = ((i9 + 1) * 13421772) >> 27;
            writer.write(i11 + 48);
            i9 = (i9 - (i11 << 3)) - (i11 << 1);
        }
        writer.write(i9 + 48);
    }

    public static void writePaddedInteger(Writer writer, long j9, int i9) throws IOException {
        int i10 = (int) j9;
        if (i10 == j9) {
            writePaddedInteger(writer, i10, i9);
            return;
        }
        if (i9 > 19) {
            if (j9 < 0) {
                writer.write(45);
                if (j9 == Long.MIN_VALUE) {
                    while (i9 > 19) {
                        writer.write(48);
                        i9--;
                    }
                    writer.write("9223372036854775808");
                    return;
                }
                j9 = -j9;
            }
            int iLog = ((int) (Math.log(j9) / LOG_10)) + 1;
            while (i9 > iLog) {
                writer.write(48);
                i9--;
            }
        }
        writer.write(Long.toString(j9));
    }

    public static void writeUnpaddedInteger(Writer writer, int i9) throws IOException {
        if (i9 < 0) {
            writer.write(45);
            if (i9 == Integer.MIN_VALUE) {
                writer.write("2147483648");
                return;
            }
            i9 = -i9;
        }
        if (i9 >= 10) {
            if (i9 >= 100) {
                writer.write(Integer.toString(i9));
                return;
            } else {
                int i10 = ((i9 + 1) * 13421772) >> 27;
                writer.write(i10 + 48);
                i9 = (i9 - (i10 << 3)) - (i10 << 1);
            }
        }
        writer.write(i9 + 48);
    }

    public static void writeUnpaddedInteger(Writer writer, long j9) throws IOException {
        int i9 = (int) j9;
        if (i9 == j9) {
            writeUnpaddedInteger(writer, i9);
        } else {
            writer.write(Long.toString(j9));
        }
    }
}
