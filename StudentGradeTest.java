import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class StudentGradeTest{
    
	private static StudentGrade lagbajaSchools;
	
    	

    	@BeforeEach
    	public void setGrade(){
    	
		lagbajaSchools = new StudentGrade();
		int[][] grades = {{67, 21, 49}, 
			  	  {98, 62, 56}, 
			  	  {93, 34, 27}, 
			  	  {78, 83, 66}};
    		
		lagbajaSchools.setGrade(grades);	
    	}
    	
    	
    	@Test
    	public void testGetTotal(){
    	
    		int[] student1 = {67, 21, 49};
    		int expected = 137;
    		int actual = lagbajaSchools.getTotal(student1);
    	
    		assertEquals(expected, actual);
    	
    	}
    	
    	
    	@Test
    	public void testGetAverage(){
    	
    		int[] student2 = {98, 62, 56};
    		double expected = 72.00;
    		double actual = lagbajaSchools.getAverage(student2);
    	
    		assertEquals(expected, actual);
    	
    	}
    	
    	
    	@Test
    	public void testGetLowestScore(){
    	
    		int expected = 21;
    		int actual = lagbajaSchools.getLowestScore(1);
    	
    		assertEquals(expected, actual);

    	}
    	
    	
    	@Test
    	public void testGetHighestScore(){
    	
    		int expected = 66;
    		int actual = lagbajaSchools.getHighestScore(2);
    	
    		assertEquals(expected, actual);
    	}
    	
    	
    	@Test
    	public void testGetHighestScoringStudent(){
    	
    		int expected = (4);
    		int actual = lagbajaSchools.getHighestScoringStudent(2);
    	
    		assertEquals(expected, actual);
    	
    	}
    	
    	
    	@Test
    	public void testGetLowestScoringStudent(){
    	
    		int expected = (1);
    		int actual = lagbajaSchools.getLowestScoringStudent(1);
    	
    		assertEquals(expected, actual);
    	}
    	
    	
    	@Test
    	public void testGetTotalScoresInSubject(){
    	
    		int expected = 336;
    		int actual = lagbajaSchools.getTotalScoresInSubject(0);
    	
    		assertEquals(expected, actual);
    	}
    	
    	
    	@Test
    	public void testgetAverageScoreInSubject(){
    	
    		double expected = 49.50;
    		double actual = lagbajaSchools.getAverageScoreInSubject(2);
    	
    		assertEquals(expected, actual);
    	}
    	
    	
    	@Test
    	public void testgetNumberOfPasses(){
    	
    		int expected = 2;
    		int actual = lagbajaSchools.getNumberOfPasses(1);
    	
    		assertEquals(expected, actual);
    	}
    	
    	
    	@Test
    	public void testgetNumberOfFails(){
    	
    		int expected = 0;
    		int actual = lagbajaSchools.getNumberOfFails(0);
    	
    		assertEquals(expected, actual);
    	}
    }
