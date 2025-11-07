package com.example.tutorial.logger.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private static final Logger logger = LoggerFactory.getLogger(MyService.class);

    public void performTask() {
        logger.info("INFO: Task started");
        logger.debug("DEBUG: Debugging task steps");
        try {
            int result = 10 / 0; // Will cause an exception
        } catch (Exception e) {
            logger.error("ERROR: Exception occurred", e);
        }
        logger.warn("WARN: Task completed with warnings");
        logger.info("INFO: Task finished successfully");
    }
}
