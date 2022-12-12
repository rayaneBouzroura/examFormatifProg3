package com.example.finaltests2;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class TestService {




    @Test(expected = Exception.class)
    public void testNombrePersonneNegatif() {
        //ADD
        Service service = new Service();
        //ACT
        int poignees = service.nombrePoigneesDeMainPour(-1);
        //ASSERT
        Assert.fail("Exception non lancée");
    }

    @Test
    public void testNombrePersonneZero() {
        //ADD
        Service service = new Service();
        //ACT
        int poignees = service.nombrePoigneesDeMainPour(0);
        //ASSERT
        assertEquals(0,poignees);
    }
    @Test
    public void testDeuxPersonnes() {
        //ADD
        Service service = new Service();
        //ACT
        int poignees = service.nombrePoigneesDeMainPour(2);
        //ASSERT
        assertEquals(1,poignees);
    }
    @Test
    public void testQuatrePersonnes() {
        //ADD
        Service service = new Service();
        //ACT
        int poignees = service.nombrePoigneesDeMainPour(2);
        //ASSERT
        assertEquals(6,poignees);
    }

}
