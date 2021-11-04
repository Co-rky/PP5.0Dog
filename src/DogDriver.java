public class DogDriver
{
    public static void main (String[] args)
    {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Piper", 3, "Australian Shepherd", 45);
        Dog dog3 = new Dog("Nugget", 2, "Morkie", 8);

        System.out.println("Fang's age: " + dog1.getAge());
        System.out.println("Fang's breed: " + dog1.getBreed());
        System.out.println();
        System.out.println("Piper's weight: " + dog2.getWeight());
        // System.out.println("Piper's weight in kg: " + dog2.toKilo());
        System.out.println();
        System.out.println(dog3.toString());
        System.out.println();
        System.out.println("Total dogs: " + Dog.getCount());

        System.out.println();

        if (dog2.compareTo(dog1) == 0)
        {
            System.out.println(dog2.getName() + " is the same age as " + dog1.getName());
        }
        else if (dog2.compareTo(dog1) > 0)
        {
            System.out.println(dog2.getName() + " is older than " + dog1.getName());
        }
        else
        {
            System.out.println(dog2.getName() + " is younger than " + dog1.getName());
        }

        if (dog1.compareTo(dog3) == 0)
        {
            System.out.println(dog1.getName() + " is the same age as " + dog3.getName());
        }
        else if (dog1.compareTo(dog3) > 0)
        {
            System.out.println(dog1.getName() + " is older than " + dog3.getName());
        }
        else
        {
            System.out.println(dog1.getName() + " is younger than " + dog3.getName());
        }
    }
}
