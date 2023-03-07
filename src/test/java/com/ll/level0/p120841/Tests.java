package com.ll.level0.p120841;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("1이 나와야 함")
    void t1(){
        int[] dot = new int[]{1,2};
        assertThat(new Solution().solution(dot)).isEqualTo(1);
    }
}
