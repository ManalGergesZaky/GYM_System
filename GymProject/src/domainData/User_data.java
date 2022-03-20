/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domainData;

/**
 *
 * @author Lola
 */
public class User_data {

    private String name,name_class, membership , trainer;
    int id , age , phone;
    
    public User_data( int id ,String name, int age, int phone, String name_class, String membership , String trainer) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.name_class = name_class;
        this.membership = membership;
        this.trainer = trainer ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName_class() {
        return name_class;
    }

    public void setName_class(String name_class) {
        this.name_class = name_class;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }
            
    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    
}
