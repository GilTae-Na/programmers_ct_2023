package com.ll.Pro_level0.p120837;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Tests {
    @Test
    @DisplayName("\"3 + 3 = 6")
    public void getSplitInfo() {
        assertEquals(6, new Polynomial("3 + 3").calc());
    }

    @Test
    public void getSplitInfo_3() {
        assertEquals(15, new Polynomial("13 + 2").calc());
    }


//    @Test
//    public void getSplitInfo_3() {
//        assertEquals(12, new Polynomial("3 * 3 + 3").calc());
//    }
//
//    @Test
//    public void getSplitInfo_4() {
//        assertEquals(18, new Polynomial("(3 + 3) * 3").calc());
//    }
}
