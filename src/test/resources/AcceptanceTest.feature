Feature: RPN Caculator

  Scenario Outline: Acceptance Test
    Given user enter <Expression> in RPN Calc
    Then RPN should display <Result>

    Examples: 
      | Expression  | Result |
      | "1,2,3,+,-" | "-4"   |
      | "6,2,*,3,/" | "4"    |
