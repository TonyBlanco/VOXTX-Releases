package org.apache.commons.logging.impl;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Hashtable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: loaded from: classes4.dex */
public class LogFactoryImpl extends LogFactory {
    public static final String ALLOW_FLAWED_CONTEXT_PROPERTY = "org.apache.commons.logging.Log.allowFlawedContext";
    public static final String ALLOW_FLAWED_DISCOVERY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedDiscovery";
    public static final String ALLOW_FLAWED_HIERARCHY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedHierarchy";
    public static final String LOG_PROPERTY = "org.apache.commons.logging.Log";
    protected static final String LOG_PROPERTY_OLD = "org.apache.commons.logging.log";
    private static final String PKG_IMPL = "org.apache.commons.logging.impl.";
    private static final int PKG_LEN = 32;
    static /* synthetic */ Class class$java$lang$String;
    static /* synthetic */ Class class$org$apache$commons$logging$Log;
    static /* synthetic */ Class class$org$apache$commons$logging$LogFactory;
    static /* synthetic */ Class class$org$apache$commons$logging$impl$LogFactoryImpl;
    private boolean allowFlawedContext;
    private boolean allowFlawedDiscovery;
    private boolean allowFlawedHierarchy;
    private String diagnosticPrefix;
    private String logClassName;
    protected Class[] logConstructorSignature;
    protected Method logMethod;
    protected Class[] logMethodSignature;
    private static final String LOGGING_IMPL_LOG4J_LOGGER = "org.apache.commons.logging.impl.Log4JLogger";
    private static final String LOGGING_IMPL_JDK14_LOGGER = "org.apache.commons.logging.impl.Jdk14Logger";
    private static final String LOGGING_IMPL_LUMBERJACK_LOGGER = "org.apache.commons.logging.impl.Jdk13LumberjackLogger";
    private static final String LOGGING_IMPL_SIMPLE_LOGGER = "org.apache.commons.logging.impl.SimpleLog";
    private static final String[] classesToDiscover = {LOGGING_IMPL_LOG4J_LOGGER, LOGGING_IMPL_JDK14_LOGGER, LOGGING_IMPL_LUMBERJACK_LOGGER, LOGGING_IMPL_SIMPLE_LOGGER};
    private boolean useTCCL = true;
    protected Hashtable attributes = new Hashtable();
    protected Hashtable instances = new Hashtable();
    protected Constructor logConstructor = null;

    public LogFactoryImpl() {
        Class clsClass$ = class$java$lang$String;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.String");
            class$java$lang$String = clsClass$;
        }
        this.logConstructorSignature = new Class[]{clsClass$};
        this.logMethod = null;
        Class clsClass$2 = class$org$apache$commons$logging$LogFactory;
        if (clsClass$2 == null) {
            clsClass$2 = class$(LogFactory.FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = clsClass$2;
        }
        this.logMethodSignature = new Class[]{clsClass$2};
        initDiagnostics();
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Instance created.");
        }
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e9) {
            throw new NoClassDefFoundError(e9.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0162 A[LOOP:0: B:6:0x0037->B:51:0x0162, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0157 A[EDGE_INSN: B:77:0x0157->B:47:0x0157 BREAK  A[LOOP:0: B:6:0x0037->B:51:0x0162], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.apache.commons.logging.Log createLogFromClass(java.lang.String r17, java.lang.String r18, boolean r19) throws org.apache.commons.logging.LogConfigurationException {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.impl.LogFactoryImpl.createLogFromClass(java.lang.String, java.lang.String, boolean):org.apache.commons.logging.Log");
    }

    private Log discoverLogImplementation(String str) throws LogConfigurationException {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Discovering a Log implementation...");
        }
        initConfiguration();
        String strFindUserSpecifiedLogClassName = findUserSpecifiedLogClassName();
        if (strFindUserSpecifiedLogClassName == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("No user-specified Log implementation; performing discovery using the standard supported logging implementations...");
            }
            Log logCreateLogFromClass = null;
            int i9 = 0;
            while (true) {
                String[] strArr = classesToDiscover;
                if (i9 >= strArr.length || logCreateLogFromClass != null) {
                    break;
                }
                logCreateLogFromClass = createLogFromClass(strArr[i9], str, true);
                i9++;
            }
            if (logCreateLogFromClass != null) {
                return logCreateLogFromClass;
            }
            throw new LogConfigurationException("No suitable Log implementation");
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Attempting to load user-specified log class '");
            stringBuffer.append(strFindUserSpecifiedLogClassName);
            stringBuffer.append("'...");
            logDiagnostic(stringBuffer.toString());
        }
        Log logCreateLogFromClass2 = createLogFromClass(strFindUserSpecifiedLogClassName, str, true);
        if (logCreateLogFromClass2 != null) {
            return logCreateLogFromClass2;
        }
        StringBuffer stringBuffer2 = new StringBuffer("User-specified log class '");
        stringBuffer2.append(strFindUserSpecifiedLogClassName);
        stringBuffer2.append("' cannot be found or is not useable.");
        informUponSimilarName(stringBuffer2, strFindUserSpecifiedLogClassName, LOGGING_IMPL_LOG4J_LOGGER);
        informUponSimilarName(stringBuffer2, strFindUserSpecifiedLogClassName, LOGGING_IMPL_JDK14_LOGGER);
        informUponSimilarName(stringBuffer2, strFindUserSpecifiedLogClassName, LOGGING_IMPL_LUMBERJACK_LOGGER);
        informUponSimilarName(stringBuffer2, strFindUserSpecifiedLogClassName, LOGGING_IMPL_SIMPLE_LOGGER);
        throw new LogConfigurationException(stringBuffer2.toString());
    }

    private String findUserSpecifiedLogClassName() {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Trying to get log class from attribute 'org.apache.commons.logging.Log'");
        }
        String systemProperty = (String) getAttribute(LOG_PROPERTY);
        if (systemProperty == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from attribute 'org.apache.commons.logging.log'");
            }
            systemProperty = (String) getAttribute(LOG_PROPERTY_OLD);
        }
        if (systemProperty == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from system property 'org.apache.commons.logging.Log'");
            }
            try {
                systemProperty = getSystemProperty(LOG_PROPERTY, null);
            } catch (SecurityException e9) {
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("No access allowed to system property 'org.apache.commons.logging.Log' - ");
                    stringBuffer.append(e9.getMessage());
                    logDiagnostic(stringBuffer.toString());
                }
            }
        }
        if (systemProperty == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from system property 'org.apache.commons.logging.log'");
            }
            try {
                systemProperty = getSystemProperty(LOG_PROPERTY_OLD, null);
            } catch (SecurityException e10) {
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("No access allowed to system property 'org.apache.commons.logging.log' - ");
                    stringBuffer2.append(e10.getMessage());
                    logDiagnostic(stringBuffer2.toString());
                }
            }
        }
        return systemProperty != null ? systemProperty.trim() : systemProperty;
    }

    private ClassLoader getBaseClassLoader() throws LogConfigurationException {
        Class clsClass$ = class$org$apache$commons$logging$impl$LogFactoryImpl;
        if (clsClass$ == null) {
            clsClass$ = class$(LogFactory.FACTORY_DEFAULT);
            class$org$apache$commons$logging$impl$LogFactoryImpl = clsClass$;
        }
        ClassLoader classLoader = getClassLoader(clsClass$);
        if (!this.useTCCL) {
            return classLoader;
        }
        ClassLoader contextClassLoaderInternal = getContextClassLoaderInternal();
        ClassLoader lowestClassLoader = getLowestClassLoader(contextClassLoaderInternal, classLoader);
        if (lowestClassLoader == null) {
            if (!this.allowFlawedContext) {
                throw new LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
            }
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[WARNING] the context classloader is not part of a parent-child relationship with the classloader that loaded LogFactoryImpl.");
            }
            return contextClassLoaderInternal;
        }
        if (lowestClassLoader != contextClassLoaderInternal) {
            if (!this.allowFlawedContext) {
                throw new LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
            }
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Warning: the context classloader is an ancestor of the classloader that loaded LogFactoryImpl; it should be the same or a descendant. The application using commons-logging should ensure the context classloader is used correctly.");
            }
        }
        return lowestClassLoader;
    }

    private boolean getBooleanConfiguration(String str, boolean z9) {
        String configurationValue = getConfigurationValue(str);
        return configurationValue == null ? z9 : Boolean.valueOf(configurationValue).booleanValue();
    }

    public static ClassLoader getClassLoader(Class cls) {
        return LogFactory.getClassLoader(cls);
    }

    private String getConfigurationValue(String str) {
        String systemProperty;
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[ENV] Trying to get configuration for item ");
            stringBuffer.append(str);
            logDiagnostic(stringBuffer.toString());
        }
        Object attribute = getAttribute(str);
        if (attribute != null) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[ENV] Found LogFactory attribute [");
                stringBuffer2.append(attribute);
                stringBuffer2.append("] for ");
                stringBuffer2.append(str);
                logDiagnostic(stringBuffer2.toString());
            }
            return attribute.toString();
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("[ENV] No LogFactory attribute found for ");
            stringBuffer3.append(str);
            logDiagnostic(stringBuffer3.toString());
        }
        try {
            systemProperty = getSystemProperty(str, null);
        } catch (SecurityException unused) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[ENV] Security prevented reading system property ");
                stringBuffer4.append(str);
                logDiagnostic(stringBuffer4.toString());
            }
        }
        if (systemProperty != null) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[ENV] Found system property [");
                stringBuffer5.append(systemProperty);
                stringBuffer5.append("] for ");
                stringBuffer5.append(str);
                logDiagnostic(stringBuffer5.toString());
            }
            return systemProperty;
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("[ENV] No system property found for property ");
            stringBuffer6.append(str);
            logDiagnostic(stringBuffer6.toString());
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append("[ENV] No configuration defined for item ");
            stringBuffer7.append(str);
            logDiagnostic(stringBuffer7.toString());
        }
        return null;
    }

    public static ClassLoader getContextClassLoader() throws LogConfigurationException {
        return LogFactory.getContextClassLoader();
    }

    private static ClassLoader getContextClassLoaderInternal() throws LogConfigurationException {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.impl.LogFactoryImpl.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                return LogFactory.directGetContextClassLoader();
            }
        });
    }

    private ClassLoader getLowestClassLoader(ClassLoader classLoader, ClassLoader classLoader2) {
        if (classLoader == null) {
            return classLoader2;
        }
        if (classLoader2 == null) {
            return classLoader;
        }
        ClassLoader parentClassLoader = classLoader;
        while (parentClassLoader != null) {
            if (parentClassLoader == classLoader2) {
                return classLoader;
            }
            parentClassLoader = getParentClassLoader(parentClassLoader);
        }
        ClassLoader parentClassLoader2 = classLoader2;
        while (parentClassLoader2 != null) {
            if (parentClassLoader2 == classLoader) {
                return classLoader2;
            }
            parentClassLoader2 = getParentClassLoader(parentClassLoader2);
        }
        return null;
    }

    private ClassLoader getParentClassLoader(final ClassLoader classLoader) {
        try {
            return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.impl.LogFactoryImpl.3
                @Override // java.security.PrivilegedAction
                public Object run() {
                    return classLoader.getParent();
                }
            });
        } catch (SecurityException unused) {
            logDiagnostic("[SECURITY] Unable to obtain parent classloader");
            return null;
        }
    }

    private static String getSystemProperty(final String str, final String str2) throws SecurityException {
        return (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.impl.LogFactoryImpl.2
            @Override // java.security.PrivilegedAction
            public Object run() {
                return System.getProperty(str, str2);
            }
        });
    }

    private void handleFlawedDiscovery(String str, ClassLoader classLoader, Throwable th) {
        Throwable targetException;
        Throwable exception;
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Could not instantiate Log '");
            stringBuffer.append(str);
            stringBuffer.append("' -- ");
            stringBuffer.append(th.getClass().getName());
            stringBuffer.append(": ");
            stringBuffer.append(th.getLocalizedMessage());
            logDiagnostic(stringBuffer.toString());
            if ((th instanceof InvocationTargetException) && (targetException = ((InvocationTargetException) th).getTargetException()) != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("... InvocationTargetException: ");
                stringBuffer2.append(targetException.getClass().getName());
                stringBuffer2.append(": ");
                stringBuffer2.append(targetException.getLocalizedMessage());
                logDiagnostic(stringBuffer2.toString());
                if ((targetException instanceof ExceptionInInitializerError) && (exception = ((ExceptionInInitializerError) targetException).getException()) != null) {
                    StringWriter stringWriter = new StringWriter();
                    exception.printStackTrace(new PrintWriter((Writer) stringWriter, true));
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("... ExceptionInInitializerError: ");
                    stringBuffer3.append(stringWriter.toString());
                    logDiagnostic(stringBuffer3.toString());
                }
            }
        }
        if (!this.allowFlawedDiscovery) {
            throw new LogConfigurationException(th);
        }
    }

    private void handleFlawedHierarchy(ClassLoader classLoader, Class cls) throws LogConfigurationException {
        StringBuffer stringBuffer;
        Class clsClass$ = class$org$apache$commons$logging$Log;
        if (clsClass$ == null) {
            clsClass$ = class$(LOG_PROPERTY);
            class$org$apache$commons$logging$Log = clsClass$;
        }
        String name = clsClass$.getName();
        Class<?>[] interfaces = cls.getInterfaces();
        int i9 = 0;
        while (true) {
            if (i9 < interfaces.length) {
                if (name.equals(interfaces[i9].getName())) {
                    if (isDiagnosticsEnabled()) {
                        try {
                            Class clsClass$2 = class$org$apache$commons$logging$Log;
                            if (clsClass$2 == null) {
                                clsClass$2 = class$(LOG_PROPERTY);
                                class$org$apache$commons$logging$Log = clsClass$2;
                            }
                            ClassLoader classLoader2 = getClassLoader(clsClass$2);
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("Class '");
                            stringBuffer2.append(cls.getName());
                            stringBuffer2.append("' was found in classloader ");
                            stringBuffer2.append(LogFactory.objectId(classLoader));
                            stringBuffer2.append(". It is bound to a Log interface which is not");
                            stringBuffer2.append(" the one loaded from classloader ");
                            stringBuffer2.append(LogFactory.objectId(classLoader2));
                            logDiagnostic(stringBuffer2.toString());
                        } catch (Throwable th) {
                            LogFactory.handleThrowable(th);
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("Error while trying to output diagnostics about bad class '");
                            stringBuffer3.append(cls);
                            stringBuffer3.append("'");
                            logDiagnostic(stringBuffer3.toString());
                        }
                    }
                    if (!this.allowFlawedHierarchy) {
                        StringBuffer stringBuffer4 = new StringBuffer();
                        stringBuffer4.append("Terminating logging for this context ");
                        stringBuffer4.append("due to bad log hierarchy. ");
                        stringBuffer4.append("You have more than one version of '");
                        Class clsClass$3 = class$org$apache$commons$logging$Log;
                        if (clsClass$3 == null) {
                            clsClass$3 = class$(LOG_PROPERTY);
                            class$org$apache$commons$logging$Log = clsClass$3;
                        }
                        stringBuffer4.append(clsClass$3.getName());
                        stringBuffer4.append("' visible.");
                        if (isDiagnosticsEnabled()) {
                            logDiagnostic(stringBuffer4.toString());
                        }
                        throw new LogConfigurationException(stringBuffer4.toString());
                    }
                    if (!isDiagnosticsEnabled()) {
                        return;
                    }
                    stringBuffer = new StringBuffer();
                    stringBuffer.append("Warning: bad log hierarchy. ");
                    stringBuffer.append("You have more than one version of '");
                    Class clsClass$4 = class$org$apache$commons$logging$Log;
                    if (clsClass$4 == null) {
                        clsClass$4 = class$(LOG_PROPERTY);
                        class$org$apache$commons$logging$Log = clsClass$4;
                    }
                    stringBuffer.append(clsClass$4.getName());
                    stringBuffer.append("' visible.");
                } else {
                    i9++;
                }
            } else {
                if (!this.allowFlawedDiscovery) {
                    StringBuffer stringBuffer5 = new StringBuffer();
                    stringBuffer5.append("Terminating logging for this context. ");
                    stringBuffer5.append("Log class '");
                    stringBuffer5.append(cls.getName());
                    stringBuffer5.append("' does not implement the Log interface.");
                    if (isDiagnosticsEnabled()) {
                        logDiagnostic(stringBuffer5.toString());
                    }
                    throw new LogConfigurationException(stringBuffer5.toString());
                }
                if (!isDiagnosticsEnabled()) {
                    return;
                }
                stringBuffer = new StringBuffer();
                stringBuffer.append("[WARNING] Log class '");
                stringBuffer.append(cls.getName());
                stringBuffer.append("' does not implement the Log interface.");
            }
        }
        logDiagnostic(stringBuffer.toString());
    }

    private void informUponSimilarName(StringBuffer stringBuffer, String str, String str2) {
        if (!str.equals(str2) && str.regionMatches(true, 0, str2, 0, PKG_LEN + 5)) {
            stringBuffer.append(" Did you mean '");
            stringBuffer.append(str2);
            stringBuffer.append("'?");
        }
    }

    private void initConfiguration() {
        this.allowFlawedContext = getBooleanConfiguration(ALLOW_FLAWED_CONTEXT_PROPERTY, true);
        this.allowFlawedDiscovery = getBooleanConfiguration(ALLOW_FLAWED_DISCOVERY_PROPERTY, true);
        this.allowFlawedHierarchy = getBooleanConfiguration(ALLOW_FLAWED_HIERARCHY_PROPERTY, true);
    }

    private void initDiagnostics() {
        String strObjectId;
        ClassLoader classLoader = getClassLoader(getClass());
        if (classLoader == null) {
            strObjectId = "BOOTLOADER";
        } else {
            try {
                strObjectId = LogFactory.objectId(classLoader);
            } catch (SecurityException unused) {
                strObjectId = "UNKNOWN";
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LogFactoryImpl@");
        stringBuffer.append(System.identityHashCode(this));
        stringBuffer.append(" from ");
        stringBuffer.append(strObjectId);
        stringBuffer.append("] ");
        this.diagnosticPrefix = stringBuffer.toString();
    }

    public static boolean isDiagnosticsEnabled() {
        return LogFactory.isDiagnosticsEnabled();
    }

    private boolean isLogLibraryAvailable(String str, String str2) {
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Checking for '");
            stringBuffer.append(str);
            stringBuffer.append("'.");
            logDiagnostic(stringBuffer.toString());
        }
        try {
            if (createLogFromClass(str2, getClass().getName(), false) == null) {
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Did not find '");
                    stringBuffer2.append(str);
                    stringBuffer2.append("'.");
                    logDiagnostic(stringBuffer2.toString());
                }
                return false;
            }
            if (!isDiagnosticsEnabled()) {
                return true;
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Found '");
            stringBuffer3.append(str);
            stringBuffer3.append("'.");
            logDiagnostic(stringBuffer3.toString());
            return true;
        } catch (LogConfigurationException unused) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("Logging system '");
                stringBuffer4.append(str);
                stringBuffer4.append("' is available but not useable.");
                logDiagnostic(stringBuffer4.toString());
            }
            return false;
        }
    }

    @Override // org.apache.commons.logging.LogFactory
    public Object getAttribute(String str) {
        return this.attributes.get(str);
    }

    @Override // org.apache.commons.logging.LogFactory
    public String[] getAttributeNames() {
        return (String[]) this.attributes.keySet().toArray(new String[this.attributes.size()]);
    }

    @Override // org.apache.commons.logging.LogFactory
    public Log getInstance(Class cls) throws LogConfigurationException {
        return getInstance(cls.getName());
    }

    @Override // org.apache.commons.logging.LogFactory
    public Log getInstance(String str) throws LogConfigurationException {
        Log log = (Log) this.instances.get(str);
        if (log != null) {
            return log;
        }
        Log logNewInstance = newInstance(str);
        this.instances.put(str, logNewInstance);
        return logNewInstance;
    }

    public String getLogClassName() {
        if (this.logClassName == null) {
            discoverLogImplementation(getClass().getName());
        }
        return this.logClassName;
    }

    public Constructor getLogConstructor() throws LogConfigurationException {
        if (this.logConstructor == null) {
            discoverLogImplementation(getClass().getName());
        }
        return this.logConstructor;
    }

    public boolean isJdk13LumberjackAvailable() {
        return isLogLibraryAvailable("Jdk13Lumberjack", LOGGING_IMPL_LUMBERJACK_LOGGER);
    }

    public boolean isJdk14Available() {
        return isLogLibraryAvailable("Jdk14", LOGGING_IMPL_JDK14_LOGGER);
    }

    public boolean isLog4JAvailable() {
        return isLogLibraryAvailable("Log4J", LOGGING_IMPL_LOG4J_LOGGER);
    }

    public void logDiagnostic(String str) {
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.diagnosticPrefix);
            stringBuffer.append(str);
            LogFactory.logRawDiagnostic(stringBuffer.toString());
        }
    }

    public Log newInstance(String str) throws LogConfigurationException {
        try {
            Constructor constructor = this.logConstructor;
            Log logDiscoverLogImplementation = constructor == null ? discoverLogImplementation(str) : (Log) constructor.newInstance(str);
            Method method = this.logMethod;
            if (method != null) {
                method.invoke(logDiscoverLogImplementation, this);
            }
            return logDiscoverLogImplementation;
        } catch (InvocationTargetException e9) {
            e = e9;
            Throwable targetException = e.getTargetException();
            if (targetException != null) {
                e = targetException;
            }
            throw new LogConfigurationException(e);
        } catch (LogConfigurationException e10) {
            throw e10;
        } catch (Throwable th) {
            LogFactory.handleThrowable(th);
            throw new LogConfigurationException(th);
        }
    }

    @Override // org.apache.commons.logging.LogFactory
    public void release() {
        logDiagnostic("Releasing all known loggers");
        this.instances.clear();
    }

    @Override // org.apache.commons.logging.LogFactory
    public void removeAttribute(String str) {
        this.attributes.remove(str);
    }

    @Override // org.apache.commons.logging.LogFactory
    public void setAttribute(String str, Object obj) {
        if (this.logConstructor != null) {
            logDiagnostic("setAttribute: call too late; configuration already performed.");
        }
        Hashtable hashtable = this.attributes;
        if (obj == null) {
            hashtable.remove(str);
        } else {
            hashtable.put(str, obj);
        }
        if (str.equals(LogFactory.TCCL_KEY)) {
            this.useTCCL = obj != null && Boolean.valueOf(obj.toString()).booleanValue();
        }
    }
}
