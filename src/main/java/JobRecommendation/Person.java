package JobRecommendation;


	public class Person {

	    private String name;
	    private int age;
	    private String qualification;

	    public Person() {

	    }

	    public Person(String name, int age, String qualification) {
	        this.name = name;
	        this.age = age;
	        this.qualification = qualification;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public void setQualification(String qualification) {
	        this.qualification = qualification;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getQualification() {
	        return qualification;
	    }

	    public void displayPersonDetails() {
	        System.out.println("\nUSER DETAILS");
	        System.out.println("Name          : " + name);
	        System.out.println("Age           : " + age);
	        System.out.println("Qualification : " + qualification);
	    }
	}


