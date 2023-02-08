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
}
