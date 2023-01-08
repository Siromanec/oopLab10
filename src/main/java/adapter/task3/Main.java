package adapter.task3;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authentication authentication = new Authentication();
        if (authentication.authenticate(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
