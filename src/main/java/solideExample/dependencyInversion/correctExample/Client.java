package solideExample.dependencyInversion.correctExample;

public class Client {

    Dao dao = new DataAccess();

    void job() {
        dao.execute();
    }
}
