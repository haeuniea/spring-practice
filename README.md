# Spring Practice

Spring Boot의 기본 개념과 REST API 구현 방법을 학습하기 위한 실습 저장소입니다.

어라운드 허브 스튜디오의 Spring Boot 강의를 참고하여 HTTP 요청 처리, 계층 구조, JPA, Validation, 예외 처리 등을 실습했습니다.

## 개발 환경

- Java
- Spring Boot
- Gradle
- Spring Web
- Spring Data JPA
- MariaDB
- Lombok
- Swagger / OpenAPI

## 주요 학습 내용

- Spring MVC 기반 REST API 구현
- GET / POST / PUT / DELETE 요청 처리
- `@RequestParam`, `@PathVariable`, `@RequestBody`를 이용한 데이터 전달
- DTO를 이용한 요청 및 응답 처리
- Controller → Service → DataHandler → DAO → Repository 계층 구조
- Interface와 구현 클래스 분리
- Spring Data JPA를 이용한 데이터베이스 연동
- Entity와 Repository 구현
- Validation을 이용한 요청 데이터 검증
- 사용자 정의 Exception 및 전역 예외 처리
- Swagger / OpenAPI를 이용한 API 문서화
- Logback 설정

## 프로젝트 구조

```text
Client
  ↓
Controller
  ↓
Service
  ↓
DataHandler
  ↓
DAO
  ↓
Repository
  ↓
Database
```

## 실행 방법

```bash
gradle build
gradle bootRun
```

애플리케이션 실행 후 Swagger UI에서 API를 확인할 수 있습니다.

```text
http://localhost:8080/swagger-ui/index.html
```

## 참고

이 저장소는 어라운드 허브 스튜디오의 Spring Boot 강의를 참고하여 학습 목적으로 작성했습니다.