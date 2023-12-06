public class Animal {
    public void Sound(){
        System.out.println("Hayvon ovozlari");
    }
    public void GetName(){
        System.out.println("Hayvon nomlari");
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        Duck duck=new Duck();
        Cat cat=new Cat();
        dog.Sound();
        dog.GetName();
        duck.Sound();
        duck.GetName();
        cat.Sound();
        cat.GetName();
    }
}
