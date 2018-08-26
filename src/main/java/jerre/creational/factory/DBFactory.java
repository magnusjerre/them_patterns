package jerre.creational.factory;

public class DBFactory {

    public DB getDatabase(String dbConnectionString) {
        String dbType = dbConnectionString.substring(0, dbConnectionString.indexOf(":")).toLowerCase();
        switch (dbType) {
            case "mongodb": return new MongoDB();
            case "sql": return new SqlDB();
            default: throw new UnsupportedDBException();
        }
    }

}
