<%@page language="java" import="java.util.*"%>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>

<p><font size="4" color="#800000" face="Arial">Search Results</font></p>


<%
List searchresult = (List) request.getAttribute("searchresult");
%>
<%
for (Iterator itr=searchresult.iterator(); itr.hasNext(); )
{
  roseindia.net.dao.hibernate.Tutorial tutorial = (roseindia.net.dao.hibernate.Tutorial)itr.next();
%>

<p><a href="<%=tutorial.getPageurl()%>"><font face="Arial" size="3"><%=tutorial.getShortdesc()%></font></a><br>

<font face="Arial" size="2"><%=tutorial.getLongdesc()%></font></p>


<%

}
%>


<html:link page="/pages/SearchTutorial.jsp">Back to Search Page</html:link>

