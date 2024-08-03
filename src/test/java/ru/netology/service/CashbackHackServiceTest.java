package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void negativePurchaseAmount() {
        int actual = service.remain(-100);
        int expected = 1_100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void positivePurchaseAmount() {
        int actual = service.remain(1_100);
        int expected = 900;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void zeroPurchaseAmount() {
        int actual = service.remain(0);
        int expected = 1_000;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void purchaseWithBonusAmount() {
        int actual = service.remain(1_000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

}
