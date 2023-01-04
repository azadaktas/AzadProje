package threadrenklerı;

import java.util.ArrayList;

public class Contatcs {
    ArrayList<Person> rehberdekiKişiler ;


    public Contatcs() {
        this.rehberdekiKişiler = new ArrayList<>();

    }
    public Person findPersonByName(String name ){
        for(Person person : rehberdekiKişiler){
            if (person.getName().equals(name)){


            }

        }


        return null;
    }
    public void findPersonBySurName(String surname ){
        for(Person person : rehberdekiKişiler){
            if (person.getSurname().equals(surname)){


            }
        }

    }

    public void findPersoPhoneNumber(String phoneNumber ){
        for(Person person : rehberdekiKişiler){
            if (person.getPhoneNumber().equals(phoneNumber)){


            }
        }

    }
    public void   rehberdenKişiEkle(Person eklenecekPerson){

                rehberdekiKişiler.add(eklenecekPerson);
    }


    public void rehberdenKişiSil(Person silinicekPerson){
        rehberdekiKişiler.remove(silinicekPerson);

    }
        public ArrayList<Person> getRehberdekiKişiler() {
        return rehberdekiKişiler;


        }


    @Override
    public String toString() {
        return "Contatcs{" +
                "rehberdekiKişiler=" + rehberdekiKişiler +
                '}';
    }
}

