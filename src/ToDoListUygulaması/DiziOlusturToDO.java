package ToDoListUygulaması;


import javax.swing.*;
import java.util.ArrayList;
public class DiziOlusturToDO {

    ArrayList<Object> toDoList = new ArrayList<>();
    public static void main(String[] args) {
        DiziOlusturToDO tak = new DiziOlusturToDO();
        tak.start();
    }

    private  void start() {
        String str = "lütfen bir secim yapiniz : ";
        str+="/n 1 -> listele ";
        str+="/n 2 -> Ekle";
        str+="/n 3 -> Sil ";
        str+="/n 0  -> Cıkıs ";

        String secim = JOptionPane.showInputDialog(null,str);
        if (secim == null){
            secim ="0";
        }else if (secim.equals("") || secim.matches("[^0-9]+")){
            start();
        }switch (secim){
            case "0" :
                exit();
                break;
            case "1" :
                list();
            case "2" :
                add();
            case "3" :
                delete();
        }
    }

    private void delete() {

    }

    private  void add() {
        String title = JOptionPane.showInputDialog(null,"tittle giriniz ");
        if (title!=null && !title.equals("")){
            if (toDoList.indexOf(title)>= 0 ){
                JOptionPane.showMessageDialog(null,"sisteme kayıtlı bir veri girdiniz ");
                add();
            }else {
                toDoList.add(title);
                JOptionPane.showMessageDialog(null,"kayıt eklendi ");
                start();
            }
        }
    }

    private  void list() {
        String str = "toDoList ";
        str+= "\n ********************\n";
        for (int i = 0 ; i<toDoList.size(); i++ ){
            str += "a" + i + toDoList.get(i) + "\n";
        }
        str+= "Toplam" + toDoList.size() + "kayıt bulunmaktadır" ;
        message(str);
        start();
    }

    private void message(String str) {
        JOptionPane.showMessageDialog(null,str);
    }

    private  void exit() {
        int confirm = JOptionPane.showConfirmDialog(null,"cıkmak istediginizden eminmisiniz ");
        if (confirm==0){
            System.exit(0);
        }else {
            start();
        }
    }
}
