package JobRecommendation;

import java.util.ArrayList;

public class RecommendationEngine {

    // Compare user skills with job skills
    public void recommendJobs(User user, JobDatabase db) {

        ArrayList<Job> jobs = db.getJobs();

        System.out.println("\n========== JOB RECOMMENDATIONS ==========");

        for (Job job : jobs) {

            int matchedSkills = 0;
            ArrayList<String> missingSkills = new ArrayList<>();

            // Compare required skills with user skills
            for (String requiredSkill : job.getRequiredSkills()) {

                boolean found = false;

                for (String userSkill : user.getSkills()) {

                    if (requiredSkill.equalsIgnoreCase(userSkill)) {
                        matchedSkills++;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    missingSkills.add(requiredSkill);
                }
            }

            // Calculate Match Percentage
            double percentage = ((double) matchedSkills / job.getRequiredSkills().size()) * 100;

            job.setMatchPercentage(percentage);

            // Display Recommendation
            System.out.println("\n----------------------------------");
            System.out.println("Job Role : " + job.getJobName());
            System.out.printf("Match Percentage : %.2f%%\n", percentage);

            System.out.println("Matched Skills : " + matchedSkills);

            System.out.println("Missing Skills :");

            if (missingSkills.isEmpty()) {
                System.out.println("None");
            } else {
                for (String skill : missingSkills) {
                    System.out.println("- " + skill);
                }
            }
        }
    }
}
