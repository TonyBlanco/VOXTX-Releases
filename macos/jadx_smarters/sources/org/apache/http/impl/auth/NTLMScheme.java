package org.apache.http.impl.auth;

import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.InvalidCredentialsException;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.auth.NTCredentials;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class NTLMScheme extends AuthSchemeBase {
    private String challenge;
    private final NTLMEngine engine;
    private State state;

    public enum State {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        MSG_TYPE1_GENERATED,
        MSG_TYPE2_RECEVIED,
        MSG_TYPE3_GENERATED,
        FAILED
    }

    public NTLMScheme() {
        this(new NTLMEngineImpl());
    }

    public NTLMScheme(NTLMEngine nTLMEngine) {
        Args.notNull(nTLMEngine, "NTLM engine");
        this.engine = nTLMEngine;
        this.state = State.UNINITIATED;
        this.challenge = null;
    }

    @Override // org.apache.http.auth.AuthScheme
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) throws AuthenticationException {
        String strGenerateType3Msg;
        State state;
        try {
            NTCredentials nTCredentials = (NTCredentials) credentials;
            State state2 = this.state;
            if (state2 == State.FAILED) {
                throw new AuthenticationException("NTLM authentication failed");
            }
            if (state2 == State.CHALLENGE_RECEIVED) {
                strGenerateType3Msg = this.engine.generateType1Msg(nTCredentials.getDomain(), nTCredentials.getWorkstation());
                state = State.MSG_TYPE1_GENERATED;
            } else {
                if (state2 != State.MSG_TYPE2_RECEVIED) {
                    throw new AuthenticationException("Unexpected state: " + this.state);
                }
                strGenerateType3Msg = this.engine.generateType3Msg(nTCredentials.getUserName(), nTCredentials.getPassword(), nTCredentials.getDomain(), nTCredentials.getWorkstation(), this.challenge);
                state = State.MSG_TYPE3_GENERATED;
            }
            this.state = state;
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
            charArrayBuffer.append(isProxy() ? "Proxy-Authorization" : "Authorization");
            charArrayBuffer.append(": NTLM ");
            charArrayBuffer.append(strGenerateType3Msg);
            return new BufferedHeader(charArrayBuffer);
        } catch (ClassCastException unused) {
            throw new InvalidCredentialsException("Credentials cannot be used for NTLM authentication: " + credentials.getClass().getName());
        }
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getParameter(String str) {
        return null;
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getRealm() {
        return null;
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getSchemeName() {
        return "ntlm";
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isComplete() {
        State state = this.state;
        return state == State.MSG_TYPE3_GENERATED || state == State.FAILED;
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isConnectionBased() {
        return true;
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase
    public void parseChallenge(CharArrayBuffer charArrayBuffer, int i9, int i10) throws MalformedChallengeException {
        State state;
        String strSubstringTrimmed = charArrayBuffer.substringTrimmed(i9, i10);
        this.challenge = strSubstringTrimmed;
        if (strSubstringTrimmed.isEmpty()) {
            state = this.state == State.UNINITIATED ? State.CHALLENGE_RECEIVED : State.FAILED;
        } else {
            State state2 = this.state;
            State state3 = State.MSG_TYPE1_GENERATED;
            if (state2.compareTo(state3) < 0) {
                this.state = State.FAILED;
                throw new MalformedChallengeException("Out of sequence NTLM response message");
            }
            if (this.state != state3) {
                return;
            } else {
                state = State.MSG_TYPE2_RECEVIED;
            }
        }
        this.state = state;
    }
}
