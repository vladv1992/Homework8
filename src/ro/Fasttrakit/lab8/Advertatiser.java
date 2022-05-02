package ro.Fasttrakit.lab8;

public interface Advertatiser {

    void sendAdvertesment(String content);
    String reportMondly(int monthOfYear, int year);
    int calculateCost(int monthOfYear, int year);
}
