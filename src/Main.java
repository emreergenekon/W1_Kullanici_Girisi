import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Entering 3 different strings
        String userName, password, answer;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        //correct information check
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız! ");

            //if password uncorrect
        } else if (userName.equals("patika")){
            System.out.println("Hatalı giriş! Şifrenizi sıfırlamak ister misiniz?. (Evet/Hayır)");
            answer = input.nextLine();

            //if user choose "yes" option
          if (answer.equals("Evet")) {
                System.out.println("Şifreniz sıfırlandı. Yeni şifrenizi giriniz.");
                password = input.nextLine();
                System.out.println("Şifre başarıyla oluşturuldu!");

                //if user choose "no option
            } else if (answer.equals ("Hayır")){
                System.out.println("İşlem iptal edildi.");

                //error line.
            } else {
                System.out.println("Geçersiz seçim!");
            }

        }
    }
}
