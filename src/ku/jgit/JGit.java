package ku.jgit;

public class JGit {

    public static void main(String[] args) {
        String command = args[0];
        if(command.equals("status")){
            status();
        }else if(command.equals("add")){
            add(args[1]);
        }
    }

    public static void status(){
        System.out.println("Status called:");
        //implement status here
    }

    public static void add(String newFile){
        System.out.println("Add called:" + newFile);
        //implement add here
    }

}
