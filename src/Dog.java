public class Dog implements Comparable
{
    private String name;
    private int age;
    private String breed;
    private double weight;
    public static int count;

    public Dog(String name, int age, String breed, double weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        count++;
    }
    public Dog()
    {
        this.name = "";
        this.age = 0;
        this.breed = "";
        this.weight = 0.0;
        count++;
    }

    public static int getCount()
    {
        return count;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getBreed()
    {
        return breed;
    }
    public double getWeight()
    {
        return weight;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double toKilo()
    {
        double weightInKilo;
        weightInKilo = Math.floor((weight * 0.453592) * 100);
        weightInKilo /= 100;
        return weightInKilo;
    }

    public String toString()
    {
        String output = "Name: " + name;
        output += "\nAge: " + age;
        output += "\nBreed: " + breed;
        output += "\nWeight: " + weight;
        return output;
    }

    @Override
    public int compareTo(Object dog)
    {
        int output = 0;
        if (this.age < ((Dog)dog).getAge())
        {
            output = -1;
        }
        else if (this.age > ((Dog)dog).getAge())
        {
            output = 1;
        }
        return output;
    }
}
