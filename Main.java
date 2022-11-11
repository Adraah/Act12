import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int num;

        addressBook.load();

        do{
            System.out.println("Selecciona una opcion: ");
            System.out.println("1 Lista de contactos");
            System.out.println("2 Crear nuevo contacto");
            System.out.println("3 Eliminar contacto");
            System.out.println("4 Salir");

            num = scan.nextInt();

            switch (num) {
                case 1:
                    addressBook.list();
                    break;
                case 2:
                    System.out.println("Numero de contacto: ");
                    String numero = scan.next();
                    System.out.println("Nombre de contacto: ");
                    String nombre = scan.next();
                    addressBook.create(numero, nombre);
                    break;
                case 3:
                    System.out.println("Numero de contacto: ");
                    String number = scan.next();
                    addressBook.delete(number);
                    break;
                case 4:
                    break;
            }
        }while(num != 4);

        addressBook.save(addressBook.Contact);
    }
}