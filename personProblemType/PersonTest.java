import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void personAddProblem_listOfProblemIsNotEmptyTest(){
        Person person = new Person();
        Problem problem = new Problem("money",Type.FINANCIAL);
        person.add(problem);
        assertFalse(person.problems.isEmpty());
    }
    @Test
    public void personRemoveProblem_listOfProblemIsEmptyTest(){
        Person person = new Person();
        Problem problem = new Problem("money",Type.FINANCIAL);
        person.add(problem);
        person.remove(problem);
        assertTrue(person.problems.isEmpty());

    }@Test
    public void personAddsTwoProblems_removesOne_listOfProblemIsNotEmptyTest(){
        Person person = new Person();
        Problem problem = new Problem("money",Type.FINANCIAL);
        person.add(problem);
        Problem problem2 = new Problem("tithe",Type.SPIRITUAL );
        person.add(problem2);
        person.remove(problem);
        assertFalse(person.problems.isEmpty());
    }

    @Test
    public void personAddOneProblem_solvesIt_stateChangesTest(){
        Person person = new Person();
        Problem problem = new Problem("money",Type.FINANCIAL);
        person.add(problem);
        person.solve(problem);
        assertTrue(problem.isSolved());
    }

    @Test
    public void personAddOneProblem_problemIsNotSolved(){
        Person person = new Person();
        Problem problem = new Problem("money", Type.FINANCIAL);
        person.add(problem);
        assertFalse(problem.isSolved());
    }

    @Test
    public void personRecountsProblem_listOfUnsolvedProblemsAreDisplayed(){
        Person person = new Person();
        Problem problem = new Problem("semicolonLoan", Type.FINANCIAL);
        person.add(problem);
        Problem problem2 = new Problem("tithe", Type.SPIRITUAL);
        person.add(problem2);
        Problem problem3 = new Problem("capital", Type.BUSINESS);
        person.add(problem3);
        person.solve(problem);

//        assertEquals(0, person.recount().size());




    }

}
