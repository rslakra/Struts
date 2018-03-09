<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
   <%@ taglib uri="/tags/struts-html" prefix="html" %>
  
   <html:html locale="true">

   <head>

   <title><bean:message key="welcome.title"/></title>

   <html:base/>

   </head>

   <body bgcolor="white">

   <html:form action="/searchTutorial">

   <html:errors/>

   <table>

     <tr>
          <td align="right">
            Search Tutorial
          </td>
          <td align="left">
            <html:text property="keyword" size="30" maxlength="30"/>
          </td>
        </tr>  
		<tr>
          <td align="right">
            <html:submit>Search</html:submit>
          </td>
		  </tr>
		  </table>
   </html:form>
   </body>
   </html:html>