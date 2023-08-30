import java.util.HashMap;

public class ATM {

    static HashMap<String, Double> accountMap = new HashMap<String, Double>();

    public static void openAccount(String userId, double amount) throws Exception {
        if (!accountMap.containsKey(userId)) {
            accountMap.put(userId, amount);
        } else {
            throw new Exception("User " + userId + " already exists.");
        }
    }

    public static void closeAccount(String userId) throws Exception {
        if (accountMap.get(userId) == 0) {
            accountMap.remove(userId);
        } else
            throw new Exception("Must withdraw all money before closing account.");

    }

    public static double checkBalance(String userId) throws Exception {
        if (!accountMap.containsKey(userId)) {
            throw new Exception("Account does not exist.");
        }
        return accountMap.get(userId);
    }

    public static double depositMoney(String userId, double amount) throws Exception {
        if (accountMap.containsKey(userId)) {
            double increase = accountMap.get(userId) + amount;
            accountMap.replace(userId, accountMap.get(userId), increase);
            return increase;
        } else
            throw new Exception("You are broke AF!");
    }

    public static double withdrawMoney(String userId, double amount) throws Exception {
        if (accountMap.containsKey(userId)) {
            if (accountMap.get(userId) > amount) {
                double decrease = accountMap.get(userId) - amount;
                accountMap.replace(userId, accountMap.get(userId), decrease);
                return decrease;
            }
            throw new Exception("You are broke AF!");
        } else
            throw new Exception("You are broke AF!");
    }

}