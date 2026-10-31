package JobRecommendation;
import java.util.ArrayList;
public class User extends Person {

    private ArrayList<String> skills;

    public User() {
        skills = new ArrayList<>();
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void displaySkills() {
        System.out.println("\nUSER SKILLS");

        if (skills.isEmpty()) {
            System.out.println("No skills entered.");
        } else {
            for (String skill : skills) {
                System.out.println("- " + skill);
            }
        }
    }
}