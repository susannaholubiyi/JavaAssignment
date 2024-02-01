import java.util.Scanner;
import java.util.Arrays;

public class MBTI{

	private String[] personalityTestQuestions = new String[21];
	private String[] answerToQuestions = new String[personalityTestQuestions.length];
	private String[] extrovertedVsIntroverted = new String[5];
	private String[] sensingVsIntuitive = new String[5];
	private String[] thinkingVsFeeling = new String[5];
	private String[] judgingVsPerceptive = new String[5];
	
	private char[] mbti = new char[4];
	private static Scanner input = new Scanner(System.in);
	
	public void storePersonalityTestQuestions(){
		
		personalityTestQuestions[1] = "1) A. expend energy, enjoy groups\t\t\t\tB. conserve energy, enjoy one-on-one";
		personalityTestQuestions[2] = "2) A. Interpret literally\t\t\t\t B. Looking for meaning ang possibilities";
		personalityTestQuestions[3] = "3) A. logical, thinking, questioning\t\t\tB. empathetic, feeling, accomodating";
		personalityTestQuestions[4] = "4) A. organised, orderly\t\t\t\t B. flexible, adaptable";
		personalityTestQuestions[5] = "5) A. more outgoing, think out loud\t\t\t\tB. more reserved, think to yourself";
		personalityTestQuestions[6] = "6) A. practical, realistic, experimental\t\t\tB. imaginative, innovative, theoretical";
		personalityTestQuestions[7] = "7) A. candid, straight forward, frank\t\t\t\tB. tactfull, kind, encouraging";
		personalityTestQuestions[8] = "8) A. plan, schedule\t\t B. unplanned, spontaneous";
		personalityTestQuestions[9] = "9) A. seek many tasks, public activities, interaction with others\t\t B. seek private, solitary activities with quiet to concentrate";
		personalityTestQuestions[10] = "10) A. standard, usual, conventional\t\t\t B. different, novel, unique";		
		personalityTestQuestions[11] = "11) A. firm, tend to criticize, hold the line\t\t\tB. gentle, tend to appreciate, conciliate";
		personalityTestQuestions[12] = "12) A. regulated, structured\t\t\t\tB. easy-going, live and let live";
		personalityTestQuestions[13] = "13) A. external, communicative, express yourself\t\t\tB. internal, reticent, keep to yourself";
		personalityTestQuestions[14] = "14) A. focus on here-and-now\t\t\t\tB. look to the future, global perspective, big picture";
		personalityTestQuestions[15] = "15) A. tough-minded, just\t\t\t\tB. tender-hearted, merciful";
		personalityTestQuestions[16] = "16) A. preparation, plan ahead\t\t\t\tB. go with the flow, adapt as you go";
		personalityTestQuestions[17] = "17) A. active, initiate\t\t\t\tB. reflective, delibrate";
		personalityTestQuestions[18] = "18) A. facts, things, what is\t\t\t\tB. ideas, dreams, what could be, philosophical";
		personalityTestQuestions[19] = "19) A. matter-of-fact, issue-oriented\t\t\tB. sensitive, people-oriented, compassionate";	
		personalityTestQuestions[20] = "20) A. control, govern\t\t\tB. latitude, freedom";
		
		
		}
	public void getPersonalityTestQuestions(){
		
		System.out.println("Know your personality type!\nThis will only take 10 minutes of you time\n"); 		
		System.out.println("Answer question with 'A' or 'B': "); 	
		
		for(int count = 1; count < personalityTestQuestions.length; count++){
		
			System.out.println( personalityTestQuestions[count]); 				
			String answer = input.next();
			while(!answer.equalsIgnoreCase("a") && !answer.equalsIgnoreCase("b") ){
				System.out.print("Invalid answer!\nAnswer question with 'A' or 'B': ");
				answer = input.next();
			}
			answerToQuestions[count] = answer;
			System.out.println();
			}		
		//System.out.println(Arrays.toString(answerToQuestions));		
	}
	
	public void personalityTypeGroup(){
		int index = 0;
		int index2 = 0;
		int index3 = 0;
		int index4 = 0;
		for(int count = 1; count < personalityTestQuestions.length; count+= 4){	
				extrovertedVsIntroverted[index] = answerToQuestions[count];
				index++;	
			}
		for(int count = 2; count < personalityTestQuestions.length; count+= 4){	
				sensingVsIntuitive[index2] = answerToQuestions[count];
				index2++;	
			}
		
		for(int count = 3; count < personalityTestQuestions.length; count+= 4){	
				thinkingVsFeeling[index3] = answerToQuestions[count];
				index3++;	
			}
		for(int count = 4; count < personalityTestQuestions.length; count+= 4){	
				judgingVsPerceptive[index4] = answerToQuestions[count];
				index4++;	
			}
			
	}
	
	
	public void extrovertedVsIntrovertedAnswers(){
		
		int counterOfA = 0;
		int counterOfB = 0;
		for(int index = 0; index < extrovertedVsIntroverted.length; index++){
			if (extrovertedVsIntroverted[index].equalsIgnoreCase("A"))
				counterOfA++;
			else 
			counterOfB++;
		}
		
		
		
		if (counterOfA > counterOfB){
			mbti[0] = 'E';
		}else mbti[0] = 'I';
		
		
		
		if (extrovertedVsIntroverted[0].equalsIgnoreCase("A")){
			System.out.println("A. expend energy, enjoy groups");
		}else System.out.println("B. conserve energy, enjoy one-on-one");
		
		if (extrovertedVsIntroverted[1].equalsIgnoreCase("A")){
			System.out.println("A. more outgoing, think out loud");
		}else System.out.println("B. more reserved, think to yourself");
		
		if (extrovertedVsIntroverted[2].equalsIgnoreCase("A")){
			System.out.println("A. seek many tasks, public activities, interaction with others");
		}else System.out.println("B. seek private, solitary activities with quiet to concentrate");
		
		if (extrovertedVsIntroverted[3].equalsIgnoreCase("A")){
			System.out.println("A. external, communicative, express yourself");
		}else System.out.println("B. internal, reticent, keep to yourself");
		
		if (extrovertedVsIntroverted[4].equalsIgnoreCase("A")){
			System.out.println("A. active, initiate");
		}else System.out.println("B. reflective, delibrate");
		
		
		System.out.printf("Number of A selected: %d", counterOfA);
		System.out.printf("%nNumber of B selected: %d%n", counterOfB);
		System.out.println();
	}	
	
	public void sensingVsIntuitiveAnswers(){
	
		int counterOfA = 0;
		int counterOfB = 0;
		for(int index = 0; index < sensingVsIntuitive.length; index++){
			if (sensingVsIntuitive[index].equalsIgnoreCase("A"))
				counterOfA++;
			else 
			counterOfB++;
		}
		
		
		
		if (counterOfA > counterOfB){
			mbti[1] = 'S';
		}else mbti[1] = 'N';
		
		
		
		if (sensingVsIntuitive[0].equalsIgnoreCase("A")){
			System.out.println("A. Interpret literally");
		}else System.out.println("B. Looking for meaning ang possibilities");
		
		if (sensingVsIntuitive[1].equalsIgnoreCase("A")){
			System.out.println("A. practical, realistic, experimental");
		}else System.out.println("B. imaginative, innovative, theoretical");
		
		if (sensingVsIntuitive[2].equalsIgnoreCase("A")){
			System.out.println("A. standard, usual, conventional");
		}else System.out.println("B. different, novel, unique");
		
		if (sensingVsIntuitive[3].equalsIgnoreCase("A")){
			System.out.println("A. focus on here-and-now");
		}else System.out.println("B. look to the future, global perspective, big picture");
		
		if (sensingVsIntuitive[4].equalsIgnoreCase("A")){
			System.out.println("A. facts, things, what is");
		}else System.out.println("B. ideas, dreams, what could be, philosophical");

		System.out.printf("Number of A selected: %d", counterOfA);
		System.out.printf("%nNumber of B selected: %d%n", counterOfB);
		System.out.println();
	
	}
	
	
	public void thinkingVsFeelingAnswers(){
	
		int counterOfA = 0;
		int counterOfB = 0;
		for(int index = 0; index < thinkingVsFeeling.length; index++){
			if (thinkingVsFeeling[index].equalsIgnoreCase("A"))
				counterOfA++;
			else 
			counterOfB++;
		}
		
		
		
		if (counterOfA > counterOfB){
			mbti[2] = 'T';
		}else mbti[2] = 'F';
		
		
		
		if (thinkingVsFeeling[0].equalsIgnoreCase("A")){
			System.out.println("A. logical, thinking, questioning");
		}else System.out.println("B. empathetic, feeling, accomodating");
		
		if (thinkingVsFeeling[1].equalsIgnoreCase("A")){
			System.out.println("A. candid, straight forward, frank");
		}else System.out.println("B. tactfull, kind, encouraging");
		
		if (thinkingVsFeeling[2].equalsIgnoreCase("A")){
			System.out.println("A. firm, tend to criticize, hold the line");
		}else System.out.println("B. gentle, tend to appreciate, conciliate");
		
		if (thinkingVsFeeling[3].equalsIgnoreCase("A")){
			System.out.println("A. tough-minded, just");
		}else System.out.println("B. tender-hearted, merciful");
		
		if (thinkingVsFeeling[4].equalsIgnoreCase("A")){
			System.out.println("A. matter-of-fact, issue-oriented");
		}else System.out.println("B. sensitive, people-oriented, compassionate");

		System.out.printf("Number of A selected: %d", counterOfA);
		System.out.printf("%nNumber of B selected: %d%n", counterOfB);
		System.out.println();
	
	}



	public void judgingVsPerceptiveAnswers(){
	
		int counterOfA = 0;
		int counterOfB = 0;
		for(int index = 0; index < judgingVsPerceptive.length; index++){
			if (judgingVsPerceptive[index].equalsIgnoreCase("A"))
				counterOfA++;
			else 
			counterOfB++;
		}
		
		
		
		if (counterOfA > counterOfB){
			mbti[3] = 'J';
		}else mbti[3] = 'P';
		
		
		
		if (judgingVsPerceptive[0].equalsIgnoreCase("A")){
			System.out.println("A. organised, orderly");
		}else System.out.println("B. flexible, adaptable");
		
		if (judgingVsPerceptive[1].equalsIgnoreCase("A")){
			System.out.println("A. plan, schedule");
		}else System.out.println("B. unplanned, spontaneous");
		
		if (judgingVsPerceptive[2].equalsIgnoreCase("A")){
			System.out.println("A. regulated, structured");
		}else System.out.println("B. easy-going, live and let live");
		
		if (judgingVsPerceptive[3].equalsIgnoreCase("A")){
			System.out.println("A. preparation, plan ahead");
		}else System.out.println("B. go with the flow, adapt as you go");
		
		if (judgingVsPerceptive[4].equalsIgnoreCase("A")){
			System.out.println("A. control, govern");
		}else System.out.println("B. latitude, freedom");

		System.out.printf("Number of A selected: %d", counterOfA);
		System.out.printf("%nNumber of B selected: %d%n", counterOfB);
		System.out.println();
	
	}
	
	
	public void getMBTIResult(){
	
		extrovertedVsIntrovertedAnswers();
		sensingVsIntuitiveAnswers();
		thinkingVsFeelingAnswers();
		judgingVsPerceptiveAnswers();
		
		String mbtiType = new String(mbti);
		
		switch(mbtiType){
			
			case "INFP" -> System.out.println("""
				
					INFP
					
					Healer
					The Thoughtful Idealist (MBTI)
					The Mediator (16personalities)
					
				The INFP personality type
				
				INFPs are imaginative idealists, guided by their own core values and beliefs.
				To a Healer, possibilities are paramount; the realism of the moment is only
				of passing concern. They see potential for a better future, and pursue truth
                        	and meaning with their own individual flair.
                                       
                        	INFPs are sensitive, caring, and compassionate, and are deeply concerned with
                        	the personal growth of themselves and others. Individualistic and nonjudgmental,
                        	INFPs believe that each person must find their own path. They enjoy spending
                        	time exploring their own ideas and values, and are gently encouraging to others
                        	to do the same. INFPs are creative and often artistic; they enjoy finding new
                        	outlets for self-expression.
				
				What does INFP stand for?
				
                        	INFP is one of the sixteen personality types created by Katharine Briggs and
                        	Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI®). INFP stands
                        	for Introversion, iNtuition, Feeling, and Perceiving, which are four core
                        	personality traits based on the work of psychologist C.G. Jung.
                                                                                              
                        	Each of the four letters of the INFP code signifies a key personality trait
                        	of this type. INFPs are energized by time alone (Introverted), focus on ideas
                        	and concepts rather than facts and details (iNtuitive), make decisions based
                        	on feelings and values (Feeling), and prefer to be spontaneous and flexible
                        	rather than planned and organized (Perceiving).
                       
                    
                    For more information, visit https://www.truity.com/blog/page/16-personality-types-myers-briggs
                    """);

                    
                    
                    	case "INTJ" -> System.out.println(""" 
                    		
                    			 INTJ
                    			 
                    			 Mastermind
                    			 The Conceptual Planner (MBTI)
                    			 The Architect (16personalities)
                    			 
                    		The INTJ personality type
                    		
                    		INTJs are analytical problem-solvers, eager to improve systems and processes
                        	with their innovative ideas. They have a talent for seeing possibilities for
                        	improvement, whether at work, at home, or in themselves.
                                                    
                        	Often intellectual, INTJs enjoy logical reasoning and complex problem-solving.
                        	They approach life by analyzing the theory behind what they see, and are
                        	typically focused inward, on their own thoughtful study of the world around
                        	them. INTJs are drawn to logical systems and are much less comfortable with
                        	the unpredictable nature of other people and their emotions. They are typically
                        	independent and selective about their relationships, preferring to associate with
                        	people who they find intellectually stimulating.
                                    
                    		What does INTJ stand for?
                    		
                        	INTJ is one of the sixteen personality types created by Katharine Briggs and
                        	Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI®). INTJ stands
                        	for Introverted, iNtuitive, Thinking, Judging, which are four core personality
                        	traits based on the work of psychologist C.G. Jung.
                                                                       
                        	Each of the four letters of the INTJ code signifies a key personality trait of
                        	this type. INTJs are energized by time alone (Introverted), focus on ideas and
                        	concepts rather than facts and details (iNtuitive), make decisions based on
                        	logic and reason (Thinking) and prefer to be planned and organized rather than
                        	spontaneous and flexible (Judging).
                       
                    
                    For more information, visit https://www.truity.com/blog/page/16-personality-types-myers-briggs
                    """);

                    
                    
                    	case "INFJ" -> System.out.print(""" 
                    	
                    			INFJ
                    			
                    			Counselor
                    			The Insightful Visionary (MBTI)
                    			The Advocate (16personalities)
                    			
                    		The INFJ personality type
                    		
                    		INFJs are thoughtful nurturers with a strong sense of personal integrity and a
                        	drive to help others realize their potential. Creative and dedicated, they have
                        	a talent for helping others with original solutions to their personal challenges.
                        
                        	The Counselor has a unique ability to intuit others' emotions and motivations,
                        	and will often know how someone else is feeling before that person knows it
                        	himself. They trust their insights about others and have strong faith in their
                        	ability to read people. Although they are sensitive, they are also reserved;
                        	the INFJ is a private sort, and is selective about sharing intimate thoughts
                        	and feelings.
                                    
                   		What does INFJ stand for?
                   		
                        	INFJ is one of the sixteen personality types created by Katharine Briggs and
                        	Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI®).
                                                                       
                        	Each of the four letters of the INFJ code signifies a key personality trait
                        	of this type. The letters INFJ stand for the following dimensions of
                        	personality, based on the work of psychologist C.G. Jung:
                        	
                            * Introverted: INFJs are energized by time alone
                            * iNtuitive: INFJs focus on ideas and concepts rather than facts and details
                            * Feeling: INFJs make decisions based on feelings and values
                            * Judging: INFJs prefer to be planned and organized rather than spontaneous and flexible
                       
                    
                    For more information, visit https://www.truity.com/blog/page/16-personality-types-myers-briggs
                    """);
                    
                    
                    	case "INTP" -> System.out.print("""
                    
                    		 	INTP
                    		 
                    		 	Architect
                    		 	The Objective Analyst (MBTI)
                    		 	The Logician (16personalities)
                    		 
                    		The INTP personality type
                    		 
                    		INTPs are philosophical innovators, fascinated by logical analysis, systems, and
                        	design. They are preoccupied with theory, and search for the universal law behind
                        	everything they see. They want to understand the unifying themes of life, in all
                        	their complexity.
                        
                        	INTPs are detached, analytical observers who can seem oblivious to the world
                        	around them because they are so deeply absorbed in thought. They spend much
                        	of their time in their own heads: exploring concepts, making connections, and
                        	seeking understanding of how things work. To the Architect, life is an ongoing
                        	inquiry into the mysteries of the universe.
                                    
                    		What does INTP stand for?
                    	
                        	INTP is one of the sixteen personality types created by Katharine Briggs and
                        	Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI®). INTP stands
                        	for Introverted, iNtuitive, Thinking, Perceiving, which are four core personality
                        	traits based on the work of psychologist C.G. Jung.
                                                                                                                    
                        	The INTP type describes a person who is energized by time alone (Introverted),
                        	who focuses on ideas and concepts rather than facts and details (iNtuitive),
                        	who makes decisions based on logic and reason (Thinking) and who prefers to be
                        	spontaneous and flexible rather than planned and organized (Perceiving).
                       
                    
                    For more information, visit https://www.truity.com/blog/page/16-personality-types-myers-briggs
                    """);
                    
                    
                    	case "ENFP" -> System.out.print("""
                    	
                    			ENFP
                    			
                    		 	Champion
                    		 	The Imaginative Motivator (MBTI)
                    		 	The Campaigner (16personalities)
                    		 	
                    		 The ENFP personality type
                    		 
                    		ENFPs are people-centered creators with a focus on possibilities and a contagious
                        	enthusiasm for new ideas, people and activities. Energetic, warm, and passionate,
                        	ENFPs love to help other people explore their creative potential.
                                                                   
                        	ENFPs are typically agile and expressive communicators, using their wit, humor,
                        	and mastery of language to create engaging stories. Imaginative and original,
                        	ENFPs often have a strong artistic side. They are drawn to art because of its
                        	ability to express inventive ideas and create a deeper understanding of human
                        	experience.
                                    
                    		What does ENFP stand for?
                    		
                        	ENFP is one of the sixteen personality types created by Katharine Briggs and
                        	Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI®). ENFP
                        	stands for Extraversion, iNtuition, Feeling, and Perceiving, which are four
                        	core personality traits based on the work of psychologist C.G. Jung.
                                                                                                
                        	Each of the four letters of the ENFP code signifies a key personality trait of
                        	this type. ENFPs are energized by time spent with others (Extraverted), focus
                        	on ideas and concepts rather than facts and details (iNtuitive), make decisions
                        	based on feelings and values (Feeling), and prefer to be spontaneous and flexible
                        	rather than planned and organized (Perceiving).
                       
                    
                    For more information, visit https://www.truity.com/blog/page/16-personality-types-myers-briggs
                    """);
                    
                    
                    	case "ENTJ" -> System.out.print("""
                    			
                    			ENTJ
                    			
                    			Commander
                    			The Natural Leader (MBTI)
                    			The Commander
                    			
                    		The ENTJ personality type
                    		
                    		ENTJs are strategic leaders, motivated to organize change. They are quick to see
                        	inefficiency and conceptualize new solutions, and enjoy developing long-range plans
                        	to accomplish their vision. They excel at logical reasoning and are usually
                        	articulate and quick-witted.
                                   
                        	ENTJs are analytical and objective, and like bringing order to the world around
                        	them. When there are flaws in a system, the ENTJ sees them, and enjoys the process
                        	of discovering and implementing a better way. ENTJs are assertive and enjoy taking
                        	charge; they see their role as that of leader and manager, organizing people and
                        	processes to achieve their goals.
                                    
                    		What does ENTJ stand for?
                    		
                        	ENTJ is an acronym used to describe one of the sixteen personality types created by
                        	Katharine Briggs and Isabel Myers. It stands for Extraverted, iNtuitive, Thinking,
                        	Judging. ENTJ indicates a person who is energized by time spent with others
                        	(Extraverted), who focuses on ideas and concepts rather than facts and details
                        	(iNtuitive), who makes decisions based on logic and reason (Thinking) and who prefers
                        	to be planned and organized rather than spontaneous and flexible (Judging).
                       
                    
                    For more information, visit https://www.truity.com/blog/page/16-personality-types-myers-briggs
                    """);
                    
                    
                    	case "ENTP" -> System.out.print(""" 
                    	
                    			ENTP
                    			
                    			Visionary
                    			The Debater (16personalities)
                    			
                    		The ENTP personality type
                    		
                    		ENTPs are inspired innovators, motivated to find new solutions to intellectually
                        	challenging problems. They are curious and clever, and seek to comprehend the
                        	people, systems, and principles that surround them. Open-minded and unconventional,
                        	Visionaries want to analyze, understand, and influence other people.
                                                         
                        	ENTPs enjoy playing with ideas and especially like to banter with others. They use
                        	their quick wit and command of language to keep the upper hand with other people,
                        	often cheerfully poking fun at their habits and eccentricities. While the ENTP
                        	enjoys challenging others, in the end they are usually happy to live and let live.
                        	They are rarely judgmental, but they may have little patience for people who can't
                        	keep up.
                                    
                    		What does ENTP stand for?
                    		
                        	ENTP is an acronym used to describe one of the sixteen personality types created
                        	by Katharine Briggs and Isabel Myers. It stands for Extraverted, iNtuitive,
                        	Thinking, Perceiving. ENTP indicates a person who is energized by time spent with
                        	others (Extraverted), who focuses on ideas and concepts rather than facts and
                        	details (iNtuitive), who makes decisions based on logic and reason (Thinking) and
                        	who prefers to be spontaneous and flexible rather than planned and organized
                        	(Perceiving).
                       
                    
                    For more information, visit https://www.truity.com/blog/page/16-personality-types-myers-briggs
                    """);
                    
                    
                    	case "ENFJ" -> System.out.print(""" 
                    	
                    			ENFJ
                    			
                    			Teacher
                    			The protagonist (16personalist)
                    			
                    		The ENFJ personality type
                    		
                    		ENFJs are idealist organizers, driven to implement their vision of what is best
                        	for humanity. They often act as catalysts for human growth because of their
                        	ability to see potential in other people and their charisma in persuading others
                        	to their ideas. They are focused on values and vision, and are passionate about
                        	the possibilities for people.
                                
                        	ENFJs are typically energetic and driven, and often have a lot on their plates.
                        	They are tuned into the needs of others and acutely aware of human suffering;
                        	however, they also tend to be optimistic and forward-thinking, intuitively seeing
                        	opportunity for improvement. The ENFJ is ambitious, but their ambition is not
                        	self-serving: rather, they feel personally responsible for making the world a
                        	better place.
                                    
                    		What does ENFJ stand for?
                    		
                        	ENFJ is an acronym used to describe one of the sixteen personality types created by
                        	Katharine Briggs and Isabel Myers. It stands for Extraverted, iNtuitive, Feeling,
                        	Judging. ENFJ indicates a person who is energized by time spent with others
                        	(Extraverted), who focuses on ideas and concepts rather than facts and details
                        	(iNtuitive), who makes decisions based on feelings and values (Feeling) and who
                        	prefers to be planned and organized rather than spontaneous and flexible (Judging).
                       
                    
                    For more information, visit https://www.truity.com/blog/page/16-personality-types-myers-briggs
                    """);
                    
                    
                    	case "ISFJ" -> System.out.print(""" 
                    	
                    			ISFJ
                    			Protector 
                    			The Defender(16personalities)
                    			
                    		The ISFJ personality type
                    		
                    		ISFJs are industrious caretakers, loyal to traditions and organizations. They are
                        	practical, compassionate, and caring, and are motivated to provide for others and
                        	protect them from the perils of life.
                                     
                        	ISFJs are conventional and grounded, and enjoy contributing to established structures
                        	of society. They are steady and committed workers with a deep sense of responsibility
                        	to others. They focus on fulfilling their duties, particularly when they are taking
                        	care of the needs of other people. They want others to know that they are reliable and
                        	can be trusted to do what is expected of them. They are conscientious and methodical,
                        	and persist until the job is done.
                                    
                    		What does ISFJ stand for?
                    		
                        	ISFJ is an acronym used to describe one of the sixteen personality types created by
                        	Katharine Briggs and Isabel Myers. It stands for Introverted, Sensing, Feeling, Judging.
                        	ISFJ indicates a person who is energized by time spent alone (Introverted), who focuses
                        	on facts and details rather than ideas and concepts (Sensing), who makes decisions based
                        	on feelings and values (Feeling) and who prefers to be planned and organized rather than
                        	spontaneous and flexible (Judging).
                       
                    
                    For more information, visit https://www.truity.com/blog/page/16-personality-types-myers-briggs
                    """);
                    
                    
                    	case "ISFP" -> System.out.print(""" 
                    	
                    			ISFP
                    			
                    			Composer
                    			The Adventurer (16personalities)
                    			
                    		The ISFP personality type
                    		
                    		ISFPs are gentle caretakers who live in the present moment and enjoy their surroundings
                        	with cheerful, low-key enthusiasm. They are flexible and spontaneous, and like to go
                        	with the flow to enjoy what life has to offer. ISFPs are quiet and unassuming, and may
                        	be hard to get to know. However, to those who know them well, the ISFP is warm and
                        	friendly, eager to share in life's many experiences.
                                                          
                        	ISFPs have a strong aesthetic sense and seek out beauty in their surroundings. They are
                        	attuned to sensory experience, and often have a natural talent for the arts. ISFPs
                        	especially excel at manipulating objects, and may wield creative tools like paintbrushes
                        	and sculptor's knives with great mastery.
                                    
                    		What does ISFP stand for?
                    	
                        	ISFP is an acronym used to describe one of the sixteen personality types created by
                        	Katharine Briggs and Isabel Myers. It stands for Introverted, Sensing, Feeling,
                        	Perceiving. ISFP indicates a person who is energized by time spent alone
                        	(Introverted), who focuses on facts and details rather than ideas and concepts
                        	(Sensing), who makes decisions based on feelings and values (Feeling) and who prefers
                        	to be spontaneous and flexible rather than planned and organized (Perceiving).
                       
                    
                    For more information, visit https://www.truity.com/blog/page/16-personality-types-myers-briggs
                    """);
                    
                    
                    	case "ISTJ" -> System.out.print(""" 
                    	
                    			ISTJ
                    			
                    			Inspector
                    			The Logistician (16personalities)
                    			
                    		The ISTJ personality type
                    		
                    		ISTJs are responsible organizers, driven to create and enforce order within systems and
                        	institutions. They are neat and orderly, inside and out, and tend to have a procedure
                        	for everything they do. Reliable and dutiful, ISTJs want to uphold tradition and follow
                        	regulations.
                                                                 
                        	ISTJs are steady, productive contributors. Although they are Introverted, ISTJs are
                        	rarely isolated; typical ISTJs know just where they belong in life, and want to
                        	understand how they can participate in established organizations and systems. They
                        	concern themselves with maintaining the social order and making sure that standards
                        	are met.
                                    
                    		What does ISTJ stand for?
                    		
                        	ISTJ is an acronym used to describe one of the sixteen personality types created by
                        	Katharine Briggs and Isabel Myers. It stands for Introverted, Sensing, Thinking,
                        	Judging. ISTJ indicates a person who is energized by time spent alone (Introverted),
                        	who focuses on facts and details rather than ideas and concepts (Sensing), who makes
                        	decisions based on logic and reason (Thinking) and who prefers to be planned and
                        	organized rather than spontaneous and flexible (Judging).
                       
                    
                    For more information, visit https://www.truity.com/blog/page/16-personality-types-myers-briggs
                    """);
                    
                    
                    	case "ISTP" -> System.out.print(""" 
                    	
                    			ISTP
                    			
                    			Craftsperson
                    			The Virtuoso (16personalities)
                    			
                    		The ISTP personality type
                    		
                    		ISTPs are observant artisans with an understanding of mechanics and an interest in
                        	troubleshooting. They approach their environments with a flexible logic, looking for
                        	practical solutions to the problems at hand. They are independent and adaptable, and
                        	typically interact with the world around them in a self-directed, spontaneous manner.
                                
                        	ISTPs are attentive to details and responsive to the demands of the world around them.
                        	Because of their astute sense of their environment, they are good at moving quickly
                        	and responding to emergencies. ISTPs are reserved, but not withdrawn: the ISTP enjoys
                        	taking action, and approaches the world with a keen appreciation for the physical and
                        	sensory experiences it has to offer.
                                    
                    		What does ISTP stand for?
                    		
                        	ISTP is an acronym used to describe one of the sixteen personality types created by
                        	Katharine Briggs and Isabel Myers. It stands for Introverted, Sensing, Thinking,
                        	Perceiving. ISTP indicates a person who is energized by time spent alone (Introverted),
                        	who focuses on facts and details rather than ideas and concepts (Sensing), who makes
                        	decisions based on logic and reason (Thinking) and who prefers to be spontaneous and
                        	flexible rather than planned and organized (Perceiving).
                       
                    
                    For more information, visit https://www.truity.com/blog/page/16-personality-types-myers-briggs
                    """);
                    
                    
                    	case "ESFJ" -> System.out.print(""" 
                    	
                    			ESFJ
                    			
                    			Provider
                    			The consul (16personalities)
                    			
                    		The ESFJ personality type
                    		
                    		ESFJs are conscientious helpers, sensitive to the needs of others and energetically
                        	dedicated to their responsibilities. They are highly attuned to their emotional
                        	environment and attentive to both the feelings of others and the perception others
                        	have of them. ESFJs like a sense of harmony and cooperation around them, and are
                        	eager to please and provide.
                                                            
                        	ESFJs value loyalty and tradition, and usually make their family and friends their
                        	top priority. They are generous with their time, effort, and emotions. They often
                        	take on the concerns of others as if they were their own, and will attempt to put
                        	their significant organizational talents to use to bring order to other people's
                        	lives.
                                    
                    		What does ESFJ stand for?
                    		
                        	ESFJ is an acronym used to describe one of the sixteen personality types created by
                        	Katharine Briggs and Isabel Myers. It stands for Extraverted, Sensing, Feeling,
                        	Judging. ESFJ indicates a person who is energized by time spent with others
                        	(Extraverted), who focuses on facts and details rather than ideas and concepts
                        	(Sensing), who makes decisions based on feelings and values (Feeling) and who prefers
                        	to be planned and organized rather than spontaneous and flexible (Judging).
                       
                    
                    For more information, visit https://www.truity.com/blog/page/16-personality-types-myers-briggs
                    """);
                    
                    
                    	case "ESFP" -> System.out.print(""" 
                    	
                    			ESFP
                    			
                    			Performer
                    			The Entertainer (16personality) 
                    			
                    		The ESFP personality type
                    		
                    		ESFPs are vivacious entertainers who charm and engage those around them. They are
                        	spontaneous, energetic, and fun-loving, and take pleasure in the things around
                        	them: food, clothes, nature, animals, and especially people.
                              
                        	ESFPs are typically warm and talkative and have a contagious enthusiasm for life.
                        	They like to be in the middle of the action and the center of attention. They have
                        	a playful, open sense of humor, and like to draw out other people and help them
                        	have a good time.
                                    
                    		What does ESFP stand for?
                    		
                        	ESFP is an acronym used to describe one of the sixteen personality types created by
                        	Katharine Briggs and Isabel Myers. It stands for Extraverted, Sensing, Feeling,
                        	Perceiving. ESFP indicates a person who is energized by time spent with others
                        	(Extraverted), who focuses on facts and details rather than ideas and concepts
                        	(Sensing), who makes decisions based on feelings and values (Feeling) and who prefers
                        	to be spontaneous and flexible rather than planned and organized (Perceiving).
                       
                    
                    For more information, visit https://www.truity.com/blog/page/16-personality-types-myers-briggs
                    """);
                    
                    
                    	case "ESTJ" -> System.out.print(""" 
                    	
                    			ESTJ
                    			
                    			Supervisor
                    			The Executive (16personalities)
                    			
                    		The ESTJ personality type
                    		
                    		ESTJs are hardworking traditionalists, eager to take charge in organizing projects
                        	and people. Orderly, rule-abiding, and conscientious, ESTJs like to get things done,
                        	and tend to go about projects in a systematic, methodical way.
                                        
                        	ESTJs are the consummate organizers, and want to bring structure to their surroundings.
                        	They value predictability and prefer things to proceed in a logical order. When they
                        	see a lack of organization, the ESTJ often takes the initiative to establish processes
                        	and guidelines, so that everyone knows what's expected.
                                    
                    		What does ESTJ stand for?
                    		
                        	ESTJ is an acronym used to describe one of the sixteen personality types created by
                        	Katharine Briggs and Isabel Myers. It stands for Extraverted, Sensing, Thinking,
                        	Judging. ESTJ indicates a person who is energized by time spent with others
                        	(Extraverted), who focuses on facts and details rather than ideas and concepts
                        	(Sensing), who makes decisions based on logic and reason (Thinking) and who prefers
                        	to be planned and organized rather than spontaneous and flexible (Judging).
                       
                    
                    For more information, visit https://www.truity.com/blog/page/16-personality-types-myers-briggs
                    """);
                    
                    
                    	case "ESTP" -> System.out.print(""" 
                    	
                    			ESTP
                    			
                    			Dynamo
                    			The Enterpreneur (16personalities)
                    			
                    		The ESTP personality type
                    		
                    		ESTPs are energetic thrill-seekers who are at their best when putting out fires,
                        	whether literal or metaphorical. They bring a sense of dynamic energy to their
                        	interactions with others and the world around them. They assess situations quickly
                        	and move adeptly to respond to immediate problems with practical solutions.
                                                                               
                        	Active and playful, ESTPs are often the life of the party and have a good sense
                        	of humor. They use their keen powers of observation to assess their audience and
                        	adapt quickly to keep interactions exciting. Although they typically appear very
                        	social, they are rarely sensitive; the ESTP prefers to keep things fast-paced and
                        	silly rather than emotional or serious.
                                    
                    		What does ESTP stand for?
                    		
                        	ESTP is an acronym used to describe one of the sixteen personality types created by
                        	Katharine Briggs and Isabel Myers. It stands for Extraverted, Sensing, Thinking,
                        	Perceiving. ESTP indicates a person who is energized by time spent with others
                        	(Extraverted), who focuses on facts and details rather than ideas and concepts
                        	(Sensing), who makes decisions based on logic and reason (Thinking) and who prefers
                        	to be spontaneous and flexible rather than planned and organized (Perceiving).
                       
                    
                    For more information, visit https://www.truity.com/blog/page/16-personality-types-myers-briggs
                    """);
                    
		}
	
	}
}

