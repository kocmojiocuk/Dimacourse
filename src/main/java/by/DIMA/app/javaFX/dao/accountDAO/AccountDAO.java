package by.DIMA.app.javaFX.dao.accountDAO;

import by.DIMA.app.javaFX.entity.account.Account;
import by.DIMA.app.javaFX.dao.DAO;

import java.util.Optional;

public interface AccountDAO extends DAO<Account> {
    Optional<Account> getAccount(Account account);
    boolean isExist(Account account);
}

