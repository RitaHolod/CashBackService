package ru.netology;

import org.junit.Test;
import org.junit.Assert;

public class TestCashBackHackService {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void purchaseOver1000() {

        int amount = 1200;

        int expected = 800;
        int actual = service.remain(1200);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void purchaseBelow1000() {

        int amount = 100;

        int expected = 900;
        int actual = service.remain(100);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void purchase1000() {

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(expected, actual);

    }

}
