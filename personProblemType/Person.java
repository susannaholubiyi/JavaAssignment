import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Person {

    public List<Problem> problems = new ArrayList<>();

    public void add(Problem problem){
        problems.add(problem);
    }

    public void remove(Problem problem) {
        problems.remove(problem);
    }

    public void solve(Problem problem) {
        problem.changeStatus();
    }

//    public Collection<Object> recount() {
//
//    }
}
