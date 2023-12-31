package org.example;
/*
• 간단한 사칙연산을 할 수 있다.
• 양수로만 계산할 수 있다.
• 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.
• MVC패턴(Model-View-Controller) 기반으로 구현한다
*/

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	//1 + 2 ----> Calculator
	//  3   <----
	@DisplayName("덧셈 연산을 수행한다.")
	@Test
	void additionTest() {
		int result = Calculator.calculate(1, "+", 2);
		assertThat(result).isEqualTo(3);
	}
}
