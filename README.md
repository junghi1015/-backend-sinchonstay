## 법안 검색 클론 코딩 프로젝트
___


### https://catbell.org/bill/search 의 켓벨 서비스 일부분을 클론코딩 하였습니다.


## 기술스택
___

작업자 : 정효인
* springBoot
* mybatis
* mysql(mariaDB)
* java 1.15 version  
* 로컬에서 작업시 서버 localhost:8080




작업자 : 김은정
* react 

* 로컬에서 작업시 서버 localhost:3000

## 초기설정
___

> Intelli J 의 springBoot stater를 이용하여 템플릿 구성

catbellRawSearch (루트 디텍터리)  
|  
ㄴㅡㅡㅡfrontend (프론트엔드 (리액트 프로젝트))  
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;         |  
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   ㄴㅡㅡㅡ src (리액트 프로젝트 존재)   
|  
ㄴㅡ src   
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ㄴ   main  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ㄴ java...  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ㄴ conig  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ㄴ controller  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ㄴ dao  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ㄴ service    
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ㄴ vo  

config/DatabaseConfiguration  --> mybatis를 사용하기 위한 sqlSession 설정 및 마이바티스 설정 파일  
config/SwaggerConfig --> 프론트엔드와 협업을 위해서 restful데이터 체크  
config/WebConfig --> cors(교차 출처 리소스 공유) 리액트(브라우저)와 스프링 사이의 통신을 위한 설정  

controller --> mvc 구조중 c(controller) 역할을 하는 폴더  
service --> mvc 구조중 m(model)역할을 하는 폴  
dao --> mybatis에게 sql를 통한 데이터 요청을 하는 폴더 (이또한 모델 역)  
vo --> getter/setter 역할을 하는 폴더  
  
resources/application.properties --> db환경설정이 포함되어 있다.(설정 관리 파일)  
resources/mapper/**.xml --> mybatis 라이브러리를 사용하는 구간(SQL문법을 이요하여 DB와의 데이터 작업을 한다.)  