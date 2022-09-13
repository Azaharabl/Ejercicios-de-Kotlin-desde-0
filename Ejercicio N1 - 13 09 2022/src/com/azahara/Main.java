package com.azahara;

import java.time.LocalDateTime;
import java.util.logging.Logger;


public class Main {


    private static final Logger LOG = Logger.getLogger(" Log");

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            LOG.warning("entrando en bucle  " + i);
        }
        LOG.info("salimos del bucle");
    }
}
