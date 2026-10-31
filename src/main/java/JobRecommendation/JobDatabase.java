package JobRecommendation;

import java.util.ArrayList;

public class JobDatabase {

    private ArrayList<Job> jobs;

    public JobDatabase() {

        jobs = new ArrayList<>();

        addJobs();
    }

    public void addJobs() {

        Job java = new Job("Java Developer");
        java.addRequiredSkill("Java");
        java.addRequiredSkill("SQL");
        java.addRequiredSkill("Git");
        java.addRequiredSkill("Spring Boot");
        jobs.add(java);

        Job frontend = new Job("Frontend Developer");
        frontend.addRequiredSkill("HTML");
        frontend.addRequiredSkill("CSS");
        frontend.addRequiredSkill("JavaScript");
        frontend.addRequiredSkill("React");
        jobs.add(frontend);

        Job backend = new Job("Backend Developer");
        backend.addRequiredSkill("Java");
        backend.addRequiredSkill("SQL");
        backend.addRequiredSkill("Spring Boot");
        backend.addRequiredSkill("REST API");
        jobs.add(backend);

        Job fullstack = new Job("Full Stack Developer");
        fullstack.addRequiredSkill("Java");
        fullstack.addRequiredSkill("HTML");
        fullstack.addRequiredSkill("CSS");
        fullstack.addRequiredSkill("JavaScript");
        fullstack.addRequiredSkill("SQL");
        jobs.add(fullstack);

        Job analyst = new Job("Data Analyst");
        analyst.addRequiredSkill("SQL");
        analyst.addRequiredSkill("Excel");
        analyst.addRequiredSkill("Python");
        analyst.addRequiredSkill("Power BI");
        jobs.add(analyst);

        Job aiml = new Job("AI/ML Engineer");
        aiml.addRequiredSkill("Python");
        aiml.addRequiredSkill("Machine Learning");
        aiml.addRequiredSkill("NumPy");
        aiml.addRequiredSkill("Pandas");
        jobs.add(aiml);

        Job tester = new Job("Software Tester");
        tester.addRequiredSkill("Java");
        tester.addRequiredSkill("SQL");
        tester.addRequiredSkill("Selenium");
        tester.addRequiredSkill("Manual Testing");
        jobs.add(tester);
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void displayJobs() {

        System.out.println("\nAVAILABLE JOB ROLES");

        for (Job job : jobs) {
            System.out.println(job.getJobName());
        }
    }
}