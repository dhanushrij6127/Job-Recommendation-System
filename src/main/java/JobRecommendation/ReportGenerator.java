package JobRecommendation;

import java.util.ArrayList;

public class ReportGenerator {

    public void displayReport(User user, JobDatabase db) {

        System.out.println("JOB RECOMMENDATION REPORT");
        
        user.displayPersonDetails();

        user.displaySkills();

        System.out.println("\nRECOMMENDED JOBS");

        ArrayList<Job> jobs = db.getJobs();

        boolean found = false;

        for (Job job : jobs) {

            if (job.getMatchPercentage() >= 50) {

                found = true;

                System.out.println("Job Role: " + job.getJobName());
                System.out.printf("Match Percentage : %.2f%%\n",
                        job.getMatchPercentage());
            }
        }

        if (!found) {
            System.out.println("\nNo suitable job found.");
            System.out.println("Try learning more technical skills.");
        }

        System.out.println("END OF REPORT");
        
    }
}
