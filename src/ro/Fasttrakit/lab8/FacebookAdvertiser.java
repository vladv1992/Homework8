package ro.Fasttrakit.lab8;

public class FacebookAdvertiser implements Advertatiser{

    @Override
    public void sendAdvertesment(String content) {
        contentToFacebook("Comapny:password");
        sentTheAdvertisement(content);
        trackInternalCost();
        

    }

    private void trackInternalCost() {
    }

    private void sentTheAdvertisement(String content) {
        
    }

    private void contentToFacebook(String society) {
        
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
