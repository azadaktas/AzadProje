public class Rectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.dikdörtgenCiz(5, 5);
    }

    public void dikdörtgenCiz(int satır, int sütün) {
        for(int i = 0 ; i<satır ; i++){
            for (int j = 0 ; j<sütün ; j++) {
                if ( j == sütün-1) {
                    System.out.print("*");

                }
                else if (i==satır-1 ){
                    System.out.print("*");
                }
                else if (i== 0 ){
                   System.out.print("*");
               }else if (j== 3 ){
                   System.out.print("");
               }
                else
                    System.out.print("");
            }
        }

    }
}
