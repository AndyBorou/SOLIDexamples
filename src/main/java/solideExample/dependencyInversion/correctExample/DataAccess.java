package solideExample.dependencyInversion.correctExample;

public class DataAccess implements Dao{
    public void execute(){
        System.out.println("execute");
    }
}
