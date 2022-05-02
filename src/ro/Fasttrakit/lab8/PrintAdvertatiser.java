package ro.Fasttrakit.lab8;

public class PrintAdvertatiser implements Advertatiser{
    @Override
    public void sendAdvertesment(String content) {
        String flyer = desingFlyer(content);
        String printFlyer = printFlyer(flyer);
        String[] addresse = fingarOutOfPontentilaClients();
        for (String address : addresse) {
            deliveryFlyer(address, printFlyer);
        }

    }
    String deliveryFlyer(String addresse, String printFlyer) {
        return null;
    }
    private String[] fingarOutOfPontentilaClients() {
        return new String[0];
    }

    private String printFlyer(String flyer) {
        return null;
    }

    private String desingFlyer(String content) {
        return null;
    }

    @Override
    public String reportMondly(int monthOfYear, int year) {
        return null;
    }

    @Override
    public int calculateCost(int monthOfYear, int year) {
        return 0;
    }
}
