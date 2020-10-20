package bankclient;

public class BankCreditForClient implements BankWorker   {
    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
        boolean ress = false;

        try {
            ress = bankWorker.checkClientForCredit(bankClient);
        }
        catch (Exception e) {
             e.addSuppressed(new BadCreditHistoryException("Проблемы с банковской историей"));
             e.addSuppressed(new ProblemWithLawException(" "));
        }

        return ress;
    }


    @Override
    public boolean checkClientForCredit(BankClient bankClient) {
        return false;
    }


}



