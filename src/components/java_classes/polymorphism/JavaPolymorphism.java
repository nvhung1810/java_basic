package components.java_classes.polymorphism;

public class JavaPolymorphism {
  public static void main(String[] args) {
    AnimalSuperClass animalSuperClass = new AnimalSuperClass();
    AnimalSuperClass myPig = new PigSubClass();
    AnimalSuperClass myDog = new DogSubClass();

    animalSuperClass.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}

/**
 * Java Polymorphism /ˌpɑː.liˈmɔːr.fɪ.zəm/
 *
 * Đa hình có nghĩa là "nhiều dạng" và nó xảy ra khi chúng ta có nhiều lớp có
 * liên quan với nhau bằng tính kế thừa.
 *
 * Like we specified in the previous chapter; Inheritance lets us inherit
 * attributes and methods from another class. Polymorphism uses those methods to
 * perform different tasks. This allows us to perform a single action in
 * different ways.
 *
 * For example, think of a superclass called Animal that has a method called
 * animalSound(). Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And
 * they also have their own implementation of an animal sound (the pig oinks,
 * and the cat meows, etc.):
 *
 * superClass is Animals has method animalSound().
 * subClasses is Pigs, Cats, Dogs, Birds has an animal sound (the pig oinks, and
 * the cat meows, etc.):
 *
 * Tinh da hinh la viec co the lam nhieu bien the cua method
 */
