/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-03 16:56:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.helpdesk;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class returns_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<div class=\"helpdeskContentDiv returnsDiv\">\r\n");
      out.write("	<div class=\"deskTitle\">\r\n");
      out.write("		<h3>교환반품 및 환불 안내</h3>\r\n");
      out.write("		<ul>\r\n");
      out.write("			<li>\r\n");
      out.write("				<p class=\"smallDesc\">\r\n");
      out.write("					상품 수령일로부터 7일 이내에는 반품 및 환불이 가능합니다.<br>\r\n");
      out.write("					(단, 주말, 공휴일을 제외하고 수령일로부터 7일 이내에 에버프리에 상품이 회수되어야 가능)\r\n");
      out.write("				</p>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li>\r\n");
      out.write("				<p class=\"smallDesc\">\r\n");
      out.write("					아래의 사유는 환불이 불가능합니다.\r\n");
      out.write("					<ul class=\"ctul\">\r\n");
      out.write("						<li class=\"ctli\">\r\n");
      out.write("							<p class=\"smallDesc\">\r\n");
      out.write("								처음 출고된 상태와 달라진 경우 (세탁, 착용, 수선 등)\r\n");
      out.write("							</p>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"ctli\">\r\n");
      out.write("							<p class=\"smallDesc\">\r\n");
      out.write("								일부 구성품이 훼손 또는 제거 된 경우 (택, 단추, 패키지 아이템 등)\r\n");
      out.write("							</p>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"ctli\">\r\n");
      out.write("							<p class=\"smallDesc\">\r\n");
      out.write("								일부 품목 (속옷류 및 일부 액세서리 제품 등)\r\n");
      out.write("							</p>\r\n");
      out.write("						</li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</p>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li>\r\n");
      out.write("				<p class=\"smallDesc\">\r\n");
      out.write("					상품 수령일로부터 7일 이내에는 반품 및 환불이 가능합니다.<br>\r\n");
      out.write("					(단, 주말, 공휴일을 제외하고 수령일로부터 7일 이내에 에버프리에 상품이 회수되어야 가능)\r\n");
      out.write("				</p>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li>\r\n");
      out.write("				<p class=\"smallDesc\">\r\n");
      out.write("					상품이 불량인 경우 동일상품으로 교환(배송비 에버프리 부담) 또는 배송비를 포함한 전액 환불이 가능합니다.<br>\r\n");
      out.write("					단, 단순 변심 및 제품의 실밥, 주름 등 허용 범위 내의 제품 특성으로 인한 교환/환불의 경우 왕복 배송비를 차감한 금액이 환불됩니다.\r\n");
      out.write("				</p>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li>\r\n");
      out.write("				<p class=\"smallDesc\">\r\n");
      out.write("					불량 상품은 동일 상품으로만 교환 가능하며, 사이즈 및 컬러를 변경하는 경우 교환 사유가 고객 변심의 범주인 관계로 편도 배송비를(3,000원) 부담해주셔야 합니다.\r\n");
      out.write("				</p>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li>\r\n");
      out.write("				<p class=\"smallDesc\">\r\n");
      out.write("					이미 상품이 출고된 이후에는 상품을 다시 회수받은 뒤에 환불 처리가 가능합니다.\r\n");
      out.write("				</p>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li>\r\n");
      out.write("				<p class=\"smallDesc\">\r\n");
      out.write("					전체 환불, 부분 환불 시 최종 구매금액이 10만원 미만일 경우 지급된 사은품 또한 반납되어야 하며, 미반납 시 양말 1켤레당 2,000원이 차감됩니다.\r\n");
      out.write("				</p>\r\n");
      out.write("			</li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"hLine\"></div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"deskTitle\">\r\n");
      out.write("		<h3>교환반품 및 환불 안내</h3>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"descLine\">\r\n");
      out.write("		<div class=\"desc\">\r\n");
      out.write("			<div class=\"descLineNo\"><p class=\"boldDesc\">01</p></div>\r\n");
      out.write("			<div class=\"descLineContent\"><p class=\"boldDesc\">요청사항을 기재한 메모지와 함께 제품을 배송받은 박스에 재포장 해주세요.</p></div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"desc\">\r\n");
      out.write("			<div class=\"descLineNo\"><p class=\"boldDesc\">02</p></div>\r\n");
      out.write("			<div class=\"descLineContent\"><p class=\"boldDesc\">반품 택배를 보내주세요.</p></div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"desc\">\r\n");
      out.write("			<div style=\"padding-left:30px;\" class=\"descLineContent\">\r\n");
      out.write("				<p class=\"smallDesc\">\r\n");
      out.write("					CJ대한통운택배를 이용할 경우 6,000원을 동봉하고 착불로, 타 택배사를 이용할 경우 3,000원 동봉 후 선불로 아래 주소로 발송해 주세요.<br>\r\n");
      out.write("					광주광역시 남구 회서로22번길 16 5층 에버프리\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"desc\">\r\n");
      out.write("			<div class=\"descLineNo\"><p class=\"boldDesc\">03</p></div>\r\n");
      out.write("			<div class=\"descLineContent\"><p class=\"boldDesc\">제품이 도착하는대로 확인 후 신속한 교환반품 처리를 도와드리겠습니다.</p></div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"desc\">\r\n");
      out.write("			<ul>\r\n");
      out.write("				<li>\r\n");
      out.write("					<p class=\"smallDesc\">\r\n");
      out.write("						받으신 상품이 불량이거나, 오배송 된 경우 바로 OOTM 고객센터로 알려주시기 바랍니다.\r\n");
      out.write("					</p>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li>\r\n");
      out.write("					<p class=\"smallDesc\">\r\n");
      out.write("						맞교환은 불가능한 점 양해 바랍니다.\r\n");
      out.write("					</p>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li>\r\n");
      out.write("					<p class=\"smallDesc\">\r\n");
      out.write("						반품 준비가 완료되셨나요? <a style=\"font-weight:bold;\" href=\"https://www.cjlogistics.com/ko/tool/parcel/reservation-return\">CJ대한통운택배 반품 접수하기</a>\r\n");
      out.write("					</p>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
