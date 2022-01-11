package faker;

import com.github.javafaker.Faker;

public class DataCreation {

    public static String fakeFirstName(){
        Faker faker = new Faker();
        String fakeFirstName = faker.name().firstName();
        return fakeFirstName;
    }
    public static String fakeLastName(){
        Faker faker = new Faker();
        String fakeLastName = faker.name().lastName();
        return fakeLastName;
    }
    public static String fakeZip(){
        Faker faker = new Faker();
        String fakeZip = faker.address().zipCode();
        return fakeZip;
    }
}
