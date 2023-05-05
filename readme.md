<img src="https://capsule-render.vercel.app/api?type=waving&color=auto&height=200&section=header&text=프로젝트&nbsp;수정계획&fontSize=90" />

# FRONTEND 수정 계획

## TODO : JSP 에서 타임리프로 변경

## 1. 반응형으로 되어 있지 않은 페이지들

css 미디어 쿼리를 활용해 반응형으로 되어있지 않은 페이지 View들 반응형으로 수정

### todo: 다른 팀원분들이 만드신 페이지 반응형으로 새로 만들기

## 2. 일관성 없는 CSS

처음하는 작업이고 서로 규칙을 많이 정하고 한 작업이 아니다보니 
각자 따로 HTML/CSS를 작업하다보니 서로 디테일적인 디자인이 일관성이 없고
지저분해보인다. 이부분도 아예 프론트를 새로 만들어야겠다.

### todo: 일관성있는 스타일을 위해 공용 폰트CSS라던지, 공용 마진 패딩CSS클래스를 모아두는 공용 CSS작업 

## 3. 웹 컴포넌트 화
자주 사용하는 레이아웃 CSS 구성을 모아서
유연하게 사용하기 위해 옵션값들을 주며 조절할수있도록 컴포넌트화 시킬 예정이다.

### todo: 자주 쓰이는 것들 컴포넌트화



# BACKEND 수정 계획

## 1. JSP에서 타임리프로 변경

기존 JSP는 서블릿으로 변환해 실행하는 과정을 거치기 때문에
JSP보다는 바로 HTML을 내보내는 타임리프가 더욱 성능적으로 우월하다고 판단해서
타임리프로 변경할 예정이다.


## 2. Spring JDBC에서 마이바티스로 변경

좀더 사용하기 쉽고 유연한 마이바티스로 변경 할 예정이다.
