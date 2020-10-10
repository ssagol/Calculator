package proje;

import java.util.Scanner;

public class Proje {

    public static int toplamaIslemi1(int x, int y) {

        int islem = x + y;
        return islem;
    }

    public static int toplamaIslemi1(int x, int y, int z) {

        int islem = x + y + z;
        return islem;
    }

    public static int toplamaIslemi1(int x, int y, int z, int k) {

        int islem = x + y + z + k;
        return islem;
    }

    public static int cikarmaIslemi2(int x, int y) {

        int islem = x - y;
        return islem;
    }

    public static int cikarmaIslemi2(int x, int y, float z) {

        int islem = (int) ((x - y) - z);
        return islem;
    }

    public static int cikarmaIslemi2(int x, int y, float z, float k) {

        int islem = (int) ((x - y) - z - k);
        return islem;
    }

    public static int sayiOlusturma3(int k, int m) {

        int num1 = (int) ((Math.random() * ((k - m) + 1)) + m);
        return num1;
    }

    public static float sayiOlusturma3(float n, float r) {

        float num2 = (float) ((Math.random() * ((n - r) + 1)) + r);
        return num2;
    }

    public static float bölmeIslemi4(float s, float q) {

        float islem = s / q;
        if (q == 0) {
            System.out.println((int) s / (int) q);
        }
        return islem;
    }

    public static int bölmeIslemi4(int w, int t) {

        int islem = w / t;
        return islem;
    }

    public static int faktoriyelHesabi5(int x) {

        int fa = 1;
        for (int i = 1; i <= x; i++) {
            fa = fa * i;
        }
        return fa;
    }

    public static int secilenSayiArasiToplamaIslemi6(int x, int y) {

        int toplam = 0;
        for (int i = x; i < y; i++) {                                                              // sayıları kullanıcıdan almıştım ve for döngüsüule her sayıyı 
            toplam = (toplam + i);                                                                 // toplama ekleyerek aradaki sayıların toplamını buldurdum
        }
        return toplam - x;
    }

    public static int ikiarrayToplami7(int[] dizi1, int[] dizi2) {

        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 0; i < dizi1.length; i++) {                                                   // 1.arraydeki her elemanı for döngüsü içinde toplamla toplattım

            toplam1 += dizi1[i];
        }
        for (int j = 0; j < dizi2.length; j++) {                                                   // 2.arraydeki her elemanı for döngüsü içinde toplamla toplattım

            toplam2 += dizi2[j];
        }
        int islem = toplam1 + toplam2;                                                             // 2 diziyi topladım         
        return islem;
    }

    public static void asalSayiBulma8(int x) {
        int gosterge = 0;

        if (x == 0 || x == 1) {                                                                    // sayi 1 ve 0 a eşit olduğunda asal olmadığını ve
            System.out.println(x + " is not prime number");
        } else {
            for (int i = 2; i <= x / 2; i++) {                                                       // kendisinin yarısının modunun 0 çıktığı durumda da asal olmadığını
                if (x % i == 0) {
                    System.out.println(x + " is not prime number");
                    gosterge = 1;
                    break;
                }
            }
            if (gosterge == 0) {
                System.out.println(x + " is prime number");                                         // diger durumlarda asal olduğunu hesapladım
            }
        }
    }

    public static int elemanArama9(int dizi[], int ilkEleman, int sonEleman, int aranan) {

        int bulunanEleman = (ilkEleman + sonEleman) / 2;
        while (ilkEleman <= sonEleman) {
            if (dizi[bulunanEleman] < aranan) {
                ilkEleman = bulunanEleman + 1;
            } else if (dizi[bulunanEleman] == aranan) {
                System.out.println("The element is " + aranan + " and its index is=" + bulunanEleman);
                break;
            } else {
                sonEleman = bulunanEleman - 1;
            }
            bulunanEleman = (ilkEleman + sonEleman) / 2;
        }
        if (ilkEleman > sonEleman) {
            System.out.println("There is no element " + aranan + " in the array. ");
        }
        return aranan;
    }

    public static double standartSapma10(double[] dizi) {

        double toplam = 0.0;
        double standart = 0.0;

        double ortalama = toplam / dizi.length;                                                             // ortalamayı sayıların toplamını sayı sayısına bölerek buldum

        for (int i = 0; i < dizi.length; i++) {

            toplam = toplam + dizi[i];                                                                      // dizideki her elemanı for döngsüne alarak toplamla topladım

            double hes = dizi[i] - ortalama;                                                                // her elemandan ortalamayı çıkararak bir hes değeri buşdum ve
            standart += (Math.pow(hes, 2));                                                                 // hes değerinin arresi bize başka bir sonuc getirdi ve 
        }
        double ss = (standart / (dizi.length - 1));                                                         // bu sonucun sayı sayısının bir eksiğine bölümünün
                                                                                                            // karesi bize standart sapmayı verdi
        double sonuc = Math.sqrt(ss);
        System.out.println("Average of numbers= " + (toplam / dizi.length));
        return sonuc;
    }

    public static void main(String[] args) {
        System.out.println("===== ----- Hello ----- ===== ");
        System.out.println("  ");
        System.out.println("=> 1: The sum between 2 or 3 or 4 numbers:");
        System.out.println("=> 2: The subtraction  between 2 or 3 or 4 number:");
        System.out.println("=> 3: The product between two integer or float numbers:");
        System.out.println("=> 4: The division between two integer or float numbers:");
        System.out.println("=> 5: The factorial of a number:");
        System.out.println("=> 6: The summation of the numbers between two selected numbers:");
        System.out.println("=> 7: Sum two arrays:");
        System.out.println("=> 8: Test if a number is prime or not:");
        System.out.println("=> 9: Test if a number is in array or not:");
        System.out.println("=> 10: Compute the standard deviation of numbers:");
        System.out.println("  ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please,enter the calculation number you want to do");
        int islemNo = sc.nextInt();

        switch (islemNo) {
            case 1:
                System.out.println("How many numbers for sum");                                                                  //overloading ile 2 metot oluşturdum ve kullanıcıdan
                int tpSayisi = sc.nextInt();                                                                                     // kaç sayı için işlem yapmak istediği sordum
                System.out.println("Please, Enter " + tpSayisi + " numbers");
                if (tpSayisi == 2) {
                    int sayi1 = sc.nextInt();                                                                                    //2 tane sayı alarak 2 sayının toplamı şeklinde yazdırdım.
                    int sayi2 = sc.nextInt();
                    System.out.println("Two numbers sum = " + toplamaIslemi1(sayi1, sayi2));
                }
                if (tpSayisi == 3) {
                    int sayi1 = sc.nextInt();                                                                                    //3 tane sayı alarak 3 sayının toplamı şeklinde yazdırdım.
                    int sayi2 = sc.nextInt();
                    int sayi3 = sc.nextInt();
                    System.out.println("Three numbers sum = " + toplamaIslemi1(sayi1, sayi2, sayi3));
                }
                if (tpSayisi == 4) {
                    int sayi1 = sc.nextInt();                                                                                    //4 tane sayı alarak 4 sayının toplamı şeklinde yazdırdım.
                    int sayi2 = sc.nextInt();
                    int sayi3 = sc.nextInt();
                    int sayi4 = sc.nextInt();
                    System.out.println("Four numbers sum = " + toplamaIslemi1(sayi1, sayi2, sayi3, sayi4));
                }
                break;

            case 2:
                System.out.println("How many numbers for subtraction");                                                         //overloading ile 2 metot oluşturdum ve kullanıcıdan
                int ckSayisi = sc.nextInt();                                                                                    //kaç sayı için işlem yapmak istediğini sordum
                System.out.println("Please, Enter " + ckSayisi + " numbers");
                if (ckSayisi == 2) {
                    int sayii1 = sc.nextInt();                                                                                  // 2 tane sayı alarak 2 sayıyı çıkarma şeklinde yazdırdım.
                    int sayii2 = sc.nextInt();
                    System.out.println("Two numbers substract = " + cikarmaIslemi2(sayii1, sayii2));
                }
                if (ckSayisi == 3) {
                    int sayii1 = sc.nextInt();                                                                                  // 3 tane sayı alarak 3 sayıyı çıkarma şeklinde yazdırdım.
                    int sayii2 = sc.nextInt();
                    int sayii3 = sc.nextInt();
                    System.out.println("Three numbers substract = " + cikarmaIslemi2(sayii1, sayii2, sayii3));
                }
                if (ckSayisi == 4) {
                    int sayii1 = sc.nextInt();                                                                                 // 4 tane sayı alarak 4 sayıyı çıkarma şeklinde yazdırdım.            
                    int sayii2 = sc.nextInt();
                    int sayii3 = sc.nextInt();
                    int sayii4 = sc.nextInt();
                    System.out.println("Four numbers substract = " + cikarmaIslemi2(sayii1, sayii2, sayii3, sayii4));
                }
                break;

            case 3:
                System.out.println("=> Which data type product? 1-Integer 2-Float");                                          //kullanıcıdan hangi veri tipinde random oluşturmak istediğini aldım
                int a = sc.nextInt();
                if (a == 1) {
                    System.out.println("=> Please,Enter the random integer numbers to product as min-max ");                  // kullanıcıdan min ve max olacak şekilde 
                    int k = sc.nextInt();                                                                                     // integer sayı aralıkları aldım ve random sayı oluşturdum.
                    int m = sc.nextInt();
                    System.out.println("Random number between two integer number = " + sayiOlusturma3(k, m));
                }
                if (a == 2) {
                    System.out.println("=> Please,Enter the random float numbers to product as min-max ");                    // kullanıcıdan min ve max olacak şekilde 
                    float n = sc.nextFloat();                                                                                 // float sayı aralıkları aldım ve random sayı oluşturdum.
                    float r = sc.nextFloat();
                    System.out.println("Random number between two float number = " + sayiOlusturma3(n, r));
                }
                break;

            case 4:
                System.out.println("=> Which data type division? 1-Integer 2-Float");
                int b = sc.nextInt();
                if (b == 1) {
                    System.out.println("=> Please,Enter two integer numbers to division");                                    // bölme işlemi yapılacak 2 integer sayıyı kullanıcıdan aldım.
                    int w = sc.nextInt();
                    int t = sc.nextInt();
                    if (t == 0) {
                        System.out.println("Cannot divide into zero");
                    }
                    System.out.println("Two integer numbers divison = " + bölmeIslemi4(w, t));
                }
                if (b == 2) {
                    System.out.println("=> Please,Enter two float numbers to division");                                       // bölme işlemi yapılacak 2 float sayıyı kullanıcıdan aldım.
                    float s = sc.nextFloat();
                    float q = sc.nextFloat();
                    if (q == 0) {
                        System.out.println("Cannot divide into zero");
                    }
                    System.out.println("Two float numbers divison= " + bölmeIslemi4(s, q));
                }
                break;

            case 5:
                System.out.println("=> Please,Enter one number for factorial");                                               //faktöriyeli alınmak istenen sayıyı kullanıcıdan aldım.
                int c = sc.nextInt();
                System.out.println("Factorial of the Number= " + faktoriyelHesabi5(c));
                break;

            case 6:
                System.out.println("=> Please,Enter the numbers as min-max");                                                 // kullanıcıdan iki sayı arasını toplatmak istediği
                int d = sc.nextInt();                                                                                         // sayıları girmesini istedim ve o sayılar ve arasındaki
                int e = sc.nextInt();                                                                                         // sayıları toplattım. 
                System.out.println("Sum of the numbers between " + d + "-" + e + "=" + secilenSayiArasiToplamaIslemi6(d, e));
                break;

            case 7:
                System.out.println("=> Please,Enter the number of value");                                                    //kaç elemanlı dizi toplatmak istediğini
                int kac = sc.nextInt();                                                                                       //kullanıcıdan aldım.
                int[] dizi1 = new int[kac];
                int[] dizi2 = new int[kac];
                System.out.println("=> Please,Enter the first array");                                                        // kullanıcıdan dizileri aldım
                for (int i = 0; i < dizi1.length; i++) {
                    dizi1[i] = sc.nextInt();
                }
                System.out.println("=> Please,Enter the second array");
                for (int j = 0; j < dizi2.length; j++) {
                    dizi2[j] = sc.nextInt();
                }
                System.out.println("Sum of two arrays=" + ikiarrayToplami7(dizi1, dizi2));                                    //iki dizi toplamı
                break;

            case 8:
                System.out.println("=> Please,Enter number for prime number check");
                int asal = sc.nextInt();                                                                                     // asal sayı kontrolü için kullanıcıdan
                asalSayiBulma8(asal);                                                                                        // sayı girmesini istedim.
                break;

            case 9:
                System.out.println("=> Please,Enter the number of value");                                                   // kaç elemanlı dizide arama yapmak
                int kaceleman = sc.nextInt();                                                                                // istediğini kullanıcıya sordum
                int[] dizi = new int[kaceleman];
                System.out.println("=> Please, enter the array " + kaceleman + " elements");
                for (int km = 0; km < dizi.length; km++) {
                    dizi[km] = sc.nextInt();
                }
                System.out.println("=> Please,Enter number to search for it");                                               // dizide aramak istediği sayıyı
                int aranan = sc.nextInt();                                                                                   // kullanıcıdan girmesini istedim
                int sonA = dizi.length - 1;
                elemanArama9(dizi, 0, sonA, aranan);
                break;

            case 10:
                System.out.println("How many numbers are compute standard deviation?");                                      // bu soruyu nasıl yapacağımı anlamadığım için
                int n = sc.nextInt();                                                                                        // boş kalmasını istemediğim anladığım şekilde;

                double y[] = new double[(int) n];                                                                            //kullanıcıdan kaç tane sayının standart sapmasını
                System.out.println("=> Please,Enter " + n + " numbers");                                                     //hesaplamak istediği sordum ve ona göre işlem yaptım
                for (int i = 0; i < y.length; i++) {
                    y[i] = sc.nextDouble();

                }
                System.out.println("Standard deviation of " + n + " numbers=" + standartSapma10(y));

                break;
        }
        System.out.println("====== ------ Thanks ------ ======");                                                            // her işlem sonunda ve hesap mkainesinden çıkmak için
        if (islemNo == 0) {                                                                                                  // sıfıra basıldığında thank mesajı yazdırdım

            while (islemNo != 0);
        }
    }

}
