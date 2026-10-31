package JobRecommendation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User();
        JobDatabase db = new JobDatabase();
        RecommendationEngine engine = new RecommendationEngine();
        ReportGenerator report = new ReportGenerator();
        System.out.println(" JOB ROLE RECOMMENDATION SYSTEM ");
        System.out.print("Enter Name : ");
        user.setName(sc.nextLine());

        System.out.print("Enter Age : ");
        user.setAge(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Qualification : ");
        user.setQualification(sc.nextLine());

        System.out.print("How many skills do you have? ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("\nEnter Your Skills:");

        for(int i = 1; i <= n; i++) {
        	System.out.print("Skill " + i + " : ");
            user.addSkill(sc.nextLine());

        }

        db.displayJobs();
        engine.recommendJobs(user, db);
        report.displayReport(user, db);
        sc.close();

    }
}
