package web.filter.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author �˷�
 * @date 2018/1/6 ����8:35
 */
@RestController
public class AsyncController {
    /**
     * logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncController.class);

    @GetMapping
    public String order() {
        LOGGER.info("���߳̿�ʼ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("���̷߳���");
        return "success";
    }

}
