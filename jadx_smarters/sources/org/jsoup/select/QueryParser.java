package org.jsoup.select;

import com.amazonaws.services.s3.model.InstructionFileId;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.jsoup.select.StructuralEvaluator;

/* JADX INFO: loaded from: classes4.dex */
class QueryParser {
    private List<Evaluator> evals = new ArrayList();
    private String query;
    private TokenQueue tq;
    private static final String[] combinators = {",", ">", "+", "~", " "};
    private static final String[] AttributeEvals = {"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern NTH_AB = Pattern.compile("((\\+|-)?(\\d+)?)n(\\s*(\\+|-)?\\s*\\d+)?", 2);
    private static final Pattern NTH_B = Pattern.compile("(\\+|-)?(\\d+)");

    private QueryParser(String str) {
        this.query = str;
        this.tq = new TokenQueue(str);
    }

    private void allElements() {
        this.evals.add(new Evaluator.AllElements());
    }

    private void byAttribute() {
        List<Evaluator> list;
        Evaluator attributeWithValueMatching;
        TokenQueue tokenQueue = new TokenQueue(this.tq.chompBalanced('[', ']'));
        String strConsumeToAny = tokenQueue.consumeToAny(AttributeEvals);
        Validate.notEmpty(strConsumeToAny);
        tokenQueue.consumeWhitespace();
        if (tokenQueue.isEmpty()) {
            if (strConsumeToAny.startsWith("^")) {
                this.evals.add(new Evaluator.AttributeStarting(strConsumeToAny.substring(1)));
                return;
            } else {
                this.evals.add(new Evaluator.Attribute(strConsumeToAny));
                return;
            }
        }
        if (tokenQueue.matchChomp("=")) {
            list = this.evals;
            attributeWithValueMatching = new Evaluator.AttributeWithValue(strConsumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("!=")) {
            list = this.evals;
            attributeWithValueMatching = new Evaluator.AttributeWithValueNot(strConsumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("^=")) {
            list = this.evals;
            attributeWithValueMatching = new Evaluator.AttributeWithValueStarting(strConsumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("$=")) {
            list = this.evals;
            attributeWithValueMatching = new Evaluator.AttributeWithValueEnding(strConsumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("*=")) {
            list = this.evals;
            attributeWithValueMatching = new Evaluator.AttributeWithValueContaining(strConsumeToAny, tokenQueue.remainder());
        } else {
            if (!tokenQueue.matchChomp("~=")) {
                throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", this.query, tokenQueue.remainder());
            }
            list = this.evals;
            attributeWithValueMatching = new Evaluator.AttributeWithValueMatching(strConsumeToAny, Pattern.compile(tokenQueue.remainder()));
        }
        list.add(attributeWithValueMatching);
    }

    private void byClass() {
        String strConsumeCssIdentifier = this.tq.consumeCssIdentifier();
        Validate.notEmpty(strConsumeCssIdentifier);
        this.evals.add(new Evaluator.Class(strConsumeCssIdentifier.trim().toLowerCase()));
    }

    private void byId() {
        String strConsumeCssIdentifier = this.tq.consumeCssIdentifier();
        Validate.notEmpty(strConsumeCssIdentifier);
        this.evals.add(new Evaluator.Id(strConsumeCssIdentifier));
    }

    private void byTag() {
        String strConsumeElementSelector = this.tq.consumeElementSelector();
        Validate.notEmpty(strConsumeElementSelector);
        if (strConsumeElementSelector.contains("|")) {
            strConsumeElementSelector = strConsumeElementSelector.replace("|", ":");
        }
        this.evals.add(new Evaluator.Tag(strConsumeElementSelector.trim().toLowerCase()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void combinator(char r11) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.QueryParser.combinator(char):void");
    }

    private int consumeIndex() {
        String strTrim = this.tq.chompTo(")").trim();
        Validate.isTrue(StringUtil.isNumeric(strTrim), "Index must be numeric");
        return Integer.parseInt(strTrim);
    }

    private String consumeSubQuery() {
        String str;
        StringBuilder sb = new StringBuilder();
        while (!this.tq.isEmpty()) {
            if (this.tq.matches("(")) {
                sb.append("(");
                sb.append(this.tq.chompBalanced('(', ')'));
                str = ")";
            } else if (this.tq.matches("[")) {
                sb.append("[");
                sb.append(this.tq.chompBalanced('[', ']'));
                str = "]";
            } else {
                if (this.tq.matchesAny(combinators)) {
                    break;
                }
                sb.append(this.tq.consume());
            }
            sb.append(str);
        }
        return sb.toString();
    }

    private void contains(boolean z9) {
        List<Evaluator> list;
        Evaluator containsText;
        this.tq.consume(z9 ? ":containsOwn" : ":contains");
        String strUnescape = TokenQueue.unescape(this.tq.chompBalanced('(', ')'));
        Validate.notEmpty(strUnescape, ":contains(text) query must not be empty");
        if (z9) {
            list = this.evals;
            containsText = new Evaluator.ContainsOwnText(strUnescape);
        } else {
            list = this.evals;
            containsText = new Evaluator.ContainsText(strUnescape);
        }
        list.add(containsText);
    }

    private void cssNthChild(boolean z9, boolean z10) {
        int i9;
        List<Evaluator> list;
        Evaluator isNthChild;
        String lowerCase = this.tq.chompTo(")").trim().toLowerCase();
        Matcher matcher = NTH_AB.matcher(lowerCase);
        Matcher matcher2 = NTH_B.matcher(lowerCase);
        if ("odd".equals(lowerCase)) {
            i = 2;
            i9 = 1;
        } else if ("even".equals(lowerCase)) {
            i = 2;
            i9 = 0;
        } else if (matcher.matches()) {
            int i10 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
            i9 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
            i = i10;
        } else {
            if (!matcher2.matches()) {
                throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", lowerCase);
            }
            i9 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
        }
        if (z10) {
            if (z9) {
                list = this.evals;
                isNthChild = new Evaluator.IsNthLastOfType(i, i9);
            } else {
                list = this.evals;
                isNthChild = new Evaluator.IsNthOfType(i, i9);
            }
        } else if (z9) {
            list = this.evals;
            isNthChild = new Evaluator.IsNthLastChild(i, i9);
        } else {
            list = this.evals;
            isNthChild = new Evaluator.IsNthChild(i, i9);
        }
        list.add(isNthChild);
    }

    private void findElements() {
        List<Evaluator> list;
        Evaluator isRoot;
        if (this.tq.matchChomp(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER)) {
            byId();
            return;
        }
        if (this.tq.matchChomp(InstructionFileId.DOT)) {
            byClass();
            return;
        }
        if (this.tq.matchesWord()) {
            byTag();
            return;
        }
        if (this.tq.matches("[")) {
            byAttribute();
            return;
        }
        if (this.tq.matchChomp("*")) {
            allElements();
            return;
        }
        if (this.tq.matchChomp(":lt(")) {
            indexLessThan();
            return;
        }
        if (this.tq.matchChomp(":gt(")) {
            indexGreaterThan();
            return;
        }
        if (this.tq.matchChomp(":eq(")) {
            indexEquals();
            return;
        }
        if (this.tq.matches(":has(")) {
            has();
            return;
        }
        if (this.tq.matches(":contains(")) {
            contains(false);
            return;
        }
        if (this.tq.matches(":containsOwn(")) {
            contains(true);
            return;
        }
        if (this.tq.matches(":matches(")) {
            matches(false);
            return;
        }
        if (this.tq.matches(":matchesOwn(")) {
            matches(true);
            return;
        }
        if (this.tq.matches(":not(")) {
            not();
            return;
        }
        if (this.tq.matchChomp(":nth-child(")) {
            cssNthChild(false, false);
            return;
        }
        if (this.tq.matchChomp(":nth-last-child(")) {
            cssNthChild(true, false);
            return;
        }
        if (this.tq.matchChomp(":nth-of-type(")) {
            cssNthChild(false, true);
            return;
        }
        if (this.tq.matchChomp(":nth-last-of-type(")) {
            cssNthChild(true, true);
            return;
        }
        if (this.tq.matchChomp(":first-child")) {
            list = this.evals;
            isRoot = new Evaluator.IsFirstChild();
        } else if (this.tq.matchChomp(":last-child")) {
            list = this.evals;
            isRoot = new Evaluator.IsLastChild();
        } else if (this.tq.matchChomp(":first-of-type")) {
            list = this.evals;
            isRoot = new Evaluator.IsFirstOfType();
        } else if (this.tq.matchChomp(":last-of-type")) {
            list = this.evals;
            isRoot = new Evaluator.IsLastOfType();
        } else if (this.tq.matchChomp(":only-child")) {
            list = this.evals;
            isRoot = new Evaluator.IsOnlyChild();
        } else if (this.tq.matchChomp(":only-of-type")) {
            list = this.evals;
            isRoot = new Evaluator.IsOnlyOfType();
        } else if (this.tq.matchChomp(":empty")) {
            list = this.evals;
            isRoot = new Evaluator.IsEmpty();
        } else {
            if (!this.tq.matchChomp(":root")) {
                throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.query, this.tq.remainder());
            }
            list = this.evals;
            isRoot = new Evaluator.IsRoot();
        }
        list.add(isRoot);
    }

    private void has() {
        this.tq.consume(":has");
        String strChompBalanced = this.tq.chompBalanced('(', ')');
        Validate.notEmpty(strChompBalanced, ":has(el) subselect must not be empty");
        this.evals.add(new StructuralEvaluator.Has(parse(strChompBalanced)));
    }

    private void indexEquals() {
        this.evals.add(new Evaluator.IndexEquals(consumeIndex()));
    }

    private void indexGreaterThan() {
        this.evals.add(new Evaluator.IndexGreaterThan(consumeIndex()));
    }

    private void indexLessThan() {
        this.evals.add(new Evaluator.IndexLessThan(consumeIndex()));
    }

    private void matches(boolean z9) {
        List<Evaluator> list;
        Evaluator matches;
        this.tq.consume(z9 ? ":matchesOwn" : ":matches");
        String strChompBalanced = this.tq.chompBalanced('(', ')');
        Validate.notEmpty(strChompBalanced, ":matches(regex) query must not be empty");
        if (z9) {
            list = this.evals;
            matches = new Evaluator.MatchesOwn(Pattern.compile(strChompBalanced));
        } else {
            list = this.evals;
            matches = new Evaluator.Matches(Pattern.compile(strChompBalanced));
        }
        list.add(matches);
    }

    private void not() {
        this.tq.consume(":not");
        String strChompBalanced = this.tq.chompBalanced('(', ')');
        Validate.notEmpty(strChompBalanced, ":not(selector) subselect must not be empty");
        this.evals.add(new StructuralEvaluator.Not(parse(strChompBalanced)));
    }

    public static Evaluator parse(String str) {
        return new QueryParser(str).parse();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0026, code lost:
    
        findElements();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:5:0x0019). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0041 -> B:6:0x001f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.jsoup.select.Evaluator parse() {
        /*
            r3 = this;
            org.jsoup.parser.TokenQueue r0 = r3.tq
            r0.consumeWhitespace()
            org.jsoup.parser.TokenQueue r0 = r3.tq
            java.lang.String[] r1 = org.jsoup.select.QueryParser.combinators
            boolean r0 = r0.matchesAny(r1)
            if (r0 == 0) goto L23
            java.util.List<org.jsoup.select.Evaluator> r0 = r3.evals
            org.jsoup.select.StructuralEvaluator$Root r1 = new org.jsoup.select.StructuralEvaluator$Root
            r1.<init>()
            r0.add(r1)
        L19:
            org.jsoup.parser.TokenQueue r0 = r3.tq
            char r0 = r0.consume()
        L1f:
            r3.combinator(r0)
            goto L26
        L23:
            r3.findElements()
        L26:
            org.jsoup.parser.TokenQueue r0 = r3.tq
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L44
            org.jsoup.parser.TokenQueue r0 = r3.tq
            boolean r0 = r0.consumeWhitespace()
            org.jsoup.parser.TokenQueue r1 = r3.tq
            java.lang.String[] r2 = org.jsoup.select.QueryParser.combinators
            boolean r1 = r1.matchesAny(r2)
            if (r1 == 0) goto L3f
            goto L19
        L3f:
            if (r0 == 0) goto L23
            r0 = 32
            goto L1f
        L44:
            java.util.List<org.jsoup.select.Evaluator> r0 = r3.evals
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L57
            java.util.List<org.jsoup.select.Evaluator> r0 = r3.evals
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            org.jsoup.select.Evaluator r0 = (org.jsoup.select.Evaluator) r0
            return r0
        L57:
            org.jsoup.select.CombiningEvaluator$And r0 = new org.jsoup.select.CombiningEvaluator$And
            java.util.List<org.jsoup.select.Evaluator> r1 = r3.evals
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.QueryParser.parse():org.jsoup.select.Evaluator");
    }
}
