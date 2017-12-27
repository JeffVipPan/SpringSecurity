package web.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author ÅË·å
 * @date 2017/12/27 ÏÂÎç10:51
 */
@Slf4j
@Component
public class TimeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("Time Filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        log.info("filter starting");

        long time = System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);
        log.info(String.valueOf(System.currentTimeMillis() -time));
        log.info("filter end");
    }

    @Override
    public void destroy() {
        log.info("Time Filter destroy");
    }
}
