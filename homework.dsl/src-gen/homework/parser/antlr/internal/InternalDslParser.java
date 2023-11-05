package homework.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import homework.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Course'", "'{'", "'homework'", "','", "'}'", "'person'", "'Homework'", "'Describe'", "'Teacher'", "'student'", "'('", "')'", "'teacher'", "'Student'"
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

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Course";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCourse"
    // InternalDsl.g:64:1: entryRuleCourse returns [EObject current=null] : iv_ruleCourse= ruleCourse EOF ;
    public final EObject entryRuleCourse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourse = null;


        try {
            // InternalDsl.g:64:47: (iv_ruleCourse= ruleCourse EOF )
            // InternalDsl.g:65:2: iv_ruleCourse= ruleCourse EOF
            {
             newCompositeNode(grammarAccess.getCourseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCourse=ruleCourse();

            state._fsp--;

             current =iv_ruleCourse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // InternalDsl.g:71:1: ruleCourse returns [EObject current=null] : ( () otherlv_1= 'Course' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'homework' otherlv_5= '{' ( (lv_homework_6_0= ruleHomework ) ) (otherlv_7= ',' ( (lv_homework_8_0= ruleHomework ) ) )* otherlv_9= '}' )? (otherlv_10= 'person' otherlv_11= '{' ( (lv_person_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_person_14_0= rulePerson ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleCourse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_homework_6_0 = null;

        EObject lv_homework_8_0 = null;

        EObject lv_person_12_0 = null;

        EObject lv_person_14_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( () otherlv_1= 'Course' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'homework' otherlv_5= '{' ( (lv_homework_6_0= ruleHomework ) ) (otherlv_7= ',' ( (lv_homework_8_0= ruleHomework ) ) )* otherlv_9= '}' )? (otherlv_10= 'person' otherlv_11= '{' ( (lv_person_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_person_14_0= rulePerson ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalDsl.g:78:2: ( () otherlv_1= 'Course' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'homework' otherlv_5= '{' ( (lv_homework_6_0= ruleHomework ) ) (otherlv_7= ',' ( (lv_homework_8_0= ruleHomework ) ) )* otherlv_9= '}' )? (otherlv_10= 'person' otherlv_11= '{' ( (lv_person_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_person_14_0= rulePerson ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalDsl.g:78:2: ( () otherlv_1= 'Course' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'homework' otherlv_5= '{' ( (lv_homework_6_0= ruleHomework ) ) (otherlv_7= ',' ( (lv_homework_8_0= ruleHomework ) ) )* otherlv_9= '}' )? (otherlv_10= 'person' otherlv_11= '{' ( (lv_person_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_person_14_0= rulePerson ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalDsl.g:79:3: () otherlv_1= 'Course' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'homework' otherlv_5= '{' ( (lv_homework_6_0= ruleHomework ) ) (otherlv_7= ',' ( (lv_homework_8_0= ruleHomework ) ) )* otherlv_9= '}' )? (otherlv_10= 'person' otherlv_11= '{' ( (lv_person_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_person_14_0= rulePerson ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalDsl.g:79:3: ()
            // InternalDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCourseAccess().getCourseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCourseAccess().getCourseKeyword_1());
            		
            // InternalDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCourseAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCourseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"homework.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:113:3: (otherlv_4= 'homework' otherlv_5= '{' ( (lv_homework_6_0= ruleHomework ) ) (otherlv_7= ',' ( (lv_homework_8_0= ruleHomework ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:114:4: otherlv_4= 'homework' otherlv_5= '{' ( (lv_homework_6_0= ruleHomework ) ) (otherlv_7= ',' ( (lv_homework_8_0= ruleHomework ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getCourseAccess().getHomeworkKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:122:4: ( (lv_homework_6_0= ruleHomework ) )
                    // InternalDsl.g:123:5: (lv_homework_6_0= ruleHomework )
                    {
                    // InternalDsl.g:123:5: (lv_homework_6_0= ruleHomework )
                    // InternalDsl.g:124:6: lv_homework_6_0= ruleHomework
                    {

                    						newCompositeNode(grammarAccess.getCourseAccess().getHomeworkHomeworkParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_homework_6_0=ruleHomework();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCourseRule());
                    						}
                    						add(
                    							current,
                    							"homework",
                    							lv_homework_6_0,
                    							"homework.Dsl.Homework");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:141:4: (otherlv_7= ',' ( (lv_homework_8_0= ruleHomework ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDsl.g:142:5: otherlv_7= ',' ( (lv_homework_8_0= ruleHomework ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCourseAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:146:5: ( (lv_homework_8_0= ruleHomework ) )
                    	    // InternalDsl.g:147:6: (lv_homework_8_0= ruleHomework )
                    	    {
                    	    // InternalDsl.g:147:6: (lv_homework_8_0= ruleHomework )
                    	    // InternalDsl.g:148:7: lv_homework_8_0= ruleHomework
                    	    {

                    	    							newCompositeNode(grammarAccess.getCourseAccess().getHomeworkHomeworkParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_homework_8_0=ruleHomework();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCourseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"homework",
                    	    								lv_homework_8_0,
                    	    								"homework.Dsl.Homework");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:171:3: (otherlv_10= 'person' otherlv_11= '{' ( (lv_person_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_person_14_0= rulePerson ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:172:4: otherlv_10= 'person' otherlv_11= '{' ( (lv_person_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_person_14_0= rulePerson ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getCourseAccess().getPersonKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:180:4: ( (lv_person_12_0= rulePerson ) )
                    // InternalDsl.g:181:5: (lv_person_12_0= rulePerson )
                    {
                    // InternalDsl.g:181:5: (lv_person_12_0= rulePerson )
                    // InternalDsl.g:182:6: lv_person_12_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getCourseAccess().getPersonPersonParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_person_12_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCourseRule());
                    						}
                    						add(
                    							current,
                    							"person",
                    							lv_person_12_0,
                    							"homework.Dsl.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:199:4: (otherlv_13= ',' ( (lv_person_14_0= rulePerson ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDsl.g:200:5: otherlv_13= ',' ( (lv_person_14_0= rulePerson ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getCourseAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:204:5: ( (lv_person_14_0= rulePerson ) )
                    	    // InternalDsl.g:205:6: (lv_person_14_0= rulePerson )
                    	    {
                    	    // InternalDsl.g:205:6: (lv_person_14_0= rulePerson )
                    	    // InternalDsl.g:206:7: lv_person_14_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getCourseAccess().getPersonPersonParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_person_14_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCourseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"person",
                    	    								lv_person_14_0,
                    	    								"homework.Dsl.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRulePerson"
    // InternalDsl.g:237:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalDsl.g:237:47: (iv_rulePerson= rulePerson EOF )
            // InternalDsl.g:238:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalDsl.g:244:1: rulePerson returns [EObject current=null] : (this_Teacher_0= ruleTeacher | this_Student_1= ruleStudent ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        EObject this_Teacher_0 = null;

        EObject this_Student_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:250:2: ( (this_Teacher_0= ruleTeacher | this_Student_1= ruleStudent ) )
            // InternalDsl.g:251:2: (this_Teacher_0= ruleTeacher | this_Student_1= ruleStudent )
            {
            // InternalDsl.g:251:2: (this_Teacher_0= ruleTeacher | this_Student_1= ruleStudent )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:252:3: this_Teacher_0= ruleTeacher
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getTeacherParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Teacher_0=ruleTeacher();

                    state._fsp--;


                    			current = this_Teacher_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:261:3: this_Student_1= ruleStudent
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getStudentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Student_1=ruleStudent();

                    state._fsp--;


                    			current = this_Student_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleHomework"
    // InternalDsl.g:273:1: entryRuleHomework returns [EObject current=null] : iv_ruleHomework= ruleHomework EOF ;
    public final EObject entryRuleHomework() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHomework = null;


        try {
            // InternalDsl.g:273:49: (iv_ruleHomework= ruleHomework EOF )
            // InternalDsl.g:274:2: iv_ruleHomework= ruleHomework EOF
            {
             newCompositeNode(grammarAccess.getHomeworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHomework=ruleHomework();

            state._fsp--;

             current =iv_ruleHomework; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHomework"


    // $ANTLR start "ruleHomework"
    // InternalDsl.g:280:1: ruleHomework returns [EObject current=null] : ( () otherlv_1= 'Homework' otherlv_2= '{' (otherlv_3= 'Describe' ( (lv_Describe_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleHomework() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_Describe_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:286:2: ( ( () otherlv_1= 'Homework' otherlv_2= '{' (otherlv_3= 'Describe' ( (lv_Describe_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalDsl.g:287:2: ( () otherlv_1= 'Homework' otherlv_2= '{' (otherlv_3= 'Describe' ( (lv_Describe_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalDsl.g:287:2: ( () otherlv_1= 'Homework' otherlv_2= '{' (otherlv_3= 'Describe' ( (lv_Describe_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalDsl.g:288:3: () otherlv_1= 'Homework' otherlv_2= '{' (otherlv_3= 'Describe' ( (lv_Describe_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalDsl.g:288:3: ()
            // InternalDsl.g:289:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHomeworkAccess().getHomeworkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHomeworkAccess().getHomeworkKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getHomeworkAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:303:3: (otherlv_3= 'Describe' ( (lv_Describe_4_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:304:4: otherlv_3= 'Describe' ( (lv_Describe_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getHomeworkAccess().getDescribeKeyword_3_0());
                    			
                    // InternalDsl.g:308:4: ( (lv_Describe_4_0= ruleEString ) )
                    // InternalDsl.g:309:5: (lv_Describe_4_0= ruleEString )
                    {
                    // InternalDsl.g:309:5: (lv_Describe_4_0= ruleEString )
                    // InternalDsl.g:310:6: lv_Describe_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getHomeworkAccess().getDescribeEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_Describe_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHomeworkRule());
                    						}
                    						set(
                    							current,
                    							"Describe",
                    							lv_Describe_4_0,
                    							"homework.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getHomeworkAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHomework"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:336:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:336:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:337:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:343:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:349:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:350:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:350:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:351:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:359:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTeacher"
    // InternalDsl.g:370:1: entryRuleTeacher returns [EObject current=null] : iv_ruleTeacher= ruleTeacher EOF ;
    public final EObject entryRuleTeacher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeacher = null;


        try {
            // InternalDsl.g:370:48: (iv_ruleTeacher= ruleTeacher EOF )
            // InternalDsl.g:371:2: iv_ruleTeacher= ruleTeacher EOF
            {
             newCompositeNode(grammarAccess.getTeacherRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeacher=ruleTeacher();

            state._fsp--;

             current =iv_ruleTeacher; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTeacher"


    // $ANTLR start "ruleTeacher"
    // InternalDsl.g:377:1: ruleTeacher returns [EObject current=null] : ( () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'student' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teacher' ( ( ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleTeacher() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:383:2: ( ( () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'student' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teacher' ( ( ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalDsl.g:384:2: ( () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'student' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teacher' ( ( ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalDsl.g:384:2: ( () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'student' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teacher' ( ( ruleEString ) ) )? otherlv_12= '}' )
            // InternalDsl.g:385:3: () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'student' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teacher' ( ( ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalDsl.g:385:3: ()
            // InternalDsl.g:386:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTeacherAccess().getTeacherAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTeacherAccess().getTeacherKeyword_1());
            		
            // InternalDsl.g:396:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:397:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:397:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:398:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTeacherAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeacherRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"homework.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:419:3: (otherlv_4= 'student' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:420:4: otherlv_4= 'student' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getTeacherAccess().getStudentKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDsl.g:428:4: ( ( ruleEString ) )
                    // InternalDsl.g:429:5: ( ruleEString )
                    {
                    // InternalDsl.g:429:5: ( ruleEString )
                    // InternalDsl.g:430:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTeacherRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTeacherAccess().getStudentPersonCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:444:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDsl.g:445:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTeacherAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:449:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:450:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:450:6: ( ruleEString )
                    	    // InternalDsl.g:451:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTeacherRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTeacherAccess().getStudentPersonCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getTeacherAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:471:3: (otherlv_10= 'teacher' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:472:4: otherlv_10= 'teacher' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getTeacherAccess().getTeacherKeyword_5_0());
                    			
                    // InternalDsl.g:476:4: ( ( ruleEString ) )
                    // InternalDsl.g:477:5: ( ruleEString )
                    {
                    // InternalDsl.g:477:5: ( ruleEString )
                    // InternalDsl.g:478:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTeacherRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTeacherAccess().getTeacherPersonCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTeacher"


    // $ANTLR start "entryRuleStudent"
    // InternalDsl.g:501:1: entryRuleStudent returns [EObject current=null] : iv_ruleStudent= ruleStudent EOF ;
    public final EObject entryRuleStudent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudent = null;


        try {
            // InternalDsl.g:501:48: (iv_ruleStudent= ruleStudent EOF )
            // InternalDsl.g:502:2: iv_ruleStudent= ruleStudent EOF
            {
             newCompositeNode(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStudent=ruleStudent();

            state._fsp--;

             current =iv_ruleStudent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // InternalDsl.g:508:1: ruleStudent returns [EObject current=null] : ( () otherlv_1= 'Student' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'student' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teacher' ( ( ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleStudent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:514:2: ( ( () otherlv_1= 'Student' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'student' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teacher' ( ( ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalDsl.g:515:2: ( () otherlv_1= 'Student' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'student' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teacher' ( ( ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalDsl.g:515:2: ( () otherlv_1= 'Student' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'student' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teacher' ( ( ruleEString ) ) )? otherlv_12= '}' )
            // InternalDsl.g:516:3: () otherlv_1= 'Student' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'student' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teacher' ( ( ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalDsl.g:516:3: ()
            // InternalDsl.g:517:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStudentAccess().getStudentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStudentAccess().getStudentKeyword_1());
            		
            // InternalDsl.g:527:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:528:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:528:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:529:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStudentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStudentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"homework.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:550:3: (otherlv_4= 'student' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:551:4: otherlv_4= 'student' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getStudentAccess().getStudentKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getStudentAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDsl.g:559:4: ( ( ruleEString ) )
                    // InternalDsl.g:560:5: ( ruleEString )
                    {
                    // InternalDsl.g:560:5: ( ruleEString )
                    // InternalDsl.g:561:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStudentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStudentAccess().getStudentPersonCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:575:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalDsl.g:576:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getStudentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:580:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:581:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:581:6: ( ruleEString )
                    	    // InternalDsl.g:582:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStudentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStudentAccess().getStudentPersonCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getStudentAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:602:3: (otherlv_10= 'teacher' ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:603:4: otherlv_10= 'teacher' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getStudentAccess().getTeacherKeyword_5_0());
                    			
                    // InternalDsl.g:607:4: ( ( ruleEString ) )
                    // InternalDsl.g:608:5: ( ruleEString )
                    {
                    // InternalDsl.g:608:5: ( ruleEString )
                    // InternalDsl.g:609:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStudentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStudentAccess().getTeacherPersonCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStudent"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000908000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000808000L});

}