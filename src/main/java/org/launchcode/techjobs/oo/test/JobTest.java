package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        JobTest job1 = new JobTest();
        JobTest job2 = new JobTest();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobs() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job1 instanceof Job);
        assertEquals(job1.getName(),"Product tester");
        assertTrue(job1.getEmployer() instanceof Employer);
        assertEquals(job1.getEmployer().getValue(), "ACME");
        assertTrue(job1.getLocation() instanceof Location);
        assertEquals(job1.getLocation().getValue(), "Desert");
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertEquals(job1.getPositionType().getValue(), "Quality control");
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(job1.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(job1, job2);
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {

        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        char startsWith = job1.toString().charAt(0);
        char endsWith = job1.toString().charAt(job1.toString().length()-1);
        assertEquals(startsWith,'\n');
        assertEquals(endsWith,'\n');

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        String answer = "\nID: "+job2.getId()+"\n" +
                "Name: "+ job2.getName()+"\n" +
                "Employer: "+job2.getEmployer()+"\n" +
                "Location: "+job2.getLocation()+"\n" +
                "Position Type: "+job2.getPositionType()+"\n" +
                "Core Competency: "+job2.getCoreCompetency()+"\n";

        assertEquals(answer, job2.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job3 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
        String actual = job3.toString();
        String expected = "\nID: "+job3.getId()+"\n" +
                "Name: "+ job3.getName()+"\n" +
                "Employer: Data not available\n" +
                "Location: "+job3.getLocation()+"\n" +
                "Position Type: "+job3.getPositionType()+"\n" +
                "Core Competency: "+job3.getCoreCompetency()+"\n";

        assertEquals(expected, actual) ;
    }
}
