import java.util.Scanner;
public class ticketFee {
    public static void main (String[] args){
    Scanner Input = new Scanner(System.in);
    float range, choice, km = 0.1f, fee, person, total,  discount, discount2;
    System.out.print("Mesafe giriniz (km):");
    range = Input.nextFloat();
    fee = km * range;
        if(range < 0) {
            System.out.println("Mesafe 0'dan küçük olamaz");
        }
    System.out.print("Yaşınız nedir:");
    person = Input.nextFloat();
        if(person < 0) {
            System.out.println("Yaş 0'dan küçük olamaz");
        }
    System.out.print("tek gidiş için 1'e,\ngidiş-dönüş için 2'ye basınız:");
    choice = Input.nextFloat();

        if (person < 12){
            discount = fee * 50 / 100;
            if (choice == 2){
                discount2 = fee * 20 / 100;
                total = fee - (discount + discount2);
                System.out.println("Biletiniz, % 20 daha ilave indirimlidir...:" + total);

            }else {
                total = fee -discount;
                System.out.print("Biletiniz, % 50 indirimlidir..:" + total);
            }
        }
        else if (person >= 12 && person <=24){
            discount = fee * 10 / 100;
            if (choice == 2){
                discount2 = fee * 20 / 100;
                total = fee -(discount + discount2);
                System.out.println("Biletinizde, % 20 daha ilave indirimlidir...:" + total);
            }else {
                total = fee - discount;
                System.out.println("Biletiniz, % 10 indirimlidir...:" + total);
            }
        }
        else if (person >= 25 && person <=65){
            if (choice == 2){
                discount = fee * 20 / 100;
                total = fee - discount;
                System.out.println("Biletinizde, % 20 daha ilave indirimlidir ...:" + total);
            }else {
                System.out.println("Biletinizde indirim uygulanmamaktadır:" + fee);
            }
        }
        else if (person > 65){
            discount = fee * 30 / 100;
            if (choice == 2){
                discount2 = fee * 20 / 100;
                total = fee - (discount + discount2);
                System.out.println("Biletinizde, % 20 daha ilave indirimlidir ...:" + total);
            }else {
                total = fee - discount;
                System.out.println("Biletiniz, % 30 indirimlidir..:" + total);
            }
        }
        else {
            System.out.println("Codu gözden geçirin...:" );
        }

    }
}



/*ava ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),
yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;


Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/