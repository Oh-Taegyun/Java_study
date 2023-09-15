### 01. 상수
C언어에서는 (혹은 C++)에서는 상수는 `const` 였는데 자바에서는 `final`로 한다.

### 02. 변수 타입 추론 가능
자바와 C는 변수의 타입을 설정해줘야 한다. 그런데 이게 은근 힘들다. 기본적인 int나 double은 쉬운데 다음과 같은 예제를 보라

``` java
Map<String, String> map = new HashMap<String, String> ();
```
이렇게 클래스로(혹은 템플릿으로) 정의할 경우 저 긴것을 쓰는것도 일이다
이때 다음과 같이 쓰면 편하다

``` java
var map = new HashMap<String, String> ();
```

이렇게 var 키워드는 지역 변수의 타입을 자동으로 추론하는 것이 가능하다.

근데 추론이 불가능 할 정도로 정보가 부족하면 컴파일이 실패한다. 다음과 같은 예시이다.

``` java
var id = 0;
var sum; 
```
