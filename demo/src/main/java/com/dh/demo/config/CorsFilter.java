package com.dh.demo.config;



import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jhonny .
 */
//http
@Component
public class CorsFilter implements Filter{

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException, IOException {

        HttpServletResponse response = (HttpServletResponse) res;

        HttpServletRequest request = (HttpServletRequest) req;
       // System.out.println("cors filter "+request.getHeader("origin"));
        String allowOrigin = "*"; //String allowOrigin = "*";
        //request.getHeader("origin") = "http:localhost:9090"
        if (request.getHeader("origin") != null) {
            allowOrigin = request.getHeader("origin");
            System.out.println("+++++++++++++++++++++++++vvvvvvvvvvvvvvvvv");
            System.out.println("localhost "+request.getHeader("origin"));
        }
        // don't support wild card
        response.setHeader("Access-Control-Allow-Origin", allowOrigin);
        response.setHeader("Access-Control-Allow-Methods", "POST,PATH, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, x-requested-with, X-Custom-Header");
        chain.doFilter(req, res);
    }

    public void init(FilterConfig filterConfig) {
    }

    public void destroy() {
    }


}
