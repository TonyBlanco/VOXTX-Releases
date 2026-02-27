package org.apache.commons.logging.impl;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleLog implements Log, Serializable {
    protected static final String DEFAULT_DATE_TIME_FORMAT = "yyyy/MM/dd HH:mm:ss:SSS zzz";
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_DEBUG = 2;
    public static final int LOG_LEVEL_ERROR = 5;
    public static final int LOG_LEVEL_FATAL = 6;
    public static final int LOG_LEVEL_INFO = 3;
    public static final int LOG_LEVEL_OFF = 7;
    public static final int LOG_LEVEL_TRACE = 1;
    public static final int LOG_LEVEL_WARN = 4;
    static /* synthetic */ Class class$java$lang$Thread = null;
    static /* synthetic */ Class class$org$apache$commons$logging$impl$SimpleLog = null;
    protected static DateFormat dateFormatter = null;
    protected static volatile String dateTimeFormat = null;
    private static final long serialVersionUID = 136942970684951178L;
    protected static volatile boolean showDateTime = false;
    protected static volatile boolean showLogName = false;
    protected static volatile boolean showShortName = false;
    protected static final Properties simpleLogProps;
    protected static final String systemPrefix = "org.apache.commons.logging.simplelog.";
    protected volatile int currentLogLevel;
    protected volatile String logName;
    private volatile String shortLogName = null;

    static {
        Properties properties = new Properties();
        simpleLogProps = properties;
        showLogName = false;
        showShortName = true;
        showDateTime = false;
        dateTimeFormat = DEFAULT_DATE_TIME_FORMAT;
        dateFormatter = null;
        InputStream resourceAsStream = getResourceAsStream("simplelog.properties");
        if (resourceAsStream != null) {
            try {
                properties.load(resourceAsStream);
                resourceAsStream.close();
            } catch (IOException unused) {
            }
        }
        showLogName = getBooleanProperty("org.apache.commons.logging.simplelog.showlogname", showLogName);
        showShortName = getBooleanProperty("org.apache.commons.logging.simplelog.showShortLogname", showShortName);
        showDateTime = getBooleanProperty("org.apache.commons.logging.simplelog.showdatetime", showDateTime);
        if (showDateTime) {
            dateTimeFormat = getStringProperty("org.apache.commons.logging.simplelog.dateTimeFormat", dateTimeFormat);
            try {
                dateFormatter = new SimpleDateFormat(dateTimeFormat);
            } catch (IllegalArgumentException unused2) {
                dateTimeFormat = DEFAULT_DATE_TIME_FORMAT;
                dateFormatter = new SimpleDateFormat(dateTimeFormat);
            }
        }
    }

    public SimpleLog(String str) {
        int i9;
        this.logName = null;
        this.logName = str;
        setLevel(3);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("org.apache.commons.logging.simplelog.log.");
        stringBuffer.append(this.logName);
        String stringProperty = getStringProperty(stringBuffer.toString());
        String strValueOf = String.valueOf(str);
        while (true) {
            int iLastIndexOf = strValueOf.lastIndexOf(InstructionFileId.DOT);
            if (stringProperty != null || iLastIndexOf <= -1) {
                break;
            }
            str = str.substring(0, iLastIndexOf);
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("org.apache.commons.logging.simplelog.log.");
            stringBuffer2.append(str);
            stringProperty = getStringProperty(stringBuffer2.toString());
            strValueOf = String.valueOf(str);
        }
        stringProperty = stringProperty == null ? getStringProperty("org.apache.commons.logging.simplelog.defaultlog") : stringProperty;
        if ("all".equalsIgnoreCase(stringProperty)) {
            setLevel(0);
            return;
        }
        if ("trace".equalsIgnoreCase(stringProperty)) {
            i9 = 1;
        } else if ("debug".equalsIgnoreCase(stringProperty)) {
            i9 = 2;
        } else {
            if ("info".equalsIgnoreCase(stringProperty)) {
                setLevel(3);
                return;
            }
            if ("warn".equalsIgnoreCase(stringProperty)) {
                i9 = 4;
            } else if ("error".equalsIgnoreCase(stringProperty)) {
                i9 = 5;
            } else if ("fatal".equalsIgnoreCase(stringProperty)) {
                i9 = 6;
            } else if (!"off".equalsIgnoreCase(stringProperty)) {
                return;
            } else {
                i9 = 7;
            }
        }
        setLevel(i9);
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e9) {
            throw new NoClassDefFoundError(e9.getMessage());
        }
    }

    private static boolean getBooleanProperty(String str, boolean z9) {
        String stringProperty = getStringProperty(str);
        return stringProperty == null ? z9 : "true".equalsIgnoreCase(stringProperty);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ClassLoader getContextClassLoader() {
        ClassLoader classLoader = null;
        try {
            Class clsClass$ = class$java$lang$Thread;
            if (clsClass$ == null) {
                clsClass$ = class$("java.lang.Thread");
                class$java$lang$Thread = clsClass$;
            }
            try {
                classLoader = (ClassLoader) clsClass$.getMethod("getContextClassLoader", null).invoke(Thread.currentThread(), null);
            } catch (InvocationTargetException e9) {
                if (!(e9.getTargetException() instanceof SecurityException)) {
                    throw new LogConfigurationException("Unexpected InvocationTargetException", e9.getTargetException());
                }
            }
        } catch (IllegalAccessException | NoSuchMethodException unused) {
        }
        if (classLoader != null) {
            return classLoader;
        }
        Class clsClass$2 = class$org$apache$commons$logging$impl$SimpleLog;
        if (clsClass$2 == null) {
            clsClass$2 = class$("org.apache.commons.logging.impl.SimpleLog");
            class$org$apache$commons$logging$impl$SimpleLog = clsClass$2;
        }
        return clsClass$2.getClassLoader();
    }

    private static InputStream getResourceAsStream(final String str) {
        return (InputStream) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.impl.SimpleLog.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                ClassLoader contextClassLoader = SimpleLog.getContextClassLoader();
                return contextClassLoader != null ? contextClassLoader.getResourceAsStream(str) : ClassLoader.getSystemResourceAsStream(str);
            }
        });
    }

    private static String getStringProperty(String str) {
        String property;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        return property == null ? simpleLogProps.getProperty(str) : property;
    }

    private static String getStringProperty(String str, String str2) {
        String stringProperty = getStringProperty(str);
        return stringProperty == null ? str2 : stringProperty;
    }

    @Override // org.apache.commons.logging.Log
    public final void debug(Object obj) {
        if (isLevelEnabled(2)) {
            log(2, obj, null);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void debug(Object obj, Throwable th) {
        if (isLevelEnabled(2)) {
            log(2, obj, th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void error(Object obj) {
        if (isLevelEnabled(5)) {
            log(5, obj, null);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void error(Object obj, Throwable th) {
        if (isLevelEnabled(5)) {
            log(5, obj, th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void fatal(Object obj) {
        if (isLevelEnabled(6)) {
            log(6, obj, null);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void fatal(Object obj, Throwable th) {
        if (isLevelEnabled(6)) {
            log(6, obj, th);
        }
    }

    public int getLevel() {
        return this.currentLogLevel;
    }

    @Override // org.apache.commons.logging.Log
    public final void info(Object obj) {
        if (isLevelEnabled(3)) {
            log(3, obj, null);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void info(Object obj, Throwable th) {
        if (isLevelEnabled(3)) {
            log(3, obj, th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isDebugEnabled() {
        return isLevelEnabled(2);
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isErrorEnabled() {
        return isLevelEnabled(5);
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isFatalEnabled() {
        return isLevelEnabled(6);
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isInfoEnabled() {
        return isLevelEnabled(3);
    }

    public boolean isLevelEnabled(int i9) {
        return i9 >= this.currentLogLevel;
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isTraceEnabled() {
        return isLevelEnabled(1);
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isWarnEnabled() {
        return isLevelEnabled(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void log(int r5, java.lang.Object r6, java.lang.Throwable r7) {
        /*
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            boolean r1 = org.apache.commons.logging.impl.SimpleLog.showDateTime
            if (r1 == 0) goto L24
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.text.DateFormat r2 = org.apache.commons.logging.impl.SimpleLog.dateFormatter
            monitor-enter(r2)
            java.text.DateFormat r3 = org.apache.commons.logging.impl.SimpleLog.dateFormatter     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = r3.format(r1)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            goto L24
        L21:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r5
        L24:
            switch(r5) {
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L3d
        L28:
            java.lang.String r5 = "[FATAL] "
        L2a:
            r0.append(r5)
            goto L3d
        L2e:
            java.lang.String r5 = "[ERROR] "
            goto L2a
        L31:
            java.lang.String r5 = "[WARN] "
            goto L2a
        L34:
            java.lang.String r5 = "[INFO] "
            goto L2a
        L37:
            java.lang.String r5 = "[DEBUG] "
            goto L2a
        L3a:
            java.lang.String r5 = "[TRACE] "
            goto L2a
        L3d:
            boolean r5 = org.apache.commons.logging.impl.SimpleLog.showShortName
            if (r5 == 0) goto L72
            java.lang.String r5 = r4.shortLogName
            if (r5 != 0) goto L63
            java.lang.String r5 = r4.logName
            java.lang.String r1 = r4.logName
            java.lang.String r2 = "."
            int r1 = r1.lastIndexOf(r2)
            int r1 = r1 + 1
            java.lang.String r5 = r5.substring(r1)
            java.lang.String r1 = "/"
            int r1 = r5.lastIndexOf(r1)
            int r1 = r1 + 1
            java.lang.String r5 = r5.substring(r1)
            r4.shortLogName = r5
        L63:
            java.lang.String r5 = r4.shortLogName
        L65:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.append(r5)
            java.lang.String r5 = " - "
            r0.append(r5)
            goto L79
        L72:
            boolean r5 = org.apache.commons.logging.impl.SimpleLog.showLogName
            if (r5 == 0) goto L79
            java.lang.String r5 = r4.logName
            goto L65
        L79:
            java.lang.String r5 = java.lang.String.valueOf(r6)
            r0.append(r5)
            if (r7 == 0) goto Lac
            java.lang.String r5 = " <"
            r0.append(r5)
            java.lang.String r5 = r7.toString()
            r0.append(r5)
            java.lang.String r5 = ">"
            r0.append(r5)
            java.io.StringWriter r5 = new java.io.StringWriter
            r6 = 1024(0x400, float:1.435E-42)
            r5.<init>(r6)
            java.io.PrintWriter r6 = new java.io.PrintWriter
            r6.<init>(r5)
            r7.printStackTrace(r6)
            r6.close()
            java.lang.String r5 = r5.toString()
            r0.append(r5)
        Lac:
            r4.write(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.impl.SimpleLog.log(int, java.lang.Object, java.lang.Throwable):void");
    }

    public void setLevel(int i9) {
        this.currentLogLevel = i9;
    }

    @Override // org.apache.commons.logging.Log
    public final void trace(Object obj) {
        if (isLevelEnabled(1)) {
            log(1, obj, null);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void trace(Object obj, Throwable th) {
        if (isLevelEnabled(1)) {
            log(1, obj, th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void warn(Object obj) {
        if (isLevelEnabled(4)) {
            log(4, obj, null);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void warn(Object obj, Throwable th) {
        if (isLevelEnabled(4)) {
            log(4, obj, th);
        }
    }

    public void write(StringBuffer stringBuffer) {
        System.err.println(stringBuffer.toString());
    }
}
