package org.example;

public class Man extends Person{
    public Man(String firstName, String lastName, int age, String partner, boolean isDevorced){
        super(firstName, lastName, age, partner, isDevorced);
    }

    @Override
    public boolean isRetired() {
        if (getAge() >=65){
            System.out.println("Already retired");
            return true;
        }
        System.out.println("Not retired yet");
        return false;
    }
    public void registerPartnership(){
        if (getPartner()==null) {
            System.out.println("Not married");
            return;
        }
        setPartner(getLastName());
        System.out.println("This man is married to "+getPartner());
    }

    public void deregisterPartnership(){
        if (getPartner()==null){
            return;
        }else if (isDevorced()){
            System.out.println("Has devorced with "+getPartner());
        }
        System.out.println("Has a happy marriage");
    }
}
