package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes4.dex */
class SessionManager {
    private ThreadLocal<Reference> local = new ThreadLocal<>();

    public static class Reference {
        private int count;
        private Session session;

        public Reference(boolean z9) {
            this.session = new Session(z9);
        }

        public int clear() {
            int i9 = this.count - 1;
            this.count = i9;
            return i9;
        }

        public Session get() {
            int i9 = this.count;
            if (i9 >= 0) {
                this.count = i9 + 1;
            }
            return this.session;
        }
    }

    private Session create(boolean z9) throws Exception {
        Reference reference = new Reference(z9);
        this.local.set(reference);
        return reference.get();
    }

    public void close() throws Exception {
        Reference reference = this.local.get();
        if (reference == null) {
            throw new PersistenceException("Session does not exist", new Object[0]);
        }
        if (reference.clear() == 0) {
            this.local.remove();
        }
    }

    public Session open() throws Exception {
        return open(true);
    }

    public Session open(boolean z9) throws Exception {
        Reference reference = this.local.get();
        return reference != null ? reference.get() : create(z9);
    }
}
