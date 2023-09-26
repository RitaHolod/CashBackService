package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCashBackHackService {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void purchaseOver1000() {

        int amount = 1200;

        int expected = 800;
        int actual = service.remain(1200);

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void purchaseBelow1000() {

        int amount = 100;

        int expected = 900;
        int actual = service.remain(100);

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void purchase1000() {

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(1000);

        Assertions.assertEquals(actual, expected);

    }
}
