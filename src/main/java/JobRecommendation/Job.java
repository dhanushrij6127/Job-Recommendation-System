package JobRecommendation;

import java.util.ArrayList;

public class Job {

    private String jobName;
    private ArrayList<String> requiredSkills;
    private double matchPercentage;

    public Job() {
        requiredSkills = new ArrayList<>();
    }

    public Job(String jobName) {
        this.jobName = jobName;
        requiredSkills = new ArrayList<>();
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public void setMatchPercentage(double matchPercentage) {
        this.matchPercentage = matchPercentage;
    }

    public String getJobName() {
        return jobName;
    }

    public ArrayList<String> getRequiredSkills() {
        return requiredSkills;
    }

    public double getMatchPercentage() {
        return matchPercentage;
    }

    public void addRequiredSkill(String skill) {
        requiredSkills.add(skill);
    }

    public void displayJobDetails() {

        System.out.println("\nJob Role : " + jobName);

        System.out.println("Required Skills :");

        for(String skill : requiredSkills) {
            System.out.println("- " + skill);
        }

        System.out.println("Match Percentage : " + matchPercentage + "%");
    }
}

