# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 기능 요구사항
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
  - 로또 구입 금액을 입력받을 수 있다.
    - [x] 구입 금액은 1_000 가~ 100_000 의 범위를 갖는다.
    - [x] 범위를 벗어나는 입력이 들어오면 예외를 던진다.
    - [x] 숫자가 아닌 입력이 들어오면 예외를 던진다.
  - [x] 로또를 발급하는 것은 랜덤 숫자 6개를 생성하는 것이다.
    - [x] 랜덤 숫자의 번호는 1 ~ 45 이다.
    - [x] 랜덤 숫자는 중복되지 않는다.
    - [x] 랜덤 숫자 6개를 생성한 이후 오름차순 정렬한다.
  - [x] 거스름돈이 생길 수 있다.

- [x] 로또 1장의 가격은 1000원이다.
  - [x] 구매 장수에 따라 구입 금액이 달라질 수 있다.

- 지난주 당첨 번호를 입력받을 수 있다.
  - 중복된 번호가 들어오면 예외를 던진다.
  - 범위를 벗어나는 입력이 들어오면 예외를 던진다.
  - 구분자를 제외한, 숫자가 아닌 입력이 들어오면 예외를 던진다.

- 보너스 번호를 입력받을 수 있다.
  - 지난주 당첨 번호와 중복된 번호가 들어오면 예외를 던진다.
  - 범위를 벗어나는 입력이 들어오면 예외를 던진다.
  - 숫자가 아닌 입력이 들어오면 예외를 던진다.

- 구매한 로또와 당첨 번호를 비교해 당첨 통계를 출력한다.
  - 구매한 로또와 당첨 번호를 비교한다.
  - 그 결과를 출력한다.
