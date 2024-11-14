## 코틀린에서 object 키워드를 다루는 방법

### 1. static 함수와 변수
- static: 클래스가 인스턴화 될 때 새로운 값이 정적으로 인스턴스끼리의 값을 공유
- companion object: 클래스와 동행하는 유일한 object
- val만 붙이면 런타임에 할당되고, const를 붙이면 컴파일시에 할당됨.
- const: 정말 진짜 상수에 붙이기 위한 용도, 기본 타입과 String에 붙일 수 있음.
- companion object, 즉 동반 객체도 하나의 객체로 간주된다. 때문에 이름을 붙일 수 있고, interface를 구현할 수도 있다.
- companion object에 유틸성 함수들을 넣어도 되지만, 최상단 파일을 활용하는 것을 추천
- Java에서 Kotlin companion object를 사용하려면 @JvmStatic어노테이션 붙여서 static처럼 바로 사용 가능함.

### 2. 싱글톤
- 동시성 처리를 조금 더 해주거나 enum class를 활용하는 방법도 있음.
- 코틀린에서는 singleton 생성방법은 object를 붙이면 끝

### 3. 익명 클래스
- Java에서는 new 타입이름()
- Kotlin에서는 object: 타입이름