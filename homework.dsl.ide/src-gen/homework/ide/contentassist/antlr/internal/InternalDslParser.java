package homework.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import homework.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Course'", "'{'", "'}'", "'homework'", "','", "'person'", "'Homework'", "'Describe'", "'Teacher'", "'student'", "'('", "')'", "'teacher'", "'Student'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }


    	private DslGrammarAccess grammarAccess;

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleCourse"
    // InternalDsl.g:53:1: entryRuleCourse : ruleCourse EOF ;
    public final void entryRuleCourse() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleCourse EOF )
            // InternalDsl.g:55:1: ruleCourse EOF
            {
             before(grammarAccess.getCourseRule()); 
            pushFollow(FOLLOW_1);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getCourseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // InternalDsl.g:62:1: ruleCourse : ( ( rule__Course__Group__0 ) ) ;
    public final void ruleCourse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Course__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__Course__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Course__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__Course__Group__0 )
            {
             before(grammarAccess.getCourseAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Course__Group__0 )
            // InternalDsl.g:69:4: rule__Course__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRulePerson"
    // InternalDsl.g:78:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( rulePerson EOF )
            // InternalDsl.g:80:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalDsl.g:87:1: rulePerson : ( ( rule__Person__Alternatives ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Person__Alternatives ) ) )
            // InternalDsl.g:92:2: ( ( rule__Person__Alternatives ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Person__Alternatives ) )
            // InternalDsl.g:93:3: ( rule__Person__Alternatives )
            {
             before(grammarAccess.getPersonAccess().getAlternatives()); 
            // InternalDsl.g:94:3: ( rule__Person__Alternatives )
            // InternalDsl.g:94:4: rule__Person__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleHomework"
    // InternalDsl.g:103:1: entryRuleHomework : ruleHomework EOF ;
    public final void entryRuleHomework() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleHomework EOF )
            // InternalDsl.g:105:1: ruleHomework EOF
            {
             before(grammarAccess.getHomeworkRule()); 
            pushFollow(FOLLOW_1);
            ruleHomework();

            state._fsp--;

             after(grammarAccess.getHomeworkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHomework"


    // $ANTLR start "ruleHomework"
    // InternalDsl.g:112:1: ruleHomework : ( ( rule__Homework__Group__0 ) ) ;
    public final void ruleHomework() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Homework__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__Homework__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Homework__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__Homework__Group__0 )
            {
             before(grammarAccess.getHomeworkAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__Homework__Group__0 )
            // InternalDsl.g:119:4: rule__Homework__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Homework__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHomeworkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHomework"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleEString EOF )
            // InternalDsl.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalDsl.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDsl.g:144:3: ( rule__EString__Alternatives )
            // InternalDsl.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTeacher"
    // InternalDsl.g:153:1: entryRuleTeacher : ruleTeacher EOF ;
    public final void entryRuleTeacher() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleTeacher EOF )
            // InternalDsl.g:155:1: ruleTeacher EOF
            {
             before(grammarAccess.getTeacherRule()); 
            pushFollow(FOLLOW_1);
            ruleTeacher();

            state._fsp--;

             after(grammarAccess.getTeacherRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTeacher"


    // $ANTLR start "ruleTeacher"
    // InternalDsl.g:162:1: ruleTeacher : ( ( rule__Teacher__Group__0 ) ) ;
    public final void ruleTeacher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Teacher__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__Teacher__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Teacher__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__Teacher__Group__0 )
            {
             before(grammarAccess.getTeacherAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__Teacher__Group__0 )
            // InternalDsl.g:169:4: rule__Teacher__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTeacher"


    // $ANTLR start "entryRuleStudent"
    // InternalDsl.g:178:1: entryRuleStudent : ruleStudent EOF ;
    public final void entryRuleStudent() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleStudent EOF )
            // InternalDsl.g:180:1: ruleStudent EOF
            {
             before(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_1);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getStudentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // InternalDsl.g:187:1: ruleStudent : ( ( rule__Student__Group__0 ) ) ;
    public final void ruleStudent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Student__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Student__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Student__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Student__Group__0 )
            {
             before(grammarAccess.getStudentAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Student__Group__0 )
            // InternalDsl.g:194:4: rule__Student__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStudent"


    // $ANTLR start "rule__Person__Alternatives"
    // InternalDsl.g:202:1: rule__Person__Alternatives : ( ( ruleTeacher ) | ( ruleStudent ) );
    public final void rule__Person__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:206:1: ( ( ruleTeacher ) | ( ruleStudent ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:207:2: ( ruleTeacher )
                    {
                    // InternalDsl.g:207:2: ( ruleTeacher )
                    // InternalDsl.g:208:3: ruleTeacher
                    {
                     before(grammarAccess.getPersonAccess().getTeacherParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTeacher();

                    state._fsp--;

                     after(grammarAccess.getPersonAccess().getTeacherParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:213:2: ( ruleStudent )
                    {
                    // InternalDsl.g:213:2: ( ruleStudent )
                    // InternalDsl.g:214:3: ruleStudent
                    {
                     before(grammarAccess.getPersonAccess().getStudentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStudent();

                    state._fsp--;

                     after(grammarAccess.getPersonAccess().getStudentParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDsl.g:223:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:227:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:228:2: ( RULE_STRING )
                    {
                    // InternalDsl.g:228:2: ( RULE_STRING )
                    // InternalDsl.g:229:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:234:2: ( RULE_ID )
                    {
                    // InternalDsl.g:234:2: ( RULE_ID )
                    // InternalDsl.g:235:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Course__Group__0"
    // InternalDsl.g:244:1: rule__Course__Group__0 : rule__Course__Group__0__Impl rule__Course__Group__1 ;
    public final void rule__Course__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:248:1: ( rule__Course__Group__0__Impl rule__Course__Group__1 )
            // InternalDsl.g:249:2: rule__Course__Group__0__Impl rule__Course__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Course__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__0"


    // $ANTLR start "rule__Course__Group__0__Impl"
    // InternalDsl.g:256:1: rule__Course__Group__0__Impl : ( () ) ;
    public final void rule__Course__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:260:1: ( ( () ) )
            // InternalDsl.g:261:1: ( () )
            {
            // InternalDsl.g:261:1: ( () )
            // InternalDsl.g:262:2: ()
            {
             before(grammarAccess.getCourseAccess().getCourseAction_0()); 
            // InternalDsl.g:263:2: ()
            // InternalDsl.g:263:3: 
            {
            }

             after(grammarAccess.getCourseAccess().getCourseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__0__Impl"


    // $ANTLR start "rule__Course__Group__1"
    // InternalDsl.g:271:1: rule__Course__Group__1 : rule__Course__Group__1__Impl rule__Course__Group__2 ;
    public final void rule__Course__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:275:1: ( rule__Course__Group__1__Impl rule__Course__Group__2 )
            // InternalDsl.g:276:2: rule__Course__Group__1__Impl rule__Course__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Course__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__1"


    // $ANTLR start "rule__Course__Group__1__Impl"
    // InternalDsl.g:283:1: rule__Course__Group__1__Impl : ( 'Course' ) ;
    public final void rule__Course__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:287:1: ( ( 'Course' ) )
            // InternalDsl.g:288:1: ( 'Course' )
            {
            // InternalDsl.g:288:1: ( 'Course' )
            // InternalDsl.g:289:2: 'Course'
            {
             before(grammarAccess.getCourseAccess().getCourseKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCourseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__1__Impl"


    // $ANTLR start "rule__Course__Group__2"
    // InternalDsl.g:298:1: rule__Course__Group__2 : rule__Course__Group__2__Impl rule__Course__Group__3 ;
    public final void rule__Course__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:302:1: ( rule__Course__Group__2__Impl rule__Course__Group__3 )
            // InternalDsl.g:303:2: rule__Course__Group__2__Impl rule__Course__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Course__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__2"


    // $ANTLR start "rule__Course__Group__2__Impl"
    // InternalDsl.g:310:1: rule__Course__Group__2__Impl : ( ( rule__Course__NameAssignment_2 ) ) ;
    public final void rule__Course__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:314:1: ( ( ( rule__Course__NameAssignment_2 ) ) )
            // InternalDsl.g:315:1: ( ( rule__Course__NameAssignment_2 ) )
            {
            // InternalDsl.g:315:1: ( ( rule__Course__NameAssignment_2 ) )
            // InternalDsl.g:316:2: ( rule__Course__NameAssignment_2 )
            {
             before(grammarAccess.getCourseAccess().getNameAssignment_2()); 
            // InternalDsl.g:317:2: ( rule__Course__NameAssignment_2 )
            // InternalDsl.g:317:3: rule__Course__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Course__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__2__Impl"


    // $ANTLR start "rule__Course__Group__3"
    // InternalDsl.g:325:1: rule__Course__Group__3 : rule__Course__Group__3__Impl rule__Course__Group__4 ;
    public final void rule__Course__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:329:1: ( rule__Course__Group__3__Impl rule__Course__Group__4 )
            // InternalDsl.g:330:2: rule__Course__Group__3__Impl rule__Course__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Course__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__3"


    // $ANTLR start "rule__Course__Group__3__Impl"
    // InternalDsl.g:337:1: rule__Course__Group__3__Impl : ( '{' ) ;
    public final void rule__Course__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:1: ( ( '{' ) )
            // InternalDsl.g:342:1: ( '{' )
            {
            // InternalDsl.g:342:1: ( '{' )
            // InternalDsl.g:343:2: '{'
            {
             before(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__3__Impl"


    // $ANTLR start "rule__Course__Group__4"
    // InternalDsl.g:352:1: rule__Course__Group__4 : rule__Course__Group__4__Impl rule__Course__Group__5 ;
    public final void rule__Course__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:356:1: ( rule__Course__Group__4__Impl rule__Course__Group__5 )
            // InternalDsl.g:357:2: rule__Course__Group__4__Impl rule__Course__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Course__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__4"


    // $ANTLR start "rule__Course__Group__4__Impl"
    // InternalDsl.g:364:1: rule__Course__Group__4__Impl : ( ( rule__Course__Group_4__0 )? ) ;
    public final void rule__Course__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:368:1: ( ( ( rule__Course__Group_4__0 )? ) )
            // InternalDsl.g:369:1: ( ( rule__Course__Group_4__0 )? )
            {
            // InternalDsl.g:369:1: ( ( rule__Course__Group_4__0 )? )
            // InternalDsl.g:370:2: ( rule__Course__Group_4__0 )?
            {
             before(grammarAccess.getCourseAccess().getGroup_4()); 
            // InternalDsl.g:371:2: ( rule__Course__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:371:3: rule__Course__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Course__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCourseAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__4__Impl"


    // $ANTLR start "rule__Course__Group__5"
    // InternalDsl.g:379:1: rule__Course__Group__5 : rule__Course__Group__5__Impl rule__Course__Group__6 ;
    public final void rule__Course__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:383:1: ( rule__Course__Group__5__Impl rule__Course__Group__6 )
            // InternalDsl.g:384:2: rule__Course__Group__5__Impl rule__Course__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Course__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__5"


    // $ANTLR start "rule__Course__Group__5__Impl"
    // InternalDsl.g:391:1: rule__Course__Group__5__Impl : ( ( rule__Course__Group_5__0 )? ) ;
    public final void rule__Course__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:395:1: ( ( ( rule__Course__Group_5__0 )? ) )
            // InternalDsl.g:396:1: ( ( rule__Course__Group_5__0 )? )
            {
            // InternalDsl.g:396:1: ( ( rule__Course__Group_5__0 )? )
            // InternalDsl.g:397:2: ( rule__Course__Group_5__0 )?
            {
             before(grammarAccess.getCourseAccess().getGroup_5()); 
            // InternalDsl.g:398:2: ( rule__Course__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:398:3: rule__Course__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Course__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCourseAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__5__Impl"


    // $ANTLR start "rule__Course__Group__6"
    // InternalDsl.g:406:1: rule__Course__Group__6 : rule__Course__Group__6__Impl ;
    public final void rule__Course__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:410:1: ( rule__Course__Group__6__Impl )
            // InternalDsl.g:411:2: rule__Course__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__6"


    // $ANTLR start "rule__Course__Group__6__Impl"
    // InternalDsl.g:417:1: rule__Course__Group__6__Impl : ( '}' ) ;
    public final void rule__Course__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:421:1: ( ( '}' ) )
            // InternalDsl.g:422:1: ( '}' )
            {
            // InternalDsl.g:422:1: ( '}' )
            // InternalDsl.g:423:2: '}'
            {
             before(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__6__Impl"


    // $ANTLR start "rule__Course__Group_4__0"
    // InternalDsl.g:433:1: rule__Course__Group_4__0 : rule__Course__Group_4__0__Impl rule__Course__Group_4__1 ;
    public final void rule__Course__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:437:1: ( rule__Course__Group_4__0__Impl rule__Course__Group_4__1 )
            // InternalDsl.g:438:2: rule__Course__Group_4__0__Impl rule__Course__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Course__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__0"


    // $ANTLR start "rule__Course__Group_4__0__Impl"
    // InternalDsl.g:445:1: rule__Course__Group_4__0__Impl : ( 'homework' ) ;
    public final void rule__Course__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:449:1: ( ( 'homework' ) )
            // InternalDsl.g:450:1: ( 'homework' )
            {
            // InternalDsl.g:450:1: ( 'homework' )
            // InternalDsl.g:451:2: 'homework'
            {
             before(grammarAccess.getCourseAccess().getHomeworkKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getHomeworkKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__0__Impl"


    // $ANTLR start "rule__Course__Group_4__1"
    // InternalDsl.g:460:1: rule__Course__Group_4__1 : rule__Course__Group_4__1__Impl rule__Course__Group_4__2 ;
    public final void rule__Course__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:464:1: ( rule__Course__Group_4__1__Impl rule__Course__Group_4__2 )
            // InternalDsl.g:465:2: rule__Course__Group_4__1__Impl rule__Course__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Course__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__1"


    // $ANTLR start "rule__Course__Group_4__1__Impl"
    // InternalDsl.g:472:1: rule__Course__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Course__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:476:1: ( ( '{' ) )
            // InternalDsl.g:477:1: ( '{' )
            {
            // InternalDsl.g:477:1: ( '{' )
            // InternalDsl.g:478:2: '{'
            {
             before(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__1__Impl"


    // $ANTLR start "rule__Course__Group_4__2"
    // InternalDsl.g:487:1: rule__Course__Group_4__2 : rule__Course__Group_4__2__Impl rule__Course__Group_4__3 ;
    public final void rule__Course__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:1: ( rule__Course__Group_4__2__Impl rule__Course__Group_4__3 )
            // InternalDsl.g:492:2: rule__Course__Group_4__2__Impl rule__Course__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Course__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__2"


    // $ANTLR start "rule__Course__Group_4__2__Impl"
    // InternalDsl.g:499:1: rule__Course__Group_4__2__Impl : ( ( rule__Course__HomeworkAssignment_4_2 ) ) ;
    public final void rule__Course__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:503:1: ( ( ( rule__Course__HomeworkAssignment_4_2 ) ) )
            // InternalDsl.g:504:1: ( ( rule__Course__HomeworkAssignment_4_2 ) )
            {
            // InternalDsl.g:504:1: ( ( rule__Course__HomeworkAssignment_4_2 ) )
            // InternalDsl.g:505:2: ( rule__Course__HomeworkAssignment_4_2 )
            {
             before(grammarAccess.getCourseAccess().getHomeworkAssignment_4_2()); 
            // InternalDsl.g:506:2: ( rule__Course__HomeworkAssignment_4_2 )
            // InternalDsl.g:506:3: rule__Course__HomeworkAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Course__HomeworkAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getHomeworkAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__2__Impl"


    // $ANTLR start "rule__Course__Group_4__3"
    // InternalDsl.g:514:1: rule__Course__Group_4__3 : rule__Course__Group_4__3__Impl rule__Course__Group_4__4 ;
    public final void rule__Course__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:518:1: ( rule__Course__Group_4__3__Impl rule__Course__Group_4__4 )
            // InternalDsl.g:519:2: rule__Course__Group_4__3__Impl rule__Course__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Course__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__3"


    // $ANTLR start "rule__Course__Group_4__3__Impl"
    // InternalDsl.g:526:1: rule__Course__Group_4__3__Impl : ( ( rule__Course__Group_4_3__0 )* ) ;
    public final void rule__Course__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:530:1: ( ( ( rule__Course__Group_4_3__0 )* ) )
            // InternalDsl.g:531:1: ( ( rule__Course__Group_4_3__0 )* )
            {
            // InternalDsl.g:531:1: ( ( rule__Course__Group_4_3__0 )* )
            // InternalDsl.g:532:2: ( rule__Course__Group_4_3__0 )*
            {
             before(grammarAccess.getCourseAccess().getGroup_4_3()); 
            // InternalDsl.g:533:2: ( rule__Course__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:533:3: rule__Course__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Course__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCourseAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__3__Impl"


    // $ANTLR start "rule__Course__Group_4__4"
    // InternalDsl.g:541:1: rule__Course__Group_4__4 : rule__Course__Group_4__4__Impl ;
    public final void rule__Course__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:545:1: ( rule__Course__Group_4__4__Impl )
            // InternalDsl.g:546:2: rule__Course__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__4"


    // $ANTLR start "rule__Course__Group_4__4__Impl"
    // InternalDsl.g:552:1: rule__Course__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Course__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:556:1: ( ( '}' ) )
            // InternalDsl.g:557:1: ( '}' )
            {
            // InternalDsl.g:557:1: ( '}' )
            // InternalDsl.g:558:2: '}'
            {
             before(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4__4__Impl"


    // $ANTLR start "rule__Course__Group_4_3__0"
    // InternalDsl.g:568:1: rule__Course__Group_4_3__0 : rule__Course__Group_4_3__0__Impl rule__Course__Group_4_3__1 ;
    public final void rule__Course__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:572:1: ( rule__Course__Group_4_3__0__Impl rule__Course__Group_4_3__1 )
            // InternalDsl.g:573:2: rule__Course__Group_4_3__0__Impl rule__Course__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Course__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4_3__0"


    // $ANTLR start "rule__Course__Group_4_3__0__Impl"
    // InternalDsl.g:580:1: rule__Course__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Course__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:584:1: ( ( ',' ) )
            // InternalDsl.g:585:1: ( ',' )
            {
            // InternalDsl.g:585:1: ( ',' )
            // InternalDsl.g:586:2: ','
            {
             before(grammarAccess.getCourseAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4_3__0__Impl"


    // $ANTLR start "rule__Course__Group_4_3__1"
    // InternalDsl.g:595:1: rule__Course__Group_4_3__1 : rule__Course__Group_4_3__1__Impl ;
    public final void rule__Course__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:599:1: ( rule__Course__Group_4_3__1__Impl )
            // InternalDsl.g:600:2: rule__Course__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4_3__1"


    // $ANTLR start "rule__Course__Group_4_3__1__Impl"
    // InternalDsl.g:606:1: rule__Course__Group_4_3__1__Impl : ( ( rule__Course__HomeworkAssignment_4_3_1 ) ) ;
    public final void rule__Course__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:610:1: ( ( ( rule__Course__HomeworkAssignment_4_3_1 ) ) )
            // InternalDsl.g:611:1: ( ( rule__Course__HomeworkAssignment_4_3_1 ) )
            {
            // InternalDsl.g:611:1: ( ( rule__Course__HomeworkAssignment_4_3_1 ) )
            // InternalDsl.g:612:2: ( rule__Course__HomeworkAssignment_4_3_1 )
            {
             before(grammarAccess.getCourseAccess().getHomeworkAssignment_4_3_1()); 
            // InternalDsl.g:613:2: ( rule__Course__HomeworkAssignment_4_3_1 )
            // InternalDsl.g:613:3: rule__Course__HomeworkAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Course__HomeworkAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getHomeworkAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_4_3__1__Impl"


    // $ANTLR start "rule__Course__Group_5__0"
    // InternalDsl.g:622:1: rule__Course__Group_5__0 : rule__Course__Group_5__0__Impl rule__Course__Group_5__1 ;
    public final void rule__Course__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:626:1: ( rule__Course__Group_5__0__Impl rule__Course__Group_5__1 )
            // InternalDsl.g:627:2: rule__Course__Group_5__0__Impl rule__Course__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Course__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_5__0"


    // $ANTLR start "rule__Course__Group_5__0__Impl"
    // InternalDsl.g:634:1: rule__Course__Group_5__0__Impl : ( 'person' ) ;
    public final void rule__Course__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:638:1: ( ( 'person' ) )
            // InternalDsl.g:639:1: ( 'person' )
            {
            // InternalDsl.g:639:1: ( 'person' )
            // InternalDsl.g:640:2: 'person'
            {
             before(grammarAccess.getCourseAccess().getPersonKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getPersonKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_5__0__Impl"


    // $ANTLR start "rule__Course__Group_5__1"
    // InternalDsl.g:649:1: rule__Course__Group_5__1 : rule__Course__Group_5__1__Impl rule__Course__Group_5__2 ;
    public final void rule__Course__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:653:1: ( rule__Course__Group_5__1__Impl rule__Course__Group_5__2 )
            // InternalDsl.g:654:2: rule__Course__Group_5__1__Impl rule__Course__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__Course__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_5__1"


    // $ANTLR start "rule__Course__Group_5__1__Impl"
    // InternalDsl.g:661:1: rule__Course__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Course__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:665:1: ( ( '{' ) )
            // InternalDsl.g:666:1: ( '{' )
            {
            // InternalDsl.g:666:1: ( '{' )
            // InternalDsl.g:667:2: '{'
            {
             before(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_5__1__Impl"


    // $ANTLR start "rule__Course__Group_5__2"
    // InternalDsl.g:676:1: rule__Course__Group_5__2 : rule__Course__Group_5__2__Impl rule__Course__Group_5__3 ;
    public final void rule__Course__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:680:1: ( rule__Course__Group_5__2__Impl rule__Course__Group_5__3 )
            // InternalDsl.g:681:2: rule__Course__Group_5__2__Impl rule__Course__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Course__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_5__2"


    // $ANTLR start "rule__Course__Group_5__2__Impl"
    // InternalDsl.g:688:1: rule__Course__Group_5__2__Impl : ( ( rule__Course__PersonAssignment_5_2 ) ) ;
    public final void rule__Course__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:692:1: ( ( ( rule__Course__PersonAssignment_5_2 ) ) )
            // InternalDsl.g:693:1: ( ( rule__Course__PersonAssignment_5_2 ) )
            {
            // InternalDsl.g:693:1: ( ( rule__Course__PersonAssignment_5_2 ) )
            // InternalDsl.g:694:2: ( rule__Course__PersonAssignment_5_2 )
            {
             before(grammarAccess.getCourseAccess().getPersonAssignment_5_2()); 
            // InternalDsl.g:695:2: ( rule__Course__PersonAssignment_5_2 )
            // InternalDsl.g:695:3: rule__Course__PersonAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Course__PersonAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getPersonAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_5__2__Impl"


    // $ANTLR start "rule__Course__Group_5__3"
    // InternalDsl.g:703:1: rule__Course__Group_5__3 : rule__Course__Group_5__3__Impl rule__Course__Group_5__4 ;
    public final void rule__Course__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:707:1: ( rule__Course__Group_5__3__Impl rule__Course__Group_5__4 )
            // InternalDsl.g:708:2: rule__Course__Group_5__3__Impl rule__Course__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Course__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_5__3"


    // $ANTLR start "rule__Course__Group_5__3__Impl"
    // InternalDsl.g:715:1: rule__Course__Group_5__3__Impl : ( ( rule__Course__Group_5_3__0 )* ) ;
    public final void rule__Course__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:719:1: ( ( ( rule__Course__Group_5_3__0 )* ) )
            // InternalDsl.g:720:1: ( ( rule__Course__Group_5_3__0 )* )
            {
            // InternalDsl.g:720:1: ( ( rule__Course__Group_5_3__0 )* )
            // InternalDsl.g:721:2: ( rule__Course__Group_5_3__0 )*
            {
             before(grammarAccess.getCourseAccess().getGroup_5_3()); 
            // InternalDsl.g:722:2: ( rule__Course__Group_5_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:722:3: rule__Course__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Course__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getCourseAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_5__3__Impl"


    // $ANTLR start "rule__Course__Group_5__4"
    // InternalDsl.g:730:1: rule__Course__Group_5__4 : rule__Course__Group_5__4__Impl ;
    public final void rule__Course__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:734:1: ( rule__Course__Group_5__4__Impl )
            // InternalDsl.g:735:2: rule__Course__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_5__4"


    // $ANTLR start "rule__Course__Group_5__4__Impl"
    // InternalDsl.g:741:1: rule__Course__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Course__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:745:1: ( ( '}' ) )
            // InternalDsl.g:746:1: ( '}' )
            {
            // InternalDsl.g:746:1: ( '}' )
            // InternalDsl.g:747:2: '}'
            {
             before(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_5__4__Impl"


    // $ANTLR start "rule__Course__Group_5_3__0"
    // InternalDsl.g:757:1: rule__Course__Group_5_3__0 : rule__Course__Group_5_3__0__Impl rule__Course__Group_5_3__1 ;
    public final void rule__Course__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:761:1: ( rule__Course__Group_5_3__0__Impl rule__Course__Group_5_3__1 )
            // InternalDsl.g:762:2: rule__Course__Group_5_3__0__Impl rule__Course__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Course__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_5_3__0"


    // $ANTLR start "rule__Course__Group_5_3__0__Impl"
    // InternalDsl.g:769:1: rule__Course__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Course__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:773:1: ( ( ',' ) )
            // InternalDsl.g:774:1: ( ',' )
            {
            // InternalDsl.g:774:1: ( ',' )
            // InternalDsl.g:775:2: ','
            {
             before(grammarAccess.getCourseAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_5_3__0__Impl"


    // $ANTLR start "rule__Course__Group_5_3__1"
    // InternalDsl.g:784:1: rule__Course__Group_5_3__1 : rule__Course__Group_5_3__1__Impl ;
    public final void rule__Course__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:788:1: ( rule__Course__Group_5_3__1__Impl )
            // InternalDsl.g:789:2: rule__Course__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_5_3__1"


    // $ANTLR start "rule__Course__Group_5_3__1__Impl"
    // InternalDsl.g:795:1: rule__Course__Group_5_3__1__Impl : ( ( rule__Course__PersonAssignment_5_3_1 ) ) ;
    public final void rule__Course__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:799:1: ( ( ( rule__Course__PersonAssignment_5_3_1 ) ) )
            // InternalDsl.g:800:1: ( ( rule__Course__PersonAssignment_5_3_1 ) )
            {
            // InternalDsl.g:800:1: ( ( rule__Course__PersonAssignment_5_3_1 ) )
            // InternalDsl.g:801:2: ( rule__Course__PersonAssignment_5_3_1 )
            {
             before(grammarAccess.getCourseAccess().getPersonAssignment_5_3_1()); 
            // InternalDsl.g:802:2: ( rule__Course__PersonAssignment_5_3_1 )
            // InternalDsl.g:802:3: rule__Course__PersonAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Course__PersonAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getPersonAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group_5_3__1__Impl"


    // $ANTLR start "rule__Homework__Group__0"
    // InternalDsl.g:811:1: rule__Homework__Group__0 : rule__Homework__Group__0__Impl rule__Homework__Group__1 ;
    public final void rule__Homework__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:815:1: ( rule__Homework__Group__0__Impl rule__Homework__Group__1 )
            // InternalDsl.g:816:2: rule__Homework__Group__0__Impl rule__Homework__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Homework__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Homework__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Homework__Group__0"


    // $ANTLR start "rule__Homework__Group__0__Impl"
    // InternalDsl.g:823:1: rule__Homework__Group__0__Impl : ( () ) ;
    public final void rule__Homework__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:827:1: ( ( () ) )
            // InternalDsl.g:828:1: ( () )
            {
            // InternalDsl.g:828:1: ( () )
            // InternalDsl.g:829:2: ()
            {
             before(grammarAccess.getHomeworkAccess().getHomeworkAction_0()); 
            // InternalDsl.g:830:2: ()
            // InternalDsl.g:830:3: 
            {
            }

             after(grammarAccess.getHomeworkAccess().getHomeworkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Homework__Group__0__Impl"


    // $ANTLR start "rule__Homework__Group__1"
    // InternalDsl.g:838:1: rule__Homework__Group__1 : rule__Homework__Group__1__Impl rule__Homework__Group__2 ;
    public final void rule__Homework__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:842:1: ( rule__Homework__Group__1__Impl rule__Homework__Group__2 )
            // InternalDsl.g:843:2: rule__Homework__Group__1__Impl rule__Homework__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Homework__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Homework__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Homework__Group__1"


    // $ANTLR start "rule__Homework__Group__1__Impl"
    // InternalDsl.g:850:1: rule__Homework__Group__1__Impl : ( 'Homework' ) ;
    public final void rule__Homework__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:854:1: ( ( 'Homework' ) )
            // InternalDsl.g:855:1: ( 'Homework' )
            {
            // InternalDsl.g:855:1: ( 'Homework' )
            // InternalDsl.g:856:2: 'Homework'
            {
             before(grammarAccess.getHomeworkAccess().getHomeworkKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHomeworkAccess().getHomeworkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Homework__Group__1__Impl"


    // $ANTLR start "rule__Homework__Group__2"
    // InternalDsl.g:865:1: rule__Homework__Group__2 : rule__Homework__Group__2__Impl rule__Homework__Group__3 ;
    public final void rule__Homework__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:869:1: ( rule__Homework__Group__2__Impl rule__Homework__Group__3 )
            // InternalDsl.g:870:2: rule__Homework__Group__2__Impl rule__Homework__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Homework__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Homework__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Homework__Group__2"


    // $ANTLR start "rule__Homework__Group__2__Impl"
    // InternalDsl.g:877:1: rule__Homework__Group__2__Impl : ( '{' ) ;
    public final void rule__Homework__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:881:1: ( ( '{' ) )
            // InternalDsl.g:882:1: ( '{' )
            {
            // InternalDsl.g:882:1: ( '{' )
            // InternalDsl.g:883:2: '{'
            {
             before(grammarAccess.getHomeworkAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getHomeworkAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Homework__Group__2__Impl"


    // $ANTLR start "rule__Homework__Group__3"
    // InternalDsl.g:892:1: rule__Homework__Group__3 : rule__Homework__Group__3__Impl rule__Homework__Group__4 ;
    public final void rule__Homework__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:896:1: ( rule__Homework__Group__3__Impl rule__Homework__Group__4 )
            // InternalDsl.g:897:2: rule__Homework__Group__3__Impl rule__Homework__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Homework__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Homework__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Homework__Group__3"


    // $ANTLR start "rule__Homework__Group__3__Impl"
    // InternalDsl.g:904:1: rule__Homework__Group__3__Impl : ( ( rule__Homework__Group_3__0 )? ) ;
    public final void rule__Homework__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:908:1: ( ( ( rule__Homework__Group_3__0 )? ) )
            // InternalDsl.g:909:1: ( ( rule__Homework__Group_3__0 )? )
            {
            // InternalDsl.g:909:1: ( ( rule__Homework__Group_3__0 )? )
            // InternalDsl.g:910:2: ( rule__Homework__Group_3__0 )?
            {
             before(grammarAccess.getHomeworkAccess().getGroup_3()); 
            // InternalDsl.g:911:2: ( rule__Homework__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:911:3: rule__Homework__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Homework__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHomeworkAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Homework__Group__3__Impl"


    // $ANTLR start "rule__Homework__Group__4"
    // InternalDsl.g:919:1: rule__Homework__Group__4 : rule__Homework__Group__4__Impl ;
    public final void rule__Homework__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:923:1: ( rule__Homework__Group__4__Impl )
            // InternalDsl.g:924:2: rule__Homework__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Homework__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Homework__Group__4"


    // $ANTLR start "rule__Homework__Group__4__Impl"
    // InternalDsl.g:930:1: rule__Homework__Group__4__Impl : ( '}' ) ;
    public final void rule__Homework__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:934:1: ( ( '}' ) )
            // InternalDsl.g:935:1: ( '}' )
            {
            // InternalDsl.g:935:1: ( '}' )
            // InternalDsl.g:936:2: '}'
            {
             before(grammarAccess.getHomeworkAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getHomeworkAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Homework__Group__4__Impl"


    // $ANTLR start "rule__Homework__Group_3__0"
    // InternalDsl.g:946:1: rule__Homework__Group_3__0 : rule__Homework__Group_3__0__Impl rule__Homework__Group_3__1 ;
    public final void rule__Homework__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:950:1: ( rule__Homework__Group_3__0__Impl rule__Homework__Group_3__1 )
            // InternalDsl.g:951:2: rule__Homework__Group_3__0__Impl rule__Homework__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Homework__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Homework__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Homework__Group_3__0"


    // $ANTLR start "rule__Homework__Group_3__0__Impl"
    // InternalDsl.g:958:1: rule__Homework__Group_3__0__Impl : ( 'Describe' ) ;
    public final void rule__Homework__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:962:1: ( ( 'Describe' ) )
            // InternalDsl.g:963:1: ( 'Describe' )
            {
            // InternalDsl.g:963:1: ( 'Describe' )
            // InternalDsl.g:964:2: 'Describe'
            {
             before(grammarAccess.getHomeworkAccess().getDescribeKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getHomeworkAccess().getDescribeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Homework__Group_3__0__Impl"


    // $ANTLR start "rule__Homework__Group_3__1"
    // InternalDsl.g:973:1: rule__Homework__Group_3__1 : rule__Homework__Group_3__1__Impl ;
    public final void rule__Homework__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:977:1: ( rule__Homework__Group_3__1__Impl )
            // InternalDsl.g:978:2: rule__Homework__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Homework__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Homework__Group_3__1"


    // $ANTLR start "rule__Homework__Group_3__1__Impl"
    // InternalDsl.g:984:1: rule__Homework__Group_3__1__Impl : ( ( rule__Homework__DescribeAssignment_3_1 ) ) ;
    public final void rule__Homework__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:988:1: ( ( ( rule__Homework__DescribeAssignment_3_1 ) ) )
            // InternalDsl.g:989:1: ( ( rule__Homework__DescribeAssignment_3_1 ) )
            {
            // InternalDsl.g:989:1: ( ( rule__Homework__DescribeAssignment_3_1 ) )
            // InternalDsl.g:990:2: ( rule__Homework__DescribeAssignment_3_1 )
            {
             before(grammarAccess.getHomeworkAccess().getDescribeAssignment_3_1()); 
            // InternalDsl.g:991:2: ( rule__Homework__DescribeAssignment_3_1 )
            // InternalDsl.g:991:3: rule__Homework__DescribeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Homework__DescribeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeworkAccess().getDescribeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Homework__Group_3__1__Impl"


    // $ANTLR start "rule__Teacher__Group__0"
    // InternalDsl.g:1000:1: rule__Teacher__Group__0 : rule__Teacher__Group__0__Impl rule__Teacher__Group__1 ;
    public final void rule__Teacher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1004:1: ( rule__Teacher__Group__0__Impl rule__Teacher__Group__1 )
            // InternalDsl.g:1005:2: rule__Teacher__Group__0__Impl rule__Teacher__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Teacher__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__0"


    // $ANTLR start "rule__Teacher__Group__0__Impl"
    // InternalDsl.g:1012:1: rule__Teacher__Group__0__Impl : ( () ) ;
    public final void rule__Teacher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1016:1: ( ( () ) )
            // InternalDsl.g:1017:1: ( () )
            {
            // InternalDsl.g:1017:1: ( () )
            // InternalDsl.g:1018:2: ()
            {
             before(grammarAccess.getTeacherAccess().getTeacherAction_0()); 
            // InternalDsl.g:1019:2: ()
            // InternalDsl.g:1019:3: 
            {
            }

             after(grammarAccess.getTeacherAccess().getTeacherAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__0__Impl"


    // $ANTLR start "rule__Teacher__Group__1"
    // InternalDsl.g:1027:1: rule__Teacher__Group__1 : rule__Teacher__Group__1__Impl rule__Teacher__Group__2 ;
    public final void rule__Teacher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1031:1: ( rule__Teacher__Group__1__Impl rule__Teacher__Group__2 )
            // InternalDsl.g:1032:2: rule__Teacher__Group__1__Impl rule__Teacher__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Teacher__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__1"


    // $ANTLR start "rule__Teacher__Group__1__Impl"
    // InternalDsl.g:1039:1: rule__Teacher__Group__1__Impl : ( 'Teacher' ) ;
    public final void rule__Teacher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1043:1: ( ( 'Teacher' ) )
            // InternalDsl.g:1044:1: ( 'Teacher' )
            {
            // InternalDsl.g:1044:1: ( 'Teacher' )
            // InternalDsl.g:1045:2: 'Teacher'
            {
             before(grammarAccess.getTeacherAccess().getTeacherKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getTeacherKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__1__Impl"


    // $ANTLR start "rule__Teacher__Group__2"
    // InternalDsl.g:1054:1: rule__Teacher__Group__2 : rule__Teacher__Group__2__Impl rule__Teacher__Group__3 ;
    public final void rule__Teacher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1058:1: ( rule__Teacher__Group__2__Impl rule__Teacher__Group__3 )
            // InternalDsl.g:1059:2: rule__Teacher__Group__2__Impl rule__Teacher__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Teacher__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__2"


    // $ANTLR start "rule__Teacher__Group__2__Impl"
    // InternalDsl.g:1066:1: rule__Teacher__Group__2__Impl : ( ( rule__Teacher__NameAssignment_2 ) ) ;
    public final void rule__Teacher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1070:1: ( ( ( rule__Teacher__NameAssignment_2 ) ) )
            // InternalDsl.g:1071:1: ( ( rule__Teacher__NameAssignment_2 ) )
            {
            // InternalDsl.g:1071:1: ( ( rule__Teacher__NameAssignment_2 ) )
            // InternalDsl.g:1072:2: ( rule__Teacher__NameAssignment_2 )
            {
             before(grammarAccess.getTeacherAccess().getNameAssignment_2()); 
            // InternalDsl.g:1073:2: ( rule__Teacher__NameAssignment_2 )
            // InternalDsl.g:1073:3: rule__Teacher__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__2__Impl"


    // $ANTLR start "rule__Teacher__Group__3"
    // InternalDsl.g:1081:1: rule__Teacher__Group__3 : rule__Teacher__Group__3__Impl rule__Teacher__Group__4 ;
    public final void rule__Teacher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1085:1: ( rule__Teacher__Group__3__Impl rule__Teacher__Group__4 )
            // InternalDsl.g:1086:2: rule__Teacher__Group__3__Impl rule__Teacher__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Teacher__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__3"


    // $ANTLR start "rule__Teacher__Group__3__Impl"
    // InternalDsl.g:1093:1: rule__Teacher__Group__3__Impl : ( '{' ) ;
    public final void rule__Teacher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1097:1: ( ( '{' ) )
            // InternalDsl.g:1098:1: ( '{' )
            {
            // InternalDsl.g:1098:1: ( '{' )
            // InternalDsl.g:1099:2: '{'
            {
             before(grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__3__Impl"


    // $ANTLR start "rule__Teacher__Group__4"
    // InternalDsl.g:1108:1: rule__Teacher__Group__4 : rule__Teacher__Group__4__Impl rule__Teacher__Group__5 ;
    public final void rule__Teacher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1112:1: ( rule__Teacher__Group__4__Impl rule__Teacher__Group__5 )
            // InternalDsl.g:1113:2: rule__Teacher__Group__4__Impl rule__Teacher__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Teacher__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__4"


    // $ANTLR start "rule__Teacher__Group__4__Impl"
    // InternalDsl.g:1120:1: rule__Teacher__Group__4__Impl : ( ( rule__Teacher__Group_4__0 )? ) ;
    public final void rule__Teacher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1124:1: ( ( ( rule__Teacher__Group_4__0 )? ) )
            // InternalDsl.g:1125:1: ( ( rule__Teacher__Group_4__0 )? )
            {
            // InternalDsl.g:1125:1: ( ( rule__Teacher__Group_4__0 )? )
            // InternalDsl.g:1126:2: ( rule__Teacher__Group_4__0 )?
            {
             before(grammarAccess.getTeacherAccess().getGroup_4()); 
            // InternalDsl.g:1127:2: ( rule__Teacher__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:1127:3: rule__Teacher__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Teacher__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeacherAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__4__Impl"


    // $ANTLR start "rule__Teacher__Group__5"
    // InternalDsl.g:1135:1: rule__Teacher__Group__5 : rule__Teacher__Group__5__Impl rule__Teacher__Group__6 ;
    public final void rule__Teacher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1139:1: ( rule__Teacher__Group__5__Impl rule__Teacher__Group__6 )
            // InternalDsl.g:1140:2: rule__Teacher__Group__5__Impl rule__Teacher__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Teacher__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__5"


    // $ANTLR start "rule__Teacher__Group__5__Impl"
    // InternalDsl.g:1147:1: rule__Teacher__Group__5__Impl : ( ( rule__Teacher__Group_5__0 )? ) ;
    public final void rule__Teacher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1151:1: ( ( ( rule__Teacher__Group_5__0 )? ) )
            // InternalDsl.g:1152:1: ( ( rule__Teacher__Group_5__0 )? )
            {
            // InternalDsl.g:1152:1: ( ( rule__Teacher__Group_5__0 )? )
            // InternalDsl.g:1153:2: ( rule__Teacher__Group_5__0 )?
            {
             before(grammarAccess.getTeacherAccess().getGroup_5()); 
            // InternalDsl.g:1154:2: ( rule__Teacher__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:1154:3: rule__Teacher__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Teacher__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeacherAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__5__Impl"


    // $ANTLR start "rule__Teacher__Group__6"
    // InternalDsl.g:1162:1: rule__Teacher__Group__6 : rule__Teacher__Group__6__Impl ;
    public final void rule__Teacher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1166:1: ( rule__Teacher__Group__6__Impl )
            // InternalDsl.g:1167:2: rule__Teacher__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__6"


    // $ANTLR start "rule__Teacher__Group__6__Impl"
    // InternalDsl.g:1173:1: rule__Teacher__Group__6__Impl : ( '}' ) ;
    public final void rule__Teacher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1177:1: ( ( '}' ) )
            // InternalDsl.g:1178:1: ( '}' )
            {
            // InternalDsl.g:1178:1: ( '}' )
            // InternalDsl.g:1179:2: '}'
            {
             before(grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__6__Impl"


    // $ANTLR start "rule__Teacher__Group_4__0"
    // InternalDsl.g:1189:1: rule__Teacher__Group_4__0 : rule__Teacher__Group_4__0__Impl rule__Teacher__Group_4__1 ;
    public final void rule__Teacher__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1193:1: ( rule__Teacher__Group_4__0__Impl rule__Teacher__Group_4__1 )
            // InternalDsl.g:1194:2: rule__Teacher__Group_4__0__Impl rule__Teacher__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Teacher__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__0"


    // $ANTLR start "rule__Teacher__Group_4__0__Impl"
    // InternalDsl.g:1201:1: rule__Teacher__Group_4__0__Impl : ( 'student' ) ;
    public final void rule__Teacher__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1205:1: ( ( 'student' ) )
            // InternalDsl.g:1206:1: ( 'student' )
            {
            // InternalDsl.g:1206:1: ( 'student' )
            // InternalDsl.g:1207:2: 'student'
            {
             before(grammarAccess.getTeacherAccess().getStudentKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getStudentKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__0__Impl"


    // $ANTLR start "rule__Teacher__Group_4__1"
    // InternalDsl.g:1216:1: rule__Teacher__Group_4__1 : rule__Teacher__Group_4__1__Impl rule__Teacher__Group_4__2 ;
    public final void rule__Teacher__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1220:1: ( rule__Teacher__Group_4__1__Impl rule__Teacher__Group_4__2 )
            // InternalDsl.g:1221:2: rule__Teacher__Group_4__1__Impl rule__Teacher__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__Teacher__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__1"


    // $ANTLR start "rule__Teacher__Group_4__1__Impl"
    // InternalDsl.g:1228:1: rule__Teacher__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Teacher__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1232:1: ( ( '(' ) )
            // InternalDsl.g:1233:1: ( '(' )
            {
            // InternalDsl.g:1233:1: ( '(' )
            // InternalDsl.g:1234:2: '('
            {
             before(grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__1__Impl"


    // $ANTLR start "rule__Teacher__Group_4__2"
    // InternalDsl.g:1243:1: rule__Teacher__Group_4__2 : rule__Teacher__Group_4__2__Impl rule__Teacher__Group_4__3 ;
    public final void rule__Teacher__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1247:1: ( rule__Teacher__Group_4__2__Impl rule__Teacher__Group_4__3 )
            // InternalDsl.g:1248:2: rule__Teacher__Group_4__2__Impl rule__Teacher__Group_4__3
            {
            pushFollow(FOLLOW_15);
            rule__Teacher__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__2"


    // $ANTLR start "rule__Teacher__Group_4__2__Impl"
    // InternalDsl.g:1255:1: rule__Teacher__Group_4__2__Impl : ( ( rule__Teacher__StudentAssignment_4_2 ) ) ;
    public final void rule__Teacher__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1259:1: ( ( ( rule__Teacher__StudentAssignment_4_2 ) ) )
            // InternalDsl.g:1260:1: ( ( rule__Teacher__StudentAssignment_4_2 ) )
            {
            // InternalDsl.g:1260:1: ( ( rule__Teacher__StudentAssignment_4_2 ) )
            // InternalDsl.g:1261:2: ( rule__Teacher__StudentAssignment_4_2 )
            {
             before(grammarAccess.getTeacherAccess().getStudentAssignment_4_2()); 
            // InternalDsl.g:1262:2: ( rule__Teacher__StudentAssignment_4_2 )
            // InternalDsl.g:1262:3: rule__Teacher__StudentAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__StudentAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getStudentAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__2__Impl"


    // $ANTLR start "rule__Teacher__Group_4__3"
    // InternalDsl.g:1270:1: rule__Teacher__Group_4__3 : rule__Teacher__Group_4__3__Impl rule__Teacher__Group_4__4 ;
    public final void rule__Teacher__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1274:1: ( rule__Teacher__Group_4__3__Impl rule__Teacher__Group_4__4 )
            // InternalDsl.g:1275:2: rule__Teacher__Group_4__3__Impl rule__Teacher__Group_4__4
            {
            pushFollow(FOLLOW_15);
            rule__Teacher__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__3"


    // $ANTLR start "rule__Teacher__Group_4__3__Impl"
    // InternalDsl.g:1282:1: rule__Teacher__Group_4__3__Impl : ( ( rule__Teacher__Group_4_3__0 )* ) ;
    public final void rule__Teacher__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1286:1: ( ( ( rule__Teacher__Group_4_3__0 )* ) )
            // InternalDsl.g:1287:1: ( ( rule__Teacher__Group_4_3__0 )* )
            {
            // InternalDsl.g:1287:1: ( ( rule__Teacher__Group_4_3__0 )* )
            // InternalDsl.g:1288:2: ( rule__Teacher__Group_4_3__0 )*
            {
             before(grammarAccess.getTeacherAccess().getGroup_4_3()); 
            // InternalDsl.g:1289:2: ( rule__Teacher__Group_4_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:1289:3: rule__Teacher__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Teacher__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTeacherAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__3__Impl"


    // $ANTLR start "rule__Teacher__Group_4__4"
    // InternalDsl.g:1297:1: rule__Teacher__Group_4__4 : rule__Teacher__Group_4__4__Impl ;
    public final void rule__Teacher__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1301:1: ( rule__Teacher__Group_4__4__Impl )
            // InternalDsl.g:1302:2: rule__Teacher__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__4"


    // $ANTLR start "rule__Teacher__Group_4__4__Impl"
    // InternalDsl.g:1308:1: rule__Teacher__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Teacher__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1312:1: ( ( ')' ) )
            // InternalDsl.g:1313:1: ( ')' )
            {
            // InternalDsl.g:1313:1: ( ')' )
            // InternalDsl.g:1314:2: ')'
            {
             before(grammarAccess.getTeacherAccess().getRightParenthesisKeyword_4_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4__4__Impl"


    // $ANTLR start "rule__Teacher__Group_4_3__0"
    // InternalDsl.g:1324:1: rule__Teacher__Group_4_3__0 : rule__Teacher__Group_4_3__0__Impl rule__Teacher__Group_4_3__1 ;
    public final void rule__Teacher__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1328:1: ( rule__Teacher__Group_4_3__0__Impl rule__Teacher__Group_4_3__1 )
            // InternalDsl.g:1329:2: rule__Teacher__Group_4_3__0__Impl rule__Teacher__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Teacher__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4_3__0"


    // $ANTLR start "rule__Teacher__Group_4_3__0__Impl"
    // InternalDsl.g:1336:1: rule__Teacher__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Teacher__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1340:1: ( ( ',' ) )
            // InternalDsl.g:1341:1: ( ',' )
            {
            // InternalDsl.g:1341:1: ( ',' )
            // InternalDsl.g:1342:2: ','
            {
             before(grammarAccess.getTeacherAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4_3__0__Impl"


    // $ANTLR start "rule__Teacher__Group_4_3__1"
    // InternalDsl.g:1351:1: rule__Teacher__Group_4_3__1 : rule__Teacher__Group_4_3__1__Impl ;
    public final void rule__Teacher__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1355:1: ( rule__Teacher__Group_4_3__1__Impl )
            // InternalDsl.g:1356:2: rule__Teacher__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4_3__1"


    // $ANTLR start "rule__Teacher__Group_4_3__1__Impl"
    // InternalDsl.g:1362:1: rule__Teacher__Group_4_3__1__Impl : ( ( rule__Teacher__StudentAssignment_4_3_1 ) ) ;
    public final void rule__Teacher__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1366:1: ( ( ( rule__Teacher__StudentAssignment_4_3_1 ) ) )
            // InternalDsl.g:1367:1: ( ( rule__Teacher__StudentAssignment_4_3_1 ) )
            {
            // InternalDsl.g:1367:1: ( ( rule__Teacher__StudentAssignment_4_3_1 ) )
            // InternalDsl.g:1368:2: ( rule__Teacher__StudentAssignment_4_3_1 )
            {
             before(grammarAccess.getTeacherAccess().getStudentAssignment_4_3_1()); 
            // InternalDsl.g:1369:2: ( rule__Teacher__StudentAssignment_4_3_1 )
            // InternalDsl.g:1369:3: rule__Teacher__StudentAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__StudentAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getStudentAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_4_3__1__Impl"


    // $ANTLR start "rule__Teacher__Group_5__0"
    // InternalDsl.g:1378:1: rule__Teacher__Group_5__0 : rule__Teacher__Group_5__0__Impl rule__Teacher__Group_5__1 ;
    public final void rule__Teacher__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1382:1: ( rule__Teacher__Group_5__0__Impl rule__Teacher__Group_5__1 )
            // InternalDsl.g:1383:2: rule__Teacher__Group_5__0__Impl rule__Teacher__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Teacher__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_5__0"


    // $ANTLR start "rule__Teacher__Group_5__0__Impl"
    // InternalDsl.g:1390:1: rule__Teacher__Group_5__0__Impl : ( 'teacher' ) ;
    public final void rule__Teacher__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1394:1: ( ( 'teacher' ) )
            // InternalDsl.g:1395:1: ( 'teacher' )
            {
            // InternalDsl.g:1395:1: ( 'teacher' )
            // InternalDsl.g:1396:2: 'teacher'
            {
             before(grammarAccess.getTeacherAccess().getTeacherKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getTeacherKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_5__0__Impl"


    // $ANTLR start "rule__Teacher__Group_5__1"
    // InternalDsl.g:1405:1: rule__Teacher__Group_5__1 : rule__Teacher__Group_5__1__Impl ;
    public final void rule__Teacher__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1409:1: ( rule__Teacher__Group_5__1__Impl )
            // InternalDsl.g:1410:2: rule__Teacher__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_5__1"


    // $ANTLR start "rule__Teacher__Group_5__1__Impl"
    // InternalDsl.g:1416:1: rule__Teacher__Group_5__1__Impl : ( ( rule__Teacher__TeacherAssignment_5_1 ) ) ;
    public final void rule__Teacher__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1420:1: ( ( ( rule__Teacher__TeacherAssignment_5_1 ) ) )
            // InternalDsl.g:1421:1: ( ( rule__Teacher__TeacherAssignment_5_1 ) )
            {
            // InternalDsl.g:1421:1: ( ( rule__Teacher__TeacherAssignment_5_1 ) )
            // InternalDsl.g:1422:2: ( rule__Teacher__TeacherAssignment_5_1 )
            {
             before(grammarAccess.getTeacherAccess().getTeacherAssignment_5_1()); 
            // InternalDsl.g:1423:2: ( rule__Teacher__TeacherAssignment_5_1 )
            // InternalDsl.g:1423:3: rule__Teacher__TeacherAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__TeacherAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getTeacherAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group_5__1__Impl"


    // $ANTLR start "rule__Student__Group__0"
    // InternalDsl.g:1432:1: rule__Student__Group__0 : rule__Student__Group__0__Impl rule__Student__Group__1 ;
    public final void rule__Student__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1436:1: ( rule__Student__Group__0__Impl rule__Student__Group__1 )
            // InternalDsl.g:1437:2: rule__Student__Group__0__Impl rule__Student__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Student__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__0"


    // $ANTLR start "rule__Student__Group__0__Impl"
    // InternalDsl.g:1444:1: rule__Student__Group__0__Impl : ( () ) ;
    public final void rule__Student__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1448:1: ( ( () ) )
            // InternalDsl.g:1449:1: ( () )
            {
            // InternalDsl.g:1449:1: ( () )
            // InternalDsl.g:1450:2: ()
            {
             before(grammarAccess.getStudentAccess().getStudentAction_0()); 
            // InternalDsl.g:1451:2: ()
            // InternalDsl.g:1451:3: 
            {
            }

             after(grammarAccess.getStudentAccess().getStudentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__0__Impl"


    // $ANTLR start "rule__Student__Group__1"
    // InternalDsl.g:1459:1: rule__Student__Group__1 : rule__Student__Group__1__Impl rule__Student__Group__2 ;
    public final void rule__Student__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1463:1: ( rule__Student__Group__1__Impl rule__Student__Group__2 )
            // InternalDsl.g:1464:2: rule__Student__Group__1__Impl rule__Student__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Student__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__1"


    // $ANTLR start "rule__Student__Group__1__Impl"
    // InternalDsl.g:1471:1: rule__Student__Group__1__Impl : ( 'Student' ) ;
    public final void rule__Student__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1475:1: ( ( 'Student' ) )
            // InternalDsl.g:1476:1: ( 'Student' )
            {
            // InternalDsl.g:1476:1: ( 'Student' )
            // InternalDsl.g:1477:2: 'Student'
            {
             before(grammarAccess.getStudentAccess().getStudentKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getStudentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__1__Impl"


    // $ANTLR start "rule__Student__Group__2"
    // InternalDsl.g:1486:1: rule__Student__Group__2 : rule__Student__Group__2__Impl rule__Student__Group__3 ;
    public final void rule__Student__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1490:1: ( rule__Student__Group__2__Impl rule__Student__Group__3 )
            // InternalDsl.g:1491:2: rule__Student__Group__2__Impl rule__Student__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Student__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__2"


    // $ANTLR start "rule__Student__Group__2__Impl"
    // InternalDsl.g:1498:1: rule__Student__Group__2__Impl : ( ( rule__Student__NameAssignment_2 ) ) ;
    public final void rule__Student__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1502:1: ( ( ( rule__Student__NameAssignment_2 ) ) )
            // InternalDsl.g:1503:1: ( ( rule__Student__NameAssignment_2 ) )
            {
            // InternalDsl.g:1503:1: ( ( rule__Student__NameAssignment_2 ) )
            // InternalDsl.g:1504:2: ( rule__Student__NameAssignment_2 )
            {
             before(grammarAccess.getStudentAccess().getNameAssignment_2()); 
            // InternalDsl.g:1505:2: ( rule__Student__NameAssignment_2 )
            // InternalDsl.g:1505:3: rule__Student__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Student__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__2__Impl"


    // $ANTLR start "rule__Student__Group__3"
    // InternalDsl.g:1513:1: rule__Student__Group__3 : rule__Student__Group__3__Impl rule__Student__Group__4 ;
    public final void rule__Student__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1517:1: ( rule__Student__Group__3__Impl rule__Student__Group__4 )
            // InternalDsl.g:1518:2: rule__Student__Group__3__Impl rule__Student__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Student__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__3"


    // $ANTLR start "rule__Student__Group__3__Impl"
    // InternalDsl.g:1525:1: rule__Student__Group__3__Impl : ( '{' ) ;
    public final void rule__Student__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1529:1: ( ( '{' ) )
            // InternalDsl.g:1530:1: ( '{' )
            {
            // InternalDsl.g:1530:1: ( '{' )
            // InternalDsl.g:1531:2: '{'
            {
             before(grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__3__Impl"


    // $ANTLR start "rule__Student__Group__4"
    // InternalDsl.g:1540:1: rule__Student__Group__4 : rule__Student__Group__4__Impl rule__Student__Group__5 ;
    public final void rule__Student__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1544:1: ( rule__Student__Group__4__Impl rule__Student__Group__5 )
            // InternalDsl.g:1545:2: rule__Student__Group__4__Impl rule__Student__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Student__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__4"


    // $ANTLR start "rule__Student__Group__4__Impl"
    // InternalDsl.g:1552:1: rule__Student__Group__4__Impl : ( ( rule__Student__Group_4__0 )? ) ;
    public final void rule__Student__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1556:1: ( ( ( rule__Student__Group_4__0 )? ) )
            // InternalDsl.g:1557:1: ( ( rule__Student__Group_4__0 )? )
            {
            // InternalDsl.g:1557:1: ( ( rule__Student__Group_4__0 )? )
            // InternalDsl.g:1558:2: ( rule__Student__Group_4__0 )?
            {
             before(grammarAccess.getStudentAccess().getGroup_4()); 
            // InternalDsl.g:1559:2: ( rule__Student__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:1559:3: rule__Student__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Student__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStudentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__4__Impl"


    // $ANTLR start "rule__Student__Group__5"
    // InternalDsl.g:1567:1: rule__Student__Group__5 : rule__Student__Group__5__Impl rule__Student__Group__6 ;
    public final void rule__Student__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1571:1: ( rule__Student__Group__5__Impl rule__Student__Group__6 )
            // InternalDsl.g:1572:2: rule__Student__Group__5__Impl rule__Student__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Student__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__5"


    // $ANTLR start "rule__Student__Group__5__Impl"
    // InternalDsl.g:1579:1: rule__Student__Group__5__Impl : ( ( rule__Student__Group_5__0 )? ) ;
    public final void rule__Student__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1583:1: ( ( ( rule__Student__Group_5__0 )? ) )
            // InternalDsl.g:1584:1: ( ( rule__Student__Group_5__0 )? )
            {
            // InternalDsl.g:1584:1: ( ( rule__Student__Group_5__0 )? )
            // InternalDsl.g:1585:2: ( rule__Student__Group_5__0 )?
            {
             before(grammarAccess.getStudentAccess().getGroup_5()); 
            // InternalDsl.g:1586:2: ( rule__Student__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:1586:3: rule__Student__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Student__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStudentAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__5__Impl"


    // $ANTLR start "rule__Student__Group__6"
    // InternalDsl.g:1594:1: rule__Student__Group__6 : rule__Student__Group__6__Impl ;
    public final void rule__Student__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1598:1: ( rule__Student__Group__6__Impl )
            // InternalDsl.g:1599:2: rule__Student__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__6"


    // $ANTLR start "rule__Student__Group__6__Impl"
    // InternalDsl.g:1605:1: rule__Student__Group__6__Impl : ( '}' ) ;
    public final void rule__Student__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1609:1: ( ( '}' ) )
            // InternalDsl.g:1610:1: ( '}' )
            {
            // InternalDsl.g:1610:1: ( '}' )
            // InternalDsl.g:1611:2: '}'
            {
             before(grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__6__Impl"


    // $ANTLR start "rule__Student__Group_4__0"
    // InternalDsl.g:1621:1: rule__Student__Group_4__0 : rule__Student__Group_4__0__Impl rule__Student__Group_4__1 ;
    public final void rule__Student__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1625:1: ( rule__Student__Group_4__0__Impl rule__Student__Group_4__1 )
            // InternalDsl.g:1626:2: rule__Student__Group_4__0__Impl rule__Student__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Student__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__0"


    // $ANTLR start "rule__Student__Group_4__0__Impl"
    // InternalDsl.g:1633:1: rule__Student__Group_4__0__Impl : ( 'student' ) ;
    public final void rule__Student__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1637:1: ( ( 'student' ) )
            // InternalDsl.g:1638:1: ( 'student' )
            {
            // InternalDsl.g:1638:1: ( 'student' )
            // InternalDsl.g:1639:2: 'student'
            {
             before(grammarAccess.getStudentAccess().getStudentKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getStudentKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__0__Impl"


    // $ANTLR start "rule__Student__Group_4__1"
    // InternalDsl.g:1648:1: rule__Student__Group_4__1 : rule__Student__Group_4__1__Impl rule__Student__Group_4__2 ;
    public final void rule__Student__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1652:1: ( rule__Student__Group_4__1__Impl rule__Student__Group_4__2 )
            // InternalDsl.g:1653:2: rule__Student__Group_4__1__Impl rule__Student__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__Student__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__1"


    // $ANTLR start "rule__Student__Group_4__1__Impl"
    // InternalDsl.g:1660:1: rule__Student__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Student__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1664:1: ( ( '(' ) )
            // InternalDsl.g:1665:1: ( '(' )
            {
            // InternalDsl.g:1665:1: ( '(' )
            // InternalDsl.g:1666:2: '('
            {
             before(grammarAccess.getStudentAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__1__Impl"


    // $ANTLR start "rule__Student__Group_4__2"
    // InternalDsl.g:1675:1: rule__Student__Group_4__2 : rule__Student__Group_4__2__Impl rule__Student__Group_4__3 ;
    public final void rule__Student__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1679:1: ( rule__Student__Group_4__2__Impl rule__Student__Group_4__3 )
            // InternalDsl.g:1680:2: rule__Student__Group_4__2__Impl rule__Student__Group_4__3
            {
            pushFollow(FOLLOW_15);
            rule__Student__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__2"


    // $ANTLR start "rule__Student__Group_4__2__Impl"
    // InternalDsl.g:1687:1: rule__Student__Group_4__2__Impl : ( ( rule__Student__StudentAssignment_4_2 ) ) ;
    public final void rule__Student__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1691:1: ( ( ( rule__Student__StudentAssignment_4_2 ) ) )
            // InternalDsl.g:1692:1: ( ( rule__Student__StudentAssignment_4_2 ) )
            {
            // InternalDsl.g:1692:1: ( ( rule__Student__StudentAssignment_4_2 ) )
            // InternalDsl.g:1693:2: ( rule__Student__StudentAssignment_4_2 )
            {
             before(grammarAccess.getStudentAccess().getStudentAssignment_4_2()); 
            // InternalDsl.g:1694:2: ( rule__Student__StudentAssignment_4_2 )
            // InternalDsl.g:1694:3: rule__Student__StudentAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Student__StudentAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getStudentAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__2__Impl"


    // $ANTLR start "rule__Student__Group_4__3"
    // InternalDsl.g:1702:1: rule__Student__Group_4__3 : rule__Student__Group_4__3__Impl rule__Student__Group_4__4 ;
    public final void rule__Student__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1706:1: ( rule__Student__Group_4__3__Impl rule__Student__Group_4__4 )
            // InternalDsl.g:1707:2: rule__Student__Group_4__3__Impl rule__Student__Group_4__4
            {
            pushFollow(FOLLOW_15);
            rule__Student__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__3"


    // $ANTLR start "rule__Student__Group_4__3__Impl"
    // InternalDsl.g:1714:1: rule__Student__Group_4__3__Impl : ( ( rule__Student__Group_4_3__0 )* ) ;
    public final void rule__Student__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1718:1: ( ( ( rule__Student__Group_4_3__0 )* ) )
            // InternalDsl.g:1719:1: ( ( rule__Student__Group_4_3__0 )* )
            {
            // InternalDsl.g:1719:1: ( ( rule__Student__Group_4_3__0 )* )
            // InternalDsl.g:1720:2: ( rule__Student__Group_4_3__0 )*
            {
             before(grammarAccess.getStudentAccess().getGroup_4_3()); 
            // InternalDsl.g:1721:2: ( rule__Student__Group_4_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1721:3: rule__Student__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Student__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getStudentAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__3__Impl"


    // $ANTLR start "rule__Student__Group_4__4"
    // InternalDsl.g:1729:1: rule__Student__Group_4__4 : rule__Student__Group_4__4__Impl ;
    public final void rule__Student__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1733:1: ( rule__Student__Group_4__4__Impl )
            // InternalDsl.g:1734:2: rule__Student__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__4"


    // $ANTLR start "rule__Student__Group_4__4__Impl"
    // InternalDsl.g:1740:1: rule__Student__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Student__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1744:1: ( ( ')' ) )
            // InternalDsl.g:1745:1: ( ')' )
            {
            // InternalDsl.g:1745:1: ( ')' )
            // InternalDsl.g:1746:2: ')'
            {
             before(grammarAccess.getStudentAccess().getRightParenthesisKeyword_4_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4__4__Impl"


    // $ANTLR start "rule__Student__Group_4_3__0"
    // InternalDsl.g:1756:1: rule__Student__Group_4_3__0 : rule__Student__Group_4_3__0__Impl rule__Student__Group_4_3__1 ;
    public final void rule__Student__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1760:1: ( rule__Student__Group_4_3__0__Impl rule__Student__Group_4_3__1 )
            // InternalDsl.g:1761:2: rule__Student__Group_4_3__0__Impl rule__Student__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Student__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4_3__0"


    // $ANTLR start "rule__Student__Group_4_3__0__Impl"
    // InternalDsl.g:1768:1: rule__Student__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Student__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1772:1: ( ( ',' ) )
            // InternalDsl.g:1773:1: ( ',' )
            {
            // InternalDsl.g:1773:1: ( ',' )
            // InternalDsl.g:1774:2: ','
            {
             before(grammarAccess.getStudentAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4_3__0__Impl"


    // $ANTLR start "rule__Student__Group_4_3__1"
    // InternalDsl.g:1783:1: rule__Student__Group_4_3__1 : rule__Student__Group_4_3__1__Impl ;
    public final void rule__Student__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1787:1: ( rule__Student__Group_4_3__1__Impl )
            // InternalDsl.g:1788:2: rule__Student__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4_3__1"


    // $ANTLR start "rule__Student__Group_4_3__1__Impl"
    // InternalDsl.g:1794:1: rule__Student__Group_4_3__1__Impl : ( ( rule__Student__StudentAssignment_4_3_1 ) ) ;
    public final void rule__Student__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1798:1: ( ( ( rule__Student__StudentAssignment_4_3_1 ) ) )
            // InternalDsl.g:1799:1: ( ( rule__Student__StudentAssignment_4_3_1 ) )
            {
            // InternalDsl.g:1799:1: ( ( rule__Student__StudentAssignment_4_3_1 ) )
            // InternalDsl.g:1800:2: ( rule__Student__StudentAssignment_4_3_1 )
            {
             before(grammarAccess.getStudentAccess().getStudentAssignment_4_3_1()); 
            // InternalDsl.g:1801:2: ( rule__Student__StudentAssignment_4_3_1 )
            // InternalDsl.g:1801:3: rule__Student__StudentAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Student__StudentAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getStudentAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_4_3__1__Impl"


    // $ANTLR start "rule__Student__Group_5__0"
    // InternalDsl.g:1810:1: rule__Student__Group_5__0 : rule__Student__Group_5__0__Impl rule__Student__Group_5__1 ;
    public final void rule__Student__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1814:1: ( rule__Student__Group_5__0__Impl rule__Student__Group_5__1 )
            // InternalDsl.g:1815:2: rule__Student__Group_5__0__Impl rule__Student__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Student__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_5__0"


    // $ANTLR start "rule__Student__Group_5__0__Impl"
    // InternalDsl.g:1822:1: rule__Student__Group_5__0__Impl : ( 'teacher' ) ;
    public final void rule__Student__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1826:1: ( ( 'teacher' ) )
            // InternalDsl.g:1827:1: ( 'teacher' )
            {
            // InternalDsl.g:1827:1: ( 'teacher' )
            // InternalDsl.g:1828:2: 'teacher'
            {
             before(grammarAccess.getStudentAccess().getTeacherKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getTeacherKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_5__0__Impl"


    // $ANTLR start "rule__Student__Group_5__1"
    // InternalDsl.g:1837:1: rule__Student__Group_5__1 : rule__Student__Group_5__1__Impl ;
    public final void rule__Student__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1841:1: ( rule__Student__Group_5__1__Impl )
            // InternalDsl.g:1842:2: rule__Student__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_5__1"


    // $ANTLR start "rule__Student__Group_5__1__Impl"
    // InternalDsl.g:1848:1: rule__Student__Group_5__1__Impl : ( ( rule__Student__TeacherAssignment_5_1 ) ) ;
    public final void rule__Student__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1852:1: ( ( ( rule__Student__TeacherAssignment_5_1 ) ) )
            // InternalDsl.g:1853:1: ( ( rule__Student__TeacherAssignment_5_1 ) )
            {
            // InternalDsl.g:1853:1: ( ( rule__Student__TeacherAssignment_5_1 ) )
            // InternalDsl.g:1854:2: ( rule__Student__TeacherAssignment_5_1 )
            {
             before(grammarAccess.getStudentAccess().getTeacherAssignment_5_1()); 
            // InternalDsl.g:1855:2: ( rule__Student__TeacherAssignment_5_1 )
            // InternalDsl.g:1855:3: rule__Student__TeacherAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Student__TeacherAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getTeacherAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_5__1__Impl"


    // $ANTLR start "rule__Course__NameAssignment_2"
    // InternalDsl.g:1864:1: rule__Course__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Course__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1868:1: ( ( ruleEString ) )
            // InternalDsl.g:1869:2: ( ruleEString )
            {
            // InternalDsl.g:1869:2: ( ruleEString )
            // InternalDsl.g:1870:3: ruleEString
            {
             before(grammarAccess.getCourseAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__NameAssignment_2"


    // $ANTLR start "rule__Course__HomeworkAssignment_4_2"
    // InternalDsl.g:1879:1: rule__Course__HomeworkAssignment_4_2 : ( ruleHomework ) ;
    public final void rule__Course__HomeworkAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1883:1: ( ( ruleHomework ) )
            // InternalDsl.g:1884:2: ( ruleHomework )
            {
            // InternalDsl.g:1884:2: ( ruleHomework )
            // InternalDsl.g:1885:3: ruleHomework
            {
             before(grammarAccess.getCourseAccess().getHomeworkHomeworkParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleHomework();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getHomeworkHomeworkParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__HomeworkAssignment_4_2"


    // $ANTLR start "rule__Course__HomeworkAssignment_4_3_1"
    // InternalDsl.g:1894:1: rule__Course__HomeworkAssignment_4_3_1 : ( ruleHomework ) ;
    public final void rule__Course__HomeworkAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1898:1: ( ( ruleHomework ) )
            // InternalDsl.g:1899:2: ( ruleHomework )
            {
            // InternalDsl.g:1899:2: ( ruleHomework )
            // InternalDsl.g:1900:3: ruleHomework
            {
             before(grammarAccess.getCourseAccess().getHomeworkHomeworkParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHomework();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getHomeworkHomeworkParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__HomeworkAssignment_4_3_1"


    // $ANTLR start "rule__Course__PersonAssignment_5_2"
    // InternalDsl.g:1909:1: rule__Course__PersonAssignment_5_2 : ( rulePerson ) ;
    public final void rule__Course__PersonAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1913:1: ( ( rulePerson ) )
            // InternalDsl.g:1914:2: ( rulePerson )
            {
            // InternalDsl.g:1914:2: ( rulePerson )
            // InternalDsl.g:1915:3: rulePerson
            {
             before(grammarAccess.getCourseAccess().getPersonPersonParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getPersonPersonParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__PersonAssignment_5_2"


    // $ANTLR start "rule__Course__PersonAssignment_5_3_1"
    // InternalDsl.g:1924:1: rule__Course__PersonAssignment_5_3_1 : ( rulePerson ) ;
    public final void rule__Course__PersonAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1928:1: ( ( rulePerson ) )
            // InternalDsl.g:1929:2: ( rulePerson )
            {
            // InternalDsl.g:1929:2: ( rulePerson )
            // InternalDsl.g:1930:3: rulePerson
            {
             before(grammarAccess.getCourseAccess().getPersonPersonParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getPersonPersonParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__PersonAssignment_5_3_1"


    // $ANTLR start "rule__Homework__DescribeAssignment_3_1"
    // InternalDsl.g:1939:1: rule__Homework__DescribeAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Homework__DescribeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1943:1: ( ( ruleEString ) )
            // InternalDsl.g:1944:2: ( ruleEString )
            {
            // InternalDsl.g:1944:2: ( ruleEString )
            // InternalDsl.g:1945:3: ruleEString
            {
             before(grammarAccess.getHomeworkAccess().getDescribeEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHomeworkAccess().getDescribeEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Homework__DescribeAssignment_3_1"


    // $ANTLR start "rule__Teacher__NameAssignment_2"
    // InternalDsl.g:1954:1: rule__Teacher__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Teacher__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1958:1: ( ( ruleEString ) )
            // InternalDsl.g:1959:2: ( ruleEString )
            {
            // InternalDsl.g:1959:2: ( ruleEString )
            // InternalDsl.g:1960:3: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__NameAssignment_2"


    // $ANTLR start "rule__Teacher__StudentAssignment_4_2"
    // InternalDsl.g:1969:1: rule__Teacher__StudentAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Teacher__StudentAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1973:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:1974:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:1974:2: ( ( ruleEString ) )
            // InternalDsl.g:1975:3: ( ruleEString )
            {
             before(grammarAccess.getTeacherAccess().getStudentPersonCrossReference_4_2_0()); 
            // InternalDsl.g:1976:3: ( ruleEString )
            // InternalDsl.g:1977:4: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getStudentPersonEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getStudentPersonEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getTeacherAccess().getStudentPersonCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__StudentAssignment_4_2"


    // $ANTLR start "rule__Teacher__StudentAssignment_4_3_1"
    // InternalDsl.g:1988:1: rule__Teacher__StudentAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Teacher__StudentAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1992:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:1993:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:1993:2: ( ( ruleEString ) )
            // InternalDsl.g:1994:3: ( ruleEString )
            {
             before(grammarAccess.getTeacherAccess().getStudentPersonCrossReference_4_3_1_0()); 
            // InternalDsl.g:1995:3: ( ruleEString )
            // InternalDsl.g:1996:4: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getStudentPersonEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getStudentPersonEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getTeacherAccess().getStudentPersonCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__StudentAssignment_4_3_1"


    // $ANTLR start "rule__Teacher__TeacherAssignment_5_1"
    // InternalDsl.g:2007:1: rule__Teacher__TeacherAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Teacher__TeacherAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2011:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:2012:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:2012:2: ( ( ruleEString ) )
            // InternalDsl.g:2013:3: ( ruleEString )
            {
             before(grammarAccess.getTeacherAccess().getTeacherPersonCrossReference_5_1_0()); 
            // InternalDsl.g:2014:3: ( ruleEString )
            // InternalDsl.g:2015:4: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getTeacherPersonEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getTeacherPersonEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getTeacherAccess().getTeacherPersonCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__TeacherAssignment_5_1"


    // $ANTLR start "rule__Student__NameAssignment_2"
    // InternalDsl.g:2026:1: rule__Student__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Student__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2030:1: ( ( ruleEString ) )
            // InternalDsl.g:2031:2: ( ruleEString )
            {
            // InternalDsl.g:2031:2: ( ruleEString )
            // InternalDsl.g:2032:3: ruleEString
            {
             before(grammarAccess.getStudentAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__NameAssignment_2"


    // $ANTLR start "rule__Student__StudentAssignment_4_2"
    // InternalDsl.g:2041:1: rule__Student__StudentAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Student__StudentAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2045:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:2046:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:2046:2: ( ( ruleEString ) )
            // InternalDsl.g:2047:3: ( ruleEString )
            {
             before(grammarAccess.getStudentAccess().getStudentPersonCrossReference_4_2_0()); 
            // InternalDsl.g:2048:3: ( ruleEString )
            // InternalDsl.g:2049:4: ruleEString
            {
             before(grammarAccess.getStudentAccess().getStudentPersonEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getStudentPersonEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getStudentAccess().getStudentPersonCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__StudentAssignment_4_2"


    // $ANTLR start "rule__Student__StudentAssignment_4_3_1"
    // InternalDsl.g:2060:1: rule__Student__StudentAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Student__StudentAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2064:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:2065:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:2065:2: ( ( ruleEString ) )
            // InternalDsl.g:2066:3: ( ruleEString )
            {
             before(grammarAccess.getStudentAccess().getStudentPersonCrossReference_4_3_1_0()); 
            // InternalDsl.g:2067:3: ( ruleEString )
            // InternalDsl.g:2068:4: ruleEString
            {
             before(grammarAccess.getStudentAccess().getStudentPersonEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getStudentPersonEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getStudentAccess().getStudentPersonCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__StudentAssignment_4_3_1"


    // $ANTLR start "rule__Student__TeacherAssignment_5_1"
    // InternalDsl.g:2079:1: rule__Student__TeacherAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Student__TeacherAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2083:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:2084:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:2084:2: ( ( ruleEString ) )
            // InternalDsl.g:2085:3: ( ruleEString )
            {
             before(grammarAccess.getStudentAccess().getTeacherPersonCrossReference_5_1_0()); 
            // InternalDsl.g:2086:3: ( ruleEString )
            // InternalDsl.g:2087:4: ruleEString
            {
             before(grammarAccess.getStudentAccess().getTeacherPersonEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getTeacherPersonEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getStudentAccess().getTeacherPersonCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__TeacherAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000902000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000408000L});

}