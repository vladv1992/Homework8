package ro.Fasttrakit.lab8;

public class Company {
    private Advertatiser advertatiser;

    private int reportMondly = 210;


  public void monthlyExpenses(){
      salaryExpenses();
      rawMaterialsExpenses();
      distributionExpences();
      advertatiser.reportMondly(4,2022);

  }

    private void salaryExpenses() {
    }
    private void rawMaterialsExpenses(){

    }
    private void distributionExpences(){

    }

    public void lunchNewProdus(String name){
        designProduct();
        testNewLunch();
        if(veryfyIftheBugetCostIsAvailable()){
            advertatiser.sendAdvertesment("This messages is secret");
        }
        waitForOrder();

    }
    private boolean veryfyIftheBugetCostIsAvailable(){
        return reportMondly > advertatiser.calculateCost(4, 2022);

    }

    private void designProduct() {
    }

    private void testNewLunch(){

    }

    private void waitForOrder(){

    }


}
