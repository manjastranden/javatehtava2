package main;

public class Hedgehog {
    private String name;
    private int age;

    public Hedgehog() { 
        name = "Pikseli";
        age = 5;
    }

    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age; 
    }

    public void speak(String text) {
        if (text.isEmpty()) { System.out.println("Olen "+this.name+ " ja ikäni on "+this.age+" vuotta, mutta antaisitko silti syötteen?");
    }
        else {System.out.println(this.name+": "+text);}


    }

    public void run(int rounds) {
        for (int i=0; i< rounds; i++) {
            System.out.println(this.name + " juoksee kovaa vauhtia!");
        }
    }
    public void askInput() {
        System.out.println("Olen "+this.name+ " ja ikäni on "+this.age+" vuotta, mutta antaisitko silti syötteen?");

    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name =name;

    }
    public void setAge(int age) {
        this.age = age;
    }
}

