package solideExample.dependencyInversion.incorrectExample;

public class Client {

    DataAccess dao = new DataAccess();

    void job() {
        dao.execute();
    }
}
