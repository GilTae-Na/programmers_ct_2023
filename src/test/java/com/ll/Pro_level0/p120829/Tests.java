package com.ll.Pro_level0.p120829;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("70도 입력시 결과 는 1")
    void t1(){
        assertThat(new Solution().solution(70)).isEqualTo(1);
    }

    @Test
    @DisplayName("90도 입력시 결과 는 2")
    void t2(){
        assertThat(new Solution().solution(90)).isEqualTo(2);
    }

    @Test
    @DisplayName("92도 입력시 결과 는 3")
    void t3(){
        assertThat(new Solution().solution(92)).isEqualTo(3);
    }

    @Test
    @DisplayName("180도 입력시 결과 는 4")
    void t4(){
        assertThat(new Solution().solution(180)).isEqualTo(4);
    }

    @Test
    @DisplayName("190도 입력시 결과 는 4")
    void t6(){
        assertThat(new Solution().solution(190)).isEqualTo(3);
    }

    @Test
    @DisplayName("50도 입력시 결과 는 1")
    void t5(){
        assertThat(new Solution().solution(50)).isEqualTo(1);
    }
}
