package OnlineShoppingSystem.Data;

public interface DataObject {
    void fill(byte[] record);
    int id();
    void setID(int id);
    int recordLength();
    byte[] serialize();
    String dataFile();
}
