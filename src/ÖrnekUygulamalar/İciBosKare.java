package ÖrnekUygulamalar;

public class İciBosKare {
    public static void main(String[] args) {
        İciBosKare ücgen = new İciBosKare();

        ücgen.ücgenYap(10,10);


    }
    public void ücgenYap(int row , int column){
        for (int i = 0 ; i<row ; i++){
            for (int j= 0  ;j<column;j++){
                System.out.print("*");
                if (column==0){
                    System.out.println("*");
                }
            }
            System.out.println(" ");
            column++;
        }

    }
}
