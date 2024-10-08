import java.util.Date;

public class testHesap {
    private int id;
    private int yilSayisi;
    private double bakiye;
    private double krediMiktari;
    private double yillikFaizOrani;
    private Date olusturulanTarih;

    public testHesap(int id,int yilSayisi,double bakiye,double krediMiktari,double yillikFaizOrani) {
        this.id = id;
        this.bakiye = bakiye;
        this.yilSayisi = yilSayisi;
        this.krediMiktari = krediMiktari;
        this.yillikFaizOrani = yillikFaizOrani;
        olusturulanTarih = new Date();
    }

    public int getId(){
        return this.id;
    }
    public void setId(int newId) {
        this.id = newId;
    }

    public int getBakiye(){
        return this.id;
    }
    public void setBakiye(int newBakiye) {
        this.id = newBakiye;
    }

    public double getkrediMiktari(){
        return this.krediMiktari;
    }
    public void setkrediMiktari(int krediMiktari) {
        this.id = krediMiktari;
    }

    public double getyillikFaizOrani(){
        return this.yillikFaizOrani;
    }
    public void setyillikFaizOrani(int yillikFaizOrani) {
        this.id = yillikFaizOrani;
    }

    public Date getDate() {
        return this.olusturulanTarih;
    }

    public double[] aylikOdemeGetir() {
        double aylikFaizOrani = yillikFaizOrani/12;
        double aylikOdeme = krediMiktari * aylikFaizOrani / (1-Math.pow(1/(1+aylikFaizOrani),yilSayisi * 12));

        double[] arr = new double[2];
        arr[0] = aylikFaizOrani;
        arr[1] = aylikOdeme;

        return arr;
    }


    public void paraCek(int miktar) {
        if (miktar<bakiye) {
            bakiye -= miktar;
        }else {
            System.out.println("Yetersiz Bakiye! ");
        }
    }

    public void paraYatir(int miktar) {
        bakiye += miktar;
    }


}


