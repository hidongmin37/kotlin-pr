## 코틀린에서 Type을 다루는 방법

### 1. 기본 타입

코틀린에서는 선언된 기본값을 보고 타입을 추론한다.

```kotlin
val number1 = 3 //int
val number2 = 3L //Long
```

자바에서는 타입간의 변환은 암시적으로 이루어질 수 있다.

```java
int number1 =4;
long number2 =number1;
```

<br>
하지만, 코틀린에서는 기본 타입간의 변환은 명시적으로 이루어져야 한다.

```kotlin
val number1: Int = 4
// val number2: Long = number1 컴파일 에러
val number2: Long = number1.toLong()
```

결론적으로는 코틀린에서는 명시적으로 to변환타입()을 사용해야합니다.

변수가 nullable이라면 적절한 처리가 필요합니다.

### 2. 타입 캐스팅

스마트 캐스트를 통해서 명시적으로 캐스팅을 하지 않아도 됨.
```kotlin
fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        println(obj.age) 
    }
}
```

```kotlin
value is Person  // => value가 Person이면 true, value가 Person이 아니라면 false

value !is Person // => value가 Person이면 false, value가 Person이면 true

value as? Person // => value가 Person이면 Person으로 타입 캐스팅, value가 null이면 null, value가 Person이 아니면 null
```

### 3. Kotlin의 3가지 특이한 타입

#### Any
- Java의 Object 역할(모든 객체의 최상위 타입)
- 모든 Primitive Type의 최상의 타입도 Any이다.
- Any 자체로는 null을 포함할 수 없어 null을 포함하고 싶다면, Any?로 표현
- Any에 equals / hashCode / toString 존재

#### Unit
- Unit은 Java의 void와 동일한 역할 => 타입 추론이 가능하기 때문에 생략가능
- (살짝 어려운 내용) void와 다르게 Unit은 그 자체로 타입 인자로 사용 가능하다.
- 함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미. 즉, 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현

#### Nothing
- Nothing은 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
- 무조건 예외를 반환한느 함수 / 무한 루프 함수 등 

```kotlin
fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}
```

### 4. String Interpolation, String indexing

변수 이름만 사용하더라도 ${변수}를 사용하는 것이 
1) 가독성
2) 일괄 변환
3) 정규식 활용

```kotlin
val s = """
이 이름은 ${name}

        너의 이름은 ${person.name}
    """
    println(s)

val s2 = """
이 이름은 ${name}

        너의 이름은 ${person.name}
    """.trimIndent()
println(s2)
// indent 모두 제거된 것.

```


