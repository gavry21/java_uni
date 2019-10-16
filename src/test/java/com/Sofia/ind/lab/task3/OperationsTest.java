package com.Sofia.ind.lab.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationsTest {
    @Test
    public void TwoPlusTwoTest(){
        Assertions.assertEquals(4, Operations.f(2,2));

    }
    @Test
    public void Multip(){
        Assertions.assertEquals(4,Operations.m(2,2));
    }
}


