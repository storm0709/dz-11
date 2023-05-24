package org.example;

public class Woman extends Person{
    private String lastNameOriginal;
    public Woman(String firstName, String lastName, int age, String partner, boolean isDevorced, String lastNameOriginal){
        super(firstName, lastName, age, partner, isDevorced);
        this.lastNameOriginal=lastNameOriginal;
    }

    @Override
    public boolean isRetired() {
        if (getAge()>=60){
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
        setLastName(getPartner());
        System.out.println("This woman has married to "+getPartner());
    }
    public void deregisterPartnership(){
        if (getPartner()==null){
            return;
        }else if (isDevorced()){
            setLastName(lastNameOriginal);
            System.out.println("Has devorced with "+getPartner());
        }
        System.out.println("Has a happy marriage");
    }

    public String getLastNameOriginal() {
        return lastNameOriginal;
    }

    public void setLastNameOriginal(String lastNameOriginal) {
        this.lastNameOriginal = lastNameOriginal;
    }
}
