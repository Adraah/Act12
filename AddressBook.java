import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class AddressBook {
    HashMap<String, String> Contact = new HashMap<String, String>();

    public void save(HashMap<String,String> map){
        try {
            File fileOne=new File("addressbook");
            FileOutputStream fos=new FileOutputStream(fileOne);
            ObjectOutputStream oos=new ObjectOutputStream(fos);

            oos.writeObject(map);
            oos.flush();
            oos.close();
            fos.close();
        } catch(Exception e) {}
    }

    public void load(){
        try {
            File toRead=new File("addressbook");
            FileInputStream fis=new FileInputStream(toRead);
            ObjectInputStream ois=new ObjectInputStream(fis);

            Contact=(HashMap<String,String>)ois.readObject();

            ois.close();
            fis.close();
        } catch(Exception e) {}
    }

    public void list(){
        for (String i : Contact.keySet()) {
            System.out.println("Numero: " + i + " Nombre: " + Contact.get(i));
        }
    }

    public void create(String number, String name){
        Contact.put(number,name);
    }

    public void delete(String number){
        Contact.remove(number);
    }
}
