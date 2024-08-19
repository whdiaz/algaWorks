package access;

public class CadastroPortaria {
    final static int EXPIRED_TIME_DEFAULT_IN_MONTH = 1;

    void cadastrar(Client client){
        this.cadastrar(client, EXPIRED_TIME_DEFAULT_IN_MONTH);
    }

    void cadastrar(Client client, final int expiredTimeInMonths){

        final int expiredTimeInDays = expiredTimeInMonths *30;
        System.out.printf("Client %s registered to %d days%n", client.firstName, expiredTimeInDays);

    }
}
