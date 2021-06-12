
  package com.multi.shampoorang.interceptor;
  
  import javax.servlet.http.HttpServletRequest; import
  javax.servlet.http.HttpServletResponse; import
  javax.servlet.http.HttpSession;
  
  import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
  org.springframework.web.servlet.ModelAndView; import
  org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
  
  
  public class AuthInterceptor extends HandlerInterceptorAdapter {
  
  
  private static final Logger logger =
  LoggerFactory.getLogger(AuthInterceptor.class);
  
  @Override public boolean preHandle(HttpServletRequest request,
  HttpServletResponse response, Object handler) throws Exception { HttpSession
  httpSession = request.getSession();
  
  if(httpSession.getAttribute("login")==null) {
  logger.info("current user is not logged");
  response.sendRedirect("/board/login"); return false; } return true; }
  
  @Override public void postHandle(HttpServletRequest request,
  HttpServletResponse response, Object handler, ModelAndView modelAndView)
  throws Exception { // TODO Auto-generated method stub
  super.postHandle(request, response, handler, modelAndView); }
  
  
  }
 