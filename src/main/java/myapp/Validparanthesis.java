package myapp;
import java.util.Stack;
public class Validparanthesis {
    
    public boolean isValid(String s) {
      Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else if(c==')'|| c=='}' || c==']'){
                if(stack.isEmpty() || !validPairs(stack.pop(),c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    private boolean validPairs(char open,char close){
        return (open=='('&& close==')')||
                (open=='{'&& close=='}')|| (open=='['&& close==']');
    }
}