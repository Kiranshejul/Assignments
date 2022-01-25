import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	private int QuestionID;
	private String Question;
	private List<String> Answer1;
	private Set<String> Answer2;
	private Map<Integer,String> Answer3;
	
	
	public Question(int questionID, String question, List<String> answer1, Set<String> answer2, Map<Integer,String> answer3) {
		super();
		QuestionID = questionID;
		Question = question;
		Answer1 = answer1;
		Answer2=answer2;
		Answer3=answer3;
	}
	
	
	public void showAnswer() {
		System.out.println(QuestionID+ " "+ Question);
		System.out.println("Answers from(List,Set, Map)");	
		System.out.println("Answers fromList");
		Iterator<String> i=Answer1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("Answers fromSet");
		Iterator<String> iSet=Answer2.iterator();
		while(iSet.hasNext()) {
			System.out.println(iSet.next());
		}	
		System.out.println("Answers fromMap");
		for(Map.Entry<Integer, String> entry: Answer3.entrySet()) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}		
	}
}
