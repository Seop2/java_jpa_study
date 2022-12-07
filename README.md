# java_jpa_study
순수 jpa 공부하기
---
## maven으로 jpa 설정
- 종속성 hibernate-core (entitymanager) 추가 & 연결할 DB추가
```xml
 <!-- JPA 하이버네이트 -->
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-entitymanager</artifactId>
            <version>5.6.14.Final</version>
        </dependency>
        <!-- H2 데이터베이스 -->
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <version>1.4.200</version>
        </dependency>
```
## jpa의 장점
-  컴파일이 아니라 런타임시 sql쿼리를 불러옴
- 따라서 Sql을 통한 오타 오류의 가능성이 적고 db가 날라갈 가능성이 적다
- 자바 코드를 기반으로 하기 때문에 객체지향적인 코드를 짤수있다.
  - 객체지향적이다는 것은 객체지향의 장점인 재사용성과 유지보수의 이점을 불러올수있다.
- insert
<img width="367" alt="스크린샷 2022-12-07 오후 3 04 03" src="https://user-images.githubusercontent.com/57839278/206102554-d1d57322-9f0b-4e52-86df-ba99d266833a.png">
- update
<img width="641" alt="스크린샷 2022-12-07 오후 3 51 10" src="https://user-images.githubusercontent.com/57839278/206109116-c99e2ff6-3036-4f92-ac99-19d486e03413.png">
