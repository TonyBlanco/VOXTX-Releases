package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes4.dex */
class AnnotationHandler implements InvocationHandler {
    private static final String ATTRIBUTE = "attribute";
    private static final String CLASS = "annotationType";
    private static final String EQUAL = "equals";
    private static final String REQUIRED = "required";
    private static final String STRING = "toString";
    private final boolean attribute;
    private final Comparer comparer;
    private final boolean required;
    private final Class type;

    public AnnotationHandler(Class cls) {
        this(cls, true);
    }

    public AnnotationHandler(Class cls, boolean z9) {
        this(cls, z9, false);
    }

    public AnnotationHandler(Class cls, boolean z9, boolean z10) {
        this.comparer = new Comparer();
        this.attribute = z10;
        this.required = z9;
        this.type = cls;
    }

    private void attributes(StringBuilder sb) {
        Method[] declaredMethods = this.type.getDeclaredMethods();
        for (int i9 = 0; i9 < declaredMethods.length; i9++) {
            String name = declaredMethods[i9].getName();
            Object objValue = value(declaredMethods[i9]);
            if (i9 > 0) {
                sb.append(',');
                sb.append(TokenParser.SP);
            }
            sb.append(name);
            sb.append('=');
            sb.append(objValue);
        }
        sb.append(')');
    }

    private boolean equals(Object obj, Object[] objArr) throws Throwable {
        Annotation annotation = (Annotation) obj;
        Annotation annotation2 = (Annotation) objArr[0];
        if (annotation.annotationType() == annotation2.annotationType()) {
            return this.comparer.equals(annotation, annotation2);
        }
        throw new PersistenceException("Annotation %s is not the same as %s", annotation, annotation2);
    }

    private void name(StringBuilder sb) {
        String name = this.type.getName();
        sb.append('@');
        sb.append(name);
        sb.append('(');
    }

    private Object value(Method method) {
        boolean z9;
        String name = method.getName();
        if (name.equals(REQUIRED)) {
            z9 = this.required;
        } else {
            if (!name.equals(ATTRIBUTE)) {
                return method.getDefaultValue();
            }
            z9 = this.attribute;
        }
        return Boolean.valueOf(z9);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        boolean zEquals;
        String name = method.getName();
        if (name.equals(STRING)) {
            return toString();
        }
        if (name.equals(EQUAL)) {
            zEquals = equals(obj, objArr);
        } else {
            if (name.equals(CLASS)) {
                return this.type;
            }
            if (name.equals(REQUIRED)) {
                zEquals = this.required;
            } else {
                if (!name.equals(ATTRIBUTE)) {
                    return method.getDefaultValue();
                }
                zEquals = this.attribute;
            }
        }
        return Boolean.valueOf(zEquals);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            name(sb);
            attributes(sb);
        }
        return sb.toString();
    }
}
