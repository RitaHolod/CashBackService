package ru.netology;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestCashBackHackService {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void purchaseOver1000() {

        int amount = 1200;

        int expected = 800;
        int actual = service.remain(1200);

        assertEquals(actual, expected);

    }

    @Test
    public void purchaseBelow1000() {

        int amount = 100;

        int expected = 900;
        int actual = service.remain(100);

        assertEquals(actual, expected);

    }

    @Test
    public void purchase1000() {

        int amount = 1000;

        int expected = 1000;
        int actual = service.remain(1000);

        assertEquals(actual, expected);

    }
}
