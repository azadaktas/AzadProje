public class taktak {
    public static void main(String[] args) {
        FutbolPlayer alex = new FutbolPlayer();
        alex.minutes = 0 ;
        alex.name = "alex " ;
        alex.numberOfGoals = 0 ;
        alex.inPlay = true ;

        alex.play(50);
        alex.score();
        alex.score();
        System.out.println("alexin scoru :" + alex.numberOfGoals);
        System.out.println("alex bu kadar süre oynadi : " + alex.minutes);
    }
}
