# mini-mybox

## 1. 사용 라이브러리
- Spring webFlux
- Spring Data mongodb
- Spring security
- Spring validation
- Spring Rest Docs
- TestContainer

## 2. 패키지 구조

## 3. 요구사항 분석
- 테스트를 위해서 사용자별 사용공간 100MB로 제한
- 사용자 회원가입 시에 회원별 사용공간 및 root directory 생성 
- 파일 I/O는 모두 Spring server를 통하도록 구성
- 파일 업로드에 대한 응답을 비동기적으로 처리할 수 있도록 구현하기
- 디렉토리를 삭제하면, 안에 있는 모든 파일 및 디렉토리를 삭제한다.

## 4. API 설계

|       기능       | HTTP METHOD | URI                           |
|:--------------:|:-----------:|:------------------------------|
|     파일 업로드     |    POST     | `/api/objects/files`          |
| 오브젝트 수정(이름,경로) |    PATCH    | `/api/objects/{objectId}`     |
|    오브젝트 삭제     |   DELETE    | `/api/objects/{objectId}`     |
|    오브젝트 조회     |     GET     | `/api/objects/{objectId}`     |
|    디렉토리 생성     |    POST     | `/api/objects/directories`    |


## 5. 구현 사항

## 6. TEST
