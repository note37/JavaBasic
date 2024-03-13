package 벡터;

import java.util.ArrayList;
import java.util.List;

public class VectorPractice {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        list.add(new Animal("Tiger", 20,"Asia"));
        list.add(new Animal("Eagle",3,"America"));
        list.add(new Animal("Elephunt",10,"Africa"));

        for(Animal animal:list){
            System.out.println("동물이름 : " +animal.name);
            System.out.println("나이 : " +animal.age);
            System.out.println("지역 : " +animal.zone);


        }
    }
}

class Animal {

    String name;
    int age;
    String zone;
    public Animal(String name, int age, String zone) {
        this.name = name;
        this.age = age;
        this.zone = zone;
    }


}
