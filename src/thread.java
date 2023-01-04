public class thread {
    public static void main(String[] args) {
        System.out.println("Program Baslatıldı "+ Thread.currentThread().getName());


        isci isci1 = new isci();
        isci1.setName("ıscı sınıfı setname ıle ");
        isci1.start();
        iscirunnuble isci2 = new iscirunnuble();
        Thread isci22 = new Thread(isci2);
        isci22.start();


        System.out.println("program bitti");

    }
}
