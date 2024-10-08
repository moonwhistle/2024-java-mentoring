# 자동차 미션 안내

---

# 🚀 1단계 - 움직이는 자동차

## 기능 요구사항
- 자동차는 **이름**을 가지고 있다.
- 자동차는 **움직일 수** 있다.
- 0에서 9 사이의 **random** 값을 구한 후, random 값이 4 이상일 경우 **전진**하고, 3 이하일 경우 **멈춘다**.

## 새로운 프로그래밍 요구사항
- 자동차가 움직이는 기능이 의도대로 동작하는지 **테스트**한다.
- **자바 코드 컨벤션**을 준수하며 프로그래밍한다.
- 기본적으로 **Java Style Guide**를 원칙으로 한다.
- **Indent(인덴트, 들여쓰기) depth**를 2를 넘지 않도록 구현하며, **1까지만** 허용한다.
    - 예시: `while`문 안에 `if`문이 있으면 들여쓰기는 2이다.
    - 힌트: 인덴트 depth를 줄이기 위해 **함수(또는 메서드)**를 분리한다.
- **3항 연산자**를 사용하지 않는다.
- **else** 예약어를 사용하지 않는다.
    - **switch/case**도 허용하지 않는다.
    - 힌트: **if문**에서 값을 반환하는 방식으로 구현하면 **else** 예약어를 사용하지 않아도 된다.
- 함수(또는 메서드)의 **길이**가 15라인을 넘지 않도록 구현한다.
- 함수(또는 메서드)가 **한 가지 일**만 잘 하도록 구현한다.

## 기존 프로그래밍 요구사항
- **메인 메서드**는 만들지 않는다.

---

# 🚀 2단계 - 우승 자동차 구하기

## 기능 요구사항
- **n대의 자동차**가 경주에 참여할 수 있다.
- 주어진 횟수 동안 n대의 자동차는 **전진**하거나 **멈출** 수 있다.
- 0에서 9 사이의 **random** 값을 구한 후, random 값이 **4 이상**일 경우 **전진**하고, **3 이하**일 경우 **멈춘다**.
- 자동차 경주 게임이 끝나면 **누가 우승했는지**를 구할 수 있다.
- **우승자**는 한 명 이상일 수 있다.

## 새로운 프로그래밍 요구사항
- **우승자를 구하는 기능**이 의도대로 동작하는지 테스트한다.

## 기존 프로그래밍 요구사항
- **메인 메서드**는 만들지 않는다.
- **자바 코드 컨벤션**을 준수하며 프로그래밍한다.
- 기본적으로 **Java Style Guide**를 원칙으로 한다.
- **Indent(인덴트, 들여쓰기) depth**를 2를 넘지 않도록 구현하며, **1까지만** 허용한다.
    - 예시: `while`문 안에 `if`문이 있으면 들여쓰기는 2이다.
    - 힌트: 인덴트 depth를 줄이기 위해 **함수(또는 메서드)**를 분리한다.
- **3항 연산자**를 사용하지 않는다.
- **else** 예약어를 사용하지 않는다.
    - **switch/case**도 허용하지 않는다.
    - 힌트: **if문**에서 값을 반환하는 방식으로 구현하면 **else** 예약어를 사용하지 않아도 된다.
- 함수(또는 메서드)의 **길이**가 15라인을 넘지 않도록 구현한다.
- 함수(또는 메서드)가 **한 가지 일**만 잘 하도록 구현한다.

---

# 🚀 3단계 - 게임 실행

## 기능 요구사항
- 주어진 횟수 동안 **n대의 자동차**는 전진하거나 멈출 수 있다.
- 각 자동차에 **이름**을 부여할 수 있으며, 전진하는 자동차를 출력할 때 **자동차 이름**을 함께 출력한다.
- 자동차 이름은 **쉼표(,)**를 기준으로 구분하며, 이름은 **5자 이하**만 가능하다.
- 사용자는 **이동할 횟수**를 입력할 수 있어야 한다.
- 전진하는 조건은 **0에서 9 사이의 random 값**을 구한 후, random 값이 **4 이상**일 경우 **전진**하고, **3 이하**일 경우 **멈춘다**.
- 자동차 경주 게임이 끝난 후, **누가 우승했는지**를 알려준다. 우승자는 한 명 이상일 수 있다.

## 실행 결과 
* 다음은 위 요구사항에 따라 3대의 자동차가 5번 움직였을 때의 결과 예시이다.


~~~
경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).
neo,brie,brown
시도할 회수는 몇회인가요?
5

실행 결과
neo : -
brie : -
brown : -

neo : --
brie : -
brown : --

neo : ---
brie : --
brown : ---

neo : ----
brie : ---
brown : ----

neo : -----
brie : ----
brown : -----

neo : -----
brie : ----
brown : -----

neo, brown가 최종 우승했습니다.
~~~

## 새로운 프로그래밍 요구사항
- **메인 메서드**를 추가하여 실행 가능한 애플리케이션으로 만든다.

## 기존 프로그래밍 요구사항
- **자바 코드 컨벤션**을 준수하며 프로그래밍한다.
- 기본적으로 **Java Style Guide**를 원칙으로 한다.
- **Indent(인덴트, 들여쓰기) depth**를 2를 넘지 않도록 구현하며, **1까지만** 허용한다.
    - 예시: `while`문 안에 `if`문이 있으면 들여쓰기는 2이다.
    - 힌트: 인덴트 depth를 줄이기 위해 **함수(또는 메서드)**를 분리한다.
- **3항 연산자**를 사용하지 않는다.
- **else** 예약어를 사용하지 않는다.
    - **switch/case**도 허용하지 않는다.
    - 힌트: **if문**에서 값을 반환하는 방식으로 구현하면 **else** 예약어를 사용하지 않아도 된다.
- 함수(또는 메서드)의 **길이**가 15라인을 넘지 않도록 구현한다.
- 함수(또는 메서드)가 **한 가지 일**만 잘 하도록 구현한다.

---

