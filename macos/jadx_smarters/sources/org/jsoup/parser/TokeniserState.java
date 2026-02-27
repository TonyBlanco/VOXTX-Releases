package org.jsoup.parser;

import java.util.Arrays;
import org.apache.http.message.TokenParser;
import org.jsoup.parser.Token;

/* JADX INFO: loaded from: classes4.dex */
enum TokeniserState {
    Data { // from class: org.jsoup.parser.TokeniserState.1
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cCurrent = characterReader.current();
            if (cCurrent == 0) {
                tokeniser.error(this);
                tokeniser.emit(characterReader.consume());
                return;
            }
            if (cCurrent == '&') {
                tokeniserState = TokeniserState.CharacterReferenceInData;
            } else {
                if (cCurrent != '<') {
                    if (cCurrent != 65535) {
                        tokeniser.emit(characterReader.consumeData());
                        return;
                    } else {
                        tokeniser.emit(new Token.EOF());
                        return;
                    }
                }
                tokeniserState = TokeniserState.TagOpen;
            }
            tokeniser.advanceTransition(tokeniserState);
        }
    },
    CharacterReferenceInData { // from class: org.jsoup.parser.TokeniserState.2
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char[] cArrConsumeCharacterReference = tokeniser.consumeCharacterReference(null, false);
            if (cArrConsumeCharacterReference == null) {
                tokeniser.emit('&');
            } else {
                tokeniser.emit(cArrConsumeCharacterReference);
            }
            tokeniser.transition(TokeniserState.Data);
        }
    },
    Rcdata { // from class: org.jsoup.parser.TokeniserState.3
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cCurrent = characterReader.current();
            if (cCurrent == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.emit((char) 65533);
                return;
            }
            if (cCurrent == '&') {
                tokeniserState = TokeniserState.CharacterReferenceInRcdata;
            } else {
                if (cCurrent != '<') {
                    if (cCurrent != 65535) {
                        tokeniser.emit(characterReader.consumeToAny('&', '<', TokeniserState.nullChar));
                        return;
                    } else {
                        tokeniser.emit(new Token.EOF());
                        return;
                    }
                }
                tokeniserState = TokeniserState.RcdataLessthanSign;
            }
            tokeniser.advanceTransition(tokeniserState);
        }
    },
    CharacterReferenceInRcdata { // from class: org.jsoup.parser.TokeniserState.4
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char[] cArrConsumeCharacterReference = tokeniser.consumeCharacterReference(null, false);
            if (cArrConsumeCharacterReference == null) {
                tokeniser.emit('&');
            } else {
                tokeniser.emit(cArrConsumeCharacterReference);
            }
            tokeniser.transition(TokeniserState.Rcdata);
        }
    },
    Rawtext { // from class: org.jsoup.parser.TokeniserState.5
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cCurrent = characterReader.current();
            if (cCurrent == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.emit((char) 65533);
            } else if (cCurrent == '<') {
                tokeniser.advanceTransition(TokeniserState.RawtextLessthanSign);
            } else if (cCurrent != 65535) {
                tokeniser.emit(characterReader.consumeToAny('<', TokeniserState.nullChar));
            } else {
                tokeniser.emit(new Token.EOF());
            }
        }
    },
    ScriptData { // from class: org.jsoup.parser.TokeniserState.6
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cCurrent = characterReader.current();
            if (cCurrent == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.emit((char) 65533);
            } else if (cCurrent == '<') {
                tokeniser.advanceTransition(TokeniserState.ScriptDataLessthanSign);
            } else if (cCurrent != 65535) {
                tokeniser.emit(characterReader.consumeToAny('<', TokeniserState.nullChar));
            } else {
                tokeniser.emit(new Token.EOF());
            }
        }
    },
    PLAINTEXT { // from class: org.jsoup.parser.TokeniserState.7
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cCurrent = characterReader.current();
            if (cCurrent == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.emit((char) 65533);
            } else if (cCurrent != 65535) {
                tokeniser.emit(characterReader.consumeTo(TokeniserState.nullChar));
            } else {
                tokeniser.emit(new Token.EOF());
            }
        }
    },
    TagOpen { // from class: org.jsoup.parser.TokeniserState.8
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            TokeniserState tokeniserState2;
            char cCurrent = characterReader.current();
            if (cCurrent == '!') {
                tokeniserState = TokeniserState.MarkupDeclarationOpen;
            } else if (cCurrent == '/') {
                tokeniserState = TokeniserState.EndTagOpen;
            } else {
                if (cCurrent != '?') {
                    if (characterReader.matchesLetter()) {
                        tokeniser.createTagPending(true);
                        tokeniserState2 = TokeniserState.TagName;
                    } else {
                        tokeniser.error(this);
                        tokeniser.emit('<');
                        tokeniserState2 = TokeniserState.Data;
                    }
                    tokeniser.transition(tokeniserState2);
                    return;
                }
                tokeniserState = TokeniserState.BogusComment;
            }
            tokeniser.advanceTransition(tokeniserState);
        }
    },
    EndTagOpen { // from class: org.jsoup.parser.TokeniserState.9
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.emit("</");
                tokeniserState = TokeniserState.Data;
            } else {
                if (!characterReader.matchesLetter()) {
                    boolean zMatches = characterReader.matches('>');
                    tokeniser.error(this);
                    tokeniser.advanceTransition(zMatches ? TokeniserState.Data : TokeniserState.BogusComment);
                    return;
                }
                tokeniser.createTagPending(false);
                tokeniserState = TokeniserState.TagName;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    TagName { // from class: org.jsoup.parser.TokeniserState.10
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            tokeniser.tagPending.appendTagName(characterReader.consumeTagName().toLowerCase());
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.tagPending.appendTagName(TokeniserState.replacementStr);
                return;
            }
            if (cConsume == ' ') {
                tokeniserState = TokeniserState.BeforeAttributeName;
            } else if (cConsume != '/') {
                if (cConsume == '>') {
                    tokeniser.emitTagPending();
                } else if (cConsume != 65535) {
                    if (cConsume != '\t' && cConsume != '\n' && cConsume != '\f' && cConsume != '\r') {
                        return;
                    }
                    tokeniserState = TokeniserState.BeforeAttributeName;
                } else {
                    tokeniser.eofError(this);
                }
                tokeniserState = TokeniserState.Data;
            } else {
                tokeniserState = TokeniserState.SelfClosingStartTag;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    RcdataLessthanSign { // from class: org.jsoup.parser.TokeniserState.11
        /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
        @Override // org.jsoup.parser.TokeniserState
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void read(org.jsoup.parser.Tokeniser r3, org.jsoup.parser.CharacterReader r4) {
            /*
                r2 = this;
                r0 = 47
                boolean r0 = r4.matches(r0)
                if (r0 == 0) goto L11
                r3.createTempBuffer()
                org.jsoup.parser.TokeniserState r4 = org.jsoup.parser.TokeniserState.RCDATAEndTagOpen
                r3.advanceTransition(r4)
                goto L5b
            L11:
                boolean r0 = r4.matchesLetter()
                if (r0 == 0) goto L53
                java.lang.String r0 = r3.appropriateEndTagName()
                if (r0 == 0) goto L53
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "</"
                r0.append(r1)
                java.lang.String r1 = r3.appropriateEndTagName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                boolean r0 = r4.containsIgnoreCase(r0)
                if (r0 != 0) goto L53
                r0 = 0
                org.jsoup.parser.Token$Tag r0 = r3.createTagPending(r0)
                java.lang.String r1 = r3.appropriateEndTagName()
                org.jsoup.parser.Token$Tag r0 = r0.name(r1)
                r3.tagPending = r0
                r3.emitTagPending()
                r4.unconsume()
                org.jsoup.parser.TokeniserState r4 = org.jsoup.parser.TokeniserState.Data
            L4f:
                r3.transition(r4)
                goto L5b
            L53:
                java.lang.String r4 = "<"
                r3.emit(r4)
                org.jsoup.parser.TokeniserState r4 = org.jsoup.parser.TokeniserState.Rcdata
                goto L4f
            L5b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TokeniserState.AnonymousClass11.read(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader):void");
        }
    },
    RCDATAEndTagOpen { // from class: org.jsoup.parser.TokeniserState.12
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.matchesLetter()) {
                tokeniser.emit("</");
                tokeniser.transition(TokeniserState.Rcdata);
            } else {
                tokeniser.createTagPending(false);
                tokeniser.tagPending.appendTagName(Character.toLowerCase(characterReader.current()));
                tokeniser.dataBuffer.append(Character.toLowerCase(characterReader.current()));
                tokeniser.advanceTransition(TokeniserState.RCDATAEndTagName);
            }
        }
    },
    RCDATAEndTagName { // from class: org.jsoup.parser.TokeniserState.13
        private void anythingElse(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.emit("</" + tokeniser.dataBuffer.toString());
            characterReader.unconsume();
            tokeniser.transition(TokeniserState.Rcdata);
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.matchesLetter()) {
                String strConsumeLetterSequence = characterReader.consumeLetterSequence();
                tokeniser.tagPending.appendTagName(strConsumeLetterSequence.toLowerCase());
                tokeniser.dataBuffer.append(strConsumeLetterSequence);
                return;
            }
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                if (tokeniser.isAppropriateEndTagToken()) {
                    tokeniserState = TokeniserState.BeforeAttributeName;
                    tokeniser.transition(tokeniserState);
                    return;
                }
                anythingElse(tokeniser, characterReader);
            }
            if (cConsume == '/') {
                if (tokeniser.isAppropriateEndTagToken()) {
                    tokeniserState = TokeniserState.SelfClosingStartTag;
                    tokeniser.transition(tokeniserState);
                    return;
                }
                anythingElse(tokeniser, characterReader);
            }
            if (cConsume == '>' && tokeniser.isAppropriateEndTagToken()) {
                tokeniser.emitTagPending();
                tokeniserState = TokeniserState.Data;
                tokeniser.transition(tokeniserState);
                return;
            }
            anythingElse(tokeniser, characterReader);
        }
    },
    RawtextLessthanSign { // from class: org.jsoup.parser.TokeniserState.14
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('/')) {
                tokeniser.createTempBuffer();
                tokeniser.advanceTransition(TokeniserState.RawtextEndTagOpen);
            } else {
                tokeniser.emit('<');
                tokeniser.transition(TokeniserState.Rawtext);
            }
        }
    },
    RawtextEndTagOpen { // from class: org.jsoup.parser.TokeniserState.15
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.matchesLetter()) {
                tokeniser.createTagPending(false);
                tokeniserState = TokeniserState.RawtextEndTagName;
            } else {
                tokeniser.emit("</");
                tokeniserState = TokeniserState.Rawtext;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    RawtextEndTagName { // from class: org.jsoup.parser.TokeniserState.16
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataEndTag(tokeniser, characterReader, TokeniserState.Rawtext);
        }
    },
    ScriptDataLessthanSign { // from class: org.jsoup.parser.TokeniserState.17
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume == '!') {
                tokeniser.emit("<!");
                tokeniserState = TokeniserState.ScriptDataEscapeStart;
            } else if (cConsume != '/') {
                tokeniser.emit("<");
                characterReader.unconsume();
                tokeniserState = TokeniserState.ScriptData;
            } else {
                tokeniser.createTempBuffer();
                tokeniserState = TokeniserState.ScriptDataEndTagOpen;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    ScriptDataEndTagOpen { // from class: org.jsoup.parser.TokeniserState.18
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.matchesLetter()) {
                tokeniser.createTagPending(false);
                tokeniserState = TokeniserState.ScriptDataEndTagName;
            } else {
                tokeniser.emit("</");
                tokeniserState = TokeniserState.ScriptData;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    ScriptDataEndTagName { // from class: org.jsoup.parser.TokeniserState.19
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataEndTag(tokeniser, characterReader, TokeniserState.ScriptData);
        }
    },
    ScriptDataEscapeStart { // from class: org.jsoup.parser.TokeniserState.20
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.matches('-')) {
                tokeniser.transition(TokeniserState.ScriptData);
            } else {
                tokeniser.emit('-');
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapeStartDash);
            }
        }
    },
    ScriptDataEscapeStartDash { // from class: org.jsoup.parser.TokeniserState.21
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.matches('-')) {
                tokeniser.transition(TokeniserState.ScriptData);
            } else {
                tokeniser.emit('-');
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedDashDash);
            }
        }
    },
    ScriptDataEscaped { // from class: org.jsoup.parser.TokeniserState.22
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            char cCurrent = characterReader.current();
            if (cCurrent == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.emit((char) 65533);
                return;
            }
            if (cCurrent == '-') {
                tokeniser.emit('-');
                tokeniserState = TokeniserState.ScriptDataEscapedDash;
            } else {
                if (cCurrent != '<') {
                    tokeniser.emit(characterReader.consumeToAny('-', '<', TokeniserState.nullChar));
                    return;
                }
                tokeniserState = TokeniserState.ScriptDataEscapedLessthanSign;
            }
            tokeniser.advanceTransition(tokeniserState);
        }
    },
    ScriptDataEscapedDash { // from class: org.jsoup.parser.TokeniserState.23
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume == '-') {
                    tokeniser.emit(cConsume);
                    tokeniserState = TokeniserState.ScriptDataEscapedDashDash;
                } else if (cConsume == '<') {
                    tokeniserState = TokeniserState.ScriptDataEscapedLessthanSign;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniser.error(this);
            cConsume = 65533;
            tokeniser.emit(cConsume);
            tokeniserState = TokeniserState.ScriptDataEscaped;
            tokeniser.transition(tokeniserState);
        }
    },
    ScriptDataEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.24
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume == '-') {
                    tokeniser.emit(cConsume);
                    return;
                }
                if (cConsume != '<') {
                    tokeniser.emit(cConsume);
                    if (cConsume == '>') {
                        tokeniserState = TokeniserState.ScriptData;
                    }
                } else {
                    tokeniserState = TokeniserState.ScriptDataEscapedLessthanSign;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniser.error(this);
            tokeniser.emit((char) 65533);
            tokeniserState = TokeniserState.ScriptDataEscaped;
            tokeniser.transition(tokeniserState);
        }
    },
    ScriptDataEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.25
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.matchesLetter()) {
                tokeniser.createTempBuffer();
                tokeniser.dataBuffer.append(Character.toLowerCase(characterReader.current()));
                tokeniser.emit("<" + characterReader.current());
                tokeniserState = TokeniserState.ScriptDataDoubleEscapeStart;
            } else if (!characterReader.matches('/')) {
                tokeniser.emit('<');
                tokeniser.transition(TokeniserState.ScriptDataEscaped);
                return;
            } else {
                tokeniser.createTempBuffer();
                tokeniserState = TokeniserState.ScriptDataEscapedEndTagOpen;
            }
            tokeniser.advanceTransition(tokeniserState);
        }
    },
    ScriptDataEscapedEndTagOpen { // from class: org.jsoup.parser.TokeniserState.26
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.matchesLetter()) {
                tokeniser.emit("</");
                tokeniser.transition(TokeniserState.ScriptDataEscaped);
            } else {
                tokeniser.createTagPending(false);
                tokeniser.tagPending.appendTagName(Character.toLowerCase(characterReader.current()));
                tokeniser.dataBuffer.append(characterReader.current());
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedEndTagName);
            }
        }
    },
    ScriptDataEscapedEndTagName { // from class: org.jsoup.parser.TokeniserState.27
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataEndTag(tokeniser, characterReader, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart { // from class: org.jsoup.parser.TokeniserState.28
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataDoubleEscapeTag(tokeniser, characterReader, TokeniserState.ScriptDataDoubleEscaped, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped { // from class: org.jsoup.parser.TokeniserState.29
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cCurrent = characterReader.current();
            if (cCurrent == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.emit((char) 65533);
                return;
            }
            if (cCurrent == '-') {
                tokeniser.emit(cCurrent);
                tokeniserState = TokeniserState.ScriptDataDoubleEscapedDash;
            } else {
                if (cCurrent != '<') {
                    if (cCurrent != 65535) {
                        tokeniser.emit(characterReader.consumeToAny('-', '<', TokeniserState.nullChar));
                        return;
                    } else {
                        tokeniser.eofError(this);
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                }
                tokeniser.emit(cCurrent);
                tokeniserState = TokeniserState.ScriptDataDoubleEscapedLessthanSign;
            }
            tokeniser.advanceTransition(tokeniserState);
        }
    },
    ScriptDataDoubleEscapedDash { // from class: org.jsoup.parser.TokeniserState.30
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume == '-') {
                    tokeniser.emit(cConsume);
                    tokeniserState = TokeniserState.ScriptDataDoubleEscapedDashDash;
                } else if (cConsume == '<') {
                    tokeniser.emit(cConsume);
                    tokeniserState = TokeniserState.ScriptDataDoubleEscapedLessthanSign;
                } else if (cConsume == 65535) {
                    tokeniser.eofError(this);
                    tokeniserState = TokeniserState.Data;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniser.error(this);
            cConsume = 65533;
            tokeniser.emit(cConsume);
            tokeniserState = TokeniserState.ScriptDataDoubleEscaped;
            tokeniser.transition(tokeniserState);
        }
    },
    ScriptDataDoubleEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.31
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume == '-') {
                    tokeniser.emit(cConsume);
                    return;
                }
                if (cConsume == '<') {
                    tokeniser.emit(cConsume);
                    tokeniserState = TokeniserState.ScriptDataDoubleEscapedLessthanSign;
                } else if (cConsume == '>') {
                    tokeniser.emit(cConsume);
                    tokeniserState = TokeniserState.ScriptData;
                } else if (cConsume == 65535) {
                    tokeniser.eofError(this);
                    tokeniserState = TokeniserState.Data;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniser.error(this);
            cConsume = 65533;
            tokeniser.emit(cConsume);
            tokeniserState = TokeniserState.ScriptDataDoubleEscaped;
            tokeniser.transition(tokeniserState);
        }
    },
    ScriptDataDoubleEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.32
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.matches('/')) {
                tokeniser.transition(TokeniserState.ScriptDataDoubleEscaped);
                return;
            }
            tokeniser.emit('/');
            tokeniser.createTempBuffer();
            tokeniser.advanceTransition(TokeniserState.ScriptDataDoubleEscapeEnd);
        }
    },
    ScriptDataDoubleEscapeEnd { // from class: org.jsoup.parser.TokeniserState.33
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataDoubleEscapeTag(tokeniser, characterReader, TokeniserState.ScriptDataEscaped, TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName { // from class: org.jsoup.parser.TokeniserState.34
        /* JADX WARN: Failed to find 'out' block for switch in B:22:0x002b. Please report as an issue. */
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume != ' ') {
                    if (cConsume != '\"' && cConsume != '\'') {
                        if (cConsume != '/') {
                            if (cConsume == 65535) {
                                tokeniser.eofError(this);
                            } else if (cConsume != '\t' && cConsume != '\n' && cConsume != '\f' && cConsume != '\r') {
                                switch (cConsume) {
                                    case '>':
                                        tokeniser.emitTagPending();
                                        break;
                                }
                            } else {
                                return;
                            }
                            tokeniserState = TokeniserState.Data;
                        } else {
                            tokeniserState = TokeniserState.SelfClosingStartTag;
                        }
                        tokeniser.transition(tokeniserState);
                    }
                    tokeniser.error(this);
                    tokeniser.tagPending.newAttribute();
                    tokeniser.tagPending.appendAttributeName(cConsume);
                    tokeniserState = TokeniserState.AttributeName;
                    tokeniser.transition(tokeniserState);
                }
                return;
            }
            tokeniser.error(this);
            tokeniser.tagPending.newAttribute();
            characterReader.unconsume();
            tokeniserState = TokeniserState.AttributeName;
            tokeniser.transition(tokeniserState);
        }
    },
    AttributeName { // from class: org.jsoup.parser.TokeniserState.35
        /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
        @Override // org.jsoup.parser.TokeniserState
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void read(org.jsoup.parser.Tokeniser r3, org.jsoup.parser.CharacterReader r4) {
            /*
                r2 = this;
                char[] r0 = org.jsoup.parser.TokeniserState.access$400()
                java.lang.String r0 = r4.consumeToAnySorted(r0)
                org.jsoup.parser.Token$Tag r1 = r3.tagPending
                java.lang.String r0 = r0.toLowerCase()
                r1.appendAttributeName(r0)
                char r4 = r4.consume()
                if (r4 == 0) goto L5f
                r0 = 32
                if (r4 == r0) goto L5c
                r0 = 34
                if (r4 == r0) goto L53
                r0 = 39
                if (r4 == r0) goto L53
                r0 = 47
                if (r4 == r0) goto L50
                r0 = 65535(0xffff, float:9.1834E-41)
                if (r4 == r0) goto L4c
                r0 = 9
                if (r4 == r0) goto L5c
                r0 = 10
                if (r4 == r0) goto L5c
                r0 = 12
                if (r4 == r0) goto L5c
                r0 = 13
                if (r4 == r0) goto L5c
                switch(r4) {
                    case 60: goto L53;
                    case 61: goto L49;
                    case 62: goto L40;
                    default: goto L3f;
                }
            L3f:
                goto L68
            L40:
                r3.emitTagPending()
            L43:
                org.jsoup.parser.TokeniserState r4 = org.jsoup.parser.TokeniserState.Data
            L45:
                r3.transition(r4)
                goto L68
            L49:
                org.jsoup.parser.TokeniserState r4 = org.jsoup.parser.TokeniserState.BeforeAttributeValue
                goto L45
            L4c:
                r3.eofError(r2)
                goto L43
            L50:
                org.jsoup.parser.TokeniserState r4 = org.jsoup.parser.TokeniserState.SelfClosingStartTag
                goto L45
            L53:
                r3.error(r2)
                org.jsoup.parser.Token$Tag r3 = r3.tagPending
            L58:
                r3.appendAttributeName(r4)
                goto L68
            L5c:
                org.jsoup.parser.TokeniserState r4 = org.jsoup.parser.TokeniserState.AfterAttributeName
                goto L45
            L5f:
                r3.error(r2)
                org.jsoup.parser.Token$Tag r3 = r3.tagPending
                r4 = 65533(0xfffd, float:9.1831E-41)
                goto L58
            L68:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TokeniserState.AnonymousClass35.read(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader):void");
        }
    },
    AfterAttributeName { // from class: org.jsoup.parser.TokeniserState.36
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            Token.Tag tag;
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tag = tokeniser.tagPending;
                cConsume = 65533;
            } else {
                if (cConsume == ' ') {
                    return;
                }
                if (cConsume != '\"' && cConsume != '\'') {
                    if (cConsume != '/') {
                        if (cConsume == 65535) {
                            tokeniser.eofError(this);
                        } else if (cConsume != '\t' && cConsume != '\n' && cConsume != '\f' && cConsume != '\r') {
                            switch (cConsume) {
                                case '<':
                                    break;
                                case '=':
                                    tokeniserState = TokeniserState.BeforeAttributeValue;
                                    break;
                                case '>':
                                    tokeniser.emitTagPending();
                                    break;
                                default:
                                    tokeniser.tagPending.newAttribute();
                                    characterReader.unconsume();
                                    tokeniserState = TokeniserState.AttributeName;
                                    break;
                            }
                        } else {
                            return;
                        }
                        tokeniserState = TokeniserState.Data;
                    } else {
                        tokeniserState = TokeniserState.SelfClosingStartTag;
                    }
                    tokeniser.transition(tokeniserState);
                }
                tokeniser.error(this);
                tokeniser.tagPending.newAttribute();
                tag = tokeniser.tagPending;
            }
            tag.appendAttributeName(cConsume);
            tokeniserState = TokeniserState.AttributeName;
            tokeniser.transition(tokeniserState);
        }
    },
    BeforeAttributeValue { // from class: org.jsoup.parser.TokeniserState.37
        /* JADX WARN: Failed to find 'out' block for switch in B:24:0x002f. Please report as an issue. */
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            Token.Tag tag;
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume != ' ') {
                    if (cConsume != '\"') {
                        if (cConsume != '`') {
                            if (cConsume == 65535) {
                                tokeniser.eofError(this);
                            } else {
                                if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r') {
                                    return;
                                }
                                if (cConsume != '&') {
                                    if (cConsume != '\'') {
                                        switch (cConsume) {
                                            case '>':
                                                tokeniser.error(this);
                                                break;
                                        }
                                    } else {
                                        tokeniserState = TokeniserState.AttributeValue_singleQuoted;
                                    }
                                }
                                characterReader.unconsume();
                                tokeniserState = TokeniserState.AttributeValue_unquoted;
                            }
                            tokeniser.emitTagPending();
                            tokeniserState = TokeniserState.Data;
                        }
                        tokeniser.error(this);
                        tag = tokeniser.tagPending;
                    } else {
                        tokeniserState = TokeniserState.AttributeValue_doubleQuoted;
                    }
                    tokeniser.transition(tokeniserState);
                }
                return;
            }
            tokeniser.error(this);
            tag = tokeniser.tagPending;
            cConsume = 65533;
            tag.appendAttributeValue(cConsume);
            tokeniserState = TokeniserState.AttributeValue_unquoted;
            tokeniser.transition(tokeniserState);
        }
    },
    AttributeValue_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.38
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            String strConsumeToAnySorted = characterReader.consumeToAnySorted(TokeniserState.attributeDoubleValueCharsSorted);
            if (strConsumeToAnySorted.length() > 0) {
                tokeniser.tagPending.appendAttributeValue(strConsumeToAnySorted);
            } else {
                tokeniser.tagPending.setEmptyAttributeValue();
            }
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeValue((char) 65533);
                return;
            }
            if (cConsume == '\"') {
                tokeniserState = TokeniserState.AfterAttributeValue_quoted;
            } else {
                if (cConsume == '&') {
                    char[] cArrConsumeCharacterReference = tokeniser.consumeCharacterReference(Character.valueOf(TokenParser.DQUOTE), true);
                    Token.Tag tag = tokeniser.tagPending;
                    if (cArrConsumeCharacterReference != null) {
                        tag.appendAttributeValue(cArrConsumeCharacterReference);
                        return;
                    } else {
                        tag.appendAttributeValue('&');
                        return;
                    }
                }
                if (cConsume != 65535) {
                    return;
                }
                tokeniser.eofError(this);
                tokeniserState = TokeniserState.Data;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    AttributeValue_singleQuoted { // from class: org.jsoup.parser.TokeniserState.39
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            String strConsumeToAnySorted = characterReader.consumeToAnySorted(TokeniserState.attributeSingleValueCharsSorted);
            if (strConsumeToAnySorted.length() > 0) {
                tokeniser.tagPending.appendAttributeValue(strConsumeToAnySorted);
            } else {
                tokeniser.tagPending.setEmptyAttributeValue();
            }
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeValue((char) 65533);
                return;
            }
            if (cConsume == 65535) {
                tokeniser.eofError(this);
                tokeniserState = TokeniserState.Data;
            } else {
                if (cConsume == '&') {
                    char[] cArrConsumeCharacterReference = tokeniser.consumeCharacterReference('\'', true);
                    Token.Tag tag = tokeniser.tagPending;
                    if (cArrConsumeCharacterReference != null) {
                        tag.appendAttributeValue(cArrConsumeCharacterReference);
                        return;
                    } else {
                        tag.appendAttributeValue('&');
                        return;
                    }
                }
                if (cConsume != '\'') {
                    return;
                } else {
                    tokeniserState = TokeniserState.AfterAttributeValue_quoted;
                }
            }
            tokeniser.transition(tokeniserState);
        }
    },
    AttributeValue_unquoted { // from class: org.jsoup.parser.TokeniserState.40
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            Token.Tag tag;
            TokeniserState tokeniserState;
            String strConsumeToAny = characterReader.consumeToAny('\t', '\n', TokenParser.CR, '\f', TokenParser.SP, '&', '>', TokeniserState.nullChar, TokenParser.DQUOTE, '\'', '<', '=', '`');
            if (strConsumeToAny.length() > 0) {
                tokeniser.tagPending.appendAttributeValue(strConsumeToAny);
            }
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume == ' ') {
                    tokeniserState = TokeniserState.BeforeAttributeName;
                } else {
                    if (cConsume != '\"' && cConsume != '`') {
                        if (cConsume != 65535) {
                            if (cConsume != '\t' && cConsume != '\n' && cConsume != '\f' && cConsume != '\r') {
                                if (cConsume == '&') {
                                    char[] cArrConsumeCharacterReference = tokeniser.consumeCharacterReference('>', true);
                                    Token.Tag tag2 = tokeniser.tagPending;
                                    if (cArrConsumeCharacterReference != null) {
                                        tag2.appendAttributeValue(cArrConsumeCharacterReference);
                                        return;
                                    } else {
                                        tag2.appendAttributeValue('&');
                                        return;
                                    }
                                }
                                if (cConsume != '\'') {
                                    switch (cConsume) {
                                        case '>':
                                            tokeniser.emitTagPending();
                                            break;
                                    }
                                    return;
                                }
                            }
                            tokeniserState = TokeniserState.BeforeAttributeName;
                        } else {
                            tokeniser.eofError(this);
                        }
                        tokeniserState = TokeniserState.Data;
                    }
                    tokeniser.error(this);
                    tag = tokeniser.tagPending;
                }
                tokeniser.transition(tokeniserState);
                return;
            }
            tokeniser.error(this);
            tag = tokeniser.tagPending;
            cConsume = 65533;
            tag.appendAttributeValue(cConsume);
        }
    },
    AfterAttributeValue_quoted { // from class: org.jsoup.parser.TokeniserState.41
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                tokeniserState = TokeniserState.BeforeAttributeName;
            } else if (cConsume != '/') {
                if (cConsume == '>') {
                    tokeniser.emitTagPending();
                } else if (cConsume != 65535) {
                    tokeniser.error(this);
                    characterReader.unconsume();
                    tokeniserState = TokeniserState.BeforeAttributeName;
                } else {
                    tokeniser.eofError(this);
                }
                tokeniserState = TokeniserState.Data;
            } else {
                tokeniserState = TokeniserState.SelfClosingStartTag;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    SelfClosingStartTag { // from class: org.jsoup.parser.TokeniserState.42
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume == '>') {
                tokeniser.tagPending.selfClosing = true;
                tokeniser.emitTagPending();
            } else {
                if (cConsume != 65535) {
                    tokeniser.error(this);
                    tokeniserState = TokeniserState.BeforeAttributeName;
                    tokeniser.transition(tokeniserState);
                }
                tokeniser.eofError(this);
            }
            tokeniserState = TokeniserState.Data;
            tokeniser.transition(tokeniserState);
        }
    },
    BogusComment { // from class: org.jsoup.parser.TokeniserState.43
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            characterReader.unconsume();
            Token.Comment comment = new Token.Comment();
            comment.bogus = true;
            comment.data.append(characterReader.consumeTo('>'));
            tokeniser.emit(comment);
            tokeniser.advanceTransition(TokeniserState.Data);
        }
    },
    MarkupDeclarationOpen { // from class: org.jsoup.parser.TokeniserState.44
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.matchConsume("--")) {
                tokeniser.createCommentPending();
                tokeniserState = TokeniserState.CommentStart;
            } else if (characterReader.matchConsumeIgnoreCase("DOCTYPE")) {
                tokeniserState = TokeniserState.Doctype;
            } else {
                if (!characterReader.matchConsume("[CDATA[")) {
                    tokeniser.error(this);
                    tokeniser.advanceTransition(TokeniserState.BogusComment);
                    return;
                }
                tokeniserState = TokeniserState.CdataSection;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    CommentStart { // from class: org.jsoup.parser.TokeniserState.45
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume != '-') {
                    if (cConsume == '>') {
                        tokeniser.error(this);
                    } else if (cConsume != 65535) {
                        tokeniser.commentPending.data.append(cConsume);
                    } else {
                        tokeniser.eofError(this);
                    }
                    tokeniser.emitCommentPending();
                    tokeniserState = TokeniserState.Data;
                } else {
                    tokeniserState = TokeniserState.CommentStartDash;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniser.error(this);
            tokeniser.commentPending.data.append((char) 65533);
            tokeniserState = TokeniserState.Comment;
            tokeniser.transition(tokeniserState);
        }
    },
    CommentStartDash { // from class: org.jsoup.parser.TokeniserState.46
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume != '-') {
                    if (cConsume == '>') {
                        tokeniser.error(this);
                    } else if (cConsume != 65535) {
                        tokeniser.commentPending.data.append(cConsume);
                    } else {
                        tokeniser.eofError(this);
                    }
                    tokeniser.emitCommentPending();
                    tokeniserState = TokeniserState.Data;
                } else {
                    tokeniserState = TokeniserState.CommentStartDash;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniser.error(this);
            tokeniser.commentPending.data.append((char) 65533);
            tokeniserState = TokeniserState.Comment;
            tokeniser.transition(tokeniserState);
        }
    },
    Comment { // from class: org.jsoup.parser.TokeniserState.47
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cCurrent = characterReader.current();
            if (cCurrent == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.commentPending.data.append((char) 65533);
            } else if (cCurrent == '-') {
                tokeniser.advanceTransition(TokeniserState.CommentEndDash);
            } else {
                if (cCurrent != 65535) {
                    tokeniser.commentPending.data.append(characterReader.consumeToAny('-', TokeniserState.nullChar));
                    return;
                }
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    CommentEndDash { // from class: org.jsoup.parser.TokeniserState.48
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume == '-') {
                    tokeniserState = TokeniserState.CommentEnd;
                } else if (cConsume != 65535) {
                    StringBuilder sb = tokeniser.commentPending.data;
                    sb.append('-');
                    sb.append(cConsume);
                } else {
                    tokeniser.eofError(this);
                    tokeniser.emitCommentPending();
                    tokeniserState = TokeniserState.Data;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniser.error(this);
            StringBuilder sb2 = tokeniser.commentPending.data;
            sb2.append('-');
            sb2.append((char) 65533);
            tokeniserState = TokeniserState.Comment;
            tokeniser.transition(tokeniserState);
        }
    },
    CommentEnd { // from class: org.jsoup.parser.TokeniserState.49
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume == '!') {
                    tokeniser.error(this);
                    tokeniserState = TokeniserState.CommentEndBang;
                } else {
                    if (cConsume == '-') {
                        tokeniser.error(this);
                        tokeniser.commentPending.data.append('-');
                        return;
                    }
                    if (cConsume != '>') {
                        if (cConsume != 65535) {
                            tokeniser.error(this);
                            StringBuilder sb = tokeniser.commentPending.data;
                            sb.append("--");
                            sb.append(cConsume);
                        } else {
                            tokeniser.eofError(this);
                        }
                    }
                    tokeniser.emitCommentPending();
                    tokeniserState = TokeniserState.Data;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniser.error(this);
            StringBuilder sb2 = tokeniser.commentPending.data;
            sb2.append("--");
            sb2.append((char) 65533);
            tokeniserState = TokeniserState.Comment;
            tokeniser.transition(tokeniserState);
        }
    },
    CommentEndBang { // from class: org.jsoup.parser.TokeniserState.50
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume != '-') {
                    if (cConsume != '>') {
                        if (cConsume != 65535) {
                            StringBuilder sb = tokeniser.commentPending.data;
                            sb.append("--!");
                            sb.append(cConsume);
                        } else {
                            tokeniser.eofError(this);
                        }
                    }
                    tokeniser.emitCommentPending();
                    tokeniserState = TokeniserState.Data;
                } else {
                    tokeniser.commentPending.data.append("--!");
                    tokeniserState = TokeniserState.CommentEndDash;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniser.error(this);
            StringBuilder sb2 = tokeniser.commentPending.data;
            sb2.append("--!");
            sb2.append((char) 65533);
            tokeniserState = TokeniserState.Comment;
            tokeniser.transition(tokeniserState);
        }
    },
    Doctype { // from class: org.jsoup.parser.TokeniserState.51
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                tokeniserState = TokeniserState.BeforeDoctypeName;
            } else {
                if (cConsume != '>') {
                    if (cConsume != 65535) {
                        tokeniser.error(this);
                        tokeniserState = TokeniserState.BeforeDoctypeName;
                    } else {
                        tokeniser.eofError(this);
                    }
                }
                tokeniser.error(this);
                tokeniser.createDoctypePending();
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniserState = TokeniserState.Data;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    BeforeDoctypeName { // from class: org.jsoup.parser.TokeniserState.52
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.matchesLetter()) {
                tokeniser.createDoctypePending();
                tokeniser.transition(TokeniserState.DoctypeName);
                return;
            }
            char cConsume = characterReader.consume();
            if (cConsume == 0) {
                tokeniser.error(this);
                tokeniser.createDoctypePending();
                tokeniser.doctypePending.name.append((char) 65533);
            } else {
                if (cConsume == ' ') {
                    return;
                }
                if (cConsume == 65535) {
                    tokeniser.eofError(this);
                    tokeniser.createDoctypePending();
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniserState = TokeniserState.Data;
                    tokeniser.transition(tokeniserState);
                }
                if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r') {
                    return;
                }
                tokeniser.createDoctypePending();
                tokeniser.doctypePending.name.append(cConsume);
            }
            tokeniserState = TokeniserState.DoctypeName;
            tokeniser.transition(tokeniserState);
        }
    },
    DoctypeName { // from class: org.jsoup.parser.TokeniserState.53
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            StringBuilder sb;
            TokeniserState tokeniserState;
            if (characterReader.matchesLetter()) {
                tokeniser.doctypePending.name.append(characterReader.consumeLetterSequence().toLowerCase());
                return;
            }
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume == ' ') {
                    tokeniserState = TokeniserState.AfterDoctypeName;
                } else {
                    if (cConsume != '>') {
                        if (cConsume != 65535) {
                            if (cConsume != '\t' && cConsume != '\n' && cConsume != '\f' && cConsume != '\r') {
                                sb = tokeniser.doctypePending.name;
                            }
                            tokeniserState = TokeniserState.AfterDoctypeName;
                        } else {
                            tokeniser.eofError(this);
                            tokeniser.doctypePending.forceQuirks = true;
                        }
                    }
                    tokeniser.emitDoctypePending();
                    tokeniserState = TokeniserState.Data;
                }
                tokeniser.transition(tokeniserState);
                return;
            }
            tokeniser.error(this);
            sb = tokeniser.doctypePending.name;
            cConsume = 65533;
            sb.append(cConsume);
        }
    },
    AfterDoctypeName { // from class: org.jsoup.parser.TokeniserState.54
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            TokeniserState tokeniserState2;
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            if (characterReader.matchesAny('\t', '\n', TokenParser.CR, '\f', TokenParser.SP)) {
                characterReader.advance();
                return;
            }
            if (!characterReader.matches('>')) {
                if (characterReader.matchConsumeIgnoreCase("PUBLIC")) {
                    tokeniserState2 = TokeniserState.AfterDoctypePublicKeyword;
                } else if (characterReader.matchConsumeIgnoreCase("SYSTEM")) {
                    tokeniserState2 = TokeniserState.AfterDoctypeSystemKeyword;
                } else {
                    tokeniser.error(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniserState = TokeniserState.BogusDoctype;
                }
                tokeniser.transition(tokeniserState2);
                return;
            }
            tokeniser.emitDoctypePending();
            tokeniserState = TokeniserState.Data;
            tokeniser.advanceTransition(tokeniserState);
        }
    },
    AfterDoctypePublicKeyword { // from class: org.jsoup.parser.TokeniserState.55
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                tokeniserState = TokeniserState.BeforeDoctypePublicIdentifier;
            } else if (cConsume == '\"') {
                tokeniser.error(this);
                tokeniserState = TokeniserState.DoctypePublicIdentifier_doubleQuoted;
            } else if (cConsume != '\'') {
                if (cConsume == '>') {
                    tokeniser.error(this);
                } else if (cConsume != 65535) {
                    tokeniser.error(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniserState = TokeniserState.BogusDoctype;
                } else {
                    tokeniser.eofError(this);
                }
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniserState = TokeniserState.Data;
            } else {
                tokeniser.error(this);
                tokeniserState = TokeniserState.DoctypePublicIdentifier_singleQuoted;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    BeforeDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.56
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                return;
            }
            if (cConsume == '\"') {
                tokeniserState = TokeniserState.DoctypePublicIdentifier_doubleQuoted;
            } else if (cConsume != '\'') {
                if (cConsume == '>') {
                    tokeniser.error(this);
                } else if (cConsume != 65535) {
                    tokeniser.error(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniserState = TokeniserState.BogusDoctype;
                } else {
                    tokeniser.eofError(this);
                }
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniserState = TokeniserState.Data;
            } else {
                tokeniserState = TokeniserState.DoctypePublicIdentifier_singleQuoted;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    DoctypePublicIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.57
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            StringBuilder sb;
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume != '\"') {
                    if (cConsume == '>') {
                        tokeniser.error(this);
                    } else if (cConsume != 65535) {
                        sb = tokeniser.doctypePending.publicIdentifier;
                    } else {
                        tokeniser.eofError(this);
                    }
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniserState = TokeniserState.Data;
                } else {
                    tokeniserState = TokeniserState.AfterDoctypePublicIdentifier;
                }
                tokeniser.transition(tokeniserState);
                return;
            }
            tokeniser.error(this);
            sb = tokeniser.doctypePending.publicIdentifier;
            cConsume = 65533;
            sb.append(cConsume);
        }
    },
    DoctypePublicIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.58
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            StringBuilder sb;
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume != '\'') {
                    if (cConsume == '>') {
                        tokeniser.error(this);
                    } else if (cConsume != 65535) {
                        sb = tokeniser.doctypePending.publicIdentifier;
                    } else {
                        tokeniser.eofError(this);
                    }
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniserState = TokeniserState.Data;
                } else {
                    tokeniserState = TokeniserState.AfterDoctypePublicIdentifier;
                }
                tokeniser.transition(tokeniserState);
                return;
            }
            tokeniser.error(this);
            sb = tokeniser.doctypePending.publicIdentifier;
            cConsume = 65533;
            sb.append(cConsume);
        }
    },
    AfterDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.59
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                tokeniserState = TokeniserState.BetweenDoctypePublicAndSystemIdentifiers;
            } else if (cConsume == '\"') {
                tokeniser.error(this);
                tokeniserState = TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
            } else if (cConsume == '\'') {
                tokeniser.error(this);
                tokeniserState = TokeniserState.DoctypeSystemIdentifier_singleQuoted;
            } else if (cConsume == '>') {
                tokeniser.emitDoctypePending();
                tokeniserState = TokeniserState.Data;
            } else if (cConsume != 65535) {
                tokeniser.error(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniserState = TokeniserState.BogusDoctype;
            } else {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniserState = TokeniserState.Data;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers { // from class: org.jsoup.parser.TokeniserState.60
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                return;
            }
            if (cConsume == '\"') {
                tokeniser.error(this);
                tokeniserState = TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
            } else if (cConsume == '\'') {
                tokeniser.error(this);
                tokeniserState = TokeniserState.DoctypeSystemIdentifier_singleQuoted;
            } else if (cConsume == '>') {
                tokeniser.emitDoctypePending();
                tokeniserState = TokeniserState.Data;
            } else if (cConsume != 65535) {
                tokeniser.error(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniserState = TokeniserState.BogusDoctype;
            } else {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniserState = TokeniserState.Data;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    AfterDoctypeSystemKeyword { // from class: org.jsoup.parser.TokeniserState.61
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                tokeniserState = TokeniserState.BeforeDoctypeSystemIdentifier;
            } else if (cConsume == '\"') {
                tokeniser.error(this);
                tokeniserState = TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
            } else if (cConsume != '\'') {
                if (cConsume == '>') {
                    tokeniser.error(this);
                } else {
                    if (cConsume != 65535) {
                        tokeniser.error(this);
                        tokeniser.doctypePending.forceQuirks = true;
                        tokeniser.emitDoctypePending();
                        return;
                    }
                    tokeniser.eofError(this);
                }
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniserState = TokeniserState.Data;
            } else {
                tokeniser.error(this);
                tokeniserState = TokeniserState.DoctypeSystemIdentifier_singleQuoted;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    BeforeDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.62
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                return;
            }
            if (cConsume == '\"') {
                tokeniserState = TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
            } else if (cConsume != '\'') {
                if (cConsume == '>') {
                    tokeniser.error(this);
                } else if (cConsume != 65535) {
                    tokeniser.error(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniserState = TokeniserState.BogusDoctype;
                } else {
                    tokeniser.eofError(this);
                }
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniserState = TokeniserState.Data;
            } else {
                tokeniserState = TokeniserState.DoctypeSystemIdentifier_singleQuoted;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    DoctypeSystemIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.63
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            StringBuilder sb;
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume != '\"') {
                    if (cConsume == '>') {
                        tokeniser.error(this);
                    } else if (cConsume != 65535) {
                        sb = tokeniser.doctypePending.systemIdentifier;
                    } else {
                        tokeniser.eofError(this);
                    }
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniserState = TokeniserState.Data;
                } else {
                    tokeniserState = TokeniserState.AfterDoctypeSystemIdentifier;
                }
                tokeniser.transition(tokeniserState);
                return;
            }
            tokeniser.error(this);
            sb = tokeniser.doctypePending.systemIdentifier;
            cConsume = 65533;
            sb.append(cConsume);
        }
    },
    DoctypeSystemIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.64
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            StringBuilder sb;
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume != 0) {
                if (cConsume != '\'') {
                    if (cConsume == '>') {
                        tokeniser.error(this);
                    } else if (cConsume != 65535) {
                        sb = tokeniser.doctypePending.systemIdentifier;
                    } else {
                        tokeniser.eofError(this);
                    }
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniserState = TokeniserState.Data;
                } else {
                    tokeniserState = TokeniserState.AfterDoctypeSystemIdentifier;
                }
                tokeniser.transition(tokeniserState);
                return;
            }
            tokeniser.error(this);
            sb = tokeniser.doctypePending.systemIdentifier;
            cConsume = 65533;
            sb.append(cConsume);
        }
    },
    AfterDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.65
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                return;
            }
            if (cConsume == '>') {
                tokeniser.emitDoctypePending();
                tokeniserState = TokeniserState.Data;
            } else if (cConsume != 65535) {
                tokeniser.error(this);
                tokeniserState = TokeniserState.BogusDoctype;
            } else {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniserState = TokeniserState.Data;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    BogusDoctype { // from class: org.jsoup.parser.TokeniserState.66
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char cConsume = characterReader.consume();
            if (cConsume == '>' || cConsume == 65535) {
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    CdataSection { // from class: org.jsoup.parser.TokeniserState.67
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.emit(characterReader.consumeTo("]]>"));
            characterReader.matchConsume("]]>");
            tokeniser.transition(TokeniserState.Data);
        }
    };

    private static final char[] attributeDoubleValueCharsSorted;
    private static final char[] attributeNameCharsSorted;
    private static final char[] attributeSingleValueCharsSorted;
    private static final char eof = 65535;
    static final char nullChar = 0;
    private static final char replacementChar = 65533;
    private static final String replacementStr;

    static {
        char[] cArr = {'\'', '&', nullChar};
        attributeSingleValueCharsSorted = cArr;
        char[] cArr2 = {TokenParser.DQUOTE, '&', nullChar};
        attributeDoubleValueCharsSorted = cArr2;
        char[] cArr3 = {'\t', '\n', TokenParser.CR, '\f', TokenParser.SP, '/', '=', '>', nullChar, TokenParser.DQUOTE, '\'', '<'};
        attributeNameCharsSorted = cArr3;
        replacementStr = String.valueOf((char) 65533);
        Arrays.sort(cArr);
        Arrays.sort(cArr2);
        Arrays.sort(cArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleDataDoubleEscapeTag(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (characterReader.matchesLetter()) {
            String strConsumeLetterSequence = characterReader.consumeLetterSequence();
            tokeniser.dataBuffer.append(strConsumeLetterSequence.toLowerCase());
            tokeniser.emit(strConsumeLetterSequence);
            return;
        }
        char cConsume = characterReader.consume();
        if (cConsume != '\t' && cConsume != '\n' && cConsume != '\f' && cConsume != '\r' && cConsume != ' ' && cConsume != '/' && cConsume != '>') {
            characterReader.unconsume();
            tokeniser.transition(tokeniserState2);
        } else {
            if (tokeniser.dataBuffer.toString().equals("script")) {
                tokeniser.transition(tokeniserState);
            } else {
                tokeniser.transition(tokeniserState2);
            }
            tokeniser.emit(cConsume);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleDataEndTag(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState) {
        TokeniserState tokeniserState2;
        if (characterReader.matchesLetter()) {
            String strConsumeLetterSequence = characterReader.consumeLetterSequence();
            tokeniser.tagPending.appendTagName(strConsumeLetterSequence.toLowerCase());
            tokeniser.dataBuffer.append(strConsumeLetterSequence);
            return;
        }
        if (tokeniser.isAppropriateEndTagToken() && !characterReader.isEmpty()) {
            char cConsume = characterReader.consume();
            if (cConsume == '\t' || cConsume == '\n' || cConsume == '\f' || cConsume == '\r' || cConsume == ' ') {
                tokeniserState2 = BeforeAttributeName;
            } else if (cConsume == '/') {
                tokeniserState2 = SelfClosingStartTag;
            } else if (cConsume != '>') {
                tokeniser.dataBuffer.append(cConsume);
            } else {
                tokeniser.emitTagPending();
                tokeniserState2 = Data;
            }
            tokeniser.transition(tokeniserState2);
            return;
        }
        tokeniser.emit("</" + tokeniser.dataBuffer.toString());
        tokeniser.transition(tokeniserState);
    }

    public abstract void read(Tokeniser tokeniser, CharacterReader characterReader);
}
