import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String userName, passWord;
    int right=3;
    int select;
    int balance = 1500;
        Scanner input= new Scanner(System.in);
        while (right>0){
            System.out.print("Kullanıcı Adınız: ");userName = input.nextLine();
            System.out.print("Şifreniz: ");passWord = input.nextLine();
            if (userName.equals("patika")&&passWord.equals("dev123")) {
                System.out.print("Patika Bankasına Hoşgeldiniz");
            System.out.println("\n1-Para Yatırma \n" + "2-Para Çekme \n" + "3-Bakiye Sorgulama \n" + "4-Çıkış Yap");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz."); select = input.nextInt();
            switch (select){
                case 1:
                    System.out.print("Yatırılacak Tutar: "); int yPara =input.nextInt();
                    balance += yPara;
                    System.out.println("Yeni Bakiyeniz: "+balance);
                    break;
                case  2:
                    System.out.print("Çekilecek Tutar: "); int cPara =input.nextInt();
                    if (cPara<balance){
                        balance -= cPara;
                        System.out.println("Yeni Bakiyeniz: "+balance);
                    }
                    else {
                        System.out.println("Yetersiz Bakiye.");
                    }
                    break;
                case 3:
                    System.out.println("Bakiyeniz: "+balance);
                case 4:
                    System.out.println("Çıkış Yaptınız.");
                    break;
                default:
                    System.out.println("Yanlış Seçim Yaptınız.");
            }}
            else{
                right --;
                System.out.print("Hatalı Kullanıcı Adı veya Şifre. Lütfen Tekrar Deneyiniz. ");
                System.out.println("Kalan Hakkınız: " +right);
            }
            if (right==0){
                System.out.print("Hesabınız Bloke Olmuştur.");
            }
            }
}
}
