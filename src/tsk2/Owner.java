package tsk2;

public class Owner {
    private String name;
    private int age;
    private int driving_experience;

    public Owner(String name, int age, int driving_experience) {
        this.name = name;
        this.age = age;
        this.driving_experience = driving_experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDriving_experience() {
        return driving_experience;
    }

    public void setDriving_experience(int driving_experience) {
        this.driving_experience = driving_experience;
    }
    public void training_courses(Owner owner){
        owner.driving_experience+=1;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", driving_experience=" + driving_experience +
                '}';
    }
}
