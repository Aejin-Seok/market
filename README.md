#  🌽 농산물 직거래 플랫폼-과채마켓 설명

- 링크 : http://3.39.9.242/

- 테스트 계정 
1. 일반회원 test@naver.com / 1233
2. 상점회원 dotori@gmail.com / 1234  <br/>

&nbsp;이 프로젝트는 인터넷 농산물 직거래 플랫폼을 구축하여 소규모 농산물 직거래 활성화를 목표로 한다. 플랫폼 관리자는 별도로 존재하며 플랫폼에 입점한 농산물 판매자와 구매자간의 거래가 이루어지는 시스템이다. <br/> <br/> 
&nbsp;판매자는 관리자에게 플랫폼 내에서 농산물을 판매할 수 있는 상점 페이지에 대한 <b>입점 신청</b>을 할 수 있다. 관리자가 입점 신청을 승인하게 되면 판매자는 <b>자신이 직접 기른 농산물을 상점 페이지에 업로드</b>할 수 있고 구매자들은 해당 상점 페이지를 통해 <b>신선한 농산물을 직거래로 구매</b>할 수 있다.  <br/><br/> 
&nbsp;이 과정에서 구매자는 특정 상점을 팔로우할 수 있으며 <b>팔로우 할인</b>을 통해 일반 고객보다 <b>더 저렴한 가격으로 상품을 구매</b>할 수 있는 혜택을 받는다. 또한 직거래의 장점을 활용한 <b>공동구매 기능을 추가</b>하여 1인 가구 소비자나 해당 상품을 처음 구매하는 소비자들이 부담없이 저렴한 방법으로 농산물을 사먹을 수 있는 시스템을 설계했다. <br/>

---------------------------------------------------------------------------------------------------

# 기능 설명

**[ ⭐이모티콘이 있는 항목이 제가 담당하여 개발했던 부분입니다. ]**<br/><br/>

**메인 페이지(로그인 이전)**  
  * 회원가입 : 아이디, 패스워드, 이름, 전화번호, 이메일+ 소셜 회원가입
  * 로그인 : 판매자(ID-PW 찾기, 임시PW 이메일 발송), 일반회원(ID-PW 찾기, 임시PW 이메일 발송), 관리자(관리자 계정 로그인시 관리자 페이지 활성화)
  * 입점신청 : shopID, 비밀번호(단방향 암호화), 상점명, 상점소개, 주소, 연락처, 정산계좌 등 작성
  * 카테고리 목록 : 상품목록 링크
  * 인기상품 목록 : 상품상세 링크

**[ 로그인 이후 ]**  <br/>

**일반 회원**  
  * ⭐**장바구니 : 판매자별 상품목록, 팔로우 특가 적용, 상품수량 변경(재고 초과시 변경x), 상품 개별삭제/전체삭제, 판매자별 주문(체크박스에 체크된 상품만 주문가능),
                   30일 지난 장바구니 상품 자동 삭제(스프링 스케줄러)**              
  * ⭐**상품주문 : 바로구매, 공동구매, 배송지 선택/등록/수정/삭제, 총 결제 금액/배송비, 결제방법(카카오페이/카드결제)**
  * ⭐**상품결제 : 결제(카카오페이/다날), 재고감소(판매된 수량만큼), 장바구니 삭제(결제된 상품만), 결제완료 메일 발송**
  * 상점메인 : 관심상점등록(팔로잉)
  * 상품상세 : 문의글작성/리뷰작성
  * 마이페이지 : 회원정보(정보수정, PW변경, 회원탈퇴 및 사유),
                 주문목록(주문상태별조회, 주문상세, 주문취소, 배송추적, 구매확정<7일후 자동구매확정 job>,환불신청 등), 
                 내가 쓴 리뷰(작성한 리뷰 목록)/문의글 목록,
                 재입고신청목록/관신상품 목록/팔로우 상점 목록
   
    *주문상태 : 공동구매대기, 공동구매실패, 배송전, 주문취소, 품절취소, 출고완료, 배송완료, 환불요청중, 환불완료, 거래완료

**shop 매니저**  
  * 상점정보 : 상세보기, 수정(비밀번호 변경), 폐점신청(사유등록)
  * 상품관리 : 상품목록(페이징, 상품유형별조회, 등록일자별조회), 상품상태변경(판매중, 일시판매중지, 판매완료, 판매정지<관리자권한 정지, 변경불가>),상품관리(등록<유형별>,수정,삭제)
  * 판매관리 : 판매목록(판매상태별조회, 페이징)
  * 판매상태 : 주문확인요청(품절취소, 운송장번호등록), 배송&구매확정전(배송추적, 7일후 자동구매확정), 환불신청(환불승인, 메일발송, 결제취소)
  * 문의하기 : 문의글답변 
   
    *상품유형 : 일반상품, 공동구매  
    *상품상태 : 판매중, 일시판매중지, 판매완료, 판매정지  
    *판매상태 : 주문확인요청, 배송&구매확정전, 환불신청, 환불완료    
    
**관리자 페이지**
  * 회원관리 : 회원목록, 강퇴
  * 상점관리 : 입점승인, 강제폐점
  * 상품관리 : 상품판매정지
