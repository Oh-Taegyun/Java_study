### 묵시적 형변환
![](../c언어와의%20차이/image/image_12.png)

<br>
<br>

### 문자열

String 클래스로 제공된다. 

``` java
String s1 = "Hello";
String s2 = "World!";
```

 - 특징 1) + 연산자
   String 객체들을 + 연산자를 이용하여 서로 더하면 문자열이 합쳐진다.
<br>

 - 특징 2) 변수의 값과 문자열
   ``` java
   int age = 20;
   System.out.println("내년이면"+age+"살");
   ```
   +를 이용해서 변수의 값과 문자열을 합칠 수 있다. 이때는 변수의 값이 문자열로 자동 변환된다.
   
<br>

 - 특징 3)
   파이썬처럼 print(내년이면,age)같은 ,로 연산하는것은 불가능하다

<br>
<br>

### 콘솔에서 입력받기
본래 콘솔에서 읽는 것은 `System.in`인데 이것은 키보드에서 바이트를 읽어서 다시 그 바이트를 정수나 실수, 문자열로 바꿔야 하는 불편함이 있다.

따라서 Scanner 객체를 이용하도록 한다. 

``` java
import java.util.Scanner;
// 혹은 import java.util.*;
Scanner sc = new Scanner(System.in);
```

Scanner 클래스는 키보드로부터 바이트 값을 받아서 분리자를 이용해서 각 바이트들을 토큰(token)으로 분리한다. 특별한 지정이 없으면 불리자는 공백문자 ('','/n','/t')이다. 

예를 들어 사용자가 "kim 20 84.0"과 같이 입력하면 공백으로 끊어서 "kim"과 "20" "84.0"으로 분리시킨다. 

![](./../c언어와의%20차이/image/image_11.jpg)

메소드
```
sc.nextByte()		// byte 형 입력 및 리턴
sc.nextShort()		// short 형 입력 및 리턴
sc.nextInt()		// int 형 입력 및 리턴
sc.nextLong()		// long 형 입력 및 리턴
 
sc.nextFloat()		// float 형 입력 및 리턴
sc.nextDouble()		// double 형 입력 및 리턴
 
sc.nextBoolean()	// boolean 형 입력 및 리턴
 
sc.next()			// String 형 입력 및 리턴	(공백을 기준으로 한 단어를 읽음)
sc.nextLine()		// String 형 입력 및 리턴 (개행을 기준으로 한 줄을 읽음)
```



