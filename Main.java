import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
     static Scanner s=new Scanner(System.in);

    static List<task> tasks = new ArrayList<>();
    public static void main(String []a){

        boolean loop =true;

        while (loop){
            System.out.println("here the options \n1.Add \n2.View\n3.Modify \n4.Delete \n5.Exit");
            int op=s.nextInt();
            switch (op){
                case 1:
                    System.out.println(toadd());
                    break;
                case 2:
                    System.out.println(viewall());

                    break;
                case 3:
                    tomodify();

                    break;
                case 4:
                    System.out.println(todelete());
                    break;
                case 5:
                    loop=false;
                    break;



            }
        }



    }

    private static String viewall() {

        for (task view:tasks){
            System.out.println(view);

        }
        return "viewing the entire list!!!";
    }

    public static String todelete() {
        System.out.println("Enter the Task_Id to delete:");
        int del_id=s.nextInt();
        System.out.println("index:"+tasks.remove(del_id-1));

        return "deleted!!!!";

    }

    public static void tomodify() {
        System.out.println("Enter the Task_Id to modify:");
        int mod_id=s.nextInt();
        tasks.remove(mod_id-1);
        String new_name;                        //task name
        String new_des;                         //description
        String new_stat;                        //status

        System.out.println("Enter the new  TaskName:");
        new_name=s.next();
        System.out.println("Enter the new Task_Description:");
        s.nextLine();
        new_des=s.nextLine();
        System.out.println("Enter the new Task_status:[pending/process/completed]");
        new_stat=s.next();


        task t= new task(new_name,new_des,new_stat);
        t.setId(mod_id);
        tasks.add(t);



    }

    public static String toadd() {
        String name;                        //task name
        String des;                         //description
        String stat;                        //status

        System.out.println("Enter the TaskName:");
        name=s.next();
        System.out.println("Enter the Task_Description:");
        s.nextLine();
        des=s.nextLine();
        System.out.println("Enter the Task_status:[pending/process/completed]");
        stat=s.next();
        task t =new task(name,des,stat);
        tasks.add(t);
        System.out.println(t);
        return "added!!!";

    }
}
