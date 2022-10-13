import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
	@Test 
	public void testFilter() {
        List<String> input1 = new ArrayList<String>();
        input1.add("test1");
        input1.add("test22");
        input1.add("test333");
        input1.add("test4444");
        input1.add("test55555");
        input1.add("test666666");
        input1.add("test7777777");
        StringChecker sc = new StringChecker(){
            public boolean checkString(String s){
                return s.length() >= 8;
            }
        };
        input1 = ListExamples.filter(input1, sc);
        List<String> answer = new ArrayList<String>();
        answer.add("test4444");
        answer.add("test55555");
        answer.add("test666666");
        answer.add("test7777777");
        
        assertEquals(answer, input1);
	}

  
}
