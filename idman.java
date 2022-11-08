

public class idman {
    private  int burpee_sayisi;
    private int pushop_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;


    public idman(int burpee_sayisi, int pushop_sayisi, int situp_sayisi, int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushop_sayisi = pushop_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public void setPushop_sayisi(int pushop_sayisi) {
        this.pushop_sayisi = pushop_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public int getPushop_sayisi() {
        return pushop_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void hareketYap (String hareketTuru, int sayi) {
        if (hareketTuru.equals("burpee")) {
            burpeeYap(sayi);
        }
        else if (hareketTuru.equals("pushop")){
            pushopYap(sayi);
        }
        else if (hareketTuru.equals("situp")){
            situpYap(sayi);
        }
        else if (hareketTuru.equals("squat")){
            squatYap(sayi);
        }
        else {
            System.out.println("Geçersiz hareket...");
        }

    }

    private void burpeeYap(int sayi) {
        if(burpee_sayisi==0){
            System.out.println("Yapacak Burpee kalmadı...");
        }
        else if ((burpee_sayisi-sayi)<0){
            System.out.println("Hedeflediğin Burpee sayısını geçtin, tebrikler.");
            burpee_sayisi=0 ;
            System.out.println("Kalan Burpee:" + burpee_sayisi);
        }
        else {
            burpee_sayisi-=sayi;
            System.out.println("Kalan Burpee sayısı:" + burpee_sayisi);
        }
    }
    private void pushopYap(int sayi) {
        if(pushop_sayisi==0){
            System.out.println("Yapacak Pushop kalmadı...");
        }
        else if ((pushop_sayisi-sayi)<0){
            System.out.println("Hedeflediğin Pushop sayısını geçtin, tebrikler.");
            pushop_sayisi=0 ;
            System.out.println("Kalan Pushop:" + pushop_sayisi);
        }
        else {
            pushop_sayisi-=sayi;
            System.out.println("Kalan Pushop sayısı:" + pushop_sayisi);
        }
    }
    private void situpYap(int sayi) {
        if(situp_sayisi==0){
            System.out.println("Yapacak Situp kalmadı...");
        }
        else if ((situp_sayisi-sayi)<0){
            System.out.println("Hedeflediğin Situp sayısını geçtin, tebrikler.");
            situp_sayisi=0 ;
            System.out.println("Kalan Situp:" + situp_sayisi);
        }
        else {
            situp_sayisi=sayi;
            System.out.println("Kalan Situp sayısı:" + burpee_sayisi);
        }
    }private void squatYap(int sayi) {
        if(squat_sayisi==0){
            System.out.println("Yapacak Squat kalmadı...");
        }
        else if ((squat_sayisi-sayi)<0){
            System.out.println("Hedeflediğin Squat sayısını geçtin, tebrikler.");
            squat_sayisi=0 ;
            System.out.println("Kalan Squat:" + squat_sayisi);
        }
        else {
            squat_sayisi-=sayi;
            System.out.println("Kalan Squat sayısı:" +squat_sayisi);
        }
    }
    public boolean idmanBittimi(){
        return (burpee_sayisi==0) && (pushop_sayisi==0) && (situp_sayisi==0)&& (squat_sayisi==0);
    }

}
