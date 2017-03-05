package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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

      out.write("  \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">  \r\n");
      out.write("  \r\n");
      out.write("<html>  \r\n");
      out.write("<head>  \r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">  \r\n");
      out.write("<title>欢迎</title>  \r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resource/css/themes/default/easyui.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resource/css/themes/icon.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resource/css/demo.css\" />\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resource/js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resource/js/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resource/js/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("</head>  \r\n");
      out.write("<body>  \r\n");
      out.write("\t\r\n");
      out.write("\t<h2>Basic Form</h2>\r\n");
      out.write("\t<p>Fill the form and submit it.</p>\r\n");
      out.write("\t<div style=\"margin:20px 0;\" align=\"middle\">\r\n");
      out.write("\t\t<div class=\"easyui-panel\" title=\"New Topic\" style=\"width:800px\">\r\n");
      out.write("\t\t\t<div style=\"padding:10px 60px 20px 60px\">\r\n");
      out.write("\t\t\t    <form id=\"ff\" method=\"post\">\r\n");
      out.write("\t\t\t    \t<table cellpadding=\"5\">\r\n");
      out.write("\t\t\t    \t\t<tr>\r\n");
      out.write("\t\t\t    \t\t\t<td>Name:</td>\r\n");
      out.write("\t\t\t    \t\t\t<td><input class=\"easyui-textbox\" type=\"text\" name=\"name\" data-options=\"required:true\"></input></td>\r\n");
      out.write("\t\t\t    \t\t</tr>\r\n");
      out.write("\t\t\t    \t\t<tr>\r\n");
      out.write("\t\t\t    \t\t\t<td>Email:</td>\r\n");
      out.write("\t\t\t    \t\t\t<td><input class=\"easyui-textbox\" type=\"text\" name=\"email\" data-options=\"required:true,validType:'email'\"></input></td>\r\n");
      out.write("\t\t\t    \t\t</tr>\r\n");
      out.write("\t\t\t    \t\t<tr>\r\n");
      out.write("\t\t\t    \t\t\t<td>Subject:</td>\r\n");
      out.write("\t\t\t    \t\t\t<td><input class=\"easyui-textbox\" type=\"text\" name=\"subject\" data-options=\"required:true\"></input></td>\r\n");
      out.write("\t\t\t    \t\t</tr>\r\n");
      out.write("\t\t\t    \t\t<tr>\r\n");
      out.write("\t\t\t    \t\t\t<td>Message:</td>\r\n");
      out.write("\t\t\t    \t\t\t<td><input class=\"easyui-textbox\" name=\"message\" data-options=\"multiline:true\" style=\"height:60px\"></input></td>\r\n");
      out.write("\t\t\t    \t\t</tr>\r\n");
      out.write("\t\t\t    \t\t<tr>\r\n");
      out.write("\t\t\t    \t\t\t<td>Language:</td>\r\n");
      out.write("\t\t\t    \t\t\t<td>\r\n");
      out.write("\t\t\t    \t\t\t\t<select class=\"easyui-combobox\" name=\"language\"><option value=\"ar\">Arabic</option><option value=\"bg\">Bulgarian</option><option value=\"ca\">Catalan</option><option value=\"zh-cht\">Chinese Traditional</option><option value=\"cs\">Czech</option><option value=\"da\">Danish</option><option value=\"nl\">Dutch</option><option value=\"en\" selected=\"selected\">English</option><option value=\"et\">Estonian</option><option value=\"fi\">Finnish</option><option value=\"fr\">French</option><option value=\"de\">German</option><option value=\"el\">Greek</option><option value=\"ht\">Haitian Creole</option><option value=\"he\">Hebrew</option><option value=\"hi\">Hindi</option><option value=\"mww\">Hmong Daw</option><option value=\"hu\">Hungarian</option><option value=\"id\">Indonesian</option><option value=\"it\">Italian</option><option value=\"ja\">Japanese</option><option value=\"ko\">Korean</option><option value=\"lv\">Latvian</option><option value=\"lt\">Lithuanian</option><option value=\"no\">Norwegian</option><option value=\"fa\">Persian</option><option value=\"pl\">Polish</option><option value=\"pt\">Portuguese</option><option value=\"ro\">Romanian</option><option value=\"ru\">Russian</option><option value=\"sk\">Slovak</option><option value=\"sl\">Slovenian</option><option value=\"es\">Spanish</option><option value=\"sv\">Swedish</option><option value=\"th\">Thai</option><option value=\"tr\">Turkish</option><option value=\"uk\">Ukrainian</option><option value=\"vi\">Vietnamese</option></select>\r\n");
      out.write("\t\t\t    \t\t\t</td>\r\n");
      out.write("\t\t\t    \t\t</tr>\r\n");
      out.write("\t\t\t    \t</table>\r\n");
      out.write("\t\t\t    </form>\r\n");
      out.write("\t\t\t    <div style=\"text-align:center;padding:5px\">\r\n");
      out.write("\t\t\t    \t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"submitForm()\">Submit</a>\r\n");
      out.write("\t\t\t    \t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"clearForm()\">Clear</a>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction submitForm(){\r\n");
      out.write("\t\t\t$('#ff').form('submit');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction clearForm(){\r\n");
      out.write("\t\t\t$('#ff').form('clear');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>  \r\n");
      out.write("</html>  ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
