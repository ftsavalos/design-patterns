package design.disambiguation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface MyService {

    Logger LOGGER = LoggerFactory.getLogger(MyService.class);

    default void getServiceType() {
        LOGGER.info("MyServiceType is - {}", this.getClass());
    }

}
