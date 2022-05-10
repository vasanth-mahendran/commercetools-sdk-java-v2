
package io.vrap.rmf.base.client.http;

import java.util.function.Supplier;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.slf4j.SLF4JLogger;

/**
 * Unified logger instance to perform logging only for configured logging levels.
 * Creates a hierarchy of loggers for requests and responses
 */
public class InternalLogger {
    private final Logger underlyingLogger;

    public static final String TOPIC_REQUEST = "request";
    public static final String TOPIC_RESPONSE = "response";

    protected InternalLogger(final org.slf4j.Logger underlyingLogger) {
        this.underlyingLogger = new SLF4JLogger(underlyingLogger.getName(), underlyingLogger);
    }

    protected InternalLogger(final Logger underlyingLogger) {
        this.underlyingLogger = underlyingLogger;
    }

    public static InternalLogger getLogger(final Class<?> clazz) {
        return new InternalLogger(LogManager.getLogger(clazz));
    }

    public static InternalLogger getLogger(final String loggerName) {
        return new InternalLogger(LogManager.getLogger(loggerName));
    }

    public boolean isTraceEnabled() {
        return underlyingLogger.isTraceEnabled();
    }

    public InternalLogger debug(final Supplier<?> message) {
        underlyingLogger.debug(message::get);
        return this;
    }

    public InternalLogger debug(final Supplier<?> message, final Throwable throwable) {
        underlyingLogger.debug(message::get, throwable);
        return this;
    }

    public InternalLogger info(final Supplier<?> message) {
        underlyingLogger.info(message::get);
        return this;
    }

    public InternalLogger info(final Supplier<?> message, final Throwable throwable) {
        underlyingLogger.info(message::get, throwable);
        return this;
    }

    public InternalLogger trace(final Supplier<?> message) {
        underlyingLogger.trace(message::get);
        return this;
    }

    public InternalLogger trace(final Supplier<?> message, final Throwable throwable) {
        underlyingLogger.trace(message::get, throwable);
        return this;
    }

    public InternalLogger warn(final Supplier<?> message) {
        underlyingLogger.warn(message::get);
        return this;
    }

    public InternalLogger warn(final Supplier<?> message, final Throwable throwable) {
        underlyingLogger.warn(message::get, throwable);
        return this;
    }

    public InternalLogger error(final Supplier<?> message) {
        underlyingLogger.error(message);
        return this;
    }

    public InternalLogger error(final Supplier<?> message, final Throwable throwable) {
        underlyingLogger.error(message::get, throwable);
        return this;
    }

    public InternalLogger log(final Level level, final Supplier<?> message) {
        underlyingLogger.log(level, message::get);
        return this;
    }

    public InternalLogger log(final Level level, final Supplier<?> message, final Throwable throwable) {
        underlyingLogger.log(level, message::get, throwable);
        return this;
    }

    public InternalLogger log(final Level level, final Message message) {
        underlyingLogger.log(level, message);
        return this;
    }

    public InternalLogger log(final Level level, final Message message, final Throwable throwable) {
        underlyingLogger.log(level, message, throwable);
        return this;
    }

    public InternalLogger log(final org.slf4j.event.Level level, final Supplier<?> message) {
        switch (level) {
            case INFO:
                return info(message);
            case ERROR:
                return error(message);
            case WARN:
                return warn(message);
            case DEBUG:
                return debug(message);
            case TRACE:
                return trace(message);
        }
        return this;
    }

    public InternalLogger log(final org.slf4j.event.Level level, final Supplier<?> message, final Throwable throwable) {
        switch (level) {
            case INFO:
                return info(message, throwable);
            case ERROR:
                return error(message, throwable);
            case WARN:
                return warn(message, throwable);
            case DEBUG:
                return debug(message, throwable);
            case TRACE:
                return trace(message, throwable);
        }
        return this;
    }
}
