package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementArray;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.ElementMapUnion;
import org.simpleframework.xml.ElementUnion;
import org.simpleframework.xml.Text;

/* JADX INFO: loaded from: classes4.dex */
class SignatureScanner {
    private final SignatureBuilder builder;
    private final Constructor constructor;
    private final ParameterFactory factory;
    private final ParameterMap registry;
    private final Class type;

    public SignatureScanner(Constructor constructor, ParameterMap parameterMap, Support support) throws Exception {
        this.builder = new SignatureBuilder(constructor);
        this.factory = new ParameterFactory(support);
        Class declaringClass = constructor.getDeclaringClass();
        this.type = declaringClass;
        this.constructor = constructor;
        this.registry = parameterMap;
        scan(declaringClass);
    }

    private List<Parameter> create(Annotation annotation, int i9) throws Exception {
        Parameter parameterFactory = this.factory.getInstance(this.constructor, annotation, i9);
        if (parameterFactory != null) {
            register(parameterFactory);
        }
        return Collections.singletonList(parameterFactory);
    }

    private Annotation[] extract(Annotation annotation) throws Exception {
        Method[] declaredMethods = annotation.annotationType().getDeclaredMethods();
        if (declaredMethods.length == 1) {
            return (Annotation[]) declaredMethods[0].invoke(annotation, null);
        }
        throw new UnionException("Annotation '%s' is not a valid union for %s", annotation, this.type);
    }

    private List<Parameter> process(Annotation annotation, int i9) throws Exception {
        if (!(annotation instanceof Attribute) && !(annotation instanceof Element) && !(annotation instanceof ElementList) && !(annotation instanceof ElementArray) && !(annotation instanceof ElementMap)) {
            if (!(annotation instanceof ElementListUnion) && !(annotation instanceof ElementMapUnion) && !(annotation instanceof ElementUnion)) {
                return annotation instanceof Text ? create(annotation, i9) : Collections.emptyList();
            }
            return union(annotation, i9);
        }
        return create(annotation, i9);
    }

    private void register(Parameter parameter) throws Exception {
        String path = parameter.getPath();
        Object key = parameter.getKey();
        if (this.registry.containsKey(key)) {
            validate(parameter, key);
        }
        if (this.registry.containsKey(path)) {
            validate(parameter, path);
        }
        this.registry.put(path, parameter);
        this.registry.put(key, parameter);
    }

    private void scan(Class cls) throws Exception {
        Class<?>[] parameterTypes = this.constructor.getParameterTypes();
        for (int i9 = 0; i9 < parameterTypes.length; i9++) {
            scan(parameterTypes[i9], i9);
        }
    }

    private void scan(Class cls, int i9) throws Exception {
        Annotation[][] parameterAnnotations = this.constructor.getParameterAnnotations();
        int i10 = 0;
        while (true) {
            Annotation[] annotationArr = parameterAnnotations[i9];
            if (i10 >= annotationArr.length) {
                return;
            }
            Iterator<Parameter> it = process(annotationArr[i10], i9).iterator();
            while (it.hasNext()) {
                this.builder.insert(it.next(), i9);
            }
            i10++;
        }
    }

    private List<Parameter> union(Annotation annotation, int i9) throws Exception {
        Signature signature = new Signature(this.constructor);
        for (Annotation annotation2 : extract(annotation)) {
            Parameter parameterFactory = this.factory.getInstance(this.constructor, annotation, annotation2, i9);
            String path = parameterFactory.getPath();
            if (signature.contains(path)) {
                throw new UnionException("Annotation name '%s' used more than once in %s for %s", path, annotation, this.type);
            }
            signature.set(path, parameterFactory);
            register(parameterFactory);
        }
        return signature.getAll();
    }

    private void validate(Parameter parameter, Object obj) throws Exception {
        Parameter parameter2 = this.registry.get(obj);
        if (parameter.isText() != parameter2.isText()) {
            Annotation annotation = parameter.getAnnotation();
            Annotation annotation2 = parameter2.getAnnotation();
            String path = parameter.getPath();
            if (!annotation.equals(annotation2)) {
                throw new ConstructorException("Annotations do not match for '%s' in %s", path, this.type);
            }
            if (parameter2.getType() != parameter.getType()) {
                throw new ConstructorException("Parameter types do not match for '%s' in %s", path, this.type);
            }
        }
    }

    public List<Signature> getSignatures() throws Exception {
        return this.builder.build();
    }

    public boolean isValid() {
        return this.builder.isValid();
    }
}
