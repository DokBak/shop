# Development_environment  
OS : MacOS(M1) Ventura 13.4    
DB : MYSQL 5.6.21(192.168.29.200)  
MYSQL 8.0.33(LocalHost)  
ORM : JPA(Java Persistence API)  
  
## Spring_initializr : https://start.spring.io/  
> Baisc Option  
  
Project : Maven  
Language : Java  
Spring Boot : 2.7.14  
Group : com.example  
Artifact : shop  
Name : shop  
Description : Shop Project for Spring Boot  
Package name : com.shop  
Packaging : Jar  
Java : 11  
  
> TIP  
  
Spring Boot : 2.x.x -> Java 11  
Spring Boot : 3.x.x -> Java 17  
  
> Dependencies  
  
- Spring Boot : 2.5.2  
- Spring Web : Spring MVC를 사용하여 RESTful을 포함한 웹 애플리케이션을 빌드. Apache Tomcat을 기본 내장 컨테이너로 사용  
  - <dependency><groupId>org.springframework.boot</groupId><artifactId>spring-boot-starter-web</artifactId></dependency>  
- Lombok : 상용구 코드를 줄이는데 도움이 되는 Java 주석 라이브러리  
  - <dependency><groupId>org.projectlombok</groupId><artifactId>lombok</artifactId><optional>true</optional></dependency>  
- Thymeleaf : 웹 및 독립 실행형 환경 모두를 위한 최신 서버 측 Java 템플릿 엔진. HTML이 브라우저에서 정적 프로토타입으로 올바르게 표시되도록 함  
  - <dependency><groupId>org.springframework.boot</groupId><artifactId>spring-boot-starter-thymeleaf</artifactId></dependency>  
- Spring Data JPA : Spring Data 및 Hibernate를 사용하는 Java Persistence API로 SQL 저장소의 데이터를 유지  
  - <dependency><groupId>org.springframework.boot</groupId><artifactId>spring-boot-starter-data-jpa</artifactId></dependency>  
- MySQL Driver : MySQL JDBC 드라이버  
  - <dependency><groupId>mysql</groupId><artifactId>mysql-connector-java</artifactId><scope>runtime</scope></dependency>  
- H2 Database : 작은(2mb) 설치 공간으로 JDBC API 및 R2DBC엑세스를 지원하는 빠른 메모리 내 데이터베이스를 제공(임베디드 및 서버 모드, 브라우저 기반 콘솔 애플리케이션을 지원하고 테스트용 데이터베이스로도 사용)  
  - <dependency><groupId>com.h2database</groupId><artifactId>h2</artifactId><scope>runtime</scope></dependency>  
- querydsl : JQPL을 사용할수 있도록 하는 의존성  
  - <dependency><groupId>com.querydsl</groupId><artifactId>querydsl-jpa</artifactId><version>4.3.1</version></dependency>  
  - <dependency><groupId>com.querydsl</groupId><artifactId>querydsl-apt</artifactId><version>4.3.1</version></dependency>  
- Spring Boot Devtools : 어플리케이션 개발시 유용한 기능을 제공하는 모듈  
  - <dependency><groupId>org.springframework.boot</groupId><artifactId>spring-boot-devtools</artifactId></dependency>  
- Thymeleaf Layout Dialect dependency : 하나의 레이아웃을 여러 페이지에 똑같이 적용가능한 의존성
  - <dependency><groupId>nz.net.ultraq.thymeleaf</groupId><artifactId>thymeleaf-layout-dialect</artifactId><version>2.5.1</version></dependency>

## Settings/Plugins  
Lombok(반복적인 Getter/Setter ToString등의 자바코드를 컴파일시 자동생성)  
-> Settings -> Build, Execution, Deployment -> Compiler -> Annotation Processors -> Enable annotation processing [check on]  
Database Navigator(Database 접속테스트 및 관리)  
## Run/Edit Configurations  
Add New Configuration -> [ProjectName]Application -> Build and run (java 11) -> [ProjectName]Application  
## Junit(테스트 코드 작성)
InerfaceName -> 우클릭 -> Go To -> Test -> Create New Test -> TestPackage,TestClass 설정 -> ok
## Git Set  
(신규 레포지토리에 등록)  
VSC -> Create Git Repository -> Open -> Git -> GitHub -> Share Project on GitHub  
(기존 레포지토리에 등록)  
VSC -> Enable Version Control Integration -> Git(OK)  
Git -> Manage Remotes -> + -> 레포짓토리 주소 반영(https://github.com/DokBak/shop.git)  
## Git Unset
(원격 저장소 확인)
git remote -v
(원격 저장소 연결 해제)
git remote remove origin;
(원격 저장소 확인)
git remote -v
  
## Annotation  
@RestController ( @Controller + @ResponseBody )  
@Controller : 해당 클래스 요청을 처리하는 컨트롤러로 사용  
@ResponseBody : 자바 객체를 HTTP 응답 본문의 객체로 변환해 클라이언트에게 전송  
@GetMapping : 클라이언트의 요청을 처리할 URL을 매핑(서버의 루트로 오는 요청을 value="/"로 설정가능)  
  
> [Lombok Plugins Annotation]  
  
@Getter/Setter : [Lombok Plugins Annotation] 코드 컴파일할 때 속성들에 대한 Getter/Setter 메소드 생성  
@ToString : [Lombok Plugins Annotation] toString() 메소드 생성  
@ToString(exclude={"변수명"}) : [Lombok Plugins Annotation] 원하지 않는 속성을 제외한 toString() 메소드 생성  
@NonNull : [Lombok Plugins Annotation] 해당 변수가 null 체크, NullPointerException 예외 발생  
@EqualsAndHashCode : [Lombok Plugins Annotation] equals()와 hashCode() 메소드 생성  
@Builder : [Lombok Plugins Annotation] 빌더 패턴을 이용한 객체 생성  
@NoArgsConstructor : [Lombok Plugins Annotation] 파라미터가 없는 기본 생성자 생성  
@AllArgsConstructor : [Lombok Plugins Annotation] 모든 속성에 대한 생성자 생성  
@RequiredArgsConstructor : [Lombok Plugins Annotation] 초기화 되지 않은 Final, @NonNull 어노테이션이 붙은 필드에 대한 생성자 생성  
@Log : [Lombok Plugins Annotation] log 변수 자동 생성  
@Value : [Lombok Plugins Annotation] 불변 클래스 생성  
@Data : [Lombok Plugins Annotation] @ToString, @EqualsAndHashCode, @Getter, @Setter, @RequiredArgsConstructor를 합친 어노테이션  
  
> [Entity mapping Annotation]  
  
@Entity : [Entity mapping Annotation] 클래스를 엔티티로 선언  
@Table : [Entity mapping Annotation] 엔티티와 매핑할 테이블을 지정  
@Id : [Entity mapping Annotation] 테이블의 기본키에 사용할 속성을 지정  
@GeneratedValue : [Entity mapping Annotation] 키 값을 생성하는 전략 명시  
@Column : [Entity mapping Annotation] 필드와 컬럼 매핑  
@Lob : [Entity mapping Annotation] BLOB(바이너리 데이터를 DB외부에 저장하기 위한 타입. 이미지 사운드 비디오 등),CLOB(사이즈가 큰 데이터를 외부 파일로 저장하기 위한 데이터 타입. 문자형 대용량 파일을 저장하는데 사용) 타입 매핑  
@CreationTimestamp : [Entity mapping Annotation] insert 시 시간 자동 저장  
@UpdateTimestamp : [Entity mapping Annotation] update 시 시간 자동 저장  
@Enumerated : [Entity mapping Annotation] enum 타입 매핑  
@Transient : [Entity mapping Annotation] 해당 필드 데이터베이스 매핑 무시  
@Temporal : [Entity mapping Annotation] 날짜 타입 매핑  
@CreateDate : [Entity mapping Annotation] 엔티티가 생성되어 저장될 때 시간 자동 저장  
@LastModifiedDate : [Entity mapping Annotation] 조회한 엔티티의 값을 변경할 때 시간 자동 저장  
  
> [TestClass Annotation]  
  
@SpringBootTest : [TestClass Annotation] 통합 테스트를 위한 Spring Boot에서 제공하는 어플리케이션(모든 Bean을 IoC 컨테이너에 등록)  
@TestPropertySource : [TestClass Annotation] 기본 설정 application.properties파일 보다 높은 우선순위 파일을 설정  
locations="classpath:application-test.properties"  
@Autowired : [TestClass Annotation] IoC컨테이너에 등록할 Bean 주입  
@Test : [TestClass Annotation] 테스트할 메소드를 지정  
@DisplayName : [TestClass Annotation] 테스트 코드 실행시 노출될 테스트명 지정  

> [JPQL Annotation]
  
@Query : [JPQL Annotation] 객체지향 쿼리 언어사용  
@Param : [JPQL Annotation] JPQL(@Query)에 지정될 파라미터를 지정   
  
> [Controller Annotation]  
  
@RequestMapping : [Controller Annotation] 어떤 컨트롤러가 처리할지 매핑하는 어노테이션  
@GetMapping : [Controller Annotation] 컨트롤러 내에서 처리할 url 매핑하는 어노테이션  
  
## Annotation  
- application.name = shop : 어플리케이션 이름으로 @Value 어노테이션으로 읽을 수 있다.
- server.port = 80 : 서버의 포트 지정(미설정시 8080)  
- database
  - mysql 관련 설정
    - spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    - spring.datasource.url=jdbc:mysql://{url}:{port}/{db}?serverTimezone=UTC
      - spring.datasource.url=jdbc:mysql://192.168.29.200:3306/shop?serverTimezone=UTC
      - spring.datasource.url=jdbc:mysql://localhost:3306/shop?serverTimezone=UTC
    - spring.datasource.username=root
    - spring.datasource.password=cos1234
  - H2 database 관련 설정
    - spring.datasource.driver-class-name=org.h2.Driver : 테스트환경용 h2 데이터베이스 설정
    - spring.datasource.url=jdbc:h2:mem:test
    - spring.datasource.username=sa
    - spring.datasource.password=
    - spring.jpa.database-platform=org.hibernate.dialect.H2Dialect : 데이터베이스를 변경하더라도 Dialect를 설정하면 어플리케이션 구동에 문제 없도록 설정 
- spring.jpa.properties.hibernate.show_sql=true : 실행되는 쿼리 콘솔 출력
- spring.jpa.properties.hibernate.format_sql=true : 콘솔창에 출력되는 쿼리를 가독성이 좋게 포멧팅
- logging.level.org.hibernate.type.descriptor.sql=trace : 쿼리에 물음표로 출력되는 바인드 파라미터 출력  
- spring.jpa.hibernate.dll-auto=create
  - none : 미사용 (운영환경)
  - validate : 엔티티와 테이블 정상 매핑 확인 (운영환경)
  - create : 기존 테이블 삭제 후 테이블 생성 (개발환경)
  - create-drop : 기존 테이블 삭제 후 테이블 생성, 종료 시점에 테이블 삭제 (개발환경)
  - update : 변경된 스키마 적용 (개발환경)
- spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect : 데이터베이스를 변경하더라도 Dialect를 설정하면 어플리케이션 구동에 문제 없도록 설정  
- spring.devtools.livereload.enabled=true : 개발자가 직접 브라우저의 새로고침을 하지 않아도 변경된 리소스가 웹 브라우저에 반영  
  - 웹브라우저(크롬등)에서 확장 프로그램 추가 : LiveReload
- spring.thymeleaf.cache = false : 운영환경에서는 캐싱기능을 사용 하지만 개발환경에서는 사용하지 않는다.


## JPA ORM  
  
> 장단점  
  
|                                         장점                                          |                                 단점                                 |
|:-----------------------------------------------------------------------------------:|:------------------------------------------------------------------:|
| 특정 데이터베이스에 종속되지 않음 <br><br> 데이터 베이스의 변경에도 어려움이 적다 <br><br> (ex) oracle <-> mariaDB  | 성능 저하 위험 <br><br> 자동으로 생성되는 쿼리로 인하여 개발자의 의도와 맞지 않아 성능저하가 발생할 수 있다. |
|                                    객체 지향적 프로그래밍                                     |             관계형 데이터베이스에 대한 이해도 <br><br> 학습에 필요한 시간이 필요             |
| 생산성 향상 <br><br> 테이블 컬럼에 수정이 있는 경우 매핑된 클래스에 필드추가만으로 대응가능 <br><br> (직접적인 SQL 수정이 불필요) |                           복잡한 쿼리와의 성능 차이                           |
  
> 동작 방식
  
1. 엔티티 매니저 팩토리  
- 엔티티 매니저 인스턴스를 관리하는 주체  
- 애플리케이션 실행시 한 개만 만들어짐  
2. 엔티티 매니저  
- 영속성 컨텍스트에 접근하여 엔티티에 대한 데이터베이스 작업을 제공  
- find() : 영속성 컨텍스트에서 엔티티를 검색하고 영속성 컨텍스트에 없는 경우, 데이터베이스에서 데이터를 찾아 영속성 컨텍스트에 저장  
- persist() : 엔티티를 영속성 컨텍스트에 저장  
- remove() : 엔티티 클래스를 영속성 컨텍스트에서 삭제  
- flush() : 영속성 컨텍스트에 저장된 내용을 데이터베이스에 반영  
3. 영속성 컨텍스트  
- 엔티티를 영구저장하는 환경  
4. 엔티티  
- 데이터베이스의 테이블에 대응하는 클래스  
- @Entity가 붙은 클래스는 JPA에서 관리  
- 클래스자체, 생성한 인스턴스도 모두 엔티티라 부름  
  
## SQL  
  
- create database shop default character set utf8 collate utf8_general_ci;  
  
## JPQL(Java Persistence Query Language)  

- find + (엔티티 이름) + By + 변수이름 : ex) findByItemNm, findByItemNmOrItemDetail, findByPriceLessThan, findByPriceLessThanOrderByPriceDesc   
  - select 구문  

## Querydsl(JPQL을 코드로 작성할 수 있도록 도와주는 빌드 API)

- 고정 SQL문이 아닌 조건에 맞게 동적으로 쿼리 생성이 가능  
- 비슷한 쿼리를 재사용 가능. 제약 조건 조립 및 가독성 향상  
- 문자열이 아닌 자바 소스코드로 작성하기에 컴파일 시점에서 오류 확인 가능  
- IDE의 도움을 받아서 자동 완성 기능을 이용할 수 있기에 생산성 향상  
  
- <dependency><groupId>com.querydsl</groupId><artifactId>querydsl-jpa</artifactId><version>4.3.1</version></dependency>  
- <dependency><groupId>com.querydsl</groupId><artifactId>querydsl-apt</artifactId><version>4.3.1</version></dependency>  
- <plugin></plugin> 추가

- QDomain이 임포트 안 될 경우
  - File -> Project Structure -> Modules -> target/classes/generated-sources/ 클릭 -> Mark as: Sources

## Thymeleaf  

- 서버 사이드 템플릿 엔진으로 Thymeleaf, JSP, Freemarker, Groovy, Mustache 등이 있다.  
- @RequestMapping(value="/thymeleaf") : 어떤 컨트롤러가 처리할지 매핑하는 어노테이션, localhost 뒤에 붙는 url 경로  
- @GetMapping(value="/ex01") : 컨트롤러 내부에서 처리하는 매핑 어노테이션, 컨트롤러 뒤에 붙는 url 경로  
- Controller에서 org.springframework.ui.Model 객체에 addAttribute메소드로 key, value구조로 넣어 뷰에 출력  
- Controller에서 리턴 값은 resources/templates 밑에 위치한 파일을 지정 thymeleafEx/thymeleafEx01  
- text="${data} Model 객체에 넣은 값을 뷰에서 활용    

- xmlns:th="http://www.thymeleaf.org" -> thymeleaf 템플릿을 사용하기 위해 반드시 추가  
- xmlns:layout=http://www.ultraq.net.nz/thymeleaf/layout layout:decorate="~{layouts/layout1}" -> layouts폴더 밑의 layout1을 사용  
- layout:fragment="content" -> content 치환 
- th:text="${dataName}" -> 컨트롤러에서 전달받은 dataName값을 출력  
- th:each="dataName, status: ${dataList}" -> 컨트롤러에서 전달받은 dataList 리스트값에서 dataName객체를 하나씩 꺼내서 출력  
- th:if="${data}" -> 자바의 if 조건 처리와 비슷  
- th:unless="${data}" -> 자바의 else 조건 처리와 비슷  
- th:switch="${data}" -> switch 조건문  
- th:case= -> switch 조건문 값  
- th:href="@{url(param='')}" -> url은 /thymeleaf/ex01 또는 https://www.thymeleaf.org/ 등으로 지정  

## Bootstrap 
CDN(Contents Delivery Network) : 물리적으로 멀리 떨어져 있는 사용자에게 콘텐츠를 좀 더 빠르게 제공하는 서비스  
- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
- <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
- <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
- <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

## CSS
- html에서 태그의 css를 설정할때는 이름만 지정 : <p> -> p{ }
- id 속성값을 지정할때 #으로 설정 : <p id="pid"> -> #pid{ }
- class 속성값을 지정할때 .으로 설정 : <p class="pclass"> -> .pclass{ }