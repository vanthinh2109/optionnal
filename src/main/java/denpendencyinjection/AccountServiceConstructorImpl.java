package denpendencyinjection;

import org.example.pojo.Account;
import org.example.pojo.AccountReponsitory;
import org.example.pojo.AccountService;

public class AccountServiceConstructorImpl implements AccountService {
    private AccountReponsitory accountReponsitory;


    public void setAccountReponsitory(AccountReponsitory accountReponsitory) {
        this.accountReponsitory = accountReponsitory;
    }

    @Override
    public void transferMoney(long fromAccountId, long toAccountId, double amount) {

    }

    @Override
    public void deponsitMoney(long accountId, double amount) throws Exception {

    }

    @Override
    public void depositMoney(long accountId, double amount) throws Exception {

    }

    @Override
    public Account getAccount(long accountId) {
        return null;
    }
}
