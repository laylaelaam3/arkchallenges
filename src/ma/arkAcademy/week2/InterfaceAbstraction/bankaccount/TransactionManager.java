package ma.arkAcademy.week2.InterfaceAbstraction.bankaccount;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private String typeTransaction;
    private List<BankAccount> trackAccount;

    public TransactionManager() {
        trackAccount=new ArrayList<>();
    }

}


