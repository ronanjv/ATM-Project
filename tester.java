
public class tester {
    public static void main(String[] args) throws Exception {
        ATM.openAccount("Ronan", 1000);
        // ATM.openAccount("Ronan", 500);
        ATM.openAccount("Chris", 2000);
        // ATM.transferMoney("Chris", "Ronan", 2500);
        ATM.transferMoney("Chris", "Ronan", 2000);
        ATM.depositMoney("Chris", 200);
        // ATM.withdrawMoney("Ronan", 5000);
        ATM.withdrawMoney("Chris", 200);
        ATM.closeAccount("Chris");
        ATM.checkBalance("Ronan");
        // ATM.closeAccount("Chris");
        ATM.audit();

    }
}