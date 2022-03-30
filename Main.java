public class Main {
    public static void main(String[] args){
        //Object Oriented (Nesne yönelimli) ATM programı
        //Login class kullanıcı girişini kontrol edecek.
        //Hesap class Hesap işlemlerini yapacak
        //Atm ise atm yi çalıştıracak.

        ATM atm = new ATM();
        Hesap hesap = new Hesap("Beyhan Küçükmustafa","663720",2150);
        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor.");
    }
}
