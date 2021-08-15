# 나만의 맛집 List

## 개요
1. 요구 사항 분석
2. 프로젝트 설계
3. Memory CRUD DB 개발
4. REST API 개발
5. Front 개발

## 목적
회사 근처 점심 메뉴를 결정하기 매우 힘들었다. 그래서 하나의 맛집찾기 프로젝트의 시작점이 아닐까 했다.
또한 Memory DB를 직접 만들어 사용함으로 개발을 진행할 수 있을지 고민을 하여 개발을 시작하게 되었다.

## Project Spec
* Language: Java 11
* FrameWork: Spring Boot, Lombok, Validation
* View : HTML5, JQuery, BootStrap, Thymleaf, Vue.js
* build: Gradle
* api: Naver 지역 검색 API
* Test: JUnit5, Swagger

> 실제로 DB를 사용하지 않고 직접 Memory DB를 개발하여서 진행하였다.
> 실제 DB모델링은 JpaRepository를 바탕으로 제작을 하였다.
> 자세한 코드는 [깃허브](https://github.com/SungbinYang/RestaurantList)를 참고하면 좋을것 같다.
> 코드를 공개를 안 하는것은 이 포스트를 보는 독자도 한번 스스로 해보았으면 좋겠다는 생각에서다.
> 기본적인 기능은 검색, 위시리스트 추가, 삭제 방문횟수 추가라는 기능이 있다.

## 후기

* 처음으로 프로젝트를 만들면서 DB없이 하는것이 낫설었다. 프로젝트를 진행하면서 Spring Boot 프로젝트를 진행하면서 어떤 순서로 진행을 해야하는지 또한 테스트 캐이스가 얼마나 중요한지 알 수 있었다.
* 내가 많이 부족한 부분으로 aop부분이 매우 취약했던 것 같았다. 이부분을 다른 서적을 참고하여 공부해야 할 필요가 느껴졌다.

## 결과물
* 처음 동작 화면
![](https://images.velog.io/images/ysb05222/post/8b2e86a2-bc66-410e-8b19-d3a821cbbbfa/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-08-15%20%E1%84%8B%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%AB%2010.22.53.png)

* 검색화면
![](https://images.velog.io/images/ysb05222/post/ff4f1429-4057-4565-9c02-62dfaad35883/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-08-15%20%E1%84%8B%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%AB%2010.23.53.png)

* 위시리스트 추가 화면
![](https://images.velog.io/images/ysb05222/post/d72ff4aa-277c-4cdc-bc6c-cd0d102a12b7/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-08-15%20%E1%84%8B%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%AB%2010.24.27.png)
